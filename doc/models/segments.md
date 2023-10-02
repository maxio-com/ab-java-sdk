
# Segments

## Structure

`Segments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `X` | [`X`](../../doc/models/x.md) | Optional | An attribute 'x' would be changed for a number (an index in request array) where the error occured.<br><br>In this object, the key represents the field and the value is an array with error messages. In most cases this object would contain just one key. | X getX() | setX(X x) |

## Example (as JSON)

```json
{
  "'x'": {
    "base": [
      "base9",
      "base0",
      "base1"
    ],
    "pricing_scheme": [
      "pricing_scheme1",
      "pricing_scheme0",
      "pricing_scheme9"
    ],
    "prices": [
      "prices3",
      "prices2",
      "prices1"
    ],
    "property_values_fingerprint": [
      "property_values_fingerprint5",
      "property_values_fingerprint4"
    ]
  }
}
```

