package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.BankAccountVault;
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

class PaymentProfilesControllerReadTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();

    private static Customer customer;
    private static CreditCardPaymentProfile creditCardPaymentProfile;
    private static BankAccountPaymentProfile bankAccountPaymentProfile;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
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
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadCreditCardPaymentProfile() throws IOException, ApiException {
        // when - then
        assertThat(PAYMENT_PROFILES_CONTROLLER
                .readPaymentProfile(creditCardPaymentProfile.getId())
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<CreditCardPaymentProfile>())
        )
                .usingRecursiveComparison()
                .ignoringFields("additionalProperties")
                .isEqualTo(new CreditCardPaymentProfile.Builder()
                        .maskedCardNumber("XXXX-XXXX-XXXX-1111")
                        .id(creditCardPaymentProfile.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .cardType(CardType.VISA)
                        .expirationMonth(creditCardPaymentProfile.getExpirationMonth())
                        .expirationYear(creditCardPaymentProfile.getExpirationYear())
                        .customerId(customer.getId())
                        .currentVault(CreditCardVault.BOGUS)
                        .vaultToken(creditCardPaymentProfile.getVaultToken())
                        .billingAddress(null)
                        .billingCity(null)
                        .billingState(null)
                        .billingZip(null)
                        .billingCountry(null)
                        .customerVaultToken(null)
                        .billingAddress2(null)
                        .paymentType(PaymentType.CREDIT_CARD)
                        .disabled(false)
                        .siteGatewaySettingId(null)
                        .gatewayHandle(null)
                        .build()
                );
    }

    @Test
    void shouldReadBankAccountPaymentProfile() throws IOException, ApiException {
        // when - then
        assertThat(PAYMENT_PROFILES_CONTROLLER
                .readPaymentProfile(bankAccountPaymentProfile.getId())
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<BankAccountPaymentProfile>())
        )
                .usingRecursiveComparison()
                .ignoringFields("additionalProperties")
                .isEqualTo(new BankAccountPaymentProfile.Builder()
                        .id(bankAccountPaymentProfile.getId())
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .maskedBankRoutingNumber("XXXX0089")
                        .maskedBankAccountNumber("XXXX1111")
                        .customerId(customer.getId())
                        .currentVault(BankAccountVault.BOGUS)
                        .vaultToken("111111111111")
                        .customerVaultToken(null)
                        .bankName("Best Bank")
                        .bankAccountType(BankAccountType.CHECKING)
                        .bankAccountHolderType(BankAccountHolderType.BUSINESS)
                        .paymentType(PaymentType.BANK_ACCOUNT)
                        .verified(false)
                        .gatewayHandle(null)
                        .build()
                );
    }

    @Test
    void shouldReturn404ForNotExistentPaymentProfile() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.readPaymentProfile(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getPaymentProfilesController()
                        .readPaymentProfile(creditCardPaymentProfile.getId())
        );
    }
}
