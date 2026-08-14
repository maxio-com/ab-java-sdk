
# Apply Credit Note Event

## Structure

`ApplyCreditNoteEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.APPLY_CREDIT_NOTE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ApplyCreditNoteEventData`](../../doc/models/apply-credit-note-event-data.md) | Required | Example schema for an `apply_credit_note` event | ApplyCreditNoteEventData getEventData() | setEventData(ApplyCreditNoteEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AppliedCreditNoteData;
import com.maxio.advancedbilling.models.ApplyCreditNoteEvent;
import com.maxio.advancedbilling.models.ApplyCreditNoteEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;
import java.util.Arrays;

ApplyCreditNoteEvent applyCreditNoteEvent = new ApplyCreditNoteEvent.Builder(
    86L,
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
    InvoiceEventType.APPLY_CREDIT_NOTE,
    new ApplyCreditNoteEventData.Builder(
        "uid6",
        "credit_note_number0",
        "credit_note_uid0",
        "original_amount0",
        "applied_amount2"
    )
    .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .memo("memo0")
    .role("role0")
    .consolidatedInvoice(false)
    .appliedCreditNotes(Arrays.asList(
            new AppliedCreditNoteData.Builder()
                .uid("uid4")
                .number("number8")
                .build(),
            new AppliedCreditNoteData.Builder()
                .uid("uid4")
                .number("number8")
                .build(),
            new AppliedCreditNoteData.Builder()
                .uid("uid4")
                .number("number8")
                .build()
        ))
    .build()
)
.build();
```

