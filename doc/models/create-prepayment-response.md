
# Create Prepayment Response

## Structure

`CreatePrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`CreatedPrepayment`](../../doc/models/created-prepayment.md) | Required | - | CreatedPrepayment getPrepayment() | setPrepayment(CreatedPrepayment prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "id": 38,
    "subscription_id": 148,
    "amount": 136,
    "memo": "memo2",
    "created_at": "2016-03-13T12:52:32.123Z"
  }
}
```

