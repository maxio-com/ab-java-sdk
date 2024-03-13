package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionGroupCreateErrorResponseException;
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroup;
import com.maxio.advancedbilling.models.SubscriptionGroupMembersArrayError;
import com.maxio.advancedbilling.models.SubscriptionGroupResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupSingleError;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.SubscriptionGroupCreateErrorResponseErrorsGetter;
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

import static com.maxio.advancedbilling.models.CollectionMethod.AUTOMATIC;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerCreateTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER =
            CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupResponse createSubscriptionGroupResponse;
    private static Integer primarySubscriptionId;
    private static Customer customer;
    private static Product product;
    private static Subscription otherSubscription;


    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        otherSubscription = TEST_SETUP.createSubscription(customer, product);
    }


    @AfterAll
    static void teardown() throws IOException, ApiException {
        if (createSubscriptionGroupResponse != null && primarySubscriptionId != null) {
            new TestTeardown().deleteSubscriptionGroup(primarySubscriptionId,
                    createSubscriptionGroupResponse.getSubscriptionGroup().getSubscriptionIds(),
                    customer.getId());
            createSubscriptionGroupResponse = null;
            primarySubscriptionId = null;
        }
    }

    @Test
    void shouldCreateSubscriptionGroup() throws IOException, ApiException {
        // given
        Customer customer = TEST_SETUP.createCustomer();
        Subscription subscription1 = TEST_SETUP.createSubscription(customer, product);
        Subscription subscription2 = TEST_SETUP.createSubscription(customer, product);

        // when
        createSubscriptionGroupResponse = SUBSCRIPTION_GROUPS_CONTROLLER
                .createSubscriptionGroup(new CreateSubscriptionGroupRequest(new CreateSubscriptionGroup.Builder()
                        .subscriptionId(subscription1.getId())
                        .memberIds(List.of(subscription2.getId()))
                        .build()
                ));
        primarySubscriptionId = subscription1.getId();

        // then
        SubscriptionGroup subscriptionGroup = createSubscriptionGroupResponse.getSubscriptionGroup();
        assertThat(subscriptionGroup.getAdditionalProperties()).isEmpty();
        assertThat(subscriptionGroup.getCustomerId()).isEqualTo(customer.getId());
        assertThat(subscriptionGroup.getCreatedAt()).isNotNull();
        assertThat(subscriptionGroup.getPaymentCollectionMethod()).isEqualTo(AUTOMATIC);
        assertThat(subscriptionGroup.getSubscriptionIds()).containsOnly(subscription1.getId(), subscription2.getId());

        assertThat(subscriptionGroup.getPaymentProfile().getAdditionalProperties()).isEmpty();
        assertThat(subscriptionGroup.getPaymentProfile().getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(subscriptionGroup.getPaymentProfile().getLastName()).isEqualTo(customer.getLastName());
        assertThat(subscriptionGroup.getPaymentProfile().getMaskedCardNumber()).isEqualTo("XXXX-XXXX-XXXX-1111");
        assertThat(subscriptionGroup.getPaymentProfile().getId()).isNotNull();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenCreatingGroupWithInvalidData")
    void shouldReturn422WhenCreatingGroupWithInvalidData(CreateSubscriptionGroupRequest request,
                                                         ThrowingConsumer<SubscriptionGroupCreateErrorResponseException>
                                                                 assertionsConsumer) {
        assertUnprocessableEntity(
                SubscriptionGroupCreateErrorResponseException.class,
                () -> SUBSCRIPTION_GROUPS_CONTROLLER.createSubscriptionGroup(request),
                assertionsConsumer::accept
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenCreatingGroupWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        new CreateSubscriptionGroupRequest(
                                null
                        ),
                        (ThrowingConsumer<SubscriptionGroupCreateErrorResponseException>) error ->
                            assertThat(error.getErrors()
                                    .match(new SubscriptionGroupCreateErrorResponseErrorsGetter<SubscriptionGroupSingleError>())
                                    .getSubscriptionGroup())
                                    .isEqualTo("can't be blank")
                ),
                Arguments.of(
                        new CreateSubscriptionGroupRequest(
                                new CreateSubscriptionGroup.Builder()
                                        .subscriptionId(otherSubscription.getId())
                                        .memberIds(List.of(123))
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupCreateErrorResponseException>) error ->
                                assertThat(error.getErrors()
                                        .match(new SubscriptionGroupCreateErrorResponseErrorsGetter<SubscriptionGroupMembersArrayError>())
                                        .getMembers())
                                        .containsOnly("not_found")
                ),
                Arguments.of(
                        new CreateSubscriptionGroupRequest(
                                new CreateSubscriptionGroup.Builder()
                                        .subscriptionId((123))
                                        .memberIds(List.of())
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupCreateErrorResponseException>) error ->
                                assertThat(error.getErrors()
                                        .match(new SubscriptionGroupCreateErrorResponseErrorsGetter<String>()))
                                        .startsWith("Couldn't find Subscription with 'id'=123")
                )
        );
    }

    @Test
    void shouldNotCreateGroupWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .createSubscriptionGroup(null));
    }

}
