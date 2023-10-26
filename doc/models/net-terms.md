
# Net Terms

## Structure

`NetTerms`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DefaultNetTerms` | `Integer` | Optional | **Default**: `0` | Integer getDefaultNetTerms() | setDefaultNetTerms(Integer defaultNetTerms) |
| `AutomaticNetTerms` | `Integer` | Optional | **Default**: `0` | Integer getAutomaticNetTerms() | setAutomaticNetTerms(Integer automaticNetTerms) |
| `RemittanceNetTerms` | `Integer` | Optional | **Default**: `0` | Integer getRemittanceNetTerms() | setRemittanceNetTerms(Integer remittanceNetTerms) |
| `NetTermsOnRemittanceSignupsEnabled` | `Boolean` | Optional | **Default**: `false` | Boolean getNetTermsOnRemittanceSignupsEnabled() | setNetTermsOnRemittanceSignupsEnabled(Boolean netTermsOnRemittanceSignupsEnabled) |
| `CustomNetTermsEnabled` | `Boolean` | Optional | **Default**: `false` | Boolean getCustomNetTermsEnabled() | setCustomNetTermsEnabled(Boolean customNetTermsEnabled) |

## Example (as JSON)

```json
{
  "default_net_terms": 0,
  "automatic_net_terms": 0,
  "remittance_net_terms": 0,
  "net_terms_on_remittance_signups_enabled": false,
  "custom_net_terms_enabled": false
}
```

