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
import com.maxio.advancedbilling.models.ListOffersInput;
import com.maxio.advancedbilling.models.ListOffersResponse;
import com.maxio.advancedbilling.models.Offer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class OffersControllerListTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final OffersController offersController = client.getOffersController();
    private final List<Offer> activeOffers = new ArrayList<>();
    private Product product;
    private Component onOffComponent;
    private Component meteredComponent;
    private ComponentPricePoint componentPricePoint;
    private Coupon coupon;
    private ProductPricePoint productPricePoint;
    private Offer archivedOffer;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily);
        onOffComponent = testSetup.createOnOffComponent(productFamily.getId());
        meteredComponent = testSetup.createMeteredComponent(productFamily, 10.0);
        componentPricePoint = testSetup.createComponentPricePoint(meteredComponent.getId());
        coupon = testSetup.createAmountCoupon(productFamily, 10, true);
        productPricePoint = testSetup.createProductPricePoint(product, "custom price point");
        archivedOffer = createOffer(0);

        ListOffersInput listInput = new ListOffersInput(1, 200, false);
        ListOffersResponse offers = offersController.listOffers(listInput);
        for (Offer offer : offers.getOffers()) {
            offersController.archiveOffer(offer.getId());
        }

        assertThat(offersController.listOffers(listInput).getOffers()).isEmpty();
        archivedOffer = offersController.readOffer(archivedOffer.getId()).getOffer();

        for (int i = 1; i < 11; ++i) {
            activeOffers.add(createOffer(i));
        }
    }

    @Test
    void shouldListActiveOffers() throws ApiException, IOException {
        // when
        ListOffersResponse offers = offersController.listOffers(new ListOffersInput(1, 100, false));

        // then
        assertThat(offers.getOffers())
                .hasSize(activeOffers.size())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("offerItems")
                .containsExactlyInAnyOrderElementsOf(activeOffers);

        Map<Integer, Offer> idToOffer = activeOffers.stream()
                .collect(Collectors.toMap(Offer::getId, Function.identity()));

        for (Offer offer : offers.getOffers()) {
            assertThat(offer.getOfferItems())
                    .usingRecursiveFieldByFieldElementComparator()
                    .containsExactlyInAnyOrderElementsOf(idToOffer.get(offer.getId()).getOfferItems());
        }
    }

    @Test
    void shouldIncludeArchivedOffers() throws ApiException, IOException {
        // when
        ListOffersResponse offers = offersController.listOffers(new ListOffersInput(1, 200, true));

        // then
        assertThat(offers.getOffers())
                .hasSizeGreaterThan(activeOffers.size())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("offerItems")
                .containsAll(activeOffers)
                .contains(archivedOffer);
    }

    @Test
    void shouldUsePaging() throws ApiException, IOException {
        // when
        List<Offer> page1 = offersController.listOffers(new ListOffersInput(1, 5, false)).getOffers();
        List<Offer> page2 = offersController.listOffers(new ListOffersInput(2, 5, false)).getOffers();
        List<Offer> bigPage = offersController.listOffers(new ListOffersInput(1, 8, false)).getOffers();

        // then
        assertThat(page1)
                .hasSize(5);
        assertThat(page2)
                .hasSize(5);
        assertThat(bigPage)
                .hasSize(8);

        Set<Integer> ids = Stream.concat(page1.stream(), page2.stream())
                .map(Offer::getId)
                .collect(Collectors.toSet());

        // offers are sorted by created_at with second resolution - so sorting might not work correctly and some items might
        // not appear on the page, or could appear on two pages
        assertThat(ids).hasSizeBetween(6, 10);
    }

    @Test
    void shouldThrowExceptionOnInvalidPage() {
        // given
        ListOffersInput body = new ListOffersInput(-1, 5, false);

        // when then
        assertThatErrorListResponse(() -> offersController.listOffers(body))
                .isUnprocessableEntity()
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[invalid page: -1]}'.")
                .hasErrors("invalid page: -1");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getOffersController()
                .listOffers(new ListOffersInput(1, 10, false)));
    }

    private Offer createOffer(int index) throws IOException, ApiException {
        String handle = "test-handle-list-" + index + "_" + randomAlphabetic(10).toLowerCase();
        String name = "list offer test " + index + "_" + randomAlphabetic(10).toLowerCase();

        return offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
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
}
