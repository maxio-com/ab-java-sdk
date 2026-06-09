
# Refund Invoice Request Refund

## Class Name

`RefundInvoiceRequestRefund`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`RefundInvoice`](../../../doc/models/refund-invoice.md) | RefundInvoiceRequestRefund.fromRefundInvoice(RefundInvoice refundInvoice) |
| [`RefundConsolidatedInvoice`](../../../doc/models/refund-consolidated-invoice.md) | RefundInvoiceRequestRefund.fromRefundConsolidatedInvoice(RefundConsolidatedInvoice refundConsolidatedInvoice) |

## RefundInvoice

### Initialization Code

#### Example

```java
RefundInvoiceRequestRefund.fromRefundInvoice(
        new RefundInvoice.Builder(
            "amount8",
            "memo0",
            0
        )
        .build()
    )
```

## RefundConsolidatedInvoice

### Initialization Code

#### Example

```java
RefundInvoiceRequestRefund.fromRefundConsolidatedInvoice(
        new RefundConsolidatedInvoice.Builder(
            "memo0",
            46,
            RefundConsolidatedInvoiceSegmentUids.fromListOfString(
                Arrays.asList(
                    "String0",
                    "String1"
                )
            )
        )
        .build()
    )
```

