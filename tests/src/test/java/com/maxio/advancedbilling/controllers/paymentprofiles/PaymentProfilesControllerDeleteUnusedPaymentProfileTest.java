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

class PaymentProfilesControllerDeleteUnusedPaymentProfileTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Customer customer1;
    private static Customer customer2;
    private static Product product;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer1 = TEST_SETUP.createCustomer();
        customer2 = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteCustomer(customer1);
        testTeardown.deleteCustomer(customer2);
    }

    @Test
    void shouldDeleteUnusedPaymentProfile() throws IOException, ApiException {
        // given
        CreditCardPaymentProfile creditCardPaymentProfile = createCreditCardPaymentProfile(customer1.getId());
        BankAccountPaymentProfile bankAccountPaymentProfile = createBankAccountPaymentProfile(customer1.getId());
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productId(product.getId())
                                .customerId(customer1.getId())
                                // making creditCardPaymentProfile active for this subscription
                                .paymentProfileId(creditCardPaymentProfile.getId())
                                .build()
                        )
                )
                .getSubscription();

        // making bankAccountPaymentProfile active for this subscription
        PAYMENT_PROFILES_CONTROLLER.updateSubscriptionDefaultPaymentProfile(
                subscription.getId(),
                bankAccountPaymentProfile.getId()
        );

        // when
        PAYMENT_PROFILES_CONTROLLER.deleteUnusedPaymentProfile(creditCardPaymentProfile.getId());

        // then
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(
                new ListPaymentProfilesInput.Builder()
                        .customerId(customer1.getId())
                        .build())
        )
                .hasSize(1)
                .map(response -> response.getPaymentProfile().match(new PaymentProfileResponsePaymentProfileGetter<>()))
                .singleElement()
                .extracting("id")
                .isEqualTo(bankAccountPaymentProfile.getId());
    }

    @Test
    void shouldReturn422WhenDeletingPaymentProfileBeingInUse() throws IOException, ApiException {
        // given
        CreditCardPaymentProfile creditCardPaymentProfile = createCreditCardPaymentProfile(customer2.getId());
        SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productId(product.getId())
                                .customerId(customer2.getId())
                                // making creditCardPaymentProfile active for this subscription
                                .paymentProfileId(creditCardPaymentProfile.getId())
                                .build()
                        )
                );

        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> PAYMENT_PROFILES_CONTROLLER
                        .deleteUnusedPaymentProfile(creditCardPaymentProfile.getId())
                )
                .isUnprocessableEntity()
                .hasErrors("The payment profile is in use by one or more subscriptions and cannot be deleted");
    }

    @Test
    void shouldReturn404ForNotExistentPaymentProfileId() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.deleteUnusedPaymentProfile(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient()
                        .getPaymentProfilesController()
                        .deleteUnusedPaymentProfile(123)
        );
    }

    private static CreditCardPaymentProfile createCreditCardPaymentProfile(Integer customerId) throws IOException, ApiException {
        return PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                        .customerId(customerId)
                        .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(12))
                        .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2030))
                        .fullNumber("4111111111111111")
                        .build())
                )
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());
    }

    private static BankAccountPaymentProfile createBankAccountPaymentProfile(Integer customerId) throws IOException, ApiException {
        return PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(
                                new CreatePaymentProfile.Builder()
                                        .customerId(customerId)
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
    }
}
