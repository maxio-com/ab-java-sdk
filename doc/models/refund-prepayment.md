
# Refund Prepayment

## Structure

`RefundPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `double` | Required | `amount` is not required if you pass `amount_in_cents`. | double getAmountInCents() | setAmountInCents(double amountInCents) |
| `Amount` | [`RefundPrepaymentAmount`](../../doc/models/containers/refund-prepayment-amount.md) | Required | This is a container for one-of cases. | RefundPrepaymentAmount getAmount() | setAmount(RefundPrepaymentAmount amount) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `External` | `Boolean` | Optional | Specify the type of refund you wish to initiate. When the prepayment is external, the `external` flag is optional. But if the prepayment was made through a payment profile, the `external` flag is required. | Boolean getExternal() | setExternal(Boolean external) |

## Example (as JSON)

```json
{
  "amount_in_cents": 147.02,
  "amount": "String3",
  "memo": "memo4",
  "external": false
}
```

