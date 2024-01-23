package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdateComponentPricePoint;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;
import com.maxio.advancedbilling.models.UpdatePrice;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointRequestPricePoint;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerUpdatePricePointTest extends ComponentsControllerTestBase {

    private static Component component;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
    }

    @Test
    void shouldUpdateComponentPricePoint() throws IOException, ApiException {
        // given
        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("test-price-point-initial-" + randomNumeric(5))
                .name("test-handle-initial-" + randomNumeric(5))
                .pricingScheme(PricingScheme.VOLUME)
                .useSiteExchangeRate(false)
                .taxIncluded(false)
                .prices(List.of(
                            new Price.Builder()
                                    .startingQuantity(PriceStartingQuantity.fromNumber(0))
                                    .endingQuantity(PriceEndingQuantity.fromNumber(5))
                                    .unitPrice(PriceUnitPrice.fromPrecision(2.0))
                                    .build(),
                            new Price.Builder()
                                    .startingQuantity(PriceStartingQuantity.fromNumber(6))
                                    .unitPrice(PriceUnitPrice.fromPrecision(5.0))
                                    .build()
                        )
                )
                .build();

        ComponentPricePoint componentPricePoint = COMPONENTS_CONTROLLER
                .createComponentPricePoint(component.getId(), new CreateComponentPricePointRequest(
                        CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(createComponentPricePoint))
                ).getPricePoint();

        UpdateComponentPricePoint updateComponentPricePoint = new UpdateComponentPricePoint.Builder()
                .name("test-price-point-" + randomNumeric(5))
                .handle("test-handle-" + randomNumeric(5))
                .pricingScheme(PricingScheme.STAIRSTEP)
                .useSiteExchangeRate(true)
                .taxIncluded(true)
                .prices(List.of(
                                new UpdatePrice.Builder()
                                        .startingQuantity(6)
                                        .unitPrice(3)
                                        .build(),
                                new UpdatePrice.Builder()
                                        .id(componentPricePoint.getPrices().get(1).getId())
                                        .destroy("true")
                                        .build(),
                                new UpdatePrice.Builder()
                                        .id(componentPricePoint.getPrices().get(0).getId())
                                        .unitPrice(2)
                                        .build()
                        )
                )
                .build();

        // when
        ComponentPricePoint updatedPricePoint = COMPONENTS_CONTROLLER
                .updateComponentPricePoint(component.getId(), componentPricePoint.getId(),
                        new UpdateComponentPricePointRequest(updateComponentPricePoint)
                )
                .getPricePoint();

        // then
        assertThat(updatedPricePoint.getId()).isGreaterThan(0);
        assertThat(updatedPricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(updatedPricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(updatedPricePoint.getDefault()).isFalse();
        assertThat(updatedPricePoint.getName()).isEqualTo(updateComponentPricePoint.getName());
        assertThat(updatedPricePoint.getHandle()).isEqualTo(updateComponentPricePoint.getHandle());
        assertThat(updatedPricePoint.getPricingScheme()).isEqualTo(updateComponentPricePoint.getPricingScheme());

        assertThat(updatedPricePoint.getArchivedAt()).isNull();
        assertThat(updatedPricePoint.getCreatedAt()).isNotNull();
        assertThat(updatedPricePoint.getUpdatedAt()).isNotNull();

        assertThat(updatedPricePoint.getUseSiteExchangeRate()).isTrue();
        assertThat(updatedPricePoint.getTaxIncluded()).isTrue();
        assertThat(updatedPricePoint.getInterval()).isNull();
        assertThat(updatedPricePoint.getIntervalUnit()).isNull();
        assertThat(updatedPricePoint.getCurrencyPrices()).isNull();
        assertThat(updatedPricePoint.getSubscriptionId()).isNull();

        assertThat(updatedPricePoint.getPrices().size()).isEqualTo(2);
        assertThat(updatedPricePoint.getPrices().get(0)).usingRecursiveComparison().isEqualTo(componentPricePoint.getPrices().get(0));
        assertThat(updatedPricePoint.getPrices().get(1).getId()).isNotNull();
        assertThat(updatedPricePoint.getPrices().get(1).getComponentId()).isEqualTo(component.getId());
        assertThat(updatedPricePoint.getPrices().get(1).getStartingQuantity()).isEqualTo(6);
        assertThat(updatedPricePoint.getPrices().get(1).getEndingQuantity()).isNull();
        assertThat(updatedPricePoint.getPrices().get(1).getUnitPrice()).isEqualTo("3.0");
        assertThat(updatedPricePoint.getPrices().get(1).getFormattedUnitPrice()).isEqualTo("$3.00");
        assertThat(updatedPricePoint.getPrices().get(1).getSegmentId()).isNull();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenUpdatingComponentPricePointWithInvalidData")
    void shouldReturn422WhenUpdatingComponentPricePointWithInvalidData(UpdateComponentPricePointRequest request,
                                                                       Map<String, String> expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ErrorArrayMapResponseException.class,
                () -> COMPONENTS_CONTROLLER.updateComponentPricePoint(component.getId(), component.getDefaultPricePointId(), request),
                e -> assertThat(e.getErrors()).containsExactlyEntriesOf(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenUpdatingComponentPricePointWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        new UpdateComponentPricePointRequest(
                                new UpdateComponentPricePoint.Builder().prices(List.of()).build()
                        ),
                        Map.of("prices", "At least 1 price bracket must be defined")
                ),
                Arguments.of(
                        new UpdateComponentPricePointRequest(
                                new UpdateComponentPricePoint.Builder().prices(List.of(
                                        new UpdatePrice.Builder().id(123).build()
                                )).build()
                        ),
                        Map.of("base", "all prices must belong to the price point")
                ),
                Arguments.of(
                        new UpdateComponentPricePointRequest(
                                new UpdateComponentPricePoint.Builder().prices(List.of(
                                        new UpdatePrice.Builder()
                                                .id(component.getDefaultPricePointId())
                                                .startingQuantity(10)
                                                .endingQuantity(1)
                                                .build()
                                )).build()
                        ),
                        Map.of("prices.ending_quantity", "Ending quantity: must be greater than the low end bracket quantity, if given")
                )
        );
    }

    @Test
    void shouldNotUpdatePricePointWhenComponentDoesNotExists() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.updateComponentPricePoint(123,
                component.getDefaultPricePointId(), null));
    }

    @Test
    void shouldNotUpdateNonExistentComponentPricePoint() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.updateComponentPricePoint(component.getId(), 123, null));
    }

    @Test
    void shouldNotUpdateComponentPricePointWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .updateComponentPricePoint(component.getId(), component.getDefaultPricePointId(), new UpdateComponentPricePointRequest()));
    }

}
