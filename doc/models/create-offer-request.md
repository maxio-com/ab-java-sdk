
# Create Offer Request

## Structure

`CreateOfferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offer` | [`CreateOffer`](../../doc/models/create-offer.md) | Required | - | CreateOffer getOffer() | setOffer(CreateOffer offer) |

## Example (as JSON)

```json
{
  "offer": {
    "name": "name4",
    "handle": "handle0",
    "description": "description6",
    "product_id": 30,
    "product_price_point_id": 150,
    "components": [
      {
        "component_id": 108,
        "price_point_id": 124,
        "starting_quantity": 84
      },
      {
        "component_id": 108,
        "price_point_id": 124,
        "starting_quantity": 84
      }
    ],
    "coupons": [
      "coupons6"
    ]
  }
}
```

