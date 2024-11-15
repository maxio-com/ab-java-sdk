package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferRequest;
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
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerUpdateCouponTest extends CouponsControllerTestBase {

    protected static Product product;
    protected static Component component;

    @BeforeAll
    static void setupResources() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamilyId);
    }

    @Test
    void shouldUpdateFlatAmountCoupon() throws IOException, ApiException {
        // given
        CreateOrUpdateFlatAmountCoupon flatAmountCouponCreate = new CreateOrUpdateFlatAmountCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(1234)
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(false)
                .endDate(ZonedDateTime.now().plusDays(35).plusHours(13))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(false)
                .applyOnCancelAtEndOfPeriod(false)
                .applyOnSubscriptionExpiration(false)
                .build();
        CreateOrUpdateCouponCoupon createCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdateFlatAmountCoupon(flatAmountCouponCreate);

        CreateOrUpdateFlatAmountCoupon flatAmountCouponUpdate = new CreateOrUpdateFlatAmountCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .amountInCents(54333)
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

        CreateOrUpdateCouponCoupon updateCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdateFlatAmountCoupon(flatAmountCouponUpdate);
        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CreateOrUpdateCoupon(
                        updateCouponRequest, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(flatAmountCouponCreate, createdCoupon);
        assertThat(createdCoupon.getCouponRestrictions()).isEmpty();
        assertResponseCoupon(flatAmountCouponUpdate, updatedCoupon);
        assertRestrictions(updatedCoupon, product, component);
    }

    @Test
    void shouldUpdatePercentageCoupon() throws IOException, ApiException {
        // given
        String percentage1 = "13.0";
        CreateOrUpdatePercentageCoupon percentageCouponCreate = new CreateOrUpdatePercentageCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CreateOrUpdatePercentageCouponPercentage.fromString(percentage1))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(true)
                .recurring(false)
                .endDate(ZonedDateTime.now().plusDays(35).plusHours(13))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(false)
                .applyOnCancelAtEndOfPeriod(false)
                .applyOnSubscriptionExpiration(false)
                .build();
        CreateOrUpdateCouponCoupon createCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdatePercentageCoupon(percentageCouponCreate);

        String percentage2 = "29.98";
        CreateOrUpdatePercentageCoupon percentageCouponUpdate = new CreateOrUpdatePercentageCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .percentage(CreateOrUpdatePercentageCouponPercentage.fromString(percentage2))
                .description("description" + randomNumeric(20))
                .code("coupon%@+-_." + randomNumeric(10))
                .allowNegativeBalance(false)
                .recurring(true)
                .endDate(ZonedDateTime.now().plusDays(35).plusHours(13))
                .stackable(true)
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
                .excludeMidPeriodAllocations(true)
                .applyOnCancelAtEndOfPeriod(true)
                .applyOnSubscriptionExpiration(true)
                .build();

        CreateOrUpdateCouponCoupon updateCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdatePercentageCoupon(percentageCouponUpdate);
        Map<String, Boolean> restrictedProducts = Map.of(
                String.valueOf(product.getId()), true
        );
        Map<String, Boolean> restrictedComponents = Map.of(
                String.valueOf(component.getId()), true
        );

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CreateOrUpdateCoupon(
                        updateCouponRequest, restrictedProducts, restrictedComponents
                )).getCoupon();

        // then
        assertResponseCoupon(percentageCouponCreate, createdCoupon, percentage1);
        assertThat(createdCoupon.getCouponRestrictions()).isEmpty();
        assertResponseCoupon(percentageCouponUpdate, updatedCoupon, percentage2);
        assertRestrictions(updatedCoupon, product, component);
    }

    @Test
    void shouldUpdateOnlySpecifiedCouponFields() throws IOException, ApiException {
        // given
        CreateOrUpdateFlatAmountCoupon flatAmountCouponCreate = new CreateOrUpdateFlatAmountCoupon.Builder()
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
                .fromCreateOrUpdateFlatAmountCoupon(flatAmountCouponCreate);

        CreateOrUpdateFlatAmountCoupon flatAmountCouponUpdate = new CreateOrUpdateFlatAmountCoupon.Builder()
                .name("coupon" + randomNumeric(10))
                .recurring(false)
                .compoundingStrategy(CompoundingStrategy.FULLPRICE)
                .excludeMidPeriodAllocations(false)
                .build();
        CreateOrUpdateCouponCoupon updateCouponRequest = CreateOrUpdateCouponCoupon
                .fromCreateOrUpdateFlatAmountCoupon(flatAmountCouponUpdate);

        // when
        Coupon createdCoupon = COUPONS_CONTROLLER
                .createCoupon(productFamilyId, new CreateOrUpdateCoupon(
                        createCouponRequest, null, null
                )).getCoupon();
        Coupon updatedCoupon = COUPONS_CONTROLLER
                .updateCoupon(productFamilyId, createdCoupon.getId(), new CreateOrUpdateCoupon(
                        updateCouponRequest, null, null
                )).getCoupon();

        // then
        assertThat(updatedCoupon).usingRecursiveComparison()
                .ignoringFields("updatedAt", "name", "recurring", "excludeMidPeriodAllocations",
                        "compoundingStrategy")
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
                validCreateOrUpdateCouponRequest()
        ).getCoupon();
        String offerName = "test-offer-" + randomNumeric(10);
        TestClient.createClient().getOffersController().createOffer(
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
                        validCreateOrUpdateCouponRequest()
                ))
                .isUnprocessableEntity()
                .hasErrors("Code cannot be changed because coupon belongs to one or more active offers: " + offerName);
    }

    @Test
    void shouldReturn422WhenUpdatingFlatCouponWithInvalidData() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(
                productFamilyId,
                validCreateOrUpdateCouponRequest()).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.updateCoupon(
                        productFamilyId,
                        coupon.getId(),
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
    void shouldReturn422WhenUpdatingPercentageCouponWithInvalidDataAndExistingCode() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest()).getCoupon();
        Coupon existingCoupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest()).getCoupon();

        CommonAssertions
                .assertThatErrorListResponse(() -> COUPONS_CONTROLLER.updateCoupon(
                        productFamilyId,
                        coupon.getId(),
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
    void shouldNotUpdateCouponNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.updateCoupon(productFamilyId, 123, validCreateOrUpdateCouponRequest()));
    }

    @Test
    void shouldNotUpdateCouponWhenProvidingInvalidCredentials() throws IOException, ApiException {
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest())
                .getCoupon();

        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().updateCoupon(productFamilyId, coupon.getId(), validCreateOrUpdateCouponRequest())
        );
    }

}
