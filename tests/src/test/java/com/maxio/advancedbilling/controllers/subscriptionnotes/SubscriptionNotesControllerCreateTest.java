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
import com.maxio.advancedbilling.models.UpdateSubscriptionNote;
import com.maxio.advancedbilling.models.UpdateSubscriptionNoteRequest;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.utils.RequestUtils.createNoteBody;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionNotesControllerCreateTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final SubscriptionNotesController subscriptionNotesController = client.getSubscriptionNotesController();

    private Customer customer;
    private Subscription subscription;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        Product product = testSetup.createProduct(productFamily);
        customer = testSetup.createCustomer();
        subscription = testSetup.createSubscription(customer, product);
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldCreateValidNote() throws IOException, ApiException {
        // given
        ZonedDateTime before = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        // when
        SubscriptionNote response = subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody("Test note", true))
                .getNote();

        // then
        assertThat(response.getId()).isNotNull();
        assertThat(response.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(response.getCreatedAt()).isNotNull()
                .isBefore(ZonedDateTime.now())
                .isAfterOrEqualTo(before);
        assertThat(response.getSticky()).isTrue();
        assertThat(response.getBody()).isEqualTo("Test note");
        assertThat(response.getUpdatedAt()).isEqualTo(response.getCreatedAt());
    }

    @Test
    void shouldCreateAnotherNoteIfNoteAlreadyExists() throws IOException, ApiException {
        // given
        SubscriptionNote response1 = subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody("Test note", true))
                .getNote();

        // when
        SubscriptionNote response2 = subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody("Test note 2", false))
                .getNote();

        // then
        assertThat(response2.getId()).isNotNull();
        assertThat(response2.getId()).isNotEqualTo(response1.getId());
        assertThat(response2.getBody()).isEqualTo("Test note 2");
        assertThat(response2.getSticky()).isFalse();
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        assertNotFound(() -> subscriptionNotesController
                .createSubscriptionNote(1, createNoteBody("Test note", true))
        );
    }

    @Test
    void shouldThrowExceptionIfNoteIsEmpty() {
        // when then
        assertThatErrorListResponse(() -> subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody("", true)))
                .hasErrors("Body: cannot be blank.")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Body: cannot be blank.]}'.")
                .hasErrorCode(422);
    }

    @Disabled("validation not implemented yet")
    @Test
    void shouldThrowExceptionIfNoteIsTooBig() {
        // given
        String note = RandomStringUtils.randomAlphabetic(65536);

        // when then
        assertThatErrorListResponse(() -> subscriptionNotesController
                .createSubscriptionNote(subscription.getId(), createNoteBody(note, true)))
                .hasErrors("Body: to do.")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Body: to do.]}'")
                .hasErrorCode(422);
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionNotesController()
                .createSubscriptionNote(subscription.getId(), createNoteBody("", true)));
    }


}
