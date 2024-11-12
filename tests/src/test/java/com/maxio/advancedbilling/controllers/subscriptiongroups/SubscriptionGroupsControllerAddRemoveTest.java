package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AddSubscriptionToAGroup;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.GroupSettings;
import com.maxio.advancedbilling.models.GroupTarget;
import com.maxio.advancedbilling.models.GroupTargetType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroup;
import com.maxio.advancedbilling.models.SubscriptionGroupPaymentProfile;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.PaymentProfileResponsePaymentProfileGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerAddRemoveTest {

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

    private Integer getSecondarySubscriptionId(SubscriptionGroupSignupResponse signupResponse) {
        ArrayList<Integer> subscriptionIds = new ArrayList<>(signupResponse.getSubscriptionIds());
        subscriptionIds.remove(signupResponse.getPrimarySubscriptionId());
        return subscriptionIds.get(0);
    }

    @Nested
    public class Add {

        @Test
        void shouldAddSecondarySubscriptionToGroup() throws IOException, ApiException {
            // given
            groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);
            Customer groupCustomer = CLIENT.getCustomersController().readCustomer(groupSignup.getCustomerId()).getCustomer();
            assertThat(groupSignup.getSubscriptionIds())
                    .hasSize(2);
            Subscription newSubscription = new TestSetup().createSubscription(groupCustomer, product);
            CreditCardPaymentProfile signupPP = CLIENT.getPaymentProfilesController()
                    .readPaymentProfile(groupSignup.getPaymentProfileId())
                    .getPaymentProfile()
                    .match((new PaymentProfileResponsePaymentProfileGetter<>()));

            // when
            SubscriptionGroup response = SUBSCRIPTION_GROUPS_CONTROLLER.addSubscriptionToGroup(newSubscription.getId(), new AddSubscriptionToAGroup(
                    new GroupSettings.Builder()
                            .target(new GroupTarget(GroupTargetType.SUBSCRIPTION, groupSignup.getPrimarySubscriptionId()))
                            .build()
            )).getSubscriptionGroup();

            // then
            FullSubscriptionGroupResponse subscriptionGroup = SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup(groupSignup.getPrimarySubscriptionId().toString());
            List<Integer> expectedIds = new ArrayList<>(groupSignup.getSubscriptionIds());
            expectedIds.add(newSubscription.getId());
            assertThat(subscriptionGroup.getSubscriptionIds())
                    .hasSize(3)
                    .containsExactlyInAnyOrderElementsOf(expectedIds);

            assertThat(response.getCustomerId()).isEqualTo(groupCustomer.getId());
            assertThat(response.getPaymentCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
            assertThat(response.getCreatedAt()).isNotNull()
                    .isBefore(ZonedDateTime.now());
            assertThat(response.getSubscriptionIds())
                    .hasSize(3)
                    .containsExactlyInAnyOrderElementsOf(expectedIds);

            SubscriptionGroupPaymentProfile paymentProfile = response.getPaymentProfile();
            assertThat(paymentProfile.getId()).isEqualTo(signupPP.getId());
            assertThat(paymentProfile.getFirstName()).isEqualTo(signupPP.getFirstName());
            assertThat(paymentProfile.getLastName()).isEqualTo(signupPP.getLastName());
            assertThat(paymentProfile.getMaskedCardNumber()).isEqualTo(signupPP.getMaskedCardNumber());
        }

        @Test
        void shouldReturn404IfSubscriptionNotFound() {
            // when - then
            assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.addSubscriptionToGroup(1,
                    new AddSubscriptionToAGroup(
                            new GroupSettings(
                                    new GroupTarget(GroupTargetType.SUBSCRIPTION, 1), null
                            )
                    )
            ));
        }

        @Test
        void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
            // given
            Subscription newSubscription = new TestSetup().createSubscription(customer, product);

            // when - then
            assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                    .addSubscriptionToGroup(1, new AddSubscriptionToAGroup(
                            new GroupSettings(
                                    new GroupTarget(GroupTargetType.SUBSCRIPTION, newSubscription.getId()), null
                            ))
                    ));
        }
    }

    @Nested
    public class Remove {

        @Test
        void shouldRemoveSecondarySubscriptionFromGroup() throws IOException, ApiException {
            // given
            groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);
            Integer secondarySubscriptionId = getSecondarySubscriptionId(groupSignup);
            assertThat(groupSignup.getSubscriptionIds())
                    .hasSize(2);

            // when
            SUBSCRIPTION_GROUPS_CONTROLLER.removeSubscriptionFromGroup(secondarySubscriptionId);

            // then
            FullSubscriptionGroupResponse subscriptionGroup = SUBSCRIPTION_GROUPS_CONTROLLER.findSubscriptionGroup(groupSignup.getPrimarySubscriptionId().toString());
            assertThat(subscriptionGroup.getSubscriptionIds())
                    .hasSize(1)
                    .containsOnly(groupSignup.getPrimarySubscriptionId());
        }

        @Test
        void shouldReturn422ForPrimarySubscription() throws IOException, ApiException {
            // given
            groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

            // when - then
            assertThatErrorListResponse(() -> SUBSCRIPTION_GROUPS_CONTROLLER
                    .removeSubscriptionFromGroup(groupSignup.getPrimarySubscriptionId()))
                    .hasErrors("You can not remove primary subscription when there are others in group")
                    .hasErrorCode(422)
                    .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[You can not remove primary subscription when there are others in group]}'.");
        }

        @Test
        void shouldReturn404IfSubscriptionNotInGroup() throws IOException, ApiException {
            // given
            Subscription subscription = new TestSetup().createSubscription(customer, product);

            // when - then
            assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.removeSubscriptionFromGroup(subscription.getId()));
        }

        @Test
        void shouldReturn404IfSubscriptionDoesNotExist() {
            // when - then
            assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.removeSubscriptionFromGroup(1));
        }

        @Test
        void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
            // given
            groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);
            Integer secondarySubscriptionId = getSecondarySubscriptionId(groupSignup);

            // when - then
            assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                    .removeSubscriptionFromGroup(secondarySubscriptionId));
        }
    }

}
