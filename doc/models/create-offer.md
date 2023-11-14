
# Create Offer

## Structure

`CreateOffer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Required | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `Components` | [`List<CreateOfferComponent>`](../../doc/models/create-offer-component.md) | Optional | - | List<CreateOfferComponent> getComponents() | setComponents(List<CreateOfferComponent> components) |
| `Coupons` | `List<String>` | Optional | - | List<String> getCoupons() | setCoupons(List<String> coupons) |

## Example (as JSON)

```json
{
  "name": "name4",
  "handle": "handle0",
  "description": "description4",
  "product_id": 208,
  "product_price_point_id": 132,
  "components": [
    {
      "component_id": 108,
      "starting_quantity": 84
    },
    {
      "component_id": 108,
      "starting_quantity": 84
    }
  ],
  "coupons": [
    "coupons4"
  ]
}
```

