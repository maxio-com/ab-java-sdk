
# Prepayment Response

## Structure

`PrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`Prepayment`](../../doc/models/prepayment.md) | Required | - | Prepayment getPrepayment() | setPrepayment(Prepayment prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "id": 38,
    "subscription_id": 148,
    "amount_in_cents": 124,
    "remaining_amount_in_cents": 182,
    "refunded_amount_in_cents": 132,
    "details": "details8",
    "external": false,
    "memo": "memo2",
    "payment_type": "credit_card",
    "created_at": "created_at6"
  }
}
```

