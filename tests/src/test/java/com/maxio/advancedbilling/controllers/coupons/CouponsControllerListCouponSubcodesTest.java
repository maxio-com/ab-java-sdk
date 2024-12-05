package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponSubcodes;
import com.maxio.advancedbilling.models.ListCouponSubcodesInput;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerListCouponSubcodesTest extends CouponsControllerTestBase {

    private Coupon coupon;
    private List<String> subcodes;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(RandomStringUtils.randomAlphanumeric(5) + i);
        }

        subcodes = COUPONS_CONTROLLER
                .createCouponSubcodes(coupon.getId(), new CouponSubcodes(list)).getCreatedCodes();
    }

    @Test
    void shouldListCouponSubcodes() throws IOException, ApiException {
        List<String> codes = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .build()
                ).getCodes();
        assertThat(codes).containsExactlyInAnyOrderElementsOf(subcodes);
    }

    @Test
    void shouldListCouponSubcodesWithPaging() throws IOException, ApiException {
        // given
        List<String> page1 = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .page(1)
                        .perPage(4)
                        .build()
                ).getCodes();
        List<String> page2 = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .page(2)
                        .perPage(4)
                        .build()
                ).getCodes();
        List<String> page3 = COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput.Builder()
                        .couponId(coupon.getId())
                        .page(3)
                        .perPage(4)
                        .build()
                ).getCodes();

        // then
        assertThat(page1).hasSize(4);
        assertThat(page2).hasSize(4);
        assertThat(page3).hasSize(2);

        assertThat(
                Stream.concat(Stream.concat(page1.stream(), page2.stream()), page3.stream()).toList()
        ).containsExactlyInAnyOrderElementsOf(subcodes);
    }

    @Test
    void shouldNotListSubcodesForNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER
                .listCouponSubcodes(new ListCouponSubcodesInput(123, 1, 1)));
    }

    @Test
    void shouldNotListCouponSubcodesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().listCouponSubcodes(new ListCouponSubcodesInput(coupon.getId(), 1, 1)));
    }

}
