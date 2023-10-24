
# Payment Method External Type

## Structure

`PaymentMethodExternalType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `Type` | `String` | Optional | **Default**: `"external"` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "type": "external",
  "details": "details0",
  "kind": "kind8",
  "memo": "memo4"
}
```

