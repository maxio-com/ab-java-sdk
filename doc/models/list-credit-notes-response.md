
# List Credit Notes Response

## Structure

`ListCreditNotesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditNotes` | [`List<CreditNote>`](../../doc/models/credit-note.md) | Required | - | List<CreditNote> getCreditNotes() | setCreditNotes(List<CreditNote> creditNotes) |

## Example (as JSON)

```json
{
  "credit_notes": [
    {
      "uid": "uid2",
      "site_id": 112,
      "customer_id": 224,
      "subscription_id": 40,
      "number": "number0"
    }
  ]
}
```

