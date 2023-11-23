package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import io.apimatic.core.types.CoreApiException;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CustomersControllerDeleteTest {

    private final CustomersController customersController = TestClient.createClient().getCustomersController();

    @Test
    void shouldDeleteCustomerByChargifyID() throws IOException, ApiException {
        // given
        int chargifyId = customersController
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

        // when
        customersController.deleteCustomer(chargifyId);

        // then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> customersController.readCustomer(chargifyId))
                .withMessage("HTTP Response Not OK")
                .extracting(CoreApiException::getResponseCode)
                .isEqualTo(404);
    }

    @Test
    void shouldNotDeleteCustomerAndReturn404WhenProvidingNotExistingChargifyID() {
        // given
        int notExistingChargifyID = 12345;

        // when - then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> customersController.deleteCustomer(notExistingChargifyID))
                .withMessage("HTTP Response Not OK")
                .extracting(CoreApiException::getResponseCode)
                .isEqualTo(404);
    }
}
