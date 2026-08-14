
# Event

## Structure

`Event`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Key` | [`EventKey`](../../doc/models/event-key.md) | Required | - | EventKey getKey() | setKey(EventKey key) |
| `Message` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMessage() | setMessage(String message) |
| `SubscriptionId` | `Integer` | Required | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `CustomerId` | `Integer` | Required | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `EventSpecificData` | [`EventEventSpecificData`](../../doc/models/containers/event-event-specific-data.md) | Required | This is a container for one-of cases. | EventEventSpecificData getEventSpecificData() | setEventSpecificData(EventEventSpecificData eventSpecificData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Event;
import com.maxio.advancedbilling.models.EventKey;
import com.maxio.advancedbilling.models.SubscriptionProductChange;
import com.maxio.advancedbilling.models.containers.EventEventSpecificData;

Event event = new Event.Builder(
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
.build();
```

