package com.maxio.advancedbilling.controllers.events;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.CreditCardAttributes;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.Event;
import com.maxio.advancedbilling.models.EventKey;
import com.maxio.advancedbilling.models.EventResponse;
import com.maxio.advancedbilling.models.InvoiceIssued;
import com.maxio.advancedbilling.models.ItemPricePointChanged;
import com.maxio.advancedbilling.models.ListEventsInput;
import com.maxio.advancedbilling.models.MeteredUsage;
import com.maxio.advancedbilling.models.PaymentRelatedEvents;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionProductChange;
import com.maxio.advancedbilling.models.SubscriptionStateChange;
import com.maxio.advancedbilling.models.UpdateCustomer;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;
import com.maxio.advancedbilling.models.UpdateSubscription;
import com.maxio.advancedbilling.models.UpdateSubscriptionRequest;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.matchers.EventSpecificDataGetter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.models.EventKey.*;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class EventsControllerListEventsTest {

    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup();

    ProductFamily productFamily;
    Product product;
    Product product2;
    Component component;
    Customer customer;
    Subscription subscription;
    Customer updatedCustomer;
    String customerFullName;
    String updatedCustomerFullName;
    long lastEventId = 1;

    @BeforeAll
    void setup() throws IOException, ApiException, InterruptedException {
        Thread.sleep(3000);
        List<EventResponse> events = client.getEventsController().listEvents(new ListEventsInput.Builder()
                .perPage(1)
                .build()
        );

        if (!events.isEmpty()) {
            lastEventId = events.get(0).getEvent().getId();
        }

        productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, p -> p.priceInCents(1000));
        product2 = testSetup.createProduct(productFamily, p -> p.priceInCents(1500));
        component = testSetup.createMeteredComponent(productFamily, 5);

        // customer_create
        customer = testSetup.createCustomer();
        // signup_success payment_success invoice_issued
        subscription = testSetup.createSubscription(customer, product);
        // metered_usage
        client.getSubscriptionComponentsController().createUsage(
                subscription.getId(),
                CreateUsageComponentId.fromNumber(component.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(2.0)
                                .build()
                ));
        // billing_date_change, subscription_card_update, subscription_product_change
        client.getSubscriptionsController().updateSubscription(subscription.getId(), new UpdateSubscriptionRequest(
                new UpdateSubscription.Builder()
                        .productId(product2.getId())
                        .nextBillingAt(ZonedDateTime.now().plusDays(7))
                        .creditCardAttributes(
                                new CreditCardAttributes.Builder()
                                        .fullNumber("4111 1111 1111 1111")
                                        .expirationMonth("7")
                                        .expirationYear("2051")
                                        .build()
                        )
                        .build()
        ));
        // customer_update
        updatedCustomer = client.getCustomersController().updateCustomer(customer.getId(), new UpdateCustomerRequest(
                new UpdateCustomer.Builder()
                        .firstName("John" + randomNumeric(10))
                        .lastName("Doe" + randomNumeric(10))
                        .build()
        )).getCustomer();
        // subscription_state_change
        client.getSubscriptionStatusController().cancelSubscription(subscription.getId(), null);
        // subscription_deletion
        client.getSubscriptionsController().purgeSubscription(subscription.getId(), customer.getId(), List.of());
        // customer_delete
        client.getCustomersController().deleteCustomer(updatedCustomer.getId());

        customerFullName = customer.getFirstName() + " " + customer.getLastName();
        updatedCustomerFullName = updatedCustomer.getFirstName() + " " + updatedCustomer.getLastName();

        Thread.sleep(6000);
    }

    @Test
    void shouldListEvents() throws IOException, ApiException {
        // given - when
        List<EventResponse> events = client.getEventsController().listEvents(new ListEventsInput.Builder()
                .sinceId(lastEventId)
                .perPage(200)
                .direction(Direction.DESC)
                .build()
        );
        assertThat(events.size()).isBetween(13, 14);
        if (events.size() > 13) {
            events = events.subList(0, 13);
        }

        Map<EventKey, Event> eventsMap = events.stream()
                .collect(Collectors.toMap(e -> e.getEvent().getKey(), EventResponse::getEvent));

        // then
        for (EventResponse event : events) {
            assertCommonFields(event.getEvent());
        }

        assertThat(eventsMap.keySet()).containsExactlyInAnyOrder(
                CUSTOMER_CREATE, SIGNUP_SUCCESS, PAYMENT_SUCCESS, INVOICE_ISSUED, METERED_USAGE,
                BILLING_DATE_CHANGE, SUBSCRIPTION_CARD_UPDATE, SUBSCRIPTION_PRODUCT_CHANGE, CUSTOMER_UPDATE,
                SUBSCRIPTION_STATE_CHANGE, SUBSCRIPTION_DELETION, CUSTOMER_DELETE, ITEM_PRICE_POINT_CHANGED
        );

        Event event = eventsMap.get(CUSTOMER_CREATE);
        assertThat(event.getMessage()).isEqualTo("Customer %s created".formatted(customerFullName));
        assertThat(event.getSubscriptionId()).isNull();
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(BILLING_DATE_CHANGE);
        assertThat(event.getMessage()).startsWith("Billing date changed on %s's subscription to ".formatted(customerFullName));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(CUSTOMER_UPDATE);
        assertThat(event.getMessage()).isEqualTo("Customer information changed for %s".formatted(updatedCustomerFullName));
        assertThat(event.getSubscriptionId()).isNull();
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(CUSTOMER_DELETE);
        assertThat(event.getMessage()).isEqualTo("Customer %s deleted".formatted(updatedCustomerFullName));
        assertThat(event.getSubscriptionId()).isNull();
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(SIGNUP_SUCCESS);
        assertThat(event.getMessage()).isEqualTo("Successful signup for %s's subscription to %s"
                .formatted(customerFullName, product.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        PaymentRelatedEvents signupEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(signupEventData.getProductId()).isEqualTo(product.getId());
        assertThat(signupEventData.getAccountTransactionId()).isEqualTo(subscription.getSignupPaymentId());

        event = eventsMap.get(PAYMENT_SUCCESS);
        assertThat(event.getMessage()).isEqualTo("Successful payment of $10.00 for %s's subscription to %s"
                .formatted(customerFullName, product.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        PaymentRelatedEvents paymentEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(paymentEventData.getProductId()).isEqualTo(product.getId());
        assertThat(paymentEventData.getAccountTransactionId()).isEqualTo(subscription.getSignupPaymentId());

        event = eventsMap.get(INVOICE_ISSUED);
        assertThat(event.getMessage()).isEqualTo("Invoice issued for subscription %s"
                .formatted(subscription.getId()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        InvoiceIssued invoiceIssuedEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(invoiceIssuedEventData.getUid()).isNotNull();
        assertThat(invoiceIssuedEventData.getNumber()).isNotNull();
        assertThat(invoiceIssuedEventData.getRole()).isEqualTo("signup");
        assertThat(invoiceIssuedEventData.getDueDate()).isEqualTo(LocalDate.now());
        assertThat(invoiceIssuedEventData.getIssueDate()).isEqualTo(LocalDate.now().toString());
        assertThat(invoiceIssuedEventData.getPaidDate()).isEqualTo("");
        assertThat(invoiceIssuedEventData.getDueAmount()).isEqualTo("$10.00");
        assertThat(invoiceIssuedEventData.getTotalAmount()).isEqualTo("$10.00");
        assertThat(invoiceIssuedEventData.getStatusAmount()).isEqualTo("$10.00");
        assertThat(invoiceIssuedEventData.getPaidAmount()).isEqualTo("$0.00");
        assertThat(invoiceIssuedEventData.getTaxAmount()).isEqualTo("$0.00");
        assertThat(invoiceIssuedEventData.getRefundAmount()).isEqualTo("$0.00");
        assertThat(invoiceIssuedEventData.getConsolidationLevel()).isEqualTo("none");
        assertThat(invoiceIssuedEventData.getLineItems()).hasSize(1);

        event = eventsMap.get(METERED_USAGE);
        assertThat(event.getMessage()).isEqualTo("Recorded 2 units of usage (total: 2) for %s's subscription"
                .formatted(customerFullName));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        MeteredUsage meteredUsageEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(meteredUsageEventData.getComponentId()).isEqualTo(component.getId());
        assertThat(meteredUsageEventData.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(meteredUsageEventData.getPreviousUnitBalance()).isEqualTo("0.0");
        assertThat(meteredUsageEventData.getNewUnitBalance()).isEqualTo(2);
        assertThat(meteredUsageEventData.getUsageQuantity()).isEqualTo(2);
        assertThat(meteredUsageEventData.getMemo()).isNull();

        event = eventsMap.get(BILLING_DATE_CHANGE);
        assertThat(event.getMessage()).startsWith("Billing date changed on %s's subscription to ".formatted(customerFullName));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(SUBSCRIPTION_CARD_UPDATE);
        assertThat(event.getMessage()).isEqualTo("Credit card updated on %s's subscription to %s"
                .formatted(customerFullName, product2.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(SUBSCRIPTION_PRODUCT_CHANGE);
        SubscriptionProductChange subscriptionProductChange = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(event.getMessage()).isEqualTo("Product changed on %s's subscription from '%s (Original)' to '%s (Original)'"
                .formatted(customerFullName, product.getName(), product2.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(subscriptionProductChange.getPreviousProductId()).isEqualTo(product.getId());
        assertThat(subscriptionProductChange.getNewProductId()).isEqualTo(product2.getId());

        event = eventsMap.get(SUBSCRIPTION_STATE_CHANGE);
        SubscriptionStateChange subscriptionStateChange = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(event.getMessage()).isEqualTo("State changed on %s's subscription to %s from active to canceled"
                .formatted(updatedCustomerFullName, product2.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(subscriptionStateChange.getPreviousSubscriptionState()).isEqualTo("active");
        assertThat(subscriptionStateChange.getNewSubscriptionState()).isEqualTo("canceled");

        event = eventsMap.get(SUBSCRIPTION_DELETION);
        assertThat(event.getMessage()).startsWith("Subscription for %s".formatted(updatedCustomerFullName))
                .endsWith("/%s) was deleted".formatted(updatedCustomer.getEmail()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(event.getEventSpecificData()).isNull();

        event = eventsMap.get(ITEM_PRICE_POINT_CHANGED);
        ItemPricePointChanged itemPricePointChanged = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(event.getMessage()).isEqualTo("Product price point has been changed");
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(itemPricePointChanged.getItemType()).isEqualTo("Product");
        assertThat(itemPricePointChanged.getItemId()).isNotNull();
        assertThat(itemPricePointChanged.getItemName()).isNotNull();
        assertThat(itemPricePointChanged.getItemHandle()).isNotNull();
        assertThat(itemPricePointChanged.getPreviousPricePoint()).isNotNull();
        assertThat(itemPricePointChanged.getCurrentPricePoint()).isNotNull();
    }

    @Test
    void shouldListEventsWithFilter() throws IOException, ApiException {
        List<EventResponse> events = client.getEventsController().listEvents(new ListEventsInput.Builder()
                .sinceId(lastEventId)
                .direction(Direction.DESC)
                .filter(List.of(PAYMENT_SUCCESS, METERED_USAGE))
                .build()
        );
        assertThat(events).hasSize(2);

        Map<EventKey, Event> eventsMap = events.stream()
                .collect(Collectors.toMap(e -> e.getEvent().getKey(), EventResponse::getEvent));

        // then
        for (EventResponse event : events) {
            assertCommonFields(event.getEvent());
        }

        assertThat(eventsMap.keySet()).containsExactlyInAnyOrder(PAYMENT_SUCCESS, METERED_USAGE);

        Event event = eventsMap.get(PAYMENT_SUCCESS);
        assertThat(event.getMessage()).isEqualTo("Successful payment of $10.00 for %s's subscription to %s"
                .formatted(customerFullName, product.getName()));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        PaymentRelatedEvents paymentEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(paymentEventData.getProductId()).isEqualTo(product.getId());
        assertThat(paymentEventData.getAccountTransactionId()).isEqualTo(subscription.getSignupPaymentId());

        event = eventsMap.get(METERED_USAGE);
        assertThat(event.getMessage()).isEqualTo("Recorded 2 units of usage (total: 2) for %s's subscription"
                .formatted(customerFullName));
        assertThat(event.getSubscriptionId()).isEqualTo(subscription.getId());
        MeteredUsage meteredUsageEventData = event.getEventSpecificData().match(new EventSpecificDataGetter<>());
        assertThat(meteredUsageEventData.getComponentId()).isEqualTo(component.getId());
        assertThat(meteredUsageEventData.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(meteredUsageEventData.getPreviousUnitBalance()).isEqualTo("0.0");
        assertThat(meteredUsageEventData.getNewUnitBalance()).isEqualTo(2);
        assertThat(meteredUsageEventData.getUsageQuantity()).isEqualTo(2);
        assertThat(meteredUsageEventData.getMemo()).isNull();
    }

    void assertCommonFields(Event event) {
        assertThat(event.getId()).isGreaterThan(0);
        assertThat(event.getCreatedAt()).isNotNull();
        assertThat(event.getCustomerId()).isEqualTo(customer.getId());
    }
}
