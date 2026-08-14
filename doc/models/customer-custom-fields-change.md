
# Customer Custom Fields Change

## Structure

`CustomerCustomFieldsChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Before` | [`List<InvoiceCustomField>`](../../doc/models/invoice-custom-field.md) | Required | - | List<InvoiceCustomField> getBefore() | setBefore(List<InvoiceCustomField> before) |
| `After` | [`List<InvoiceCustomField>`](../../doc/models/invoice-custom-field.md) | Required | - | List<InvoiceCustomField> getAfter() | setAfter(List<InvoiceCustomField> after) |

## Example

```java
import com.maxio.advancedbilling.models.CustomFieldOwner;
import com.maxio.advancedbilling.models.CustomerCustomFieldsChange;
import com.maxio.advancedbilling.models.InvoiceCustomField;
import java.util.Arrays;

CustomerCustomFieldsChange customerCustomFieldsChange = new CustomerCustomFieldsChange.Builder(
    Arrays.asList(
        new InvoiceCustomField.Builder()
            .ownerId(26)
            .ownerType(CustomFieldOwner.CUSTOMER)
            .name("name0")
            .value("value2")
            .metadatumId(26)
            .build()
    ),
    Arrays.asList(
        new InvoiceCustomField.Builder()
            .ownerId(130)
            .ownerType(CustomFieldOwner.CUSTOMER)
            .name("name2")
            .value("value4")
            .metadatumId(130)
            .build()
    )
)
.build();
```

