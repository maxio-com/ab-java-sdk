
# Apply Payment Event

## Structure

`ApplyPaymentEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.APPLY_PAYMENT` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ApplyPaymentEventData`](../../doc/models/apply-payment-event-data.md) | Required | Example schema for an `apply_payment` event | ApplyPaymentEventData getEventData() | setEventData(ApplyPaymentEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ApplyPaymentEvent;
import com.maxio.advancedbilling.models.ApplyPaymentEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.PaymentMethodApplePay;
import com.maxio.advancedbilling.models.containers.InvoiceEventPayment;

ApplyPaymentEvent applyPaymentEvent = new ApplyPaymentEvent.Builder(
    112L,
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    new Invoice.Builder()
        .id(166L)
        .uid("uid6")
        .siteId(92)
        .customerId(204)
        .subscriptionId(20)
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
    .transactionId(78)
    .parentInvoiceNumber(36)
    .remainingPrepaymentAmount("remaining_prepayment_amount6")
    .prepayment(false)
    .external(false)
    .build()
)
.build();
```

