package com.maxio.advancedbilling.controllers.advanceinvoice;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.AdvanceInvoiceController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoicePreviousBalance;
import com.maxio.advancedbilling.models.InvoiceRole;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueAdvanceInvoiceRequest;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestFixtures;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AdvanceInvoiceControllerIssueTest {

    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final AdvanceInvoiceController advanceInvoiceController = client.getAdvanceInvoiceController();

    private ProductFamily productFamily;
    private Product product;
    private Customer customer;
    private Subscription subscription;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        subscription = testSetup.createSubscription(customer, product);
    }

    @BeforeAll
    void beforeAll() throws IOException, ApiException {
        productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn201onIssueAdvanceInvoice() throws IOException, ApiException {
        // given
        ZonedDateTime beforeDateTime = ZonedDateTime.now().plusSeconds(5).truncatedTo(ChronoUnit.SECONDS);
        LocalDate beforeDate = LocalDate.now();

        // when
        Invoice invoice = advanceInvoiceController
                .issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest());

        // then
        assertThat(invoice).isNotNull();
        assertThat(invoice.getUid()).isNotNull();
        assertThat(invoice.getSiteId()).isNotNull();
        assertThat(invoice.getCustomerId()).isEqualTo(customer.getId());
        assertThat(invoice.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(invoice.getNumber()).isNotNull();
        assertThat(invoice.getSequenceNumber()).isNotNull();
        assertThat(invoice.getCreatedAt()).isBeforeOrEqualTo(beforeDateTime);
        assertThat(invoice.getUpdatedAt()).isNotNull();
        assertThat(invoice.getIssueDate()).isEqualTo(beforeDate);
        assertThat(invoice.getDueDate()).isNotNull();
        assertThat(invoice.getPaidDate()).isNull();
        assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(invoice.getCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(invoice.getPaymentInstructions()).isEqualTo("Please make checks payable to \"Acme, Inc.\"");
        assertThat(invoice.getCurrency()).isEqualTo("USD");
        assertThat(invoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(invoice.getParentInvoiceUid()).isNull();
        assertThat(invoice.getParentInvoiceNumber()).isNull();
        assertThat(invoice.getGroupPrimarySubscriptionId()).isNull();
        assertThat(invoice.getProductName()).isEqualTo(product.getName());
        assertThat(invoice.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(invoice.getRole()).isEqualTo(InvoiceRole.RENEWAL);
        assertThat(invoice.getSeller())
                .usingRecursiveComparison()
                .ignoringFields("address.additionalProperties")
                .isEqualTo(TestFixtures.INVOICE_SELLER);
        assertThat(invoice.getMemo()).isEqualTo("Thanks for your business! If you have any questions, please contact your account manager.");

        InvoiceCustomer invoiceCustomer = invoice.getCustomer();
        assertAll(
                () -> assertThat(invoiceCustomer).isNotNull(),
                () -> assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId()),
                () -> assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName()),
                () -> assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName()),
                () -> assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization()),
                () -> assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail()),
                () -> assertThat(invoiceCustomer.getVatNumber()).isEqualTo(customer.getVatNumber()),
                () -> assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference())
        );

        InvoiceAddress invoiceBillingAddress = invoice.getBillingAddress();
        assertAll(
                () -> assertThat(invoiceBillingAddress).isNotNull(),
                () -> assertThat(invoiceBillingAddress.getStreet()).isEqualTo("My Billing Address"),
                () -> assertThat(invoiceBillingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCity()).isEqualTo("New York"),
                () -> assertThat(invoiceBillingAddress.getState()).isEqualTo("NY"),
                () -> assertThat(invoiceBillingAddress.getZip()).isEqualTo("10001"),
                () -> assertThat(invoiceBillingAddress.getCountry()).isEqualTo("USA")
        );

        InvoiceAddress invoiceShippingAddress = invoice.getShippingAddress();
        assertAll(
                () -> assertThat(invoiceShippingAddress).isNotNull(),
                () -> assertThat(invoiceShippingAddress.getStreet()).isEqualTo(customer.getAddress()),
                () -> assertThat(invoiceShippingAddress.getLine2()).isEqualTo(customer.getAddress2()),
                () -> assertThat(invoiceShippingAddress.getCity()).isEqualTo(customer.getCity()),
                () -> assertThat(invoiceShippingAddress.getState()).isEqualTo(customer.getState()),
                () -> assertThat(invoiceShippingAddress.getZip()).isEqualTo(customer.getZip()),
                () -> assertThat(invoiceShippingAddress.getCountry()).isEqualTo(customer.getCountry())
        );

        assertThat(invoice.getSubtotalAmount()).isEqualTo("12.5");
        assertThat(invoice.getDiscountAmount()).isEqualTo("0.0");
        assertThat(invoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(invoice.getTotalAmount()).isEqualTo("12.5");
        assertThat(invoice.getCreditAmount()).isEqualTo("0.0");
        assertThat(invoice.getDebitAmount()).isEqualTo("0.0");
        assertThat(invoice.getPaidAmount()).isEqualTo("0.0");
        assertThat(invoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(invoice.getDueAmount()).isEqualTo("12.5");

        List<InvoiceLineItem> lineItems = invoice.getLineItems();
        assertThat(lineItems).hasSize(1);
        InvoiceLineItem invoiceLineItem = lineItems.get(0);
        assertAll(
                () -> assertThat(invoiceLineItem.getUid()).isNotNull(),
                () -> assertThat(invoiceLineItem.getTitle()).isEqualTo(product.getName()),
                () -> assertThat(invoiceLineItem.getDescription()).isNotNull(),
                () -> assertThat(invoiceLineItem.getKind()).isEqualTo("baseline"),
                () -> assertThat(invoiceLineItem.getQuantity()).isEqualTo("1.0"),
                () -> assertThat(invoiceLineItem.getUnitPrice()).isEqualTo("12.5"),
                () -> assertThat(invoiceLineItem.getSubtotalAmount()).isEqualTo("12.5"),
                () -> assertThat(invoiceLineItem.getDiscountAmount()).isEqualTo("0.0"),
                () -> assertThat(invoiceLineItem.getTaxAmount()).isEqualTo("0.0"),
                () -> assertThat(invoiceLineItem.getTotalAmount()).isEqualTo("12.5"),
                () -> assertThat(invoiceLineItem.getTieredUnitPrice()).isFalse(),
                () -> assertThat(invoiceLineItem.getPeriodRangeStart()).isEqualTo(beforeDate.plusMonths(1)),
                () -> assertThat(invoiceLineItem.getPeriodRangeEnd()).isEqualTo(beforeDate.plusMonths(2)),
                () -> assertThat(invoiceLineItem.getProductId()).isEqualTo(product.getId()),
                () -> assertThat(invoiceLineItem.getProductVersion()).isEqualTo(product.getVersionNumber()),
                () -> assertThat(invoiceLineItem.getProductPricePointId()).isEqualTo(product.getProductPricePointId()),
                () -> assertThat(invoiceLineItem.getComponentId()).isNull(),
                () -> assertThat(invoiceLineItem.getPricePointId()).isNull(),
                () -> assertThat(invoiceLineItem.getBillingScheduleItemId()).isNull(),
                () -> assertThat(invoiceLineItem.getCustomItem()).isFalse()
        );

        assertThat(invoice.getDiscounts()).isEmpty();
        assertThat(invoice.getTaxes()).isEmpty();
        assertThat(invoice.getCredits()).isEmpty();
        assertThat(invoice.getDebits()).isEmpty();
        assertThat(invoice.getPayments()).isEmpty();
        assertThat(invoice.getRefunds()).isEmpty();
        assertThat(invoice.getCustomFields()).isEmpty();

        InvoicePreviousBalance previousBalanceData = invoice.getPreviousBalanceData();
        assertAll(
                () -> assertThat(previousBalanceData).isNotNull(),
                () -> assertThat(previousBalanceData.getCapturedAt()).isNotNull(),
                () -> assertThat(previousBalanceData.getInvoices()).isEmpty()
        );

        assertThat(invoice.getAvataxDetails()).isNull();
        assertThat(invoice.getPublicUrl()).isNotBlank();
        assertThat(invoice.getPublicUrlExpiresOn()).isNotNull();
    }

    @Test
    void shouldReturn422OnAttemptToIssueAdvanceInvoiceWhenOneAlreadyExists() throws IOException, ApiException {
        // given
        advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest());

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest()),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Advance invoice already exists"
                )
        );
    }

    @Test
    void shouldReturn422WhenAttemptingToIssueAdvanceInvoiceWhenOneAlreadyExists() throws IOException, ApiException {
        // given - issuing first advance invoice
        advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest());

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest()),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Advance invoice already exists"
                )
        );
    }

    @Test
    void shouldReturn200onAttemptToIssueSecondAdvanceInvoiceWhenForceParamIsUsed() throws IOException, ApiException {
        // given - issuing first advance invoice
        advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest());

        /*
        * Regeneration of the advance invoice may be forced with `force: true` parameter, which will void an advance
        * invoice if one exists and generate a new one. However, the regeneration can take a few minutes like the error
        * message suggests so, this is intentionally not tested here because it would require a huge delay.
        */
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> advanceInvoiceController.issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest(true)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Please wait a few minutes before attempting to regenerate the advance invoice"
                )
        );
    }

    @Test
    void shouldReturn404WhenIssuingAdvanceInvoiceForNonExistentSubscription() {
        // when - then
        assertNotFound(
                () -> advanceInvoiceController.issueAdvanceInvoice(123, new IssueAdvanceInvoiceRequest())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider
                .createInvalidCredentialsClient()
                .getAdvanceInvoiceController()
                .issueAdvanceInvoice(subscription.getId(), new IssueAdvanceInvoiceRequest())
        );
    }
}
