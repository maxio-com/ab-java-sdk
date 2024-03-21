package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueInvoiceRequest;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.UpdateCustomer;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;
import com.maxio.advancedbilling.models.UpdateMetadata;
import com.maxio.advancedbilling.models.UpdateMetadataRequest;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.CLIENT;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.INVOICES_CONTROLLER;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseCustomerInformationTest {
    protected static final TestSetup TEST_SETUP = new TestSetup();

    protected static Product product;
    protected static Customer customer;
    protected static Subscription subscription;
    protected static Component quantityBasedComponent;
    protected static Map<String, Metadata> subscriptionMetadata;
    protected static Map<String, Metadata> customerMetadata;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(125000));
        customer = TEST_SETUP.createCustomer();
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        CLIENT.getCustomFieldsController().createMetafields(ResourceType.CUSTOMERS, new CreateMetafieldsRequest(
                CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(List.of(
                        new CreateMetafield.Builder()
                                .inputType(MetafieldInput.TEXT)
                                .name("CustomerField1")
                                .scope(new MetafieldScope.Builder()
                                        .invoices(IncludeOption.INCLUDE)
                                        .build())
                                .build(),
                        new CreateMetafield.Builder()
                                .inputType(MetafieldInput.TEXT)
                                .name("CustomerField2")
                                .scope(new MetafieldScope.Builder()
                                        .invoices(IncludeOption.INCLUDE)
                                        .build())
                                .build()
                ))));
        CLIENT.getCustomFieldsController().createMetafields(ResourceType.SUBSCRIPTIONS, new CreateMetafieldsRequest(
                CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(List.of(
                        new CreateMetafield.Builder()
                                .inputType(MetafieldInput.TEXT)
                                .name("SubscriptionField1")
                                .scope(new MetafieldScope.Builder()
                                        .invoices(IncludeOption.INCLUDE)
                                        .build())
                                .build(),
                        new CreateMetafield.Builder()
                                .inputType(MetafieldInput.TEXT)
                                .name("SubscriptionField2")
                                .scope(new MetafieldScope.Builder()
                                        .invoices(IncludeOption.INCLUDE)
                                        .build())
                                .build()
                ))));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    protected TestData setupCustomerDataChangedScenario() throws IOException, ApiException {
        subscription = createTestSubscription();

        CLIENT.getCustomFieldsController()
                .createMetadata(ResourceType.CUSTOMERS, customer.getId(), new CreateMetadataRequest(
                        List.of(new CreateMetadata("CustomerField1", "value1"))
                ));
        CLIENT.getCustomFieldsController()
                .createMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), new CreateMetadataRequest(
                        List.of(new CreateMetadata("SubscriptionField1", "value1"))
                ));

        Invoice openInvoice = createOpenInvoice(subscription);

        Customer updatedCustomer = updateCustomerData();

        CLIENT.getCustomFieldsController()
                .updateMetadata(ResourceType.CUSTOMERS, customer.getId(), new UpdateMetadataRequest(
                        new UpdateMetadata("CustomerField1", "CustomerField1", "newValue1")
                ));
        CLIENT.getCustomFieldsController()
                .createMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), new CreateMetadataRequest(
                        List.of(new CreateMetadata("SubscriptionField2", "value2"))
                ));
        CLIENT.getCustomFieldsController()
                .deleteMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), "SubscriptionField1", List.of());

        subscriptionMetadata = CLIENT.getCustomFieldsController()
                .listMetadataForResourceType(new ListMetadataForResourceTypeInput.Builder()
                        .resourceIds(List.of(subscription.getId()))
                        .resourceType(ResourceType.SUBSCRIPTIONS)
                        .withDeleted(true)
                        .build())
                .getMetadata()
                .stream()
                .collect(Collectors.toMap(Metadata::getName, Function.identity()));

        customerMetadata = CLIENT.getCustomFieldsController()
                .listMetadataForResourceType(new ListMetadataForResourceTypeInput.Builder()
                        .resourceIds(List.of(customer.getId()))
                        .resourceType(ResourceType.CUSTOMERS)
                        .withDeleted(true)
                        .build())
                .getMetadata()
                .stream()
                .collect(Collectors.toMap(Metadata::getName, Function.identity()));

        return new TestData(customer, updatedCustomer, openInvoice);
    }

    protected Subscription createTestSubscription() throws IOException, ApiException {
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(quantityBasedComponent.getId()))
                        .unitBalance(10)
                        .build());

        return TEST_SETUP.createSubscription(customer, product, s -> s
                .components(subscriptionComponents));
    }

    protected Invoice createOpenInvoice(Subscription subscription) throws ApiException, IOException {
        CLIENT.getSubscriptionComponentsController()
                .allocateComponent(subscription.getId(), quantityBasedComponent.getId(), new CreateAllocationRequest(
                        new CreateAllocation.Builder()
                                .memo("Allocate metered for invoice")
                                .quantity(100)
                                .upgradeCharge(CreditType.FULL)
                                .build())
                );

        Invoice pendingInvoice = INVOICES_CONTROLLER.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PENDING)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        INVOICES_CONTROLLER.issueInvoice(pendingInvoice.getUid(), new IssueInvoiceRequest());
        return INVOICES_CONTROLLER.readInvoice(pendingInvoice.getUid());
    }

    protected Customer updateCustomerData() throws ApiException, IOException {
        return CLIENT.getCustomersController().updateCustomer(customer.getId(), new UpdateCustomerRequest(new UpdateCustomer.Builder()
                        .firstName("New First Name")
                        .lastName("New Last Name")
                        .email("new@email.com")
                        .city("New City")
                        .ccEmails("cc1@email.com,cc2@email.com")
                        .address("New Address")
                        .address2("New Address 2")
                        .organization("New Organization")
                        .state("New State")
                        .locale("PL")
                        .vatNumber("123-213-123-123")
                        .phone("0700722722")
                        .reference("new-reference-for-a-new-customer-" + randomNumeric(10))
                        .zip("1111")
                        .country("New Country")
                        .build()))
                .getCustomer();
    }

    protected void assertShippingData(InvoiceAddress shippingAfter, Customer updatedCustomer) {
        assertThat(shippingAfter.getStreet()).isEqualTo(updatedCustomer.getAddress());
        assertThat(shippingAfter.getLine2()).isEqualTo(updatedCustomer.getAddress2());
        assertThat(shippingAfter.getCity()).isEqualTo(updatedCustomer.getCity());
        assertThat(shippingAfter.getState()).isEqualTo(updatedCustomer.getState());
        assertThat(shippingAfter.getZip()).isEqualTo(updatedCustomer.getZip());
        assertThat(shippingAfter.getCountry()).isEqualTo(updatedCustomer.getCountry());
    }

    protected record TestData(Customer customerBeforeUpdate, Customer customerAfterUpdate, Invoice openInvoice) {

    }
}
