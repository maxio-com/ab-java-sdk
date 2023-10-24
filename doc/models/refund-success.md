
# Refund Success

## Structure

`RefundSuccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RefundId` | `int` | Required | - | int getRefundId() | setRefundId(int refundId) |
| `GatewayTransactionId` | `int` | Required | - | int getGatewayTransactionId() | setGatewayTransactionId(int gatewayTransactionId) |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |

## Example (as JSON)

```json
{
  "refund_id": 12,
  "gateway_transaction_id": 182,
  "product_id": 168
}
```

