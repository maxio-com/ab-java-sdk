package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponResponse;
import com.maxio.advancedbilling.models.ListCouponsFilter;
import com.maxio.advancedbilling.models.ListCouponsForProductFamilyInput;
import com.maxio.advancedbilling.models.ProductFamily;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerListForProductFamilyTest extends CouponsControllerTestBase {

    protected static ProductFamily productFamily2;
    protected static List<Coupon> coupons1 = new ArrayList<>();
    protected static List<Coupon> coupons2 = new ArrayList<>();
    protected static ZonedDateTime testStart;

    @BeforeAll
    static void setupResources() throws IOException, ApiException {
        testStart = ZonedDateTime.now();
        productFamily2 = TEST_SETUP.createProductFamily();
        for (int i=0; i<3; i++) {
            coupons1.add(COUPONS_CONTROLLER.createCoupon(productFamilyId, validCouponRequest()).getCoupon());
        }
        for (int i=0; i<3; i++) {
            coupons2.add(COUPONS_CONTROLLER.createCoupon(productFamily2.getId(), validCouponRequest()).getCoupon());
        }
    }

    @Test
    void shouldListCouponsWithoutFilters() throws IOException, ApiException {
        List<Coupon> listedCoupons = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamilyId)
                                .build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(3);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons1);
    }

    @Test
    void shouldListCouponsWithDatetimeFilters() throws IOException, ApiException {
        // when
        List<Coupon> listedCouponsOutOfRange = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamilyId)
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .startDatetime(testStart.minusMinutes(5))
                                                .endDatetime(testStart.minusMinutes(2))
                                                .dateField(BasicDateField.CREATED_AT)
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();
        List<Coupon> listedCouponsInRange = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamily2.getId())
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .startDatetime(testStart.minusMinutes(2))
                                                .endDatetime(testStart.plusHours(3))
                                                .dateField(BasicDateField.CREATED_AT)
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        // then
        assertThat(listedCouponsOutOfRange).isEmpty();

        assertThat(listedCouponsInRange).hasSize(3);
        assertThat(listedCouponsInRange).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons2);
    }

    @Test
    void shouldListCouponsWithIdFilters() throws IOException, ApiException {
        // when
        List<Coupon> couponsToFind = coupons1.subList(1,3);
        List<Coupon> listedCoupons = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamilyId)
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .ids(couponsToFind.stream().map(Coupon::getId).toList())
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        // then
        assertThat(listedCoupons).hasSize(2);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(couponsToFind);
    }

    @Test
    void shouldListCouponsWithCodeFilters() throws IOException, ApiException {
        // when
        List<Coupon> couponsToFind = coupons2.subList(0,2);
        List<Coupon> listedCoupons = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamily2.getId())
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .codes(couponsToFind.stream().map(Coupon::getCode).toList())
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        // then
        assertThat(listedCoupons).hasSize(2);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(couponsToFind);
    }

    @Test
    void shouldListAllCouponsWithPaging() throws IOException, ApiException {
        // when
        List<Coupon> allResponses = new ArrayList<>();
        List<Coupon> firstPage = listCouponsWithPaging(1, 2);
        List<Coupon> secondPage = listCouponsWithPaging(2, 2);
        List<Coupon> thirdPage = listCouponsWithPaging(3, 2);

        allResponses.addAll(firstPage);
        allResponses.addAll(secondPage);

        // then
        assertThat(firstPage).hasSize(2);
        assertThat(secondPage).hasSize(1);
        assertThat(thirdPage).isEmpty();

        assertThat(allResponses)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons1);
    }

    private List<Coupon> listCouponsWithPaging(int page, int perPage) throws IOException, ApiException {
        return COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamilyId)
                                .page(page)
                                .perPage(perPage)
                                .build()
                )
                .stream().map(CouponResponse::getCoupon).toList();
    }

    @Test
    void shouldListCouponsWithCurrencyPrices() throws IOException, ApiException {
        List<Coupon> listedCoupons = COUPONS_CONTROLLER.listCouponsForProductFamily(
                        new ListCouponsForProductFamilyInput.Builder()
                                .productFamilyId(productFamilyId)
                                .currencyPrices(true)
                                .build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(3);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparatorIgnoringFields("currencyPrices")
                .containsExactlyInAnyOrderElementsOf(coupons1);
        for (Coupon coupon: listedCoupons) {
            assertCurrencyPrices(coupon.getCurrencyPrices(), coupon.getId());
        }
    }

    @Test
    void shouldNotListCouponsForNonExistentProductFamily() {
        assertNotFound(() -> COUPONS_CONTROLLER.listCouponsForProductFamily(
                new ListCouponsForProductFamilyInput.Builder()
                        .productFamilyId(123)
                        .build()
        ));
    }

    @Test
    void shouldNotListCouponsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().listCouponsForProductFamily(new ListCouponsForProductFamilyInput())
        );
    }

}
