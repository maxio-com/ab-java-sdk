package com.maxio.advancedbilling.controllers.components.create;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.components.ComponentsControllerTestBase;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ComponentPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.MeteredComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.MeteredComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreateMeteredTest extends ComponentsControllerTestBase {

    @Test
    void shouldCreateMeteredComponent() throws IOException, ApiException {
        // given
        String price = "3.22";
        double catalogPricePointPrice1 = 5;
        double catalogPricePointPrice2 = 8.0;
        MeteredComponent meteredComponent = new MeteredComponent.Builder()
                .name("Metered Component " + randomNumeric(10))
                .handle("metered-handle-" + randomNumeric(10))
                .description("Test metered component.")
                .unitName("custom metered unit name")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(MeteredComponentUnitPrice.fromString(price))
                .taxable(true)
                .taxCode("txcode3")
                .hideDateRangeOnInvoice(false)
                .displayOnHostedPage(false)
                .publicSignupPageIds(List.of(55, 555))
                .pricePoints(List.of(
                        new ComponentPricePointItem.Builder()
                                .name("Price Point " + randomNumeric(10))
                                .handle("price-point-handle-" + randomNumeric(10))
                                .pricingScheme(PricingScheme.TIERED)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(0))
                                                .endingQuantity(PriceEndingQuantity.fromNumber(20))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice1))
                                                .build(),
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(21))
                                                .unitPrice(PriceUnitPrice.fromPrecision(catalogPricePointPrice2))
                                                .build()
                                ))
                                .build()
                ))
                .build();

        // when
        Component component = COMPONENTS_CONTROLLER.createMeteredComponent(String.valueOf(productFamilyId),
                new CreateMeteredComponent(meteredComponent)).getComponent();
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .build()
        ).getPricePoints();

        // then
        assertThat(component.getId()).isNotNull();
        assertThat(component.getKind()).isEqualTo(ComponentKind.METERED_COMPONENT);
        assertThat(component.getName()).isEqualTo(meteredComponent.getName());
        assertThat(component.getHandle()).isEqualTo(meteredComponent.getHandle());
        assertThat(component.getDescription()).isEqualTo(meteredComponent.getDescription());
        assertThat(component.getUnitPrice()).isEqualTo(price);
        assertThat(component.getTaxable()).isEqualTo(meteredComponent.getTaxable());
        assertThat(component.getTaxCode()).isEqualTo(meteredComponent.getTaxCode());
        assertThat(component.getHideDateRangeOnInvoice()).isEqualTo(meteredComponent.getHideDateRangeOnInvoice());
        assertThat(component.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(component.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(component.getCreatedAt()).isNotNull();
        assertThat(component.getUpdatedAt()).isNotNull();
        assertThat(component.getPricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(component.getUnitName()).isEqualTo(meteredComponent.getUnitName());
        assertThat(component.getPricePerUnitInCents()).isNull();
        assertThat(component.getArchived()).isFalse();
        assertThat(component.getDefaultPricePointId()).isNotNull();
        assertThat(component.getPricePointCount()).isEqualTo(2);
        assertThat(component.getPricePointsUrl()).isNotEmpty();
        assertThat(component.getDefaultPricePointName()).isNotEmpty();
        assertThat(component.getRecurring()).isFalse();
        assertThat(component.getArchivedAt()).isNull();
        assertThat(component.getUseSiteExchangeRate()).isTrue();
        assertThat(component.getItemCategory()).isNull();
        assertThat(component.getAccountingCode()).isNull();

        assertThat(pricePoints).hasSize(2);
        ComponentPricePointItem expectedPricePoint = meteredComponent.getPricePoints().get(0);
        ComponentPricePoint pricePoint = pricePoints.stream()
                .filter(pp -> pp.getName().equals(expectedPricePoint.getName()))
                .findFirst().get();
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(pricePoint.getName()).isEqualTo(expectedPricePoint.getName());
        assertThat(pricePoint.getHandle()).isEqualTo(expectedPricePoint.getHandle());
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getPricingScheme()).isEqualTo(PricingScheme.TIERED);

        assertThat(pricePoint.getPrices()).hasSize(2);
        ComponentPrice componentPrice1 = pricePoint.getPrices().get(0);
        assertThat(componentPrice1.getId()).isNotNull();
        assertThat(componentPrice1.getComponentId()).isEqualTo(component.getId());
        assertThat(componentPrice1.getStartingQuantity()).isEqualTo(0);
        assertThat(componentPrice1.getEndingQuantity()).isEqualTo(20);
        assertThat(componentPrice1.getUnitPrice()).isEqualTo(String.valueOf(catalogPricePointPrice1));
        assertThat(componentPrice1.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(componentPrice1.getFormattedUnitPrice()).isEqualTo("$5.00");
        assertThat(componentPrice1.getSegmentId()).isNull();
        ComponentPrice componentPrice2 = pricePoint.getPrices().get(1);
        assertThat(componentPrice2.getId()).isNotNull();
        assertThat(componentPrice2.getComponentId()).isEqualTo(component.getId());
        assertThat(componentPrice2.getStartingQuantity()).isEqualTo(21);
        assertThat(componentPrice2.getEndingQuantity()).isNull();
        assertThat(componentPrice2.getUnitPrice()).isEqualTo(String.valueOf(catalogPricePointPrice2));
        assertThat(componentPrice2.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(componentPrice2.getFormattedUnitPrice()).isEqualTo("$8.00");
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
        MeteredComponent meteredComponent = new MeteredComponent.Builder()
                .name("")
                .handle("wrong handle")
                .pricingScheme(PricingScheme.STAIRSTEP)
                .build();

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.createMeteredComponent(String.valueOf(productFamilyId),
                        new CreateMeteredComponent(meteredComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Name: cannot be blank.",
                        "Handle must start with a letter or number and may only contain lowercase letters, numbers, or the characters ':', '-', or '_'.",
                        "Unit name: cannot be blank.",
                        "At least 1 price bracket must be defined")
        );
    }

    @Test
    void shouldReturn422WhenNameAndHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        MeteredComponent createComponent = new MeteredComponent.Builder()
                .name("Metered Component " + randomNumeric(10))
                .handle("metered-handle-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(MeteredComponentUnitPrice.fromPrecision(10.0))
                .unitName("u")
                .build();
        COMPONENTS_CONTROLLER.createMeteredComponent(String.valueOf(productFamilyId),
                new CreateMeteredComponent(createComponent));

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.createMeteredComponent(String.valueOf(productFamilyId),
                        new CreateMeteredComponent(createComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Handle must be unique within a Site.",
                        "Name: must be unique - that value has been taken.")
        );
    }

    @Test
    void shouldNotCreateComponentForNonExistentProductFamily() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.createMeteredComponent("123",
                new CreateMeteredComponent()));
    }

    @Test
    void shouldNotCreateComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentsController()
                .createMeteredComponent(String.valueOf(productFamilyId), new CreateMeteredComponent()));
    }
}
