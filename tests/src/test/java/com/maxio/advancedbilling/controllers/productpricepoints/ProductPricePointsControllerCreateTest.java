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
import com.maxio.advancedbilling.models.containers.CreateProductPricePointProductId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerCreateTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn201AndCreatePricePoint() throws IOException, ApiException {
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
        assertNotFound(() -> createProductPricePoint(12345, null));
    }

    @Test
    void shouldReturn422WhenPricePointInRequestIsNull() {
        // when - then
        assertUnprocessableEntity(
                ProductPricePointErrorResponseException.class,
                () -> createProductPricePoint(product.getId(), null),
                e -> assertThat(e.getErrors())
                        .usingRecursiveComparison()
                        .isEqualTo(new ProductPricePointErrors.Builder().pricePoint("can't be blank").build())
        );
    }

    @Test
    void shouldReturn422WhenPricePointRequestIsEmpty() {
        // when - then
        assertUnprocessableEntity(
                ProductPricePointErrorResponseException.class,
                () -> createProductPricePoint(product.getId(), new CreateProductPricePoint()),
                e -> assertThat(e.getErrors())
                        .usingRecursiveComparison()
                        .isEqualTo(new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .name(List.of("Name: cannot be blank."))
                                .build()
                        )
        );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequiredParametersAreMissing")
    void shouldReturn422WhenRequiredParametersAreMissing(CreateProductPricePointRequest request, ProductPricePointErrors expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ProductPricePointErrorResponseException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER
                        .createProductPricePoint(CreateProductPricePointProductId.fromNumber(product.getId()), request),
                e -> assertThat(e.getErrors())
                        .usingRecursiveComparison()
                        .isEqualTo(expectedErrors)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequiredParametersAreMissing() {
        return Stream.of(
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder().name("").build()
                        ),
                        new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .name(List.of("Name: cannot be blank."))
                                .build()
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder().name("price point name").build()
                        ),
                        new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .build()
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .name("price point name")
                                        .priceInCents(-100L)
                                        .build()
                        ),
                        new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .price(List.of("Price: must be greater than or equal to 0."))
                                .build()
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .name("price point name")
                                        .priceInCents(100L)
                                        .interval(0)
                                        .build()
                        ),
                        new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .build()
                ),
                Arguments.of(
                        new CreateProductPricePointRequest(
                                new CreateProductPricePoint.Builder()
                                        .priceInCents(100L)
                                        .interval(-1)
                                        .build()
                        ),
                        new ProductPricePointErrors.Builder()
                                .interval(List.of("Recurring Interval: must be greater than or equal to 1."))
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .name(List.of("Name: cannot be blank."))
                                .build()
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
                        new ProductPricePointErrors.Builder()
                                .intervalUnit(List.of("Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."))
                                .build()
                )
        );
    }
}
