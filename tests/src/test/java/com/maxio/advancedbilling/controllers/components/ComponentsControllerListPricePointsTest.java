package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentCurrencyPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.CreateCurrencyPrice;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.PricePointType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.controllers.components.ComponentPricePointsAssertions.assertSiteCurrencyPrice;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerListPricePointsTest extends ComponentsControllerTestBase {

    private static Component component;
    private static ComponentPricePoint componentPricePoint1;
    private static ComponentPricePoint componentPricePoint2;
    private static List<ComponentCurrencyPrice> componentPricePoint2CurrencyPrices;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
        componentPricePoint1 = TEST_SETUP.createComponentPricePoint(component.getId(), b -> b.useSiteExchangeRate(true));
        componentPricePoint2 = TEST_SETUP.createComponentPricePoint(component.getId(), b -> b.useSiteExchangeRate(false));

        CreateCurrencyPricesRequest createCurrencyPricesRequest = new CreateCurrencyPricesRequest(
                List.of(
                        new CreateCurrencyPrice.Builder()
                                .priceId(componentPricePoint2.getPrices().get(0).getId())
                                .currency("EUR")
                                .price(10.0)
                                .build(),
                        new CreateCurrencyPrice.Builder()
                                .priceId(componentPricePoint2.getPrices().get(1).getId())
                                .currency("EUR")
                                .price(11.0)
                                .build()
                )
        );

        componentPricePoint2CurrencyPrices = COMPONENTS_CONTROLLER
                .createCurrencyPrices(componentPricePoint2.getId(), createCurrencyPricesRequest)
                .getCurrencyPrices();
    }

    @Test
    void shouldListPricePointsWithCurrencyPrices() throws IOException, ApiException {
        // when
        ComponentPricePointsResponse response = COMPONENTS_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .currencyPrices(true)
                        .build()
        );
        Map<Integer, ComponentPricePoint> componentPricePointMap = response
                .getPricePoints()
                .stream()
                .collect(Collectors.toMap(ComponentPricePoint::getId, Function.identity()));

        // then
        assertThat(componentPricePointMap.size()).isEqualTo(3);

        ComponentPricePoint defaultPricePoint = componentPricePointMap.get(component.getDefaultPricePointId());
        assertThat(defaultPricePoint.getType()).isEqualTo(PricePointType.ENUM_DEFAULT);
        assertThat(defaultPricePoint.getPricingScheme()).isEqualTo(component.getPricingScheme());
        assertThat(defaultPricePoint.getDefault()).isTrue();
        assertThat(defaultPricePoint.getName()).isNotNull();
        assertThat(defaultPricePoint.getHandle()).isNotNull();
        assertThat(defaultPricePoint.getComponentId()).isEqualTo(component.getId());
        assertThat(defaultPricePoint.getArchivedAt()).isNull();
        assertThat(defaultPricePoint.getCreatedAt()).isNotNull();
        assertThat(defaultPricePoint.getUpdatedAt()).isNotNull();
        assertThat(defaultPricePoint.getPrices().size()).isEqualTo(1);
        assertThat(defaultPricePoint.getPrices().get(0)).usingRecursiveComparison()
                .isEqualTo(component.getPrices().get(0));
        assertThat(defaultPricePoint.getUseSiteExchangeRate()).isTrue();
        assertThat(defaultPricePoint.getSubscriptionId()).isNull();
        assertThat(defaultPricePoint.getTaxIncluded()).isFalse();
        assertThat(defaultPricePoint.getInterval()).isNull();
        assertThat(defaultPricePoint.getIntervalUnit()).isNull();

        ComponentPricePoint componentPricePoint1Response = componentPricePointMap.get(componentPricePoint1.getId());
        assertThat(componentPricePoint1Response)
                .usingRecursiveComparison()
                .ignoringFields("currencyPrices")
                .isEqualTo(componentPricePoint1);

        assertThat(componentPricePoint1Response.getCurrencyPrices().size()).isEqualTo(2);
        assertSiteCurrencyPrice(componentPricePoint1Response.getCurrencyPrices().get(0),
                componentPricePoint1.getPrices().get(0).getId(),
                componentPricePoint1.getId());
        assertSiteCurrencyPrice(componentPricePoint1Response.getCurrencyPrices().get(1),
                componentPricePoint1.getPrices().get(1).getId(),
                componentPricePoint1.getId());

        ComponentPricePoint componentPricePoint2Response = componentPricePointMap.get(componentPricePoint2.getId());
        assertThat(componentPricePoint2Response)
                .usingRecursiveComparison()
                .ignoringFields("currencyPrices")
                .isEqualTo(componentPricePoint2);
        assertThat(componentPricePoint2Response.getCurrencyPrices())
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(componentPricePoint2CurrencyPrices);

        assertThat(response.getMeta().getTotalCount()).isEqualTo(3);
        assertThat(response.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(response.getMeta().getTotalPages()).isEqualTo(1);
        assertThat(response.getMeta().getPerPage()).isEqualTo(20);
    }

    @Test
    void shouldListPricePointsWithPagination() throws IOException, ApiException {
        // when-then
        ComponentPricePointsResponse responsePage1 = COMPONENTS_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .page(1)
                        .perPage(2)
                        .build()
        );
        assertThat(responsePage1.getPricePoints().size()).isEqualTo(2);
        assertThat(responsePage1.getMeta().getTotalCount()).isEqualTo(3);
        assertThat(responsePage1.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(responsePage1.getMeta().getTotalPages()).isEqualTo(2);
        assertThat(responsePage1.getMeta().getPerPage()).isEqualTo(2);

        ComponentPricePointsResponse responsePage2 = COMPONENTS_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .page(2)
                        .perPage(2)
                        .build()
        );
        assertThat(responsePage2.getPricePoints().size()).isEqualTo(1);
        assertThat(responsePage2.getMeta().getTotalCount()).isEqualTo(3);
        assertThat(responsePage2.getMeta().getCurrentPage()).isEqualTo(2);
        assertThat(responsePage2.getMeta().getTotalPages()).isEqualTo(2);
        assertThat(responsePage2.getMeta().getPerPage()).isEqualTo(2);
    }

    @Test
    void shouldListPricePointsWithTypeFilters() throws IOException, ApiException {
        // when-then
        ComponentPricePointsResponse defaultPricePoints = COMPONENTS_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .filterType(List.of(PricePointType.ENUM_DEFAULT))
                        .build()
        );
        assertThat(defaultPricePoints.getPricePoints().size()).isEqualTo(1);
        assertThat(defaultPricePoints.getPricePoints().get(0).getType()).isEqualTo(PricePointType.ENUM_DEFAULT);

        ComponentPricePointsResponse catalogPricePoints = COMPONENTS_CONTROLLER.listComponentPricePoints(
                new ListComponentPricePointsInput.Builder()
                        .componentId(component.getId())
                        .filterType(List.of(PricePointType.CATALOG))
                        .build()
        );
        assertThat(catalogPricePoints.getPricePoints().size()).isEqualTo(2);
        assertThat(catalogPricePoints.getPricePoints().get(0).getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(catalogPricePoints.getPricePoints().get(1).getType()).isEqualTo(PricePointType.CATALOG);
    }

    @Test
    void shouldNotListPricePointsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .listComponentPricePoints(new ListComponentPricePointsInput()));
    }

}
