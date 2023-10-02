
# Net Terms

## Structure

`NetTerms`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DefaultNetTerms` | `Double` | Optional | **Default**: `0d` | Double getDefaultNetTerms() | setDefaultNetTerms(Double defaultNetTerms) |
| `AutomaticNetTerms` | `Double` | Optional | **Default**: `0d` | Double getAutomaticNetTerms() | setAutomaticNetTerms(Double automaticNetTerms) |
| `RemittanceNetTerms` | `Double` | Optional | **Default**: `0d` | Double getRemittanceNetTerms() | setRemittanceNetTerms(Double remittanceNetTerms) |
| `NetTermsOnRemittanceSignupsEnabled` | `Boolean` | Optional | **Default**: `false` | Boolean getNetTermsOnRemittanceSignupsEnabled() | setNetTermsOnRemittanceSignupsEnabled(Boolean netTermsOnRemittanceSignupsEnabled) |
| `CustomNetTermsEnabled` | `Boolean` | Optional | **Default**: `false` | Boolean getCustomNetTermsEnabled() | setCustomNetTermsEnabled(Boolean customNetTermsEnabled) |

## Example (as JSON)

```json
{
  "default_net_terms": 0.0,
  "automatic_net_terms": 0.0,
  "remittance_net_terms": 0.0,
  "net_terms_on_remittance_signups_enabled": false,
  "custom_net_terms_enabled": false
}
```

