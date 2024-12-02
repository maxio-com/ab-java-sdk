package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import com.maxio.advancedbilling.models.ExpirationIntervalUnit;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
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

import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPricePoint;
import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPrices;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorArrayMapResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentCreatePricePointTest extends ComponentsControllerTestBase {

    private Component component;
    private Component prepaidUsageComponent;

    @BeforeAll
    void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
        prepaidUsageComponent = createPrepaidUsageComponent(10);
    }

    @Test
    void shouldCreatePerUnitPricePoint() throws IOException, ApiException {
        // given
        double price = 101.4313;
        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromPrecision(price))
                                .build()
                ))
                .useSiteExchangeRate(true)
                .taxIncluded(true)
                .build();

        // when
        ComponentPricePoint componentPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .createComponentPricePoint(component.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(createComponentPricePoint)))
                .getPricePoint();

        // then
        assertPricePoint(componentPricePoint, createComponentPricePoint, component.getId());
        assertPrices(createComponentPricePoint.getPrices(), componentPricePoint.getPrices(),
                List.of(String.valueOf(price)), List.of("$101.4313"), component.getId(), componentPricePoint.getId());
    }

    @Test
    void shouldCreateVolumePricePoint() throws IOException, ApiException {
        // given
        double price1 = 10;
        double price2 = 0.0003;
        double price3 = 51.000999;

        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("Volume price point " + randomNumeric(10))
                .handle("volume-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.VOLUME)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .endingQuantity(PriceEndingQuantity.fromNumber(10))
                                .unitPrice(PriceUnitPrice.fromPrecision(price1))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(11))
                                .endingQuantity(PriceEndingQuantity.fromNumber(100))
                                .unitPrice(PriceUnitPrice.fromPrecision(price2))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(101))
                                .unitPrice(PriceUnitPrice.fromPrecision(price3))
                                .build()
                ))
                .useSiteExchangeRate(true)
                .taxIncluded(true)
                .build();

        // when
        ComponentPricePoint componentPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .createComponentPricePoint(component.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(createComponentPricePoint)))
                .getPricePoint();

        // then
        assertPricePoint(componentPricePoint, createComponentPricePoint, component.getId());
        assertPrices(createComponentPricePoint.getPrices(), componentPricePoint.getPrices(),
                List.of(String.valueOf(price1), "0.0003", String.valueOf(price3)),
                List.of("$10.00", "$0.0003", "$51.000999"), component.getId(), componentPricePoint.getId());
    }

    @Test
    void shouldCreateTieredPricePoint() throws IOException, ApiException {
        // given
        double price1 = 1;
        double price2 = 0.1;

        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("Tiered price point " + randomNumeric(10))
                .handle("tiered-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.TIERED)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .endingQuantity(PriceEndingQuantity.fromNumber(10000))
                                .unitPrice(PriceUnitPrice.fromPrecision(price1))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(10001))
                                .unitPrice(PriceUnitPrice.fromPrecision(price2))
                                .build()
                ))
                .useSiteExchangeRate(false)
                .taxIncluded(false)
                .build();

        // when
        ComponentPricePoint componentPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .createComponentPricePoint(component.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(createComponentPricePoint)))
                .getPricePoint();

        // then
        assertPricePoint(componentPricePoint, createComponentPricePoint, component.getId());
        assertPrices(createComponentPricePoint.getPrices(), componentPricePoint.getPrices(),
                List.of(String.valueOf(price1), String.valueOf(price2)),
                List.of("$1.00", "$0.10"), component.getId(), componentPricePoint.getId());
    }

    @Test
    void shouldCreateStairstepPricePoint() throws IOException, ApiException {
        // given
        String price1 = "13.555";
        String price2 = "14.111111";

        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("Stairstep price point " + randomNumeric(10))
                .handle("stairstep-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.STAIRSTEP)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .endingQuantity(PriceEndingQuantity.fromNumber(2))
                                .unitPrice(PriceUnitPrice.fromString(price1))
                                .build(),
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(3))
                                .unitPrice(PriceUnitPrice.fromString(price2))
                                .build()
                ))
                .useSiteExchangeRate(true)
                .taxIncluded(false)
                .build();

        // when
        ComponentPricePoint componentPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .createComponentPricePoint(component.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(createComponentPricePoint)))
                .getPricePoint();

        // then
        assertPricePoint(componentPricePoint, createComponentPricePoint, component.getId());
        assertPrices(createComponentPricePoint.getPrices(), componentPricePoint.getPrices(),
                List.of(price1, price2),
                List.of("$" + price1, "$" + price2), component.getId(), componentPricePoint.getId());
    }

    @Test
    void shouldCreatePrepaidPerUnitPricePoint() throws IOException, ApiException {
        // given
        double price = 101.4313;
        String overagePrice = "1333";
        CreatePrepaidUsageComponentPricePoint createComponentPricePoint = new CreatePrepaidUsageComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("per-unit-price-point-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromPrecision(price))
                                .build()
                ))
                .useSiteExchangeRate(true)
                .renewPrepaidAllocation(true)
                .rolloverPrepaidRemainder(true)
                .expirationInterval(4d)
                .expirationIntervalUnit(ExpirationIntervalUnit.MONTH)
                .overagePricing(
                        new OveragePricing(PricingScheme.PER_UNIT,
                                List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .unitPrice(PriceUnitPrice.fromString(overagePrice))
                                                .build()
                                )
                        ))
                .build();

        // when
        ComponentPricePoint componentPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER
                .createComponentPricePoint(prepaidUsageComponent.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreatePrepaidUsageComponentPricePoint(createComponentPricePoint)))
                .getPricePoint();

        // then
        assertThat(componentPricePoint.getId()).isNotNull();
        assertThat(componentPricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(componentPricePoint.getDefault()).isFalse();
        assertThat(componentPricePoint.getName()).isEqualTo(createComponentPricePoint.getName());
        assertThat(componentPricePoint.getPricingScheme()).isEqualTo(createComponentPricePoint.getPricingScheme());
        assertThat(componentPricePoint.getComponentId()).isEqualTo(prepaidUsageComponent.getId());
        assertThat(componentPricePoint.getHandle()).isEqualTo(createComponentPricePoint.getHandle());

        assertThat(componentPricePoint.getArchivedAt()).isNull();
        assertThat(componentPricePoint.getCreatedAt()).isNotNull();
        assertThat(componentPricePoint.getUpdatedAt()).isEqualTo(componentPricePoint.getCreatedAt());
        assertThat(componentPricePoint.getUseSiteExchangeRate())
                .isEqualTo(createComponentPricePoint.getUseSiteExchangeRate());
        assertThat(componentPricePoint.getSubscriptionId()).isNull();
        assertThat(componentPricePoint.getTaxIncluded()).isFalse();
        assertThat(componentPricePoint.getInterval()).isNull();
        assertThat(componentPricePoint.getIntervalUnit()).isNull();
        assertThat(componentPricePoint.getCurrencyPrices()).isNull();
        assertThat(componentPricePoint.getExpirationInterval()).isEqualTo(createComponentPricePoint.getExpirationInterval().intValue());
        assertThat(componentPricePoint.getExpirationIntervalUnit()).isEqualTo(createComponentPricePoint.getExpirationIntervalUnit());
        assertThat(componentPricePoint.getRolloverPrepaidRemainder()).isEqualTo(createComponentPricePoint.getRolloverPrepaidRemainder());
        assertThat(componentPricePoint.getRenewPrepaidAllocation()).isEqualTo(createComponentPricePoint.getRenewPrepaidAllocation());
        assertThat(componentPricePoint.getOveragePricingScheme()).isEqualTo(PricingScheme.PER_UNIT);

        assertThat(componentPricePoint.getPrices()).hasSize(1);
        assertPrices(createComponentPricePoint.getPrices(), componentPricePoint.getPrices(),
                List.of(String.valueOf(price)),
                List.of("$101.4313"), prepaidUsageComponent.getId(), componentPricePoint.getId());

        assertThat(componentPricePoint.getOveragePricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(componentPricePoint.getOveragePrices()).hasSize(1);
        assertPrices(createComponentPricePoint.getOveragePricing().getPrices(), componentPricePoint.getOveragePrices(),
                List.of("1333.0"),
                List.of("$1,333.00"), prepaidUsageComponent.getId(), componentPricePoint.getId());
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenInputDataIsIncorrect")
    void shouldReturn422WhenInputDataIsIncorrect(int componentId,
                                                 CreateComponentPricePointRequestPricePoint createRequest,
                                                 Map<String, Object> expectedErrors) {
        assertThatErrorArrayMapResponse(
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.createComponentPricePoint(componentId,
                        new CreateComponentPricePointRequest(createRequest)))
                .hasErrorMap(expectedErrors)
                .isUnprocessableEntity();
    }

    private Stream<Arguments> argsForShouldReturn422WhenInputDataIsIncorrect() {
        return Stream.of(
                Arguments.of(
                        123,
                        CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(new CreateComponentPricePoint.Builder()
                                .pricingScheme(PricingScheme.PER_UNIT)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .unitPrice(PriceUnitPrice.fromString("1"))
                                                .build()
                                ))
                                .build()),
                        Map.of("base", List.of("component must be a valid component"))
                ),
                Arguments.of(
                        component.getId(),
                        CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(new CreateComponentPricePoint.Builder()
                                .handle(". ")
                                .pricingScheme(PricingScheme.STAIRSTEP)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .endingQuantity(PriceEndingQuantity.fromNumber(2))
                                                .unitPrice(PriceUnitPrice.fromString("-1"))
                                                .build(),
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(5))
                                                .unitPrice(PriceUnitPrice.fromString("-10"))
                                                .build()
                                ))
                                .build()),
                        Map.of("handle", List.of("Handle: must begin with a letter or a number, have at least one " +
                                        "letter in it, and contain only lowercase letters, numbers, dashes and underscores."),
                                "name", List.of("Name: cannot be blank."),
                                "prices", List.of("Successive brackets may not have gaps in quantity (i.e. if one " +
                                        "bracket ends at quantity 10, the next must begin at quantity 11)"),
                                "prices.currency_prices.price", List.of("Unit price: must be greater than or equal to $0.00.")
                        )
                ),
                Arguments.of(
                        component.getId(),
                        CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(new CreateComponentPricePoint.Builder()
                                .name("abc")
                                .handle("abc" + randomNumeric(10))
                                .pricingScheme(PricingScheme.STAIRSTEP)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(100))
                                                .endingQuantity(PriceEndingQuantity.fromNumber(10))
                                                .build()
                                ))
                                .build()),
                        Map.of("prices.unit_price", List.of("Unit price: cannot be blank."),
                                "prices.ending_quantity", List.of("Ending quantity: must be greater than the " +
                                        "low end bracket quantity, if given"),
                                "prices.currency_prices.price", List.of("Unit price: cannot be blank.")
                        )
                ),
                Arguments.of(
                        prepaidUsageComponent.getId(),
                        CreateComponentPricePointRequestPricePoint.fromCreatePrepaidUsageComponentPricePoint(
                                new CreatePrepaidUsageComponentPricePoint.Builder()
                                        .name("abc")
                                        .handle("abc" + randomNumeric(10))
                                        .pricingScheme(PricingScheme.STAIRSTEP)
                                        .prices(List.of(
                                                new Price.Builder()
                                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                        .unitPrice(PriceUnitPrice.fromString("1"))
                                                        .build()
                                        ))
                                        .expirationInterval(3d)
                                        .build()),
                        Map.of("expiration_interval", List.of("Rollover allocation option must be true to use expiration interval"),
                                "expiration_interval_unit", List.of("Expiration interval unit: cannot be blank."),
                                "base", List.of("Overage pricing scheme must be defined for prepaid components"),
                                "overage_prices", List.of("At least 1 overage price bracket must be defined"))
                )
        );
    }

    @Test
    void shouldReturn422WhenHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        CreateComponentPricePointRequest request = validRequest();
        COMPONENTS__PRICE_POINT_CONTROLLER.createComponentPricePoint(component.getId(), request);

        // when - then
        assertThatErrorArrayMapResponse(
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.createComponentPricePoint(component.getId(), request))
                .hasErrorMap(Map.of("handle", List.of("Handle: This handle is already in use.")))
                .isUnprocessableEntity();
    }

    @Test
    void shouldNotCreatePricePointWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentPricePointsController()
                .createComponentPricePoint(productFamilyId, validRequest()));
    }

    private CreateComponentPricePointRequest validRequest() {
        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("Per unit price point " + randomNumeric(10))
                .handle("valid-handle" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(List.of(
                        new Price.Builder()
                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                .unitPrice(PriceUnitPrice.fromPrecision(1))
                                .build()
                ))
                .build();
        return new CreateComponentPricePointRequest(
                CreateComponentPricePointRequestPricePoint
                        .fromCreateComponentPricePoint(createComponentPricePoint));
    }

}
