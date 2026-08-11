
# Renewal Preview Response

## Structure

`RenewalPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RenewalPreview` | [`RenewalPreview`](../../doc/models/renewal-preview.md) | Required | - | RenewalPreview getRenewalPreview() | setRenewalPreview(RenewalPreview renewalPreview) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.RenewalPreview;
import com.maxio.advancedbilling.models.RenewalPreviewResponse;

RenewalPreviewResponse renewalPreviewResponse = new RenewalPreviewResponse.Builder(
    new RenewalPreview.Builder()
        .nextAssessmentAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .subtotalInCents(132L)
        .totalTaxInCents(0L)
        .totalDiscountInCents(250L)
        .totalInCents(20L)
        .build()
)
.build();
```

