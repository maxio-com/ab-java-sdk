
# Proration

## Structure

`Proration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreservePeriod` | `Boolean` | Optional | The alternative to sending preserve_period as a direct attribute to migration | Boolean getPreservePeriod() | setPreservePeriod(Boolean preservePeriod) |

## Example

```java
import com.maxio.advancedbilling.models.Proration;

Proration proration = new Proration.Builder()
    .preservePeriod(false)
    .build();
```

