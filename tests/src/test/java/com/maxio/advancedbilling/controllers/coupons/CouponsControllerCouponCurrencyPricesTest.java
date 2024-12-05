package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponCurrency;
import com.maxio.advancedbilling.models.CouponCurrencyRequest;
import com.maxio.advancedbilling.models.UpdateCouponCurrency;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorStringMapResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerCouponCurrencyPricesTest extends CouponsControllerTestBase {

    private Coupon coupon;

    @BeforeAll
    void setupResources() throws IOException, ApiException {
        coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
    }

    @Test
    void shouldCreateAndUpdateCouponCurrencyPrices() throws IOException, ApiException {
        // when
        Coupon coupon = COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon();
        List<CouponCurrency> currencyPrices = COUPONS_CONTROLLER
                .createOrUpdateCouponCurrencyPrices(coupon.getId(), new CouponCurrencyRequest(
                                List.of(
                                        new UpdateCouponCurrency("USD", 15),
                                        new UpdateCouponCurrency("EUR", 333)
                                )
                        )
                ).getCurrencyPrices();

        // then
        assertThat(currencyPrices).hasSize(2);
        assertThat(currencyPrices.get(0).getId()).isNotNull();
        assertThat(currencyPrices.get(0).getCurrency()).isEqualTo("USD");
        assertThat(currencyPrices.get(0).getPrice()).isEqualTo(15.0);
        assertThat(currencyPrices.get(0).getCouponId()).isEqualTo(coupon.getId());
        assertThat(currencyPrices.get(1).getId()).isNotNull();
        assertThat(currencyPrices.get(1).getCurrency()).isEqualTo("EUR");
        assertThat(currencyPrices.get(1).getPrice()).isEqualTo(333.0);
        assertThat(currencyPrices.get(1).getCouponId()).isEqualTo(coupon.getId());

        // then update
        List<CouponCurrency> currencyPrices2 = COUPONS_CONTROLLER
                .createOrUpdateCouponCurrencyPrices(coupon.getId(), new CouponCurrencyRequest(
                                List.of(
                                        new UpdateCouponCurrency("USD", 1),
                                        new UpdateCouponCurrency("EUR", 2)
                                )
                        )
                ).getCurrencyPrices();

        // then
        assertThat(currencyPrices2.get(0).getId()).isEqualTo(currencyPrices.get(0).getId());
        assertThat(currencyPrices2.get(0).getCurrency()).isEqualTo("USD");
        assertThat(currencyPrices2.get(0).getPrice()).isEqualTo(1.0);
        assertThat(currencyPrices2.get(0).getCouponId()).isEqualTo(coupon.getId());
        assertThat(currencyPrices2.get(1).getId()).isEqualTo(currencyPrices.get(1).getId());
        assertThat(currencyPrices2.get(1).getCurrency()).isEqualTo("EUR");
        assertThat(currencyPrices2.get(1).getPrice()).isEqualTo(2.0);
        assertThat(currencyPrices2.get(1).getCouponId()).isEqualTo(coupon.getId());
    }

    @Test
    void shouldNotCreateCurrencyPricesWithInvalidData() throws IOException, ApiException {
        Coupon coupon2 = TEST_SETUP.createPercentageCoupon(productFamily, "2");
        assertThatErrorStringMapResponse(() -> COUPONS_CONTROLLER.createOrUpdateCouponCurrencyPrices(coupon2.getId(),
                new CouponCurrencyRequest(List.of(new UpdateCouponCurrency("PLN", -10)))))
                .hasErrorMap(
                        Map.of(
                                "PLN.currency", "Currency must be defined on the site level.",
                                "PLN.price", "Amount: must be greater than or equal to 0,00 zł.",
                                "coupon", "Cannot create prices for a percentage-based coupon."
                        ))
                .isUnprocessableEntity();
    }

    @Test
    void shouldNotCreateCurrencyPricesForNonExistentCoupon() {
        assertNotFound(() -> COUPONS_CONTROLLER.createOrUpdateCouponCurrencyPrices(123,
                new CouponCurrencyRequest()));
    }

    @Test
    void shouldNotCreateCurrencyPricesWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getCouponsController().createOrUpdateCouponCurrencyPrices(coupon.getId(), new CouponCurrencyRequest())
        );
    }

}
