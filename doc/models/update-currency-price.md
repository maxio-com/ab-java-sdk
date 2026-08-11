
# Update Currency Price

## Structure

`UpdateCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | ID of the currency price record being updated | int getId() | setId(int id) |
| `Price` | `double` | Required | New price for the given currency | double getPrice() | setPrice(double price) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateCurrencyPrice;

UpdateCurrencyPrice updateCurrencyPrice = new UpdateCurrencyPrice.Builder(
    104,
    163.6D
)
.build();
```

