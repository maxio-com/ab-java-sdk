package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ListProductPricePointsInput;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.containers.ListProductPricePointsInputProductId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.CommonAssertions.assertUnprocessableEntityNotOk;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class ProductPricePointsControllerPromoteTest extends ProductPricePointsBaseTest {

    private Product product;
    private ProductPricePoint productPricePointOfTypeCatalog;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
        productPricePointOfTypeCatalog = createProductPricePoint(
                product.getId(),
                defaultBuilder().name("price-point-name-%s".formatted(randomAlphabetic(10))).build()
        ).getPricePoint();
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER
                .promoteProductPricePointToDefault(12345, productPricePointOfTypeCatalog.getId())
        );
    }

    @Test
    void shouldReturn422WhenProductPricePointNotExists() {
        // when - then
        assertUnprocessableEntityNotOk(
                ApiException.class,
                () -> PRODUCT_PRICE_POINTS_CONTROLLER.promoteProductPricePointToDefault(product.getId(), 12345)
        );
    }

    @Test
    void shouldDoNothingWhenPromotingAlreadyDefaultProductPricePoint() throws IOException, ApiException {
        // when
        Product promotedProduct = PRODUCT_PRICE_POINTS_CONTROLLER
                .promoteProductPricePointToDefault(product.getId(), product.getDefaultProductPricePointId())
                .getProduct();

        // then
        assertThat(promotedProduct)
                .usingRecursiveComparison()
                .ignoringFields("updatedAt")
                .isEqualTo(product);
    }

    @Test
    void shouldPromoteProductPricePointOfTypeCatalogToDefault() throws IOException, ApiException {
        // when
        Product promotedProduct = PRODUCT_PRICE_POINTS_CONTROLLER
                .promoteProductPricePointToDefault(product.getId(), productPricePointOfTypeCatalog.getId())
                .getProduct();

        // then
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput
                        .Builder(ListProductPricePointsInputProductId.fromNumber(promotedProduct.getId()))
                        .build()
                )
                .getPricePoints();
        assertThat(productPricePoints)
                .hasSize(2)
                .extracting("name", "type")
                .containsExactlyInAnyOrder(
                        tuple(productPricePointOfTypeCatalog.getName(), PricePointType.ENUM_DEFAULT),
                        tuple(product.getProductPricePointName(), PricePointType.CATALOG)
                );
    }
}
