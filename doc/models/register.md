
# Register

## Structure

`Register`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `MaxioId` | `String` | Optional | - | String getMaxioId() | setMaxioId(String maxioId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `CurrencyCode` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of an invoice transaction. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |

## Example

```java
import com.maxio.advancedbilling.models.Register;

Register register = new Register.Builder()
    .id(54)
    .maxioId("maxio_id4")
    .name("name2")
    .currencyCode("currency_code2")
    .build();
```

