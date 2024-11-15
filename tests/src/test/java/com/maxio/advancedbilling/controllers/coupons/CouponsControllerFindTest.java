package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateFlatAmountCoupon;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerFindTest extends CouponsControllerTestBase {

    protected static Product product;
    protected static Component component;

    @BeforeAll
    static void setupResources() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldFindCoupon() throws IOException, ApiException {
        // given
        CreateOrUpdateFlatAmountCoupon flatAmountCoupon = new CreateOrUpdateFlatAmountCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(1234)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(ZonedDateTime.now().plusDays(35).plusHours(13))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        CreateOrUpdateCouponCoupon createCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdateFlatAmountCoupon(flatAmountCoupon);
        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon coupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, restrictedProducts, restrictedComponents
                )).getCoupon();
        Coupon couponRead = COUPONS_CONTROLLER.findCoupon(productFamilyId, coupon.getCode()).getCoupon();

        // then
        assertResponseCoupon(flatAmountCoupon, coupon);
        assertRestrictions(coupon, product, component);
        assertThat(couponRead).usingRecursiveComparison().isEqualTo(coupon);
    }

    @Test
    void shouldNotFindCouponUsingWrongProductFamilyId() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest())
                .getCoupon();
        ProductFamily productFamily2 = TEST_SETUP.createProductFamily();

        assertNotFound(() -> COUPONS_CONTROLLER.findCoupon(productFamily2.getId(), coupon.getCode()));
    }

    @Test
    void shouldNotFindNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.findCoupon(productFamilyId, "non-existent-code"));
    }

    @Test
    void shouldNotReadCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().findCoupon(productFamilyId, coupon.getCode())
        );
    }

}
