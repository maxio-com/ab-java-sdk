package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.CreditScheme;
import com.maxio.advancedbilling.models.CreditSchemeRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.InvoiceRefund;
import com.maxio.advancedbilling.models.ListCreditNotesInput;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.assertj.core.api.ThrowingConsumer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionComponentsDeletePrepaidUsageAllocationTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient ADVANCED_BILLING_CLIENT = TestClient.createClient();

    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER = ADVANCED_BILLING_CLIENT
            .getSubscriptionComponentsController();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER = ADVANCED_BILLING_CLIENT
            .getSubscriptionInvoiceAccountController();
    private static final InvoicesController INVOICES_CONTROLLER = ADVANCED_BILLING_CLIENT
            .getInvoicesController();

    private static ProductFamily productFamily;
    private static Component prepaidComponent;
    private static Allocation allocation;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        customer = TEST_SETUP.createCustomer();
        prepaidComponent = TEST_SETUP.createPrepaidComponent(productFamily, 2.0);
        subscription = TEST_SETUP.createSubscription(customer, TEST_SETUP.createProduct(productFamily));
        allocation = allocateComponent(subscription.getId(), prepaidComponent.getId());
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldDeletePrepaidUsageAllocationWithDifferentCreditSchemas")
    void shouldDeletePrepaidUsageAllocationWithDifferentCreditSchemas(CreditScheme creditScheme,
                                                                      ThrowingConsumer<Integer> assertionsConsumer) throws Exception {
        // given
        Integer subscriptionId = TEST_SETUP.createSubscription(customer, TEST_SETUP.createProduct(productFamily)).getId();
        Component prepaidComponent = TEST_SETUP.createPrepaidComponent(productFamily, 2.0);
        Allocation allocation = allocateComponent(subscriptionId, prepaidComponent.getId());

        // when
        SUBSCRIPTION_COMPONENTS_CONTROLLER.deletePrepaidUsageAllocation(
                subscriptionId,
                prepaidComponent.getId(),
                allocation.getAllocationId(),
                new CreditSchemeRequest(creditScheme)
        );

        // then
        assertionsConsumer.accept(subscriptionId);
    }

    private static Stream<Arguments> argsForShouldDeletePrepaidUsageAllocationWithDifferentCreditSchemas() {
        return Stream.of(
                Arguments.arguments(
                        CreditScheme.NONE,
                        (ThrowingConsumer<Integer>) subscriptionId -> {
                            assertListAllocationsIsEmpty(subscriptionId);
                            assertThat(getServiceCreditsBalanceInCents(subscriptionId)).isEqualTo(0L);
                            assertThat(getCreditNotesWithRefunds(subscriptionId)).isEmpty();
                        }
                ),
                Arguments.arguments(
                        CreditScheme.CREDIT,
                        (ThrowingConsumer<Integer>) subscriptionId -> {
                            assertListAllocationsIsEmpty(subscriptionId);
                            assertThat(getServiceCreditsBalanceInCents(subscriptionId)).isEqualTo(2000L);
                            assertThat(getCreditNotesWithRefunds(subscriptionId)).isEmpty();
                        }
                ),
                Arguments.arguments(
                        CreditScheme.REFUND,
                        (ThrowingConsumer<Integer>) subscriptionId -> {
                            assertListAllocationsIsEmpty(subscriptionId);
                            assertThat(getServiceCreditsBalanceInCents(subscriptionId)).isEqualTo(0L);

                            List<CreditNote> creditNotesWithRefunds = getCreditNotesWithRefunds(subscriptionId);
                            assertThat(creditNotesWithRefunds).hasSize(1);

                            List<InvoiceRefund> refunds = creditNotesWithRefunds.get(0).getRefunds();
                            assertThat(refunds)
                                    .hasSize(1)
                                    .singleElement()
                                    .satisfies(invoiceRefund -> {
                                        assertThat(invoiceRefund.getMemo()).isEqualTo("Refund for reverted prepaid usage allocation: 10 units");
                                        assertThat(invoiceRefund.getOriginalAmount()).isEqualTo("20.0");
                                        assertThat(invoiceRefund.getAppliedAmount()).isEqualTo("20.0");
                                    });
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn404ForNotExistentResources")
    void shouldReturn404ForNotExistentResources(int subscriptionId, int componentId, int allocationId) {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.deletePrepaidUsageAllocation(
                subscriptionId,
                componentId,
                allocationId,
                new CreditSchemeRequest(CreditScheme.NONE)
        ));
    }

    private static Stream<Arguments> argsForShouldReturn404ForNotExistentResources() {
        return Stream.of(
                Arguments.arguments(subscription.getId(), prepaidComponent.getId(), 123),
                Arguments.arguments(subscription.getId(), 123, allocation.getAllocationId()),
                Arguments.arguments(123, prepaidComponent.getId(), allocation.getAllocationId()),
                Arguments.arguments(111, 222, 333)
        );
    }

    @Test
    void shouldNotBulkResetWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .deletePrepaidUsageAllocation(
                        subscription.getId(),
                        prepaidComponent.getId(),
                        allocation.getAllocationId(),
                        new CreditSchemeRequest(CreditScheme.NONE)
                )
        );
    }

    private static Allocation allocateComponent(int subscriptionId, int componentId) throws ApiException, IOException {
        return SUBSCRIPTION_COMPONENTS_CONTROLLER.allocateComponent(
                subscriptionId,
                componentId,
                new CreateAllocationRequest(new CreateAllocation.Builder()
                        .quantity(10.0)
                        .memo("Recoding component allocation")
                        .build()
                )
        ).getAllocation();
    }

    private static void assertListAllocationsIsEmpty(int subscriptionId) throws IOException, ApiException {
        assertThat(SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listAllocations(subscriptionId, prepaidComponent.getId(), null)
        ).isEmpty();
    }

    private static Long getServiceCreditsBalanceInCents(int subscriptionId) throws IOException, ApiException {
        return SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.readAccountBalances(subscriptionId)
                .getServiceCredits()
                .getBalanceInCents();
    }

    private static List<CreditNote> getCreditNotesWithRefunds(int subscriptionId) throws ApiException, IOException {
        return INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .refunds(true)
                        .build()
                )
                .getCreditNotes();
    }
}
