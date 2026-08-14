
# Organization Address

## Structure

`OrganizationAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `Line2` | `String` | Optional | - | String getLine2() | setLine2(String line2) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |

## Example

```java
import com.maxio.advancedbilling.models.OrganizationAddress;

OrganizationAddress organizationAddress = new OrganizationAddress.Builder()
    .street("street2")
    .line2("line26")
    .city("city2")
    .state("state8")
    .zip("zip6")
    .build();
```

