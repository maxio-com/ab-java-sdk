
# Invoice Customer

Information about the customer who is owner or recipient the invoiced subscription.

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

## Example (as JSON)

```json
{
  "chargify_id": 236,
  "first_name": "first_name0",
  "last_name": "last_name8",
  "organization": "organization4",
  "email": "email6"
}
```

