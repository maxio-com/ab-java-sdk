
# List Subcription Group Prepayment Item

## Structure

`ListSubcriptionGroupPrepaymentItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SubscriptionGroupUid` | `String` | Optional | - | String getSubscriptionGroupUid() | setSubscriptionGroupUid(String subscriptionGroupUid) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `RemainingAmountInCents` | `Long` | Optional | - | Long getRemainingAmountInCents() | setRemainingAmountInCents(Long remainingAmountInCents) |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | - | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "id": 254,
  "subscription_group_uid": "subscription_group_uid6",
  "amount_in_cents": 172,
  "remaining_amount_in_cents": 142,
  "details": "details2"
}
```

