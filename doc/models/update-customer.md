
# Update Customer

## Structure

`UpdateCustomer`

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
| `Locale` | `String` | Optional | Set a specific language on a customer record. | String getLocale() | setLocale(String locale) |
| `VatNumber` | `String` | Optional | - | String getVatNumber() | setVatNumber(String vatNumber) |
| `VatCountry` | `String` | Optional | The two-letter ISO 3166-1 country code that qualifies the customer's tax ID. Required when `entity_identifier_kind` is `vat_eu` or `national_tax`, and used to derive the kind when only the legacy `vat_number` is sent. | String getVatCountry() | setVatCountry(String vatCountry) |
| `EntityIdentifierKind` | [`EntityIdentifierKind`](../../doc/models/entity-identifier-kind.md) | Optional | The kind of tax or business identifier held by the customer:<br><br>- `vat_eu`: an EU VAT number. Requires `vat_country` to be an EU member state code or `GB`.<br>- `national_tax`: a national tax ID registered outside the EU. Requires `vat_country` to be one of `AL`, `AM`, `AR`, `AU`, `BR`, `CA`, `CH`, `DZ`, `IN`, `MX`, `NO`, `NZ`, or `ZA`.<br>- `company_reg`: a company registration number, such as a French SIREN. No `vat_country` is required.<br>- `gln`: a Global Location Number. The value must be 13 digits.<br>- `duns`: a D-U-N-S Number. The value must be 9 digits.<br>- `lei`: a Legal Entity Identifier. The value must be 20 characters: 18 letters or digits followed by 2 digits.<br><br>A customer holds one identifier at a time. Saving an identifier of a different kind replaces the existing one. | EntityIdentifierKind getEntityIdentifierKind() | setEntityIdentifierKind(EntityIdentifierKind entityIdentifierKind) |
| `EntityIdentifierValue` | `String` | Optional | The customer's tax or business identifier, sent together with `entity_identifier_kind`. Advanced Billing trims surrounding whitespace and stores the value in uppercase. | String getEntityIdentifierValue() | setEntityIdentifierValue(String entityIdentifierValue) |
| `TaxExempt` | `Boolean` | Optional | - | Boolean getTaxExempt() | setTaxExempt(Boolean taxExempt) |
| `Surcharging` | `Boolean` | Optional | Whether surcharging is enabled for the customer. Only applied on sites where surcharging control is enabled. | Boolean getSurcharging() | setSurcharging(Boolean surcharging) |
| `TaxExemptReason` | `String` | Optional | - | String getTaxExemptReason() | setTaxExemptReason(String taxExemptReason) |
| `ParentId` | `Integer` | Optional | - | Integer getParentId() | setParentId(Integer parentId) |
| `Verified` | `Boolean` | Optional | Is the customer verified to use ACH as a payment method. Available only on the Authorize.Net gateway. | Boolean getVerified() | setVerified(Boolean verified) |
| `SalesforceId` | `String` | Optional | The Salesforce ID of the customer | String getSalesforceId() | setSalesforceId(String salesforceId) |
| `BrandingThemeId` | `Integer` | Optional | The ID of the Branding Theme assigned to this customer as the customer's default Branding Theme. This customer-level Branding Theme is used when a subscription does not have its own subscription-level Branding Theme. Available only when Branding Themes are enabled for the site. | Integer getBrandingThemeId() | setBrandingThemeId(Integer brandingThemeId) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateCustomer;

UpdateCustomer updateCustomer = new UpdateCustomer.Builder()
    .firstName("first_name2")
    .lastName("last_name0")
    .email("email4")
    .ccEmails("cc_emails8")
    .organization("organization6")
    .build();
```

