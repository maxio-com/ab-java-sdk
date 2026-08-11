
# Payment Method External

## Structure

`PaymentMethodExternal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Required | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodExternal;

PaymentMethodExternal paymentMethodExternal = new PaymentMethodExternal.Builder(
    "details0",
    "kind8",
    "memo4",
    InvoiceEventPaymentMethod.EXTERNAL
)
.build();
```

