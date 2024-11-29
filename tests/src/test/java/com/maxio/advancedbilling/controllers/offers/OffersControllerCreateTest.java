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
import com.maxio.advancedbilling.models.CurrencyPrice;
import com.maxio.advancedbilling.models.Offer;
import com.maxio.advancedbilling.models.OfferDiscount;
import com.maxio.advancedbilling.models.OfferItem;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.utils.TestSetup;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorArrayMapResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class OffersControllerCreateTest {
    private final TestSetup testSetup = new TestSetup();
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final OffersController offersController = client.getOffersController();
    private ProductFamily productFamily;
    private Product product;
    private ProductPricePoint productPricePoint;
    private Component onOffComponent;
    private Component meteredComponent;
    private ComponentPricePoint componentPricePoint;
    private Coupon coupon;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily);
        onOffComponent = testSetup.createOnOffComponent(productFamily.getId());
        meteredComponent = testSetup.createMeteredComponent(productFamily, 10.0);
        componentPricePoint = testSetup.createComponentPricePoint(meteredComponent.getId());
        coupon = testSetup.createAmountCoupon(productFamily, 10, true);
        productPricePoint = testSetup.createProductPricePoint(product, "custom price point");
    }

    @Test
    void shouldCreateOfferWithDefaults() throws ApiException, IOException {
        // given
        ZonedDateTime before = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        String handle = "test-handle-" + randomAlphabetic(10).toLowerCase();
        String name = "test offer default " + randomAlphabetic(10).toLowerCase();

        // when
        Offer offer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .handle(handle)
                        .components(List.of(
                                new CreateOfferComponent(onOffComponent.getId(), null, 1),
                                new CreateOfferComponent(meteredComponent.getId(), null, 0)
                        ))
                        .coupons(List.of(coupon.getCode()))
                        .build()))
                .getOffer();

        // then
        assertThat(offer.getId()).isNotNull();
        assertThat(offer.getSiteId()).isNotNull();
        assertThat(offer.getProductFamilyId()).isEqualTo(productFamily.getId());
        assertThat(offer.getProductId()).isEqualTo(product.getId());
        assertThat(offer.getProductPricePointId()).isEqualTo(product.getDefaultProductPricePointId());
        assertThat(offer.getProductRevisableNumber()).isNotNull();
        assertThat(offer.getName()).isEqualTo(name);
        assertThat(offer.getHandle()).isEqualTo(handle);
        assertThat(offer.getDescription()).isNull();
        assertThat(offer.getCreatedAt()).isNotNull()
                .isAfterOrEqualTo(before)
                .isEqualTo(offer.getUpdatedAt());
        assertThat(offer.getArchivedAt()).isNull();

        assertThat(offer.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(offer.getProductName()).isEqualTo(product.getName());
        assertThat(offer.getProductPricePointName()).isEqualTo(product.getProductPricePointName());
        assertThat(offer.getProductPriceInCents()).isEqualTo(product.getPriceInCents());
        assertThat(offer.getOfferSignupPages()).isEmpty();

        List<OfferDiscount> discounts = offer.getOfferDiscounts();
        assertThat(discounts).hasSize(1);
        OfferDiscount discount = discounts.get(0);
        assertThat(discount.getCouponCode()).isEqualTo(coupon.getCode());
        assertThat(discount.getCouponId()).isEqualTo(coupon.getId());
        assertThat(discount.getCouponName()).isEqualTo(coupon.getName());

        List<OfferItem> items = offer.getOfferItems();
        assertThat(items).hasSize(2);
        OfferItem onOffItem = items.get(0);
        assertThat(onOffItem.getComponentId()).isEqualTo(onOffComponent.getId());
        assertThat(onOffItem.getPricePointId()).isEqualTo(onOffComponent.getDefaultPricePointId());
        assertThat(onOffItem.getStartingQuantity()).isEqualTo("1.0");
        assertThat(onOffItem.getEditable()).isFalse();
        assertThat(onOffItem.getComponentUnitPrice()).isEqualTo(onOffComponent.getUnitPrice());
        assertThat(onOffItem.getComponentName()).isEqualTo(onOffComponent.getName());
        assertThat(onOffItem.getPricePointName()).isEqualTo(onOffComponent.getDefaultPricePointName());
        assertThat(onOffItem.getInterval()).isNull();
        assertThat(onOffItem.getIntervalUnit()).isNull();

        assertThat(onOffItem.getCurrencyPrices()).hasSize(1);
        CurrencyPrice onOffPrice = onOffItem.getCurrencyPrices().get(0);
        assertThat(onOffPrice.getId()).isNull();
        assertThat(onOffPrice.getCurrency()).isEqualTo("EUR");
        assertThat(onOffPrice.getPrice()).isCloseTo(1.0, Offset.offset(0.5));
        assertThat(onOffPrice.getFormattedPrice())
                .isNotBlank()
                .startsWith("€");
        assertThat(onOffPrice.getProductPricePointId()).isNull();
        assertThat(onOffPrice.getRole()).isNull();
        assertThat(onOffPrice.getPriceId()).isNotNull();
        assertThat(onOffPrice.getPricePointId()).isEqualTo(onOffComponent.getDefaultPricePointId());

        OfferItem meteredItem = items.get(1);
        assertThat(meteredItem.getComponentId()).isEqualTo(meteredComponent.getId());
        assertThat(meteredItem.getPricePointId()).isEqualTo(meteredComponent.getDefaultPricePointId());
        assertThat(meteredItem.getStartingQuantity()).isEqualTo("0.0");
        assertThat(meteredItem.getEditable()).isFalse();
        assertThat(meteredItem.getComponentUnitPrice()).isEqualTo(meteredComponent.getUnitPrice());
        assertThat(meteredItem.getComponentName()).isEqualTo(meteredComponent.getName());
        assertThat(meteredItem.getPricePointName()).isEqualTo(meteredComponent.getDefaultPricePointName());
        assertThat(meteredItem.getInterval()).isNull();
        assertThat(meteredItem.getIntervalUnit()).isNull();

        assertThat(meteredItem.getCurrencyPrices()).hasSize(1);
        CurrencyPrice meteredPrice = meteredItem.getCurrencyPrices().get(0);
        assertThat(meteredPrice.getId()).isNull();
        assertThat(meteredPrice.getCurrency()).isEqualTo("EUR");
        assertThat(meteredPrice.getPrice()).isCloseTo(10, Percentage.withPercentage(10));
        assertThat(meteredPrice.getFormattedPrice())
                .isNotBlank()
                .startsWith("€");
        assertThat(meteredPrice.getProductPricePointId()).isNull();
        assertThat(meteredPrice.getRole()).isNull();
        assertThat(meteredPrice.getPriceId()).isNotNull();
        assertThat(meteredPrice.getPricePointId()).isEqualTo(meteredComponent.getDefaultPricePointId());
    }

    @Test
    void shouldCreateOfferWithoutItems() throws ApiException, IOException {
        // given
        String handle = "test-handle-no-items-" + randomAlphabetic(10).toLowerCase();
        String name = "test offer no items " + randomAlphabetic(10).toLowerCase();

        // when
        Offer offer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .handle(handle)
                        .build()))
                .getOffer();

        // then
        assertThat(offer.getId()).isNotNull();
        assertThat(offer.getSiteId()).isNotNull();
        assertThat(offer.getName()).isEqualTo(name);
        assertThat(offer.getHandle()).isEqualTo(handle);
        assertThat(offer.getOfferDiscounts()).isEmpty();
        assertThat(offer.getOfferItems()).isEmpty();
    }

    @Test
    void shouldCreateOfferWithCustomPricePoints() throws ApiException, IOException {
        // given
        String handle = "test-handle-custom-pricepoints-" + randomAlphabetic(10).toLowerCase();
        String name = "test offer custom pricepoints " + randomAlphabetic(10).toLowerCase();

        // when
        Offer offer = offersController.createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name(name)
                        .productId(product.getId())
                        .productPricePointId(productPricePoint.getId())
                        .handle(handle)
                        .description("custom price points")
                        .components(List.of(
                                new CreateOfferComponent(meteredComponent.getId(), componentPricePoint.getId(), 1)
                        ))
                        .build()))
                .getOffer();

        // then
        assertThat(offer.getId()).isNotNull();
        assertThat(offer.getSiteId()).isNotNull();
        assertThat(offer.getProductFamilyId()).isEqualTo(productFamily.getId());
        assertThat(offer.getProductId()).isEqualTo(product.getId());
        assertThat(offer.getProductPricePointId()).isEqualTo(productPricePoint.getId());
        assertThat(offer.getProductRevisableNumber()).isNotNull();
        assertThat(offer.getName()).isEqualTo(name);
        assertThat(offer.getHandle()).isEqualTo(handle);
        assertThat(offer.getDescription()).isEqualTo("custom price points");

        assertThat(offer.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(offer.getProductName()).isEqualTo(product.getName());
        assertThat(offer.getProductPricePointName()).isEqualTo(productPricePoint.getName());
        assertThat(offer.getProductPriceInCents()).isEqualTo(productPricePoint.getPriceInCents());
        assertThat(offer.getOfferSignupPages()).isEmpty();

        assertThat(offer.getOfferDiscounts()).isEmpty();

        assertThat(offer.getOfferItems()).hasSize(1);

        OfferItem meteredItem = offer.getOfferItems().get(0);
        assertThat(meteredItem.getComponentId()).isEqualTo(meteredComponent.getId());
        assertThat(meteredItem.getPricePointId()).isEqualTo(componentPricePoint.getId());
        assertThat(meteredItem.getStartingQuantity()).isEqualTo("1.0");
        assertThat(meteredItem.getEditable()).isFalse();
        assertThat(meteredItem.getComponentUnitPrice()).isEqualTo(meteredComponent.getUnitPrice());
        assertThat(meteredItem.getComponentName()).isEqualTo(meteredComponent.getName());
        assertThat(meteredItem.getPricePointName()).isEqualTo(componentPricePoint.getName());
        assertThat(meteredItem.getInterval()).isNull();
        assertThat(meteredItem.getIntervalUnit()).isNull();
    }

    @Test
    void shouldThrowExceptionIfHandleIsDuplicated() throws ApiException, IOException {
        // given
        String handle = "test-handle-duplicated-name-" + randomAlphabetic(10).toLowerCase();
        String name = "duplicated handle";
        CreateOfferRequest body = new CreateOfferRequest(new CreateOffer.Builder()
                .name(name)
                .productId(product.getId())
                .productPricePointId(productPricePoint.getId())
                .handle(handle)
                .build());
        offersController.createOffer(body);

        // when then
        assertThatErrorArrayMapResponse(() -> offersController.createOffer(body))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:{handle:[Handle is not unique for the given site.]}}'.")
                .hasErrorMap(Map.of("handle", List.of("Handle is not unique for the given site.")));
    }

    @Test
    void shouldThrowExceptionIfNameOrHandleIsMissing() {
        // given
        CreateOfferRequest body = new CreateOfferRequest(new CreateOffer.Builder()
                .productId(product.getId())
                .productPricePointId(productPricePoint.getId())
                .build());

        // when then
        assertThatErrorArrayMapResponse(() -> offersController.createOffer(body))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. " +
                        "Response: '{errors:{name:[Name cannot be blank.],handle:[Handle cannot be blank.]}}'.")
                .hasErrorMap(Map.of(
                        "handle", List.of("Handle cannot be blank."),
                        "name", List.of("Name cannot be blank.")
                ));
    }

    @Test
    void shouldThrowExceptionIfProductDoesNotExist() {
        // given
        String handle = "test-handle-product-not-exist-" + randomAlphabetic(10).toLowerCase();
        String name = "Product does not exist";
        CreateOfferRequest body = new CreateOfferRequest(new CreateOffer.Builder()
                .name(name)
                .handle(handle)
                .productId(1)
                .build());

        // when then
        assertThatErrorArrayMapResponse(() -> offersController.createOffer(body))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:{product_id:[Product could not be found: 1]}}'.")
                .hasErrorMap(Map.of("product_id", List.of("Product could not be found: 1")));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getOffersController()
                .createOffer(new CreateOfferRequest(new CreateOffer.Builder()
                        .name("test offer")
                        .productId(product.getId())
                        .handle("test")
                        .build()))
        );
    }

}
