
# Prepayments Response

## Structure

`PrepaymentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayments` | [`List<Prepayment1>`](../../doc/models/prepayment-1.md) | Optional | **Constraints**: *Unique Items Required* | List<Prepayment1> getPrepayments() | setPrepayments(List<Prepayment1> prepayments) |

## Example (as JSON)

```json
{
  "prepayments": [
    {
      "id": 231.16,
      "subscription_id": 1.86,
      "amount_in_cents": 44.46,
      "remaining_amount_in_cents": 7.32,
      "refunded_amount_in_cents": 32.42,
      "details": "details6",
      "external": false,
      "memo": "memo0",
      "payment_type": "cash",
      "created_at": "created_at4"
    },
    {
      "id": 231.16,
      "subscription_id": 1.86,
      "amount_in_cents": 44.46,
      "remaining_amount_in_cents": 7.32,
      "refunded_amount_in_cents": 32.42,
      "details": "details6",
      "external": false,
      "memo": "memo0",
      "payment_type": "cash",
      "created_at": "created_at4"
    }
  ]
}
```

