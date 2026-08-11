
# Resume Options

## Structure

`ResumeOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequireResume` | `Boolean` | Optional | Chargify will only attempt to resume the subscription's billing period. If not resumable, the subscription will be left in its current state. | Boolean getRequireResume() | setRequireResume(Boolean requireResume) |
| `ForgiveBalance` | `Boolean` | Optional | Indicates whether or not Chargify should clear the subscription's existing balance before attempting to resume the subscription. If subscription cannot be resumed, the balance will remain as it was before the attempt to resume was made. | Boolean getForgiveBalance() | setForgiveBalance(Boolean forgiveBalance) |

## Example

```java
import com.maxio.advancedbilling.models.ResumeOptions;

ResumeOptions resumeOptions = new ResumeOptions.Builder()
    .requireResume(false)
    .forgiveBalance(false)
    .build();
```

