package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.Customer;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomersControllerReadTest {

    private static final CustomersController CUSTOMERS_CONTROLLER = TestClient.createClient().getCustomersController();

    private static Customer TEST_CUSTOMER;

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        TEST_CUSTOMER = CUSTOMERS_CONTROLLER
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
                .getCustomer();
    }

    @Test
    void shouldReturnCustomerWhenReadByExistingChargifyID() throws IOException, ApiException {
        // given
        Integer chargifyId = TEST_CUSTOMER.getId();

        // when
        Customer customerReadByChargifyID = CUSTOMERS_CONTROLLER.readCustomer(chargifyId).getCustomer();

        // then
        assertCustomerAllProperties(customerReadByChargifyID);
    }

    @Test
    void shouldReturn404WhenReadByNotExistingChargifyID() {
        // given
        int notExistingChargifyId = 12345;

        // when - then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> CUSTOMERS_CONTROLLER.readCustomer(notExistingChargifyId))
                .withMessage("HTTP Response Not OK")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    @Test
    void shouldReturnCustomerWhenReadByExistingReference() throws IOException, ApiException {
        // given
        String reference = TEST_CUSTOMER.getReference();

        // when
        Customer customerReadByReference = CUSTOMERS_CONTROLLER.readCustomerByReference(reference).getCustomer();

        // then
        assertCustomerAllProperties(customerReadByReference);
    }

    @Test
    void shouldReturn404WhenReadByNotExistingReference() {
        // given
        String notExistingReference = "not-existing-reference";

        // when - then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> CUSTOMERS_CONTROLLER.readCustomerByReference(notExistingReference))
                .withMessage("HTTP Response Not OK")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    private void assertCustomerAllProperties(Customer customer) {
        assertAll(
                () -> assertThat(customer.getFirstName()).isEqualTo("Cathryn"),
                () -> assertThat(customer.getLastName()).isEqualTo("Washington"),
                () -> assertThat(customer.getEmail()).isEqualTo("martha@example.com"),

                () -> assertThat(customer.getId()).isNotNull(),
                () -> assertThat(customer.getCreatedAt()).isNotNull(),
                () -> assertThat(customer.getUpdatedAt()).isNotNull(),

                () -> assertThat(customer.getCcEmails()).isNull(),
                () -> assertThat(customer.getOrganization()).isNull(),
                () -> assertThat(customer.getReference()).isNotNull(),
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
}
