
# Backport Invoice Event

## Structure

`BackportInvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.BACKPORT_INVOICE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`Invoice`](../../doc/models/invoice.md) | Required | Example schema for an `backport_invoice` event | Invoice getEventData() | setEventData(Invoice eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BackportInvoiceEvent;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;

BackportInvoiceEvent backportInvoiceEvent = new BackportInvoiceEvent.Builder(
    210L,
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
    InvoiceEventType.BACKPORT_INVOICE,
    new Invoice.Builder()
        .id(206L)
        .uid("uid6")
        .siteId(132)
        .customerId(244)
        .subscriptionId(60)
        .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
        .build()
)
.build();
```

