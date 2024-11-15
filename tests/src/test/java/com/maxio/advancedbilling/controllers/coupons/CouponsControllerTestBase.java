package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CouponsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
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
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerTestBase {

    protected static final CouponsController COUPONS_CONTROLLER = TestClient.createClient().getCouponsController();
    protected static ProductFamily productFamily;
    protected static int productFamilyId;
    protected static final TestSetup TEST_SETUP = new TestSetup();

    // if child classes are using @BeforeAll and this product family, they have to be named differently,
    // so it get executed after this one
    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        productFamilyId = productFamily.getId();
    }

    void assertResponseCoupon(CreateOrUpdateFlatAmountCoupon flatAmountCoupon, Coupon coupon) {
        // fields set by request
        assertThat(coupon.getName()).isEqualTo(flatAmountCoupon.getName());
        assertThat(coupon.getCode()).isEqualTo(flatAmountCoupon.getCode().toUpperCase());
        assertThat(coupon.getDescription()).isEqualTo(flatAmountCoupon.getDescription());
        assertThat(coupon.getAmountInCents()).isEqualTo(flatAmountCoupon.getAmountInCents());
        assertThat(coupon.getAmount()).isEqualTo(
                BigDecimal.valueOf(flatAmountCoupon.getAmountInCents()).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
                        .doubleValue()
        );
        assertThat(coupon.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(coupon.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(coupon.getRecurring()).isEqualTo(flatAmountCoupon.getRecurring());
        assertThat(coupon.getStackable()).isEqualTo(flatAmountCoupon.getStackable());
        assertThat(coupon.getCompoundingStrategy()).isEqualTo(flatAmountCoupon.getCompoundingStrategy());
        assertThat(coupon.getExcludeMidPeriodAllocations()).isEqualTo(flatAmountCoupon.getExcludeMidPeriodAllocations());
        assertThat(coupon.getApplyOnCancelAtEndOfPeriod()).isEqualTo(flatAmountCoupon.getApplyOnCancelAtEndOfPeriod());
        assertThat(coupon.getApplyOnSubscriptionExpiration()).isEqualTo(flatAmountCoupon.getApplyOnSubscriptionExpiration());
        // even if we set true in the request, if coupon have restrictions then it must be limited.
        if (!coupon.getCouponRestrictions().isEmpty()) {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(false);
        } else {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(flatAmountCoupon.getAllowNegativeBalance());
        }
        // TODO fix datetime to date
        //assertThat(coupon.getEndDate().toEpochSecond()).isEqualTo(flatAmountCoupon.getEndDate().toEpochSecond());

        assertCommonCouponFields(coupon, DiscountType.AMOUNT);
        assertThat(coupon.getPercentage()).isNull();
    }

    void assertResponseCoupon(CreateOrUpdatePercentageCoupon percentageCoupon, Coupon coupon, String percentage) {
        // fields set by request
        assertThat(coupon.getName()).isEqualTo(percentageCoupon.getName());
        assertThat(coupon.getCode()).isEqualTo(percentageCoupon.getCode().toUpperCase());
        assertThat(coupon.getDescription()).isEqualTo(percentageCoupon.getDescription());
        assertThat(coupon.getPercentage()).isEqualTo(percentage);
        assertThat(coupon.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(coupon.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(coupon.getRecurring()).isEqualTo(percentageCoupon.getRecurring());
        assertThat(coupon.getStackable()).isEqualTo(percentageCoupon.getStackable());
        assertThat(coupon.getCompoundingStrategy()).isEqualTo(percentageCoupon.getCompoundingStrategy());
        assertThat(coupon.getExcludeMidPeriodAllocations()).isEqualTo(percentageCoupon.getExcludeMidPeriodAllocations());
        assertThat(coupon.getApplyOnCancelAtEndOfPeriod()).isEqualTo(percentageCoupon.getApplyOnCancelAtEndOfPeriod());
        assertThat(coupon.getApplyOnSubscriptionExpiration()).isEqualTo(percentageCoupon.getApplyOnSubscriptionExpiration());
        // even if we set true in the request, if coupon have restrictions then it must be limited.
        if (!coupon.getCouponRestrictions().isEmpty()) {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(false);
        } else {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(percentageCoupon.getAllowNegativeBalance());
        }
        // TODO fix datetime to date
        //assertThat(coupon.getEndDate().toEpochSecond()).isEqualTo(flatAmountCoupon.getEndDate().toEpochSecond());

        assertCommonCouponFields(coupon, DiscountType.PERCENT);
        assertThat(coupon.getAmount()).isNull();
        assertThat(coupon.getAmountInCents()).isNull();
    }

    void assertCommonCouponFields(Coupon coupon, DiscountType discountType) {
        // generated fields/not setable in request
        assertThat(coupon.getId()).isNotNull();
        assertThat(coupon.getStartDate()).isNotNull();
        assertThat(coupon.getRecurringScheme()).isNotNull();
        assertThat(coupon.getDurationPeriodCount()).isNull();
        assertThat(coupon.getDurationInterval()).isNull();
        assertThat(coupon.getDurationIntervalUnit()).isNull();
        assertThat(coupon.getDurationIntervalSpan()).isEqualTo("1_month");
        assertThat(coupon.getArchivedAt()).isNull();
        assertThat(coupon.getConversionLimit()).isNull();
        assertThat(coupon.getUseSiteExchangeRate()).isTrue();
        assertThat(coupon.getCreatedAt()).isNotNull();
        assertThat(coupon.getUpdatedAt()).isNotNull();
        assertThat(coupon.getDiscountType()).isEqualTo(discountType);
    }

    void assertRestrictions(Coupon coupon, Product product, Component component) {
        assertThat(coupon.getCouponRestrictions())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
                .containsExactlyInAnyOrderElementsOf(
                        List.of(
                                new CouponRestriction.Builder()
                                        .name(product.getName())
                                        .handle(product.getHandle())
                                        .itemId(product.getId())
                                        .itemType(RestrictionType.PRODUCT)
                                        .build(),
                                new CouponRestriction.Builder()
                                        .name(component.getName())
                                        .handle(component.getHandle())
                                        .itemId(component.getId())
                                        .itemType(RestrictionType.COMPONENT)
                                        .build()
                        )
                );
    }

    static CreateOrUpdateCoupon validCreateOrUpdateCouponRequest() {
        return new CreateOrUpdateCoupon(
                CreateOrUpdateCouponCoupon.fromCreateOrUpdateFlatAmountCoupon(
                        new CreateOrUpdateFlatAmountCoupon.Builder()
                                .name("coupon" + randomNumeric(10))
                                .description("description" + randomNumeric(20))
                                .amountInCents(10)
                                .code("coupon%@+-_." + randomNumeric(10))
                                .build()
                ), null, null);
    }

}
