package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardVault;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.PaymentType;
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
import static org.junit.jupiter.api.Assertions.assertAll;

class PaymentProfilesControllerCreateTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();

    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldCreatePaymentProfileForCustomer() throws IOException, ApiException {
        // when
        CreditCardPaymentProfile paymentProfile = PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                        .customerId(customer.getId())
                        .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(12))
                        .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2030))
                        .fullNumber("4111111111111111")
                        .build())
                )
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());

        // then
        assertAll(
                () -> assertThat(paymentProfile.getId()).isNotNull(),
                () -> assertThat(paymentProfile.getFirstName()).isEqualTo(customer.getFirstName()),
                () -> assertThat(paymentProfile.getLastName()).isEqualTo(customer.getLastName()),
                () -> assertThat(paymentProfile.getMaskedCardNumber()).isEqualTo("XXXX-XXXX-XXXX-1111"),
                () -> assertThat(paymentProfile.getCardType()).isEqualTo(CardType.VISA),
                () -> assertThat(paymentProfile.getExpirationMonth()).isEqualTo(12),
                () -> assertThat(paymentProfile.getExpirationYear()).isEqualTo(2030),
                () -> assertThat(paymentProfile.getCustomerId()).isEqualTo(customer.getId()),
                () -> assertThat(paymentProfile.getCurrentVault()).isEqualTo(CreditCardVault.BOGUS),
                () -> assertThat(paymentProfile.getVaultToken()).isNotNull(),
                () -> assertThat(paymentProfile.getCustomerVaultToken()).isNull(),
                () -> assertThat(paymentProfile.getBillingAddress2()).isNull(),
                () -> assertThat(paymentProfile.getPaymentType()).isEqualTo(PaymentType.CREDIT_CARD),
                () -> assertThat(paymentProfile.getDisabled()).isFalse()
        );
    }

    @Test
    void shouldReturn404WhenCreatingPaymentProfileForNotExistentCustomer() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.createPaymentProfile(
                        new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder().customerId(123).build()))
        );
    }

    @Test
    void shouldReturn422WhenRequiredParamsAreNotProvidedForCreditCard() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> PAYMENT_PROFILES_CONTROLLER
                        .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                                .customerId(customer.getId())
                                .build())
                        )
                )
                .isUnprocessableEntity()
                .hasErrors(
                        "Credit card expiration month: cannot be blank.",
                        "Credit card expiration year: cannot be blank.",
                        "Credit card number: cannot be blank."
                );
    }

    @Test
    void shouldReturn422WhenChargifyTokenCannotBeFound() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> PAYMENT_PROFILES_CONTROLLER
                        .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                                .customerId(customer.getId())
                                .chargifyToken("tok_gdnc4xc2ychfmv6spkh6sv3kaa")
                                .build())
                        )
                )
                .isUnprocessableEntity()
                .hasErrors("Chargify token not found");
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getPaymentProfilesController()
                        .createPaymentProfile(new CreatePaymentProfileRequest())
        );
    }
}
