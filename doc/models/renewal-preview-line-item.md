
# Renewal Preview Line Item

## Structure

`RenewalPreviewLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionType` | `String` | Optional | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `DiscountAmountInCents` | `Long` | Optional | - | Long getDiscountAmountInCents() | setDiscountAmountInCents(Long discountAmountInCents) |
| `TaxableAmountInCents` | `Long` | Optional | - | Long getTaxableAmountInCents() | setTaxableAmountInCents(Long taxableAmountInCents) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductName` | `String` | Optional | - | String getProductName() | setProductName(String productName) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `ComponentName` | `String` | Optional | - | String getComponentName() | setComponentName(String componentName) |
| `ProductHandle` | `String` | Optional | - | String getProductHandle() | setProductHandle(String productHandle) |
| `PeriodRangeStart` | `String` | Optional | - | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | - | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |

## Example (as JSON)

```json
{
  "transaction_type": "transaction_type8",
  "kind": "kind4",
  "amount_in_cents": 154,
  "memo": "memo0",
  "discount_amount_in_cents": 214
}
```

