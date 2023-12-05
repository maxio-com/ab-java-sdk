package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorMapResponseException;
import com.maxio.advancedbilling.models.CreateProductCurrencyPrice;
import com.maxio.advancedbilling.models.CreateProductCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CurrencyPrice;
import com.maxio.advancedbilling.models.CurrencyPriceRole;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.UpdateCurrencyPrice;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerUpdateCurrencyPricesTest extends ProductPricePointsBaseTest {

    @Test
    void shouldReturn404WhenProductPricePointNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.updateProductCurrencyPrices(
                12345,
                new UpdateCurrencyPricesRequest.Builder(List.of(new UpdateCurrencyPrice())).build())
        );
    }

    @Test
    void shouldUpdateCurrencyPrices() throws IOException, ApiException {
        // given
        Product product = createProduct();

        CurrencyPrice currencyPrice = PRODUCT_PRICE_POINTS_CONTROLLER
                .createProductCurrencyPrices(
                        product.getDefaultProductPricePointId(),
                        new CreateProductCurrencyPricesRequest(List.of(
                                new CreateProductCurrencyPrice.Builder()
                                        .currency("EUR")
                                        .price(123)
                                        .role(CurrencyPriceRole.BASELINE)
                                        .build()
                        ))
                )
                .getCurrencyPrices()
                .get(0);

        // when
        CurrencyPrice updatedCurrencyPrice = PRODUCT_PRICE_POINTS_CONTROLLER
                .updateProductCurrencyPrices(
                        product.getDefaultProductPricePointId(),
                        new UpdateCurrencyPricesRequest(List.of(
                                new UpdateCurrencyPrice(currencyPrice.getId(), 999)
                        ))
                )
                .getCurrencyPrices()
                .get(0);

        // then
        assertThat(updatedCurrencyPrice.getPrice()).isEqualTo(999);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided")
    void shouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided(int productPricePointId,
                                                                               UpdateCurrencyPricesRequest request,
                                                                               Map<String, String> expectedErrors) {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                ErrorMapResponseException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.updateProductCurrencyPrices(productPricePointId, request),
                e -> assertThat(e.getErrors()).containsExactlyEntriesOf(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided()
            throws IOException, ApiException {
        Product product = createProduct();

        CurrencyPrice currencyPrice = PRODUCT_PRICE_POINTS_CONTROLLER
                .createProductCurrencyPrices(
                        product.getDefaultProductPricePointId(),
                        new CreateProductCurrencyPricesRequest(List.of(
                                new CreateProductCurrencyPrice.Builder()
                                        .currency("EUR")
                                        .price(123)
                                        .role(CurrencyPriceRole.BASELINE)
                                        .build()
                        ))
                )
                .getCurrencyPrices()
                .get(0);

        return Stream.of(
                Arguments.of(
                        product.getDefaultProductPricePointId(),
                        new UpdateCurrencyPricesRequest(null),
                        Map.of("currency_prices", "can't be blank")
                ),
                Arguments.of(
                        product.getDefaultProductPricePointId(),
                        new UpdateCurrencyPricesRequest(List.of()),
                        Map.of("currency_prices", "can't be blank")
                ),
                Arguments.of(
                        product.getDefaultProductPricePointId(),
                        new UpdateCurrencyPricesRequest(List.of(
                                new UpdateCurrencyPrice(12345, 200)
                        )),
                        Map.of("base", List.of("Could not find records for all specified prices."))
                ),
                Arguments.of(
                        product.getDefaultProductPricePointId(),
                        new UpdateCurrencyPricesRequest(List.of(
                                new UpdateCurrencyPrice(currencyPrice.getId(), -10)
                        )),
                        Map.of("currency_prices[0].price", List.of("Price: must be greater than or equal to €0,00."))
                )
        );
    }
}
