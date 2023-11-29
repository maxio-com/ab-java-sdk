package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ProductPricePointErrorResponseException;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.ProductPricePointErrors;
import com.maxio.advancedbilling.utils.CommonAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerCreateTest extends ProductPricePointsBaseTest {

    private static Product product;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn200AndCreatePricePoint() throws IOException, ApiException {
        // when
        ProductPricePoint productPricePoint = createProductPricePoint(
                product.getId(), defaultBuilder().name("Educational").handle("educational").build()
        ).getPricePoint();

        // then
        assertAll(
                () -> assertThat(productPricePoint.getId()).isNotNull(),
                () -> assertThat(productPricePoint.getName()).isEqualTo("Educational"),
                () -> assertThat(productPricePoint.getHandle()).isEqualTo("educational"),
                () -> assertThat(productPricePoint.getPriceInCents()).isEqualTo(100),
                () -> assertThat(productPricePoint.getInterval()).isEqualTo(2),
                () -> assertThat(productPricePoint.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(productPricePoint.getTrialPriceInCents()).isEqualTo(4900),
                () -> assertThat(productPricePoint.getTrialInterval()).isEqualTo(1),
                () -> assertThat(productPricePoint.getTrialIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(productPricePoint.getTrialType()).isEqualTo("payment_expected"),
                () -> assertThat(productPricePoint.getIntroductoryOffer()).isFalse(),
                () -> assertThat(productPricePoint.getInitialChargeInCents()).isEqualTo(120000),
                () -> assertThat(productPricePoint.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(productPricePoint.getExpirationInterval()).isEqualTo(12),
                () -> assertThat(productPricePoint.getExpirationIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(productPricePoint.getProductId()).isEqualTo(product.getId()),
                () -> assertThat(productPricePoint.getArchivedAt()).isNull(),
                () -> assertThat(productPricePoint.getCreatedAt()).isNotNull(),
                () -> assertThat(productPricePoint.getUpdatedAt()).isNotNull(),
                () -> assertThat(productPricePoint.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(productPricePoint.getType()).isEqualTo(PricePointType.CATALOG),
                () -> assertThat(productPricePoint.getTaxIncluded()).isFalse(),
                () -> assertThat(productPricePoint.getSubscriptionId()).isNull()
        );
    }

    @Test
    void shouldReturn404WhenCreatingPricePointForNotExistingProduct() {
        // when - then
        CommonAssertions.assertNotFound(() -> createProductPricePoint(12345, null));
    }

    @Test
    void shouldReturn422WhenPricePointInRequestIsNull() {
        // when - then
        assertThatExceptionOfType(ProductPricePointErrorResponseException.class)
                .isThrownBy(() -> createProductPricePoint(product.getId(), null))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors())
                            .extracting(
                                    ProductPricePointErrors::getPricePoint,
                                    ProductPricePointErrors::getInterval,
                                    ProductPricePointErrors::getIntervalUnit,
                                    ProductPricePointErrors::getName,
                                    ProductPricePointErrors::getPrice,
                                    ProductPricePointErrors::getPriceInCents
                            )
                            .containsExactlyElementsOf(
                                    Arrays.asList(
                                            "can't be blank",
                                            null,
                                            null,
                                            null,
                                            null,
                                            null
                                    )
                            );
                });
    }

    @Test
    void shouldReturn422WhenPricePointRequestIsEmpty() {
        // when - then
        assertThatExceptionOfType(ProductPricePointErrorResponseException.class)
                .isThrownBy(() -> createProductPricePoint(product.getId(), new CreateProductPricePoint()))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors())
                            .extracting(
                                    ProductPricePointErrors::getPricePoint,
                                    ProductPricePointErrors::getInterval,
                                    ProductPricePointErrors::getIntervalUnit,
                                    ProductPricePointErrors::getName,
                                    ProductPricePointErrors::getPrice,
                                    ProductPricePointErrors::getPriceInCents
                            )
                            .containsExactlyElementsOf(
                                    Arrays.asList(
                                            null,
                                            Collections.singletonList("Recurring Interval: must be greater than or equal to 1."),
                                            Arrays.asList("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                            Collections.singletonList("Name: cannot be blank."),
                                            null,
                                            null
                                    )
                            );
                });
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequiredParametersAreMissing")
    void shouldReturn422WhenRequiredParametersAreMissing(CreateProductPricePointRequest request, List<List<String>> expectedErrors) {
        // when - then
        assertThatExceptionOfType(ProductPricePointErrorResponseException.class)
                .isThrownBy(() -> PRODUCT_PRICE_POINTS_CONTROLLER.createProductPricePoint(product.getId(), request))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors())
                            .extracting(
                                    ProductPricePointErrors::getInterval,
                                    ProductPricePointErrors::getIntervalUnit,
                                    ProductPricePointErrors::getName,
                                    ProductPricePointErrors::getPrice,
                                    ProductPricePointErrors::getPriceInCents
                            )
                            .containsExactlyElementsOf(expectedErrors);
                });
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequiredParametersAreMissing() {
        return Stream.of(
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder().name("").build()
                        ),
                        Arrays.asList(
                                List.of("Recurring Interval: must be greater than or equal to 1."),
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                List.of("Name: cannot be blank."),
                                null, null
                        )
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder().name("price point name").build()
                        ),
                        Arrays.asList(
                                List.of("Recurring Interval: must be greater than or equal to 1."),
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                null, null, null
                        )
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .name("price point name")
                                        .priceInCents(-100L)
                                        .build()
                        ),
                        Arrays.asList(
                                List.of("Recurring Interval: must be greater than or equal to 1."),
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                null,
                                List.of("Price: must be greater than or equal to 0."),
                                null
                        )
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .name("price point name")
                                        .priceInCents(100L)
                                        .interval(0)
                                        .build()
                        ),
                        Arrays.asList(
                                List.of("Recurring Interval: must be greater than or equal to 1."),
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                null,
                                null,
                                null
                        )
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .priceInCents(100L)
                                        .interval(-1)
                                        .build()
                        ),
                        Arrays.asList(
                                List.of("Recurring Interval: must be greater than or equal to 1."),
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                List.of("Name: cannot be blank."),
                                null,
                                null
                        )
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .name("price point name")
                                        .priceInCents(100L)
                                        .interval(2)
                                        .intervalUnit(null)
                                        .build()
                        ),
                        Arrays.asList(
                                null,
                                List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."),
                                null,
                                null,
                                null
                        )
                )
        );
    }
}
