
# Invoice Seller

Information about the seller (merchant) listed on the masthead of the invoice.

## Structure

`InvoiceSeller`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Address` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getAddress() | setAddress(InvoiceAddress address) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `LogoUrl` | `String` | Optional | - | String getLogoUrl() | setLogoUrl(String logoUrl) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceSeller;

InvoiceSeller invoiceSeller = new InvoiceSeller.Builder()
    .name("name4")
    .address(new InvoiceAddress.Builder()
        .street("street6")
        .line2("line20")
        .city("city6")
        .state("state2")
        .zip("zip0")
        .build())
    .phone("phone6")
    .logoUrl("logo_url6")
    .build();
```

