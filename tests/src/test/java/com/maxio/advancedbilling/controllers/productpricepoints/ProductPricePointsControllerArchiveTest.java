package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointProductId;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

class ProductPricePointsControllerArchiveTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeAll
    void beforeAll() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromNumber(12345),
                        ArchiveProductPricePointPricePointId.fromNumber(product.getProductPricePointId())
                )
        );
    }

    @Test
    void shouldReturn404WhenProductPricePointNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromNumber(product.getId()),
                        ArchiveProductPricePointPricePointId.fromNumber(12345)
                )
        );
    }

    @Test
    void shouldReturn422WhenArchivingDefaultProductPricePoint() {
        // when - then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromNumber(product.getId()),
                        ArchiveProductPricePointPricePointId.fromNumber(product.getProductPricePointId())
                ),
                e -> assertThat(e.getErrors())
                        .usingRecursiveComparison()
                        .isEqualTo(List.of("Cannot archive the default price point."))

        );
    }

    @Test
    void shouldArchiveNonDefaultProductPricePointById() throws IOException, ApiException {
        // given
        ProductPricePoint savedProductPricePoint = createProductPricePoint(
                product.getId(), defaultBuilder().name("price-point-name").build()
        ).getPricePoint();

        // when
        ProductPricePoint archivedPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER
                .archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromNumber(product.getId()),
                        ArchiveProductPricePointPricePointId.fromNumber(savedProductPricePoint.getId())
                )
                .getPricePoint();

        // then
        assertThat(archivedPricePoint.getArchivedAt()).isNotNull();
    }

    @Test
    void shouldArchiveNonDefaultProductPricePointByHandle() throws IOException, ApiException {
        // given
        ProductPricePoint savedProductPricePoint = createProductPricePoint(
                product.getId(), defaultBuilder().name("price-point-name").handle("handle-123").build()
        ).getPricePoint();

        // when
        ProductPricePoint archivedPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER
                .archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromString("handle:" + product.getHandle()),
                        ArchiveProductPricePointPricePointId.fromString("handle:" + savedProductPricePoint.getHandle())
                )
                .getPricePoint();

        // then
        assertThat(archivedPricePoint.getArchivedAt()).isNotNull();
    }
}
