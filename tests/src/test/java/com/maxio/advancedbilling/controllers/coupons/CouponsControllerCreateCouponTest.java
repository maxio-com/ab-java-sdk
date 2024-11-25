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
import com.maxio.advancedbilling.models.containers.CouponPayloadPercentage;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class CouponsControllerCreateCouponTest extends CouponsControllerTestBase {

    protected Product product1;
    protected Product product2;
    protected Component component1;
    protected Component component2;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        product1 = TEST_SETUP.createProduct(productFamily);
        product2 = TEST_SETUP.createProduct(productFamily);
        component1 = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
        component2 = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldCreateFlatAmountCoupon() throws IOException, ApiException {
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
                String.valueOf(product1.getId()), true,
                String.valueOf(product2.getId()), false,
                "1234", true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component1.getId()), true,
                String.valueOf(component2.getId()), false,
                "1234", true
        );

        // when
        Coupon coupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        flatAmountCoupon, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(flatAmountCoupon, coupon, DiscountType.AMOUNT);
        assertRestrictions(coupon, product1, component1);
    }

    @Test
    void shouldCreatePercentageCoupon() throws IOException, ApiException {
        // given
        CouponPayload percentageCoupon = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CouponPayloadPercentage.fromPrecision(15.2))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(LocalDate.now().plusDays(35))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product1.getId()), true,
                String.valueOf(product2.getId()), false,
                "1234", true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component1.getId()), true,
                String.valueOf(component2.getId()), false,
                "1234", true
        );

        // when
        Coupon coupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        percentageCoupon, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(percentageCoupon, coupon, DiscountType.PERCENT, "15.2");
        assertRestrictions(coupon, product1, component1);
    }

    @Test
    void shouldReturn422WhenCreatingFlatCouponWithInvalidData() {
        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.createCoupon(
                        productFamilyId,
                        new CouponRequest(
                                new CouponPayload.Builder()
                                        .name("coupon" + randomNumeric(10))
                                        .amountInCents(-10L)
                                        .description("description" + randomNumeric(20))
                                        .code("coupon%@+-_." + randomNumeric(10))
                                        .endDate(LocalDate.now().minusDays(35))
                                        .build(), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Amount: must be greater than or equal to $0.00.", "Expiration Date cannot be in the past");
    }

    @Test
    void shouldReturn422WhenBothPercentAndAmountInCentsSet() {
        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.createCoupon(
                        productFamilyId,
                        new CouponRequest(
                                new CouponPayload.Builder()
                                        .name("coupon" + randomNumeric(10))
                                        .amountInCents(10L)
                                        .percentage(CouponPayloadPercentage.fromPrecision(5d))
                                        .description("description" + randomNumeric(20))
                                        .code("coupon%@+-_." + randomNumeric(10))
                                        .build(), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Either a Discount Percentage or Amount must be specified, but not both",
                        "Cannot create prices for a percentage-based coupon.");
    }

    @Test
    void shouldReturn422WhenCreatingPercentageCouponWithInvalidDataAndExistingCode() throws IOException, ApiException {
        Coupon existingCoupon = COUPONS_CONTROLLER.createCoupon(
                productFamilyId,
                validCouponRequest()
        ).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.createCoupon(
                        productFamilyId,
                        new CouponRequest(
                                new CouponPayload.Builder()
                                        .name("coupon" + randomNumeric(10))
                                        .percentage(CouponPayloadPercentage.fromPrecision(105))
                                        .description("description" + randomNumeric(20))
                                        .code(existingCoupon.getCode())
                                        .build(), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Percentage: must be less than or equal to 100.", "Code: must be unique - that value has been taken.");
    }

    @Test
    void shouldNotCreateCouponForNonExistentProductFamily() {
        assertNotFound(() -> COUPONS_CONTROLLER.createCoupon(99999999, validCouponRequest()));
    }

    @Test
    void shouldNotCreateCouponWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().createCoupon(productFamilyId, validCouponRequest())
        );
    }

}
