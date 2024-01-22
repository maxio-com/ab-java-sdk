package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BillingManifest;
import com.maxio.advancedbilling.models.BillingManifestItem;
import com.maxio.advancedbilling.models.BillingManifestLineItemKind;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.SubscriptionPreview;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionsControllerPreviewTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static ProductFamily productFamily;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturnEmptyPreviewWhenRequestBodyIsNullOrMissing")
    void shouldReturnEmptyPreviewWhenRequestBodyIsNullOrMissing(CreateSubscriptionRequest body) throws IOException, ApiException {
        // when
        SubscriptionPreview subscriptionPreview = SUBSCRIPTIONS_CONTROLLER
                .previewSubscription(body).getSubscriptionPreview();

        // then
        assertSubscriptionPreviewIsEmpty(subscriptionPreview);
    }

    private static Stream<Arguments> argsForShouldReturnEmptyPreviewWhenRequestBodyIsNullOrMissing() {
        return Stream.of(
                Arguments.of((Object) null),
                Arguments.of(new CreateSubscriptionRequest())
        );
    }

    private void assertSubscriptionPreviewIsEmpty(SubscriptionPreview subscriptionPreview) {
        assertThat(subscriptionPreview).isNotNull();
        assertBillingManifestIsEmpty(subscriptionPreview.getCurrentBillingManifest());
        assertBillingManifestIsEmpty(subscriptionPreview.getNextBillingManifest());
    }

    private void assertBillingManifestIsEmpty(BillingManifest billingManifest) {
        assertThat(billingManifest).isNotNull();
        assertThat(billingManifest.getLineItems()).isEmpty();
        assertThat(billingManifest.getTotalInCents()).isEqualTo(0L);
        assertThat(billingManifest.getTotalDiscountInCents()).isEqualTo(0L);
        assertThat(billingManifest.getTotalTaxInCents()).isEqualTo(0L);
        assertThat(billingManifest.getSubtotalInCents()).isEqualTo(0L);
        assertThat(billingManifest.getStartDate()).isNull();
        assertThat(billingManifest.getEndDate()).isNull();
        assertThat(billingManifest.getPeriodType()).isNull();
        assertThat(billingManifest.getExistingBalanceInCents()).isEqualTo(0L);
    }

    @Test
    void shouldReturnPreview() throws IOException, ApiException {
        // given
        Product product = TEST_SETUP.createProduct(productFamily);
        Coupon percentageCoupon = TEST_SETUP.createPercentageCoupon(productFamily, "0.5");
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 10);
        ZonedDateTime now = ZonedDateTime.now();

        // when
        SubscriptionPreview subscriptionPreview = SUBSCRIPTIONS_CONTROLLER
                .previewSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productHandle(product.getHandle())
                                .customerId(customer.getId())
                                .couponCode(percentageCoupon.getCode())
                                .metafields(Map.of("customer", "premium"))
                                .components(List.of(
                                        new CreateSubscriptionComponent.Builder()
                                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(meteredComponent.getId()))
                                                .unitBalance(5)
                                                .build()
                                ))
                                .build()
                        )
                )
                .getSubscriptionPreview();

        // then
        assertThat(subscriptionPreview).isNotNull();

        BillingManifest currentBillingManifest = subscriptionPreview.getCurrentBillingManifest();
        assertThat(currentBillingManifest)
                .usingRecursiveComparison()
                .ignoringFields("startDate", "endDate")
                .isEqualTo(new BillingManifest.Builder()
                        .lineItems(List.of(
                                new BillingManifestItem.Builder()
                                        .transactionType(LineItemTransactionType.CHARGE)
                                        .kind(BillingManifestLineItemKind.BASELINE)
                                        .amountInCents(0L)
                                        .memo("%s (%s - %s)".formatted(
                                                product.getName(),
                                                formatZonedDateTime(now),
                                                formatZonedDateTime(now.plusMonths(1))
                                        ))
                                        .discountAmountInCents(0L)
                                        .taxableAmountInCents(0L)
                                        .periodRangeStart(formatZonedDateTime(now))
                                        .periodRangeEnd(formatZonedDateTime(now.plusMonths(1)))
                                        .productId(product.getId())
                                        .productHandle(product.getHandle())
                                        .productName(product.getName())
                                        .build(),
                                new BillingManifestItem.Builder()
                                        .transactionType(LineItemTransactionType.CHARGE)
                                        .kind(BillingManifestLineItemKind.COMPONENT)
                                        .amountInCents(5000L)
                                        .memo("%s: 5 units".formatted(meteredComponent.getName()))
                                        .discountAmountInCents(25L)
                                        .taxableAmountInCents(0L)
                                        .periodRangeStart(formatZonedDateTime(now))
                                        .periodRangeEnd(formatZonedDateTime(now))
                                        .componentId(meteredComponent.getId())
                                        .componentHandle(meteredComponent.getHandle())
                                        .componentName(meteredComponent.getName())
                                        .build(),
                                new BillingManifestItem.Builder()
                                        .transactionType(LineItemTransactionType.ADJUSTMENT)
                                        .kind(BillingManifestLineItemKind.COUPON)
                                        .amountInCents(-25L)
                                        .memo("Coupon: %s - %s".formatted(percentageCoupon.getCode(), percentageCoupon.getDescription()))
                                        .discountAmountInCents(0L)
                                        .taxableAmountInCents(0L)
                                        .periodRangeStart(null)
                                        .periodRangeEnd(null)
                                        .build()
                        ))
                        .totalInCents(4975L)
                        .totalDiscountInCents(25L)
                        .totalTaxInCents(0L)
                        .subtotalInCents(5000L)
                        .periodType("recurring")
                        .existingBalanceInCents(0L)
                        .build()
                );

        BillingManifest nextBillingManifest = subscriptionPreview.getNextBillingManifest();
        assertThat(nextBillingManifest)
                .usingRecursiveComparison()
                .ignoringFields("startDate", "endDate")
                .isEqualTo(new BillingManifest.Builder()
                        .lineItems(List.of(
                                new BillingManifestItem.Builder()
                                        .transactionType(LineItemTransactionType.CHARGE)
                                        .kind(BillingManifestLineItemKind.BASELINE)
                                        .amountInCents(0L)
                                        .memo("%s (%s - %s)".formatted(
                                                product.getName(),
                                                formatZonedDateTime(now.plusMonths(1)),
                                                formatZonedDateTime(now.plusMonths(2)))
                                        )
                                        .discountAmountInCents(0L)
                                        .taxableAmountInCents(0L)
                                        .periodRangeStart(formatZonedDateTime(now.plusMonths(1)))
                                        .periodRangeEnd(formatZonedDateTime(now.plusMonths(2)))
                                        .productId(product.getId())
                                        .productHandle(product.getHandle())
                                        .productName(product.getName())
                                        .build()
                        ))
                        .totalInCents(0L)
                        .totalDiscountInCents(0L)
                        .totalTaxInCents(0L)
                        .subtotalInCents(0L)
                        .periodType("recurring")
                        .existingBalanceInCents(0L)
                        .build()
                );
    }

    private String formatZonedDateTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime
                .truncatedTo(ChronoUnit.DAYS)
                .toLocalDate()
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
}
