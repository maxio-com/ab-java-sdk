
# Renewal Preview Component

## Structure

`RenewalPreviewComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`RenewalPreviewComponentComponentId`](../../doc/models/containers/renewal-preview-component-component-id.md) | Optional | This is a container for one-of cases. | RenewalPreviewComponentComponentId getComponentId() | setComponentId(RenewalPreviewComponentComponentId componentId) |
| `Quantity` | `Integer` | Optional | The quantity for which you wish to preview billing. This is useful if you want to preview a predicted, higher usage value than is currently present on the subscription.<br><br>This quantity represents:<br><br>- Whether or not an on/off component is enabled - use 0 for disabled or 1 for enabled<br>- The desired allocated_quantity for a quantity-based component<br>- The desired unit_balance for a metered component<br>- The desired metric quantity for an events-based component | Integer getQuantity() | setQuantity(Integer quantity) |
| `PricePointId` | [`RenewalPreviewComponentPricePointId`](../../doc/models/containers/renewal-preview-component-price-point-id.md) | Optional | This is a container for one-of cases. | RenewalPreviewComponentPricePointId getPricePointId() | setPricePointId(RenewalPreviewComponentPricePointId pricePointId) |

## Example (as JSON)

```json
{
  "component_id": "String7",
  "quantity": 174,
  "price_point_id": "String1"
}
```

