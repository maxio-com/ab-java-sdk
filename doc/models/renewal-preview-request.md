
# Renewal Preview Request

## Structure

`RenewalPreviewRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Components` | [`List<RenewalPreviewComponent>`](../../doc/models/renewal-preview-component.md) | Optional | (Optional) Array of component definitions to preview. Providing any component definitions here will override the actual components on the subscription (and their quantities), and the billing preview will contain only these components (in addition to any product base fees). | List<RenewalPreviewComponent> getComponents() | setComponents(List<RenewalPreviewComponent> components) |

## Example

```java
import com.maxio.advancedbilling.models.RenewalPreviewComponent;
import com.maxio.advancedbilling.models.RenewalPreviewRequest;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentComponentId;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentPricePointId;
import java.util.Arrays;

RenewalPreviewRequest renewalPreviewRequest = new RenewalPreviewRequest.Builder()
    .components(Arrays.asList(
        new RenewalPreviewComponent.Builder()
            .componentId(RenewalPreviewComponentComponentId.fromString(
                "String5"
            ))
            .quantity(210)
            .pricePointId(RenewalPreviewComponentPricePointId.fromString(
                "String3"
            ))
            .build()
    ))
    .build();
```

