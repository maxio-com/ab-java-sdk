package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.models.CreateProductCurrencyPrice;
import com.maxio.advancedbilling.models.CreateProductCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CurrencyPrice;
import com.maxio.advancedbilling.models.CurrencyPriceRole;
import com.maxio.advancedbilling.models.Product;
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
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerCreateProductCurrencyPricesTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeAll
    void beforeAll() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn404WhenProductPricePointNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER
                .createProductCurrencyPrices(12345, new CreateProductCurrencyPricesRequest())
        );
    }

    @Test
    void shouldCreateProductCurrencyPrices() throws IOException, ApiException {
        // when
        List<CurrencyPrice> currencyPrices = PRODUCT_PRICE_POINTS_CONTROLLER
                .createProductCurrencyPrices(
                        product.getDefaultProductPricePointId(),
                        new CreateProductCurrencyPricesRequest.Builder()
                                .currencyPrices(List.of(
                                        new CreateProductCurrencyPrice.Builder()
                                                .role(CurrencyPriceRole.BASELINE)
                                                .currency("EUR")
                                                .price(123)
                                                .build())
                                )
                                .build()
                )
                .getCurrencyPrices();

        // then
        assertThat(currencyPrices).hasSize(1);
        CurrencyPrice currencyPrice = currencyPrices.get(0);
        assertAll(
                () -> assertThat(currencyPrice.getId()).isNotNull(),
                () -> assertThat(currencyPrice.getCurrency()).isEqualTo("EUR"),
                () -> assertThat(currencyPrice.getPrice()).isEqualTo(Double.valueOf(123)),
                () -> assertThat(currencyPrice.getFormattedPrice()).isEqualTo("€123,00"),
                () -> assertThat(currencyPrice.getProductPricePointId()).isNotNull(),
                () -> assertThat(currencyPrice.getRole()).isEqualTo(CurrencyPriceRole.BASELINE)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided")
    void shouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided(CreateProductCurrencyPricesRequest request,
                                                                               Map<String, String> expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ErrorArrayMapResponseException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.createProductCurrencyPrices(product.getDefaultProductPricePointId(), request),
                e -> assertThat(e.getErrors()).containsExactlyEntriesOf(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsMissingOrRequiredFieldsAreNotProvided() {
        return Stream.of(
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(null),
                        Map.of("currency_prices", "can't be blank")
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of()),
                        Map.of("currency_prices", "can't be blank")
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of(new CreateProductCurrencyPrice())),
                        Map.of("base", List.of("This product price point requires that prices are defined for: [baseline]."))
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of(
                                new CreateProductCurrencyPrice(),
                                new CreateProductCurrencyPrice())
                        ),
                        Map.of("base", List.of("Cannot create multiple prices for the same role."))
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of(new CreateProductCurrencyPrice.Builder()
                                .currency("EUR")
                                .price(123)
                                .role(CurrencyPriceRole.INITIAL)
                                .build())
                        ),
                        Map.of("base", List.of("This product price point requires that prices are defined for: [baseline]."))
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of(new CreateProductCurrencyPrice.Builder()
                                .role(CurrencyPriceRole.BASELINE)
                                .currency("EUR")
                                .price(-123)
                                .build())
                        ),
                        Map.of("price", List.of("Price: must be greater than or equal to €0,00."))
                ),
                Arguments.of(
                        new CreateProductCurrencyPricesRequest(List.of(new CreateProductCurrencyPrice.Builder()
                                .role(CurrencyPriceRole.BASELINE)
                                .currency("ABC")
                                .price(123)
                                .build())
                        ),
                        Map.of("currency", List.of(
                                "Currency: is not one of the allowed values.",
                                "Currency must be defined on the site level.",
                                "Currency: is not one of the allowed values.",
                                "Currency must be defined on the site level.",
                                "Currency: is not one of the allowed values.",
                                "Currency must be defined on the site level."
                        ))
                )
        );
    }
}
