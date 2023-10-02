
# Tax Configuration

## Structure

`TaxConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | [`TaxConfigurationKindEnum`](../../doc/models/tax-configuration-kind-enum.md) | Optional | **Default**: `TaxConfigurationKindEnum.CUSTOM` | TaxConfigurationKindEnum getKind() | setKind(TaxConfigurationKindEnum kind) |
| `DestinationAddress` | [`TaxDestinationAddressEnum`](../../doc/models/tax-destination-address-enum.md) | Optional | - | TaxDestinationAddressEnum getDestinationAddress() | setDestinationAddress(TaxDestinationAddressEnum destinationAddress) |
| `FullyConfigured` | `Boolean` | Optional | Returns `true` when Chargify has been properly configured to charge tax using the specified tax system. More details about taxes: https://maxio-chargify.zendesk.com/hc/en-us/articles/5405488905869-Taxes-Introduction<br>**Default**: `false` | Boolean getFullyConfigured() | setFullyConfigured(Boolean fullyConfigured) |

## Example (as JSON)

```json
{
  "kind": "custom",
  "fully_configured": false,
  "destination_address": "shipping_only"
}
```

