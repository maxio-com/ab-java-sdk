
# Component Price Point Error Exception

## Structure

`ComponentPricePointErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`List<ComponentPricePointErrorItem>`](../../doc/models/component-price-point-error-item.md) | Optional | - | List<ComponentPricePointErrorItem> getErrors() | setErrors(List<ComponentPricePointErrorItem> errors) |

## Example (as JSON)

```json
{
  "errors": [
    {
      "component_id": 236,
      "message": "message0",
      "price_point": 122
    },
    {
      "component_id": 236,
      "message": "message0",
      "price_point": 122
    }
  ]
}
```

