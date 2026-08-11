
# Reactivate Subscription Group Request

## Structure

`ReactivateSubscriptionGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Resume` | `Boolean` | Optional | - | Boolean getResume() | setResume(Boolean resume) |
| `ResumeMembers` | `Boolean` | Optional | - | Boolean getResumeMembers() | setResumeMembers(Boolean resumeMembers) |

## Example

```java
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupRequest;

ReactivateSubscriptionGroupRequest reactivateSubscriptionGroupRequest = new ReactivateSubscriptionGroupRequest.Builder()
    .resume(false)
    .resumeMembers(false)
    .build();
```

