
# Failed Payment Event

## Structure

`FailedPaymentEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.FAILED_PAYMENT` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`FailedPaymentEventData`](../../doc/models/failed-payment-event-data.md) | Required | Example schema for an `failed_payment` event | FailedPaymentEventData getEventData() | setEventData(FailedPaymentEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.FailedPaymentEvent;
import com.maxio.advancedbilling.models.FailedPaymentEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;

FailedPaymentEvent failedPaymentEvent = new FailedPaymentEvent.Builder(
    186L,
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
    InvoiceEventType.FAILED_PAYMENT,
    new FailedPaymentEventData.Builder(
        220,
        194,
        InvoicePaymentMethodType.CASH,
        78
    )
    .memo("memo0")
    .build()
)
.build();
```

