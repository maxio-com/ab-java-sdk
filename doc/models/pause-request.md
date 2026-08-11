
# Pause Request

Allows you to pause a Subscription.

## Structure

`PauseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Hold` | [`AutoResume`](../../doc/models/auto-resume.md) | Optional | - | AutoResume getHold() | setHold(AutoResume hold) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AutoResume;
import com.maxio.advancedbilling.models.PauseRequest;

PauseRequest pauseRequest = new PauseRequest.Builder()
    .hold(new AutoResume.Builder()
        .automaticallyResumeAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build())
    .build();
```

