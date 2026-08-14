
# Invoice Address

## Structure

`InvoiceAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `Line2` | `String` | Optional | - | String getLine2() | setLine2(String line2) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceAddress;

InvoiceAddress invoiceAddress = new InvoiceAddress.Builder()
    .street("street2")
    .line2("line26")
    .city("city2")
    .state("state8")
    .zip("zip6")
    .build();
```

