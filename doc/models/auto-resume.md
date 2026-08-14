
# Auto Resume

## Structure

`AutoResume`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AutomaticallyResumeAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getAutomaticallyResumeAt() | setAutomaticallyResumeAt(ZonedDateTime automaticallyResumeAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AutoResume;

AutoResume autoResume = new AutoResume.Builder()
    .automaticallyResumeAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

