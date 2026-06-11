
# Event Event Specific Data

## Class Name

`EventEventSpecificData`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`SubscriptionProductChange`](../../../doc/models/subscription-product-change.md) | EventEventSpecificData.fromSubscriptionProductChange(SubscriptionProductChange subscriptionProductChange) |
| [`SubscriptionStateChange`](../../../doc/models/subscription-state-change.md) | EventEventSpecificData.fromSubscriptionStateChange(SubscriptionStateChange subscriptionStateChange) |
| [`PaymentRelatedEvents`](../../../doc/models/payment-related-events.md) | EventEventSpecificData.fromPaymentRelatedEvents(PaymentRelatedEvents paymentRelatedEvents) |
| [`RefundSuccess`](../../../doc/models/refund-success.md) | EventEventSpecificData.fromRefundSuccess(RefundSuccess refundSuccess) |
| [`ComponentAllocationChange`](../../../doc/models/component-allocation-change.md) | EventEventSpecificData.fromComponentAllocationChange(ComponentAllocationChange componentAllocationChange) |
| [`MeteredUsage`](../../../doc/models/metered-usage.md) | EventEventSpecificData.fromMeteredUsage(MeteredUsage meteredUsage) |
| [`PrepaidUsage`](../../../doc/models/prepaid-usage.md) | EventEventSpecificData.fromPrepaidUsage(PrepaidUsage prepaidUsage) |
| [`DunningStepReached`](../../../doc/models/dunning-step-reached.md) | EventEventSpecificData.fromDunningStepReached(DunningStepReached dunningStepReached) |
| [`InvoiceIssued`](../../../doc/models/invoice-issued.md) | EventEventSpecificData.fromInvoiceIssued(InvoiceIssued invoiceIssued) |
| [`PendingCancellationChange`](../../../doc/models/pending-cancellation-change.md) | EventEventSpecificData.fromPendingCancellationChange(PendingCancellationChange pendingCancellationChange) |
| [`PrepaidSubscriptionBalanceChanged`](../../../doc/models/prepaid-subscription-balance-changed.md) | EventEventSpecificData.fromPrepaidSubscriptionBalanceChanged(PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged) |
| [`ProformaInvoiceIssued`](../../../doc/models/proforma-invoice-issued.md) | EventEventSpecificData.fromProformaInvoiceIssued(ProformaInvoiceIssued proformaInvoiceIssued) |
| [`SubscriptionGroupSignupEventData`](../../../doc/models/subscription-group-signup-event-data.md) | EventEventSpecificData.fromSubscriptionGroupSignupEventData(SubscriptionGroupSignupEventData subscriptionGroupSignupEventData) |
| [`CreditAccountBalanceChanged`](../../../doc/models/credit-account-balance-changed.md) | EventEventSpecificData.fromCreditAccountBalanceChanged(CreditAccountBalanceChanged creditAccountBalanceChanged) |
| [`PrepaymentAccountBalanceChanged`](../../../doc/models/prepayment-account-balance-changed.md) | EventEventSpecificData.fromPrepaymentAccountBalanceChanged(PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged) |
| [`PaymentCollectionMethodChanged`](../../../doc/models/payment-collection-method-changed.md) | EventEventSpecificData.fromPaymentCollectionMethodChanged(PaymentCollectionMethodChanged paymentCollectionMethodChanged) |
| [`ItemPricePointChanged`](../../../doc/models/item-price-point-changed.md) | EventEventSpecificData.fromItemPricePointChanged(ItemPricePointChanged itemPricePointChanged) |
| [`CustomFieldValueChange`](../../../doc/models/custom-field-value-change.md) | EventEventSpecificData.fromCustomFieldValueChange(CustomFieldValueChange customFieldValueChange) |
| [`ChjsTokenizationSuccess`](../../../doc/models/chjs-tokenization-success.md) | EventEventSpecificData.fromChjsTokenizationSuccess(ChjsTokenizationSuccess chjsTokenizationSuccess) |
| [`ChjsTokenizationFailure`](../../../doc/models/chjs-tokenization-failure.md) | EventEventSpecificData.fromChjsTokenizationFailure(ChjsTokenizationFailure chjsTokenizationFailure) |

## SubscriptionProductChange

### Initialization Code

#### Example

```java
EventEventSpecificData.fromSubscriptionProductChange(
        new SubscriptionProductChange.Builder(
            126,
            12
        )
        .build()
    )
```

## SubscriptionStateChange

### Initialization Code

#### Example

```java
EventEventSpecificData.fromSubscriptionStateChange(
        new SubscriptionStateChange.Builder(
            "previous_subscription_state2",
            "new_subscription_state6"
        )
        .build()
    )
```

## PaymentRelatedEvents

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPaymentRelatedEvents(
        new PaymentRelatedEvents.Builder(
            42,
            58
        )
        .build()
    )
```

## RefundSuccess

### Initialization Code

#### Example

```java
EventEventSpecificData.fromRefundSuccess(
        new RefundSuccess.Builder(
            12,
            182,
            168
        )
        .build()
    )
```

## ComponentAllocationChange

### Initialization Code

#### Example

```java
EventEventSpecificData.fromComponentAllocationChange(
        new ComponentAllocationChange.Builder(
            94,
            102,
            88,
            "component_handle8",
            "memo2",
            158
        )
        .build()
    )
```

## MeteredUsage

### Initialization Code

#### Example

```java
EventEventSpecificData.fromMeteredUsage(
        new MeteredUsage.Builder(
            "previous_unit_balance6",
            80,
            42,
            4,
            "component_handle8",
            "memo2"
        )
        .build()
    )
```

## PrepaidUsage

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPrepaidUsage(
        new PrepaidUsage.Builder(
            "previous_unit_balance0",
            "previous_overage_unit_balance4",
            252,
            224,
            214,
            106,
            176,
            "component_handle4",
            "memo8",
            Arrays.asList(
                new PrepaidUsageAllocationDetail.Builder()
                    .build()
            )
        )
        .build()
    )
```

## DunningStepReached

### Initialization Code

#### Example

```java
EventEventSpecificData.fromDunningStepReached(
        new DunningStepReached.Builder(
            new DunnerData.Builder(
                "state8",
                194,
                98L,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                42,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
            )
            .build(),
            new DunningStepData.Builder(
                198,
                "action4",
                false,
                false,
                false
            )
            .build(),
            new DunningStepData.Builder(
                30,
                "action4",
                false,
                false,
                false
            )
            .build()
        )
        .build()
    )
```

## InvoiceIssued

### Initialization Code

#### Example

```java
EventEventSpecificData.fromInvoiceIssued(
        new InvoiceIssued.Builder(
            "uid4",
            "number8",
            "role2",
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            "issue_date0",
            "paid_date6",
            "due_amount6",
            "paid_amount4",
            "tax_amount2",
            "refund_amount0",
            "total_amount0",
            "status_amount4",
            "product_name0",
            "consolidation_level4",
            Arrays.asList(
                new InvoiceLineItemEventData.Builder()
                    .build()
            )
        )
        .build()
    )
```

## PendingCancellationChange

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPendingCancellationChange(
        new PendingCancellationChange.Builder(
            "cancellation_state8",
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
        )
        .build()
    )
```

## PrepaidSubscriptionBalanceChanged

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPrepaidSubscriptionBalanceChanged(
        new PrepaidSubscriptionBalanceChanged.Builder(
            "reason8",
            250L,
            44L,
            242L
        )
        .build()
    )
```

## ProformaInvoiceIssued

### Initialization Code

#### Example

```java
EventEventSpecificData.fromProformaInvoiceIssued(
        new ProformaInvoiceIssued.Builder(
            "uid0",
            "number2",
            "role6",
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "due_amount2",
            "paid_amount8",
            "tax_amount6",
            "total_amount6",
            "product_name6",
            Arrays.asList(
                new InvoiceLineItemEventData.Builder()
                    .build()
            )
        )
        .build()
    )
```

## SubscriptionGroupSignupEventData

### Initialization Code

#### Example

```java
EventEventSpecificData.fromSubscriptionGroupSignupEventData(
        new SubscriptionGroupSignupEventData.Builder(
            new SubscriptionGroupSignupFailureData.Builder()
                .build(),
            new Customer.Builder()
                .build()
        )
        .build()
    )
```

## CreditAccountBalanceChanged

### Initialization Code

#### Example

```java
EventEventSpecificData.fromCreditAccountBalanceChanged(
        new CreditAccountBalanceChanged.Builder(
            "reason8",
            10L,
            116L,
            "currency_code8",
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
        )
        .build()
    )
```

## PrepaymentAccountBalanceChanged

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPrepaymentAccountBalanceChanged(
        new PrepaymentAccountBalanceChanged.Builder(
            "reason4",
            182L,
            206L,
            "currency_code4"
        )
        .build()
    )
```

## PaymentCollectionMethodChanged

### Initialization Code

#### Example

```java
EventEventSpecificData.fromPaymentCollectionMethodChanged(
        new PaymentCollectionMethodChanged.Builder(
            "previous_value4",
            "current_value2"
        )
        .build()
    )
```

## ItemPricePointChanged

### Initialization Code

#### Example

```java
EventEventSpecificData.fromItemPricePointChanged(
        new ItemPricePointChanged.Builder(
            66,
            "item_type6",
            "item_handle4",
            "item_name8",
            new ItemPricePointData.Builder()
                .build(),
            new ItemPricePointData.Builder()
                .build()
        )
        .build()
    )
```

## CustomFieldValueChange

### Initialization Code

#### Example

```java
EventEventSpecificData.fromCustomFieldValueChange(
        new CustomFieldValueChange.Builder(
            "event_type2",
            "metafield_name6",
            78,
            "old_value2",
            "new_value8",
            "resource_type2",
            74
        )
        .build()
    )
```

## ChjsTokenizationSuccess

### Initialization Code

#### Example

```java
EventEventSpecificData.fromChjsTokenizationSuccess(
        new ChjsTokenizationSuccess.Builder(
            new PaymentProfile.Builder(
                44
            )
            .build()
        )
        .build()
    )
```

## ChjsTokenizationFailure

### Initialization Code

#### Example

```java
EventEventSpecificData.fromChjsTokenizationFailure(
        new ChjsTokenizationFailure.Builder(
            "errors2"
        )
        .build()
    )
```

