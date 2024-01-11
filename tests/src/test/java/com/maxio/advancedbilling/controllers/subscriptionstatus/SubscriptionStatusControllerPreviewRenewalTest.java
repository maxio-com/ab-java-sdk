package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.LineItemKind;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import com.maxio.advancedbilling.models.RenewalPreview;
import com.maxio.advancedbilling.models.RenewalPreviewComponent;
import com.maxio.advancedbilling.models.RenewalPreviewLineItem;
import com.maxio.advancedbilling.models.RenewalPreviewRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentComponentId;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentPricePointId;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerPreviewRenewalTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldPreviewRenewal() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        TestSetup testSetup = new TestSetup();
        Component component1 = testSetup.createQuantityBasedComponent(productFamilyId);
        Component component2 = testSetup.createQuantityBasedComponent(productFamilyId);
        ComponentPricePoint component2CatalogPricePoint = testSetup
                .createPricePointForComponent(component2.getId(), 5.0);

        Component component3 = testSetup.createQuantityBasedComponent(productFamilyId);
        ComponentPricePoint component3CatalogPricePoint = testSetup
                .createPricePointForComponent(component3.getId(), 8.0);

        // when
        RenewalPreview renewalPreview = subscriptionStatusController.previewRenewal(subscription.getId(),
                new RenewalPreviewRequest(
                        List.of(
                                new RenewalPreviewComponent(
                                        RenewalPreviewComponentComponentId.fromNumber(component1.getId()),
                                        10000,
                                        null
                                ),
                                new RenewalPreviewComponent(
                                        RenewalPreviewComponentComponentId.fromString("handle:" + component2.getHandle()),
                                        10000,
                                        RenewalPreviewComponentPricePointId.fromNumber(component2CatalogPricePoint.getId())
                                ),
                                new RenewalPreviewComponent(
                                        RenewalPreviewComponentComponentId.fromNumber(component3.getId()),
                                        100,
                                        RenewalPreviewComponentPricePointId.fromString("handle:" + component3CatalogPricePoint.getHandle())
                                )
                        )
                )).getRenewalPreview();
        long expectedProductPrice = product.getPriceInCents();
        long expectedComponent1Price = 10000 * 100;
        long expectedComponent2Price = 5 * 10000 * 100;
        long expectedComponent3Price = 8 * 100 * 100;
        long expectedTotalPrice = expectedProductPrice + expectedComponent1Price + expectedComponent2Price + expectedComponent3Price;

        // then
        assertThat(renewalPreview.getNextAssessmentAt()).isNotNull();
        assertThat(renewalPreview.getTotalTaxInCents()).isZero();
        assertThat(renewalPreview.getTotalDiscountInCents()).isZero();
        assertThat(renewalPreview.getExistingBalanceInCents()).isZero();
        assertThat(renewalPreview.getTotalInCents()).isEqualTo(expectedTotalPrice);
        assertThat(renewalPreview.getTotalAmountDueInCents()).isEqualTo(expectedTotalPrice);
        assertThat(renewalPreview.getSubtotalInCents()).isEqualTo(expectedTotalPrice);
        assertThat(renewalPreview.getUncalculatedTaxes()).isFalse();
        assertThat(renewalPreview.getLineItems())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("memo", "periodRangeStart", "periodRangeEnd")
                .containsExactlyInAnyOrder(
                        new RenewalPreviewLineItem.Builder()
                                .transactionType(LineItemTransactionType.CHARGE)
                                .kind(LineItemKind.BASELINE)
                                .amountInCents(product.getPriceInCents())
                                .discountAmountInCents(0L)
                                .taxableAmountInCents(0L)
                                .productId(product.getId())
                                .productName(product.getName())
                                .productHandle(product.getHandle())
                                .build(),
                        new RenewalPreviewLineItem.Builder()
                                .transactionType(LineItemTransactionType.CHARGE)
                                .kind(LineItemKind.QUANTITY_BASED_COMPONENT)
                                .amountInCents(expectedComponent1Price)
                                .discountAmountInCents(0L)
                                .taxableAmountInCents(0L)
                                .componentId(component1.getId())
                                .componentName(component1.getName())
                                .componentHandle(component1.getHandle())
                                .build(),
                        new RenewalPreviewLineItem.Builder()
                                .transactionType(LineItemTransactionType.CHARGE)
                                .kind(LineItemKind.QUANTITY_BASED_COMPONENT)
                                .amountInCents(expectedComponent2Price)
                                .discountAmountInCents(0L)
                                .taxableAmountInCents(0L)
                                .componentId(component2.getId())
                                .componentName(component2.getName())
                                .componentHandle(component2.getHandle())
                                .build(),
                        new RenewalPreviewLineItem.Builder()
                                .transactionType(LineItemTransactionType.CHARGE)
                                .kind(LineItemKind.QUANTITY_BASED_COMPONENT)
                                .amountInCents(expectedComponent3Price)
                                .discountAmountInCents(0L)
                                .taxableAmountInCents(0L)
                                .componentId(component3.getId())
                                .componentName(component3.getName())
                                .componentHandle(component3.getHandle())
                                .build()
                );
    }

    @Test
    void shouldNotPreviewRenewalForNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.previewRenewal(5, new RenewalPreviewRequest()));
    }

    @Test
    void shouldNotPreviewRenewalWhenComponentDoesNotExist() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        new TestSetup().createQuantityBasedComponent(productFamilyId);
        RenewalPreviewRequest request = new RenewalPreviewRequest(
                List.of(
                        new RenewalPreviewComponent(
                                RenewalPreviewComponentComponentId.fromNumber(12),
                                10000,
                                null
                        )
                ));

        // when-then
        assertThatErrorListResponse(() -> subscriptionStatusController.previewRenewal(subscription.getId(), request))
                .isUnprocessableEntity()
                .hasErrors("Couldn't find Component by 12");
    }

    @Test
    void shouldNotPreviewRenewalWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionStatusController()
                .previewRenewal(subscription.getId(),
                        new RenewalPreviewRequest()));
    }

}
