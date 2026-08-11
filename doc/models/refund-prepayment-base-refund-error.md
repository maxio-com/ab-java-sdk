
# Refund Prepayment Base Refund Error

## Structure

`RefundPrepaymentBaseRefundError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Refund` | [`BaseRefundError`](../../doc/models/base-refund-error.md) | Optional | - | BaseRefundError getRefund() | setRefund(BaseRefundError refund) |

## Example

```java
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.BaseRefundError;
import com.maxio.advancedbilling.models.RefundPrepaymentBaseRefundError;
import java.io.IOException;
import java.util.Arrays;

RefundPrepaymentBaseRefundError refundPrepaymentBaseRefundError = new RefundPrepaymentBaseRefundError.Builder()
    .refund(new BaseRefundError.Builder()
        .base(Arrays.asList(
            ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}")
        ))
        .build())
    .build();
```

