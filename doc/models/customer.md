
# Customer

## Structure

`Customer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | The first name of the customer | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the customer | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | The email address of the customer | String getEmail() | setEmail(String email) |
| `CcEmails` | `String` | Optional | A comma-separated list of emails that should be cc’d on all customer communications (i.e. “joe@example.com, sue@example.com”) | String getCcEmails() | setCcEmails(String ccEmails) |
| `Organization` | `String` | Optional | The organization of the customer | String getOrganization() | setOrganization(String organization) |
| `Reference` | `String` | Optional | The unique identifier used within your own application for this customer | String getReference() | setReference(String reference) |
| `Id` | `Integer` | Optional | The customer ID in Chargify | Integer getId() | setId(Integer id) |
| `CreatedAt` | `String` | Optional | The timestamp in which the customer object was created in Chargify | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | The timestamp in which the customer object was last edited | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Address` | `String` | Optional | The customer’s shipping street address (i.e. “123 Main St.”) | String getAddress() | setAddress(String address) |
| `Address2` | `String` | Optional | Second line of the customer’s shipping address i.e. “Apt. 100” | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Optional | The customer’s shipping address city (i.e. “Boston”) | String getCity() | setCity(String city) |
| `State` | `String` | Optional | The customer’s shipping address state (i.e. “MA”) | String getState() | setState(String state) |
| `StateName` | `String` | Optional | The customer's full name of state | String getStateName() | setStateName(String stateName) |
| `Zip` | `String` | Optional | The customer’s shipping address zip code (i.e. “12345”) | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | The customer shipping address country | String getCountry() | setCountry(String country) |
| `CountryName` | `String` | Optional | The customer's full name of country | String getCountryName() | setCountryName(String countryName) |
| `Phone` | `String` | Optional | The phone number of the customer | String getPhone() | setPhone(String phone) |
| `Verified` | `Boolean` | Optional | Is the customer verified to use ACH as a payment method. Available only on Authorize.Net gateway | Boolean getVerified() | setVerified(Boolean verified) |
| `PortalCustomerCreatedAt` | `String` | Optional | The timestamp of when the Billing Portal entry was created at for the customer | String getPortalCustomerCreatedAt() | setPortalCustomerCreatedAt(String portalCustomerCreatedAt) |
| `PortalInviteLastSentAt` | `String` | Optional | The timestamp of when the Billing Portal invite was last sent at | String getPortalInviteLastSentAt() | setPortalInviteLastSentAt(String portalInviteLastSentAt) |
| `PortalInviteLastAcceptedAt` | `String` | Optional | The timestamp of when the Billing Portal invite was last accepted | String getPortalInviteLastAcceptedAt() | setPortalInviteLastAcceptedAt(String portalInviteLastAcceptedAt) |
| `TaxExempt` | `Boolean` | Optional | The tax exempt status for the customer. Acceptable values are true or 1 for true and false or 0 for false. | Boolean getTaxExempt() | setTaxExempt(Boolean taxExempt) |
| `VatNumber` | `String` | Optional | The VAT business identification number for the customer. This number is used to determine VAT tax opt out rules. It is not validated when added or updated on a customer record. Instead, it is validated via VIES before calculating taxes. Only valid business identification numbers will allow for VAT opt out. | String getVatNumber() | setVatNumber(String vatNumber) |
| `ParentId` | `Integer` | Optional | The parent ID in Chargify if applicable. Parent is another Customer object. | Integer getParentId() | setParentId(Integer parentId) |
| `Locale` | `String` | Optional | The locale for the customer to identify language-region | String getLocale() | setLocale(String locale) |
| `DefaultSubscriptionGroupUid` | `String` | Optional | - | String getDefaultSubscriptionGroupUid() | setDefaultSubscriptionGroupUid(String defaultSubscriptionGroupUid) |

## Example (as JSON)

```json
{
  "first_name": "first_name8",
  "last_name": "last_name6",
  "email": "email8",
  "cc_emails": "cc_emails2",
  "organization": "organization8"
}
```

