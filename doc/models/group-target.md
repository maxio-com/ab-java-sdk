
# Group Target

Attributes of the target customer who will be the responsible payer of the created subscription. Required.

## Structure

`GroupTarget`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`GroupTargetType`](../../doc/models/group-target-type.md) | Required | The type of object indicated by the id attribute. | GroupTargetType getType() | setType(GroupTargetType type) |
| `Id` | `Integer` | Optional | The id of the target customer or subscription to group the existing subscription with. Ignored and should not be included if type is "self" , "parent", or "eldest" | Integer getId() | setId(Integer id) |

## Example (as JSON)

```json
{
  "type": "self",
  "id": 134
}
```

