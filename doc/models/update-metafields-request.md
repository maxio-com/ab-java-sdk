
# Update Metafields Request

## Structure

`UpdateMetafieldsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metafields` | [`UpdateMetafieldsRequestMetafields`](../../doc/models/containers/update-metafields-request-metafields.md) | Optional | This is a container for one-of cases. | UpdateMetafieldsRequestMetafields getMetafields() | setMetafields(UpdateMetafieldsRequestMetafields metafields) |

## Example

```java
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.UpdateMetafield;
import com.maxio.advancedbilling.models.UpdateMetafieldsRequest;
import com.maxio.advancedbilling.models.containers.UpdateMetafieldsRequestMetafields;
import java.util.Arrays;

UpdateMetafieldsRequest updateMetafieldsRequest = new UpdateMetafieldsRequest.Builder()
    .metafields(UpdateMetafieldsRequestMetafields.fromUpdateMetafield(
        new UpdateMetafield.Builder()
            .currentName("current_name0")
            .name("name6")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .build())
            .inputType(MetafieldInput.BALANCE_TRACKER)
            .mEnum(Arrays.asList(
                "enum2"
            ))
            .build()
    ))
    .build();
```

