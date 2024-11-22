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
import com.maxio.advancedbilling.models.ListPaymentProfilesInput;
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
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentProfilesControllerListTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();

    private static Customer customerWithCreditCardPaymentProfiles;
    private static Customer customerWithBankAccountPaymentProfiles;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customerWithCreditCardPaymentProfiles = TEST_SETUP.createCustomer();
        customerWithBankAccountPaymentProfiles = TEST_SETUP.createCustomer();

        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            // credit card payment profiles
            PAYMENT_PROFILES_CONTROLLER.createPaymentProfile(
                    new CreatePaymentProfileRequest(
                            new CreatePaymentProfile.Builder()
                                    .customerId(customerWithCreditCardPaymentProfiles.getId())
                                    .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(random.nextInt(1, 13)))
                                    .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(random.nextInt(2030, 2040)))
                                    .fullNumber("4111111111111111")
                                    .build()
                    )
            );
        }

        // payment profile for ACH usage
        PAYMENT_PROFILES_CONTROLLER.createPaymentProfile(new CreatePaymentProfileRequest(
                        new CreatePaymentProfile.Builder()
                                .customerId(customerWithBankAccountPaymentProfiles.getId())
                                .bankName("Best Bank")
                                .bankRoutingNumber("021000089")
                                .bankAccountNumber("111111111111")
                                .bankAccountType(BankAccountType.CHECKING)
                                .bankAccountHolderType(BankAccountHolderType.BUSINESS)
                                .paymentType(PaymentType.BANK_ACCOUNT)
                                .build()
                )
        );
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteCustomer(customerWithCreditCardPaymentProfiles);
        testTeardown.deleteCustomer(customerWithBankAccountPaymentProfiles);
    }

    @Test
    void shouldReturnListOfCreditCardPaymentProfilesForCustomer() throws IOException, ApiException {
        // when - then
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(new ListPaymentProfilesInput.Builder()
                .customerId(customerWithCreditCardPaymentProfiles.getId())
                .build())
        )
                .hasSize(2)
                .map(readPaymentProfileResponse -> readPaymentProfileResponse
                        .getPaymentProfile()
                        .match(new PaymentProfileResponsePaymentProfileGetter<CreditCardPaymentProfile>())
                )
                .allSatisfy(creditCardPaymentProfile -> {
                    assertThat(creditCardPaymentProfile.getId()).isNotNull();
                    assertThat(creditCardPaymentProfile.getFirstName()).isEqualTo(customerWithCreditCardPaymentProfiles.getFirstName());
                    assertThat(creditCardPaymentProfile.getLastName()).isEqualTo(customerWithCreditCardPaymentProfiles.getLastName());
                    assertThat(creditCardPaymentProfile.getMaskedCardNumber()).isEqualTo("XXXX-XXXX-XXXX-1111");
                    assertThat(creditCardPaymentProfile.getCardType()).isEqualTo(CardType.VISA);
                    assertThat(creditCardPaymentProfile.getExpirationMonth()).isNotNull();
                    assertThat(creditCardPaymentProfile.getExpirationYear()).isNotNull();
                    assertThat(creditCardPaymentProfile.getCustomerId()).isEqualTo(customerWithCreditCardPaymentProfiles.getId());
                    assertThat(creditCardPaymentProfile.getCurrentVault()).isEqualTo(CreditCardVault.BOGUS);
                    assertThat(creditCardPaymentProfile.getVaultToken()).isNotNull();
                    assertThat(creditCardPaymentProfile.getBillingAddress()).isNull();
                    assertThat(creditCardPaymentProfile.getBillingCity()).isNull();
                    assertThat(creditCardPaymentProfile.getBillingState()).isNull();
                    assertThat(creditCardPaymentProfile.getBillingZip()).isNull();
                    assertThat(creditCardPaymentProfile.getBillingCountry()).isNull();
                    assertThat(creditCardPaymentProfile.getCustomerVaultToken()).isNull();
                    assertThat(creditCardPaymentProfile.getBillingAddress2()).isNull();
                    assertThat(creditCardPaymentProfile.getSiteGatewaySettingId()).isNull();
                    assertThat(creditCardPaymentProfile.getPaymentType()).isEqualTo(PaymentType.CREDIT_CARD);
                    assertThat(creditCardPaymentProfile.getDisabled()).isFalse();
                    assertThat(creditCardPaymentProfile.getGatewayHandle()).isNull();
                });
    }

    @Test
    void shouldReturnListOfBankAccountPaymentProfilesForCustomer() throws IOException, ApiException {
        // when - then
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(new ListPaymentProfilesInput.Builder()
                .customerId(customerWithBankAccountPaymentProfiles.getId())
                .build())
        )
                .hasSize(1)
                .map(readPaymentProfileResponse -> readPaymentProfileResponse
                        .getPaymentProfile()
                        .match(new PaymentProfileResponsePaymentProfileGetter<BankAccountPaymentProfile>())
                )
                .singleElement()
                .satisfies(bankAccountPaymentProfile -> {
                    assertThat(bankAccountPaymentProfile.getId()).isNotNull();
                    assertThat(bankAccountPaymentProfile.getFirstName()).isEqualTo(customerWithBankAccountPaymentProfiles.getFirstName());
                    assertThat(bankAccountPaymentProfile.getLastName()).isEqualTo(customerWithBankAccountPaymentProfiles.getLastName());
                    assertThat(bankAccountPaymentProfile.getMaskedBankRoutingNumber()).isEqualTo("XXXX0089");
                    assertThat(bankAccountPaymentProfile.getMaskedBankAccountNumber()).isEqualTo("XXXX1111");
                    assertThat(bankAccountPaymentProfile.getCustomerId()).isEqualTo(customerWithBankAccountPaymentProfiles.getId());
                    assertThat(bankAccountPaymentProfile.getCurrentVault()).isEqualTo(BankAccountVault.BOGUS);
                    assertThat(bankAccountPaymentProfile.getVaultToken()).isEqualTo("111111111111");
                    assertThat(bankAccountPaymentProfile.getCustomerVaultToken()).isNull();
                    assertThat(bankAccountPaymentProfile.getBankName()).isEqualTo("Best Bank");
                    assertThat(bankAccountPaymentProfile.getBankAccountType()).isEqualTo(BankAccountType.CHECKING);
                    assertThat(bankAccountPaymentProfile.getBankAccountHolderType()).isEqualTo(BankAccountHolderType.BUSINESS);
                    assertThat(bankAccountPaymentProfile.getPaymentType()).isEqualTo(PaymentType.BANK_ACCOUNT);
                    assertThat(bankAccountPaymentProfile.getVerified()).isFalse();
                    assertThat(bankAccountPaymentProfile.getGatewayHandle()).isNull();
                });
    }

    @Test
    void shouldReturnEmptyListForNotExistentCustomer() throws IOException, ApiException {
        // when - then
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(new ListPaymentProfilesInput.Builder().customerId(123).build()))
                .isEmpty();
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getPaymentProfilesController()
                        .listPaymentProfiles(new ListPaymentProfilesInput())
        );
    }
}
