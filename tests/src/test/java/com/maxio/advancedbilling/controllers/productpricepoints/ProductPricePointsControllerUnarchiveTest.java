package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointProductId;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerUnarchiveTest extends ProductPricePointsBaseTest {

    private Product product;
    private ProductPricePoint productPricePoint;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
        productPricePoint = createProductPricePoint(
                product.getId(),
                defaultBuilder().name("price-point-name-%s".formatted(randomAlphabetic(10))).build()
        ).getPricePoint();
    }

    @Test
    void shouldReturn422WhenProductNotExists() {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.unarchiveProductPricePoint(12345, productPricePoint.getId())
        );
    }

    @Test
    void shouldReturn422WhenProductPricePointNotExists() {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.unarchiveProductPricePoint(product.getId(), 12345)
        );
    }

    @Test
    void shouldReturn422WhenProductPricePointIsNotArchived() {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.unarchiveProductPricePoint(product.getId(), productPricePoint.getId())
        );
    }

    @Test
    void shouldUnarchiveProductPricePoint() throws IOException, ApiException {
        // given
        PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                ArchiveProductPricePointProductId.fromNumber(product.getId()),
                ArchiveProductPricePointPricePointId.fromNumber(productPricePoint.getId())
        );

        // when
        ProductPricePoint unarchivedPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER
                .unarchiveProductPricePoint(product.getId(), productPricePoint.getId())
                .getPricePoint();

        // then
        assertThat(unarchivedPricePoint.getArchivedAt()).isNull();
    }
}
