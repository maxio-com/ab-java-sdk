
# Seller

## Structure

`Seller`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Address` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getAddress() | setAddress(InvoiceAddress address) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `LogoUrl` | `String` | Optional | - | String getLogoUrl() | setLogoUrl(String logoUrl) |

## Example (as JSON)

```json
{
  "name": "name6",
  "address": {
    "street": "street6",
    "line2": "line20",
    "city": "city6",
    "state": "state2",
    "zip": "zip0"
  },
  "phone": "phone6",
  "logo_url": "logo_url4"
}
```

