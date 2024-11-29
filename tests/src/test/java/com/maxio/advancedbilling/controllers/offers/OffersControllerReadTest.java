package com.maxio.advancedbilling.controllers.offers;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.OffersController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferComponent;
import com.maxio.advancedbilling.models.CreateOfferRequest;
import com.maxio.advancedbilling.models.Offer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class OffersControllerReadTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final OffersController offersController = client.getOffersController();
    private Offer existingOffer;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        Product product = testSetup.createProduct(productFamily);
        Component onOffComponent = testSetup.createOnOffComponent(productFamily.getId());
        Component meteredComponent = testSetup.createMeteredComponent(productFamily, 10.0);
        ComponentPricePoint componentPricePoint = testSetup.createComponentPricePoint(meteredComponent.getId());
        Coupon coupon = testSetup.createAmountCoupon(productFamily, 10, true);
        ProductPricePoint productPricePoint = testSetup.createProductPricePoint(product, "custom price point");

        String handle = "test-handle-read-" + randomAlphabetic(10).toLowerCase();
        String name = "read offer test " + randomAlphabetic(10).toLowerCase();

        existingOffer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .productPricePointId(productPricePoint.getId())
                        .handle(handle)
                        .components(List.of(
                                new CreateOfferComponent(onOffComponent.getId(), null, 1),
                                new CreateOfferComponent(meteredComponent.getId(), componentPricePoint.getId(), 0)
                        ))
                        .coupons(List.of(coupon.getCode()))
                        .build()))
                .getOffer();
    }

    @Test
    void shouldReadOffer() throws ApiException, IOException {
        // when
        Offer offer = offersController.readOffer(existingOffer.getId()).getOffer();

        // then
        assertThat(offer)
                .usingRecursiveComparison()
                .isEqualTo(existingOffer);
    }

    @Test
    void shouldReturn404IfOfferDoesNotExist() {
        // when - then
        assertNotFound(() -> offersController.readOffer(1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getOffersController()
                .readOffer(existingOffer.getId()));
    }

}
