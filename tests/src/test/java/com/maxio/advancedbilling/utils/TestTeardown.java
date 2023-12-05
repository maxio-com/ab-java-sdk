package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerResponse;
import com.maxio.advancedbilling.models.ListCustomersInput;
import com.maxio.advancedbilling.models.SubscriptionResponse;

import java.io.IOException;
import java.util.List;

public class TestTeardown {
    private final AdvancedBillingClient advancedBillingClient = TestClient.createClient();

    public void deleteCustomer(Customer customer) throws IOException, ApiException {
        if (customer == null) {
            return;
        }
        List<SubscriptionResponse> subscriptions = advancedBillingClient.getCustomersController().listCustomerSubscriptions(customer.getId());
        for (SubscriptionResponse subscription : subscriptions) {
            advancedBillingClient.getSubscriptionsController()
                    .purgeSubscription(subscription.getSubscription().getId(), customer.getId(), null);
        }
        advancedBillingClient.getCustomersController().deleteCustomer(customer.getId());
    }

    public void deleteCustomers() throws IOException, ApiException {
        List<CustomerResponse> customers = listCustomers();
        while (!customers.isEmpty()) {
            for (CustomerResponse customer : customers) {
                deleteCustomer(customer.getCustomer());
            }
            customers = listCustomers();
        }
    }

    public List<CustomerResponse> listCustomers() throws IOException, ApiException {
        return advancedBillingClient.getCustomersController()
                .listCustomers(new ListCustomersInput.Builder()
                        .page(1)
                        .perPage(200)
                        .build());
    }
}
