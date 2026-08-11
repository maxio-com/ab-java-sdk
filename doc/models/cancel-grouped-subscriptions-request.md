
# Cancel Grouped Subscriptions Request

## Structure

`CancelGroupedSubscriptionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargeUnbilledUsage` | `Boolean` | Optional | - | Boolean getChargeUnbilledUsage() | setChargeUnbilledUsage(Boolean chargeUnbilledUsage) |

## Example

```java
import com.maxio.advancedbilling.models.CancelGroupedSubscriptionsRequest;

CancelGroupedSubscriptionsRequest cancelGroupedSubscriptionsRequest = new CancelGroupedSubscriptionsRequest.Builder()
    .chargeUnbilledUsage(false)
    .build();
```

