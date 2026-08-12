
# Event Response

## Structure

`EventResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`Event`](../../doc/models/event.md) | Required | - | Event getEvent() | setEvent(Event event) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Event;
import com.maxio.advancedbilling.models.EventKey;
import com.maxio.advancedbilling.models.EventResponse;
import com.maxio.advancedbilling.models.SubscriptionProductChange;
import com.maxio.advancedbilling.models.containers.EventEventSpecificData;

EventResponse eventResponse = new EventResponse.Builder(
    new Event.Builder(
        242L,
        EventKey.SUBSCRIPTION_REMOVED_FROM_GROUP,
        "message0",
        96,
        24,
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        EventEventSpecificData.fromSubscriptionProductChange(
            new SubscriptionProductChange.Builder(
                126,
                12
            )
            .previousProductPricePointId(250)
            .newProductPricePointId(244)
            .effectiveAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build()
        )
    )
    .build()
)
.build();
```

