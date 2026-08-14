
# Void Invoice Event

## Structure

`VoidInvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.VOID_INVOICE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`VoidInvoiceEventData`](../../doc/models/void-invoice-event-data.md) | Required | Example schema for an `void_invoice` event | VoidInvoiceEventData getEventData() | setEventData(VoidInvoiceEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.VoidInvoiceEvent;
import com.maxio.advancedbilling.models.VoidInvoiceEventData;

VoidInvoiceEvent voidInvoiceEvent = new VoidInvoiceEvent.Builder(
    236L,
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
    InvoiceEventType.VOID_INVOICE,
    new VoidInvoiceEventData.Builder(
        new CreditNote.Builder()
            .uid("uid2")
            .siteId(72)
            .customerId(184)
            .subscriptionId(0)
            .number("number0")
            .build(),
        "memo0",
        "applied_amount2",
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        false,
        "reason2"
    )
    .build()
)
.build();
```

