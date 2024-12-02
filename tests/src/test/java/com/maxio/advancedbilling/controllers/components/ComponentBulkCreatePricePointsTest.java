package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointsRequest;
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import com.maxio.advancedbilling.models.ExpirationIntervalUnit;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointsRequestPricePoints;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPrepaidPricePoint;
import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPricePoint;
import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPrices;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentBulkCreatePricePointsTest extends ComponentsControllerTestBase {

    private Component component;
    private Component prepaidUsageComponent;

    @BeforeAll
    void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
        prepaidUsageComponent = createPrepaidUsageComponent(10);
    }

    @Test
    void shouldCreatePricePointsInBulk() throws IOException, ApiException {
        // given
        double price1_1 = 23.32;
        CreateComponentPricePoint perUnit = new CreateComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromPrecision(price1_1))
                                .build()
                ))
                .build();

        double price2_1 = 10;
        double price2_2 = 100;

        CreateComponentPricePoint volume = new CreateComponentPricePoint.Builder()
                .name("Volume price point " + randomNumeric(10))
                .handle("volume-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.VOLUME)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .endingQuantity(PriceEndingQuantity.fromNumber(10009))
                                .unitPrice(PriceUnitPrice.fromPrecision(price2_1))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(10010))
                                .unitPrice(PriceUnitPrice.fromPrecision(price2_2))
                                .build()
                ))
                .build();

        double price3_1 = 111;
        double price3_2 = 222;

        CreateComponentPricePoint tiered = new CreateComponentPricePoint.Builder()
                .name("Tiered price point " + randomNumeric(10))
                .handle("tiered-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.TIERED)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .endingQuantity(PriceEndingQuantity.fromNumber(2))
                                .unitPrice(PriceUnitPrice.fromPrecision(price3_1))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(3))
                                .unitPrice(PriceUnitPrice.fromPrecision(price3_2))
                                .build()
                ))
                .build();

        // when
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.bulkCreateComponentPricePoints(String.valueOf(component.getId()),
                new CreateComponentPricePointsRequest(
                        List.of(
                                CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(perUnit),
                                CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(volume),
                                CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(tiered))
                )).getPricePoints();

        // then
        Map<String, ComponentPricePoint> pricePointMap = pricePoints.stream()
                .collect(Collectors.toMap(ComponentPricePoint::getName, v -> v));
        assertThat(pricePointMap.size()).isEqualTo(3);
        assertThat(pricePointMap.keySet()).containsExactlyInAnyOrder(perUnit.getName(), volume.getName(), tiered.getName());

        ComponentPricePoint perUnitPricePoint = pricePointMap.get(perUnit.getName());
        assertPricePoint(perUnitPricePoint, perUnit, component.getId(), true);
        assertPrices(perUnit.getPrices(), perUnitPricePoint.getPrices(),
                List.of(String.valueOf(price1_1)),
                List.of("$23.32"), component.getId(), perUnitPricePoint.getId());

        ComponentPricePoint volumePricePoint = pricePointMap.get(volume.getName());
        assertPricePoint(volumePricePoint, volume, component.getId(), true);
        assertPrices(volume.getPrices(), volumePricePoint.getPrices(),
                List.of(String.valueOf(price2_1), String.valueOf(price2_2)),
                List.of("$10.00", "$100.00"), component.getId(), volumePricePoint.getId());

        ComponentPricePoint tieredPricePoint = pricePointMap.get(tiered.getName());
        assertPricePoint(tieredPricePoint, tiered, component.getId(), true);
        assertPrices(tiered.getPrices(), tieredPricePoint.getPrices(),
                List.of(String.valueOf(price3_1), String.valueOf(price3_2)),
                List.of("$111.00", "$222.00"), component.getId(), tieredPricePoint.getId());
    }

    @Test
    void shouldCreatePrepaidPricePointsInBulk() throws IOException, ApiException {
        // given
        String price1 = "10.22";
        String overagePrice1 = "333.22";
        CreatePrepaidUsageComponentPricePoint createComponentPricePoint1 = new CreatePrepaidUsageComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromString(price1))
                                .build()
                ))
                .renewPrepaidAllocation(true)
                .rolloverPrepaidRemainder(true)
                .expirationInterval(4d)
                .expirationIntervalUnit(ExpirationIntervalUnit.MONTH)
                .overagePricing(
                        new OveragePricing(PricingScheme.PER_UNIT,
                                List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .unitPrice(PriceUnitPrice.fromString(overagePrice1))
                                                .build()
                                )
                        ))
                .build();

        String price2 = "1.4232";
        String overagePrice2 = "2.22222";
        CreatePrepaidUsageComponentPricePoint createComponentPricePoint2 = new CreatePrepaidUsageComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromString(price2))
                                .build()
                ))
                .renewPrepaidAllocation(false)
                .rolloverPrepaidRemainder(false)
                .overagePricing(
                        new OveragePricing(PricingScheme.PER_UNIT,
                                List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .unitPrice(PriceUnitPrice.fromString(overagePrice2))
                                                .build()
                                )
                        ))
                .build();

        // when
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.bulkCreateComponentPricePoints(
                String.valueOf(prepaidUsageComponent.getId()),
                new CreateComponentPricePointsRequest(
                        List.of(
                                CreateComponentPricePointsRequestPricePoints
                                        .fromCreatePrepaidUsageComponentPricePoint(createComponentPricePoint1),
                                CreateComponentPricePointsRequestPricePoints
                                        .fromCreatePrepaidUsageComponentPricePoint(createComponentPricePoint2)
                        ))).getPricePoints();

        // then
        Map<String, ComponentPricePoint> pricePointMap = pricePoints.stream()
                .collect(Collectors.toMap(ComponentPricePoint::getName, v -> v));

        ComponentPricePoint pricePoint1 = pricePointMap.get(createComponentPricePoint1.getName());
        assertPrepaidPricePoint(pricePoint1, createComponentPricePoint1, prepaidUsageComponent.getId(), true);
        assertPrices(createComponentPricePoint1.getPrices(), pricePoint1.getPrices(),
                List.of(price1),
                List.of("$" + price1), prepaidUsageComponent.getId(), pricePoint1.getId());

        assertThat(pricePoint1.getOveragePricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(pricePoint1.getOveragePrices()).hasSize(1);
        assertPrices(createComponentPricePoint1.getOveragePricing().getPrices(), pricePoint1.getOveragePrices(),
                List.of(overagePrice1),
                List.of("$" + overagePrice1), prepaidUsageComponent.getId(), pricePoint1.getId());

        ComponentPricePoint pricePoint2 = pricePointMap.get(createComponentPricePoint2.getName());
        assertPrepaidPricePoint(pricePoint2, createComponentPricePoint2, prepaidUsageComponent.getId(), true);
        assertPrices(createComponentPricePoint2.getPrices(), pricePoint2.getPrices(),
                List.of(price2),
                List.of("$" + price2), prepaidUsageComponent.getId(), pricePoint2.getId());

        assertThat(pricePoint2.getOveragePricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(pricePoint2.getOveragePrices()).hasSize(1);
        assertPrices(createComponentPricePoint2.getOveragePricing().getPrices(), pricePoint2.getOveragePrices(),
                List.of(overagePrice2),
                List.of("$" + overagePrice2), prepaidUsageComponent.getId(), pricePoint2.getId());
    }

    @Test
    void shouldReturn422WhenInputDataIsIncorrect() {
        // given
        CreateComponentPricePoint perUnit = new CreateComponentPricePoint.Builder()
                .name("")
                .handle("per-unit-price-point- " + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromString("-3"))
                                .build()
                ))
                .build();

        // when - then
        assertThatErrorListResponse(
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.bulkCreateComponentPricePoints(
                        String.valueOf(component.getId()),
                        new CreateComponentPricePointsRequest(
                                List.of(
                                        CreateComponentPricePointsRequestPricePoints
                                                .fromCreateComponentPricePoint(perUnit)
                                ))))
                .hasErrors("Unit price: must be greater than or equal to $0.00.",
                        "Name: cannot be blank.",
                        "Handle: must begin with a letter or a number, have at least one letter in it, and contain " +
                                "only lowercase letters, numbers, dashes and underscores.")
                .isUnprocessableEntity();
    }

    @Test
    void shouldReturn422WhenComponentDoesNotExist() {
        // given
        CreateComponentPricePoint perUnit = new CreateComponentPricePoint.Builder()
                .name("name")
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromString("-3"))
                                .build()
                ))
                .build();

        // when - then
        assertNotFound(
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.bulkCreateComponentPricePoints(
                        String.valueOf(123),
                        new CreateComponentPricePointsRequest(
                                List.of(
                                        CreateComponentPricePointsRequestPricePoints
                                                .fromCreateComponentPricePoint(perUnit)
                                ))));
    }

    @Test
    void shouldNotCreatePricePointWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentPricePointsController()
                .bulkCreateComponentPricePoints(String.valueOf(component.getId()), new CreateComponentPricePointsRequest()));
    }

}
