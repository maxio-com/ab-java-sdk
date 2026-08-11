
# Remove Payment Event

## Structure

`RemovePaymentEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.REMOVE_PAYMENT` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`RemovePaymentEventData`](../../doc/models/remove-payment-event-data.md) | Required | Example schema for an `remove_payment` event | RemovePaymentEventData getEventData() | setEventData(RemovePaymentEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.PaymentMethodApplePay;
import com.maxio.advancedbilling.models.RemovePaymentEvent;
import com.maxio.advancedbilling.models.RemovePaymentEventData;
import com.maxio.advancedbilling.models.containers.InvoiceEventPayment;

RemovePaymentEvent removePaymentEvent = new RemovePaymentEvent.Builder(
    132L,
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
    .originalAmount("original_amount0")
    .build()
)
.build();
```

