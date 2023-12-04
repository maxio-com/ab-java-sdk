package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ComponentsController;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKindPath;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.containers.CreateComponentBody;
import com.maxio.advancedbilling.models.containers.QuantityBasedComponentUnitPrice;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class ComponentsControllerTestBase {

    protected static final ProductsController productsController = TestClient.createClient().getProductsController();
    protected static final ComponentsController componentsController = TestClient.createClient().getComponentsController();
    protected static int productFamilyId;
    protected static int productId;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamiliesController productFamiliesController = TestClient.createClient()
                .getProductFamiliesController();
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();

        productFamilyId = productFamiliesController.createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily("Test Product Family " + seed, null)))
                .getProductFamily().getId();

        productId = productsController
                .createProduct(productFamilyId, new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct.Builder()
                                .name("Initial Sample product-" + RandomStringUtils.randomAlphanumeric(5))
                                .handle("initial-sample-product-" + seed)
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit(IntervalUnit.MONTH)
                                .build()
                ))
                .getProduct().getId();
    }

    protected Component createComponent() throws IOException, ApiException {
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        QuantityBasedComponent quantityBasedComponent = new QuantityBasedComponent.Builder()
                .name("testcomponent-" + seed)
                .handle("test-handle-" + seed)
                .unitName("unit")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromPrecision(1.0))
                .build();
        CreateQuantityBasedComponent createQuantityBasedComponent = new CreateQuantityBasedComponent(quantityBasedComponent);

        return componentsController.createComponent(productFamilyId,
                        ComponentKindPath.QUANTITY_BASED_COMPONENTS,
                        CreateComponentBody.fromCreateQuantityBasedComponent(createQuantityBasedComponent))
                .getComponent();
    }

}
