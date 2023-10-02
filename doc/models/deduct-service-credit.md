
# Deduct Service Credit

## Structure

`DeductServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`DeductServiceCreditAmount`](../../doc/models/containers/deduct-service-credit-amount.md) | Required | This is a container for one-of cases. | DeductServiceCreditAmount getAmount() | setAmount(DeductServiceCreditAmount amount) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "amount": "String1",
  "memo": "memo2"
}
```

