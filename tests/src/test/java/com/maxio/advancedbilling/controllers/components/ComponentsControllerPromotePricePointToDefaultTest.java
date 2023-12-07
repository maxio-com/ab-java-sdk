package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointRequestPricePoint;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerPromotePricePointToDefaultTest extends ComponentsControllerTestBase {

    @Test
    void shouldPromoteComponentPricePointToDefault() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name("New price point")
                .handle("new-price-point-" + randomNumeric(5))
                .pricingScheme("stairstep")
                .prices(
                        List.of(
                                new Price.Builder()
                                        .unitPrice(PriceUnitPrice.fromPrecision(5.00))
                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                        .endingQuantity(PriceEndingQuantity.fromNumber(2))
                                        .build()
                        )
                )
                .build();

        ComponentPricePoint catalogPricePoint = COMPONENTS_CONTROLLER
                .createComponentPricePoint(component.getId(),
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(
                                                createComponentPricePoint
                                        )
                        )).getPricePoint();

        // when
        Component componentWithUpdatedPricePoint = COMPONENTS_CONTROLLER
                .updateDefaultPricePointForComponent(
                        component.getId(),
                        catalogPricePoint.getId()
                ).getComponent();

        // then
        assertThat(componentWithUpdatedPricePoint).usingRecursiveComparison()
                .ignoringFields("updatedAt", "pricingScheme", "defaultPricePointId", "prices",
                        "defaultPricePointName", "pricePointCount", "unitPrice")
                .isEqualTo(component);
        assertThat(componentWithUpdatedPricePoint.getDefaultPricePointId()).isEqualTo(catalogPricePoint.getId());
        assertThat(componentWithUpdatedPricePoint.getPricingScheme()).isEqualTo(catalogPricePoint.getPricingScheme());
        assertThat(componentWithUpdatedPricePoint.getPrices()).usingRecursiveComparison()
                .isEqualTo(catalogPricePoint.getPrices());
        assertThat(componentWithUpdatedPricePoint.getDefaultPricePointName()).isEqualTo(catalogPricePoint.getName());
        assertThat(componentWithUpdatedPricePoint.getUnitPrice()).isNull();
        assertThat(componentWithUpdatedPricePoint.getPricePointCount()).isEqualTo(2);
    }

    @SuppressWarnings("rawtypes")
    @Test
    void shouldNotPromoteComponentPricePointToDefaultUsingNotExistentPricePoint() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when-then
        new ApiExceptionAssert(() -> COMPONENTS_CONTROLLER
                .updateDefaultPricePointForComponent(component.getId(), 3))
                .hasErrorCode(422)
                .hasHttpNotOkMessage();
    }

}
