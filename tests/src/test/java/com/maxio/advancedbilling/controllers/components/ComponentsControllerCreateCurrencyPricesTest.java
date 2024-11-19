package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentCurrencyPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateCurrencyPrice;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerCreateCurrencyPricesTest extends ComponentsControllerTestBase {

    private static Component component;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
    }

    @Test
    void shouldCreateComponentPricePointCurrencyPrices() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());
        int price1Id = componentPricePoint.getPrices().get(0).getId();
        int price2Id = componentPricePoint.getPrices().get(1).getId();

        CreateCurrencyPricesRequest createCurrencyPricesRequest = new CreateCurrencyPricesRequest(
                List.of(
                        new CreateCurrencyPrice.Builder()
                                .currency("EUR")
                                .price(10.2)
                                .priceId(price1Id)
                                .build(),
                        new CreateCurrencyPrice.Builder()
                                .currency("EUR")
                                .price(11.0)
                                .priceId(price2Id)
                                .build()
                )
        );

        // when
        List<ComponentCurrencyPrice> response = COMPONENTS__PRICE_POINT_CONTROLLER
                .createCurrencyPrices(componentPricePoint.getId(), createCurrencyPricesRequest)
                .getCurrencyPrices();

        // then
        assertThat(response.size()).isEqualTo(2);

        assertThat(response.get(0).getId()).isNotNull();
        assertThat(response.get(0).getCurrency()).isEqualTo("EUR");
        assertThat(response.get(0).getPriceId()).isEqualTo(price1Id);
        assertThat(response.get(0).getPrice()).isEqualTo("10.2");
        assertThat(response.get(0).getFormattedPrice()).isEqualTo("€10,20");
        assertThat(response.get(0).getPricePointId()).isEqualTo(componentPricePoint.getId());

        assertThat(response.get(1).getId()).isNotNull();
        assertThat(response.get(1).getCurrency()).isEqualTo("EUR");
        assertThat(response.get(1).getPriceId()).isEqualTo(price2Id);
        assertThat(response.get(1).getPrice()).isEqualTo("11.0");
        assertThat(response.get(1).getFormattedPrice()).isEqualTo("€11,00");
        assertThat(response.get(1).getPricePointId()).isEqualTo(componentPricePoint.getId());
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenCreatingCurrencyPricesWithInvalidData")
    void shouldReturn422WhenCreatingCurrencyPricesWithInvalidData(CreateCurrencyPricesRequest request,
                                                                  Map<String, List<String>> expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ErrorArrayMapResponseException.class,
                () -> COMPONENTS__PRICE_POINT_CONTROLLER.createCurrencyPrices(
                        component.getDefaultPricePointId(),
                        request
                ),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrderEntriesOf(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenCreatingCurrencyPricesWithInvalidData() {
        int priceId = component.getPrices().get(0).getId();
        return Stream.of(
                Arguments.of(
                        new CreateCurrencyPricesRequest(
                                List.of(
                                        new CreateCurrencyPrice.Builder()
                                                .currency("abc")
                                                .price(10.2)
                                                .priceId(priceId)
                                                .build())),
                        Map.of(
                                "currency_prices[0].currency", List.of("Currency: is not one of the allowed values.",
                                        "Currency must be defined on the site level."))
                ),
                Arguments.of(
                        new CreateCurrencyPricesRequest(
                                List.of(
                                        new CreateCurrencyPrice.Builder()
                                                .currency("USD")
                                                .price(-10d)
                                                .priceId(priceId)
                                                .build()
                                )),
                        Map.of(
                                "currency_prices[0].price", List.of("Unit price: must be greater than or equal to $0.00."),
                                "currency_prices[0].currency", List.of("Pricing already exists for this currency."))
                ),
                Arguments.of(
                        new CreateCurrencyPricesRequest(
                                List.of(
                                        new CreateCurrencyPrice.Builder()
                                                .currency("USD")
                                                .price(10d)
                                                .priceId(0)
                                                .build()
                                )),
                        Map.of("base", List.of("Missing definition for prices with ids: [%s].".formatted(priceId)))
                )
        );
    }

    @Test
    void shouldNotCreateCurrencyPriceForNonExistentPricePoint() {
        assertNotFound(() -> COMPONENTS__PRICE_POINT_CONTROLLER.createCurrencyPrices(
                99999,
                new CreateCurrencyPricesRequest(List.of())
        ));
    }

    @Test
    void shouldNotCreateCurrencyPricesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getComponentPricePointsController().createCurrencyPrices(productFamilyId,
                        new CreateCurrencyPricesRequest(List.of()))
        );
    }

}
