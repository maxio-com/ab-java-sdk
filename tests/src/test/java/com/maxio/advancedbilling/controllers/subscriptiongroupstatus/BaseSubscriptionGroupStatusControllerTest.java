package com.maxio.advancedbilling.controllers.subscriptiongroupstatus;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.controllers.SubscriptionGroupStatusController;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BaseSubscriptionGroupStatusControllerTest {
    protected final TestSetup testSetup = new TestSetup();
    protected final AdvancedBillingClient client = TestClientProvider.getClient();
    protected SubscriptionGroupStatusController subscriptionGroupStatusController = client.getSubscriptionGroupStatusController();
    protected SubscriptionGroupsController subscriptionGroupsController = client.getSubscriptionGroupsController();
    protected SubscriptionsController subscriptionsController = client.getSubscriptionsController();
    protected InvoicesController invoicesController = client.getInvoicesController();
    protected SubscriptionComponentsController subscriptionComponentsController = client.getSubscriptionComponentsController();

    protected Customer customer;
    protected ProductFamily productFamily;
    protected Product product;
    protected Component meteredComponent;
    protected SubscriptionGroupData subscriptionGroupData;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        customer = testSetup.createCustomer();
        productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily);
        meteredComponent = testSetup.createMeteredComponent(productFamily, 10.0);
    }

    @AfterEach
    void teardown() throws IOException, ApiException {
        if (subscriptionGroupData != null) {
            subscriptionGroupData.cleanup();
        }
    }

    @AfterAll
    void cleanupCustomer() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    protected SubscriptionGroupData createGroup() throws IOException, ApiException {
        return createGroup(b -> {
        });
    }

    protected SubscriptionGroupData createGroup(Consumer<CreateSubscription.Builder> subscriptionCustomizer) throws IOException, ApiException {
        Consumer<CreateSubscription.Builder> customizer = subscriptionCustomizer.andThen(builder ->
                builder.components(List.of(
                        new CreateSubscriptionComponent.Builder()
                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(meteredComponent.getId()))
                                .unitBalance(10)
                                .build()
                )));

        Subscription subscription1 = testSetup.createSubscription(customer, product, customizer);
        Subscription subscription2 = testSetup.createSubscription(customer, product, customizer);

        // when
        subscriptionGroupsController
                .createSubscriptionGroup(new CreateSubscriptionGroupRequest(new CreateSubscriptionGroup.Builder()
                        .subscriptionId(subscription1.getId())
                        .memberIds(List.of(subscription2.getId()))
                        .build()
                ));
        FullSubscriptionGroupResponse subscriptionGroup = subscriptionGroupsController
                .findSubscriptionGroup(subscription1.getId().toString());
        subscriptionGroupData = new SubscriptionGroupData(subscriptionGroup, subscription1, List.of(subscription2), customer);
        return subscriptionGroupData;
    }

    protected class SubscriptionGroupData {
        private final Customer customer;
        private final List<Subscription> members;
        private FullSubscriptionGroupResponse subscriptionGroup;
        private Subscription primarySubscription;
        private boolean cleaned = false;

        public SubscriptionGroupData(FullSubscriptionGroupResponse subscriptionGroup, Subscription primarySubscription, List<Subscription> members, Customer customer) {
            this.subscriptionGroup = subscriptionGroup;
            this.primarySubscription = primarySubscription;
            this.members = new ArrayList<>(members);
            this.customer = customer;
        }

        public FullSubscriptionGroupResponse getSubscriptionGroup() {
            return subscriptionGroup;
        }

        public Subscription getPrimarySubscription() {
            return primarySubscription;
        }

        public Subscription getMember(int i) {
            return members.get(i);
        }

        public List<Subscription> getMembers() {
            return members;
        }

        public List<Integer> getMemeberIds() {
            return getMembers().stream().map(Subscription::getId).toList();
        }

        void refresh() throws IOException, ApiException {
            subscriptionGroup = subscriptionGroupsController.readSubscriptionGroup(subscriptionGroup.getUid(), List.of());
            primarySubscription = subscriptionsController.readSubscription(primarySubscription.getId(), List.of()).getSubscription();
            for (int i = 0; i < members.size(); ++i) {
                Subscription refreshedMember = subscriptionsController.readSubscription(members.get(i).getId(), List.of()).getSubscription();
                members.set(i, refreshedMember);
            }
        }

        void cleanup() throws IOException, ApiException {
            if (!cleaned) {
                Subscription primary = subscriptionsController.readSubscription(primarySubscription.getId(), List.of()).getSubscription();
                if (primary.getState() != SubscriptionState.ACTIVE) {
                    subscriptionGroupStatusController.reactivateSubscriptionGroup(subscriptionGroup.getUid(), new ReactivateSubscriptionGroupRequest());
                }
                new TestTeardown().deleteSubscriptionGroup(primarySubscription.getId(), getMemeberIds(), customer.getId(), false);
                cleaned = true;
            }
        }
    }

}
