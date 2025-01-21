package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionStatusController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

abstract class SubscriptionStatusControllerTestBase {

    protected final SubscriptionsController subscriptionsController = TestClientProvider.getClient().getSubscriptionsController();
    protected final SubscriptionStatusController subscriptionStatusController = TestClientProvider.getClient().getSubscriptionStatusController();

    protected int productFamilyId;
    protected int productId;
    protected Product product;
    protected Customer customer;

    @BeforeAll
    void setup() throws IOException, ApiException {
        TestSetup testSetup = new TestSetup();
        ProductFamily productFamily = testSetup.createProductFamily();
        productFamilyId = productFamily.getId();
        product = testSetup.createProduct(productFamily);
        productId = product.getId();
        customer = testSetup.createCustomer();
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
                                                .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                                .fullNumber("1")
                                                .build()
                                )
                                .build()
                )
        ).getSubscription();
    }

}
