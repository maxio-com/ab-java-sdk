
# Issue Invoice Event

## Structure

`IssueInvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.ISSUE_INVOICE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`IssueInvoiceEventData`](../../doc/models/issue-invoice-event-data.md) | Required | Example schema for an `issue_invoice` event | IssueInvoiceEventData getEventData() | setEventData(IssueInvoiceEventData eventData) |

## Example (as JSON)

```json
{
  "id": 130,
  "timestamp": "2016-03-13T12:52:32.123Z",
  "invoice": {
    "issue_date": "2024-01-01",
    "due_date": "2024-01-01",
    "paid_date": "2024-01-01",
    "public_url_expires_on": "2024-01-21",
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  },
  "event_type": "issue_invoice",
  "event_data": {
    "consolidation_level": "child",
    "from_status": "paid",
    "to_status": "paid",
    "due_amount": "due_amount8",
    "total_amount": "total_amount2"
  }
}
```

