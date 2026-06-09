
# Invoice Event

## Class Name

`InvoiceEvent`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`ApplyCreditNoteEvent`](../../../doc/models/apply-credit-note-event.md) | InvoiceEvent.fromApplyCreditNoteEvent(ApplyCreditNoteEvent applyCreditNoteEvent) |
| [`ApplyDebitNoteEvent`](../../../doc/models/apply-debit-note-event.md) | InvoiceEvent.fromApplyDebitNoteEvent(ApplyDebitNoteEvent applyDebitNoteEvent) |
| [`ApplyPaymentEvent`](../../../doc/models/apply-payment-event.md) | InvoiceEvent.fromApplyPaymentEvent(ApplyPaymentEvent applyPaymentEvent) |
| [`BackportInvoiceEvent`](../../../doc/models/backport-invoice-event.md) | InvoiceEvent.fromBackportInvoiceEvent(BackportInvoiceEvent backportInvoiceEvent) |
| [`ChangeChargebackStatusEvent`](../../../doc/models/change-chargeback-status-event.md) | InvoiceEvent.fromChangeChargebackStatusEvent(ChangeChargebackStatusEvent changeChargebackStatusEvent) |
| [`ChangeInvoiceCollectionMethodEvent`](../../../doc/models/change-invoice-collection-method-event.md) | InvoiceEvent.fromChangeInvoiceCollectionMethodEvent(ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent) |
| [`ChangeInvoiceStatusEvent`](../../../doc/models/change-invoice-status-event.md) | InvoiceEvent.fromChangeInvoiceStatusEvent(ChangeInvoiceStatusEvent changeInvoiceStatusEvent) |
| [`CreateCreditNoteEvent`](../../../doc/models/create-credit-note-event.md) | InvoiceEvent.fromCreateCreditNoteEvent(CreateCreditNoteEvent createCreditNoteEvent) |
| [`CreateDebitNoteEvent`](../../../doc/models/create-debit-note-event.md) | InvoiceEvent.fromCreateDebitNoteEvent(CreateDebitNoteEvent createDebitNoteEvent) |
| [`FailedPaymentEvent`](../../../doc/models/failed-payment-event.md) | InvoiceEvent.fromFailedPaymentEvent(FailedPaymentEvent failedPaymentEvent) |
| [`IssueInvoiceEvent`](../../../doc/models/issue-invoice-event.md) | InvoiceEvent.fromIssueInvoiceEvent(IssueInvoiceEvent issueInvoiceEvent) |
| [`RefundInvoiceEvent`](../../../doc/models/refund-invoice-event.md) | InvoiceEvent.fromRefundInvoiceEvent(RefundInvoiceEvent refundInvoiceEvent) |
| [`RemovePaymentEvent`](../../../doc/models/remove-payment-event.md) | InvoiceEvent.fromRemovePaymentEvent(RemovePaymentEvent removePaymentEvent) |
| [`VoidInvoiceEvent`](../../../doc/models/void-invoice-event.md) | InvoiceEvent.fromVoidInvoiceEvent(VoidInvoiceEvent voidInvoiceEvent) |
| [`VoidRemainderEvent`](../../../doc/models/void-remainder-event.md) | InvoiceEvent.fromVoidRemainderEvent(VoidRemainderEvent voidRemainderEvent) |

## ApplyCreditNoteEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromApplyCreditNoteEvent(
        new ApplyCreditNoteEvent.Builder(
            214L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.APPLY_CREDIT_NOTE,
            new ApplyCreditNoteEventData.Builder(
                "uid6",
                "credit_note_number0",
                "credit_note_uid0",
                "original_amount0",
                "applied_amount2"
            )
            .build()
        )
        .build()
    )
```

## ApplyDebitNoteEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromApplyDebitNoteEvent(
        new ApplyDebitNoteEvent.Builder(
            164L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.APPLY_DEBIT_NOTE,
            new ApplyDebitNoteEventData.Builder(
                "debit_note_number6",
                "debit_note_uid2",
                "original_amount0",
                "applied_amount2"
            )
            .build()
        )
        .build()
    )
```

## ApplyPaymentEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromApplyPaymentEvent(
        new ApplyPaymentEvent.Builder(
            234L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.APPLY_PAYMENT,
            new ApplyPaymentEventData.Builder(
                InvoiceConsolidationLevel.CHILD,
                "memo0",
                "original_amount0",
                "applied_amount2",
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                InvoiceEventPayment.fromPaymentMethodApplePay(
                    new PaymentMethodApplePay.Builder(
                        InvoiceEventPaymentMethod.APPLE_PAY
                    )
                    .build()
                )
            )
            .build()
        )
        .build()
    )
```

## BackportInvoiceEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromBackportInvoiceEvent(
        new BackportInvoiceEvent.Builder(
            78L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.BACKPORT_INVOICE,
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build()
        )
        .build()
    )
```

## ChangeChargebackStatusEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromChangeChargebackStatusEvent(
        new ChangeChargebackStatusEvent.Builder(
            214L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.CHANGE_CHARGEBACK_STATUS,
            new ChangeChargebackStatusEventData.Builder(
                ChargebackStatus.WON
            )
            .build()
        )
        .build()
    )
```

## ChangeInvoiceCollectionMethodEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromChangeInvoiceCollectionMethodEvent(
        new ChangeInvoiceCollectionMethodEvent.Builder(
            246L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.CHANGE_INVOICE_COLLECTION_METHOD,
            new ChangeInvoiceCollectionMethodEventData.Builder(
                "from_collection_method4",
                "to_collection_method8"
            )
            .build()
        )
        .build()
    )
```

## ChangeInvoiceStatusEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromChangeInvoiceStatusEvent(
        new ChangeInvoiceStatusEvent.Builder(
            92L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.CHANGE_INVOICE_STATUS,
            new ChangeInvoiceStatusEventData.Builder(
                InvoiceStatus.OPEN,
                InvoiceStatus.PENDING
            )
            .build()
        )
        .build()
    )
```

## CreateCreditNoteEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromCreateCreditNoteEvent(
        new CreateCreditNoteEvent.Builder(
            28L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.CREATE_CREDIT_NOTE,
            new CreditNote.Builder()
                .build()
        )
        .build()
    )
```

## CreateDebitNoteEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromCreateDebitNoteEvent(
        new CreateDebitNoteEvent.Builder(
            98L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.CREATE_DEBIT_NOTE,
            new DebitNote.Builder()
                .build()
        )
        .build()
    )
```

## FailedPaymentEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromFailedPaymentEvent(
        new FailedPaymentEvent.Builder(
            120L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.FAILED_PAYMENT,
            new FailedPaymentEventData.Builder(
                220,
                194,
                InvoicePaymentMethodType.CASH,
                78
            )
            .build()
        )
        .build()
    )
```

## IssueInvoiceEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromIssueInvoiceEvent(
        new IssueInvoiceEvent.Builder(
            130L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.ISSUE_INVOICE,
            new IssueInvoiceEventData.Builder(
                InvoiceConsolidationLevel.CHILD,
                InvoiceStatus.OPEN,
                InvoiceStatus.PENDING,
                "due_amount8",
                "total_amount2"
            )
            .build()
        )
        .build()
    )
```

## RefundInvoiceEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromRefundInvoiceEvent(
        new RefundInvoiceEvent.Builder(
            54L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.REFUND_INVOICE,
            new RefundInvoiceEventData.Builder(
                false,
                new CreditNote.Builder()
                    .build(),
                204,
                "refund_amount8",
                248,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
            )
            .build()
        )
        .build()
    )
```

## RemovePaymentEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromRemovePaymentEvent(
        new RemovePaymentEvent.Builder(
            236L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.REMOVE_PAYMENT,
            new RemovePaymentEventData.Builder(
                78,
                "memo0",
                "applied_amount2",
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                InvoiceEventPayment.fromPaymentMethodApplePay(
                    new PaymentMethodApplePay.Builder(
                        InvoiceEventPaymentMethod.APPLE_PAY
                    )
                    .build()
                ),
                false
            )
            .build()
        )
        .build()
    )
```

## VoidInvoiceEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromVoidInvoiceEvent(
        new VoidInvoiceEvent.Builder(
            16L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.VOID_INVOICE,
            new VoidInvoiceEventData.Builder(
                new CreditNote.Builder()
                    .build(),
                "memo0",
                "applied_amount2",
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                false,
                "reason2"
            )
            .build()
        )
        .build()
    )
```

## VoidRemainderEvent

### Initialization Code

#### Example

```java
InvoiceEvent.fromVoidRemainderEvent(
        new VoidRemainderEvent.Builder(
            128L,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            new Invoice.Builder()
                .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
                .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
                .build(),
            InvoiceEventType.VOID_REMAINDER,
            new VoidRemainderEventData.Builder(
                new CreditNote.Builder()
                    .build(),
                "memo0",
                "applied_amount2",
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
            )
            .build()
        )
        .build()
    )
```

