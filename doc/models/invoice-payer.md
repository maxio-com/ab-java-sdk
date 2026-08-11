
# Invoice Payer

## Structure

`InvoicePayer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyId` | `Integer` | Optional | - | Integer getChargifyId() | setChargifyId(Integer chargifyId) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `VatNumber` | `String` | Optional | - | String getVatNumber() | setVatNumber(String vatNumber) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePayer;

InvoicePayer invoicePayer = new InvoicePayer.Builder()
    .chargifyId(198)
    .firstName("first_name2")
    .lastName("last_name0")
    .organization("organization4")
    .email("email4")
    .build();
```

