
# Reason Code Response

## Structure

`ReasonCodeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReasonCode` | [`ReasonCode`](../../doc/models/reason-code.md) | Required | - | ReasonCode getReasonCode() | setReasonCode(ReasonCode reasonCode) |

## Example

```java
import com.maxio.advancedbilling.models.ReasonCode;
import com.maxio.advancedbilling.models.ReasonCodeResponse;

ReasonCodeResponse reasonCodeResponse = new ReasonCodeResponse.Builder(
    new ReasonCode.Builder()
        .id(240)
        .siteId(166)
        .code("code4")
        .description("description6")
        .position(14)
        .build()
)
.build();
```

