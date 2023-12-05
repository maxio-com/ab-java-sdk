package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListProductPricePointsInput;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.containers.ListProductPricePointsInputProductId;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerListTest extends ProductPricePointsBaseTest {

    private Product product;

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        product = createProduct();
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput
                        .Builder(ListProductPricePointsInputProductId.fromNumber(12345)).build())
        );
    }

    @Test
    void shouldReturnListWithOriginalPricePointOnly() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput
                        .Builder(ListProductPricePointsInputProductId.fromNumber(product.getId())).build())
                .getPricePoints();

        // then
        assertThat(productPricePoints).hasSize(1);
        ProductPricePoint defaultPricePoint = productPricePoints.get(0);
        assertAll(
                () -> assertThat(defaultPricePoint.getId()).isNotNull(),
                () -> assertThat(defaultPricePoint.getName()).isEqualTo("Original"),
                () -> assertThat(defaultPricePoint.getHandle()).isNotNull(),
                () -> assertThat(defaultPricePoint.getPriceInCents()).isEqualTo(0),
                () -> assertThat(defaultPricePoint.getInterval()).isEqualTo(2),
                () -> assertThat(defaultPricePoint.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(defaultPricePoint.getTrialPriceInCents()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialInterval()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialType()).isEqualTo("payment_expected"),
                () -> assertThat(defaultPricePoint.getIntroductoryOffer()).isNull(),
                () -> assertThat(defaultPricePoint.getInitialChargeInCents()).isNull(),
                () -> assertThat(defaultPricePoint.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(defaultPricePoint.getExpirationInterval()).isNull(),
                () -> assertThat(defaultPricePoint.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getProductId()).isEqualTo(product.getId()),
                () -> assertThat(defaultPricePoint.getArchivedAt()).isNull(),
                () -> assertThat(defaultPricePoint.getCreatedAt()).isNotNull(),
                () -> assertThat(defaultPricePoint.getUpdatedAt()).isNotNull(),
                () -> assertThat(defaultPricePoint.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(defaultPricePoint.getType()).isEqualTo(PricePointType.ENUM_DEFAULT),
                () -> assertThat(defaultPricePoint.getTaxIncluded()).isFalse(),
                () -> assertThat(defaultPricePoint.getSubscriptionId()).isNull()
        );
    }

    @Test
    void shouldReturnListWithAllPricePoints() throws IOException, ApiException {
        // given
        createProductPricePoint(
                product.getId(),
                defaultBuilder().name("custom-price-point-name").build()
        );

        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput
                        .Builder(ListProductPricePointsInputProductId.fromNumber(product.getId())).build())
                .getPricePoints();

        // then
        assertThat(productPricePoints).hasSize(2);
        assertThat(productPricePoints)
                .extracting(ProductPricePoint::getName)
                .containsExactlyInAnyOrder("Original", "custom-price-point-name");
    }

    @Test
    void shouldReturnListWithPagedPricePoints() throws IOException, ApiException {
        // given
        for (int i = 0; i < 4; i++) {
            createProductPricePoint(
                    product.getId(),
                    defaultBuilder().name(randomAlphabetic(10)).build()
            );
        }

        // when
        List<ProductPricePoint> productPricePointsPage1 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(ListProductPricePointsInputProductId.fromNumber(product.getId()))
                        .page(1)
                        .perPage(2)
                        .build()
                )
                .getPricePoints();
        List<ProductPricePoint> productPricePointsPage2 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(ListProductPricePointsInputProductId.fromNumber(product.getId()))
                        .page(2)
                        .perPage(2)
                        .build()
                )
                .getPricePoints();
        List<ProductPricePoint> productPricePointsPage3 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(ListProductPricePointsInputProductId.fromNumber(product.getId()))
                        .page(3)
                        .perPage(2)
                        .build()
                )
                .getPricePoints();

        // then
        assertThat(productPricePointsPage1).hasSize(2);
        assertThat(productPricePointsPage2).hasSize(2);
        assertThat(productPricePointsPage3).hasSize(1);
    }

    @Test
    void shouldReturnListUsingTypeFilter() throws IOException, ApiException {
        // given
        createProductPricePoint(
                product.getId(),
                defaultBuilder().name("custom-price-point-name").build()
        );

        // when - then
        List<ProductPricePoint> pricePointsOfDefaultType = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(ListProductPricePointsInputProductId.fromNumber(product.getId()))
                        .filterType(Collections.singletonList(PricePointType.ENUM_DEFAULT))
                        .build()
                )
                .getPricePoints();
        assertThat(pricePointsOfDefaultType)
                .hasSize(1)
                .extracting(ProductPricePoint::getName)
                .containsExactly("Original");

        List<ProductPricePoint> pricePointsOfCatalogType = PRODUCT_PRICE_POINTS_CONTROLLER
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(ListProductPricePointsInputProductId.fromNumber(product.getId()))
                        .filterType(Collections.singletonList(PricePointType.CATALOG))
                        .build()
                )
                .getPricePoints();
        assertThat(pricePointsOfCatalogType)
                .hasSize(1)
                .extracting(ProductPricePoint::getName)
                .containsExactly("custom-price-point-name");
    }
}
