package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerChangesPreviewResponse;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceCustomField;
import com.maxio.advancedbilling.models.InvoicePayerChange;
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

public class InvoicesControllerPreviewCustomerInformationChangesTest extends BaseCustomerInformationTest {
    @Test
    void shouldReturnEmptyPreviewIfNoChanges() throws IOException, ApiException {
        // given
        Subscription subscription = createTestSubscription();

        Invoice openInvoice = createOpenInvoice(subscription);

        // when
        CustomerChangesPreviewResponse preview = invoicesController.previewCustomerInformationChanges(openInvoice.getUid());

        // then
        assertThat(preview).isNotNull();
        assertThat(preview.getChanges()).isNotNull();
        assertThat(preview.getChanges().getBillingAddress()).isNull();
        assertThat(preview.getChanges().getShippingAddress()).isNull();
        assertThat(preview.getChanges().getPayer()).isNull();
        assertThat(preview.getChanges().getCustomFields()).isNull();
    }

    @Test
    void shouldReturnPreviewOfChanges() throws IOException, ApiException {
        // given
        TestData testData = setupCustomerDataChangedScenario();
        Customer customerBeforeUpdate = testData.customerBeforeUpdate();
        Customer customerAfterUpdate = testData.customerAfterUpdate();
        Invoice openInvoice = testData.openInvoice();

        // when
        CustomerChangesPreviewResponse preview = invoicesController.previewCustomerInformationChanges(openInvoice.getUid());

        // then
        assertThat(preview).isNotNull();
        assertThat(preview.getChanges()).isNotNull();
        assertThat(preview.getChanges().getBillingAddress()).isNull();

        assertThat(preview.getChanges().getPayer()).isNotNull();
        assertPayerData(preview.getChanges().getPayer().getBefore(), customerBeforeUpdate);
        assertPayerData(preview.getChanges().getPayer().getAfter(), customerAfterUpdate);

        assertThat(preview.getChanges().getShippingAddress()).isNotNull();
        assertShippingData(preview.getChanges().getShippingAddress().getBefore(), customerBeforeUpdate);
        assertShippingData(preview.getChanges().getShippingAddress().getAfter(), customerAfterUpdate);

        assertThat(preview.getChanges().getCustomFields()).isNotNull();
        assertThat(preview.getChanges().getCustomFields().getBefore())
                .hasSize(3)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField1",
                                "value1", subscriptionMetadata.get("SubscriptionField1").getId()),
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField2",
                                null, subscriptionMetadata.get("SubscriptionField2").getId()),
                        new InvoiceCustomField(customer.getId(), CUSTOMER, "CustomerField1",
                                "value1", customerMetadata.get("CustomerField1").getId())
                );

        assertThat(preview.getChanges().getCustomFields().getAfter())
                .usingRecursiveFieldByFieldElementComparator()
                .hasSize(3)
                .containsExactlyInAnyOrder(
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField1",
                                null, subscriptionMetadata.get("SubscriptionField1").getId()),
                        new InvoiceCustomField(subscription.getId(), SUBSCRIPTION, "SubscriptionField2",
                                "value2", subscriptionMetadata.get("SubscriptionField2").getId()),
                        new InvoiceCustomField(customer.getId(), CUSTOMER, "CustomerField1",
                                "newValue1", customerMetadata.get("CustomerField1").getId())
                );
    }

    @Test
    void shouldThrowExceptionIfInvoiceIsNotOpen() throws IOException, ApiException {
        // given
        Subscription subscription = testSetup.createSubscription(customer, product);

        Invoice paidInvoice = invoicesController.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PAID)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        // when then
        assertThatErrorListResponse(() -> invoicesController.previewCustomerInformationChanges(paidInvoice.getUid()))
                .hasErrors("Invoice must have an open status")
                .isUnprocessableEntity();
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getInvoicesController()
                .previewCustomerInformationChanges("uid")
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> invoicesController.previewCustomerInformationChanges("uid_not_found"));
    }

    private void assertPayerData(InvoicePayerChange payer, Customer customer) {
        assertThat(payer.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(payer.getLastName()).isEqualTo(customer.getLastName());
        assertThat(payer.getEmail()).isEqualTo(customer.getEmail());
        assertThat(payer.getOrganization()).isEqualTo(customer.getOrganization());
    }
}
