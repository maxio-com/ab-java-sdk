package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.containers.ReadProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ReadProductPricePointProductId;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerReadTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeAll
    void beforeAll() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReadByProductPricePointId() throws IOException, ApiException {
        // when
        ProductPricePoint defaultProductPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER
                .readProductPricePoint(
                        ReadProductPricePointProductId.fromNumber(product.getId()),
                        ReadProductPricePointPricePointId.fromNumber(product.getProductPricePointId()),
                        null
                )
                .getPricePoint();

        // then
        assertThat(defaultProductPricePoint)
                .extracting(ProductPricePoint::getName)
                .isEqualTo("Original");
    }

    @Test
    void shouldReadByProductPricePointHandle() throws IOException, ApiException {
        // given
        ProductPricePoint savedProductPricePoint = createProductPricePoint(
                product.getId(), defaultBuilder().name(randomAlphabetic(10)).handle("price-point-handle").build()
        ).getPricePoint();

        // when
        ProductPricePoint readProductPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER
                .readProductPricePoint(
                        ReadProductPricePointProductId.fromString("handle:" + product.getHandle()),
                        ReadProductPricePointPricePointId.fromString("handle:" + savedProductPricePoint.getHandle()),
                        null
                )
                .getPricePoint();

        // then
        assertThat(readProductPricePoint).usingRecursiveComparison().isEqualTo(savedProductPricePoint);
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.readProductPricePoint(
                ReadProductPricePointProductId.fromNumber(12345),
                ReadProductPricePointPricePointId.fromNumber(product.getProductPricePointId()),
                null
                )
        );
    }

    @Test
    void shouldReturn404WhenProductPricePointNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.readProductPricePoint(
                ReadProductPricePointProductId.fromNumber(product.getId()),
                ReadProductPricePointPricePointId.fromNumber(12345),
                null
                )
        );
    }
}
