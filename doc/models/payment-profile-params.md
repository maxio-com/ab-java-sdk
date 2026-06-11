
# Payment Profile Params

PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never included.

## Structure

`PaymentProfileParams`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `CardType` | `String` | Optional | - | String getCardType() | setCardType(String cardType) |

## Example (as JSON)

```json
{
  "first_name": "first_name2",
  "last_name": "last_name0",
  "card_type": "card_type8"
}
```

