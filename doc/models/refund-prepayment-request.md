
# Refund Prepayment Request

## Structure

`RefundPrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Refund` | [`RefundPrepayment`](../../doc/models/refund-prepayment.md) | Required | - | RefundPrepayment getRefund() | setRefund(RefundPrepayment refund) |

## Example

```java
import com.maxio.advancedbilling.models.RefundPrepayment;
import com.maxio.advancedbilling.models.RefundPrepaymentRequest;
import com.maxio.advancedbilling.models.containers.RefundPrepaymentAmount;

RefundPrepaymentRequest refundPrepaymentRequest = new RefundPrepaymentRequest.Builder(
    new RefundPrepayment.Builder(
        132L,
        RefundPrepaymentAmount.fromString(
            "String1"
        ),
        "memo2"
    )
    .external(false)
    .build()
)
.build();
```

