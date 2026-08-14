
# Subscription Component Allocation Error Item

## Structure

`SubscriptionComponentAllocationErrorItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionComponentAllocationErrorItem;

SubscriptionComponentAllocationErrorItem subscriptionComponentAllocationErrorItem = new SubscriptionComponentAllocationErrorItem.Builder()
    .kind("kind6")
    .message("message8")
    .build();
```

