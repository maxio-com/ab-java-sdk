package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.DiscountType;
import com.maxio.advancedbilling.models.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerReadTest extends CouponsControllerTestBase {

    protected static Product product;
    protected static Component component;

    @BeforeAll
    static void setupResources() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldReadCoupon() throws IOException, ApiException {
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
        Coupon couponRead = COUPONS_CONTROLLER.readCoupon(productFamilyId, coupon.getId(), null).getCoupon();
        Coupon couponReadWithCurrencyPrices = COUPONS_CONTROLLER.readCoupon(productFamilyId, coupon.getId(), true).getCoupon();

        // then
        assertResponseCoupon(flatAmountCoupon, coupon, DiscountType.AMOUNT);
        assertRestrictions(coupon, product, component);
        assertThat(couponRead).usingRecursiveComparison().isEqualTo(coupon);
        assertThat(couponRead.getCurrencyPrices()).isNull();

        assertThat(couponReadWithCurrencyPrices).usingRecursiveComparison()
                .ignoringFields("currencyPrices").isEqualTo(coupon);
        assertCurrencyPrices(couponReadWithCurrencyPrices.getCurrencyPrices(), coupon.getId());
    }

    @Test
    void shouldNotReadNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.readCoupon(productFamilyId, 123, null));
    }

    @Test
    void shouldNotReadCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().readCoupon(productFamilyId, coupon.getId(), null)
        );
    }

}
