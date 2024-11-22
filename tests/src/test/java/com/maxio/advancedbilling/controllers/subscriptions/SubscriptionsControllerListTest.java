package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListSubscriptionsInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionDateField;
import com.maxio.advancedbilling.models.SubscriptionListInclude;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.SubscriptionSort;
import com.maxio.advancedbilling.models.SubscriptionStateFilter;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionsControllerListTest {
    private static final String[] IGNORED_FIELDS = {"createdAt", "updatedAt", "cancelledAt"};
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();
    private static final List<Subscription> ALL_SUBSCRIPTIONS = new ArrayList<>();
    private static final ZonedDateTime FIRST_NEXT_BILLING_AT = currentDayMidnight()
            .withZoneSameLocal(ZoneId.of("US/Eastern")).plusDays(15).plusHours(8).plusMinutes(53);
    private static final ZonedDateTime FIRST_PREVIOUS_BILLING_AT = FIRST_NEXT_BILLING_AT.minusDays(30);

    private static ProductFamily PRODUCT_FAMILY;
    private static Product PRODUCT1;
    private static Product PRODUCT2;
    private static Customer CUSTOMER1;
    private static Customer CUSTOMER2;
    private static ProductPricePoint CUSTOM_PRICE_POINT1;
    private static ProductPricePoint CUSTOM_PRICE_POINT2;
    private static Coupon COUPON1;
    private static Coupon COUPON2;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        new TestTeardown().deleteSubscriptions();

        PRODUCT_FAMILY = TEST_SETUP.createProductFamily();
        PRODUCT1 = TEST_SETUP.createProduct(PRODUCT_FAMILY);
        PRODUCT2 = TEST_SETUP.createProduct(PRODUCT_FAMILY);
        CUSTOMER1 = TEST_SETUP.createCustomer();
        CUSTOMER2 = TEST_SETUP.createCustomer();
        CUSTOM_PRICE_POINT1 = TEST_SETUP.createProductPricePoint(PRODUCT1, "customPricePoint1");
        CUSTOM_PRICE_POINT2 = TEST_SETUP.createProductPricePoint(PRODUCT1, "customPricePoint2");
        COUPON1 = TEST_SETUP.createPercentageCoupon(PRODUCT_FAMILY, "0.5");
        COUPON2 = TEST_SETUP.createPercentageCoupon(PRODUCT_FAMILY, "0.1");

        // 0
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER1, PRODUCT1, b -> b
                .couponCodes(List.of(COUPON1.getCode(), COUPON2.getCode()))
                .metafields(Map.of("customer", "premium"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT)
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT)
        ));
        // 1
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER2, PRODUCT1, b -> b
                .metafields(Map.of("customer", "standard"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(8))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(8))
        ));
        Subscription cancelled = TEST_SETUP.createSubscription(CUSTOMER1, PRODUCT1, b -> b
                .couponCode(COUPON2.getCode())
                .metafields(Map.of("customer", "premium", "support", "standard"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(16))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(16))
        );
        cancelled = CLIENT.getSubscriptionStatusController()
                .cancelSubscription(cancelled.getId(), new CancellationRequest(new CancellationOptions.Builder()
                        .cancellationMessage("Cancelled for test")
                        .build()))
                .getSubscription();
        // 2
        ALL_SUBSCRIPTIONS.add(cancelled);

        // 3
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER1, PRODUCT1, b -> b
                .productPricePointId(CUSTOM_PRICE_POINT1.getId())
                .metafields(Map.of("customer", "premium", "support", "prestige"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(24))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(24))
        ));
        // 4
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER1, PRODUCT1, b -> b
                .productPricePointId(CUSTOM_PRICE_POINT2.getId())
                .couponCode(COUPON1.getCode())
                .metafields(Map.of("customer", "standard", "support", "prestige"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(32))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(32))
        ));
        // 5
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER2, PRODUCT1, b -> b
                .productPricePointId(CUSTOM_PRICE_POINT1.getId())
                .metafields(Map.of("customer", "basic"))
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(40))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(40))
        ));
        // 6
        ALL_SUBSCRIPTIONS.add(TEST_SETUP.createSubscription(CUSTOMER2, PRODUCT2, b -> b
                .nextBillingAt(FIRST_NEXT_BILLING_AT.plusHours(48))
                .previousBillingAt(FIRST_PREVIOUS_BILLING_AT.plusHours(48))
        ));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteCustomer(CUSTOMER1);
        testTeardown.deleteCustomer(CUSTOMER2);
    }

    private static ZonedDateTime currentDayMidnight() {
        return ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS);
    }

    @Test
    void shouldReturnAllSubscriptions() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> subscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .build());

        // then
        assertThat(subscriptions)
                .isNotNull()
                .extracting(SubscriptionResponse::getSubscription)
                .hasSize(7)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrderElementsOf(ALL_SUBSCRIPTIONS);

        assertThat(subscriptions)
                .extracting(SubscriptionResponse::getSubscription)
                .extracting(Subscription::getSelfServicePageToken)
                .containsOnlyNulls();
    }

    @Test
    void shouldIncludeSelfServicePageToken() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> subscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .include(List.of(SubscriptionListInclude.SELF_SERVICE_PAGE_TOKEN))
                        .build());

        // then
        assertThat(subscriptions)
                .extracting(SubscriptionResponse::getSubscription)
                .extracting(Subscription::getSelfServicePageToken)
                .doesNotContainNull();
    }

    @Test
    void shouldFilterBySubscriptionState() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> activeSubscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .state(SubscriptionStateFilter.ACTIVE)
                        .build());
        List<SubscriptionResponse> cancelledSubscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .state(SubscriptionStateFilter.CANCELED)
                        .build());
        List<SubscriptionResponse> onHoldSubscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .state(SubscriptionStateFilter.ON_HOLD)
                        .build());
        // then
        List<Subscription> expectedActiveSubscriptions = new ArrayList<>(ALL_SUBSCRIPTIONS);
        expectedActiveSubscriptions.remove(2);
        Subscription expectedCancelledSubscription = ALL_SUBSCRIPTIONS.get(2);

        assertThat(activeSubscriptions)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .isNotNull()
                .hasSize(6)
                .containsExactlyInAnyOrderElementsOf(expectedActiveSubscriptions);
        assertThat(cancelledSubscriptions)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .isNotNull()
                .hasSize(1)
                .containsExactly(expectedCancelledSubscription);
        assertThat(onHoldSubscriptions)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterBySubscriptionProduct() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> subscriptionsWithProduct1 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .product(PRODUCT1.getId())
                        .build());
        List<SubscriptionResponse> subscriptionsWithProduct2 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .product(PRODUCT2.getId())
                        .build());

        // then
        assertThat(subscriptionsWithProduct1)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .isNotNull()
                .hasSize(6)
                .containsExactlyInAnyOrderElementsOf(ALL_SUBSCRIPTIONS.subList(0, 6));
        assertThat(subscriptionsWithProduct2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .isNotNull()
                .hasSize(1)
                .containsExactly(ALL_SUBSCRIPTIONS.get(6));
    }

    @Test
    void shouldFilterBySubscriptionProductPricePoint() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> subscriptionsWithProductAndPricePoint1 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .product(PRODUCT1.getId())
                        .productPricePointId(CUSTOM_PRICE_POINT1.getId())
                        .build());
        List<SubscriptionResponse> subscriptionsWithPricePoint1 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .productPricePointId(CUSTOM_PRICE_POINT1.getId())
                        .build());
        List<SubscriptionResponse> subscriptionsWithPricePoint2 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .productPricePointId(CUSTOM_PRICE_POINT2.getId())
                        .build());
        // then
        assertThat(subscriptionsWithProductAndPricePoint1)
                .isNotNull()
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrderElementsOf(subscriptionsWithPricePoint1)
                .extracting(SubscriptionResponse::getSubscription)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(3), ALL_SUBSCRIPTIONS.get(5));

        assertThat(subscriptionsWithPricePoint2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .isNotNull()
                .hasSize(1)
                .containsExactly(ALL_SUBSCRIPTIONS.get(4));
    }

    @Test
    void shouldFilterByCoupon() throws IOException, ApiException {
        // given
        Coupon notAttachedCoupon = TEST_SETUP.createPercentageCoupon(PRODUCT_FAMILY, "0.1");

        // when
        List<SubscriptionResponse> subscriptionsWithCoupon1 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .coupon(COUPON1.getId())
                        .build());
        List<SubscriptionResponse> subscriptionsWithCoupon2 = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .coupon(COUPON2.getId())
                        .build());
        List<SubscriptionResponse> subscriptionsWithNoMatchingCoupon = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .coupon(notAttachedCoupon.getId())
                        .build());

        // then
        assertThat(subscriptionsWithCoupon1)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(0), ALL_SUBSCRIPTIONS.get(4));

        assertThat(subscriptionsWithCoupon2)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(0), ALL_SUBSCRIPTIONS.get(2));

        assertThat(subscriptionsWithNoMatchingCoupon)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterByMetadata() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> subscriptionsWithPremiumCustomer = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .metadata(Map.of("customer", "premium"))
                        .build());
        List<SubscriptionResponse> subscriptionsWithStandardCustomer = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .metadata(Map.of("customer", "standard"))
                        .build());
        List<SubscriptionResponse> subscriptionsWithPrestigeSupport = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .metadata(Map.of("support", "prestige"))
                        .build());
        List<SubscriptionResponse> subscriptionsWithPrestigeSupportAndPremiumCustomer = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .metadata(Map.of("support", "prestige",
                                "customer", "premium"))
                        .build());

        // then
        assertThat(subscriptionsWithPremiumCustomer)
                .isNotNull()
                .hasSize(3)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(0), ALL_SUBSCRIPTIONS.get(2), ALL_SUBSCRIPTIONS.get(3));

        assertThat(subscriptionsWithStandardCustomer)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(1), ALL_SUBSCRIPTIONS.get(4));

        assertThat(subscriptionsWithPrestigeSupport)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrder(ALL_SUBSCRIPTIONS.get(3), ALL_SUBSCRIPTIONS.get(4));

        assertThat(subscriptionsWithPrestigeSupportAndPremiumCustomer)
                .isNotNull()
                .hasSize(1)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactly(ALL_SUBSCRIPTIONS.get(3));
    }

    @Test
    void shouldSortAndPageResponse() throws IOException, ApiException {
        // when
        List<SubscriptionResponse> firstPageAsc = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .sort(SubscriptionSort.PERIOD_END)
                        .direction(SortingDirection.ASC)
                        .page(1)
                        .perPage(2)
                        .build());

        List<SubscriptionResponse> secondPageAsc = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .sort(SubscriptionSort.PERIOD_END)
                        .direction(SortingDirection.ASC)
                        .page(2)
                        .perPage(2)
                        .build());

        List<SubscriptionResponse> firstPageDesc = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(new ListSubscriptionsInput.Builder()
                        .sort(SubscriptionSort.PERIOD_END)
                        .direction(SortingDirection.DESC)
                        .page(1)
                        .perPage(2)
                        .build());

        // then
        assertThat(firstPageAsc)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyElementsOf(ALL_SUBSCRIPTIONS.subList(0, 2));

        assertThat(secondPageAsc)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyElementsOf(ALL_SUBSCRIPTIONS.subList(2, 4));

        assertThat(firstPageDesc)
                .isNotNull()
                .hasSize(2)
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyElementsOf(
                        List.of(
                                ALL_SUBSCRIPTIONS.get(ALL_SUBSCRIPTIONS.size() - 1),
                                ALL_SUBSCRIPTIONS.get(ALL_SUBSCRIPTIONS.size() - 2)
                        ));
    }

    @ParameterizedTest
    @MethodSource("argsForShouldFilterByDateField")
    void shouldFilterByDateField(ListSubscriptionsInput.Builder input, List<Subscription> expectedResult) throws IOException, ApiException {
        // when
        List<SubscriptionResponse> filteredSubscriptions = SUBSCRIPTIONS_CONTROLLER
                .listSubscriptions(input.build());

        // then
        assertThat(filteredSubscriptions)
                .isNotNull()
                .hasSize(expectedResult.size())
                .extracting(SubscriptionResponse::getSubscription)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields(IGNORED_FIELDS)
                .containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    private static Stream<Arguments> argsForShouldFilterByDateField() {
        return Stream.of(
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .startDate(FIRST_NEXT_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .endDate(FIRST_NEXT_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(0, 5)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .startDate(FIRST_NEXT_BILLING_AT.toLocalDate().plusDays(1))
                                .endDate(FIRST_NEXT_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, 5)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .startDatetime(FIRST_NEXT_BILLING_AT.plusHours(8)),
                        ALL_SUBSCRIPTIONS.subList(1, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .endDatetime(FIRST_NEXT_BILLING_AT.plusHours(16)),
                        ALL_SUBSCRIPTIONS.subList(0, 3)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_ENDS_AT)
                                .startDatetime(FIRST_NEXT_BILLING_AT.plusHours(8))
                                .endDatetime(FIRST_NEXT_BILLING_AT.plusHours(24)),
                        ALL_SUBSCRIPTIONS.subList(1, 4)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .startDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .endDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(0, 5)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .startDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1))
                                .endDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, 5)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .startDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(8)),
                        ALL_SUBSCRIPTIONS.subList(1, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .endDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(16)),
                        ALL_SUBSCRIPTIONS.subList(0, 3)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.ACTIVATED_AT)
                                .startDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(8))
                                .endDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(24)),
                        ALL_SUBSCRIPTIONS.subList(1, 4)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .startDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .endDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(0, 5)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .startDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1))
                                .endDate(FIRST_PREVIOUS_BILLING_AT.toLocalDate().plusDays(1)),
                        ALL_SUBSCRIPTIONS.subList(2, 5)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .startDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(8)),
                        ALL_SUBSCRIPTIONS.subList(1, ALL_SUBSCRIPTIONS.size())),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .endDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(16)),
                        ALL_SUBSCRIPTIONS.subList(0, 3)),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CURRENT_PERIOD_STARTS_AT)
                                .startDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(8))
                                .endDatetime(FIRST_PREVIOUS_BILLING_AT.plusHours(24)),
                        ALL_SUBSCRIPTIONS.subList(1, 4)
                ),

                Arguments.of(
                        dateFilter(SubscriptionDateField.CANCELED_AT)
                                .startDate(LocalDate.now())
                                .endDate(LocalDate.now()),
                        List.of(ALL_SUBSCRIPTIONS.get(2))
                ),
                Arguments.of(
                        dateFilter(SubscriptionDateField.CANCELED_AT)
                                .startDatetime(ZonedDateTime.now().minusMinutes(30))
                                .endDatetime(ZonedDateTime.now().plusMinutes(30)),
                        List.of(ALL_SUBSCRIPTIONS.get(2))
                )
        );
    }

    private static ListSubscriptionsInput.Builder dateFilter(SubscriptionDateField dateField) {
        return new ListSubscriptionsInput.Builder()
                .dateField(dateField);
    }
}
