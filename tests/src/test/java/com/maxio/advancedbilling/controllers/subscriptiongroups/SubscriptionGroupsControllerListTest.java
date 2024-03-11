package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.GroupType;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsInput;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsItem;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsResponse;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentMethod;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentRequest;
import com.maxio.advancedbilling.models.SubscriptionGroupResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupsListInclude;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerListTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER =
            CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupResponse createSubscriptionGroupResponse1;
    private static Integer primarySubscriptionId1;
    private static SubscriptionGroupResponse createSubscriptionGroupResponse2;
    private static Integer primarySubscriptionId2;
    private static Product product;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        new TestTeardown().deleteAllSubscriptionGroups();

        Customer customer1 = TEST_SETUP.createCustomer();
        Customer customer2 = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());

        Subscription customer1Subscription1 = TEST_SETUP.createSubscription(customer1, product);
        Subscription customer1Subscription2 = TEST_SETUP.createSubscription(customer1, product);
        Subscription customer2Subscription1 = TEST_SETUP.createSubscription(customer2, product);
        Subscription customer2Subscription2 = TEST_SETUP.createSubscription(customer2, product);

        createSubscriptionGroupResponse1 = SUBSCRIPTION_GROUPS_CONTROLLER
                .createSubscriptionGroup(new CreateSubscriptionGroupRequest(new CreateSubscriptionGroup.Builder()
                        .subscriptionId(customer1Subscription1.getId())
                        .memberIds(List.of(customer1Subscription2.getId()))
                        .build()
                ));
        primarySubscriptionId1 = customer1Subscription1.getId();

        createSubscriptionGroupResponse2 = SUBSCRIPTION_GROUPS_CONTROLLER
                .createSubscriptionGroup(new CreateSubscriptionGroupRequest(new CreateSubscriptionGroup.Builder()
                        .subscriptionId(customer2Subscription1.getId())
                        .memberIds(List.of(customer2Subscription2.getId()))
                        .build()
                ));
        primarySubscriptionId2 = customer2Subscription1.getId();

        // setup account balances
        String groupUid = CLIENT.getSubscriptionsController().readSubscription(primarySubscriptionId1, null)
                        .getSubscription().getGroup().match(g -> g).getUid();
        CLIENT.getSubscriptionGroupInvoiceAccountController().issueSubscriptionGroupServiceCredit(groupUid,
                new IssueServiceCreditRequest(
                        new IssueServiceCredit(IssueServiceCreditAmount.fromString("5"), "credit")
                ));
        CLIENT.getSubscriptionGroupInvoiceAccountController().createSubscriptionGroupPrepayment(groupUid,
                new SubscriptionGroupPrepaymentRequest(
                        new SubscriptionGroupPrepayment(3, "details", "pay", SubscriptionGroupPrepaymentMethod.CHECK)
                ));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        if (createSubscriptionGroupResponse1 != null && primarySubscriptionId1 != null) {
            new TestTeardown().deleteSubscriptionGroup(primarySubscriptionId1,
                    createSubscriptionGroupResponse1.getSubscriptionGroup().getSubscriptionIds(),
                    createSubscriptionGroupResponse1.getSubscriptionGroup().getCustomerId());
            createSubscriptionGroupResponse1 = null;
            primarySubscriptionId1 = null;
        }
        if (createSubscriptionGroupResponse2 != null && primarySubscriptionId2 != null) {
            new TestTeardown().deleteSubscriptionGroup(primarySubscriptionId2,
                    createSubscriptionGroupResponse2.getSubscriptionGroup().getSubscriptionIds(),
                    createSubscriptionGroupResponse2.getSubscriptionGroup().getCustomerId());
            createSubscriptionGroupResponse2 = null;
            primarySubscriptionId2 = null;
        }
    }

    @Test
    void shouldListSubscriptionGroups() throws IOException, ApiException {
        // given - when
        ListSubscriptionGroupsResponse listSubscriptionGroups = SUBSCRIPTION_GROUPS_CONTROLLER.listSubscriptionGroups(
                new ListSubscriptionGroupsInput()
        );

        // then
        assertThat(listSubscriptionGroups.getAdditionalProperties()).isEmpty();
        assertThat(listSubscriptionGroups.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(listSubscriptionGroups.getMeta().getTotalCount()).isEqualTo(2);

        assertThat(listSubscriptionGroups.getSubscriptionGroups()).hasSize(2);

        ListSubscriptionGroupsItem group1 = listSubscriptionGroups.getSubscriptionGroups().get(0);
        assertThat(group1.getAccountBalances()).isNull();
        assertThat(group1.getCancelAtEndOfPeriod()).isFalse();
        assertThat(group1.getCustomerId()).isEqualTo(createSubscriptionGroupResponse1.getSubscriptionGroup().getCustomerId());
        assertThat(group1.getNextAssessmentAt()).isAfter(ZonedDateTime.now());
        assertThat(group1.getPaymentProfileId()).isNotNull();
        assertThat(group1.getPrimarySubscriptionId()).isEqualTo(primarySubscriptionId1);
        assertThat(group1.getScheme()).isEqualTo(1);
        assertThat(group1.getState()).isEqualTo("active");
        assertThat(group1.getGroupType()).isEqualTo(GroupType.SINGLE_CUSTOMER);
        assertThat(group1.getSubscriptionIds())
                .containsExactlyInAnyOrderElementsOf(createSubscriptionGroupResponse1.getSubscriptionGroup().getSubscriptionIds());
        assertThat(group1.getUid()).isNotNull();

        ListSubscriptionGroupsItem group2 = listSubscriptionGroups.getSubscriptionGroups().get(1);
        assertThat(group2.getAccountBalances()).isNull();
        assertThat(group2.getCancelAtEndOfPeriod()).isFalse();
        assertThat(group2.getCustomerId()).isEqualTo(createSubscriptionGroupResponse2.getSubscriptionGroup().getCustomerId());
        assertThat(group2.getNextAssessmentAt()).isAfter(ZonedDateTime.now());
        assertThat(group2.getPaymentProfileId()).isNotNull();
        assertThat(group2.getPrimarySubscriptionId()).isEqualTo(primarySubscriptionId2);
        assertThat(group2.getScheme()).isEqualTo(1);
        assertThat(group2.getState()).isEqualTo("active");
        assertThat(group2.getGroupType()).isEqualTo(GroupType.SINGLE_CUSTOMER);
        assertThat(group2.getSubscriptionIds())
                .containsExactlyInAnyOrderElementsOf(createSubscriptionGroupResponse2.getSubscriptionGroup().getSubscriptionIds());
        assertThat(group2.getUid()).isNotNull();
    }

    @Test
    void shouldListSubscriptionGroupsWithAccountBalances() throws IOException, ApiException {
        // given - when
        ListSubscriptionGroupsResponse listSubscriptionGroups = SUBSCRIPTION_GROUPS_CONTROLLER.listSubscriptionGroups(
                new ListSubscriptionGroupsInput.Builder()
                        .include(Collections.singletonList(SubscriptionGroupsListInclude.ACCOUNT_BALANCES))
                        .build()
        );

        // then
        ListSubscriptionGroupsItem group1 = listSubscriptionGroups.getSubscriptionGroups().get(0);
        ListSubscriptionGroupsItem group2 = listSubscriptionGroups.getSubscriptionGroups().get(1);

        assertThat(group1.getAccountBalances().getServiceCredits().getBalanceInCents()).isEqualTo(500);
        assertThat(group1.getAccountBalances().getPrepayments().getBalanceInCents()).isEqualTo(300);
        assertThat(group1.getAccountBalances().getPendingDiscounts().getBalanceInCents()).isEqualTo(0);
        assertThat(group1.getAccountBalances().getOpenInvoices().getBalanceInCents()).isEqualTo(0);

        assertThat(group2.getAccountBalances().getServiceCredits().getBalanceInCents()).isEqualTo(0);
        assertThat(group2.getAccountBalances().getPrepayments().getBalanceInCents()).isEqualTo(0);
        assertThat(group2.getAccountBalances().getPendingDiscounts().getBalanceInCents()).isEqualTo(0);
        assertThat(group2.getAccountBalances().getOpenInvoices().getBalanceInCents()).isEqualTo(0);
    }

    @Test
    void shouldListSubscriptionGroupsWithPaging() throws IOException, ApiException {
        // given - when
        ListSubscriptionGroupsResponse listSubscriptionGroups1 = SUBSCRIPTION_GROUPS_CONTROLLER.listSubscriptionGroups(
                new ListSubscriptionGroupsInput.Builder()
                        .page(1)
                        .perPage(1)
                        .build()
        );
        ListSubscriptionGroupsResponse listSubscriptionGroups2 = SUBSCRIPTION_GROUPS_CONTROLLER.listSubscriptionGroups(
                new ListSubscriptionGroupsInput.Builder()
                        .page(2)
                        .perPage(1)
                        .build()
        );
        ListSubscriptionGroupsResponse listSubscriptionGroups3 = SUBSCRIPTION_GROUPS_CONTROLLER.listSubscriptionGroups(
                new ListSubscriptionGroupsInput.Builder()
                        .page(3)
                        .perPage(1)
                        .build()
        );

        // then
        assertThat(listSubscriptionGroups1.getSubscriptionGroups()).hasSize(1);
        assertThat(listSubscriptionGroups2.getSubscriptionGroups()).hasSize(1);
        assertThat(listSubscriptionGroups3.getSubscriptionGroups()).isEmpty();

        assertThat(listSubscriptionGroups1.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(listSubscriptionGroups1.getMeta().getTotalCount()).isEqualTo(2);
        assertThat(listSubscriptionGroups2.getMeta().getCurrentPage()).isEqualTo(2);
        assertThat(listSubscriptionGroups2.getMeta().getTotalCount()).isEqualTo(2);
        assertThat(listSubscriptionGroups3.getMeta().getCurrentPage()).isEqualTo(3);
        assertThat(listSubscriptionGroups3.getMeta().getTotalCount()).isEqualTo(2);
    }

    @Test
    void shouldNotListGroupsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .listSubscriptionGroups(new ListSubscriptionGroupsInput()));
    }

}
