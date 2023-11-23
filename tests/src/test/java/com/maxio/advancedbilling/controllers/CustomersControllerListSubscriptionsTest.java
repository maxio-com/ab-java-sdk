package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.CreatedPaymentProfile;
import com.maxio.advancedbilling.models.PaymentType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationMonth;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationYear;
import com.maxio.advancedbilling.utils.CommonAssertions;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class CustomersControllerListSubscriptionsTest {

    public final AdvancedBillingClient advancedBillingClient = TestClient.createClient();

    private final CustomersController customersController = advancedBillingClient.getCustomersController();
    private final PaymentProfilesController paymentProfilesController = advancedBillingClient.getPaymentProfilesController();
    private final ProductFamiliesController productFamiliesController = advancedBillingClient.getProductFamiliesController();
    private final ProductsController productsController = advancedBillingClient.getProductsController();
    private final SubscriptionsController subscriptionsController = advancedBillingClient.getSubscriptionsController();

    @Test
    void shouldReturn404WhenCustomerNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> customersController.listCustomerSubscriptions(12345));
    }

    @Test
    void shouldReturnEmptyListWhenCustomerHasNoSubscriptions() throws IOException, ApiException {
        // given
        int customerId = customersController
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .reference(RandomStringUtils.randomAlphanumeric(10))
                        .build())
                )
                .getCustomer()
                .getId();

        // when
        List<SubscriptionResponse> subscriptionResponses = customersController.listCustomerSubscriptions(customerId);

        // then
        assertThat(subscriptionResponses).isEmpty();
    }

    @Test
    void shouldReturnListOfSubscriptionsForCustomer() throws IOException, ApiException {
        // given
        int customerId = customersController
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .reference(RandomStringUtils.randomAlphanumeric(10))
                        .build())
                )
                .getCustomer()
                .getId();

        CreatedPaymentProfile paymentProfile = paymentProfilesController
                .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                        .customerId(customerId)
                        .paymentType(PaymentType.CREDIT_CARD)
                        .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(10))
                        .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2025))
                        .fullNumber("5424000000000015")
                        .build())
                )
                .getPaymentProfile();

        ProductFamily productFamily = productFamiliesController
                .createProductFamily(new CreateProductFamilyRequest(new CreateProductFamily.Builder()
                        .name("Test Product Family")
                        .build())
                )
                .getProductFamily();

        Product product = productsController
                .createProduct(
                        productFamily.getId(),
                        new CreateOrUpdateProductRequest(new CreateOrUpdateProduct.Builder()
                                .name("Test Product")
                                .handle("test-product")
                                .intervalUnit("month")
                                .interval(2)
                                .build()
                        )
                )
                .getProduct();

        Subscription subscription = subscriptionsController
                .createSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                        .customerId(customerId)
                        .paymentProfileId(paymentProfile.getId())
                        .productId(Integer.toString(product.getId()))
                        .build())
                )
                .getSubscription();

        // when
        List<Subscription> customerSubscriptions = customersController
                .listCustomerSubscriptions(customerId)
                .stream()
                .map(SubscriptionResponse::getSubscription)
                .collect(Collectors.toList());

        // then
        assertThat(customerSubscriptions).hasSize(1);
        assertThat(customerSubscriptions)
                .extracting(Subscription::getId)
                .containsExactly(subscription.getId());
    }
}
