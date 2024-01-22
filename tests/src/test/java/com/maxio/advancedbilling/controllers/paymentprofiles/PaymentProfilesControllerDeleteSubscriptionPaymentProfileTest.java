package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListPaymentProfilesInput;
import com.maxio.advancedbilling.models.PaymentType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationMonth;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationYear;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import com.maxio.advancedbilling.utils.matchers.PaymentProfileResponsePaymentProfileGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentProfilesControllerDeleteSubscriptionPaymentProfileTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Customer customer;
    private static CreditCardPaymentProfile creditCardPaymentProfile;
    private static BankAccountPaymentProfile bankAccountPaymentProfile;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        Product product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
        bankAccountPaymentProfile = PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(
                                new CreatePaymentProfile.Builder()
                                        .customerId(customer.getId())
                                        .bankName("Best Bank")
                                        .bankRoutingNumber("021000089")
                                        .bankAccountNumber("111111111111")
                                        .bankAccountType(BankAccountType.CHECKING)
                                        .bankAccountHolderType(BankAccountHolderType.BUSINESS)
                                        .paymentType(PaymentType.BANK_ACCOUNT)
                                        .build()
                        )
                )
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());
        creditCardPaymentProfile = PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                        .customerId(customer.getId())
                        .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(12))
                        .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2030))
                        .fullNumber("4111111111111111")
                        .build())
                )
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());
        subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productId(product.getId())
                                .customerId(customer.getId())
                                // making creditCardPaymentProfile active for this subscription
                                .paymentProfileId(creditCardPaymentProfile.getId())
                                .build()
                        )
                )
                .getSubscription();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldDeleteSubscriptionPaymentProfiles() throws IOException, ApiException {
        // when - then
        // deleting an active payment profile
        PAYMENT_PROFILES_CONTROLLER.deleteSubscriptionsPaymentProfile(subscription.getId(), creditCardPaymentProfile.getId());
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.readPaymentProfile(creditCardPaymentProfile.getId())
        );

        // deleting non-active payment profile
        PAYMENT_PROFILES_CONTROLLER.deleteSubscriptionsPaymentProfile(subscription.getId(), bankAccountPaymentProfile.getId());

        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(
                new ListPaymentProfilesInput.Builder().customerId(customer.getId()).build())
        ).isEmpty();
    }

    @Test
    void shouldReturn404WhenEitherSubscriptionOrPaymentProfileDoesNotExist() {
        // when - then
        CommonAssertions.assertNotFound(() -> PAYMENT_PROFILES_CONTROLLER
                .deleteSubscriptionsPaymentProfile(subscription.getId(), 123)
        );
        CommonAssertions.assertNotFound(() -> PAYMENT_PROFILES_CONTROLLER
                .deleteSubscriptionsPaymentProfile(123, creditCardPaymentProfile.getId())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient()
                        .getPaymentProfilesController()
                        .deleteSubscriptionsPaymentProfile(subscription.getId(), creditCardPaymentProfile.getId())
        );
    }
}
