package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

class InvoicesControllerUtils {
    private final AdvancedBillingClient client;

    public InvoicesControllerUtils(AdvancedBillingClient client) {
        this.client = client;
    }

    Invoice getPaidInvoiceForCustomer(Integer customerId) throws ApiException, IOException {
        return listInvoices(b -> b.customerIds(List.of(customerId))
                .status(InvoiceStatus.PAID))
                .get(0);
    }

    Invoice getPaidInvoiceForSubscription(Integer subscriptionId) throws ApiException, IOException {
        return listInvoices(b -> b.subscriptionId(subscriptionId)
                .status(InvoiceStatus.PAID))
                .get(0);
    }

    private List<Invoice> listInvoices(Consumer<ListInvoicesInput.Builder> customizer) throws ApiException, IOException {
        ListInvoicesInput.Builder builder = new ListInvoicesInput.Builder()
                .lineItems(true)
                .discounts(true)
                .taxes(true)
                .credits(true)
                .payments(true)
                .customFields(true)
                .refunds(true);
        customizer.accept(builder);

        return client.getInvoicesController()
                .listInvoices(builder.build())
                .getInvoices();
    }
}
