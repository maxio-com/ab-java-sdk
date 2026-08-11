
# Invoice Payer Change

## Structure

`InvoicePayerChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePayerChange;

InvoicePayerChange invoicePayerChange = new InvoicePayerChange.Builder()
    .firstName("first_name4")
    .lastName("last_name2")
    .organization("organization2")
    .email("email2")
    .build();
```

