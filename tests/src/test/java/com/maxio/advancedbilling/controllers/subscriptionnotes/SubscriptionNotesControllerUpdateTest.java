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
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.RequestUtils.createNoteBody;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionNotesControllerUpdateTest {
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
    void shouldUpdateExistingNote() throws IOException, ApiException {
        // when
        SubscriptionNote updated = subscriptionNotesController.updateSubscriptionNote(subscription.getId(),
                        subscriptionNote.getId(),
                        createNoteBody("New note", false))
                .getNote();

        // then
        assertThat(updated.getId()).isEqualTo(subscriptionNote.getId());
        assertThat(updated.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(updated.getCreatedAt()).isEqualTo(subscriptionNote.getCreatedAt());
        assertThat(updated.getSticky()).isFalse();
        assertThat(updated.getBody()).isEqualTo("New note");
        assertThat(updated.getUpdatedAt()).isAfterOrEqualTo(subscriptionNote.getCreatedAt());
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController
                .updateSubscriptionNote(1, 1, createNoteBody("Test note", true))
        );
    }

    @Test
    void shouldReturn404WhenNoteNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController
                .updateSubscriptionNote(subscription.getId(), 1, createNoteBody("Test note", true))
        );
    }

    @Test
    void shouldThrowExceptionIfNoteIsEmpty() {
        // when then
        assertThatErrorListResponse(() -> subscriptionNotesController
                .updateSubscriptionNote(subscription.getId(), subscriptionNote.getId(), createNoteBody("", true)))
                .hasErrors("Body: cannot be blank.")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Body: cannot be blank.]}'")
                .hasErrorCode(422);
    }

    @Disabled("validation not implemented yet")
    @Test
    void shouldThrowExceptionIfNoteIsTooBig() {
        // given
        String newNote = RandomStringUtils.randomAlphabetic(65536);

        // when then
        assertThatErrorListResponse(() -> subscriptionNotesController
                .updateSubscriptionNote(subscription.getId(), subscriptionNote.getId(), createNoteBody(newNote, true)))
                .hasErrors("Body: to do.")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Body: to do.]}'")
                .hasErrorCode(422);
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionNotesController()
                .updateSubscriptionNote(subscription.getId(), subscriptionNote.getId(), createNoteBody("Test note", true)));
    }
}
