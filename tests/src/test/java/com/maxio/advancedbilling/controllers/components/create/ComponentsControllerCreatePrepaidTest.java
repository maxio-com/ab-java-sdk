package com.maxio.advancedbilling.controllers.components.create;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.components.ComponentsControllerTestBase;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.ExpirationIntervalUnit;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.PrepaidUsageComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PrepaidUsageComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertPrices;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreatePrepaidTest extends ComponentsControllerTestBase {

    @Test
    void shouldCreatePrepaidUsageComponent() throws IOException, ApiException {
        // given
        String price = "43.955935";
        String overagePrice = "50.00004";
        double catalogPricePointPrice1 = 5;
        double catalogPricePointPrice2 = 4.52323;
        String catalogPricePointOveragePrice = "6.000009";

        PrepaidUsageComponent prepaidUsageComponent = new PrepaidUsageComponent.Builder()
                .name("Prepaid Usage Component " + randomNumeric(10))
                .handle("prepaid-usage-handle-" + randomNumeric(10))
                .description("Test prepaid usage component.")
                .unitName("custom prepaid unit name")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(PrepaidUsageComponentUnitPrice.fromString(price))
                .taxable(true)
                .taxCode("txcode1")
                .upgradeCharge(CreditType.PRORATED)
                .downgradeCredit(CreditType.NONE)
                .hideDateRangeOnInvoice(true)
                .displayOnHostedPage(true)
                .publicSignupPageIds(List.of(123))
                .rolloverPrepaidRemainder(true)
                .renewPrepaidAllocation(true)
                .expirationInterval(5.0)
                .expirationIntervalUnit(ExpirationIntervalUnit.DAY)
                .pricePoints(List.of(
                        new CreatePrepaidUsageComponentPricePoint.Builder()
                                .name("Price Point " + randomNumeric(10))
                                .handle("price-point-handle-" + randomNumeric(10))
                                .pricingScheme(PricingScheme.STAIRSTEP)
                                .rolloverPrepaidRemainder(false)
                                .renewPrepaidAllocation(false)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(0))
                                                .endingQuantity(PriceEndingQuantity.fromNumber(11))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice1))
                                                .build(),
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(12))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice2))
                                                .build()
                                ))
                                .overagePricing(
                                        new OveragePricing(PricingScheme.PER_UNIT,
                                                List.of(
                                                        new Price.Builder()
                                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                                .unitPrice(PriceUnitPrice.fromString(catalogPricePointOveragePrice))
                                                                .build()
                                                )
                                        ))
                                .build()
                ))
                .overagePricing(new OveragePricing(PricingScheme.PER_UNIT,
                        List.of(
                                new Price.Builder()
                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                        .unitPrice(PriceUnitPrice.fromString(overagePrice))
                                        .build()
                        )
                ))
                .build();

        // when
        Component component = COMPONENTS_CONTROLLER.createPrepaidUsageComponent(String.valueOf(productFamilyId),
                new CreatePrepaidComponent(prepaidUsageComponent)).getComponent();
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .build()
        ).getPricePoints();

        // then
        assertThat(component.getId()).isNotNull();
        assertThat(component.getKind()).isEqualTo(ComponentKind.PREPAID_USAGE_COMPONENT);
        assertThat(component.getName()).isEqualTo(prepaidUsageComponent.getName());
        assertThat(component.getHandle()).isEqualTo(prepaidUsageComponent.getHandle());
        assertThat(component.getDescription()).isEqualTo(prepaidUsageComponent.getDescription());
        assertThat(component.getUnitPrice()).isEqualTo(price);
        assertThat(component.getTaxable()).isEqualTo(prepaidUsageComponent.getTaxable());
        assertThat(component.getTaxCode()).isEqualTo(prepaidUsageComponent.getTaxCode());
        assertThat(component.getUpgradeCharge()).isEqualTo(prepaidUsageComponent.getUpgradeCharge());
        assertThat(component.getDowngradeCredit()).isEqualTo(prepaidUsageComponent.getDowngradeCredit());
        assertThat(component.getHideDateRangeOnInvoice()).isEqualTo(prepaidUsageComponent.getHideDateRangeOnInvoice());
        assertThat(component.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(component.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(component.getCreatedAt()).isNotNull();
        assertThat(component.getUpdatedAt()).isNotNull();
        assertThat(component.getPricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(component.getUnitName()).isEqualTo(prepaidUsageComponent.getUnitName());
        assertThat(component.getPricePerUnitInCents()).isNull();
        assertThat(component.getArchived()).isFalse();
        assertThat(component.getDefaultPricePointId()).isNotNull();
        assertThat(component.getPricePointCount()).isEqualTo(2);
        assertThat(component.getPricePointsUrl()).isNotEmpty();
        assertThat(component.getDefaultPricePointName()).isNotEmpty();
        assertThat(component.getArchivedAt()).isNull();
        assertThat(component.getUseSiteExchangeRate()).isNull();
        assertThat(component.getItemCategory()).isNull();
        assertThat(component.getAccountingCode()).isNull();
        assertPrices(prepaidUsageComponent.getOveragePricing().getPrices(), component.getOveragePrices(),
                List.of(overagePrice),
                List.of("$" + overagePrice), component.getId(),
                component.getDefaultPricePointId());

        assertThat(pricePoints).hasSize(2);
        CreatePrepaidUsageComponentPricePoint expectedPricePoint = prepaidUsageComponent.getPricePoints().get(0);
        ComponentPricePoint pricePoint = pricePoints.stream()
                .filter(pp -> pp.getName().equals(expectedPricePoint.getName()))
                .findFirst().get();
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(pricePoint.getName()).isEqualTo(expectedPricePoint.getName());
        assertThat(pricePoint.getHandle()).isEqualTo(expectedPricePoint.getHandle());
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getPricingScheme()).isEqualTo(PricingScheme.STAIRSTEP);

        assertThat(pricePoint.getPrices()).hasSize(2);
        assertPrices(prepaidUsageComponent.getPricePoints().get(0).getPrices(), pricePoint.getPrices(),
                List.of(String.valueOf(catalogPricePointPrice1), String.valueOf(catalogPricePointPrice2)),
                List.of("$5.00", "$4.52323"), component.getId(),
                pricePoint.getId());

        assertThat(pricePoint.getCreatedAt()).isNotNull();
        assertThat(pricePoint.getUpdatedAt()).isNotNull();
        assertThat(pricePoint.getArchivedAt()).isNull();
        assertThat(pricePoint.getUseSiteExchangeRate()).isNull();
        assertThat(pricePoint.getTaxIncluded()).isFalse();
        assertThat(pricePoint.getSubscriptionId()).isNull();
        assertThat(pricePoint.getInterval()).isNull();
        assertThat(pricePoint.getIntervalUnit()).isNull();
        assertThat(pricePoint.getCurrencyPrices()).isNull();

        // prepaid specific price points props
        assertThat(pricePoint.getRenewPrepaidAllocation()).isFalse();
        assertThat(pricePoint.getRolloverPrepaidRemainder()).isFalse();
        assertThat(pricePoint.getExpirationInterval()).isNull();
        assertThat(pricePoint.getExpirationIntervalUnit()).isNull();
        assertPrices(prepaidUsageComponent.getPricePoints().get(0).getOveragePricing().getPrices(),
                pricePoint.getOveragePrices(),
                List.of(catalogPricePointOveragePrice),
                List.of("$" + catalogPricePointOveragePrice), component.getId(),
                pricePoint.getId());
    }

    @Test
    void shouldReturn422WhenInputDataIsIncorrect() {
        // given
        PrepaidUsageComponent prepaidUsageComponent = new PrepaidUsageComponent.Builder()
                .name("Prepaid Usage Component " + randomNumeric(10))
                .handle("wrong handle")
                .pricingScheme(PricingScheme.STAIRSTEP)
                .build();

        // when - then
        assertThatErrorListResponse(
                () -> COMPONENTS_CONTROLLER.createPrepaidUsageComponent(String.valueOf(productFamilyId),
                        new CreatePrepaidComponent(prepaidUsageComponent)))
                .hasErrors(
                        "Handle must start with a letter or number and may only contain lowercase letters, numbers, or the characters ':', '-', or '_'.",
                        "Unit name: cannot be blank.",
                        "At least 1 price bracket must be defined",
                        "Overage pricing scheme must be defined for prepaid components",
                        "At least 1 overage price bracket must be defined")
                .isUnprocessableEntity();
    }

    @Test
    void shouldReturn422WhenNameAndHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        PrepaidUsageComponent createComponent = new PrepaidUsageComponent.Builder()
                .name("Prepaid Usage Component " + randomNumeric(10))
                .handle("prepaid-usage-handle-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(PrepaidUsageComponentUnitPrice.fromPrecision(10.0))
                .unitName("u")
                .overagePricing(new OveragePricing(PricingScheme.PER_UNIT,
                        List.of(
                                new Price.Builder()
                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                        .unitPrice(PriceUnitPrice.fromString("1"))
                                        .build()
                        )
                ))
                .build();
        COMPONENTS_CONTROLLER.createPrepaidUsageComponent(String.valueOf(productFamilyId),
                new CreatePrepaidComponent(createComponent));

        // when - then
        assertThatErrorListResponse(
                () -> COMPONENTS_CONTROLLER.createPrepaidUsageComponent(String.valueOf(productFamilyId),
                        new CreatePrepaidComponent(createComponent)))
                .hasErrors(
                        "Handle must be unique within a Site.",
                        "Name: must be unique - that value has been taken."
                ).isUnprocessableEntity();
    }

    @Test
    void shouldNotCreateComponentForNonExistentProductFamily() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.createPrepaidUsageComponent("123",
                new CreatePrepaidComponent()));
    }

    @Test
    void shouldNotCreateComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentsController()
                .createPrepaidUsageComponent(String.valueOf(productFamilyId), new CreatePrepaidComponent()));
    }
}
