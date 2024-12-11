package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponSubcodes;
import com.maxio.advancedbilling.models.CouponSubcodesResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerUpdateCouponSubcodesTest extends CouponsControllerTestBase {

    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
    }

    @Test
    void shouldUpdateSubcodes() throws IOException, ApiException {
        // when
        COUPONS_CONTROLLER
                .createCouponSubcodes(coupon.getId(), new CouponSubcodes(
                        List.of("ABC", "CcC123", "pppppP", "DD")));


        // then
        CouponSubcodesResponse response = COUPONS_CONTROLLER
                .updateCouponSubcodes(coupon.getId(), new CouponSubcodes(
                        List.of("NEWONE", "newONE2", "abc", "DD",
                                "%$#$#", " ", "abc c", "")));

        assertThat(response.getCreatedCodes()).containsExactlyInAnyOrder("NEWONE", "NEWONE2", "ABC", "DD");
        assertThat(response.getDuplicateCodes()).isEmpty();
        assertThat(response.getInvalidCodes()).containsExactlyInAnyOrder("%$#$#", "ABC C");
    }

    @Test
    void shouldNotUpdateSubcodesForNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.updateCouponSubcodes(123,
                new CouponSubcodes(List.of("abc"))));
    }

    @Test
    void shouldNotUpdateCouponSubcodesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().updateCouponSubcodes(coupon.getId(), new CouponSubcodes(List.of("abc")))
        );
    }

}
