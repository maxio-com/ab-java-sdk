
# Void Invoice

## Structure

`VoidInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getReason() | setReason(String reason) |

## Example

```java
import com.maxio.advancedbilling.models.VoidInvoice;

VoidInvoice voidInvoice = new VoidInvoice.Builder(
    "reason8"
)
.build();
```

