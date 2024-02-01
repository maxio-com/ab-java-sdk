package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceCustomField;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Subscription;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.models.CustomFieldOwner.CUSTOMER;
import static com.maxio.advancedbilling.models.CustomFieldOwner.SUBSCRIPTION;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerUpdateCustomerInformationChangesTest extends BaseCustomerInformationTest {
    @Test
    void shouldUpdateCustomerInformation() throws IOException, ApiException {
        // given
        TestData testData = setupCustomerDataChangedScenario();
        Customer customerBeforeUpdate = testData.customerBeforeUpdate();
        Customer customerAfterUpdate = testData.customerAfterUpdate();
        Invoice invoiceBeforeUpdate = testData.openInvoice();

        // when
        Invoice invoiceAfterUpdate = INVOICES_CONTROLLER.updateCustomerInformation(invoiceBeforeUpdate.getUid());

        // then
        assertThat(invoiceAfterUpdate).isNotNull();

        assertCustomer(invoiceBeforeUpdate.getCustomer(), customerBeforeUpdate);
        assertCustomer(invoiceAfterUpdate.getCustomer(), customerAfterUpdate);

        assertShippingData(invoiceBeforeUpdate.getShippingAddress(), customerBeforeUpdate);
        assertShippingData(invoiceAfterUpdate.getShippingAddress(), customerAfterUpdate);

        assertThat(invoiceBeforeUpdate.getCustomFields())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField1",
                                "value1", subscriptionMetadata.get("SubscriptionField1").getId()),
                        new InvoiceCustomField(customer.getId(), CUSTOMER, "CustomerField1",
                                "value1", customerMetadata.get("CustomerField1").getId())
                );

        assertThat(invoiceAfterUpdate.getCustomFields())
                .usingRecursiveFieldByFieldElementComparator()
                .hasSize(2)
                .containsExactlyInAnyOrder(
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField2",
                                "value2", subscriptionMetadata.get("SubscriptionField2").getId()),
                        new InvoiceCustomField(customer.getId(), CUSTOMER, "CustomerField1",
                                "newValue1", customerMetadata.get("CustomerField1").getId())
                );
    }

    @Test
    void shouldThrowExceptionIfInvoiceIsNotOpen() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        Invoice paidInvoice = INVOICES_CONTROLLER.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PAID)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        // when then
        assertThatErrorListResponse(() -> INVOICES_CONTROLLER.updateCustomerInformation(paidInvoice.getUid()))
                .hasErrors("Invoice must have an open status")
                .isUnprocessableEntity();
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getInvoicesController()
                .updateCustomerInformation("uid")
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> INVOICES_CONTROLLER.updateCustomerInformation("uid_not_found"));
    }

    private void assertCustomer(InvoiceCustomer invoiceCustomer, Customer customer) {
        assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName());
        assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail());
        assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization());
        assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference());
        assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId());
    }
}
