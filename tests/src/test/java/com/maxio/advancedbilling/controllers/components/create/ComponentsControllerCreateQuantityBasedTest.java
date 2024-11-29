package com.maxio.advancedbilling.controllers.components.create;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.components.ComponentsControllerTestBase;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ComponentPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.QuantityBasedComponentUnitPrice;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreateQuantityBasedTest extends ComponentsControllerTestBase {

    @Test
    void shouldCreateQuantityComponent() throws IOException, ApiException {
        // given
        String price = "15.3030134";
        double catalogPricePointPrice1 = 103;
        double catalogPricePointPrice2 = 1.523;
        QuantityBasedComponent quantityBasedComponent = new QuantityBasedComponent.Builder()
                .name("Quantity Based Component " + randomNumeric(10))
                .handle("quantity-based-handle-" + randomNumeric(10))
                .description("Test quantity based component.")
                .unitName("custom unit name")
                .recurring(false)
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromString(price))
                .taxable(true)
                .taxCode("txcode1")
                .upgradeCharge(CreditType.FULL)
                .downgradeCredit(CreditType.PRORATED)
                .hideDateRangeOnInvoice(true)
                .displayOnHostedPage(true)
                .publicSignupPageIds(List.of(123))
                .pricePoints(List.of(
                        new ComponentPricePointItem.Builder()
                                .name("Price Point " + randomNumeric(10))
                                .handle("price-point-handle-" + randomNumeric(10))
                                .pricingScheme(PricingScheme.VOLUME)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(0))
                                                .endingQuantity(PriceEndingQuantity.fromNumber(5))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice1))
                                                .build(),
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(6))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice2))
                                                .build()
                                ))
                                .build()
                ))
                .build();

        // when
        Component component = COMPONENTS_CONTROLLER.createQuantityBasedComponent(String.valueOf(productFamilyId),
                new CreateQuantityBasedComponent(quantityBasedComponent)).getComponent();
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .build()
        ).getPricePoints();

        // then
        assertThat(component.getId()).isNotNull();
        assertThat(component.getKind()).isEqualTo(ComponentKind.QUANTITY_BASED_COMPONENT);
        assertThat(component.getName()).isEqualTo(quantityBasedComponent.getName());
        assertThat(component.getHandle()).isEqualTo(quantityBasedComponent.getHandle());
        assertThat(component.getDescription()).isEqualTo(quantityBasedComponent.getDescription());
        assertThat(component.getUnitPrice()).isEqualTo(price);
        assertThat(component.getTaxable()).isEqualTo(quantityBasedComponent.getTaxable());
        assertThat(component.getTaxCode()).isEqualTo(quantityBasedComponent.getTaxCode());
        assertThat(component.getUpgradeCharge()).isEqualTo(quantityBasedComponent.getUpgradeCharge());
        assertThat(component.getDowngradeCredit()).isEqualTo(quantityBasedComponent.getDowngradeCredit());
        assertThat(component.getHideDateRangeOnInvoice()).isEqualTo(quantityBasedComponent.getHideDateRangeOnInvoice());
        assertThat(component.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(component.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(component.getCreatedAt()).isNotNull();
        assertThat(component.getUpdatedAt()).isNotNull();
        assertThat(component.getPricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(component.getUnitName()).isEqualTo(quantityBasedComponent.getUnitName());
        assertThat(component.getPricePerUnitInCents()).isNull();
        assertThat(component.getArchived()).isFalse();
        assertThat(component.getDefaultPricePointId()).isNotNull();
        assertThat(component.getPricePointCount()).isEqualTo(2);
        assertThat(component.getPricePointsUrl()).isNotEmpty();
        assertThat(component.getDefaultPricePointName()).isNotEmpty();
        assertThat(component.getRecurring()).isEqualTo(quantityBasedComponent.getRecurring());
        assertThat(component.getArchivedAt()).isNull();
        assertThat(component.getUseSiteExchangeRate()).isTrue();
        assertThat(component.getItemCategory()).isNull();
        assertThat(component.getAccountingCode()).isNull();

        assertThat(pricePoints).hasSize(2);
        ComponentPricePointItem expectedPricePoint = quantityBasedComponent.getPricePoints().get(0);
        ComponentPricePoint pricePoint = pricePoints.stream()
                .filter(pp -> pp.getName().equals(expectedPricePoint.getName()))
                .findFirst().get();
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(pricePoint.getName()).isEqualTo(expectedPricePoint.getName());
        assertThat(pricePoint.getHandle()).isEqualTo(expectedPricePoint.getHandle());
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getPricingScheme()).isEqualTo(PricingScheme.VOLUME);

        assertThat(pricePoint.getPrices()).hasSize(2);
        ComponentPrice componentPrice1 = pricePoint.getPrices().get(0);
        assertThat(componentPrice1.getId()).isNotNull();
        assertThat(componentPrice1.getComponentId()).isEqualTo(component.getId());
        assertThat(componentPrice1.getStartingQuantity()).isEqualTo(0);
        assertThat(componentPrice1.getEndingQuantity()).isEqualTo(5);
        assertThat(componentPrice1.getUnitPrice()).isEqualTo(String.valueOf(catalogPricePointPrice1));
        assertThat(componentPrice1.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(componentPrice1.getFormattedUnitPrice()).isEqualTo("$103.00");
        assertThat(componentPrice1.getSegmentId()).isNull();
        ComponentPrice componentPrice2 = pricePoint.getPrices().get(1);
        assertThat(componentPrice2.getId()).isNotNull();
        assertThat(componentPrice2.getComponentId()).isEqualTo(component.getId());
        assertThat(componentPrice2.getStartingQuantity()).isEqualTo(6);
        assertThat(componentPrice2.getEndingQuantity()).isNull();
        assertThat(componentPrice2.getUnitPrice()).isEqualTo(String.valueOf(catalogPricePointPrice2));
        assertThat(componentPrice2.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(componentPrice2.getFormattedUnitPrice()).isEqualTo("$1.523");
        assertThat(componentPrice2.getSegmentId()).isNull();

        assertThat(pricePoint.getCreatedAt()).isNotNull();
        assertThat(pricePoint.getUpdatedAt()).isNotNull();
        assertThat(pricePoint.getArchivedAt()).isNull();
        assertThat(pricePoint.getUseSiteExchangeRate()).isTrue();
        assertThat(pricePoint.getTaxIncluded()).isFalse();
        assertThat(pricePoint.getSubscriptionId()).isNull();
        assertThat(pricePoint.getInterval()).isNull();
        assertThat(pricePoint.getIntervalUnit()).isNull();
        assertThat(pricePoint.getCurrencyPrices()).isNull();
    }

    @Test
    void shouldReturn422WhenInputDataIsIncorrect() {
        // given
        QuantityBasedComponent quantityBasedComponent = new QuantityBasedComponent.Builder()
                .name("Quantity Based Component " + randomNumeric(10))
                .handle("wrong handle")
                .pricingScheme(PricingScheme.VOLUME)
                .build();

        // when - then
        assertThatErrorListResponse(
                () -> COMPONENTS_CONTROLLER.createQuantityBasedComponent(String.valueOf(productFamilyId),
                        new CreateQuantityBasedComponent(quantityBasedComponent)))
                .hasErrors(
                        "Handle must start with a letter or number and may only contain lowercase letters, numbers, or the characters ':', '-', or '_'.",
                        "Unit name: cannot be blank.",
                        "At least 1 price bracket must be defined")
                .isUnprocessableEntity();
    }

    @Test
    void shouldReturn422WhenNameAndHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        QuantityBasedComponent createComponent = new QuantityBasedComponent.Builder()
                .name("Quantity Based Component " + randomNumeric(10))
                .handle("quantity-based-handle-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromPrecision(10.0))
                .unitName("u")
                .build();
        COMPONENTS_CONTROLLER.createQuantityBasedComponent(String.valueOf(productFamilyId),
                new CreateQuantityBasedComponent(createComponent));

        // when - then
        assertThatErrorListResponse(
                () -> COMPONENTS_CONTROLLER.createQuantityBasedComponent(String.valueOf(productFamilyId),
                        new CreateQuantityBasedComponent(createComponent)))
                .hasErrors(
                        "Handle must be unique within a Site.",
                        "Name: must be unique - that value has been taken.")
                .isUnprocessableEntity();
    }

    @Test
    void shouldNotCreateComponentForNonExistentProductFamily() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.createQuantityBasedComponent("123",
                new CreateQuantityBasedComponent()));
    }

    @Test
    void shouldNotCreateComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentsController()
                .createQuantityBasedComponent(String.valueOf(productFamilyId), new CreateQuantityBasedComponent()));
    }
}
