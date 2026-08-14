
# Delete Subscription Group Response

## Structure

`DeleteSubscriptionGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Deleted` | `Boolean` | Optional | - | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example

```java
import com.maxio.advancedbilling.models.DeleteSubscriptionGroupResponse;

DeleteSubscriptionGroupResponse deleteSubscriptionGroupResponse = new DeleteSubscriptionGroupResponse.Builder()
    .uid("uid0")
    .deleted(false)
    .build();
```

