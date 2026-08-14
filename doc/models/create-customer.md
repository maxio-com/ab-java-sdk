
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
| `Surcharging` | `Boolean` | Optional | Whether surcharging is enabled for the customer. Defaults to `true` when omitted. Only applied on sites where surcharging control is enabled. | Boolean getSurcharging() | setSurcharging(Boolean surcharging) |
| `TaxExemptReason` | `String` | Optional | - | String getTaxExemptReason() | setTaxExemptReason(String taxExemptReason) |
| `ParentId` | `Integer` | Optional | The parent ID in Chargify if applicable. Parent is another Customer object. | Integer getParentId() | setParentId(Integer parentId) |
| `SalesforceId` | `String` | Optional | The Salesforce ID of the customer | String getSalesforceId() | setSalesforceId(String salesforceId) |
| `BrandingThemeId` | `Integer` | Optional | The ID of the Branding Theme assigned to this customer as the customer's default Branding Theme. This customer-level Branding Theme is used when a subscription does not have its own subscription-level Branding Theme. Available only when Branding Themes are enabled for the site. | Integer getBrandingThemeId() | setBrandingThemeId(Integer brandingThemeId) |

## Example

```java
import com.maxio.advancedbilling.models.CreateCustomer;

CreateCustomer createCustomer = new CreateCustomer.Builder(
    "first_name0",
    "last_name8",
    "email6"
)
.ccEmails("cc_emails0")
.organization("organization6")
.reference("reference4")
.address("address6")
.address2("address_24")
.build();
```

