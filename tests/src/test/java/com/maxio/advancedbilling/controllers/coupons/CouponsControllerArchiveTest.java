package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.ProductFamily;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerArchiveTest extends CouponsControllerTestBase {

    @Test
    void shouldArchiveCoupon() throws IOException, ApiException {
        // given
        Coupon coupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, validCouponRequest()).getCoupon();

        // when
        Coupon archiveCouponResponse = COUPONS_CONTROLLER.archiveCoupon(productFamilyId, coupon.getId()).getCoupon();
        Coupon couponRead = COUPONS_CONTROLLER.readCoupon(productFamilyId, coupon.getId(), null).getCoupon();

        // then
        assertThat(archiveCouponResponse.getArchivedAt()).isNotNull();

        assertThat(couponRead).usingRecursiveComparison().isEqualTo(archiveCouponResponse);
        assertThat(archiveCouponResponse).usingRecursiveComparison()
                .ignoringFields("updatedAt", "archivedAt")
                .isEqualTo(coupon);
    }

    @Test
    void shouldNotArchiveCouponUsingWrongProductFamilyId() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();
        ProductFamily productFamily2 = TEST_SETUP.createProductFamily();

        assertNotFound(() -> COUPONS_CONTROLLER.archiveCoupon(productFamily2.getId(), coupon.getId()));
    }

    @Test
    void shouldNotArchiveNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.archiveCoupon(productFamilyId, 123));
    }

    @Test
    void shouldNotArchiveCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().archiveCoupon(productFamilyId, coupon.getId())
        );
    }

}
