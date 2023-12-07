package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerResponse;
import com.maxio.advancedbilling.models.ListComponentsInput;
import com.maxio.advancedbilling.models.ListCustomersInput;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class TestTeardown {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestTeardown.class);

    private final AdvancedBillingClient advancedBillingClient = TestClient.createClient();

    public void deleteCustomer(Customer customer) throws IOException, ApiException {
        if (customer == null) {
            return;
        }
        List<SubscriptionResponse> subscriptions = advancedBillingClient.getCustomersController().listCustomerSubscriptions(customer.getId());
        for (SubscriptionResponse subscription : subscriptions) {
            LOGGER.info("Purging subscription: {}", subscription.getSubscription().getId());
            advancedBillingClient.getSubscriptionsController()
                    .purgeSubscription(subscription.getSubscription().getId(), customer.getId(), null);
            LOGGER.info("Subscription purged successfully: {}", subscription.getSubscription().getId());
        }
        LOGGER.info("Deleting customer: {}", customer.getId());
        advancedBillingClient.getCustomersController().deleteCustomer(customer.getId());
        LOGGER.info("Customer deleted: {}", customer.getId());
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

    public void deleteComponents() throws IOException, ApiException {
        List<ComponentResponse> components = listComponents();
        while (!components.isEmpty()) {
            for (ComponentResponse component : components) {
                advancedBillingClient.getComponentsController()
                        .archiveComponent(component.getComponent().getProductFamilyId(),
                                String.valueOf(component.getComponent().getId()));
            }
            components = listComponents();
        }
    }

    public List<ComponentResponse> listComponents() throws IOException, ApiException {
        return advancedBillingClient.getComponentsController()
                .listComponents(new ListComponentsInput.Builder()
                        .page(1)
                        .perPage(200)
                        .build());
    }

}
