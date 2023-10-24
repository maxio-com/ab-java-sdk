
# Create Offer

## Structure

`CreateOffer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
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
  "product_price_point_id": 132
}
```

