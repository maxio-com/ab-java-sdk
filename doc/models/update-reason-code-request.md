
# Update Reason Code Request

## Structure

`UpdateReasonCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReasonCode` | [`UpdateReasonCode`](../../doc/models/update-reason-code.md) | Required | - | UpdateReasonCode getReasonCode() | setReasonCode(UpdateReasonCode reasonCode) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateReasonCode;
import com.maxio.advancedbilling.models.UpdateReasonCodeRequest;

UpdateReasonCodeRequest updateReasonCodeRequest = new UpdateReasonCodeRequest.Builder(
    new UpdateReasonCode.Builder()
        .code("code4")
        .description("description6")
        .position(14)
        .build()
)
.build();
```

