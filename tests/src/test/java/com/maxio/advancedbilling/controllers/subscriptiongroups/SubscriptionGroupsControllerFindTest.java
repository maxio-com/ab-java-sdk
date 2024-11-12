package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AccountBalance;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroupBalances;
import com.maxio.advancedbilling.models.SubscriptionGroupCustomer;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerFindTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER = CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupSignupResponse groupSignup;
    private static Product product;
    private static Component meteredComponent;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        customer = new TestSetup().createCustomer();
    }

    @AfterAll
    static void deleteCustomer() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @AfterEach
    void cleanupSubscriptionGroup() throws IOException, ApiException {
        if (groupSignup != null) {
            new TestTeardown().deleteSubscriptionGroup(groupSignup);
            groupSignup = null;
        }
    }

    @Test
    void shouldFindSubscriptionGroup() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);
        Integer primarySubscriptionId = groupSignup.getPrimarySubscriptionId();
        List<Integer> secondarySubscriptionIds = new ArrayList<>(groupSignup.getSubscriptionIds());
        Integer secondarySubscriptionId = secondarySubscriptionIds.get(0);
        Customer groupCustomer = CLIENT.getCustomersController().readCustomer(groupSignup.getCustomerId()).getCustomer();

        // when
        FullSubscriptionGroupResponse result1 = SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup(primarySubscriptionId.toString());
        FullSubscriptionGroupResponse result2 = SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup(secondarySubscriptionId.toString());

        assertThat(result1)
                .usingRecursiveComparison()
                .isEqualTo(result2);

        assertThat(result1.getUid()).isEqualTo(groupSignup.getUid());
        assertThat(result1.getScheme()).isEqualTo(1);
        assertThat(result1.getCustomerId()).isEqualTo(groupSignup.getCustomerId());
        assertThat(result1.getPaymentProfileId()).isEqualTo(groupSignup.getPaymentProfileId());
        assertThat(result1.getSubscriptionIds()).containsExactlyInAnyOrderElementsOf(groupSignup.getSubscriptionIds());
        assertThat(result1.getPrimarySubscriptionId()).isEqualTo(groupSignup.getPrimarySubscriptionId());
        assertThat(result1.getNextAssessmentAt()).isEqualTo(groupSignup.getNextAssessmentAt());
        assertThat(result1.getState()).isEqualTo(groupSignup.getState());
        assertThat(result1.getCancelAtEndOfPeriod()).isEqualTo(groupSignup.getCancelAtEndOfPeriod());
        assertThat(result1.getCurrentBillingAmountInCents()).isNull();

        SubscriptionGroupCustomer customerResponse = result1.getCustomer();
        assertThat(customerResponse.getFirstName()).isEqualTo(groupCustomer.getFirstName());
        assertThat(customerResponse.getLastName()).isEqualTo(groupCustomer.getLastName());
        assertThat(customerResponse.getReference()).isEqualTo(groupCustomer.getReference());
        assertThat(customerResponse.getEmail()).isEqualTo(groupCustomer.getEmail());
        assertThat(customerResponse.getOrganization()).isEqualTo(groupCustomer.getOrganization());

        SubscriptionGroupBalances accountBalances = result1.getAccountBalances();
        assertEmptyBalance(accountBalances.getOpenInvoices());
        assertEmptyBalance(accountBalances.getPrepayments());
        assertEmptyBalance(accountBalances.getPendingDiscounts());
        assertEmptyBalance(accountBalances.getServiceCredits());
    }

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup("1"));
    }

    @Test
    void shouldReturn404IfSubscriptionNotInGroup() throws IOException, ApiException {
        // given
        Subscription subscription = new TestSetup().createSubscription(customer, product);

        // when - then
        assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup(subscription.getId().toString()));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .findSubscriptionGroup(groupSignup.getPrimarySubscriptionId().toString()));
    }

    void assertEmptyBalance(AccountBalance balance) {
        assertThat(balance.getBalanceInCents()).isEqualTo(0);
        assertThat(balance.getAutomaticBalanceInCents()).isNull();
        assertThat(balance.getRemittanceBalanceInCents()).isNull();
    }
}
