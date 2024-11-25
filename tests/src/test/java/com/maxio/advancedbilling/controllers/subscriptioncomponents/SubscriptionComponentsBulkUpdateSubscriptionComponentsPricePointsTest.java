package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ComponentPricePointErrorException;
import com.maxio.advancedbilling.models.BulkComponentsPricePointAssignment;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointAssignment;
import com.maxio.advancedbilling.models.ComponentPricePointErrorItem;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
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

class SubscriptionComponentsBulkUpdateSubscriptionComponentsPricePointsTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClientProvider.getClient().getSubscriptionComponentsController();

    private static Component meteredComponent;
    private static Component quantityBasedComponent;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 1.0);
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, TEST_SETUP.createProduct(productFamily));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldBulkUpdateSubscriptionComponentsPricePoints() throws IOException, ApiException {
        // given
        ComponentPricePoint perUnitPricePoint = TEST_SETUP.createPricePointForComponent(meteredComponent.getId(), 12.5);
        ComponentPricePoint volumePricePoint = TEST_SETUP.createComponentPricePoint(quantityBasedComponent.getId());

        // when
        List<ComponentPricePointAssignment> components = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .bulkUpdateSubscriptionComponentsPricePoints(
                        subscription.getId(),
                        new BulkComponentsPricePointAssignment(List.of(
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(meteredComponent.getId())
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromNumber(perUnitPricePoint.getId()))
                                        .build(),
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(quantityBasedComponent.getId())
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(volumePricePoint.getHandle()))
                                        .build()
                        ))
                )
                .getComponents();

        // then
        assertThat(components)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("additionalProperties")
                .containsExactlyInAnyOrder(
                        new ComponentPricePointAssignment.Builder()
                                .componentId(meteredComponent.getId())
                                .pricePoint(ComponentPricePointAssignmentPricePoint.fromNumber(perUnitPricePoint.getId()))
                                .build(),
                        new ComponentPricePointAssignment.Builder()
                                .componentId(quantityBasedComponent.getId())
                                .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(volumePricePoint.getHandle()))
                                .build()
                );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(BulkComponentsPricePointAssignment requestBody,
                                                   ComponentPricePointErrorItem... expectedErrors) {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                ComponentPricePointErrorException.class,
                () -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                        .bulkUpdateSubscriptionComponentsPricePoints(subscription.getId(), requestBody),
                e -> assertThat(e.getErrors())
                        .usingRecursiveFieldByFieldElementComparatorIgnoringFields("additionalProperties")
                        .containsExactlyInAnyOrder(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() throws IOException, ApiException {
        ComponentPricePoint componentPricePoint = TEST_SETUP
                .createPricePointForComponent(meteredComponent.getId(), 12.5);

        return Stream.of(
                Arguments.arguments(
                        // request
                        new BulkComponentsPricePointAssignment(List.of(
                                new ComponentPricePointAssignment()
                        )),
                        // expected errors
                        new ComponentPricePointErrorItem[]{
                                new ComponentPricePointErrorItem.Builder()
                                        .message("Price Point does not belong to Component")
                                        .build()
                        }
                ),
                Arguments.arguments(
                        // request
                        new BulkComponentsPricePointAssignment(List.of(
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(meteredComponent.getId())
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromNumber(123))
                                        .build()
                        )),
                        // expected errors
                        new ComponentPricePointErrorItem[]{
                                new ComponentPricePointErrorItem.Builder()
                                        .componentId(meteredComponent.getId())
                                        .pricePoint(123)
                                        .message("Price Point does not belong to Component")
                                        .build()
                        }
                ),
                Arguments.arguments(
                        // request
                        new BulkComponentsPricePointAssignment(List.of(
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(123)
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromNumber(componentPricePoint.getId()))
                                        .build()
                        )),
                        // expected errors
                        new ComponentPricePointErrorItem[]{
                                new ComponentPricePointErrorItem.Builder()
                                        .componentId(123)
                                        .pricePoint(componentPricePoint.getId())
                                        .message("Component does not belong to this Product Family")
                                        .build()
                        }
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .bulkUpdateSubscriptionComponentsPricePoints(123, new BulkComponentsPricePointAssignment())
        );
    }

    @Test
    void shouldNotBulkUpdateWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .bulkUpdateSubscriptionComponentsPricePoints(subscription.getId(), new BulkComponentsPricePointAssignment())
        );
    }
}
