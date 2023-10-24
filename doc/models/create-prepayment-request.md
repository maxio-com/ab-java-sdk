
# Create Prepayment Request

## Structure

`CreatePrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`CreatePrepayment`](../../doc/models/create-prepayment.md) | Required | - | CreatePrepayment getPrepayment() | setPrepayment(CreatePrepayment prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "amount": 11.6,
    "details": "details8",
    "memo": "memo2",
    "method": "cash",
    "payment_profile_id": 240
  }
}
```

