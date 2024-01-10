
# Allocation Preview Line Item

## Structure

`AllocationPreviewLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionType` | [`LineItemTransactionType`](../../doc/models/line-item-transaction-type.md) | Optional | A handle for the line item transaction type | LineItemTransactionType getTransactionType() | setTransactionType(LineItemTransactionType transactionType) |
| `Kind` | [`AllocationPreviewLineItemKind`](../../doc/models/allocation-preview-line-item-kind.md) | Optional | A handle for the line item kind for allocation preview | AllocationPreviewLineItemKind getKind() | setKind(AllocationPreviewLineItemKind kind) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `DiscountAmountInCents` | `Long` | Optional | - | Long getDiscountAmountInCents() | setDiscountAmountInCents(Long discountAmountInCents) |
| `TaxableAmountInCents` | `Long` | Optional | - | Long getTaxableAmountInCents() | setTaxableAmountInCents(Long taxableAmountInCents) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Direction` | [`AllocationPreviewDirection`](../../doc/models/allocation-preview-direction.md) | Optional | Visible when using Fine-grained Component Control | AllocationPreviewDirection getDirection() | setDirection(AllocationPreviewDirection direction) |

## Example (as JSON)

```json
{
  "transaction_type": "credit",
  "kind": "quantity_based_component",
  "amount_in_cents": 24,
  "memo": "memo6",
  "discount_amount_in_cents": 172
}
```

