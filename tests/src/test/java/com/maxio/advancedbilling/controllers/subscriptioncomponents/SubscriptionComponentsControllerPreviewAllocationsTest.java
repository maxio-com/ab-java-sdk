package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ComponentAllocationErrorException;
import com.maxio.advancedbilling.models.AllocationPreview;
import com.maxio.advancedbilling.models.AllocationPreviewDirection;
import com.maxio.advancedbilling.models.AllocationPreviewItem;
import com.maxio.advancedbilling.models.AllocationPreviewLineItem;
import com.maxio.advancedbilling.models.AllocationPreviewLineItemKind;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentAllocationErrorItem;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import com.maxio.advancedbilling.models.PreviewAllocationsRequest;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.AllocationPreviewItemPreviousQuantityGetter;
import com.maxio.advancedbilling.utils.matchers.AllocationPreviewItemQuantityGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionComponentsControllerPreviewAllocationsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static Component quantityBasedComponent;
    private static Component onOffComponent;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                b -> b.allowFractionalQuantities(true));
        onOffComponent = TEST_SETUP.createOnOffComponent(productFamily.getId());

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldPreviewComponentsAllocations() throws IOException, ApiException {
        // given
        CreateAllocation createQuantityAllocation = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(2.3)
                .memo("Quantity component allocation")
                .build();
        CreateAllocation createOnOffAllocation = new CreateAllocation.Builder()
                .componentId(onOffComponent.getId())
                .quantity(1)
                .memo("On/Off component allocation")
                .build();
        PreviewAllocationsRequest previewAllocationsRequest = new PreviewAllocationsRequest.Builder()
                .allocations(List.of(createQuantityAllocation, createOnOffAllocation))
                .build();

        // when
        AllocationPreview allocationPreview = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .previewAllocations(subscription.getId(), previewAllocationsRequest)
                .getAllocationPreview();
        Map<Integer, AllocationPreviewItem> allocationPreviewItemMap = allocationPreview
                .getAllocations()
                .stream()
                .collect(Collectors.toMap(AllocationPreviewItem::getComponentId, Function.identity()));
        Map<Integer, AllocationPreviewLineItem> allocationPreviewLineItemMap = allocationPreview
                .getLineItems()
                .stream()
                .collect(Collectors.toMap(AllocationPreviewLineItem::getComponentId, Function.identity()));

        // then
        assertThat(allocationPreview.getAccrueCharge()).isTrue();
        assertThat(allocationPreview.getStartDate()).isNotNull();
        assertThat(allocationPreview.getEndDate()).isNotNull();
        assertThat(allocationPreview.getPeriodType()).isEqualTo("prorated");
        assertThat(allocationPreview.getTotalInCents()).isGreaterThan(0);
        assertThat(allocationPreview.getTotalDiscountInCents()).isZero();
        assertThat(allocationPreview.getTotalTaxInCents()).isZero();
        assertThat(allocationPreview.getSubtotalInCents()).isGreaterThan(0);
        assertThat(allocationPreview.getExistingBalanceInCents()).isZero();
        assertThat(allocationPreview.getDirection()).isEqualTo(AllocationPreviewDirection.UPGRADE);
        assertThat(allocationPreview.getProrationScheme()).isEqualTo("prorate-delay-capture");

        assertLineItem(allocationPreviewLineItemMap.get(quantityBasedComponent.getId()),
                quantityBasedComponent, createQuantityAllocation);
        assertLineItem(allocationPreviewLineItemMap.get(onOffComponent.getId()),
                onOffComponent, createOnOffAllocation);

        assertAllocation(allocationPreviewItemMap.get(quantityBasedComponent.getId()),
                quantityBasedComponent, createQuantityAllocation);
        assertAllocation(allocationPreviewItemMap.get(onOffComponent.getId()),
                onOffComponent, createOnOffAllocation);
    }

    @Test
    void shouldNotPreviewNonExistentComponentsAllocation() {
        // given
        CreateAllocation createQuantityAllocation = new CreateAllocation.Builder()
                .componentId(123)
                .quantity(2)
                .build();
        PreviewAllocationsRequest previewAllocationsRequest = new PreviewAllocationsRequest.Builder()
                .allocations(List.of(createQuantityAllocation))
                .build();

        // when-then
        assertUnprocessableEntity(
                ComponentAllocationErrorException.class,
                () -> SUBSCRIPTION_COMPONENTS_CONTROLLER.previewAllocations(subscription.getId(), previewAllocationsRequest),
                e ->
                        assertThat(e.getErrors()).usingRecursiveFieldByFieldElementComparator().containsExactlyInAnyOrder(
                                new ComponentAllocationErrorItem(123, "Component: could not be found.",
                                        "allocation", "component_id")
                        )
        );
    }

    @Test
    void shouldNotPreviewAllocationsWhenSubscriptionDoesNotExist() {
        // given
        CreateAllocation createQuantityAllocation = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(2)
                .build();
        PreviewAllocationsRequest previewAllocationsRequest = new PreviewAllocationsRequest.Builder()
                .allocations(List.of(createQuantityAllocation))
                .build();

        // when-then
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                        .previewAllocations(123, previewAllocationsRequest));
    }

    @Test
    void shouldNotPreviewAllocationsWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .previewAllocations(subscription.getId(), null));
    }

    void assertLineItem(AllocationPreviewLineItem lineItem, Component component, CreateAllocation createAllocation) {
        assertThat(lineItem.getComponentId()).isEqualTo(component.getId());
        assertThat(lineItem.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(lineItem.getTransactionType()).isEqualTo(LineItemTransactionType.CHARGE);
        assertThat(lineItem.getKind().value()).isEqualTo(component.getKind().value());
        assertThat(lineItem.getMemo()).isEqualTo(getMemo(lineItem, component, createAllocation));
        assertThat(lineItem.getDiscountAmountInCents()).isZero();
        assertThat(lineItem.getAmountInCents()).isGreaterThan(0);
        assertThat(lineItem.getTaxableAmountInCents()).isZero();
    }

    String getMemo(AllocationPreviewLineItem lineItem, Component component, CreateAllocation createAllocation) {
        if (lineItem.getKind() == AllocationPreviewLineItemKind.QUANTITY_BASED_COMPONENT) {
            return "%s: 0.0 to %s %ss".formatted(component.getName(), createAllocation.getQuantity(), component.getUnitName());
        } else if (lineItem.getKind() == AllocationPreviewLineItemKind.ON_OFF_COMPONENT) {
            return component.getName() + ": enabled";
        }
        return null;
    }

    void assertAllocation(AllocationPreviewItem allocationItem, Component component, CreateAllocation createAllocation) {
        assertThat(allocationItem.getComponentId()).isEqualTo(component.getId());
        assertThat(allocationItem.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(allocationItem.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(allocationItem.getMemo()).isEqualTo(createAllocation.getMemo());
        assertThat(allocationItem.getTimestamp()).isNull();
        assertThat(allocationItem.getProrationUpgradeScheme()).isEqualTo("prorate-delay-capture");
        assertThat(allocationItem.getProrationDowngradeScheme()).isEqualTo("no-prorate");
        assertThat(allocationItem.getPricePointId()).isEqualTo(component.getDefaultPricePointId());
        assertThat(allocationItem.getPricePointHandle()).isNotNull();
        assertThat(allocationItem.getPricePointName()).isEqualTo(component.getDefaultPricePointName());
        assertThat(allocationItem.getPreviousPricePointId()).isEqualTo(component.getDefaultPricePointId());
        assertThat(allocationItem.getAccrueCharge()).isTrue();
        assertThat(allocationItem.getUpgradeCharge()).isEqualTo(CreditType.PRORATED);
        assertThat(allocationItem.getDowngradeCredit()).isEqualTo(CreditType.NONE);

        if (component.getAllowFractionalQuantities()) {
            assertThat(allocationItem.getQuantity()
                    .match(new AllocationPreviewItemQuantityGetter<String>()))
                    .isEqualTo(String.valueOf(createAllocation.getQuantity()));
            assertThat(allocationItem.getPreviousQuantity()
                    .match(new AllocationPreviewItemPreviousQuantityGetter<String>())).isEqualTo("0.0");

        } else {
            assertThat(allocationItem.getQuantity()
                    .match(new AllocationPreviewItemQuantityGetter<Integer>()))
                    .isEqualTo((int)createAllocation.getQuantity());
            assertThat(allocationItem.getPreviousQuantity()
                    .match(new AllocationPreviewItemPreviousQuantityGetter<Integer>())).isEqualTo(0);
        }
    }

}
