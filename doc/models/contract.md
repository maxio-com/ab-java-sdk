
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

## Example

```java
import com.maxio.advancedbilling.models.Contract;
import com.maxio.advancedbilling.models.Register;

Contract contract = new Contract.Builder()
    .id(112)
    .maxioId("maxio_id6")
    .number("number2")
    .register(new Register.Builder()
        .id(54)
        .maxioId("maxio_id4")
        .name("name2")
        .currencyCode("currency_code2")
        .build())
    .build();
```

