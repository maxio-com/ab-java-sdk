
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

## Example

```java
import com.maxio.advancedbilling.models.NetTerms;

NetTerms netTerms = new NetTerms.Builder()
    .defaultNetTerms(0)
    .automaticNetTerms(0)
    .remittanceNetTerms(0)
    .netTermsOnRemittanceSignupsEnabled(false)
    .customNetTermsEnabled(false)
    .build();
```

