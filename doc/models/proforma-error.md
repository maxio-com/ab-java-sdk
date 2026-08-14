
# Proforma Error

## Structure

`ProformaError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`BaseStringError`](../../doc/models/base-string-error.md) | Optional | The error is base if it is not directly associated with a single attribute. | BaseStringError getSubscription() | setSubscription(BaseStringError subscription) |

## Example

```java
import com.maxio.advancedbilling.models.BaseStringError;
import com.maxio.advancedbilling.models.ProformaError;
import java.util.Arrays;

ProformaError proformaError = new ProformaError.Builder()
    .subscription(new BaseStringError.Builder()
        .base(Arrays.asList(
            "base3",
            "base4"
        ))
        .build())
    .build();
```

