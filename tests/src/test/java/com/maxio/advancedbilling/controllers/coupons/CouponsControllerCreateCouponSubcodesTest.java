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

public class CouponsControllerCreateCouponSubcodesTest extends CouponsControllerTestBase {

    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
    }

    @Test
    void shouldCreateCouponSubcodes() throws IOException, ApiException {
        // when
        CouponSubcodesResponse response = COUPONS_CONTROLLER
                .createCouponSubcodes(coupon.getId(), new CouponSubcodes(
                        List.of("ABC", "CcC123", "pppppP", "DD", "25%OFF", "ALLOWED%@+-_.",
                                "abc", "DD",
                                "NOTALLOWED$#?!", " ", "abc c", "")
                ));

        // then
        assertThat(response.getCreatedCodes())
                .containsExactlyInAnyOrder("ABC", "CCC123", "PPPPPP", "DD", "25%OFF", "ALLOWED%@+-_.");
        assertThat(response.getDuplicateCodes()).isEmpty();
        assertThat(response.getInvalidCodes())
                .containsExactlyInAnyOrder("NOTALLOWED$#?!", "ABC C");

        // when saving some duplicates
        response = COUPONS_CONTROLLER
                .createCouponSubcodes(coupon.getId(), new CouponSubcodes(
                        List.of("NEWONE", "abc", "DD")));

        assertThat(response.getCreatedCodes()).containsExactlyInAnyOrder("NEWONE");
        assertThat(response.getDuplicateCodes()).containsExactlyInAnyOrder("ABC", "DD");
        assertThat(response.getInvalidCodes()).isEmpty();
    }

    @Test
    void shouldNotCreateSubcodesForNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.createCouponSubcodes(123,
                new CouponSubcodes(List.of("abc"))));
    }

    @Test
    void shouldNotCreateCouponSubcodesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().createCouponSubcodes(coupon.getId(), new CouponSubcodes(List.of("abc")))
        );
    }

}
