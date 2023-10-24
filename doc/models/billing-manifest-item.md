
# Billing Manifest Item

## Structure

`BillingManifestItem`

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
| `ComponentName` | `String` | Optional | - | String getComponentName() | setComponentName(String componentName) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductHandle` | `String` | Optional | - | String getProductHandle() | setProductHandle(String productHandle) |
| `ProductName` | `String` | Optional | - | String getProductName() | setProductName(String productName) |
| `PeriodRangeStart` | `String` | Optional | - | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | - | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |

## Example (as JSON)

```json
{
  "transaction_type": "transaction_type2",
  "kind": "kind8",
  "amount_in_cents": 216,
  "memo": "memo4",
  "discount_amount_in_cents": 236
}
```

