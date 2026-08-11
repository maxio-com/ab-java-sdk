
# Invoice Customer

Information about the customer who is owner or recipient of the invoiced subscription.

## Structure

`InvoiceCustomer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyId` | `Integer` | Optional | - | Integer getChargifyId() | setChargifyId(Integer chargifyId) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `VatNumber` | `String` | Optional | - | String getVatNumber() | setVatNumber(String vatNumber) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceCustomer;

InvoiceCustomer invoiceCustomer = new InvoiceCustomer.Builder()
    .chargifyId(82)
    .firstName("first_name2")
    .lastName("last_name0")
    .organization("organization6")
    .email("email4")
    .build();
```

