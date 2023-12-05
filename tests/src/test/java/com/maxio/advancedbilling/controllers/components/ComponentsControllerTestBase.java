package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ComponentsController;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKindPath;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.containers.CreateComponentBody;
import com.maxio.advancedbilling.models.containers.QuantityBasedComponentUnitPrice;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class ComponentsControllerTestBase {

    protected static final ComponentsController COMPONENTS_CONTROLLER = TestClient.createClient().getComponentsController();
    protected static int productFamilyId;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamiliesController productFamiliesController = TestClient.createClient()
                .getProductFamiliesController();
        productFamilyId = productFamiliesController.createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily("Test Product Family " +
                                RandomStringUtils.randomAlphanumeric(5).toLowerCase(),
                                null)))
                .getProductFamily().getId();
    }

    protected Component createQuantityBasedComponent() throws IOException, ApiException {
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        QuantityBasedComponent quantityBasedComponent = new QuantityBasedComponent.Builder()
                .name("testcomponent-" + seed)
                .handle("test-handle-" + seed)
                .unitName("unit")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromPrecision(1.0))
                .build();
        CreateQuantityBasedComponent createQuantityBasedComponent = new CreateQuantityBasedComponent(quantityBasedComponent);

        return COMPONENTS_CONTROLLER.createComponent(productFamilyId,
                        ComponentKindPath.QUANTITY_BASED_COMPONENTS,
                        CreateComponentBody.fromCreateQuantityBasedComponent(createQuantityBasedComponent))
                .getComponent();
    }

}
