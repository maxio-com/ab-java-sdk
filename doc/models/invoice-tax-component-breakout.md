
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

## Example (as JSON)

```json
{
  "tax_rule_id": 226,
  "percentage": "percentage0",
  "country_code": "country_code8",
  "subdivision_code": "subdivision_code6"
}
```

