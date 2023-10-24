
# Payment Allocation

## Structure

`PaymentAllocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Double` | Optional | - | Double getId() | setId(Double id) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `Success` | `Boolean` | Optional | - | Boolean getSuccess() | setSuccess(Boolean success) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "id": 170.3,
  "amount_in_cents": 36,
  "success": false,
  "memo": "memo4"
}
```

