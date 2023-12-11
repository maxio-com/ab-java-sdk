package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import com.maxio.advancedbilling.utils.TestSetup;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.List;

public class SubscriptionComponentsControllerTestBase {

    protected static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();
//    protected static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER =
//            TestClient.createClient().getSubscriptionsController();
//
//    protected static final ProductsController PRODUCTS_CONTROLLER =
//            TestClient.createClient().getProductsController();
//
//    protected static ProductFamily productFamily;
//    protected static int productFamilyId;
//    protected static int productId;
//    protected static Customer customer;
    protected static final TestSetup TEST_SETUP = new TestSetup();

//    @BeforeAll
//    static void setup() throws IOException, ApiException {
//        productFamily = TEST_SETUP.createProductFamily();
//        productFamilyId = productFamily.getId();
//
//        productId = PRODUCTS_CONTROLLER
//                .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
//                        new CreateOrUpdateProduct.Builder()
//                                .name("Initial Sample product-" + RandomStringUtils.randomAlphanumeric(5))
//                                .handle("initial-sample-product-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase())
//                                .priceInCents(1000)
//                                .interval(1)
//                                .intervalUnit(IntervalUnit.MONTH)
//                                .build()
//                ))
//                .getProduct().getId();
//
//        customer = TestClient.createClient().getCustomersController()
//                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
//                        .firstName("Joe")
//                        .lastName("Blow")
//                        .email("joe@example.com")
//                        .build())
//                )
//                .getCustomer();
//    }
//
//    protected Subscription createSubscriptionWithComponent(int componentId) throws IOException {
//        return SUBSCRIPTIONS_CONTROLLER.createSubscription(
//                new CreateSubscriptionRequest(
//                        new CreateSubscription.Builder()
//                                .productId(productId)
//                                .customerId(customer.getId())
//                                .creditCardAttributes(
//                                        new PaymentProfileAttributes.Builder()
//                                                .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(12))
//                                                .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2024))
//                                                .fullNumber("1")
//                                                .build()
//                                )
//                                .components(List.of(
//                                        new CreateSubscriptionComponent.Builder()
//                                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(componentId))
//                                                .unitBalance(0)
//                                                .build()
//                                ))
//                                .build()
//                )
//        ).getSubscription();
//    }
//
//    protected Component createQuantityBasedComponent() throws IOException, ApiException {
//        return TEST_SETUP.createQuantityBasedComponent(productFamilyId);
//    }
//
//    protected Component createMeteredComponent(double unitPrice) throws IOException, ApiException {
//        return TEST_SETUP.createMeteredComponent(productFamily, unitPrice);
//    }

}
