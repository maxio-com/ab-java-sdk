package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CouponsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponCurrency;
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.CouponRestriction;
import com.maxio.advancedbilling.models.DiscountType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RestrictionType;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
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

    void assertResponseCoupon(CouponPayload couponPayload, Coupon coupon, DiscountType discountType) {
        assertResponseCoupon(couponPayload, coupon, discountType, null);
    }

    void assertResponseCoupon(CouponPayload couponPayload, Coupon coupon, DiscountType discountType, String percentage) {
        if (discountType == DiscountType.AMOUNT) {
            assertThat(coupon.getPercentage()).isNull();
            assertThat(coupon.getAmountInCents()).isEqualTo(couponPayload.getAmountInCents());
            assertThat(coupon.getAmount()).isEqualTo(
                    BigDecimal.valueOf(couponPayload.getAmountInCents()).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
                            .doubleValue()
            );
        } else if (discountType == DiscountType.PERCENT) {
            assertThat(coupon.getAmount()).isNull();
            assertThat(coupon.getAmountInCents()).isNull();
            assertThat(coupon.getPercentage()).isEqualTo(percentage);
        }

        assertThat(coupon.getName()).isEqualTo(couponPayload.getName());
        assertThat(coupon.getCode()).isEqualTo(couponPayload.getCode().toUpperCase());
        assertThat(coupon.getDescription()).isEqualTo(couponPayload.getDescription());

        assertThat(coupon.getProductFamilyId()).isEqualTo(productFamilyId);
        assertThat(coupon.getProductFamilyName()).isEqualTo(productFamily.getName());
        assertThat(coupon.getRecurring()).isEqualTo(couponPayload.getRecurring());
        assertThat(coupon.getStackable()).isEqualTo(couponPayload.getStackable());
        assertThat(coupon.getCompoundingStrategy()).isEqualTo(couponPayload.getCompoundingStrategy());
        assertThat(coupon.getExcludeMidPeriodAllocations()).isEqualTo(couponPayload.getExcludeMidPeriodAllocations());
        assertThat(coupon.getApplyOnCancelAtEndOfPeriod()).isEqualTo(couponPayload.getApplyOnCancelAtEndOfPeriod());
        assertThat(coupon.getApplyOnSubscriptionExpiration()).isEqualTo(couponPayload.getApplyOnSubscriptionExpiration());
        // even if we set true in the request, if coupon have restrictions then it must be limited.
        if (!coupon.getCouponRestrictions().isEmpty()) {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(false);
        } else {
            assertThat(coupon.getAllowNegativeBalance()).isEqualTo(couponPayload.getAllowNegativeBalance());
        }
        // Created endDate DateTime is same day as requested, but it's the end of the day - 23:59:59
        assertThat(
                couponPayload.getEndDate().plusDays(1).toEpochSecond(LocalTime.MIN, coupon.getEndDate().getOffset()) - 1
        ).isEqualTo(coupon.getEndDate().toEpochSecond());

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

    void assertCurrencyPrices(List<CouponCurrency> currencyPrices, Integer couponId) {
        assertThat(currencyPrices).hasSize(1);
        CouponCurrency price = currencyPrices.get(0);
        assertThat(price.getId()).isNull();
        assertThat(price.getCouponId()).isEqualTo(couponId);
        assertThat(price.getCurrency()).isEqualTo("EUR");
        assertThat(price.getPrice()).isPositive();
    }

    static CouponRequest validCouponRequest() {
        return new CouponRequest(
                new CouponPayload.Builder()
                        .name("coupon" + randomNumeric(10))
                        .description("description" + randomNumeric(20))
                        .amountInCents(10L)
                        .code("coupon%@+-_." + randomNumeric(10))
                        .build(), null, null);
    }

}
