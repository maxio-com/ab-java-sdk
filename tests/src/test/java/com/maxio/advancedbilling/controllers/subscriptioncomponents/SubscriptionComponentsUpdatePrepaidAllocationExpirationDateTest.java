package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionComponentAllocationErrorException;
import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.AllocationExpirationDate;
import com.maxio.advancedbilling.models.AllocationResponse;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponentAllocationErrorItem;
import com.maxio.advancedbilling.models.UpdateAllocationExpirationDate;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionComponentsUpdatePrepaidAllocationExpirationDateTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static Component prepaidComponent;
    private static Allocation allocation;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        customer = TEST_SETUP.createCustomer();
        prepaidComponent = TEST_SETUP.createPrepaidComponent(productFamily, customizer -> customizer
                .rolloverPrepaidRemainder(true)
                .expirationIntervalUnit(IntervalUnit.DAY)
                .expirationInterval(10.0)
        );
        subscription = TEST_SETUP.createSubscription(customer, TEST_SETUP.createProduct(productFamily));
        allocation = SUBSCRIPTION_COMPONENTS_CONTROLLER.allocateComponent(
                subscription.getId(),
                prepaidComponent.getId(),
                new CreateAllocationRequest(new CreateAllocation.Builder()
                        .quantity(10.0)
                        .memo("Recoding component allocation")
                        .build()
                )
        ).getAllocation();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldUpdatePrepaidUsageAllocationExpirationDate() throws IOException, ApiException {
        // given
        ZonedDateTime updatedExpiresAt = ZonedDateTime.now().plusMonths(2);

        // when
        SUBSCRIPTION_COMPONENTS_CONTROLLER.updatePrepaidUsageAllocationExpirationDate(
                subscription.getId(),
                prepaidComponent.getId(),
                allocation.getAllocationId(),
                // changing from 10 days to 2 months
                new UpdateAllocationExpirationDate(new AllocationExpirationDate(updatedExpiresAt))
        );

        // then
        assertThat(SUBSCRIPTION_COMPONENTS_CONTROLLER.listAllocations(
                subscription.getId(), prepaidComponent.getId(), null)
        )
                .hasSize(1)
                .singleElement()
                .extracting(AllocationResponse::getAllocation)
                .extracting(Allocation::getExpiresAt)
                .satisfies(actualExpiration -> assertThat(actualExpiration.toInstant())
                        .isEqualTo(updatedExpiresAt.toInstant().truncatedTo(ChronoUnit.SECONDS))
                );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn404ForNotExistentResources")
    void shouldReturn404ForNotExistentResources(int subscriptionId, int componentId, int allocationId) {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.updatePrepaidUsageAllocationExpirationDate(
                subscriptionId,
                componentId,
                allocationId,
                new UpdateAllocationExpirationDate(new AllocationExpirationDate(ZonedDateTime.now().plusDays(5)))
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

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(UpdateAllocationExpirationDate request,
                                                   SubscriptionComponentAllocationErrorItem... expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                SubscriptionComponentAllocationErrorException.class,
                () -> SUBSCRIPTION_COMPONENTS_CONTROLLER.updatePrepaidUsageAllocationExpirationDate(
                        subscription.getId(),
                        prepaidComponent.getId(),
                        allocation.getAllocationId(),
                        request
                ),
                e -> assertThat(e.getErrors())
                        .usingRecursiveFieldByFieldElementComparator()
                        .containsExactlyInAnyOrder(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() {
        return Stream.of(
                Arguments.arguments(
                        // request body
                        new UpdateAllocationExpirationDate(),
                        // expected errors
                        new SubscriptionComponentAllocationErrorItem[]{
                                new SubscriptionComponentAllocationErrorItem.Builder()
                                        .kind("base")
                                        .message("A valid expires_at date must be provided.")
                                        .build()
                        }
                ),
                Arguments.arguments(
                        // request body
                        new UpdateAllocationExpirationDate(
                                new AllocationExpirationDate()
                        ),
                        // expected errors
                        new SubscriptionComponentAllocationErrorItem[]{
                                new SubscriptionComponentAllocationErrorItem.Builder()
                                        .kind("base")
                                        .message("A valid expires_at date must be provided.")
                                        .build()
                        }
                ),
                Arguments.arguments(
                        // request body
                        new UpdateAllocationExpirationDate(
                                new AllocationExpirationDate(ZonedDateTime.now().minusMonths(1))
                        ),
                        // expected errors
                        new SubscriptionComponentAllocationErrorItem[]{
                                new SubscriptionComponentAllocationErrorItem.Builder()
                                        .kind("base")
                                        .message("Expires at: must be greater than or equal to %s".formatted(ZonedDateTime.now().toLocalDate()))
                                        .build()
                        }
                )
        );
    }

    @Test
    void shouldNotBulkResetWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .updatePrepaidUsageAllocationExpirationDate(
                        subscription.getId(),
                        prepaidComponent.getId(),
                        allocation.getAllocationId(),
                        new UpdateAllocationExpirationDate()
                )
        );
    }
}
