package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;

import java.io.IOException;
import java.util.Collections;
import java.util.Random;

public class CustomFieldsTestsUtils {
    private static final Random random = new Random();

    public static final MetafieldScope EMPTY_SCOPE = new MetafieldScope.Builder()
            .csv(IncludeOption.EXCLUDE)
            .invoices(IncludeOption.EXCLUDE)
            .statements(IncludeOption.EXCLUDE)
            .portal(IncludeOption.EXCLUDE)
            .publicShow(IncludeOption.EXCLUDE)
            .publicEdit(IncludeOption.EXCLUDE)
            .hosted(Collections.emptyList())
            .build();

    public static MetafieldScope randomScope() {
        return new MetafieldScope.Builder()
                .csv(randomIncludeOption())
                .invoices(randomIncludeOption())
                .statements(randomIncludeOption())
                .portal(randomIncludeOption())
                .publicShow(randomIncludeOption())
                .publicEdit(randomIncludeOption())
                .hosted(Collections.emptyList())
                .build();
    }

    private static IncludeOption randomIncludeOption() {
        return IncludeOption.values()[random.nextInt(IncludeOption.values().length)];
    }

    public static final class Resources {
        private final Customer customer;
        private final Subscription subscription;

        public Resources() throws IOException, ApiException {
            TestSetup TEST_SETUP = new TestSetup();
            ProductFamily productFamily = TEST_SETUP.createProductFamily();
            Product product = TEST_SETUP.createProduct(productFamily);
            customer = TEST_SETUP.createCustomer();
            subscription = TEST_SETUP.createSubscription(customer, product);
        }

        public int getIdForResourceType(ResourceType resourceType) {
            return switch (resourceType) {
                case SUBSCRIPTIONS -> subscription.getId();
                case CUSTOMERS -> customer.getId();
            };
        }

        public Customer getCustomer() {
            return customer;
        }

        public Subscription getSubscription() {
            return subscription;
        }
    }
}
