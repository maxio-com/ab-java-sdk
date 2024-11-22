package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.DeleteSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerDeleteTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER =
            CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupSignupResponse groupSignup;
    private static Product product;
    private static Component meteredComponent;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
    }

    @AfterEach
    void cleanupSubscriptionGroup() throws IOException, ApiException {
        if (groupSignup != null) {
            new TestTeardown().deleteSubscriptionGroup(groupSignup);
            groupSignup = null;
        }
    }

    @Test
    void shouldDeleteSubscriptionGroup() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);
        List<Integer> secondarySubscriptionIds = new ArrayList<>(groupSignup.getSubscriptionIds());
        secondarySubscriptionIds.remove(groupSignup.getPrimarySubscriptionId());

        for (Integer secondarySubscriptionId : secondarySubscriptionIds) {
            SUBSCRIPTION_GROUPS_CONTROLLER.removeSubscriptionFromGroup(secondarySubscriptionId);
        }

        assertThat(SUBSCRIPTION_GROUPS_CONTROLLER.readSubscriptionGroup(groupSignup.getUid(), List.of())).isNotNull();

        // when
        DeleteSubscriptionGroupResponse deleteSubscriptionGroupResponse = SUBSCRIPTION_GROUPS_CONTROLLER.deleteSubscriptionGroup(groupSignup.getUid());

        // then
        assertThat(deleteSubscriptionGroupResponse.getUid()).isEqualTo(groupSignup.getUid());
        assertThat(deleteSubscriptionGroupResponse.getDeleted()).isTrue();

        assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.readSubscriptionGroup(groupSignup.getUid(), List.of()));
    }

    // TODO add test with error when group is not empty

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.deleteSubscriptionGroup("non_existent"));
    }

    @Test
    void shouldNotUpdateGroupWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .deleteSubscriptionGroup(groupSignup.getUid()));
    }
}
