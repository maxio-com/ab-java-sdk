
# Payer Attributes

## Structure

`PayerAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
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
| `Locale` | `String` | Optional | - | String getLocale() | setLocale(String locale) |
| `VatNumber` | `String` | Optional | - | String getVatNumber() | setVatNumber(String vatNumber) |
| `TaxExempt` | `String` | Optional | - | String getTaxExempt() | setTaxExempt(String taxExempt) |
| `TaxExemptReason` | `String` | Optional | - | String getTaxExemptReason() | setTaxExemptReason(String taxExemptReason) |
| `Metafields` | `Map<String, String>` | Optional | (Optional) A set of key/value pairs representing custom fields and their values. Metafields will be created “on-the-fly” in your site for a given key, if they have not been created yet. | Map<String, String> getMetafields() | setMetafields(Map<String, String> metafields) |

## Example (as JSON)

```json
{
  "metafields": {
    "custom_field_name_1": "custom_field_value_1",
    "custom_field_name_2": "custom_field_value_2"
  },
  "first_name": "first_name4",
  "last_name": "last_name2",
  "email": "email2",
  "cc_emails": "cc_emails4",
  "organization": "organization8"
}
```

