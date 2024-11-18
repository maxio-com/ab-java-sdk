package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroup;
import com.maxio.advancedbilling.models.SubscriptionGroupPaymentProfile;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.models.UpdateSubscriptionGroup;
import com.maxio.advancedbilling.models.UpdateSubscriptionGroupRequest;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.PaymentProfileResponsePaymentProfileGetter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertSubscriptionGroupUpdateErrors;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerUpdateTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER = CLIENT.getSubscriptionGroupsController();
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
    void shouldRemoveSecondarySubscriptionsFromGroupGivenEmptyList() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        UpdateSubscriptionGroupRequest emptyRequest = updateGroupRequest();
        CreditCardPaymentProfile paymentProfile = CLIENT.getPaymentProfilesController()
                .readPaymentProfile(groupSignup.getPaymentProfileId())
                .getPaymentProfile()
                .match((new PaymentProfileResponsePaymentProfileGetter<>()));

        // when
        SubscriptionGroup response = SUBSCRIPTION_GROUPS_CONTROLLER.updateSubscriptionGroupMembers(groupSignup.getUid(), emptyRequest).getSubscriptionGroup();

        // then
        assertThat(response.getSubscriptionIds())
                .hasSize(1)
                .containsExactly(groupSignup.getPrimarySubscriptionId());

        assertThat(response.getCustomerId()).isEqualTo(groupSignup.getCustomerId());
        assertThat(response.getPaymentCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(response.getCreatedAt())
                .isNotNull()
                .isBefore(ZonedDateTime.now());

        SubscriptionGroupPaymentProfile responsePaymentProfile = response.getPaymentProfile();
        assertThat(responsePaymentProfile.getId()).isEqualTo(paymentProfile.getId());
        assertThat(responsePaymentProfile.getFirstName()).isEqualTo(paymentProfile.getFirstName());
        assertThat(responsePaymentProfile.getLastName()).isEqualTo(paymentProfile.getLastName());
        assertThat(responsePaymentProfile.getMaskedCardNumber()).isEqualTo(paymentProfile.getMaskedCardNumber());
    }

    @Test
    void shouldUpdateMembers() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        CreditCardPaymentProfile paymentProfile = CLIENT.getPaymentProfilesController().readPaymentProfile(groupSignup.getPaymentProfileId())
                .getPaymentProfile()
                .match((new PaymentProfileResponsePaymentProfileGetter<>()));
        Customer customer = CLIENT.getCustomersController().readCustomer(groupSignup.getCustomerId()).getCustomer();
        Subscription newSubscription = new TestSetup().createSubscription(customer, product);

        // when
        SubscriptionGroup response = SUBSCRIPTION_GROUPS_CONTROLLER.updateSubscriptionGroupMembers(groupSignup.getUid(),
                        updateGroupRequest(newSubscription.getId()))
                .getSubscriptionGroup();

        // then
        assertThat(response.getSubscriptionIds())
                .hasSize(2)
                .containsOnly(groupSignup.getPrimarySubscriptionId(), newSubscription.getId());

        assertThat(response.getCustomerId()).isEqualTo(groupSignup.getCustomerId());
        assertThat(response.getPaymentCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(response.getCreatedAt())
                .isNotNull()
                .isBefore(ZonedDateTime.now());

        SubscriptionGroupPaymentProfile responsePaymentProfile = response.getPaymentProfile();
        assertThat(responsePaymentProfile.getId()).isEqualTo(paymentProfile.getId());
        assertThat(responsePaymentProfile.getFirstName()).isEqualTo(paymentProfile.getFirstName());
        assertThat(responsePaymentProfile.getLastName()).isEqualTo(paymentProfile.getLastName());
        assertThat(responsePaymentProfile.getMaskedCardNumber()).isEqualTo(paymentProfile.getMaskedCardNumber());
    }

    @Test
    void shouldReturn404IfMemberDoesNotExist() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        // when - then
        assertSubscriptionGroupUpdateErrors(() -> SUBSCRIPTION_GROUPS_CONTROLLER
                .updateSubscriptionGroupMembers(groupSignup.getUid(), updateGroupRequest(1)))
                .hasErrorCode(422)
                .hasMemberErrors(List.of("not_found"));
    }

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_GROUPS_CONTROLLER.updateSubscriptionGroupMembers("non_existent", updateGroupRequest()));
    }

    @Test
    void shouldNotUpdateGroupWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        groupSignup = new TestSetup().signupWithSubscriptionGroup(product, meteredComponent);

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .updateSubscriptionGroupMembers(groupSignup.getUid(), updateGroupRequest()));
    }

    private UpdateSubscriptionGroupRequest updateGroupRequest(Integer... subscriptionIds) {
        return new UpdateSubscriptionGroupRequest.Builder()
                .subscriptionGroup(new UpdateSubscriptionGroup.Builder()
                        .memberIds(asList(subscriptionIds))
                        .build())
                .build();
    }
}
