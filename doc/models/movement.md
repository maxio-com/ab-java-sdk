
# Movement

## Structure

`Movement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Timestamp` | `ZonedDateTime` | Optional | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `AmountFormatted` | `String` | Optional | - | String getAmountFormatted() | setAmountFormatted(String amountFormatted) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Category` | `String` | Optional | - | String getCategory() | setCategory(String category) |
| `Breakouts` | [`Breakouts`](../../doc/models/breakouts.md) | Optional | - | Breakouts getBreakouts() | setBreakouts(Breakouts breakouts) |
| `LineItems` | [`List<MovementLineItem>`](../../doc/models/movement-line-item.md) | Optional | - | List<MovementLineItem> getLineItems() | setLineItems(List<MovementLineItem> lineItems) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `SubscriberName` | `String` | Optional | - | String getSubscriberName() | setSubscriberName(String subscriberName) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Movement;

Movement movement = new Movement.Builder()
    .timestamp(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .amountInCents(34L)
    .amountFormatted("amount_formatted6")
    .description("description4")
    .category("category2")
    .build();
```

