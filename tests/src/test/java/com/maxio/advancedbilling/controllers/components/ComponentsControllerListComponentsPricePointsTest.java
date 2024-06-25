package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.IncludeNullOrNotNull;
import com.maxio.advancedbilling.models.ListAllComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListComponentsPricePointsInclude;
import com.maxio.advancedbilling.models.ListPricePointsFilter;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointPricePointId;
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

public class ComponentsControllerListComponentsPricePointsTest extends ComponentsControllerTestBase {

    private static Component component;
    private static Component component2;
    private static ComponentPricePoint component1_PricePoint1;
    private static ComponentPricePoint component1_PricePoint2;
    private static ComponentPricePoint component1_PricePoint3_Archived;
    private static ComponentPricePoint component2_PricePoint1;
    private static ComponentPricePoint component2_PricePoint2;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
        component2 = createQuantityBasedComponent();

        component1_PricePoint1 = TEST_SETUP.createComponentPricePoint(component.getId(), b -> b.useSiteExchangeRate(true));
        component1_PricePoint2 = TEST_SETUP.createComponentPricePoint(component.getId(), b -> b.useSiteExchangeRate(false));
        component1_PricePoint3_Archived = TEST_SETUP.createComponentPricePoint(component.getId());
        COMPONENTS__PRICE_POINT_CONTROLLER.archiveComponentPricePoint(
                ArchiveComponentPricePointComponentId.fromNumber(component.getId()),
                ArchiveComponentPricePointPricePointId.fromNumber(component1_PricePoint3_Archived.getId())
        );

        component2_PricePoint1 = TEST_SETUP.createComponentPricePoint(component2.getId());
        component2_PricePoint2 = TEST_SETUP.createComponentPricePoint(component2.getId());
    }

    @Test
    void shouldListPricePointsWithCurrencyPrices() throws IOException, ApiException {
        // when
        Map<Integer, ComponentPricePoint> componentPricePointMap = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(
                                        new ListPricePointsFilter.Builder()
                                                .ids(List.of(component1_PricePoint1.getId(), component1_PricePoint2.getId()))
                                                .build()
                                )
                                .include(ListComponentsPricePointsInclude.CURRENCY_PRICES)
                                .build())
                .getPricePoints()
                .stream()
                .collect(Collectors.toMap(ComponentPricePoint::getId, Function.identity()));

        // then
        assertThat(componentPricePointMap.size()).isEqualTo(2);

        ComponentPricePoint component1PricePoint1Response = componentPricePointMap.get(component1_PricePoint1.getId());
        assertThat(component1PricePoint1Response)
                .usingRecursiveComparison()
                .ignoringFields("currencyPrices")
                .isEqualTo(component1_PricePoint1);
        assertThat(component1PricePoint1Response.getCurrencyPrices().size()).isEqualTo(2);
        assertSiteCurrencyPrice(component1PricePoint1Response.getCurrencyPrices().get(0),
                component1_PricePoint1.getPrices().get(0).getId(),
                component1_PricePoint1.getId());
        assertSiteCurrencyPrice(component1PricePoint1Response.getCurrencyPrices().get(1),
                component1_PricePoint1.getPrices().get(1).getId(),
                component1_PricePoint1.getId());

        ComponentPricePoint component1PricePoint2Response = componentPricePointMap.get(component1_PricePoint2.getId());
        assertThat(component1PricePoint2Response)
                .usingRecursiveComparison()
                .ignoringFields("currencyPrices")
                .isEqualTo(component1_PricePoint2);
        assertThat(component1PricePoint2Response.getCurrencyPrices().size()).isEqualTo(0);
    }

    @Test
    void shouldListArchivedPricePoints() throws IOException, ApiException {
        // when
        List<ComponentPricePoint> componentPricePoints = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(
                                        new ListPricePointsFilter.Builder()
                                                .dateField(BasicDateField.CREATED_AT)
                                                .startDatetime(component1_PricePoint1.getCreatedAt())
                                                .archivedAt(IncludeNullOrNotNull.NOT_NULL)
                                                .build()
                                )
                                .build())
                .getPricePoints();

        // then
        assertThat(componentPricePoints.size()).isEqualTo(1);

        assertThat(componentPricePoints.get(0))
                .usingRecursiveComparison()
                .ignoringFields("archivedAt", "handle")
                .isEqualTo(component1_PricePoint3_Archived);
    }

    @Test
    void shouldListPricePointsWithPagination() throws IOException, ApiException {
        // given
        List<Integer> allIds = List.of(component1_PricePoint1.getId(), component1_PricePoint2.getId(),
                component2_PricePoint1.getId(), component2_PricePoint2.getId());

        // when
        List<ComponentPricePoint> responsePage1 = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(new ListPricePointsFilter.Builder().ids(allIds).build())
                                .page(1)
                                .perPage(2)
                                .build())
                .getPricePoints();

        assertThat(responsePage1.size()).isEqualTo(2);
        assertThat(responsePage1)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(component1_PricePoint1, component1_PricePoint2);

        List<ComponentPricePoint> responsePage2 = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(new ListPricePointsFilter.Builder().ids(allIds).build())
                                .page(2)
                                .perPage(2)
                                .build())
                .getPricePoints();

        assertThat(responsePage2.size()).isEqualTo(2);
        assertThat(responsePage2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(component2_PricePoint1, component2_PricePoint2);

        List<ComponentPricePoint> responsePage3 = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(new ListPricePointsFilter.Builder().ids(allIds).build())
                                .page(3)
                                .perPage(2)
                                .build())
                .getPricePoints();

        assertThat(responsePage3).isEmpty();

        List<ComponentPricePoint> responsePageDesc = COMPONENTS__PRICE_POINT_CONTROLLER.listAllComponentPricePoints(
                        new ListAllComponentPricePointsInput.Builder()
                                .filter(new ListPricePointsFilter.Builder().ids(allIds).build())
                                .page(1)
                                .perPage(2)
                                .direction(SortingDirection.DESC)
                                .build())
                .getPricePoints();

        assertThat(responsePageDesc.size()).isEqualTo(2);
        assertThat(responsePageDesc)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(component2_PricePoint1, component2_PricePoint2);
    }

    @Test
    void shouldNotListComponentsPricePointsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentPricePointsController()
                .listAllComponentPricePoints(new ListAllComponentPricePointsInput()));
    }

}
