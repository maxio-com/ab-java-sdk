
# Tax Configuration

## Structure

`TaxConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | [`TaxConfigurationKind`](../../doc/models/tax-configuration-kind.md) | Optional | **Default**: `TaxConfigurationKind.CUSTOM` | TaxConfigurationKind getKind() | setKind(TaxConfigurationKind kind) |
| `DestinationAddress` | [`TaxDestinationAddress`](../../doc/models/tax-destination-address.md) | Optional | - | TaxDestinationAddress getDestinationAddress() | setDestinationAddress(TaxDestinationAddress destinationAddress) |
| `FullyConfigured` | `Boolean` | Optional | Returns `true` when Chargify has been properly configured to charge tax using the specified tax system. More details about taxes: https://maxio-chargify.zendesk.com/hc/en-us/articles/5405488905869-Taxes-Introduction<br>**Default**: `false` | Boolean getFullyConfigured() | setFullyConfigured(Boolean fullyConfigured) |

## Example (as JSON)

```json
{
  "kind": "custom",
  "fully_configured": false,
  "destination_address": "shipping_only"
}
```

