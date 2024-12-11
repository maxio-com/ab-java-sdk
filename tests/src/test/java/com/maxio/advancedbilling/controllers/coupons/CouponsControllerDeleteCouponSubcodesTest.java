package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponSubcodes;
import com.maxio.advancedbilling.models.CouponSubcodesResponse;
import com.maxio.advancedbilling.models.ListCouponSubcodesInput;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerDeleteCouponSubcodesTest extends CouponsControllerTestBase {

    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
    }

    @Test
    void shouldDeleteCouponSubcodes() throws IOException, ApiException {
        // create subcodes then delete one
        CouponSubcodesResponse response = COUPONS_CONTROLLER
                .createCouponSubcodes(coupon.getId(), new CouponSubcodes(
                        // Unfortunately deleting coupon with . (dot) won't work with sdk
                        List.of("ABC", "ALLOWED%@+-_")
                ));
        COUPONS_CONTROLLER.deleteCouponSubcode(coupon.getId(), "abc");
        List<String> codes = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .build()
                ).getCodes();
        assertThat(codes).hasSize(1);
        assertThat(codes.get(0)).isEqualTo("ALLOWED%@+-_");

        // delete second one
        COUPONS_CONTROLLER.deleteCouponSubcode(coupon.getId(), "ALLOWED%@+-_");
        codes = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .build()
                ).getCodes();
        assertThat(codes).isEmpty();
    }

    @Test
    void shouldNotDeleteNonExistentSubcode() {
        assertNotFound(() -> COUPONS_CONTROLLER.deleteCouponSubcode(coupon.getId(), "xxx"));
    }

    @Test
    void shouldNotDeleteSubcodesForNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.deleteCouponSubcode(123, "abc"));
    }

    @Test
    void shouldNotDeleteSubcodeWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().deleteCouponSubcode(coupon.getId(), "abc")
        );
    }

}
