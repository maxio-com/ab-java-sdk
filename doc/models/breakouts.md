
# Breakouts

## Structure

`Breakouts`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanAmountInCents` | `Long` | Optional | - | Long getPlanAmountInCents() | setPlanAmountInCents(Long planAmountInCents) |
| `PlanAmountFormatted` | `String` | Optional | - | String getPlanAmountFormatted() | setPlanAmountFormatted(String planAmountFormatted) |
| `UsageAmountInCents` | `Long` | Optional | - | Long getUsageAmountInCents() | setUsageAmountInCents(Long usageAmountInCents) |
| `UsageAmountFormatted` | `String` | Optional | - | String getUsageAmountFormatted() | setUsageAmountFormatted(String usageAmountFormatted) |

## Example

```java
import com.maxio.advancedbilling.models.Breakouts;

Breakouts breakouts = new Breakouts.Builder()
    .planAmountInCents(254L)
    .planAmountFormatted("plan_amount_formatted0")
    .usageAmountInCents(106L)
    .usageAmountFormatted("usage_amount_formatted8")
    .build();
```

