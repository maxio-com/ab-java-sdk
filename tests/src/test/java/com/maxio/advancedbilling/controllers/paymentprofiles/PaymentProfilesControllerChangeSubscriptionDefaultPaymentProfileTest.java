package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.BankAccountVault;
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.Customer;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentProfilesControllerChangeSubscriptionDefaultPaymentProfileTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Customer customer;
    private static CreditCardPaymentProfile creditCardPaymentProfile;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        Product product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
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
    void shouldChangeSubscriptionDefaultPaymentProfile() throws IOException, ApiException {
        // given
        BankAccountPaymentProfile bankAccountPaymentProfile = PAYMENT_PROFILES_CONTROLLER
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

        // when
        BankAccountPaymentProfile newDefaultPaymentProfile = PAYMENT_PROFILES_CONTROLLER
                .changeSubscriptionDefaultPaymentProfile(subscription.getId(), bankAccountPaymentProfile.getId())
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());

        // then
        assertThat(newDefaultPaymentProfile.getId()).isEqualTo(bankAccountPaymentProfile.getId());
        assertThat(newDefaultPaymentProfile.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(newDefaultPaymentProfile.getLastName()).isEqualTo(customer.getLastName());
        assertThat(newDefaultPaymentProfile.getCustomerId()).isEqualTo(customer.getId());
        assertThat(newDefaultPaymentProfile.getCurrentVault()).isEqualTo(BankAccountVault.BOGUS);
        assertThat(newDefaultPaymentProfile.getVaultToken()).isEqualTo("111111111111");
        assertThat(newDefaultPaymentProfile.getBillingAddress()).isNull();
        assertThat(newDefaultPaymentProfile.getBillingCity()).isNull();
        assertThat(newDefaultPaymentProfile.getBillingState()).isNull();
        assertThat(newDefaultPaymentProfile.getBillingZip()).isNull();
        assertThat(newDefaultPaymentProfile.getBillingCountry()).isNull();
        assertThat(newDefaultPaymentProfile.getCustomerVaultToken()).isNull();
        assertThat(newDefaultPaymentProfile.getBillingAddress2()).isNull();
        assertThat(newDefaultPaymentProfile.getBankName()).isEqualTo("Best Bank");
        assertThat(newDefaultPaymentProfile.getMaskedBankRoutingNumber()).isEqualTo("XXXX0089");
        assertThat(newDefaultPaymentProfile.getMaskedBankAccountNumber()).isEqualTo("XXXX1111");
        assertThat(newDefaultPaymentProfile.getBankAccountType()).isEqualTo(BankAccountType.CHECKING);
        assertThat(newDefaultPaymentProfile.getBankAccountHolderType()).isEqualTo(BankAccountHolderType.BUSINESS);
        assertThat(newDefaultPaymentProfile.getSiteGatewaySettingId()).isNull();
        assertThat(newDefaultPaymentProfile.getPaymentType()).isEqualTo(PaymentType.BANK_ACCOUNT);
        assertThat(newDefaultPaymentProfile.getVerified()).isFalse();
        assertThat(newDefaultPaymentProfile.getGatewayHandle()).isNull();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn404WhenPathParamsPointToNotExistentResources")
    void shouldReturn404WhenPathParamsPointToNotExistentResources(int subscriptionId, int paymentProfileId) {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.changeSubscriptionDefaultPaymentProfile(subscriptionId, paymentProfileId)
        );
    }

    private static Stream<Arguments> argsForShouldReturn404WhenPathParamsPointToNotExistentResources() {
        return Stream.of(
                Arguments.arguments(111, 222),
                Arguments.arguments(subscription.getId(), 222),
                Arguments.arguments(111, creditCardPaymentProfile.getId())
        );
    }

    @Test
    void shouldReturn422WhenProvidedPaymentProfileIdIsAlreadyTheCurrentOne() throws IOException, ApiException {
        // given (updating the default payment profile)
        PAYMENT_PROFILES_CONTROLLER
                .changeSubscriptionDefaultPaymentProfile(subscription.getId(), creditCardPaymentProfile.getId());

        // when - then (the same operation again)
        CommonAssertions
                .assertThatErrorListResponse(() -> PAYMENT_PROFILES_CONTROLLER
                        .changeSubscriptionDefaultPaymentProfile(subscription.getId(), creditCardPaymentProfile.getId())
                )
                .isUnprocessableEntity()
                .hasErrors("This is already the current payment profile");
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient()
                        .getPaymentProfilesController()
                        .changeSubscriptionDefaultPaymentProfile(subscription.getId(), 123)
        );
    }
}
