
# Calendar Billing

(Optional). Cannot be used when also specifying next_billing_at.

## Structure

`CalendarBilling`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SnapDay` | [`CalendarBillingSnapDay`](../../doc/models/containers/calendar-billing-snap-day.md) | Optional | This is a container for one-of cases. | CalendarBillingSnapDay getSnapDay() | setSnapDay(CalendarBillingSnapDay snapDay) |
| `CalendarBillingFirstCharge` | [`FirstChargeType`](../../doc/models/first-charge-type.md) | Optional | - | FirstChargeType getCalendarBillingFirstCharge() | setCalendarBillingFirstCharge(FirstChargeType calendarBillingFirstCharge) |

## Example

```java
import com.maxio.advancedbilling.models.CalendarBilling;
import com.maxio.advancedbilling.models.FirstChargeType;
import com.maxio.advancedbilling.models.containers.CalendarBillingSnapDay;

CalendarBilling calendarBilling = new CalendarBilling.Builder()
    .snapDay(CalendarBillingSnapDay.fromNumber(
        200
    ))
    .calendarBillingFirstCharge(FirstChargeType.DELAYED)
    .build();
```

