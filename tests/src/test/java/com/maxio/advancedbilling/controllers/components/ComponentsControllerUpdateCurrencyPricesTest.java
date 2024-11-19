package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentCurrencyPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateCurrencyPrice;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.UpdateCurrencyPrice;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerUpdateCurrencyPricesTest extends ComponentsControllerTestBase {

    @Test
    void shouldCreateComponentPricePointCurrencyPrices() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());
        int price1UsdId = componentPricePoint.getPrices().get(0).getId();
        int price2UsdId = componentPricePoint.getPrices().get(1).getId();

        CreateCurrencyPricesRequest createCurrencyPricesRequest = new CreateCurrencyPricesRequest(
                List.of(
                        new CreateCurrencyPrice.Builder()
                                .currency("EUR")
                                .price(10.2)
                                .priceId(price1UsdId)
                                .build(),
                        new CreateCurrencyPrice.Builder()
                                .currency("EUR")
                                .price(11d)
                                .priceId(price2UsdId)
                                .build()
                )
        );

        // create new currency prices
         COMPONENTS__PRICE_POINT_CONTROLLER
                .createCurrencyPrices(componentPricePoint.getId(), createCurrencyPricesRequest);

        // get ids of created currency prices
        List<ComponentCurrencyPrice> currencyPricesWithIds = COMPONENTS__PRICE_POINT_CONTROLLER
                .updateCurrencyPrices(componentPricePoint.getId(),
                        new UpdateCurrencyPricesRequest(List.of(new UpdateCurrencyPrice())))
                .getCurrencyPrices();
        assertThat(currencyPricesWithIds).hasSize(4);
        List<Integer> currencyPricesIds = currencyPricesWithIds.stream().map(ComponentCurrencyPrice::getId).toList();

        // create update request
        Random random = new Random();
        List<UpdateCurrencyPrice> updateCurrencyPrices = currencyPricesIds.stream()
                .map(id ->
                        new UpdateCurrencyPrice.Builder()
                                .price(random.nextDouble(10, 1000))
                                .id(id)
                                .build()
                )
                .toList();

        // when
        List<ComponentCurrencyPrice> response = COMPONENTS__PRICE_POINT_CONTROLLER
                .updateCurrencyPrices(componentPricePoint.getId(), new UpdateCurrencyPricesRequest(updateCurrencyPrices))
                .getCurrencyPrices();

        // then
        assertThat(response.size()).isEqualTo(4);

        Map<Integer, ComponentCurrencyPrice> idsToPrice = response.stream().collect(
                Collectors.toMap(ComponentCurrencyPrice::getId, Function.identity())
        );

        for (int i=0; i<currencyPricesWithIds.size(); i++) {
            ComponentCurrencyPrice oldCurrencyPrice = currencyPricesWithIds.get(i);
            UpdateCurrencyPrice updatePriceRequest = updateCurrencyPrices.get(i);
            ComponentCurrencyPrice updatedPrice = idsToPrice.get(updatePriceRequest.getId());

            assertThat(updatedPrice.getCurrency()).isEqualTo(oldCurrencyPrice.getCurrency());
            String price = BigDecimal.valueOf(updatePriceRequest.getPrice())
                    .setScale(11, RoundingMode.HALF_UP).stripTrailingZeros()
                    .toString();
            assertThat(updatedPrice.getPrice()).isEqualTo(price);
            String expectedFormattedPrice = "";
            if (updatedPrice.getCurrency().equals("USD")) {
                expectedFormattedPrice = "$" + price;
            } else if (updatedPrice.getCurrency().equals("EUR")) {
                expectedFormattedPrice = "€" + price.replace('.', ',');
            }
            assertThat(updatedPrice.getFormattedPrice()).isEqualTo(expectedFormattedPrice);
            assertThat(updatedPrice.getPriceId()).isEqualTo(oldCurrencyPrice.getPriceId());
            assertThat(updatedPrice.getPricePointId()).isEqualTo(componentPricePoint.getId());
            assertThat(updatedPrice.getAdditionalProperties()).isEmpty();
        }
    }

    @Test
    void shouldNotUpdateCurrencyPriceForNonExistentPricePoint() {
        assertNotFound(() -> COMPONENTS__PRICE_POINT_CONTROLLER.updateCurrencyPrices(
                999999,
                new UpdateCurrencyPricesRequest(List.of(new UpdateCurrencyPrice()))
        ));
    }

    @Test
    void shouldNotUpdateCurrencyPricesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getComponentPricePointsController().updateCurrencyPrices(productFamilyId,
                        new UpdateCurrencyPricesRequest(List.of(new UpdateCurrencyPrice())))
        );
    }

}
