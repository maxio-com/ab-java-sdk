
# Apply Debit Note Event

## Structure

`ApplyDebitNoteEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.APPLY_DEBIT_NOTE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ApplyDebitNoteEventData`](../../doc/models/apply-debit-note-event-data.md) | Required | Example schema for an `apply_debit_note` event | ApplyDebitNoteEventData getEventData() | setEventData(ApplyDebitNoteEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ApplyDebitNoteEvent;
import com.maxio.advancedbilling.models.ApplyDebitNoteEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;

ApplyDebitNoteEvent applyDebitNoteEvent = new ApplyDebitNoteEvent.Builder(
    180L,
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
    InvoiceEventType.APPLY_DEBIT_NOTE,
    new ApplyDebitNoteEventData.Builder(
        "debit_note_number6",
        "debit_note_uid2",
        "original_amount0",
        "applied_amount2"
    )
    .memo("memo0")
    .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build()
)
.build();
```

