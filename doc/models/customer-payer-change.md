
# Customer Payer Change

## Structure

`CustomerPayerChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Before` | [`InvoicePayerChange`](../../doc/models/invoice-payer-change.md) | Required | - | InvoicePayerChange getBefore() | setBefore(InvoicePayerChange before) |
| `After` | [`InvoicePayerChange`](../../doc/models/invoice-payer-change.md) | Required | - | InvoicePayerChange getAfter() | setAfter(InvoicePayerChange after) |

## Example

```java
import com.maxio.advancedbilling.models.CustomerPayerChange;
import com.maxio.advancedbilling.models.InvoicePayerChange;

CustomerPayerChange customerPayerChange = new CustomerPayerChange.Builder(
    new InvoicePayerChange.Builder()
        .firstName("first_name0")
        .lastName("last_name8")
        .organization("organization4")
        .email("email6")
        .build(),
    new InvoicePayerChange.Builder()
        .firstName("first_name2")
        .lastName("last_name0")
        .organization("organization4")
        .email("email4")
        .build()
)
.build();
```

