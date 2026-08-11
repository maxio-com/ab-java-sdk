
# Refund Success

## Structure

`RefundSuccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RefundId` | `int` | Required | - | int getRefundId() | setRefundId(int refundId) |
| `GatewayTransactionId` | `int` | Required | - | int getGatewayTransactionId() | setGatewayTransactionId(int gatewayTransactionId) |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |

## Example

```java
import com.maxio.advancedbilling.models.RefundSuccess;

RefundSuccess refundSuccess = new RefundSuccess.Builder(
    34,
    160,
    190
)
.build();
```

