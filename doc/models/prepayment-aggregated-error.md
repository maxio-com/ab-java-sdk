
# Prepayment Aggregated Error

## Structure

`PrepaymentAggregatedError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `List<String>` | Optional | - | List<String> getAmountInCents() | setAmountInCents(List<String> amountInCents) |
| `Base` | `List<String>` | Optional | - | List<String> getBase() | setBase(List<String> base) |
| `External` | `List<String>` | Optional | - | List<String> getExternal() | setExternal(List<String> external) |

## Example (as JSON)

```json
{
  "amount_in_cents": [
    "amount_in_cents7",
    "amount_in_cents6",
    "amount_in_cents5"
  ],
  "base": [
    "base7",
    "base8"
  ],
  "external": [
    "external0",
    "external1",
    "external2"
  ]
}
```

