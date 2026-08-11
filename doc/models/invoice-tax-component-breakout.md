
# Invoice Tax Component Breakout

## Structure

`InvoiceTaxComponentBreakout`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxRuleId` | `Integer` | Optional | - | Integer getTaxRuleId() | setTaxRuleId(Integer taxRuleId) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |
| `CountryCode` | `String` | Optional | - | String getCountryCode() | setCountryCode(String countryCode) |
| `SubdivisionCode` | `String` | Optional | - | String getSubdivisionCode() | setSubdivisionCode(String subdivisionCode) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TaxableAmount` | `String` | Optional | - | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxExemptAmount` | `String` | Optional | - | String getTaxExemptAmount() | setTaxExemptAmount(String taxExemptAmount) |
| `NonTaxableAmount` | `String` | Optional | - | String getNonTaxableAmount() | setNonTaxableAmount(String nonTaxableAmount) |
| `TaxName` | `String` | Optional | - | String getTaxName() | setTaxName(String taxName) |
| `TaxType` | `String` | Optional | - | String getTaxType() | setTaxType(String taxType) |
| `RateType` | `String` | Optional | - | String getRateType() | setRateType(String rateType) |
| `TaxAuthorityType` | `Integer` | Optional | - | Integer getTaxAuthorityType() | setTaxAuthorityType(Integer taxAuthorityType) |
| `StateAssignedNo` | `String` | Optional | - | String getStateAssignedNo() | setStateAssignedNo(String stateAssignedNo) |
| `TaxSubType` | `String` | Optional | - | String getTaxSubType() | setTaxSubType(String taxSubType) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceTaxComponentBreakout;

InvoiceTaxComponentBreakout invoiceTaxComponentBreakout = new InvoiceTaxComponentBreakout.Builder()
    .taxRuleId(66)
    .percentage("percentage0")
    .countryCode("country_code2")
    .subdivisionCode("subdivision_code6")
    .taxAmount("tax_amount4")
    .build();
```

