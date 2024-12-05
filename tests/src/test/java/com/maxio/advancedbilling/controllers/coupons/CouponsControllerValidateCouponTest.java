package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatSingleStringErrorResponse;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerValidateCouponTest extends CouponsControllerTestBase {

    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
    }

    @Test
    void shouldValidateValidCoupon() throws ApiException, IOException {
        CouponResponse couponResponse = COUPONS_CONTROLLER.validateCoupon(coupon.getCode(), productFamilyId);

        assertThat(couponResponse.getCoupon()).usingRecursiveComparison().isEqualTo(coupon);
    }

    @Test
    void shouldReturn404WhenCouponDoesNotExist() {
        assertThatSingleStringErrorResponse(() -> COUPONS_CONTROLLER.validateCoupon("123", productFamilyId))
                .hasErrorCode(404)
                .hasErrorMessage("Coupon code could not be found.")
                .hasMessage("Not Found");
    }

    @Test
    void shouldReturn404WhenCouponIsArchived() throws IOException, ApiException {
        Coupon coupon2 = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
        COUPONS_CONTROLLER.archiveCoupon(productFamilyId, coupon2.getId());

        assertThatSingleStringErrorResponse(() -> COUPONS_CONTROLLER.validateCoupon(coupon2.getCode(), productFamilyId))
                .hasErrorCode(404)
                .hasErrorMessage("That coupon is no longer active.")
                .hasMessage("Not Found");
    }

    @Test
    void shouldValidateCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        CouponResponse couponResponse = TestClientProvider.createInvalidCredentialsClient().getCouponsController()
                .validateCoupon(coupon.getCode(), productFamilyId);

        assertThat(couponResponse.getCoupon()).usingRecursiveComparison().isEqualTo(coupon);
    }

}
