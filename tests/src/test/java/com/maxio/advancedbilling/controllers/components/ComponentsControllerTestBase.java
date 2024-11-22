package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ComponentPricePointsController;
import com.maxio.advancedbilling.controllers.ComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class ComponentsControllerTestBase {

    protected static final ComponentsController COMPONENTS_CONTROLLER = TestClientProvider.getClient().getComponentsController();
    protected static final ComponentPricePointsController COMPONENTS__PRICE_POINT_CONTROLLER = TestClientProvider.getClient().getComponentPricePointsController();
    protected static ProductFamily productFamily;
    protected static int productFamilyId;
    protected static final TestSetup TEST_SETUP = new TestSetup();

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        productFamilyId = productFamily.getId();
    }

    protected static Component createQuantityBasedComponent() throws IOException, ApiException {
        return TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    protected Component createMeteredComponent(double unitPrice) throws IOException, ApiException {
        return TEST_SETUP.createMeteredComponent(productFamily, unitPrice);
    }

}
