package com.maxio.advancedbilling.controllers.components.create;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ComponentPricePointsController;
import com.maxio.advancedbilling.controllers.ComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ComponentPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.CreateEBBComponent;
import com.maxio.advancedbilling.models.EBBComponent;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.EBBComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreateEventsBasedTest {

    private static final int PRECONFIGURED_METRIC_ID = 2377;
    private static final int PRECONFIGURED_PRODUCT_FAMILY_ID = 2721199;

    private final AdvancedBillingClient client = TestClientProvider.getPreconfiguredSiteClient();
    private final ComponentsController componentsController = client.getComponentsController();
    private final ComponentPricePointsController componentPricePointsController = client.getComponentPricePointsController();

    private List<Component> components = new ArrayList<>();

    @AfterAll
    void tearDown() throws IOException, ApiException {
        for (Component component : components) {
            componentsController.archiveComponent(PRECONFIGURED_PRODUCT_FAMILY_ID, String.valueOf(component.getId()));
        }
    }

    @Test
    void shouldCreateEventsBased() throws IOException, ApiException {
        // given
        String price = "15.3030134";
        double catalogPricePointPrice1 = 103;
        double catalogPricePointPrice2 = 1.523;
        EBBComponent ebbComponent = new EBBComponent.Builder()
                .name("Events Based Component " + randomNumeric(10))
                .handle("events-based-handle-" + randomNumeric(10))
                .description("Test events based component.")
                .unitName("custom ebb unit")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(EBBComponentUnitPrice.fromString(price))
                .taxable(true)
                .taxCode("txcode4")
                .hideDateRangeOnInvoice(false)
                .eventBasedBillingMetricId(PRECONFIGURED_METRIC_ID)
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
        Component component = componentsController.createEventBasedComponent(String.valueOf(PRECONFIGURED_PRODUCT_FAMILY_ID),
                new CreateEBBComponent(ebbComponent)).getComponent();
        components.add(component);
        List<ComponentPricePoint> pricePoints = componentPricePointsController.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .build()
        ).getPricePoints();

        // then
        assertThat(component.getId()).isNotNull();
        assertThat(component.getKind()).isEqualTo(ComponentKind.EVENT_BASED_COMPONENT);
        assertThat(component.getName()).isEqualTo(ebbComponent.getName());
        assertThat(component.getHandle()).isEqualTo(ebbComponent.getHandle());
        assertThat(component.getDescription()).isEqualTo(ebbComponent.getDescription());
        assertThat(component.getUnitPrice()).isEqualTo(price);
        assertThat(component.getTaxable()).isEqualTo(ebbComponent.getTaxable());
        assertThat(component.getTaxCode()).isEqualTo(ebbComponent.getTaxCode());
        assertThat(component.getHideDateRangeOnInvoice()).isEqualTo(ebbComponent.getHideDateRangeOnInvoice());
        assertThat(component.getProductFamilyId()).isEqualTo(PRECONFIGURED_PRODUCT_FAMILY_ID);
        assertThat(component.getProductFamilyName()).isNotEmpty();
        assertThat(component.getCreatedAt()).isNotNull();
        assertThat(component.getUpdatedAt()).isNotNull();
        assertThat(component.getPricingScheme()).isEqualTo(PricingScheme.PER_UNIT);
        assertThat(component.getUnitName()).isEqualTo(ebbComponent.getUnitName());
        assertThat(component.getEventBasedBillingMetricId()).isEqualTo(ebbComponent.getEventBasedBillingMetricId());
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
        assertThat(component.getUpgradeCharge()).isNull();
        assertThat(component.getDowngradeCredit()).isNull();

        assertThat(pricePoints).hasSize(2);
        ComponentPricePointItem expectedPricePoint = ebbComponent.getPricePoints().get(0);
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
        EBBComponent ebbComponent = new EBBComponent.Builder()
                .name("Events Based Component " + randomNumeric(10))
                .handle("wrong handle")
                .pricingScheme(PricingScheme.VOLUME)
                .build();

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> componentsController.createEventBasedComponent(String.valueOf(PRECONFIGURED_PRODUCT_FAMILY_ID),
                        new CreateEBBComponent(ebbComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Handle must start with a letter or number and may only contain lowercase letters, numbers, or the characters ':', '-', or '_'.",
                        "Unit name: cannot be blank.",
                        "Metric: cannot be blank.",
                        "At least 1 price bracket must be defined")
        );
    }

    @Test
    void shouldReturn422WhenNameAndHandleIsAlreadyUsed() throws IOException, ApiException {
        // given
        EBBComponent createComponent = new EBBComponent.Builder()
                .name("Events Based Component " + randomNumeric(10))
                .handle("events-based-handle-" + randomNumeric(10))
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(EBBComponentUnitPrice.fromPrecision(10.0))
                .unitName("u")
                .eventBasedBillingMetricId(PRECONFIGURED_METRIC_ID)
                .build();
        Component component = componentsController.createEventBasedComponent(String.valueOf(PRECONFIGURED_PRODUCT_FAMILY_ID),
                new CreateEBBComponent(createComponent)).getComponent();
        components.add(component);

        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> componentsController.createEventBasedComponent(String.valueOf(PRECONFIGURED_PRODUCT_FAMILY_ID),
                        new CreateEBBComponent(createComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder(
                        "Handle must be unique within a Site.",
                        "Name: must be unique - that value has been taken.")
        );
    }

    @Test
    void shouldNotCreateComponentForNonExistentProductFamily() {
        assertNotFound(() -> componentsController.createEventBasedComponent("123",
                new CreateEBBComponent()));
    }

    @Test
    void shouldNotCreateComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient(client.getSite()).getComponentsController()
                .createEventBasedComponent(String.valueOf(PRECONFIGURED_PRODUCT_FAMILY_ID), new CreateEBBComponent()));
    }
}
