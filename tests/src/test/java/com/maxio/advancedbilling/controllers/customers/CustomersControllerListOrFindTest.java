package com.maxio.advancedbilling.controllers.customers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerResponse;
import com.maxio.advancedbilling.models.ListCustomersInput;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomersControllerListOrFindTest {

    private static final CustomersController CUSTOMERS_CONTROLLER = TestClient.createClient().getCustomersController();
    private static final Customer[] TEST_CUSTOMERS = new Customer[10];

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        new TestTeardown().deleteCustomers();

        for (int i = 0; i < TEST_CUSTOMERS.length; i++) {
            TEST_CUSTOMERS[i] = CUSTOMERS_CONTROLLER
                    .createCustomer(new CreateCustomerRequest(new CreateCustomer.Builder()
                            .firstName(String.format("Cathryn-%s", i))
                            .lastName(String.format("Washington-%s", i))
                            .email(String.format("martha-%s@example.com", i))
                            .organization("Maxio.com")
                            .reference(RandomStringUtils.randomAlphanumeric(10))
                            .build())
                    )
                    .getCustomer();
        }
    }

    @BeforeEach
    void beforeEach() {
        assertThat(TEST_CUSTOMERS).hasSize(10);
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingEmail() throws IOException, ApiException {
        // given
        String email = "martha-2@example.com";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(email).build());

        // then
        assertThat(listCustomers).hasSize(1);
        Customer customer = listCustomers.get(0).getCustomer();
        assertAll(
                () -> assertThat(customer.getFirstName()).isEqualTo("Cathryn-2"),
                () -> assertThat(customer.getLastName()).isEqualTo("Washington-2"),
                () -> assertThat(customer.getEmail()).isEqualTo("martha-2@example.com"),

                () -> assertThat(customer.getId()).isNotNull(),
                () -> assertThat(customer.getCreatedAt()).isNotNull(),
                () -> assertThat(customer.getUpdatedAt()).isNotNull(),

                () -> assertThat(customer.getCcEmails()).isNull(),
                () -> assertThat(customer.getOrganization()).isEqualTo("Maxio.com"),
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

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingEmail() throws IOException, ApiException {
        // given
        String notExistingEmail = "not-existing@email.com";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingEmail).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingChargifyID() throws IOException, ApiException {
        // given
        Integer chargifyId = TEST_CUSTOMERS[0].getId();

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(chargifyId.toString()).build());

        // then
        assertThat(listCustomers).hasSize(1);
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingChargifyID() throws IOException, ApiException {
        // given
        String notExistingChargifyId = "123456";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingChargifyId).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingOrganization() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(organization).build());

        // then
        assertThat(listCustomers).hasSize(10);
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingOrganization() throws IOException, ApiException {
        // given
        String notExistingOrganization = "Google.com";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingOrganization).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingReference() throws IOException, ApiException {
        // given
        String reference = TEST_CUSTOMERS[0].getReference();

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(reference).build());

        // then
        assertThat(listCustomers).hasSize(1);
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingReference() throws IOException, ApiException {
        // given
        String notExistingReference = RandomStringUtils.randomAlphanumeric(10);

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingReference).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingFirstName() throws IOException, ApiException {
        // given
        String firstName = "Cathryn-2";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(firstName).build());

        // then
        assertThat(listCustomers).hasSize(1);
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingFirstName() throws IOException, ApiException {
        // given
        String notExistingFirstName = "NotExistingFirstName";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingFirstName).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingLastName() throws IOException, ApiException {
        // given
        String lastName = "Washington-2";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(lastName).build());

        // then
        assertThat(listCustomers).hasSize(1);
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByNotExistingLastName() throws IOException, ApiException {
        // given
        String notExistingLastName = "NotExistingLastName";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder().q(notExistingLastName).build());

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingOrganizationAndSortDescDirection() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";
        SortingDirection sortDescDirection = SortingDirection.DESC;

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .direction(sortDescDirection)
                        .q(organization)
                        .build()
                );

        // then
        assertThat(listCustomers).hasSize(10);
        assertThat(listCustomers.get(0).getCustomer().getFirstName()).isEqualTo("Cathryn-9");
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingOrganizationAndSortAscDirection() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";
        SortingDirection sortAscDirection = SortingDirection.ASC;

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .direction(sortAscDirection)
                        .q(organization)
                        .build()
                );

        // then
        assertThat(listCustomers).hasSize(10);
        assertThat(listCustomers.get(0).getCustomer().getFirstName()).isEqualTo("Cathryn-0");
    }

    @Test
    void shouldReturnNotEmptyListWhenSearchingByExistingOrganizationUsingPagination() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";
        int perPage = 3;

        // when
        // 1st page (default if not provided)
        List<CustomerResponse> listCustomersOnPage1 = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .page(1)
                        .perPage(perPage)
                        .q(organization)
                        .build()
                );

        // 2nd page
        List<CustomerResponse> listCustomersOnPage2 = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .page(2)
                        .perPage(perPage)
                        .q(organization)
                        .build()
                );

        // 3rd page
        List<CustomerResponse> listCustomersOnPage3 = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .page(3)
                        .perPage(perPage)
                        .q(organization)
                        .build()
                );

        // 4th page
        List<CustomerResponse> listCustomersOnPage4 = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .page(4)
                        .perPage(perPage)
                        .q(organization)
                        .build()
                );

        // n-th page
        List<CustomerResponse> listCustomersOnPageN = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .page(5)
                        .perPage(perPage)
                        .q(organization)
                        .build()
                );

        // then
        assertThat(listCustomersOnPage1).hasSize(3);
        assertThat(listCustomersOnPage2).hasSize(3);
        assertThat(listCustomersOnPage3).hasSize(3);
        assertThat(listCustomersOnPage4).hasSize(1);
        assertThat(listCustomersOnPageN).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByExistingOrganizationAndCreatedAtNotMatchingDateRange() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";
        BasicDateField createdAt = BasicDateField.CREATED_AT;
        String createdAtStartDate = "2020-01-01";
        String createdAtEndDate = "2020-05-25";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .dateField(createdAt)
                        .startDate(createdAtStartDate)
                        .endDate(createdAtEndDate)
                        .q(organization)
                        .build()
                );

        // then
        assertThat(listCustomers).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenSearchingByExistingOrganizationAndUpdatedAtNotMatchingDateTimeRange() throws IOException, ApiException {
        // given
        String organization = "Maxio.com";
        BasicDateField updatedAt = BasicDateField.UPDATED_AT;
        String updatedAtStartDateTime = "2020-01-01 10:12:55";
        String updatedAtEndDateTime = "2020-05-25 23:55:59";

        // when
        List<CustomerResponse> listCustomers = CUSTOMERS_CONTROLLER
                .listCustomers(new ListCustomersInput.Builder()
                        .dateField(updatedAt)
                        .startDate(updatedAtStartDateTime)
                        .endDate(updatedAtEndDateTime)
                        .q(organization)
                        .build()
                );

        // then
        assertThat(listCustomers).isEmpty();
    }
}
