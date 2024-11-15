package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateFlatAmountCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdatePercentageCoupon;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponPercentage;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class CouponsControllerCreateCouponTest extends CouponsControllerTestBase {

    protected static Product product1;
    protected static Product product2;
    protected static Component component1;
    protected static Component component2;

    @BeforeAll
    static void setupResources() throws IOException, ApiException {
        product1 = TEST_SETUP.createProduct(productFamily);
        product2 = TEST_SETUP.createProduct(productFamily);
        component1 = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
        component2 = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldCreateFlatAmountCoupon() throws IOException, ApiException {
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
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(flatAmountCoupon, coupon);
        assertRestrictions(coupon, product1, component1);
    }

    @Test
    void shouldCreatePercentageCoupon() throws IOException, ApiException {
        // given
        CreateOrUpdatePercentageCoupon percentageCoupon = new CreateOrUpdatePercentageCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CreateOrUpdatePercentageCouponPercentage.fromPrecision(15.2))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(ZonedDateTime.now().plusDays(35).plusHours(13))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        CreateOrUpdateCouponCoupon createCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdatePercentageCoupon(percentageCoupon);
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
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(percentageCoupon, coupon, "15.2");
        assertRestrictions(coupon, product1, component1);
    }

    @Test
    void shouldReturn422WhenCreatingFlatCouponWithInvalidData() {
        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.createCoupon(
                        productFamilyId,
                        new CreateOrUpdateCoupon(
                                CreateOrUpdateCouponCoupon.fromCreateOrUpdateFlatAmountCoupon(
                                        new CreateOrUpdateFlatAmountCoupon.Builder()
                                                .name("coupon" + randomNumeric(10))
                                                .amountInCents(-10)
                                                .description("description" + randomNumeric(20))
                                                .code("coupon%@+-_." + randomNumeric(10))
                                                .endDate(ZonedDateTime.now().minusDays(35))
                                                .build()
                                ), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Amount: must be greater than or equal to $0.00.", "Expiration Date cannot be in the past");
    }

    @Test
    void shouldReturn422WhenCreatingPercentageCouponWithInvalidDataAndExistingCode() throws IOException, ApiException {
        Coupon existingCoupon = COUPONS_CONTROLLER.createCoupon(
                productFamilyId,
                validCreateOrUpdateCouponRequest()
        ).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.createCoupon(
                        productFamilyId,
                        new CreateOrUpdateCoupon(
                                CreateOrUpdateCouponCoupon.fromCreateOrUpdatePercentageCoupon(
                                        new CreateOrUpdatePercentageCoupon.Builder()
                                                .name("coupon" + randomNumeric(10))
                                                .percentage(CreateOrUpdatePercentageCouponPercentage.fromPrecision(105))
                                                .description("description" + randomNumeric(20))
                                                .code(existingCoupon.getCode())
                                                .build()
                                ), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Percentage: must be less than or equal to 100.", "Code: must be unique - that value has been taken.");
    }

    @Test
    void shouldNotCreateCouponForNonExistentProductFamily() {
        assertNotFound(() -> COUPONS_CONTROLLER.createCoupon(99999999, validCreateOrUpdateCouponRequest()));
    }

    @Test
    void shouldNotCreateCouponWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().createCoupon(productFamilyId, validCreateOrUpdateCouponRequest())
        );
    }

}
