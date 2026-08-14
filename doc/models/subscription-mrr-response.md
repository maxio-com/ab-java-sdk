
# Subscription MRR Response

## Structure

`SubscriptionMRRResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionsMrr` | [`List<SubscriptionMRR>`](../../doc/models/subscription-mrr.md) | Required | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<SubscriptionMRR> getSubscriptionsMrr() | setSubscriptionsMrr(List<SubscriptionMRR> subscriptionsMrr) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionMRR;
import com.maxio.advancedbilling.models.SubscriptionMRRBreakout;
import com.maxio.advancedbilling.models.SubscriptionMRRResponse;
import java.util.Arrays;

SubscriptionMRRResponse subscriptionMRRResponse = new SubscriptionMRRResponse.Builder(
    Arrays.asList(
        new SubscriptionMRR.Builder(
            0,
            0L
        )
        .breakouts(new SubscriptionMRRBreakout.Builder(
                0L,
                0L
            )
            .build())
        .build()
    )
)
.build();
```

