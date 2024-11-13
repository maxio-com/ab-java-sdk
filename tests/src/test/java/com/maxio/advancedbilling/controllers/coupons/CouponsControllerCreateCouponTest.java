package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CouponsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CompoundingStrategy;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponRestriction;
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateFlatAmountCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdatePercentageCoupon;
import com.maxio.advancedbilling.models.DiscountType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RestrictionType;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponPercentage;
import com.maxio.advancedbilling.utils.TestSetup;
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

public class CouponsControllerCreateCouponTest {

    protected static final CouponsController COUPONS_CONTROLLER = TestClient.createClient().getCouponsController();
    protected static ProductFamily productFamily;
    protected static int productFamilyId;
    protected static Product product1;
    protected static Product product2;
    protected static Component component1;
    protected static Component component2;

    protected static final TestSetup TEST_SETUP = new TestSetup();

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        productFamilyId = productFamily.getId();
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
        assertThat(coupon.getId()).isNotNull();
        assertThat(coupon.getName()).isEqualTo(flatAmountCoupon.getName());
        assertThat(coupon.getCode()).isEqualTo(flatAmountCoupon.getCode().toUpperCase());
        assertThat(coupon.getDescription()).isEqualTo(flatAmountCoupon.getDescription());
        assertThat(coupon.getAmountInCents()).isEqualTo(flatAmountCoupon.getAmountInCents());
        assertThat(coupon.getAmount()).isEqualTo(12.34);
        assertThat(coupon.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(coupon.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(coupon.getStartDate()).isNotNull();
        // TODO fix datetime to date
        //assertThat(coupon.getEndDate().toEpochSecond()).isEqualTo(flatAmountCoupon.getEndDate().toEpochSecond());
        assertThat(coupon.getPercentage()).isNull();
        assertThat(coupon.getRecurring()).isEqualTo(flatAmountCoupon.getRecurring());
        assertThat(coupon.getRecurringScheme()).isNotNull(); // TODO add docs?
        assertThat(coupon.getDurationPeriodCount()).isNull();
        assertThat(coupon.getDurationInterval()).isNull();
        assertThat(coupon.getDurationIntervalUnit()).isNull();
        assertThat(coupon.getDurationIntervalSpan()).isEqualTo("1_month");
        // even if we set true in the request, if coupon have restrictions then it must be limited.
        assertThat(coupon.getAllowNegativeBalance()).isEqualTo(false);        assertThat(coupon.getArchivedAt()).isNull();
        assertThat(coupon.getConversionLimit()).isNull();
        assertThat(coupon.getStackable()).isEqualTo(flatAmountCoupon.getStackable());
        assertThat(coupon.getCompoundingStrategy()).isEqualTo(flatAmountCoupon.getCompoundingStrategy());
        assertThat(coupon.getUseSiteExchangeRate()).isTrue();
        assertThat(coupon.getCreatedAt()).isNotNull();
        assertThat(coupon.getUpdatedAt()).isNotNull();
        assertThat(coupon.getDiscountType()).isEqualTo(DiscountType.AMOUNT);
        assertThat(coupon.getExcludeMidPeriodAllocations()).isEqualTo(flatAmountCoupon.getExcludeMidPeriodAllocations());
        assertThat(coupon.getApplyOnCancelAtEndOfPeriod()).isEqualTo(flatAmountCoupon.getApplyOnCancelAtEndOfPeriod());
        assertThat(coupon.getApplyOnSubscriptionExpiration()).isEqualTo(flatAmountCoupon.getApplyOnSubscriptionExpiration());
        assertThat(coupon.getCouponRestrictions())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
                .containsExactlyInAnyOrderElementsOf(
                        List.of(
                                new CouponRestriction.Builder()
                                        .name(product1.getName())
                                        .handle(product1.getHandle())
                                        .itemId(product1.getId())
                                        .itemType(RestrictionType.PRODUCT)
                                        .build(),
                                new CouponRestriction.Builder()
                                        .name(component1.getName())
                                        .handle(component1.getHandle())
                                        .itemId(component1.getId())
                                        .itemType(RestrictionType.COMPONENT)
                                        .build()
                        )
                );
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
                .compoundingStrategy(CompoundingStrategy.COMPOUND)
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
        assertThat(coupon.getId()).isNotNull();
        assertThat(coupon.getName()).isEqualTo(percentageCoupon.getName());
        assertThat(coupon.getCode()).isEqualTo(percentageCoupon.getCode().toUpperCase());
        assertThat(coupon.getDescription()).isEqualTo(percentageCoupon.getDescription());
        assertThat(coupon.getPercentage()).isEqualTo("15.2");
        assertThat(coupon.getAmountInCents()).isNull();
        assertThat(coupon.getAmount()).isNull();
        assertThat(coupon.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(coupon.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(coupon.getStartDate()).isNotNull();
        // TODO fix datetime to date
        //assertThat(coupon.getEndDate().toEpochSecond()).isEqualTo(flatAmountCoupon.getEndDate().toEpochSecond());
        assertThat(coupon.getRecurring()).isEqualTo(percentageCoupon.getRecurring());
        assertThat(coupon.getRecurringScheme()).isNotNull(); // TODO add docs?
        assertThat(coupon.getDurationPeriodCount()).isNull();
        assertThat(coupon.getDurationInterval()).isNull();
        assertThat(coupon.getDurationIntervalUnit()).isNull();
        assertThat(coupon.getDurationIntervalSpan()).isEqualTo("1_month");
        // even if we set true in the request, if coupon have restrictions then it must be limited.
        assertThat(coupon.getAllowNegativeBalance()).isEqualTo(false);
        assertThat(coupon.getArchivedAt()).isNull();
        assertThat(coupon.getConversionLimit()).isNull();
        assertThat(coupon.getStackable()).isEqualTo(percentageCoupon.getStackable());
        assertThat(coupon.getCompoundingStrategy()).isEqualTo(percentageCoupon.getCompoundingStrategy());
        assertThat(coupon.getUseSiteExchangeRate()).isTrue();
        assertThat(coupon.getCreatedAt()).isNotNull();
        assertThat(coupon.getUpdatedAt()).isNotNull();
        assertThat(coupon.getDiscountType()).isEqualTo(DiscountType.PERCENT);
        assertThat(coupon.getExcludeMidPeriodAllocations()).isEqualTo(percentageCoupon.getExcludeMidPeriodAllocations());
        assertThat(coupon.getApplyOnCancelAtEndOfPeriod()).isEqualTo(percentageCoupon.getApplyOnCancelAtEndOfPeriod());
        assertThat(coupon.getApplyOnSubscriptionExpiration()).isEqualTo(percentageCoupon.getApplyOnSubscriptionExpiration());
        assertThat(coupon.getCouponRestrictions())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
                .containsExactlyInAnyOrderElementsOf(
                        List.of(
                                new CouponRestriction.Builder()
                                        .name(product1.getName())
                                        .handle(product1.getHandle())
                                        .itemId(product1.getId())
                                        .itemType(RestrictionType.PRODUCT)
                                        .build(),
                                new CouponRestriction.Builder()
                                        .name(component1.getName())
                                        .handle(component1.getHandle())
                                        .itemId(component1.getId())
                                        .itemType(RestrictionType.COMPONENT)
                                        .build()
                        )
                );
    }

    @Test
    void shouldReturn422WhenCreatingCouponWithInvalidData() {
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
    void shouldNotCreateCouponForNonExistentProductFamily() {
        assertNotFound(() -> COUPONS_CONTROLLER.createCoupon(99999999,
                new CreateOrUpdateCoupon(
                        CreateOrUpdateCouponCoupon.fromCreateOrUpdateFlatAmountCoupon(
                                new CreateOrUpdateFlatAmountCoupon.Builder()
                                        .name("coupon" + randomNumeric(10))
                                        .amountInCents(10)
                                        .code("coupon%@+-_." + randomNumeric(10))
                                        .build()
                        ), null, null
                )
        ));
    }

    @Test
    void shouldNotCreateCouponWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().createCoupon(productFamilyId,
                        new CreateOrUpdateCoupon(
                                CreateOrUpdateCouponCoupon.fromCreateOrUpdateFlatAmountCoupon(
                                        new CreateOrUpdateFlatAmountCoupon.Builder()
                                                .name("coupon" + randomNumeric(10))
                                                .description("description" + randomNumeric(20))
                                                .amountInCents(10)
                                                .code("coupon%@+-_." + randomNumeric(10))
                                                .build()
                                ), null, null
                        ))
        );
    }

}
