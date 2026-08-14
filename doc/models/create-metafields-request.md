
# Create Metafields Request

## Structure

`CreateMetafieldsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metafields` | [`CreateMetafieldsRequestMetafields`](../../doc/models/containers/create-metafields-request-metafields.md) | Required | This is a container for one-of cases. | CreateMetafieldsRequestMetafields getMetafields() | setMetafields(CreateMetafieldsRequestMetafields metafields) |

## Example

```java
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import java.util.Arrays;

CreateMetafieldsRequest createMetafieldsRequest = new CreateMetafieldsRequest.Builder(
    CreateMetafieldsRequestMetafields.fromCreateMetafield(
        new CreateMetafield.Builder()
            .name("my_field")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .publicEdit(IncludeOption.EXCLUDE)
                .build())
            .inputType(MetafieldInput.TEXT)
            .mEnum(Arrays.asList(
                "string"
            ))
            .build()
    )
)
.build();
```

