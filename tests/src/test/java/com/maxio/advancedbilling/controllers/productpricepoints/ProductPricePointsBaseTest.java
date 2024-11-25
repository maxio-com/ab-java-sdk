package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductPricePointsController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.ExpirationIntervalUnit;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListAllProductPricePointsInput;
import com.maxio.advancedbilling.models.ListPricePointsFilter;
import com.maxio.advancedbilling.models.ListProductsInput;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.ProductPricePointResponse;
import com.maxio.advancedbilling.models.ProductResponse;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointProductId;
import com.maxio.advancedbilling.models.containers.CreateProductPricePointProductId;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.junit.jupiter.api.Assertions.fail;

abstract class ProductPricePointsBaseTest {

    protected final AdvancedBillingClient ADVANCED_BILLING_CLIENT = TestClientProvider.getClient();
    protected final ProductsController PRODUCTS_CONTROLLER = ADVANCED_BILLING_CLIENT.getProductsController();
    protected final ProductPricePointsController PRODUCT_PRICE_POINTS_CONTROLLER = ADVANCED_BILLING_CLIENT.getProductPricePointsController();

    protected ProductFamily productFamily;

    @BeforeAll
    void setupProductFamily() throws IOException, ApiException {
        productFamily = ADVANCED_BILLING_CLIENT
                .getProductFamiliesController()
                .createProductFamily(new CreateProductFamilyRequest.Builder(
                                new CreateProductFamily.Builder()
                                        .name("Test Product Family %s".formatted(randomAlphabetic(5)))
                                        .build()
                        ).build()
                )
                .getProductFamily();
    }

    protected Product createProduct() throws IOException, ApiException {
        return PRODUCTS_CONTROLLER
                .createProduct(
                        String.valueOf(productFamily.getId()),
                        new CreateOrUpdateProductRequest(new CreateOrUpdateProduct.Builder()
                                .name("product-name-%s".formatted(randomNumeric(10)))
                                .handle("product-handle-%s".formatted(randomNumeric(10)))
                                .intervalUnit(IntervalUnit.MONTH)
                                .interval(2)
                                .build()
                        )
                )
                .getProduct();
    }

    protected ProductPricePointResponse createProductPricePoint(int productId, CreateProductPricePoint createProductPricePoint)
            throws IOException, ApiException {
        return createProductPricePointWithDelay(0, productId, createProductPricePoint);
    }

    protected ProductPricePointResponse createProductPricePointWithDelay(long delayInMillis, int productId,
                                                                                CreateProductPricePoint createProductPricePoint)
            throws IOException, ApiException {
        try {
            Thread.sleep(delayInMillis);
        } catch (InterruptedException e) {
            fail(e.getMessage(), e);
        }

        return PRODUCT_PRICE_POINTS_CONTROLLER.createProductPricePoint(
                CreateProductPricePointProductId.fromNumber(productId),
                new CreateProductPricePointRequest(createProductPricePoint)
        );
    }

    protected CreateProductPricePoint.Builder defaultBuilder() {
        return new CreateProductPricePoint.Builder()
                .priceInCents(100L)
                .interval(2)
                .intervalUnit(IntervalUnit.MONTH)
                .trialPriceInCents(4900L)
                .trialInterval(1)
                .trialIntervalUnit(IntervalUnit.MONTH)
                .trialType("payment_expected")
                .initialChargeInCents(120000L)
                .initialChargeAfterTrial(false)
                .expirationInterval(12)
                .expirationIntervalUnit(ExpirationIntervalUnit.MONTH);
    }

    // when archiving default price point, {"errors":["Cannot archive the default price point."]} is returned
    // when archiving custom price point, {"errors":["The custom product price point cannot be archived."]} is returned
    protected void archiveAllSiteCatalogPricePoints() throws IOException, ApiException {
        List<ProductPricePoint> siteCatalogPricePoints = listAllSiteCatalogPricePointsPerPage200();
        while (!siteCatalogPricePoints.isEmpty()) {
            for (ProductPricePoint pricePoint : siteCatalogPricePoints) {
                PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                        ArchiveProductPricePointProductId.fromNumber(pricePoint.getProductId()),
                        ArchiveProductPricePointPricePointId.fromNumber(pricePoint.getId())
                );
            }
            siteCatalogPricePoints = listAllSiteCatalogPricePointsPerPage200();
        }
    }

    protected void archiveAllSiteProducts() throws IOException, ApiException {
        List<ProductResponse> productResponses = listAllSiteProductsPerPage200();
        while (!productResponses.isEmpty()) {
            for (ProductResponse p : productResponses) {
                PRODUCTS_CONTROLLER.archiveProduct(p.getProduct().getId());
            }
            productResponses = listAllSiteProductsPerPage200();
        }
    }

    private List<ProductResponse> listAllSiteProductsPerPage200() throws IOException, ApiException {
        return PRODUCTS_CONTROLLER.listProducts(
                new ListProductsInput.Builder().perPage(200).build()
        );
    }

    private List<ProductPricePoint> listAllSiteCatalogPricePointsPerPage200() throws IOException, ApiException {
        return PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(new ListAllProductPricePointsInput.Builder()
                        .filter(new ListPricePointsFilter.Builder()
                                .type(List.of(PricePointType.CATALOG))
                                .build())
                        .perPage(200)
                        .build()
                )
                .getPricePoints();
    }
}
