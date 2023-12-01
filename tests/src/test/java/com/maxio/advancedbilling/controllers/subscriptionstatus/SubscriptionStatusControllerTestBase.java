package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.controllers.SubscriptionStatusController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

abstract class SubscriptionStatusControllerTestBase {

    protected static final ProductsController productsController = TestClient.createClient().getProductsController();
    protected static final SubscriptionsController subscriptionsController = TestClient.createClient().getSubscriptionsController();
    protected static final SubscriptionStatusController subscriptionStatusController = TestClient.createClient().getSubscriptionStatusController();


    protected static int productId;
    protected static Customer customer;
    protected static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamiliesController productFamiliesController = TestClient.createClient()
                .getProductFamiliesController();
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();

        ProductFamily productFamily = productFamiliesController.createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily("Test Product Family " + seed, null)))
                .getProductFamily();

        productId = productsController
                .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct.Builder()
                                .name("Initial Sample product-" + RandomStringUtils.randomAlphanumeric(5))
                                .handle("initial-sample-product-" + seed)
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit(IntervalUnit.MONTH)
                                .build()
                ))
                .getProduct().getId();

        customer = TestClient.createClient().getCustomersController()
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Joe")
                        .lastName("Blow")
                        .email("joe@example.com")
                        .build())
                )
                .getCustomer();
    }

    Subscription createSubscription() throws IOException, ApiException {
        return subscriptionsController.createSubscription(
                new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(productId)
                                .customerId(customer.getId())
                                .creditCardAttributes(
                                        new PaymentProfileAttributes.Builder()
                                                .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(12))
                                                .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2024))
                                                .fullNumber("1")
                                                .build()
                                )
                                .build()
                )
        ).getSubscription();
    }

}
