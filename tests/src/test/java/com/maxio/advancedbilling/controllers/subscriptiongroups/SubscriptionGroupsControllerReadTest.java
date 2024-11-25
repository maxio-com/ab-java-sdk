package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroupInclude;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentMethod;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentRequest;
import com.maxio.advancedbilling.models.SubscriptionGroupResponse;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerReadTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER =
            CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupResponse createSubscriptionGroupResponse;
    private static Integer primarySubscriptionId;
    private static Customer customer;
    private static Product product;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
    }

    @AfterAll
    static void tearDown() throws IOException, ApiException {
        if (createSubscriptionGroupResponse != null && primarySubscriptionId != null) {
            new TestTeardown().deleteSubscriptionGroup(primarySubscriptionId,
                    createSubscriptionGroupResponse.getSubscriptionGroup().getSubscriptionIds(),
                    createSubscriptionGroupResponse.getSubscriptionGroup().getCustomerId());
            createSubscriptionGroupResponse = null;
            primarySubscriptionId = null;
        }
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadSubscriptionGroup() throws IOException, ApiException {
        // given
        Customer customer = TEST_SETUP.createCustomer();
        Subscription subscription1 = TEST_SETUP.createSubscription(customer, product);
        Subscription subscription2 = TEST_SETUP.createSubscription(customer, product);
        Component component = TEST_SETUP.createQuantityBasedComponent(product.getProductFamily().getId());

        // when
        // create group
        createSubscriptionGroupResponse = SUBSCRIPTION_GROUPS_CONTROLLER
                .createSubscriptionGroup(new CreateSubscriptionGroupRequest(new CreateSubscriptionGroup.Builder()
                        .subscriptionId(subscription1.getId())
                        .memberIds(List.of(subscription2.getId()))
                        .build()
                ));
        primarySubscriptionId = subscription1.getId();
        String groupUid = CLIENT.getSubscriptionsController().readSubscription(primarySubscriptionId, null)
                .getSubscription().getGroup().getUid();

        // setup account balances
        CLIENT.getSubscriptionGroupInvoiceAccountController().issueSubscriptionGroupServiceCredit(groupUid,
                new IssueServiceCreditRequest(
                        new IssueServiceCredit(IssueServiceCreditAmount.fromString("5"), "credit")
                ));
        CLIENT.getSubscriptionGroupInvoiceAccountController().createSubscriptionGroupPrepayment(groupUid,
                new SubscriptionGroupPrepaymentRequest(
                        new SubscriptionGroupPrepayment(3, "details", "pay", SubscriptionGroupPrepaymentMethod.CHECK)
                ));

        // make some allocation to generate billing amount
        CLIENT.getSubscriptionComponentsController().allocateComponent(subscription1.getId(), component.getId(), new CreateAllocationRequest(
                new CreateAllocation.Builder()
                        .quantity(3)
                        .build()
        ));

        // read group
        FullSubscriptionGroupResponse subscriptionGroup = SUBSCRIPTION_GROUPS_CONTROLLER.readSubscriptionGroup(groupUid, null);
        FullSubscriptionGroupResponse subscriptionGroupWithCurrentBalance = SUBSCRIPTION_GROUPS_CONTROLLER
                .readSubscriptionGroup(groupUid, Collections.singletonList(SubscriptionGroupInclude.CURRENT_BILLING_AMOUNT_IN_CENTS));

        // then
        assertThat(subscriptionGroup.getAdditionalProperties()).isEmpty();

        assertThat(subscriptionGroup.getAccountBalances().getOpenInvoices().getBalanceInCents()).isEqualTo(0);
        assertThat(subscriptionGroup.getAccountBalances().getPrepayments().getBalanceInCents()).isEqualTo(300);
        assertThat(subscriptionGroup.getAccountBalances().getPendingDiscounts().getBalanceInCents()).isEqualTo(0);
        assertThat(subscriptionGroup.getAccountBalances().getServiceCredits().getBalanceInCents()).isEqualTo(500);

        assertThat(subscriptionGroup.getCancelAtEndOfPeriod()).isFalse();
        assertThat(subscriptionGroup.getCurrentBillingAmountInCents()).isNull();

        assertThat(subscriptionGroup.getCustomerId()).isEqualTo(customer.getId());
        assertThat(subscriptionGroup.getCustomer().getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(subscriptionGroup.getCustomer().getLastName()).isEqualTo(customer.getLastName());
        assertThat(subscriptionGroup.getCustomer().getOrganization()).isEqualTo(customer.getOrganization());
        assertThat(subscriptionGroup.getCustomer().getReference()).isEqualTo(customer.getReference());

        assertThat(subscriptionGroup.getNextAssessmentAt()).isAfter(ZonedDateTime.now());
        assertThat(subscriptionGroup.getPaymentProfileId()).isNotNull();
        assertThat(subscriptionGroup.getPrimarySubscriptionId()).isEqualTo(primarySubscriptionId);
        assertThat(subscriptionGroup.getScheme()).isEqualTo(1);
        assertThat(subscriptionGroup.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(subscriptionGroup.getSubscriptionIds()).containsOnly(primarySubscriptionId, subscription2.getId());
        assertThat(subscriptionGroup.getUid()).isEqualTo(groupUid);

        assertThat(subscriptionGroupWithCurrentBalance).usingRecursiveComparison().ignoringFields("currentBillingAmountInCents")
                .isEqualTo(subscriptionGroup);
        assertThat(subscriptionGroupWithCurrentBalance.getCurrentBillingAmountInCents()).isEqualTo(300);
    }

    @Test
    void shouldNotReadGroupWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .readSubscriptionGroup("abc", null));
    }

    @Test
    void shouldReturn404ForNotExistentSubscriptionGroup() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> SUBSCRIPTION_GROUPS_CONTROLLER.readSubscriptionGroup("123", null)
        );
    }

}
