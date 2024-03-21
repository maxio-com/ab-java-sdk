package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListComponentsInput;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsInput;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsItem;
import com.maxio.advancedbilling.models.ListSubscriptionsInput;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
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

    public void deleteSubscriptions() throws IOException, ApiException {
        LOGGER.info("Deleting all subscriptions");
        List<SubscriptionResponse> subscriptions = advancedBillingClient.getSubscriptionsController()
                .listSubscriptions(new ListSubscriptionsInput.Builder().perPage(200).build());

        while (!subscriptions.isEmpty()) {
            LOGGER.info("Subscription batch: {}", subscriptions.size());
            for (SubscriptionResponse subscription : subscriptions) {
                LOGGER.info("Purging subscription: {}", subscription.getSubscription().getId());
                advancedBillingClient.getSubscriptionsController()
                        .purgeSubscription(subscription.getSubscription().getId(), subscription.getSubscription().getCustomer().getId(), null);
                LOGGER.info("Subscription purged successfully: {}", subscription.getSubscription().getId());
            }

            subscriptions = advancedBillingClient.getSubscriptionsController()
                    .listSubscriptions(new ListSubscriptionsInput.Builder().perPage(200).build());
        }
    }

    public void deleteSubscriptionGroup(SubscriptionGroupSignupResponse groupSignup) throws IOException, ApiException {
        if (groupSignup != null) {
            deleteSubscriptionGroup(groupSignup.getPrimarySubscriptionId(), groupSignup.getSubscriptionIds(), groupSignup.getCustomerId());
        }
    }

    public void deleteAllSubscriptionGroups() throws IOException, ApiException {
        LOGGER.info("Deleting all subscription groups");
        List<ListSubscriptionGroupsItem> subscriptionGroups = advancedBillingClient.getSubscriptionGroupsController()
                .listSubscriptionGroups(new ListSubscriptionGroupsInput()).getSubscriptionGroups();

        while (!subscriptionGroups.isEmpty()) {
            LOGGER.info("Subscription groups batch: {}", subscriptionGroups.size());
            for (ListSubscriptionGroupsItem group : subscriptionGroups) {
                LOGGER.info("Purging subscription group: {}", group.getUid());
                deleteSubscriptionGroup(group.getPrimarySubscriptionId(), group.getSubscriptionIds(), group.getCustomerId());
                LOGGER.info("Subscription group purged successfully: {}", group.getUid());
            }

            subscriptionGroups = advancedBillingClient.getSubscriptionGroupsController()
                    .listSubscriptionGroups(new ListSubscriptionGroupsInput()).getSubscriptionGroups();
        }
    }

    public void deleteSubscriptionGroup(Integer primarySubscriptionId, List<Integer> subscriptionsIds,
                                        Integer customerId) throws IOException, ApiException {
        SubscriptionGroupsController subscriptionGroupsController = advancedBillingClient.getSubscriptionGroupsController();

        for (Integer subscriptionId : subscriptionsIds) {
            if (!primarySubscriptionId.equals(subscriptionId)) {
                subscriptionGroupsController.removeSubscriptionFromGroup(subscriptionId);
            }
        }

        subscriptionGroupsController.removeSubscriptionFromGroup(primarySubscriptionId);
        deleteCustomer(new Customer.Builder().id(customerId).build());
    }

    public void archiveComponents() throws IOException, ApiException {
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

    private List<ComponentResponse> listComponents() throws IOException, ApiException {
        return advancedBillingClient.getComponentsController()
                .listComponents(new ListComponentsInput.Builder()
                        .page(1)
                        .perPage(200)
                        .build());
    }

    public void deleteMetafields() throws IOException, ApiException {
        for (ResourceType resourceType : ResourceType.values()) {
            List<Metafield> metafields = listMetafields(resourceType);
            while (!metafields.isEmpty()) {
                for (Metafield metafield : metafields) {
                    advancedBillingClient.getCustomFieldsController()
                            .deleteMetafield(resourceType, metafield.getName());
                    metafields = listMetafields(resourceType);
                }
            }
        }
    }

    private List<Metafield> listMetafields(ResourceType resourceType) throws IOException, ApiException {
        return advancedBillingClient.getCustomFieldsController().listMetafields(new ListMetafieldsInput.Builder()
                        .perPage(200)
                        .resourceType(resourceType)
                        .build())
                .getMetafields();
    }

}
