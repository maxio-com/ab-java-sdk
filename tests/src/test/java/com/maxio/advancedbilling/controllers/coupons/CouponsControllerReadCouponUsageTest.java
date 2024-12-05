package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.CouponUsage;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerReadCouponUsageTest extends CouponsControllerTestBase {

    private Product product;
    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        Customer customer = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(productFamily, p -> p.priceInCents(20000));
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, new CouponRequest(
                new CouponPayload.Builder()
                        .name("coupon" + randomNumeric(10))
                        .description("description" + randomNumeric(20))
                        .amountInCents(3000L)
                        .code("coupon%@+-_." + randomNumeric(10))
                        .build(), null, null)).getCoupon();
        TEST_SETUP.createSubscription(customer, product,
                sub -> sub.couponCode(coupon.getCode()));
    }

    @Test
    void shouldReadCouponUsages() throws ApiException, IOException {
        List<CouponUsage> couponUsages = COUPONS_CONTROLLER.readCouponUsage(productFamilyId, coupon.getId());

        assertThat(couponUsages).hasSize(1);
        assertThat(couponUsages.get(0).getId()).isEqualTo(product.getId());
        assertThat(couponUsages.get(0).getName()).isEqualTo(product.getName());
        assertThat(couponUsages.get(0).getSignups()).isEqualTo(1);
        assertThat(couponUsages.get(0).getSavings()).isEqualTo(30);
        assertThat(couponUsages.get(0).getSavingsInCents()).isEqualTo(3000);
        assertThat(couponUsages.get(0).getRevenue()).isEqualTo(170);
        assertThat(couponUsages.get(0).getRevenueInCents()).isEqualTo(17000);
    }

    @Test
    void shouldReadEmptyCouponUsages() throws ApiException, IOException {
        Coupon coupon2 = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();

        List<CouponUsage> couponUsages = COUPONS_CONTROLLER.readCouponUsage(productFamilyId, coupon2.getId());
        assertThat(couponUsages.get(0).getId()).isEqualTo(product.getId());
        assertThat(couponUsages.get(0).getName()).isEqualTo(product.getName());
        assertThat(couponUsages.get(0).getSignups()).isEqualTo(0);
        assertThat(couponUsages.get(0).getSavings()).isEqualTo(0);
        assertThat(couponUsages.get(0).getSavingsInCents()).isEqualTo(0);
        assertThat(couponUsages.get(0).getRevenue()).isEqualTo(0);
        assertThat(couponUsages.get(0).getRevenueInCents()).isEqualTo(0);
    }

    @Test
    void shouldNotNotReadUsagesOfNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.readCouponUsage(productFamilyId, 123));
    }

    @Test
    void shouldNotNotReadUsagesOfCouponInNonExistentProductFamily() {
        assertNotFound(() -> COUPONS_CONTROLLER.readCouponUsage(123, coupon.getId()));
    }

    @Test
    void shouldNotReadCouponUsagesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().readCouponUsage(coupon.getId(), coupon.getId())
        );
    }

}
