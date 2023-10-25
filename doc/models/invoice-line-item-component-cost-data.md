
# Invoice Line Item Component Cost Data

## Structure

`InvoiceLineItemComponentCostData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rates` | [`List<ComponentCostData>`](../../doc/models/component-cost-data.md) | Optional | - | List<ComponentCostData> getRates() | setRates(List<ComponentCostData> rates) |

## Example (as JSON)

```json
{
  "rates": [
    {
      "component_code_id": 116,
      "price_point_id": 226,
      "product_id": 94,
      "quantity": "quantity0",
      "amount": "amount6"
    },
    {
      "component_code_id": 116,
      "price_point_id": 226,
      "product_id": 94,
      "quantity": "quantity0",
      "amount": "amount6"
    },
    {
      "component_code_id": 116,
      "price_point_id": 226,
      "product_id": 94,
      "quantity": "quantity0",
      "amount": "amount6"
    }
  ]
}
```

