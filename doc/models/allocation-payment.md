
# Allocation Payment

Information for captured payment, if applicable

## Structure

`AllocationPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Success` | `Boolean` | Optional | - | Boolean getSuccess() | setSuccess(Boolean success) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "id": 146,
  "amount_in_cents": 232,
  "success": false,
  "memo": "memo2"
}
```

