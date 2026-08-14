
# Customer Attributes

## Structure

`CustomerAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | The first name of the customer. Required when creating a customer via attributes. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the customer. Required when creating a customer via attributes. | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | The email address of the customer. Required when creating a customer via attributes. | String getEmail() | setEmail(String email) |
| `CcEmails` | `String` | Optional | (Optional) A list of emails that should be cc’d on all customer communications. | String getCcEmails() | setCcEmails(String ccEmails) |
| `Organization` | `String` | Optional | (Optional) The organization/company of the customer. | String getOrganization() | setOrganization(String organization) |
| `Reference` | `String` | Optional | (Optional) A customer “reference”, or unique identifier from your app, stored in Chargify. Can be used so that you may reference your customer’s within Chargify using the same unique value you use in your application. | String getReference() | setReference(String reference) |
| `Address` | `String` | Optional | (Optional) The customer’s shipping street address (e.g., “123 Main St.”). | String getAddress() | setAddress(String address) |
| `Address2` | `String` | Optional | (Optional) Second line of the customer’s shipping address e.g., “Apt. 100” | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Optional | (Optional) The customer’s shipping address city (e.g., “Boston”). | String getCity() | setCity(String city) |
| `State` | `String` | Optional | “(Optional) The customer’s shipping address state (e.g., “MA”). This must conform to the [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for tax locale purposes.” | String getState() | setState(String state) |
| `Zip` | `String` | Optional | (Optional) The customer’s shipping address zip code (e.g., “12345”). | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | “(Optional) The customer shipping address country, required in [ISO_3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (e.g., “US”).” | String getCountry() | setCountry(String country) |
| `Phone` | `String` | Optional | (Optional) The phone number of the customer. | String getPhone() | setPhone(String phone) |
| `Verified` | `Boolean` | Optional | - | Boolean getVerified() | setVerified(Boolean verified) |
| `TaxExempt` | `Boolean` | Optional | (Optional) The tax_exempt status of the customer. Acceptable values are true or 1 for true and false or 0 for false. | Boolean getTaxExempt() | setTaxExempt(Boolean taxExempt) |
| `Surcharging` | `Boolean` | Optional | (Optional) Whether surcharging is enabled for the customer. Defaults to `true` when omitted. Only applied on sites where surcharging control is enabled. | Boolean getSurcharging() | setSurcharging(Boolean surcharging) |
| `VatNumber` | `String` | Optional | (Optional) Supplying the VAT number allows EU customers to opt-out of the Value Added Tax assuming the merchant address and customer billing address are not within the same EU country. It’s important to omit the country code from the VAT number upon entry. Otherwise, taxes will be assessed upon the purchase. | String getVatNumber() | setVatNumber(String vatNumber) |
| `Metafields` | `Map<String, String>` | Optional | (Optional) A set of key/value pairs representing custom fields and their values. Metafields will be created “on-the-fly” in your site for a given key, if they have not been created yet. | Map<String, String> getMetafields() | setMetafields(Map<String, String> metafields) |
| `ParentId` | `Integer` | Optional | The parent ID in Chargify if applicable. Parent is another Customer object. | Integer getParentId() | setParentId(Integer parentId) |
| `SalesforceId` | `String` | Optional | (Optional) The Salesforce ID of the customer. | String getSalesforceId() | setSalesforceId(String salesforceId) |
| `DefaultAutoRenewalProfileId` | `Integer` | Optional | (Optional) The default auto-renewal profile ID for the customer | Integer getDefaultAutoRenewalProfileId() | setDefaultAutoRenewalProfileId(Integer defaultAutoRenewalProfileId) |

## Example

```java
import com.maxio.advancedbilling.models.CustomerAttributes;
import java.util.LinkedHashMap;

CustomerAttributes customerAttributes = new CustomerAttributes.Builder()
    .firstName("first_name2")
    .lastName("last_name0")
    .email("email4")
    .ccEmails("cc_emails2")
    .organization("organization6")
    .metafields(new LinkedHashMap<String, String>() {{
        put("custom_field_name_1", "custom_field_value_1");
        put("custom_field_name_2", "custom_field_value_2");
    }})
    .build();
```

