package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdateComponentPricePoint;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;
import com.maxio.advancedbilling.models.UpdatePrice;
import com.maxio.advancedbilling.models.containers.UpdateComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.UpdateComponentPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.UpdatePriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceUnitPrice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerUpdatePricePointTest extends ComponentsControllerTestBase {

    private Component component;
    private Component component2;

    @BeforeAll
    void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
        component2 = createQuantityBasedComponent();
    }

    @Test
    void shouldUpdateComponentPricePoint() throws IOException, ApiException {
        // given
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());

        UpdateComponentPricePoint updateComponentPricePoint = new UpdateComponentPricePoint.Builder()
                .name("test-price-point-" + randomNumeric(10))
                .handle("test-handle-" + randomNumeric(10))
                .pricingScheme(PricingScheme.STAIRSTEP)
                .useSiteExchangeRate(true)
                .taxIncluded(true)
                .prices(List.of(
                                new UpdatePrice.Builder()
                                        .startingQuantity(UpdatePriceStartingQuantity.fromNumber(6))
                                        .unitPrice(UpdatePriceUnitPrice.fromPrecision(3))
                                        .build(),
                                new UpdatePrice.Builder()
                                        .id(componentPricePoint.getPrices().get(1).getId())
                                        .destroy(true)
                                        .build(),
                                new UpdatePrice.Builder()
                                        .id(componentPricePoint.getPrices().get(0).getId())
                                        .unitPrice(UpdatePriceUnitPrice.fromString("2"))
                                        .build()
                        )
                )
                .build();

        // when
        ComponentPricePoint updatedPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .updateComponentPricePoint(
                        UpdateComponentPricePointComponentId.fromNumber(component.getId()),
                        UpdateComponentPricePointPricePointId.fromNumber(componentPricePoint.getId()),
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
        assertThat(updatedPricePoint.getCreatedAt()).isAfter(timestamp);
        assertThat(updatedPricePoint.getUpdatedAt()).isAfter(timestamp);

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
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.updateComponentPricePoint(
                        UpdateComponentPricePointComponentId.fromNumber(component2.getId()),
                        UpdateComponentPricePointPricePointId.fromNumber(component2.getDefaultPricePointId()),
                        request
                ),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrderEntriesOf(expectedErrors)
        );
    }

    private Stream<Arguments> argsForShouldReturn422WhenUpdatingComponentPricePointWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        new UpdateComponentPricePointRequest(
                                new UpdateComponentPricePoint.Builder().pricingScheme(PricingScheme.STAIRSTEP)
                                        .prices(List.of(new UpdatePrice())).build()
                        ),
                        Map.of("prices", List.of("There cannot be more than one price bracket without an ending quantity (i.e. 'infinity')"),
                                "prices.starting_quantity", List.of("Starting quantity: is not a number."),
                                "prices.unit_price", List.of("Unit price: cannot be blank."))
                ),
                Arguments.of(
                        new UpdateComponentPricePointRequest(
                                new UpdateComponentPricePoint.Builder().prices(List.of(
                                        new UpdatePrice.Builder().id(123).build()
                                )).build()
                        ),
                        Map.of("base", List.of("all prices must belong to the price point"))
                )
        );
    }

    @Test
    void shouldNotUpdatePricePointWhenComponentAndPricePointDontExist() {
        assertUnprocessableEntity(
                ErrorArrayMapResponseException.class,
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.updateComponentPricePoint(
                        UpdateComponentPricePointComponentId.fromNumber(123),
                        UpdateComponentPricePointPricePointId.fromNumber(123),
                        new UpdateComponentPricePointRequest(new UpdateComponentPricePoint.Builder().name("abc").build())),
                e -> assertThat(e.getErrors()).containsExactlyEntriesOf(
                        Map.of("base", List.of(
                                "component must be a valid component",
                                "price_point must be a valid price_point")
                        )
                ));
    }

    @Test
    void shouldNotUpdateComponentPricePointWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentPricePointsController()
                .updateComponentPricePoint(
                        UpdateComponentPricePointComponentId.fromNumber(component.getId()),
                        UpdateComponentPricePointPricePointId.fromNumber(component.getDefaultPricePointId()),
                        new UpdateComponentPricePointRequest())
        );
    }

}
