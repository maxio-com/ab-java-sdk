
# Refund Invoice Request

## Structure

`RefundInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Refund` | [`RefundInvoiceRequestRefund`](../../doc/models/containers/refund-invoice-request-refund.md) | Required | This is a container for any-of cases. | RefundInvoiceRequestRefund getRefund() | setRefund(RefundInvoiceRequestRefund refund) |

## Example

```java
import com.maxio.advancedbilling.models.RefundInvoice;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.containers.RefundInvoiceRequestRefund;

RefundInvoiceRequest refundInvoiceRequest = new RefundInvoiceRequest.Builder(
    RefundInvoiceRequestRefund.fromRefundInvoice(
        new RefundInvoice.Builder(
            "amount8",
            "memo0",
            0
        )
        .external(false)
        .applyCredit(false)
        .voidInvoice(false)
        .build()
    )
)
.build();
```

