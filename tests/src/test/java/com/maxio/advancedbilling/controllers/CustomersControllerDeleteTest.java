package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;

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
        assertNotFound(() -> customersController.readCustomer(chargifyId));
    }

    @Test
    void shouldNotDeleteCustomerAndReturn404WhenProvidingNotExistingChargifyID() {
        // when - then
        assertNotFound(() -> customersController.deleteCustomer(12345));
    }
}
