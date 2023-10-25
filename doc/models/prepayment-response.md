
# Prepayment Response

## Structure

`PrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`Prepayment1`](../../doc/models/prepayment-1.md) | Required | - | Prepayment1 getPrepayment() | setPrepayment(Prepayment1 prepayment) |

## Example (as JSON)

```json
{
  "prepayment": {
    "id": 128.38,
    "subscription_id": 155.08,
    "amount_in_cents": 108.76,
    "remaining_amount_in_cents": 160.54,
    "refunded_amount_in_cents": 185.64,
    "details": "details8",
    "external": false,
    "memo": "memo2",
    "payment_type": "credit_card_on_file",
    "created_at": "created_at6"
  }
}
```

