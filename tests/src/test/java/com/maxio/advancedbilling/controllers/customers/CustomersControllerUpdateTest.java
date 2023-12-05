package com.maxio.advancedbilling.controllers.customers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.CustomerErrorResponseException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerError;
import com.maxio.advancedbilling.models.UpdateCustomer;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
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
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .reference(RandomStringUtils.randomAlphanumeric(10))
                        .build())
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
                        new UpdateCustomerRequest(new UpdateCustomer.Builder().firstName("Martha").build())
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
                        new UpdateCustomerRequest(new UpdateCustomer.Builder().lastName("Newman").build())
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
                        new UpdateCustomerRequest(new UpdateCustomer.Builder().email("company@test.com").build())
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
                        new UpdateCustomerRequest(new UpdateCustomer.Builder()
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
        // when - then
        CommonAssertions.assertNotFound(
                () -> customersController.updateCustomer(123, new UpdateCustomerRequest()),
                "Not Found"
        );
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
                        new UpdateCustomer.Builder().firstName("").lastName("").email("").build(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().firstName("").build(),
                        Collections.singletonList("First name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().lastName("").build(),
                        Collections.singletonList("Last name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().email("").build(),
                        Collections.singletonList("Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().firstName("").lastName("").build(),
                        Arrays.asList("First name: cannot be blank.", "Last name: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().firstName("").email("").build(),
                        Arrays.asList("First name: cannot be blank.", "Email address: cannot be blank.")
                ),
                Arguments.of(
                        new UpdateCustomer.Builder().lastName("").email("").build(),
                        Arrays.asList("Last name: cannot be blank.", "Email address: cannot be blank.")
                )
        );
    }
}
