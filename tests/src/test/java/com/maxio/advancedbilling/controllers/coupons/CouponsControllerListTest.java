package com.maxio.advancedbilling.controllers.coupons;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponResponse;
import com.maxio.advancedbilling.models.ListCouponsFilter;
import com.maxio.advancedbilling.models.ListCouponsInput;
import com.maxio.advancedbilling.models.ProductFamily;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class CouponsControllerListTest extends CouponsControllerTestBase {

    protected static ProductFamily productFamily2;
    protected static ProductFamily productFamily3;
    protected static List<Coupon> coupons = new ArrayList<>();
    protected static ZonedDateTime testStart;

    @BeforeAll
    static void setupResources() throws IOException, ApiException, InterruptedException {
        testStart = ZonedDateTime.now();
        Thread.sleep(2000);

        productFamily2 = TEST_SETUP.createProductFamily();
        productFamily3 = TEST_SETUP.createProductFamily();
        for (int i=0; i<4; i++) {
            coupons.add(COUPONS_CONTROLLER.createCoupon(productFamilyId, validCreateOrUpdateCouponRequest()).getCoupon());
        }
        for (int i=0; i<3; i++) {
            coupons.add(COUPONS_CONTROLLER.createCoupon(productFamily2.getId(), validCreateOrUpdateCouponRequest()).getCoupon());
        }
        for (int i=0; i<3; i++) {
            coupons.add(COUPONS_CONTROLLER.createCoupon(productFamily3.getId(), validCreateOrUpdateCouponRequest()).getCoupon());
        }
    }

    @Test
    void shouldListCouponsWithoutFilters() throws IOException, ApiException {
        List<Coupon> listedCoupons  = COUPONS_CONTROLLER.listCoupons(new ListCouponsInput())
                .stream().map(CouponResponse::getCoupon).toList();
        // can't narrow down to specific coupons when listing without filters so just asserting response is not empty
        assertThat(listedCoupons).isNotEmpty();
    }

    @Test
    void shouldListCouponsWithDatetimeFilters() throws IOException, ApiException {
        List<Coupon> listedCoupons  = COUPONS_CONTROLLER.listCoupons(
                    new ListCouponsInput.Builder()
                            .filter(
                                    new ListCouponsFilter.Builder()
                                            .startDatetime(testStart)
                                            .dateField(BasicDateField.CREATED_AT)
                                            .build()
                            ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(10);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons);
    }

    @Test
    void shouldListCouponsWithIdFilters() throws IOException, ApiException {
        List<Coupon> couponsToFind = coupons.subList(2,8);
        List<Coupon> listedCoupons  = COUPONS_CONTROLLER.listCoupons(
                        new ListCouponsInput.Builder()
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .ids(couponsToFind.stream().map(Coupon::getId).toList())
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(6);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(couponsToFind);
    }

    @Test
    void shouldListCouponsWithCodeFilters() throws IOException, ApiException {
        List<Coupon> couponsToFind = coupons.subList(5,9);
        List<Coupon> listedCoupons  = COUPONS_CONTROLLER.listCoupons(
                        new ListCouponsInput.Builder()
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .codes(couponsToFind.stream().map(Coupon::getCode).toList())
                                                .build()
                                ).build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(4);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(couponsToFind);
    }

    @Test
    void shouldListAllCouponsWithPaging() throws IOException, ApiException {
        // when
        List<Coupon> allResponses = new ArrayList<>();
        List<Coupon> firstPage = listCouponsWithPaging(1, 4);
        List<Coupon> secondPage = listCouponsWithPaging(2, 4);
        List<Coupon> thirdPage = listCouponsWithPaging(3, 4);
        List<Coupon> fourthPage = listCouponsWithPaging(4, 4);

        allResponses.addAll(firstPage);
        allResponses.addAll(secondPage);
        allResponses.addAll(thirdPage);


        // then
        assertThat(firstPage).hasSize(4);
        assertThat(secondPage).hasSize(4);
        assertThat(thirdPage).hasSize(2);
        assertThat(fourthPage).isEmpty();

        assertThat(allResponses)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons);
    }

    private List<Coupon> listCouponsWithPaging(int page, int perPage) throws IOException, ApiException {
        return COUPONS_CONTROLLER.listCoupons(
                        new ListCouponsInput.Builder()
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .startDatetime(testStart)
                                                .dateField(BasicDateField.CREATED_AT)
                                                .build()
                                )
                                .page(page)
                                .perPage(perPage)
                                .build()
                )
                .stream().map(CouponResponse::getCoupon).toList();
    }

    @Test
    void shouldListCouponsWithCurrencyPrices() throws IOException, ApiException {
        List<Coupon> listedCoupons  = COUPONS_CONTROLLER.listCoupons(
                        new ListCouponsInput.Builder()
                                .filter(
                                        new ListCouponsFilter.Builder()
                                                .startDatetime(testStart)
                                                .dateField(BasicDateField.CREATED_AT)
                                                .build())
                                .currencyPrices(true)
                                .build()
                )
                .stream().map(CouponResponse::getCoupon).toList();

        assertThat(listedCoupons).hasSize(10);
        assertThat(listedCoupons).usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(coupons);
    }

    @Test
    void shouldNotListCouponsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getCouponsController().listCoupons(new ListCouponsInput())
        );
    }

}
