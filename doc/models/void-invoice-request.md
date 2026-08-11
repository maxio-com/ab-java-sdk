
# Void Invoice Request

## Structure

`VoidInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Void` | [`VoidInvoice`](../../doc/models/void-invoice.md) | Required | - | VoidInvoice getVoid() | setVoid(VoidInvoice mVoid) |

## Example

```java
import com.maxio.advancedbilling.models.VoidInvoice;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;

VoidInvoiceRequest voidInvoiceRequest = new VoidInvoiceRequest.Builder(
    new VoidInvoice.Builder(
        "reason6"
    )
    .build()
)
.build();
```

