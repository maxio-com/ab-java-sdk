
# Tax Configuration

## Structure

`TaxConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | [`TaxConfigurationKind`](../../doc/models/tax-configuration-kind.md) | Optional | **Default**: `TaxConfigurationKind.CUSTOM` | TaxConfigurationKind getKind() | setKind(TaxConfigurationKind kind) |
| `DestinationAddress` | [`TaxDestinationAddress`](../../doc/models/tax-destination-address.md) | Optional | - | TaxDestinationAddress getDestinationAddress() | setDestinationAddress(TaxDestinationAddress destinationAddress) |
| `FullyConfigured` | `Boolean` | Optional | Returns `true` when Chargify has been properly configured to charge tax using the specified tax system. More details about taxes: https://maxio.zendesk.com/hc/en-us/articles/24287012608909-Taxes-Overview<br><br>**Default**: `false` | Boolean getFullyConfigured() | setFullyConfigured(Boolean fullyConfigured) |

## Example

```java
import com.maxio.advancedbilling.models.TaxConfiguration;
import com.maxio.advancedbilling.models.TaxConfigurationKind;
import com.maxio.advancedbilling.models.TaxDestinationAddress;

TaxConfiguration taxConfiguration = new TaxConfiguration.Builder()
    .kind(TaxConfigurationKind.CUSTOM)
    .destinationAddress(TaxDestinationAddress.SHIPPING_ONLY)
    .fullyConfigured(false)
    .build();
```

