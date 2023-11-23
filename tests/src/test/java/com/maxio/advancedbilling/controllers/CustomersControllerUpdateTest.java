package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.CustomerErrorResponseException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerError;
import com.maxio.advancedbilling.models.UpdateCustomer;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
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

class CustomersControllerUpdateTest {

    private final CustomersController customersController = TestClient.createClient().getCustomersController();

    private Integer customerId;

    @BeforeEach
    void setUp() throws IOException, ApiException {
        customerId = customersController
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
    }

    @Test
    void shouldUpdateCustomerWithNewFirstName() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .updateCustomer(
                        customerId,
                        new UpdateCustomerRequest(new UpdateCustomer().toBuilder().firstName("Martha").build())
                )
                .getCustomer();

        // then
        assertThat(customer.getFirstName()).isEqualTo("Martha");
        assertThat(customer.getLastName()).isEqualTo("Washington");
        assertThat(customer.getEmail()).isEqualTo("martha@example.com");
    }

    @Test
    void shouldUpdateCustomerWithNewLastName() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .updateCustomer(
                        customerId,
                        new UpdateCustomerRequest(new UpdateCustomer().toBuilder().lastName("Newman").build())
                )
                .getCustomer();

        // then
        assertThat(customer.getFirstName()).isEqualTo("Cathryn");
        assertThat(customer.getLastName()).isEqualTo("Newman");
        assertThat(customer.getEmail()).isEqualTo("martha@example.com");
    }

    @Test
    void shouldUpdateCustomerWithNewEmail() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .updateCustomer(
                        customerId,
                        new UpdateCustomerRequest(new UpdateCustomer().toBuilder().email("company@test.com").build())
                )
                .getCustomer();

        // then
        assertThat(customer.getFirstName()).isEqualTo("Cathryn");
        assertThat(customer.getLastName()).isEqualTo("Washington");
        assertThat(customer.getEmail()).isEqualTo("company@test.com");
    }

    @Test
    void shouldUpdateCustomerWithNewProperties() throws IOException, ApiException {
        // when
        Customer customer = customersController
                .updateCustomer(
                        customerId,
                        new UpdateCustomerRequest(new UpdateCustomer()
                                .toBuilder()
                                .firstName("Martha")
                                .lastName("Newman")
                                .email("company@test.com")
                                .country("US")
                                .state("NY")
                                .city("New York")
                                .build()
                        )
                )
                .getCustomer();

        // then
        assertThat(customer.getFirstName()).isEqualTo("Martha");
        assertThat(customer.getLastName()).isEqualTo("Newman");
        assertThat(customer.getEmail()).isEqualTo("company@test.com");
        assertThat(customer.getCountry()).isEqualTo("US");
        assertThat(customer.getState()).isEqualTo("NY");
        assertThat(customer.getCity()).isEqualTo("New York");
    }

    @Test
    void shouldReturn404WhenNotExists() {
        int notExistingCustomerId = 123;

        // when - then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> customersController.updateCustomer(notExistingCustomerId, new UpdateCustomerRequest()))
                .withMessage("Not Found")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    @Test
    void shouldNotUpdateCustomerWhenRequestIsNull() {
        // when - then
        assertThatExceptionOfType(CustomerErrorResponseException.class)
                .isThrownBy(() -> customersController.updateCustomer(customerId, null))
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

    @Test
    void shouldNotUpdateCustomerWhenRequestIsEmpty() {
        // when - then
        assertThatExceptionOfType(CustomerErrorResponseException.class)
                .isThrownBy(() -> customersController.updateCustomer(
                        customerId,
                        new UpdateCustomerRequest(new UpdateCustomer())
                ))
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
    @MethodSource("argsForShouldNotUpdateCustomerWhenBasicParametersAreBlank")
    void shouldNotUpdateCustomerWhenBasicParametersAreBlank(UpdateCustomer updateCustomer, List<String> errorMessages) {
        // when - then
        assertThatExceptionOfType(CustomerErrorResponseException.class)
                .isThrownBy(() -> customersController.updateCustomer(
                        customerId, new UpdateCustomerRequest(updateCustomer))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors().toString())
                            .isEqualTo(CustomerErrorResponseErrors.fromListOfString(errorMessages).toString());
                });
    }

    private static Stream<Arguments> argsForShouldNotUpdateCustomerWhenBasicParametersAreBlank() {
        return Stream.of(
                Arguments.of(
                        new UpdateCustomer().toBuilder().firstName("").lastName("").email("").build(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().firstName("").build(),
                        Collections.singletonList("First name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().lastName("").build(),
                        Collections.singletonList("Last name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().email("").build(),
                        Collections.singletonList("Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().firstName("").lastName("").build(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().firstName("").email("").build(),
                        Arrays.asList("First name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer().toBuilder().lastName("").email("").build(),
                        Arrays.asList("Last name: cannot be blank.", "Email address: cannot be blank.")
                )
        );
    }
}