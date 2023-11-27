package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

abstract class ProductsControllerTestBase {
    protected static final ProductsController productsController = TestClient.createClient().getProductsController();
    protected static ProductFamily productFamily;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamiliesController productFamiliesController = TestClient.createClient()
                .getProductFamiliesController();

        productFamily = productFamiliesController.createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily("Test Product Family "
                                + RandomStringUtils.randomAlphanumeric(5), null)))
                .getProductFamily();
    }

    protected Product createProduct() throws IOException, ApiException {
        return createProductWithHandle("initial_handle-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase());
    }

    protected static Product createProductWithHandle(String handle) throws IOException, ApiException {
        return productsController
                .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct.Builder()
                                .name("Initial Sample product-" + RandomStringUtils.randomAlphanumeric(5))
                                .handle(handle)
                                .description("A sample product for testing")
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit(IntervalUnit.MONTH)
                                .build()
                ))
                .getProduct();
    }

}
