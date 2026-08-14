
# Address Change

## Structure

`AddressChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Before` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Required | - | InvoiceAddress getBefore() | setBefore(InvoiceAddress before) |
| `After` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Required | - | InvoiceAddress getAfter() | setAfter(InvoiceAddress after) |

## Example

```java
import com.maxio.advancedbilling.models.AddressChange;
import com.maxio.advancedbilling.models.InvoiceAddress;

AddressChange addressChange = new AddressChange.Builder(
    new InvoiceAddress.Builder()
        .street("street0")
        .line2("line24")
        .city("city0")
        .state("state6")
        .zip("zip4")
        .build(),
    new InvoiceAddress.Builder()
        .street("street2")
        .line2("line26")
        .city("city8")
        .state("state2")
        .zip("zip4")
        .build()
)
.build();
```

