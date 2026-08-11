
# Create Reason Code Request

## Structure

`CreateReasonCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReasonCode` | [`CreateReasonCode`](../../doc/models/create-reason-code.md) | Required | - | CreateReasonCode getReasonCode() | setReasonCode(CreateReasonCode reasonCode) |

## Example

```java
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;

CreateReasonCodeRequest createReasonCodeRequest = new CreateReasonCodeRequest.Builder(
    new CreateReasonCode.Builder(
        "code4",
        "description6"
    )
    .position(14)
    .build()
)
.build();
```

