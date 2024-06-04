
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

## Example (as JSON)

```json
{
  "id": 214,
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
  "event_type": "apply_credit_note",
  "event_data": {
    "uid": "uid6",
    "credit_note_number": "credit_note_number0",
    "credit_note_uid": "credit_note_uid0",
    "original_amount": "original_amount0",
    "applied_amount": "applied_amount2",
    "transaction_time": "2016-03-13T12:52:32.123Z",
    "memo": "memo0",
    "role": "role0",
    "consolidated_invoice": false,
    "applied_credit_notes": [
      {
        "uid": "uid4",
        "number": "number8"
      },
      {
        "uid": "uid4",
        "number": "number8"
      },
      {
        "uid": "uid4",
        "number": "number8"
      }
    ]
  }
}
```

