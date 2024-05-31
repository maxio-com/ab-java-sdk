
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

## Example (as JSON)

```json
{
  "id": 164,
  "timestamp": "2016-03-13T12:52:32.123Z",
  "invoice": {
    "issue_date": "2024-01-01",
    "due_date": "2024-01-01",
    "paid_date": "2024-01-01",
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  },
  "event_type": "apply_debit_note",
  "event_data": {
    "debit_note_number": "debit_note_number6",
    "debit_note_uid": "debit_note_uid2",
    "original_amount": "original_amount0",
    "applied_amount": "applied_amount2",
    "memo": "memo0",
    "transaction_time": "2016-03-13T12:52:32.123Z"
  }
}
```

