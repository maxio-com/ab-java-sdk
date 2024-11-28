package com.maxio.advancedbilling.controllers.subscriptionnotes;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionNotesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionNote;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.RequestUtils.createNoteBody;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionNotesControllerReadTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final SubscriptionNotesController subscriptionNotesController = client.getSubscriptionNotesController();

    private Customer customer;
    private Subscription subscription;
    private SubscriptionNote subscriptionNote;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        Product product = testSetup.createProduct(productFamily);
        customer = testSetup.createCustomer();
        subscription = testSetup.createSubscription(customer, product);
        subscriptionNote = subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody("Test note", true))
                .getNote();
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadExistingNote() throws IOException, ApiException {
        // when
        SubscriptionNote response = subscriptionNotesController.readSubscriptionNote(
                subscription.getId(), subscriptionNote.getId()).getNote();

        // then
        assertThat(response)
                .usingRecursiveComparison()
                .isEqualTo(subscriptionNote);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController.readSubscriptionNote(1, 1));
    }

    @Test
    void shouldReturn404WhenNoteNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController.readSubscriptionNote(subscription.getId(), 1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionNotesController()
                .readSubscriptionNote(subscription.getId(), subscriptionNote.getId()));
    }
}
