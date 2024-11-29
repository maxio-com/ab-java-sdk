package com.maxio.advancedbilling.controllers.offers;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.OffersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferRequest;
import com.maxio.advancedbilling.models.Offer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class OffersControllerArchiveTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final OffersController offersController = client.getOffersController();
    private Product product;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily);
    }

    @Test
    void shouldArchiveOffer() throws ApiException, IOException {
        // given
        String handle = "test-handle-archive-" + randomAlphabetic(10).toLowerCase();
        String name = "archive offer test " + randomAlphabetic(10).toLowerCase();

        Offer existingOffer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .handle(handle)
                        .build()))
                .getOffer();

        assertThat(existingOffer.getArchivedAt()).isNull();
        ZonedDateTime before = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        // when
        offersController.archiveOffer(existingOffer.getId());

        // then
        Offer offer = offersController.readOffer(existingOffer.getId()).getOffer();
        assertThat(offer.getArchivedAt())
                .isNotNull()
                .isAfterOrEqualTo(before);
    }

    @Test
    void shouldReturn404IfOfferDoesNotExist() {
        // when - then
        assertNotFound(() -> offersController.archiveOffer(1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        String handle = "test-handle-archive-" + randomAlphabetic(10).toLowerCase();
        String name = "archive offer test " + randomAlphabetic(10).toLowerCase();

        Offer existingOffer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .handle(handle)
                        .build()))
                .getOffer();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getOffersController()
                .readOffer(existingOffer.getId()));
    }

}
