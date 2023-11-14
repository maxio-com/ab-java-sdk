
# Metafield

## Structure

`Metafield`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Scope` | [`MetafieldScope`](../../doc/models/metafield-scope.md) | Optional | Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings. | MetafieldScope getScope() | setScope(MetafieldScope scope) |
| `DataCount` | `Integer` | Optional | the amount of subscriptions this metafield has been applied to in Chargify | Integer getDataCount() | setDataCount(Integer dataCount) |
| `InputType` | `String` | Optional | - | String getInputType() | setInputType(String inputType) |
| `Enum` | [`MetafieldEnum`](../../doc/models/containers/metafield-enum.md) | Optional | This is a container for one-of cases. | MetafieldEnum getEnum() | setEnum(MetafieldEnum mEnum) |

## Example (as JSON)

```json
{
  "id": 52,
  "name": "name8",
  "scope": {
    "csv": "0",
    "invoices": "0",
    "statements": "0",
    "portal": "0",
    "public_show": "0"
  },
  "data_count": 216,
  "input_type": "input_type0"
}
```

