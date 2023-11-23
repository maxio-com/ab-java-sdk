package com.maxio.advancedbilling.controllers.cusomers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.CustomerErrorResponseException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerError;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomersControllerCreateTest {

    private final CustomersController customersController = TestClient.createClient().getCustomersController();

    @Test
    void shouldCreateCustomerWhenOnlyRequiredParametersAreProvided() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .build())
                )
                .getCustomer();

        // then
        assertAll(
                () -> assertThat(customer.getFirstName()).isEqualTo("Cathryn"),
                () -> assertThat(customer.getLastName()).isEqualTo("Washington"),
                () -> assertThat(customer.getEmail()).isEqualTo("martha@example.com"),

                () -> assertThat(customer.getId()).isNotNull(),
                () -> assertThat(customer.getCreatedAt()).isNotNull(),
                () -> assertThat(customer.getUpdatedAt()).isNotNull(),

                () -> assertThat(customer.getCcEmails()).isNull(),
                () -> assertThat(customer.getOrganization()).isNull(),
                () -> assertThat(customer.getReference()).isNull(),
                () -> assertThat(customer.getAddress()).isNull(),
                () -> assertThat(customer.getAddress2()).isNull(),
                () -> assertThat(customer.getCity()).isNull(),
                () -> assertThat(customer.getState()).isNull(),
                () -> assertThat(customer.getStateName()).isNull(),
                () -> assertThat(customer.getZip()).isNull(),
                () -> assertThat(customer.getCountry()).isNull(),
                () -> assertThat(customer.getCountryName()).isNull(),
                () -> assertThat(customer.getPhone()).isNull(),
                () -> assertThat(customer.getVerified()).isFalse(),
                () -> assertThat(customer.getPortalCustomerCreatedAt()).isNull(),
                () -> assertThat(customer.getPortalInviteLastSentAt()).isNull(),
                () -> assertThat(customer.getPortalInviteLastAcceptedAt()).isNull(),
                () -> assertThat(customer.getTaxExempt()).isFalse(),
                () -> assertThat(customer.getVatNumber()).isNull(),
                () -> assertThat(customer.getParentId()).isNull(),
                () -> assertThat(customer.getLocale()).isNull(),
                () -> assertThat(customer.getDefaultSubscriptionGroupUid()).isNull()
        );
    }

    @Test
    void shouldCreateCustomerWhenAllParametersAreProvided() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .ccEmails("washington@example.com")
                        .organization("Maxio")
                        .reference("123")
                        .address("739 Stephon Bypass")
                        .address2("Apt. 123")
                        .city("San Antonio")
                        .state("TX")
                        .zip("78015")
                        .country("US")
                        .phone("555-111-222")
                        .locale("es-MX")
                        .vatNumber("123")
                        .taxExempt(true)
                        .taxExemptReason("N")   // Local government (US only)
                        .parentId(null)
                        .build())
                )
                .getCustomer();

        // then
        assertAll(
                () -> assertThat(customer.getFirstName()).isEqualTo("Cathryn"),
                () -> assertThat(customer.getLastName()).isEqualTo("Washington"),
                () -> assertThat(customer.getEmail()).isEqualTo("martha@example.com"),

                () -> assertThat(customer.getId()).isNotNull(),
                () -> assertThat(customer.getCreatedAt()).isNotNull(),
                () -> assertThat(customer.getUpdatedAt()).isNotNull(),

                () -> assertThat(customer.getCcEmails()).isEqualTo("washington@example.com"),
                () -> assertThat(customer.getOrganization()).isEqualTo("Maxio"),
                () -> assertThat(customer.getReference()).isEqualTo("123"),
                () -> assertThat(customer.getAddress()).isEqualTo("739 Stephon Bypass"),
                () -> assertThat(customer.getAddress2()).isEqualTo("Apt. 123"),
                () -> assertThat(customer.getCity()).isEqualTo("San Antonio"),
                () -> assertThat(customer.getState()).isEqualTo("TX"),
                () -> assertThat(customer.getStateName()).isEqualTo("Texas"),
                () -> assertThat(customer.getZip()).isEqualTo("78015"),
                () -> assertThat(customer.getCountry()).isEqualTo("US"),
                () -> assertThat(customer.getCountryName()).isEqualTo("United States"),
                () -> assertThat(customer.getPhone()).isEqualTo("555-111-222"),
                () -> assertThat(customer.getVerified()).isFalse(),
                () -> assertThat(customer.getPortalCustomerCreatedAt()).isNull(),
                () -> assertThat(customer.getPortalInviteLastSentAt()).isNull(),
                () -> assertThat(customer.getPortalInviteLastAcceptedAt()).isNull(),
                () -> assertThat(customer.getTaxExempt()).isTrue(),
                () -> assertThat(customer.getVatNumber()).isEqualTo("123"),
                () -> assertThat(customer.getParentId()).isNull(),
                () -> assertThat(customer.getLocale()).isEqualTo("es-MX"),
                () -> assertThat(customer.getDefaultSubscriptionGroupUid()).isNull()
        );
    }

    @Test
    void shouldNotCreateCustomerWhenRequestIsNull() {
        // when - then
        assertThatExceptionOfType(CustomerErrorResponseException.class)
                .isThrownBy(() -> customersController.createCustomer(null))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors().toString()).isEqualTo(
                            CustomerErrorResponseErrors
                                    .fromCustomerError(new CustomerError("can't be blank"))
                                    .toString()
                    );
                });
    }

    @ParameterizedTest
    @MethodSource("argsForShouldNotCreateCustomerWhenAnyOfTheRequiredParameterIsMissing")
    void shouldNotCreateCustomerWhenAnyOfTheRequiredParameterIsMissing(CreateCustomer createCustomer, List<String> errorMessages) {
        // when - then
        assertThatExceptionOfType(CustomerErrorResponseException.class)
                .isThrownBy(() -> customersController.createCustomer(new CreateCustomerRequest(createCustomer)))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors().toString())
                            .isEqualTo(CustomerErrorResponseErrors.fromListOfString(errorMessages).toString());
                });
    }

    private static Stream<Arguments> argsForShouldNotCreateCustomerWhenAnyOfTheRequiredParameterIsMissing() {
        String firstName = "Cathryn";
        String lastName = "Washington";
        String email = "martha@example.com";

        return Stream.of(
                Arguments.of(
                        new CreateCustomer(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().firstName(firstName).build(),
                        Arrays.asList("Last name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().lastName(lastName).build(),
                        Arrays.asList("First name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().email(email).build(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().firstName(firstName).lastName(lastName).build(),
                        Collections.singletonList("Email address: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().firstName(firstName).email(email).build(),
                        Collections.singletonList("Last name: cannot be blank.")
                ),
                Arguments.of(
                        new CreateCustomer.Builder().lastName(lastName).email(email).build(),
                        Collections.singletonList("First name: cannot be blank.")
                )
        );
    }
}
