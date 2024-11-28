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
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.OnOffComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.OnOffComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreateOnOffTest extends ComponentsControllerTestBase {

    @Test
    void shouldCreateOnOffComponent() throws IOException, ApiException {
        // given
        String price = "15.3030134";
        double price2 = 11.3;
        OnOffComponent onOffComponent = new OnOffComponent.Builder()
                .name("On Off Component " + randomNumeric(10))
                .handle("on-off-handle-" + randomNumeric(10))
                .description("Test on/off component.")
                .unitPrice(OnOffComponentUnitPrice.fromString(price))
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
                                .pricingScheme(PricingScheme.PER_UNIT)
                                .prices(List.of(
                                        new Price.Builder()
                                                .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                .unitPrice(PriceUnitPrice.fromPrecision(price2))
                                                .build()
                                ))
                                .build()
                ))
                .build();

        // when
        Component component = COMPONENTS_CONTROLLER.createOnOffComponent(String.valueOf(productFamilyId),
                new CreateOnOffComponent(onOffComponent)).getComponent();
        List<ComponentPricePoint> pricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .build()
        ).getPricePoints();

        // then
        assertThat(component.getId()).isNotNull();
        assertThat(component.getKind()).isEqualTo(ComponentKind.ON_OFF_COMPONENT);
        assertThat(component.getName()).isEqualTo(onOffComponent.getName());
        assertThat(component.getHandle()).isEqualTo(onOffComponent.getHandle());
        assertThat(component.getDescription()).isEqualTo(onOffComponent.getDescription());
        assertThat(component.getUnitPrice()).isEqualTo(price);
        assertThat(component.getTaxable()).isEqualTo(onOffComponent.getTaxable());
        assertThat(component.getTaxCode()).isEqualTo(onOffComponent.getTaxCode());
        assertThat(component.getUpgradeCharge()).isEqualTo(onOffComponent.getUpgradeCharge());
        assertThat(component.getDowngradeCredit()).isEqualTo(onOffComponent.getDowngradeCredit());
        assertThat(component.getHideDateRangeOnInvoice()).isEqualTo(onOffComponent.getHideDateRangeOnInvoice());
        assertThat(component.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(component.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(component.getCreatedAt()).isNotNull();
        assertThat(component.getUpdatedAt()).isNotNull();
        assertThat(component.getPricingScheme()).isNull();
        assertThat(component.getUnitName()).isEqualTo("on/off");
        assertThat(component.getPricePerUnitInCents()).isNull();
        assertThat(component.getArchived()).isFalse();
        assertThat(component.getDefaultPricePointId()).isNotNull();
        assertThat(component.getPricePointCount()).isEqualTo(2);
        assertThat(component.getPricePointsUrl()).isNotEmpty();
        assertThat(component.getDefaultPricePointName()).isNotEmpty();
        assertThat(component.getRecurring()).isTrue();
        assertThat(component.getArchivedAt()).isNull();
        assertThat(component.getUseSiteExchangeRate()).isTrue();
        assertThat(component.getItemCategory()).isNull();
        assertThat(component.getAccountingCode()).isNull();

        assertThat(pricePoints).hasSize(2);
        ComponentPricePointItem expectedPricePoint = onOffComponent.getPricePoints().get(0);
        ComponentPricePoint pricePoint = pricePoints.stream()
                .filter(pp -> pp.getName().equals(expectedPricePoint.getName()))
                .findFirst().get();
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(pricePoint.getName()).isEqualTo(expectedPricePoint.getName());
        assertThat(pricePoint.getHandle()).isEqualTo(expectedPricePoint.getHandle());
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getPricingScheme()).isEqualTo(PricingScheme.PER_UNIT);

        assertThat(pricePoint.getPrices()).hasSize(1);
        ComponentPrice componentPrice = pricePoint.getPrices().get(0);
        assertThat(componentPrice.getId()).isNotNull();
        assertThat(componentPrice.getComponentId()).isEqualTo(component.getId());
        assertThat(componentPrice.getStartingQuantity()).isEqualTo(1);
        assertThat(componentPrice.getEndingQuantity()).isNull();
        assertThat(componentPrice.getUnitPrice()).isEqualTo(String.valueOf(price2));
        assertThat(componentPrice.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(componentPrice.getFormattedUnitPrice()).isEqualTo("$11.30");
        assertThat(componentPrice.getSegmentId()).isNull();

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
        OnOffComponent createComponent = new OnOffComponent.Builder()
                .name("On Off Component " + randomNumeric(10))
                .handle("wrong handle")
                .build();

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.createOnOffComponent(String.valueOf(productFamilyId),
                        new CreateOnOffComponent(createComponent)),
                e -> assertThat(new HashSet(e.getErrors())).containsExactly(
                        "Unit price: cannot be blank.",
                        "Handle must start with a letter or number and may only contain lowercase letters, " +
                                "numbers, or the characters ':', '-', or '_'.")
        );
    }

    @Test
    void shouldReturn422WhenNameAndHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        OnOffComponent createComponent = new OnOffComponent.Builder()
                .name("On Off Component " + randomNumeric(10))
                .handle("on-off-handle-" + randomNumeric(10))
                .unitPrice(OnOffComponentUnitPrice.fromPrecision(10.0))
                .build();
        COMPONENTS_CONTROLLER.createOnOffComponent(String.valueOf(productFamilyId),
                new CreateOnOffComponent(createComponent));

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.createOnOffComponent(String.valueOf(productFamilyId),
                        new CreateOnOffComponent(createComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Handle must be unique within a Site.",
                        "Name: must be unique - that value has been taken.")
        );
    }

    @Test
    void shouldNotCreateComponentForNonExistentProductFamily() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.createOnOffComponent("123",
                new CreateOnOffComponent()));
    }

    @Test
    void shouldNotCreateComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentsController()
                .createOnOffComponent(String.valueOf(productFamilyId), new CreateOnOffComponent()));
    }
}
