package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.UpdateProductPricePoint;
import com.maxio.advancedbilling.models.UpdateProductPricePointRequest;
import com.maxio.advancedbilling.models.containers.UpdateProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.UpdateProductPricePointProductId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntityNotOk;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerUpdateTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.updateProductPricePoint(
                        UpdateProductPricePointProductId.fromNumber(12345),
                        UpdateProductPricePointPricePointId.fromNumber(product.getDefaultProductPricePointId()),
                        new UpdateProductPricePointRequest()
                )
        );
    }

    @Test
    void shouldReturn404WhenProductPricePointNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.updateProductPricePoint(
                        UpdateProductPricePointProductId.fromNumber(product.getId()),
                        UpdateProductPricePointPricePointId.fromNumber(12345),
                        new UpdateProductPricePointRequest()
                )
        );
    }

    @Test
    void shouldUpdateProductPricePointById() throws IOException, ApiException {
        // when
        ProductPricePoint updatedProductPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER.updateProductPricePoint(
                        UpdateProductPricePointProductId.fromNumber(product.getId()),
                        UpdateProductPricePointPricePointId.fromNumber(product.getDefaultProductPricePointId()),
                        new UpdateProductPricePointRequest.Builder(new UpdateProductPricePoint("updated-handle", 123L)).build()
                )
                .getPricePoint();

        // then
        assertThat(updatedProductPricePoint.getHandle()).isEqualTo("updated-handle");
        assertThat(updatedProductPricePoint.getPriceInCents()).isEqualTo(123L);
    }

    @Test
    void shouldUpdateProductPricePointByHandle() throws IOException, ApiException {
        // when
        ProductPricePoint updatedProductPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER.updateProductPricePoint(
                        UpdateProductPricePointProductId.fromString("handle:" + product.getHandle()),
                        UpdateProductPricePointPricePointId.fromString("handle:" + product.getProductPricePointHandle()),
                        new UpdateProductPricePointRequest.Builder(new UpdateProductPricePoint("updated-handle", 123L)).build()
                )
                .getPricePoint();

        // then
        assertThat(updatedProductPricePoint.getHandle()).isEqualTo("updated-handle");
        assertThat(updatedProductPricePoint.getPriceInCents()).isEqualTo(123L);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsMissingOrEmpty")
    void shouldReturn422WhenRequestBodyIsMissingOrEmpty(UpdateProductPricePointRequest request) {
        // when - then
        assertUnprocessableEntityNotOk(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.updateProductPricePoint(
                        UpdateProductPricePointProductId.fromNumber(product.getId()),
                        UpdateProductPricePointPricePointId.fromNumber(product.getDefaultProductPricePointId()),
                        request
                )
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsMissingOrEmpty() {
        return Stream.of(
                Arguments.of(new UpdateProductPricePointRequest(null)),
                Arguments.of(new UpdateProductPricePointRequest(new UpdateProductPricePoint()))
        );
    }
}
