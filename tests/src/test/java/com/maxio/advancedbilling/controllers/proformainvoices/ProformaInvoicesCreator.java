package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateSignupProformaPreviewInclude;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoiceSeller;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.ProformaInvoiceCredit;
import com.maxio.advancedbilling.models.ProformaInvoiceRole;
import com.maxio.advancedbilling.models.SignupProformaPreview;
import com.maxio.advancedbilling.models.SignupProformaPreviewResponse;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentAllocatedQuantity;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import com.maxio.advancedbilling.utils.TestSetup;
import io.apimatic.core.types.BaseModel;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.maxio.advancedbilling.models.ProformaInvoiceStatus.DRAFT;
import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProformaInvoicesCreator {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();

    private final Product product;
    private final ProductFamily productFamily;

    ProformaInvoicesCreator() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
    }

    ProformaInvoice createBasicProformaInvoice(Customer customer) throws IOException, ApiException {
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        return CLIENT.getProformaInvoicesController().createProformaInvoice(subscription.getId());
    }

    ProformaInvoiceWithComponents createProformaInvoiceWithComponents(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        Subscription subscription = setupSubscription(customer, quantityBasedComponent, meteredComponent);

        return new ProformaInvoiceWithComponents(
                CLIENT.getProformaInvoicesController().createProformaInvoice(subscription.getId()),
                quantityBasedComponent, meteredComponent
        );
    }

    ProformaInvoiceWithComponents previewProformaInvoiceWithComponents(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        Subscription subscription = setupSubscription(customer, quantityBasedComponent, meteredComponent);

        return new ProformaInvoiceWithComponents(
                CLIENT.getProformaInvoicesController().previewProformaInvoice(subscription.getId()),
                quantityBasedComponent, meteredComponent
        );
    }

    ProformaInvoiceWithComponents createSignupProformaInvoice(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        ProformaInvoice proformaInvoice = CLIENT.getProformaInvoicesController().createSignupProformaInvoice(
                new CreateSubscriptionRequest(
                        getCreateSubscription(customer, meteredComponent, quantityBasedComponent)
                )
        );

        return new ProformaInvoiceWithComponents(proformaInvoice, quantityBasedComponent, meteredComponent);
    }

    SignupProformaPreviewWithComponents previewSignupProformaInvoice(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        SignupProformaPreview signupProformaPreview = CLIENT.getProformaInvoicesController().previewSignupProformaInvoice(
                CreateSignupProformaPreviewInclude.NEXT_PROFORMA_INVOICE,
                new CreateSubscriptionRequest(
                        getCreateSubscription(customer, meteredComponent, quantityBasedComponent)
                )
        ).getProformaInvoicePreview();

        return new SignupProformaPreviewWithComponents(signupProformaPreview, quantityBasedComponent, meteredComponent);
    }

    private CreateSubscription getCreateSubscription(Customer customer, Component meteredComponent,
                                                     Component quantityBasedComponent) {
        return new CreateSubscription.Builder()
                .productId(product.getId())
                .customerId(customer.getId())
                .components(
                        List.of(
                                new CreateSubscriptionComponent.Builder()
                                        .unitBalance(20)
                                        .componentId(CreateSubscriptionComponentComponentId
                                                .fromNumber(meteredComponent.getId()))
                                        .build(),
                                new CreateSubscriptionComponent.Builder()
                                        .allocatedQuantity(CreateSubscriptionComponentAllocatedQuantity
                                                .fromNumber(20))
                                        .componentId(CreateSubscriptionComponentComponentId
                                                .fromNumber(quantityBasedComponent.getId()))
                                        .build()
                        )
                )
                .creditCardAttributes(
                        new PaymentProfileAttributes.Builder()
                                .billingAddress("My Billing Address")
                                .billingCity("New York")
                                .billingCountry("USA")
                                .billingState("NY")
                                .billingZip("10001")
                                .customerId(customer.getId())
                                .cardType(CardType.VISA)
                                .cvv("123")
                                .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                .build()
                )
                .build();
    }


    private Subscription setupSubscription(Customer customer, Component quantityBasedComponent,
                                           Component meteredComponent) throws IOException, ApiException {
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CLIENT.getSubscriptionInvoiceAccountController().issueServiceCredit(subscription.getId(),
                new IssueServiceCreditRequest(
                        new IssueServiceCredit(IssueServiceCreditAmount.fromString("5"), "credit")
                ));
        CLIENT.getSubscriptionComponentsController().allocateComponents(subscription.getId(),
                new AllocateComponents.Builder()
                        .allocations(
                                List.of(
                                        new CreateAllocation.Builder()
                                                .componentId(quantityBasedComponent.getId())
                                                .quantity(20)
                                                .build()
                                )
                        )
                        .build());
        CLIENT.getSubscriptionComponentsController().createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(new CreateUsage.Builder()
                        .quantity(20.0)
                        .build()));
        return subscription;
    }

    void assertProformaInvoice(Customer customer,
                               ProformaInvoiceWithComponents invoiceWithData,
                               boolean assertPreservationDataNonEmpty,
                               // signup proforma won't contain service credits and subscription id and it's periods
                               // won't be shifted
                               boolean isSignup) {
        ProformaInvoice proformaInvoice = invoiceWithData.invoice();
        assertThat(proformaInvoice.getAdditionalProperties()).isEmpty();

        Component quantityBasedComponent = invoiceWithData.quantityBasedComponent();
        assertThat(quantityBasedComponent.getAdditionalProperties()).isEmpty();

        Component meteredComponent = invoiceWithData.meteredComponent();
        assertThat(meteredComponent.getAdditionalProperties()).isEmpty();

        if (assertPreservationDataNonEmpty) {
            assertThat(proformaInvoice.getNumber()).isNotNull();
            assertThat(proformaInvoice.getSequenceNumber()).isNotNull();
            assertThat(proformaInvoice.getPublicUrl()).isNotNull().isNotBlank();
        } else {
            assertThat(proformaInvoice.getNumber()).isNull();
            assertThat(proformaInvoice.getSequenceNumber()).isNull();
            assertThat(proformaInvoice.getPublicUrl()).isNull();
        }

        if (!isSignup) {
            assertThat(proformaInvoice.getCredits()).hasSize(1);
            ProformaInvoiceCredit credit = proformaInvoice.getCredits().get(0);
            assertThat(credit.getAppliedAmount()).isEqualTo("5.0");
            assertThat(credit.getMemo()).isEqualTo("This credit amount is anticipated to apply when the invoice is generated");
            assertThat(credit.getOriginalAmount()).isEqualTo("5.0");
            assertThat(proformaInvoice.getSubscriptionId()).isNotNull();
        } else {
            assertThat(proformaInvoice.getCredits()).isEmpty();
            assertThat(proformaInvoice.getSubscriptionId()).isNull();
        }

        assertThat(proformaInvoice.getUid()).isNotNull().isNotBlank();

        InvoiceAddress invoiceBillingAddress = proformaInvoice.getBillingAddress();
        assertThat(invoiceBillingAddress.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceBillingAddress).isNotNull(),
                () -> assertThat(invoiceBillingAddress.getStreet()).isEqualTo("My Billing Address"),
                () -> assertThat(invoiceBillingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCity()).isEqualTo("New York"),
                () -> assertThat(invoiceBillingAddress.getState()).isEqualTo("NY"),
                () -> assertThat(invoiceBillingAddress.getZip()).isEqualTo("10001"),
                () -> assertThat(invoiceBillingAddress.getCountry()).isEqualTo("USA")
        );

        InvoiceAddress invoiceShippingAddress = proformaInvoice.getShippingAddress();
        assertThat(invoiceShippingAddress.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceShippingAddress).isNotNull(),
                () -> assertThat(invoiceShippingAddress.getStreet()).isEqualTo(customer.getAddress()),
                () -> assertThat(invoiceShippingAddress.getLine2()).isEqualTo(customer.getAddress2()),
                () -> assertThat(invoiceShippingAddress.getCity()).isEqualTo(customer.getCity()),
                () -> assertThat(invoiceShippingAddress.getState()).isEqualTo(customer.getState()),
                () -> assertThat(invoiceShippingAddress.getZip()).isEqualTo(customer.getZip()),
                () -> assertThat(invoiceShippingAddress.getCountry()).isEqualTo(customer.getCountry())
        );

        assertThat(proformaInvoice.getCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(proformaInvoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(proformaInvoice.getCreatedAt()).isNotNull();
        assertThat(proformaInvoice.getCreditAmount()).isNotNull();

        assertThat(proformaInvoice.getCurrency()).isEqualTo("USD");
        assertThat(proformaInvoice.getCustomFields()).isEmpty();

        InvoiceCustomer invoiceCustomer = proformaInvoice.getCustomer();
        assertThat(invoiceCustomer.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceCustomer).isNotNull(),
                () -> assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId()),
                () -> assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName()),
                () -> assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName()),
                () -> assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization()),
                () -> assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail()),
                () -> assertThat(invoiceCustomer.getVatNumber()).isNull(),
                () -> assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference())
        );

        assertThat(proformaInvoice.getCustomerId()).isEqualTo(customer.getId());
        assertThat(proformaInvoice.getDeliveryDate()).isAfterOrEqualTo(LocalDate.now());
        assertThat(proformaInvoice.getDiscountAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getDiscounts()).isEmpty();
        assertThat(proformaInvoice.getDueAmount()).isEqualTo(isSignup ? "262.5" : "277.5");
        assertThat(proformaInvoice.getMemo()).isEqualTo("Thanks for your business! If you have any questions, please contact your account manager.");
        assertThat(proformaInvoice.getPaidAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getPaymentInstructions()).isEqualTo("Please make checks payable to \"Acme, Inc.\"");
        assertThat(proformaInvoice.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(proformaInvoice.getProductName()).isEqualTo(product.getName());
        assertThat(proformaInvoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getRole()).isEqualTo(ProformaInvoiceRole.PROFORMA_ADHOC);

        InvoiceSeller invoiceSeller = proformaInvoice.getSeller();
        assertThat(invoiceSeller.getAdditionalProperties()).isEmpty();
        assertThat(invoiceSeller)
                .usingRecursiveComparison()
                .isEqualTo(INVOICE_SELLER);
        assertThat(proformaInvoice.getSiteId()).isNotNull();
        assertThat(proformaInvoice.getStatus()).isEqualTo(DRAFT);
        assertThat(proformaInvoice.getSubtotalAmount()).isEqualTo(isSignup ? "262.5" : "282.5");
        assertThat(proformaInvoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getTaxes()).isEmpty();
        assertThat(proformaInvoice.getTotalAmount()).isEqualTo(isSignup ? "262.5" : "282.5");

        // line items
        String lineItemDescription = "%s - %s".formatted(
                isSignup ? formatDescriptionDate(LocalDate.now()) :
                        formatDescriptionDate(LocalDate.now().plusMonths(1)),
                isSignup ? formatDescriptionDate(LocalDate.now().plusMonths(1)) :
                        formatDescriptionDate(LocalDate.now().plusMonths(1).plusMonths(1)));

        List<InvoiceLineItem> expectedLineItems = new ArrayList<>();
        expectedLineItems.add(
                new InvoiceLineItem.Builder()
                        .title(product.getName())
                        .description(lineItemDescription)
                        .quantity("1.0")
                        .unitPrice("12.5")
                        .subtotalAmount("12.5")
                        .discountAmount("0.0")
                        .taxAmount("0.0")
                        .totalAmount("12.5")
                        .kind("baseline")
                        .tieredUnitPrice(false)
                        .periodRangeStart(isSignup ? LocalDate.now() : LocalDate.now().plusMonths(1))
                        .periodRangeEnd(isSignup ? LocalDate.now().plusMonths(1) :
                                LocalDate.now().plusMonths(1).plusMonths(1))
                        .productId(product.getId())
                        .productVersion(null)
                        .componentId(null)
                        .pricePointId(null)
                        .productPricePointId(product.getDefaultProductPricePointId())
                        .customItem(false)
                        .build());
        expectedLineItems.add(
                new InvoiceLineItem.Builder()
                        .title(meteredComponent.getName())
                        .description(isSignup ? formatDescriptionDate(LocalDate.now()) : "%s - %s"
                                .formatted(formatDescriptionDate(LocalDate.now()),
                                        formatDescriptionDate(LocalDate.now().plusMonths(1))))
                        .quantity("20.0")
                        .unitPrice("11.5")
                        .subtotalAmount("230.0")
                        .discountAmount("0.0")
                        .taxAmount("0.0")
                        .totalAmount("230.0")
                        .kind("metered_component")
                        .tieredUnitPrice(false)
                        .periodRangeStart(LocalDate.now())
                        .periodRangeEnd(isSignup ? LocalDate.now() :
                                LocalDate.now().plusMonths(1))
                        .productId(product.getId())
                        .componentId(meteredComponent.getId())
                        .productVersion(null)
                        .pricePointId(meteredComponent.getDefaultPricePointId())
                        .productPricePointId(product.getDefaultProductPricePointId())
                        .customItem(false)
                        .build());
        expectedLineItems.add(
                new InvoiceLineItem.Builder()
                        .title(quantityBasedComponent.getName())
                        .description(lineItemDescription)
                        .quantity("20.0")
                        .unitPrice("1.0")
                        .subtotalAmount("20.0")
                        .discountAmount("0.0")
                        .taxAmount("0.0")
                        .totalAmount("20.0")
                        .kind("quantity_based_component")
                        .tieredUnitPrice(false)
                        .periodRangeStart(isSignup ? LocalDate.now() : LocalDate.now().plusMonths(1))
                        .periodRangeEnd(isSignup ? LocalDate.now().plusMonths(1) :
                                LocalDate.now().plusMonths(1).plusMonths(1))
                        .productId(product.getId())
                        .componentId(quantityBasedComponent.getId())
                        .productVersion(null)
                        .pricePointId(quantityBasedComponent.getDefaultPricePointId())
                        .productPricePointId(product.getDefaultProductPricePointId())
                        .customItem(false)
                        .build()
        );

        if (!isSignup) {
            expectedLineItems.add(
                    new InvoiceLineItem.Builder()
                            .title("%s: 0 to 20 units".formatted(quantityBasedComponent.getName()))
                            .description("Prorated: %s - %s (100.0%% of original period)"
                                    .formatted(formatDescriptionDate(LocalDate.now()),
                                            formatDescriptionDate(LocalDate.now().plusMonths(1))))
                            .quantity("20.0")
                            .unitPrice("1.0")
                            .subtotalAmount("20.0")
                            .discountAmount("0.0")
                            .taxAmount("0.0")
                            .totalAmount("20.0")
                            .kind("quantity_based_component")
                            .tieredUnitPrice(false)
                            .periodRangeStart(LocalDate.now())
                            .periodRangeEnd(LocalDate.now().plusMonths(1))
                            .productId(product.getId())
                            .componentId(quantityBasedComponent.getId())
                            .productVersion(1)
                            .pricePointId(quantityBasedComponent.getDefaultPricePointId())
                            .productPricePointId(product.getDefaultProductPricePointId())
                            .customItem(false)
                            .build()
            );
        }

        assertThat(proformaInvoice.getLineItems())
                .hasSize(expectedLineItems.size())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid")
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "additionalProperties")
                .containsExactlyInAnyOrder(
                        expectedLineItems.toArray(new InvoiceLineItem[0])
                );
    }

    private String formatDescriptionDate(LocalDate localDate) {
        return localDate
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    record ProformaInvoiceWithComponents(ProformaInvoice invoice, Component quantityBasedComponent,
                                         Component meteredComponent) {
    }

    record SignupProformaPreviewWithComponents(SignupProformaPreview preview, Component quantityBasedComponent,
                                                       Component meteredComponent) {
    }
}
