package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.CreatedPaymentProfile;
import com.maxio.advancedbilling.models.CurrentVault;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.UpdatePaymentProfile;
import com.maxio.advancedbilling.models.UpdatePaymentProfileRequest;
import com.maxio.advancedbilling.models.UpdatedPaymentProfile;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationMonth;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationYear;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentProfilesControllerUpdateTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();

    private static Customer customer;
    private static CreatedPaymentProfile createdPaymentProfile;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        createdPaymentProfile = PAYMENT_PROFILES_CONTROLLER
                .createPaymentProfile(new CreatePaymentProfileRequest(new CreatePaymentProfile.Builder()
                        .customerId(customer.getId())
                        .expirationMonth(CreatePaymentProfileExpirationMonth.fromNumber(12))
                        .expirationYear(CreatePaymentProfileExpirationYear.fromNumber(2030))
                        .fullNumber("4111111111111111")
                        .build())
                )
                .getPaymentProfile();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldUpdatePaymentProfile() throws IOException, ApiException {
        // when
        UpdatedPaymentProfile updatedPaymentProfile = PAYMENT_PROFILES_CONTROLLER
                .updatePaymentProfile(
                        createdPaymentProfile.getId(),
                        new UpdatePaymentProfileRequest(new UpdatePaymentProfile.Builder()
                                .billingAddress("789 Juniper Court")
                                .billingCity("Boulder")
                                .billingState("CO")
                                .billingZip("80302")
                                .billingCountry("US")
                                .build()
                        )
                )
                .getPaymentProfile();

        // then
        assertThat(updatedPaymentProfile.getId()).isEqualTo(createdPaymentProfile.getId());
        assertThat(updatedPaymentProfile.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(updatedPaymentProfile.getLastName()).isEqualTo(customer.getLastName());
        assertThat(updatedPaymentProfile.getCardType()).isEqualTo(CardType.VISA);
        assertThat(updatedPaymentProfile.getExpirationMonth()).isEqualTo(createdPaymentProfile.getExpirationMonth());
        assertThat(updatedPaymentProfile.getExpirationYear()).isEqualTo(createdPaymentProfile.getExpirationYear());
        assertThat(updatedPaymentProfile.getCustomerId()).isEqualTo(customer.getId());
        assertThat(updatedPaymentProfile.getCurrentVault()).isEqualTo(CurrentVault.BOGUS);
        assertThat(updatedPaymentProfile.getVaultToken()).isEqualTo(createdPaymentProfile.getVaultToken());
        assertThat(updatedPaymentProfile.getBillingAddress()).isEqualTo("789 Juniper Court");
        assertThat(updatedPaymentProfile.getBillingCity()).isEqualTo("Boulder");
        assertThat(updatedPaymentProfile.getBillingState()).isEqualTo("CO");
        assertThat(updatedPaymentProfile.getBillingZip()).isEqualTo("80302");
        assertThat(updatedPaymentProfile.getBillingCountry()).isEqualTo("US");
        assertThat(updatedPaymentProfile.getPaymentType()).isEqualTo("credit_card");
        assertThat(updatedPaymentProfile.getGatewayHandle()).isNull();
        assertThat(updatedPaymentProfile.getMaskedCardNumber()).isEqualTo("XXXX-XXXX-XXXX-1111");
        assertThat(updatedPaymentProfile.getCustomerVaultToken()).isNull();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsMissingOrEmpty")
    void shouldReturn422WhenRequestBodyIsMissingOrEmpty(UpdatePaymentProfileRequest request) {
        // when - then
        CommonAssertions
                .assertThatErrorStringMapResponse(() -> PAYMENT_PROFILES_CONTROLLER.updatePaymentProfile(
                        createdPaymentProfile.getId(),
                        request
                ))
                .isUnprocessableEntity()
                .hasErrorMap(Map.of("payment_profile", "can't be blank"));
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsMissingOrEmpty() {
        return Stream.of(
                Arguments.arguments((Object) null),
                Arguments.arguments(new UpdatePaymentProfileRequest()),
                Arguments.arguments(new UpdatePaymentProfileRequest(new UpdatePaymentProfile()))
        );
    }

    @Test
    void shouldReturn404ForNotExistentPaymentProfile() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.updatePaymentProfile(123, new UpdatePaymentProfileRequest())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getPaymentProfilesController()
                        .updatePaymentProfile(123, new UpdatePaymentProfileRequest())
        );
    }
}
