
# Error Array Map Response Exception

## Structure

`ErrorArrayMapResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `Map<String, Object>` | Optional | - | Map<String, Object> getErrors() | setErrors(Map<String, Object> errors) |

## Example (as JSON)

```json
{
  "errors": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

