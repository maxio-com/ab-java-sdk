
# Coupon Subcodes Response

## Structure

`CouponSubcodesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedCodes` | `List<String>` | Optional | - | List<String> getCreatedCodes() | setCreatedCodes(List<String> createdCodes) |
| `DuplicateCodes` | `List<String>` | Optional | - | List<String> getDuplicateCodes() | setDuplicateCodes(List<String> duplicateCodes) |
| `InvalidCodes` | `List<String>` | Optional | - | List<String> getInvalidCodes() | setInvalidCodes(List<String> invalidCodes) |

## Example (as JSON)

```json
{
  "created_codes": [
    "created_codes1",
    "created_codes2"
  ],
  "duplicate_codes": [
    "duplicate_codes8",
    "duplicate_codes7"
  ],
  "invalid_codes": [
    "invalid_codes0",
    "invalid_codes9",
    "invalid_codes8"
  ]
}
```

