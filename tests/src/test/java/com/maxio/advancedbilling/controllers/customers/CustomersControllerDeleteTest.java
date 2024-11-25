package com.maxio.advancedbilling.controllers.customers;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;

class CustomersControllerDeleteTest {

    private final CustomersController customersController = TestClientProvider.getClient().getCustomersController();

    @Test
    void shouldDeleteCustomerByChargifyID() throws IOException, ApiException {
        // given
        int chargifyId = customersController
                .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                        .firstName("Cathryn")
                        .lastName("Washington")
                        .email("martha@example.com")
                        .reference(RandomStringUtils.randomAlphanumeric(10))
                        .build())
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
