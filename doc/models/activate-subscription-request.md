
# Activate Subscription Request

## Structure

`ActivateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RevertOnFailure` | `Boolean` | Optional | You may choose how to handle the activation failure. `true` means do not change the subscription’s state and billing period. `false` means to continue through with the activation and enter an end-of-life state. If this parameter is omitted or `null` is passed it will default to the value set in the site settings (default: `true`). | Boolean getRevertOnFailure() | setRevertOnFailure(Boolean revertOnFailure) |

## Example

```java
import com.maxio.advancedbilling.models.ActivateSubscriptionRequest;

ActivateSubscriptionRequest activateSubscriptionRequest = new ActivateSubscriptionRequest.Builder()
    .revertOnFailure(false)
    .build();
```

