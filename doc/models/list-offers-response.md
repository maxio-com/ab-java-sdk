
# List Offers Response

## Structure

`ListOffersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offers` | [`List<Offer>`](../../doc/models/offer.md) | Optional | - | List<Offer> getOffers() | setOffers(List<Offer> offers) |

## Example (as JSON)

```json
{
  "offers": [
    {
      "id": 12,
      "site_id": 194,
      "product_family_id": 16,
      "product_id": 210,
      "product_price_point_id": 134
    },
    {
      "id": 12,
      "site_id": 194,
      "product_family_id": 16,
      "product_id": 210,
      "product_price_point_id": 134
    },
    {
      "id": 12,
      "site_id": 194,
      "product_family_id": 16,
      "product_id": 210,
      "product_price_point_id": 134
    }
  ]
}
```

