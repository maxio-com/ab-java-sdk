package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AccountBalance;
import com.maxio.advancedbilling.models.AccountBalances;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionInvoiceAccountReadAccountBalancesTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER =
            CLIENT.getSubscriptionInvoiceAccountController();

    private static Product product;
    private static Component quantityBasedComponent;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(
                productFamily.getId(),
                b -> b.allowFractionalQuantities(true)
        );
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnAccountBalancesWithOpenInvoices() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());

        // when
        AccountBalances accountBalances = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.readAccountBalances(subscription.getId());

        // then
        assertThat(accountBalances.getAdditionalProperties()).isEmpty();

        AccountBalance openInvoices = accountBalances.getOpenInvoices();
        assertThat(openInvoices.getAdditionalProperties()).isEmpty();
        assertThat(openInvoices)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(400L)
                        .automaticBalanceInCents(0L)
                        .remittanceBalanceInCents(0L)
                        .build()
                );

        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingDiscounts());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getServiceCredits());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPrepayments());
    }

    @Test
    void shouldReturnAccountBalancesWithPendingInvoices() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .quantity(5.4)
                .memo("Recoding component purchase")
                .build();

        // this creates an invoice in the "PENDING" status
        CLIENT.getSubscriptionComponentsController().allocateComponent(
                subscription.getId(),
                quantityBasedComponent.getId(),
                new CreateAllocationRequest(createAllocation)
        );

        // when
        AccountBalances accountBalances = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.readAccountBalances(subscription.getId());

        // then
        assertThat(accountBalances.getAdditionalProperties()).isEmpty();

        AccountBalance pendingInvoices = accountBalances.getPendingInvoices();
        assertThat(pendingInvoices.getAdditionalProperties()).isEmpty();
        assertThat(pendingInvoices)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(540L)
                        .automaticBalanceInCents(null)
                        .remittanceBalanceInCents(null)
                        .build()
                );

        assertOpenInvoicesBalancePropertiesAreZero(accountBalances.getOpenInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingDiscounts());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getServiceCredits());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPrepayments());
    }

    @Test
    void shouldReturnAccountBalancesWithServiceCredits() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CLIENT.getSubscriptionInvoiceAccountController()
                .issueServiceCredit(
                        subscription.getId(),
                        new IssueServiceCreditRequest(
                                new IssueServiceCredit(
                                        IssueServiceCreditAmount.fromString("25.0"),
                                        "John Doe signup for $25"
                                )
                        )
                );

        // when
        AccountBalances accountBalances = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.readAccountBalances(subscription.getId());

        // then
        assertThat(accountBalances.getAdditionalProperties()).isEmpty();

        AccountBalance serviceCredits = accountBalances.getServiceCredits();
        assertThat(serviceCredits.getAdditionalProperties()).isEmpty();
        assertThat(serviceCredits)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(2500L)
                        .automaticBalanceInCents(null)
                        .remittanceBalanceInCents(null)
                        .build()
                );

        assertOpenInvoicesBalancePropertiesAreZero(accountBalances.getOpenInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingDiscounts());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPrepayments());
    }

    @Test
    void shouldReturnAccountBalancesWithPrepayments() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CLIENT.getSubscriptionInvoiceAccountController()
                .createPrepayment(
                        subscription.getId(),
                        new CreatePrepaymentRequest(new CreatePrepayment.Builder()
                                .amount(100.0)
                                .details("John Doe signup for $100")
                                .memo("Signup for $100")
                                .method(CreatePrepaymentMethod.CHECK)
                                .build()
                        )
                );

        // when
        AccountBalances accountBalances = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.readAccountBalances(subscription.getId());

        // then
        assertThat(accountBalances.getAdditionalProperties()).isEmpty();

        AccountBalance prepayments = accountBalances.getPrepayments();
        assertThat(prepayments.getAdditionalProperties()).isEmpty();
        assertThat(prepayments)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(10000L)
                        .automaticBalanceInCents(null)
                        .remittanceBalanceInCents(null)
                        .build()
                );

        assertOpenInvoicesBalancePropertiesAreZero(accountBalances.getOpenInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingDiscounts());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getPendingInvoices());
        assertAccountBalancePropertiesAreZeroOrNull(accountBalances.getServiceCredits());
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .readAccountBalances(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .readAccountBalances(123)
        );
    }

    private void assertOpenInvoicesBalancePropertiesAreZero(AccountBalance accountBalance) {
        assertThat(accountBalance.getAdditionalProperties()).isEmpty();
        assertThat(accountBalance)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(0L)
                        .automaticBalanceInCents(0L)
                        .remittanceBalanceInCents(0L)
                        .build()
                );
    }

    private void assertAccountBalancePropertiesAreZeroOrNull(AccountBalance accountBalance) {
        assertThat(accountBalance.getAdditionalProperties()).isEmpty();
        assertThat(accountBalance)
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(0L)
                        .automaticBalanceInCents(null)
                        .remittanceBalanceInCents(null)
                        .build()
                );
    }
}
