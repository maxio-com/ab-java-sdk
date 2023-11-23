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
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CustomersControllerListSubscriptionsTest {

    public final AdvancedBillingClient advancedBillingClient = TestClient.createClient();

    private final CustomersController customersController = advancedBillingClient.getCustomersController();
    private final PaymentProfilesController paymentProfilesController = advancedBillingClient.getPaymentProfilesController();
    private final ProductFamiliesController productFamiliesController = advancedBillingClient.getProductFamiliesController();
    private final ProductsController productsController = advancedBillingClient.getProductsController();
    private final SubscriptionsController subscriptionsController = advancedBillingClient.getSubscriptionsController();

    @Test
    void shouldReturn404WhenCustomerNotExists() {
        // given
        int notExistingCustomerId = 12345;

        // when - then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> customersController.listCustomerSubscriptions(notExistingCustomerId))
                .withMessage("HTTP Response Not OK")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    @Test
    void shouldReturnEmptyListWhenCustomerHasNoSubscriptions() throws IOException, ApiException {
        // given
        int customerId = customersController
                .createCustomer(new CreateCustomerRequest()
                        .toBuilder()
                        .customer(new CreateCustomer()
                                .toBuilder()
                                .firstName("Cathryn")
                                .lastName("Washington")
                                .email("martha@example.com")
                                .reference(RandomStringUtils.randomAlphanumeric(10))
                                .build()
                        )
                        .build()
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
                .createCustomer(new CreateCustomerRequest()
                        .toBuilder()
                        .customer(new CreateCustomer()
                                .toBuilder()
                                .firstName("Cathryn")
                                .lastName("Washington")
                                .email("martha@example.com")
                                .reference(RandomStringUtils.randomAlphanumeric(10))
                                .build()
                        )
                        .build()
                )
                .getCustomer()
                .getId();

        CreatedPaymentProfile paymentProfile = paymentProfilesController
                .createPaymentProfile(new CreatePaymentProfileRequest()
                        .toBuilder()
                        .paymentProfile(new CreatePaymentProfile()
                                .toBuilder()
                                .customerId(customerId)
                                .paymentType(PaymentType.CREDIT_CARD)
                                .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(10))
                                .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2025))
                                .fullNumber("5424000000000015")
                                .build()
                        )
                        .build()
                )
                .getPaymentProfile();

        ProductFamily productFamily = productFamiliesController
                .createProductFamily(new CreateProductFamilyRequest()
                        .toBuilder()
                        .productFamily(new CreateProductFamily()
                                .toBuilder()
                                .name("Test Product Family")
                                .build()
                        )
                        .build()
                )
                .getProductFamily();

        Product product = productsController
                .createProduct(
                        productFamily.getId(),
                        new CreateOrUpdateProductRequest()
                                .toBuilder()
                                .product(new CreateOrUpdateProduct()
                                        .toBuilder()
                                        .name("Test Product")
                                        .handle("test-product")
                                        .intervalUnit("month")
                                        .interval(2)
                                        .build()
                                )
                                .build()
                )
                .getProduct();

        Subscription subscription = subscriptionsController
                .createSubscription(new CreateSubscriptionRequest()
                        .toBuilder()
                        .subscription(new CreateSubscription()
                                .toBuilder()
                                .customerId(customerId)
                                .paymentProfileId(paymentProfile.getId())
                                .productId(Integer.toString(product.getId()))
                                .build()
                        )
                        .build()
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
