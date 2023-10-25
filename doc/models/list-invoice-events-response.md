
# List Invoice Events Response

## Structure

`ListInvoiceEventsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Events` | [`List<InvoiceEvent>`](../../doc/models/invoice-event.md) | Optional | - | List<InvoiceEvent> getEvents() | setEvents(List<InvoiceEvent> events) |
| `Page` | `Integer` | Optional | - | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |

## Example (as JSON)

```json
{
  "events": [
    {
      "id": 68,
      "event_type": "issue_invoice",
      "event_data": {
        "uid": "uid2",
        "credit_note_number": "credit_note_number4",
        "credit_note_uid": "credit_note_uid4",
        "original_amount": "original_amount6",
        "applied_amount": "applied_amount6"
      },
      "timestamp": "timestamp8",
      "invoice": {
        "id": 166,
        "uid": "uid6",
        "site_id": 92,
        "customer_id": 204,
        "subscription_id": 20
      }
    }
  ],
  "page": 184,
  "per_page": 96,
  "total_pages": 194
}
```

