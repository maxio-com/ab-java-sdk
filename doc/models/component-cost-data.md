
# Component Cost Data

## Structure

`ComponentCostData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentCodeId` | `Integer` | Optional | - | Integer getComponentCodeId() | setComponentCodeId(Integer componentCodeId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `Quantity` | `String` | Optional | - | String getQuantity() | setQuantity(String quantity) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |
| `PricingScheme` | [`ComponentCostDataPricingScheme`](../../doc/models/containers/component-cost-data-pricing-scheme.md) | Optional | This is a container for one-of cases. | ComponentCostDataPricingScheme getPricingScheme() | setPricingScheme(ComponentCostDataPricingScheme pricingScheme) |
| `Tiers` | [`List<ComponentCostDataRateTier>`](../../doc/models/component-cost-data-rate-tier.md) | Optional | - | List<ComponentCostDataRateTier> getTiers() | setTiers(List<ComponentCostDataRateTier> tiers) |

## Example (as JSON)

```json
{
  "component_code_id": 16,
  "price_point_id": 186,
  "product_id": 250,
  "quantity": "quantity8",
  "amount": "amount4"
}
```

