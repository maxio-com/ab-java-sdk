package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.controllers.ProductPricePointsController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListProductPricePointsInput;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.utils.CommonAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerListTest {

    private final AdvancedBillingClient advancedBillingClient = TestClient.createClient();
    private final ProductFamiliesController productFamiliesController = advancedBillingClient.getProductFamiliesController();
    private final ProductPricePointsController productPricePointsController = advancedBillingClient.getProductPricePointsController();
    private final ProductsController productsController = advancedBillingClient.getProductsController();

    private Product product;

    @BeforeEach
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = productFamiliesController
                .createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily.Builder().name(randomAlphabetic(10)).build())
                )
                .getProductFamily();

        product = productsController
                .createProduct(
                        productFamily.getId(),
                        new CreateOrUpdateProductRequest(new CreateOrUpdateProduct.Builder()
                                .name(randomAlphabetic(10))
                                .handle(String.format("product-handle-%s", randomNumeric(5)))
                                .intervalUnit(IntervalUnit.MONTH)
                                .interval(2)
                                .build()
                        )
                )
                .getProduct();
    }

    @Test
    void shouldReturn404WhenProductNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder(12345).build())
        );
    }

    @Test
    void shouldReturnListWithOriginalPricePointOnly() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder(product.getId()).build())
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
                () -> assertThat(defaultPricePoint.getIntervalUnit()).isEqualTo("month"),
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
        productPricePointsController
                .createProductPricePoint(
                        product.getId(),
                        new CreateProductPricePointRequest(new CreateProductPricePoint.Builder()
                                .name("custom-price-point-name")
                                .interval(1)
                                .intervalUnit("month")
                                .priceInCents(100L)
                                .build()
                        )
                );

        // when
        List<ProductPricePoint> productPricePoints = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder(product.getId()).build())
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
        createPricePoints(4);   // + 1 default price point assigned to the product

        // when
        List<ProductPricePoint> productPricePointsPage1 = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(product.getId())
                        .page(1)
                        .perPage(2)
                        .build()
                )
                .getPricePoints();
        List<ProductPricePoint> productPricePointsPage2 = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(product.getId())
                        .page(2)
                        .perPage(2)
                        .build()
                )
                .getPricePoints();
        List<ProductPricePoint> productPricePointsPage3 = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(product.getId())
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
        productPricePointsController
                .createProductPricePoint(
                        product.getId(),
                        new CreateProductPricePointRequest(new CreateProductPricePoint.Builder()
                                .name("custom-price-point-name")
                                .interval(1)
                                .intervalUnit("month")
                                .priceInCents(100L)
                                .build()
                        )
                );

        // when - then
        List<ProductPricePoint> pricePointsOfDefaultType = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(product.getId())
                        .filterType(Collections.singletonList(PricePointType.ENUM_DEFAULT))
                        .build()
                ).getPricePoints();
        assertThat(pricePointsOfDefaultType)
                .hasSize(1)
                .extracting(ProductPricePoint::getName)
                .containsExactly("Original");

        List<ProductPricePoint> pricePointsOfCatalogType = productPricePointsController
                .listProductPricePoints(new ListProductPricePointsInput.Builder()
                        .productId(product.getId())
                        .filterType(Collections.singletonList(PricePointType.CATALOG))
                        .build()
                ).getPricePoints();
        assertThat(pricePointsOfCatalogType)
                .hasSize(1)
                .extracting(ProductPricePoint::getName)
                .containsExactly("custom-price-point-name");
    }

    private void createPricePoints(int count) throws IOException, ApiException {
        for (int i = 0; i < count; i++) {
            productPricePointsController
                    .createProductPricePoint(
                            product.getId(),
                            new CreateProductPricePointRequest(new CreateProductPricePoint.Builder()
                                    .name(randomAlphabetic(10))
                                    .interval(1)
                                    .intervalUnit("month")
                                    .priceInCents(Long.parseLong(randomNumeric(3)))
                                    .build()
                            )
                    );
        }
    }
}
