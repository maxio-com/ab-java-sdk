package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.utils.TestSetup;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class ProductsControllerTestBase {
    protected final ProductsController productsController = TestClientProvider.getClient().getProductsController();
    protected ProductFamily productFamily;

    @BeforeAll
    void setup() throws IOException, ApiException {
        productFamily = new TestSetup().createProductFamily();
    }

    protected Product createProduct() throws IOException, ApiException {
        return createProductWithHandle("initial_handle-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase());
    }

    protected Product createProductWithHandle(String handle) throws IOException, ApiException {
        return productsController
                .createProduct(String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(
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
