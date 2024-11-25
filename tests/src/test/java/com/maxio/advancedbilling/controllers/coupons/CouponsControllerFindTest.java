package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.DiscountType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerFindTest extends CouponsControllerTestBase {

    protected Product product;
    protected Component component;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldFindCoupon() throws IOException, ApiException {
        // given
        CouponPayload flatAmountCoupon = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(1234L)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(LocalDate.now().plusDays(35))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon coupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        flatAmountCoupon, restrictedProducts, restrictedComponents
                )).getCoupon();
        Coupon couponFound = COUPONS_CONTROLLER.findCoupon(productFamilyId, coupon.getCode(), null).getCoupon();
        Coupon couponFoundWithCurrencyPrices = COUPONS_CONTROLLER.findCoupon(productFamilyId, coupon.getCode(), true).getCoupon();

        // then
        assertResponseCoupon(flatAmountCoupon, coupon, DiscountType.AMOUNT);
        assertRestrictions(coupon, product, component);
        assertThat(couponFound).usingRecursiveComparison().isEqualTo(coupon);
        assertThat(couponFound.getCurrencyPrices()).isNull();

        assertThat(couponFoundWithCurrencyPrices).usingRecursiveComparison()
                .ignoringFields("currencyPrices").isEqualTo(coupon);
        assertCurrencyPrices(couponFoundWithCurrencyPrices.getCurrencyPrices(), coupon.getId());
    }

    @Test
    void shouldNotFindCouponUsingWrongProductFamilyId() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();
        ProductFamily productFamily2 = TEST_SETUP.createProductFamily();

        assertNotFound(() -> COUPONS_CONTROLLER.findCoupon(productFamily2.getId(), coupon.getCode(), null));
    }

    @Test
    void shouldNotFindNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.findCoupon(productFamilyId, "non-existent-code", null));
    }

    @Test
    void shouldNotReadCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().findCoupon(productFamilyId, coupon.getCode(), null)
        );
    }

}
