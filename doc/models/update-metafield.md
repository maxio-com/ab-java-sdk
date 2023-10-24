
# Update Metafield

## Structure

`UpdateMetafield`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentName` | `String` | Optional | - | String getCurrentName() | setCurrentName(String currentName) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Scope` | [`MetafieldScope`](../../doc/models/metafield-scope.md) | Optional | Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings. | MetafieldScope getScope() | setScope(MetafieldScope scope) |
| `InputType` | [`MetafieldInput`](../../doc/models/metafield-input.md) | Optional | Indicates how data should be added to the metafield. For example, a text type is just a string, so a given metafield of this type can have any value attached. On the other hand, dropdown and radio have a set of allowed values that can be input, and appear differently on a Public Signup Page.<br>**Default**: `MetafieldInput.TEXT` | MetafieldInput getInputType() | setInputType(MetafieldInput inputType) |
| `Enum` | `List<String>` | Optional | Only applicable when input_type is radio or dropdown | List<String> getEnum() | setEnum(List<String> mEnum) |

## Example (as JSON)

```json
{
  "input_type": "text",
  "current_name": "current_name0",
  "name": "name6",
  "scope": {
    "csv": "0",
    "invoices": "0",
    "statements": "0",
    "portal": "0",
    "public_show": "0"
  },
  "enum": [
    "enum2"
  ]
}
```

