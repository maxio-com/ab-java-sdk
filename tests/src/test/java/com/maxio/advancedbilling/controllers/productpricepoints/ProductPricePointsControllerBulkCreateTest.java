package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BulkCreateProductPricePointsRequest;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerBulkCreateTest extends ProductPricePointsBaseTest {

    private static Product product;

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn201AndCreatePricePoints() throws IOException, ApiException {
        // when
        List<ProductPricePoint> pricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .bulkCreateProductPricePoints(
                        product.getId(),
                        new BulkCreateProductPricePointsRequest(List.of(
                                defaultBuilder().name("price-point-name-1").build(),
                                defaultBuilder().name("price-point-name-2").build()
                        ))
                )
                .getPricePoints();

        // then
        assertThat(pricePoints)
                .hasSize(3)
                .extracting(ProductPricePoint::getName)
                .containsExactlyInAnyOrder("Original", "price-point-name-1", "price-point-name-2");
    }

    @Test
    void shouldReturn404WhenCreatingPricePointsForNotExistingProduct() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER
                .bulkCreateProductPricePoints(12345, new BulkCreateProductPricePointsRequest())
        );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn201WithDefaultProductPricePointOnlyWhenRequestIsNullOrContainsNullOrEmptyList")
    void shouldReturn201WithDefaultProductPricePointOnlyWhenRequestIsNullOrContainsNullOrEmptyList(BulkCreateProductPricePointsRequest request)
            throws IOException, ApiException {
        // when
        List<ProductPricePoint> pricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .bulkCreateProductPricePoints(createProduct().getId(), request) // new different product
                .getPricePoints();

        // then
        assertThat(pricePoints)
                .hasSize(1)
                .extracting(ProductPricePoint::getName)
                .containsExactly("Original");
    }

    private static Stream<Arguments> argsForShouldReturn201WithDefaultProductPricePointOnlyWhenRequestIsNullOrContainsNullOrEmptyList() {
        return Stream.of(
                Arguments.of((Object) null),
                Arguments.of(new BulkCreateProductPricePointsRequest(null)),
                Arguments.of(new BulkCreateProductPricePointsRequest(List.of()))
        );
    }

    @Test
    void shouldReturn422WhenRequestContainsListWithoutRequiredFields() {
        // when - then
        assertUnprocessableEntity(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.bulkCreateProductPricePoints(
                        product.getId(),
                        new BulkCreateProductPricePointsRequest(List.of(
                                new CreateProductPricePoint(),
                                new CreateProductPricePoint()
                        ))
                ),
                e -> JSONAssert.assertEquals(
                        "{\"price_points[0].name\":[\"Name: cannot be blank.\"],\"price_points[0].interval\":[\"Recurring Interval: must be greater than or equal to 1.\"],\"price_points[0].interval_unit\":[\"Interval unit: cannot be blank.\",\"Interval unit: must be 'month' or 'day'.\"],\"price_points[1].name\":[\"Name: cannot be blank.\"],\"price_points[1].interval\":[\"Recurring Interval: must be greater than or equal to 1.\"],\"price_points[1].interval_unit\":[\"Interval unit: cannot be blank.\",\"Interval unit: must be 'month' or 'day'.\"]}",
                        e.getHttpContext().getResponse().getBody(),
                        JSONCompareMode.STRICT
                )
        );
    }
}
