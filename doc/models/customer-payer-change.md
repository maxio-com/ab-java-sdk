
# Customer Payer Change

## Structure

`CustomerPayerChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Before` | [`PayerAttributes`](../../doc/models/payer-attributes.md) | Optional | - | PayerAttributes getBefore() | setBefore(PayerAttributes before) |
| `After` | [`PayerAttributes`](../../doc/models/payer-attributes.md) | Optional | - | PayerAttributes getAfter() | setAfter(PayerAttributes after) |

## Example (as JSON)

```json
{
  "before": {
    "first_name": "first_name0",
    "last_name": "last_name8",
    "email": "email6",
    "cc_emails": "cc_emails0",
    "organization": "organization4"
  },
  "after": {
    "first_name": "first_name2",
    "last_name": "last_name0",
    "email": "email4",
    "cc_emails": "cc_emails8",
    "organization": "organization4"
  }
}
```

