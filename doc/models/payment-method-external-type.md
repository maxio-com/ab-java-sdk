
# Payment Method External Type

## Structure

`PaymentMethodExternalType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Required | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Type` | `String` | Required | **Default**: `"external"` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "details": "details0",
  "kind": "kind8",
  "memo": "memo4",
  "type": "external"
}
```

