
# Create Invoice Address

Overrides the default address.

## Structure

`CreateInvoiceAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `Address2` | `String` | Optional | - | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |

## Example

```java
import com.maxio.advancedbilling.models.CreateInvoiceAddress;

CreateInvoiceAddress createInvoiceAddress = new CreateInvoiceAddress.Builder()
    .firstName("first_name6")
    .lastName("last_name4")
    .phone("phone4")
    .address("address2")
    .address2("address_20")
    .build();
```

