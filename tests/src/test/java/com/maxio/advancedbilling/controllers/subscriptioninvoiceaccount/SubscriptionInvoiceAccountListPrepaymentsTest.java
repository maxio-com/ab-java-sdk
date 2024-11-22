package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListPrepaymentDateField;
import com.maxio.advancedbilling.models.ListPrepaymentsFilter;
import com.maxio.advancedbilling.models.ListPrepaymentsInput;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.PrepaymentMethod;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionInvoiceAccountListPrepaymentsTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER =
            CLIENT.getSubscriptionInvoiceAccountController();

    private static Product product;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnListOfPrepayments() throws IOException, ApiException {
        // given
        Integer subscriptionId = TEST_SETUP.createSubscription(customer, product).getId();
        createCheckPrepaymentForSignup(subscriptionId);
        createCashPrepaymentForLicence(subscriptionId);

        // when
        List<Prepayment> prepayments = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder(subscriptionId).build())
                .getPrepayments();

        // then
        assertThat(prepayments)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id", "createdAt")
                .containsExactlyInAnyOrder(
                        new Prepayment.Builder()
                                .subscriptionId(subscriptionId)
                                .amountInCents(5000L)
                                .remainingAmountInCents(5000L)
                                .refundedAmountInCents(0L)
                                .details("John Doe licence for $50")
                                .external(true)
                                .memo("Licence for $50")
                                .paymentType(PrepaymentMethod.CASH)
                                .build(),
                        new Prepayment.Builder()
                                .subscriptionId(subscriptionId)
                                .amountInCents(1000L)
                                .remainingAmountInCents(1000L)
                                .refundedAmountInCents(0L)
                                .details("John Doe signup for $10")
                                .external(true)
                                .memo("Signup for $10")
                                .paymentType(PrepaymentMethod.CHECK)
                                .build()
                );
    }

    @Test
    void shouldReturnListOfPrepaymentsUsingFilters() throws IOException, ApiException {
        // given
        Integer subscriptionId = TEST_SETUP
                .createSubscription(customer, TEST_SETUP.createProduct(TEST_SETUP.createProductFamily()))
                .getId();
        createCheckPrepaymentForSignup(subscriptionId);

        // when - then
        List<Prepayment> filteredPrepayments1 = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder()
                        .subscriptionId(subscriptionId)
                        .filter(new ListPrepaymentsFilter.Builder()
                                .dateField(ListPrepaymentDateField.CREATED_AT)
                                .startDate(LocalDate.now().minusDays(1))
                                .build()
                        )
                        .build()
                )
                .getPrepayments();
        List<Prepayment> filteredPrepayments2 = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder()
                        .subscriptionId(subscriptionId)
                        .filter(new ListPrepaymentsFilter.Builder()
                                .dateField(ListPrepaymentDateField.CREATED_AT)
                                .endDate(LocalDate.now().minusDays(1))
                                .build()
                        )
                        .build()
                )
                .getPrepayments();

        assertThat(filteredPrepayments1).hasSize(1);
        assertThat(filteredPrepayments2).isEmpty();
    }

    @Test
    void shouldReturnListOfPrepaymentsUsingPagination() throws IOException, ApiException {
        // given
        Integer subscriptionId = TEST_SETUP
                .createSubscription(customer, TEST_SETUP.createProduct(TEST_SETUP.createProductFamily()))
                .getId();
        createCheckPrepaymentForSignup(subscriptionId);
        createCashPrepaymentForLicence(subscriptionId);

        // when - then
        assertThat(getSinglePrepaymentOnPage(subscriptionId, 1)).hasSize(1);
        assertThat(getSinglePrepaymentOnPage(subscriptionId, 2)).hasSize(1);
        assertThat(getSinglePrepaymentOnPage(subscriptionId, 3)).isEmpty();
    }

    @Test
    void shouldReturnEmptyResponseWhenNoPrepaymentsExist() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        assertThat(SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder(subscription.getId()).build())
                .getPrepayments()
        ).isEmpty();
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder(123).build())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .listPrepayments(new ListPrepaymentsInput.Builder(123).build())
        );
    }

    private static List<Prepayment> getSinglePrepaymentOnPage(int subscriptionId, int page) throws ApiException, IOException {
        return SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .listPrepayments(new ListPrepaymentsInput.Builder()
                        .subscriptionId(subscriptionId)
                        .page(page)
                        .perPage(1)
                        .build()
                )
                .getPrepayments();
    }

    private static void createCheckPrepaymentForSignup(int subscriptionId) throws IOException, ApiException {
        createPrepayment(subscriptionId, new CreatePrepayment.Builder()
                .amount(10.0)
                .details("John Doe signup for $10")
                .memo("Signup for $10")
                .method(CreatePrepaymentMethod.CHECK)
                .build()
        );
    }

    private static void createCashPrepaymentForLicence(int subscriptionId) throws IOException, ApiException {
        createPrepayment(subscriptionId, new CreatePrepayment.Builder()
                .amount(50.0)
                .details("John Doe licence for $50")
                .memo("Licence for $50")
                .method(CreatePrepaymentMethod.CASH)
                .build()
        );
    }

    private static void createPrepayment(int subscriptionId, CreatePrepayment createPrepayment) throws IOException, ApiException {
        // given
        SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .createPrepayment(
                        subscriptionId,
                        new CreatePrepaymentRequest(createPrepayment)
                );
    }
}
