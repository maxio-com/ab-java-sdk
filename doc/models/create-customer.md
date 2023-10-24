
# Create Customer

## Structure

`CreateCustomer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Required | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | - | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `CcEmails` | `String` | Optional | - | String getCcEmails() | setCcEmails(String ccEmails) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `Address2` | `String` | Optional | - | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `Locale` | `String` | Optional | Set a specific language on a customer record. | String getLocale() | setLocale(String locale) |
| `VatNumber` | `String` | Optional | - | String getVatNumber() | setVatNumber(String vatNumber) |
| `TaxExempt` | `Boolean` | Optional | - | Boolean getTaxExempt() | setTaxExempt(Boolean taxExempt) |
| `TaxExemptReason` | `String` | Optional | - | String getTaxExemptReason() | setTaxExemptReason(String taxExemptReason) |
| `ParentId` | `Integer` | Optional | The parent ID in Chargify if applicable. Parent is another Customer object. | Integer getParentId() | setParentId(Integer parentId) |

## Example (as JSON)

```json
{
  "first_name": "first_name8",
  "last_name": "last_name6",
  "email": "email8",
  "cc_emails": "cc_emails8",
  "organization": "organization2",
  "reference": "reference4",
  "address": "address4",
  "address_2": "address_22"
}
```

