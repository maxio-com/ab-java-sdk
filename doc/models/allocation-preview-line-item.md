
# Allocation Preview Line Item

## Structure

`AllocationPreviewLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionType` | `String` | Optional | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `DiscountAmountInCents` | `Integer` | Optional | - | Integer getDiscountAmountInCents() | setDiscountAmountInCents(Integer discountAmountInCents) |
| `TaxableAmountInCents` | `Integer` | Optional | - | Integer getTaxableAmountInCents() | setTaxableAmountInCents(Integer taxableAmountInCents) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Direction` | `String` | Optional | - | String getDirection() | setDirection(String direction) |

## Example (as JSON)

```json
{
  "transaction_type": "transaction_type4",
  "kind": "kind0",
  "amount_in_cents": 24,
  "memo": "memo6",
  "discount_amount_in_cents": 172
}
```

