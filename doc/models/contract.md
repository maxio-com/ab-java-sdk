
# Contract

Contract linked to the scheduled renewal configuration.

## Structure

`Contract`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `MaxioId` | `String` | Optional | - | String getMaxioId() | setMaxioId(String maxioId) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `Register` | [`Register`](../../doc/models/register.md) | Optional | - | Register getRegister() | setRegister(Register register) |

## Example (as JSON)

```json
{
  "id": 136,
  "maxio_id": "maxio_id8",
  "number": "number6",
  "register": {
    "id": 54,
    "maxio_id": "maxio_id4",
    "name": "name2",
    "currency_code": "currency_code2"
  }
}
```

