package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoiceSeller;
import com.maxio.advancedbilling.models.ListProformaInvoicesResponse;
import com.maxio.advancedbilling.models.ListSubscriptionGroupProformaInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.ProformaInvoiceRole;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.maxio.advancedbilling.models.ProformaInvoiceStatus.DRAFT;
import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * This class tests both `Create Consolidated Proforma Invoices` and `List Subscription Group Proforma Invoices`
 * operations, as the Creation response is asynchronous and has no specific response, but it's needed to execute listing.
 */
public class ProformaInvoicesControllerSubscriptionGroupsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final ProformaInvoicesController PROFORMA_INVOICES_CONTROLLER = CLIENT
            .getProformaInvoicesController();

    private static SubscriptionGroupSignupResponse groupSignup;
    private static ProductFamily productFamily;
    private static Product product;

    @BeforeAll
    static void setUp() throws IOException, ApiException, InterruptedException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);

        groupSignup = TEST_SETUP.signupWithSubscriptionGroup(product, meteredComponent);
        PROFORMA_INVOICES_CONTROLLER.createConsolidatedProformaInvoice(groupSignup.getUid());

        Thread.sleep(5000);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteSubscriptionGroup(groupSignup);
    }

    @Test
    void shouldListGroupProformas() throws IOException, ApiException {
        // given-when
        ListProformaInvoicesResponse listProformaInvoicesResponse = PROFORMA_INVOICES_CONTROLLER
                .listSubscriptionGroupProformaInvoices(new ListSubscriptionGroupProformaInvoicesInput.Builder()
                        .uid(groupSignup.getUid())
                        .lineItems(true)
                        .build()
                );

        // then
        assertThat(listProformaInvoicesResponse.getMeta()).isNotNull();
        assertThat(listProformaInvoicesResponse.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(listProformaInvoicesResponse.getMeta().getStatusCode()).isEqualTo(200);
        assertThat(listProformaInvoicesResponse.getMeta().getTotalCount()).isEqualTo(1);
        assertThat(listProformaInvoicesResponse.getMeta().getTotalPages()).isEqualTo(1);

        assertThat(listProformaInvoicesResponse.getProformaInvoices().size()).isEqualTo(1);

        ProformaInvoice proformaInvoice = listProformaInvoicesResponse.getProformaInvoices().get(0);

        InvoiceAddress invoiceBillingAddress = proformaInvoice.getBillingAddress();
        assertThat(invoiceBillingAddress.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceBillingAddress).isNotNull(),
                () -> assertThat(invoiceBillingAddress.getStreet()).isNull(),
                () -> assertThat(invoiceBillingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCity()).isNull(),
                () -> assertThat(invoiceBillingAddress.getState()).isNull(),
                () -> assertThat(invoiceBillingAddress.getZip()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCountry()).isNull()
        );

        InvoiceAddress invoiceShippingAddress = proformaInvoice.getShippingAddress();
        assertThat(invoiceShippingAddress.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceShippingAddress).isNotNull(),
                () -> assertThat(invoiceShippingAddress.getStreet()).isEqualTo("Broadway"),
                () -> assertThat(invoiceShippingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceShippingAddress.getCity()).isEqualTo("NY"),
                () -> assertThat(invoiceShippingAddress.getState()).isNull(),
                () -> assertThat(invoiceShippingAddress.getZip()).isNull(),
                () -> assertThat(invoiceShippingAddress.getCountry()).isNull()
        );

        assertThat(proformaInvoice.getCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(proformaInvoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.PARENT);
        assertThat(proformaInvoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.PARENT);
        assertThat(proformaInvoice.getCreatedAt()).isNotNull();
        assertThat(proformaInvoice.getCredits()).isNull();
        assertThat(proformaInvoice.getCurrency()).isEqualTo("USD");
        assertThat(proformaInvoice.getCustomFields()).isNull();

        InvoiceCustomer invoiceCustomer = proformaInvoice.getCustomer();
        assertThat(invoiceCustomer.getAdditionalProperties()).isEmpty();
        assertAll(
                () -> assertThat(invoiceCustomer).isNotNull(),
                () -> assertThat(invoiceCustomer.getChargifyId()).isNotNull(),
                () -> assertThat(invoiceCustomer.getFirstName()).isEqualTo("Payer"),
                () -> assertThat(invoiceCustomer.getLastName()).isEqualTo("Doe"),
                () -> assertThat(invoiceCustomer.getOrganization()).isNull(),
                () -> assertThat(invoiceCustomer.getEmail()).isEqualTo("payerdoe@chargify.com"),
                () -> assertThat(invoiceCustomer.getVatNumber()).isNull(),
                () -> assertThat(invoiceCustomer.getReference()).isNull()
        );
        assertThat(proformaInvoice.getCustomerId()).isEqualTo(groupSignup.getCustomerId());

        assertThat(proformaInvoice.getDeliveryDate()).isEqualTo(LocalDate.now().plusMonths(1));
        assertThat(proformaInvoice.getMemo()).isEmpty();
        assertThat(proformaInvoice.getNumber()).isNotNull();
        assertThat(proformaInvoice.getPaymentInstructions()).isEmpty();
        assertThat(proformaInvoice.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(proformaInvoice.getProductName()).isEqualTo(product.getName());
        assertThat(proformaInvoice.getPublicUrl()).isNotNull().isNotBlank();
        assertThat(proformaInvoice.getRole()).isEqualTo(ProformaInvoiceRole.PROFORMA_ADHOC);
        InvoiceSeller invoiceSeller = proformaInvoice.getSeller();
        assertThat(invoiceSeller.getAdditionalProperties()).isEmpty();
        assertThat(invoiceSeller)
                .usingRecursiveComparison()
                .isEqualTo(INVOICE_SELLER);
        assertThat(proformaInvoice.getSequenceNumber()).isNotNull();
        assertThat(proformaInvoice.getSiteId()).isNotNull();
        assertThat(proformaInvoice.getStatus()).isEqualTo(DRAFT);
        assertThat(proformaInvoice.getSubscriptionId()).isEqualTo(groupSignup.getPrimarySubscriptionId());
        assertThat(proformaInvoice.getUid()).isNotNull();

        assertThat(proformaInvoice.getCreditAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getDiscountAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getDueAmount()).isEqualTo("25.0");
        assertThat(proformaInvoice.getPaidAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(proformaInvoice.getSubtotalAmount()).isEqualTo("25.0");
        assertThat(proformaInvoice.getTotalAmount()).isEqualTo("25.0");

        assertThat(proformaInvoice.getLineItems())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "additionalProperties")
                .containsOnly(
                        new InvoiceLineItem.Builder()
                                .title(product.getName())
                                .description("%s - %s".formatted(formatDescriptionDate(LocalDate.now().plusMonths(1)),
                                        formatDescriptionDate(LocalDate.now().plusMonths(1).plusMonths(1))))
                                .quantity("1.0")
                                .unitPrice("12.5")
                                .subtotalAmount("12.5")
                                .discountAmount("0.0")
                                .taxAmount("0.0")
                                .totalAmount("12.5")
                                .kind("baseline")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now().plusMonths(1))
                                .periodRangeEnd(LocalDate.now().plusMonths(1).plusMonths(1))
                                .productId(product.getId())
                                .productVersion(null)
                                .componentId(null)
                                .pricePointId(null)
                                .productPricePointId(product.getDefaultProductPricePointId())
                                .customItem(false)
                                .build()
                );
    }

    @Test
    void shouldReturn404WhenCreatingConsolidatedProformaInvoiceForNonExistentGroup() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PROFORMA_INVOICES_CONTROLLER.createConsolidatedProformaInvoice("123")
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                .createConsolidatedProformaInvoice("123")
        );
    }

    private String formatDescriptionDate(LocalDate localDate) {
        return localDate
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

}
