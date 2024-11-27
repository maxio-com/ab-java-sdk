package com.maxio.advancedbilling.controllers.subscriptionnotes;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionNotesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListSubscriptionNotesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionNoteResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.RequestUtils.createNoteBody;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionNotesControllerListTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final SubscriptionNotesController subscriptionNotesController = client.getSubscriptionNotesController();
    private final List<SubscriptionNoteResponse> notes = new ArrayList<>();
    private Product product;
    private Customer customer;
    private Subscription subscription;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily);
        customer = testSetup.createCustomer();
        subscription = testSetup.createSubscription(customer, product);
        for (int i = 0; i < 10; ++i) {
            notes.add(subscriptionNotesController
                    .createSubscriptionNote(subscription.getId(), createNoteBody("Test note " + i, i % 2 == 0)));
        }
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldListAllNotes() throws IOException, ApiException {
        // when
        List<SubscriptionNoteResponse> response = subscriptionNotesController.listSubscriptionNotes(new ListSubscriptionNotesInput.Builder()
                .subscriptionId(subscription.getId()).build()
        );

        // then
        assertThat(response)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(notes);
    }

    @Test
    void shouldListNotesWithPaging() throws IOException, ApiException {
        // when
        List<SubscriptionNoteResponse> page1 = subscriptionNotesController
                .listSubscriptionNotes(new ListSubscriptionNotesInput(subscription.getId(), 1, 2));
        List<SubscriptionNoteResponse> page2 = subscriptionNotesController
                .listSubscriptionNotes(new ListSubscriptionNotesInput(subscription.getId(), 2, 2));
        List<SubscriptionNoteResponse> bigPage = subscriptionNotesController
                .listSubscriptionNotes(new ListSubscriptionNotesInput(subscription.getId(), 1, 8));

        // then
        // order is not deterministic, so cannot assert specific notes
        assertThat(page1)
                .hasSize(2);
        assertThat(page2)
                .hasSize(2);
        assertThat(bigPage)
                .hasSize(8);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController.listSubscriptionNotes(new ListSubscriptionNotesInput(1, 1, 10)));
    }

    @Test
    void shouldReturnEmptyListIfNotesAreMissing() throws IOException, ApiException {
        // given
        Subscription subscription2 = testSetup.createSubscription(customer, product);

        // when
        List<SubscriptionNoteResponse> response = subscriptionNotesController.listSubscriptionNotes(
                new ListSubscriptionNotesInput(subscription2.getId(), 1, 10));

        // then
        assertThat(response)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldThrowExceptionIfPageIsMalformed() {
        // when then
        assertThatErrorListResponse(() -> subscriptionNotesController.listSubscriptionNotes(
                new ListSubscriptionNotesInput(subscription.getId(), -1, 100)))
                .hasErrorCode(422)
                .hasErrors("invalid page: -1")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[invalid page: -1]}'.");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionNotesController()
                .listSubscriptionNotes(new ListSubscriptionNotesInput(subscription.getId(), 1, 10)));
    }
}
