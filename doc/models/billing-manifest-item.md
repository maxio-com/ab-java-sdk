
# Billing Manifest Item

## Structure

`BillingManifestItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionType` | [`LineItemTransactionType`](../../doc/models/line-item-transaction-type.md) | Optional | A handle for the line item transaction type | LineItemTransactionType getTransactionType() | setTransactionType(LineItemTransactionType transactionType) |
| `Kind` | [`BillingManifestLineItemKind`](../../doc/models/billing-manifest-line-item-kind.md) | Optional | A handle for the billing manifest line item kind | BillingManifestLineItemKind getKind() | setKind(BillingManifestLineItemKind kind) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `DiscountAmountInCents` | `Long` | Optional | - | Long getDiscountAmountInCents() | setDiscountAmountInCents(Long discountAmountInCents) |
| `TaxableAmountInCents` | `Long` | Optional | - | Long getTaxableAmountInCents() | setTaxableAmountInCents(Long taxableAmountInCents) |
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
  "transaction_type": "info_transaction",
  "kind": "baseline",
  "amount_in_cents": 216,
  "memo": "memo4",
  "discount_amount_in_cents": 236
}
```

