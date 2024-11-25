package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferRequest;
import com.maxio.advancedbilling.models.DiscountType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.containers.CouponPayloadPercentage;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerUpdateCouponTest extends CouponsControllerTestBase {

    protected Product product;
    protected Component component;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldUpdateFlatAmountCoupon() throws IOException, ApiException {
        // given
        CouponPayload flatAmountCouponCreate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(1234L)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(false)
                .endDate(LocalDate.now().plusDays(35))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(false)
                .applyOnCancelAtEndOfPeriod(false)
                .applyOnSubscriptionExpiration(false)
                .build();

        CouponPayload flatAmountCouponUpdate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(54333L)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(LocalDate.now().plusDays(332))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        flatAmountCouponCreate, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CouponRequest(
                        flatAmountCouponUpdate, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(flatAmountCouponCreate, createdCoupon, DiscountType.AMOUNT);
        assertThat(createdCoupon.getCouponRestrictions()).isEmpty();
        assertResponseCoupon(flatAmountCouponUpdate, updatedCoupon, DiscountType.AMOUNT);
        assertRestrictions(updatedCoupon, product, component);
    }

    @Test
    void shouldUpdatePercentageCoupon() throws IOException, ApiException {
        // given
        String percentage1 = "13.0";
        CouponPayload percentageCouponCreate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CouponPayloadPercentage.fromString(percentage1))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(false)
                .endDate(LocalDate.now().plusDays(35))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(false)
                .applyOnCancelAtEndOfPeriod(false)
                .applyOnSubscriptionExpiration(false)
                .build();

        String percentage2 = "29.98";
        CouponPayload percentageCouponUpdate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CouponPayloadPercentage.fromString(percentage2))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(false)
                .recurring(true)
                .endDate(LocalDate.now().plusDays(25))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        percentageCouponCreate, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CouponRequest(
                        percentageCouponUpdate, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(percentageCouponCreate, createdCoupon, DiscountType.PERCENT, percentage1);
        assertThat(createdCoupon.getCouponRestrictions()).isEmpty();
        assertResponseCoupon(percentageCouponUpdate, updatedCoupon, DiscountType.PERCENT, percentage2);
        assertRestrictions(updatedCoupon, product, component);
    }

    @Test
    void shouldUpdateOnlySpecifiedCouponFields() throws IOException, ApiException {
        // given
        CouponPayload flatAmountCouponCreate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(1234L)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(true)
                .endDate(LocalDate.now().plusDays(21))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        CouponPayload flatAmountCouponUpdate = new CouponPayload.Builder()
                .name("coupon" + randomNumeric(10))
                .recurring(false)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(false)
                .build();

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CouponRequest(
                        flatAmountCouponCreate, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CouponRequest(
                        flatAmountCouponUpdate, null, null
                )).getCoupon();

        // then
        assertThat(updatedCoupon).usingRecursiveComparison()
                .ignoringFields("updatedAt", "name", "recurring", "excludeMidPeriodAllocations",
                        "compoundingStrategy", "recurringScheme")
                .isEqualTo(createdCoupon);
        assertThat(updatedCoupon.getName()).isEqualTo(flatAmountCouponUpdate.getName());
        assertThat(updatedCoupon.getRecurring()).isEqualTo(flatAmountCouponUpdate.getRecurring());
        assertThat(updatedCoupon.getCompoundingStrategy()).isEqualTo(flatAmountCouponUpdate.getCompoundingStrategy());
        assertThat(updatedCoupon.getExcludeMidPeriodAllocations()).isEqualTo(flatAmountCouponUpdate.getExcludeMidPeriodAllocations());
    }

    @Test
    void shouldReturn422WhenUpdatingCouponUsedInOffer() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(
                productFamilyId,
                validCouponRequest()
        ).getCoupon();
        String offerName = "test-offer-" + randomNumeric(10);
        TestClientProvider.getClient().getOffersController().createOffer(
                new CreateOfferRequest(
                        new CreateOffer.Builder()
                                .name(offerName)
                                .coupons(List.of(coupon.getCode()))
                                .productId(product.getId())
                                .handle("offer-handle-" + randomNumeric(10))
                                .build()
                )
        );

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.updateCoupon(
                        productFamilyId,
                        coupon.getId(),
                        validCouponRequest()
                ))
                .isUnprocessableEntity()
                .hasErrors("Code cannot be changed because coupon belongs to one or more active offers: " + offerName);
    }

    @Test
    void shouldReturn422WhenUpdatingFlatCouponWithInvalidData() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(
                productFamilyId,
                validCouponRequest()).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.updateCoupon(
                        productFamilyId,
                        coupon.getId(),
                        new CouponRequest(
                                new CouponPayload.Builder()
                                        .name("coupon" + randomNumeric(10))
                                        .amountInCents(-10l)
                                        .description("description" + randomNumeric(20))
                                        .code("coupon%@+-_." + randomNumeric(10))
                                        .build(), null, null
                        )
                ))
                .isUnprocessableEntity()
                .hasErrors("Amount: must be greater than or equal to $0.00.");
    }

    @Test
    void shouldReturn422WhenUpdatingPercentageCouponWithInvalidDataAndExistingCode() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
        Coupon existingCoupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.updateCoupon(
                        productFamilyId,
                        coupon.getId(),
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
    void shouldNotUpdateCouponNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.updateCoupon(productFamilyId, 123, validCouponRequest()));
    }

    @Test
    void shouldNotUpdateCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().updateCoupon(productFamilyId, coupon.getId(), validCouponRequest())
        );
    }

}
