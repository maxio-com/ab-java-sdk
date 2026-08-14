
# Dunner Data

## Structure

`DunnerData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `RevenueAtRiskInCents` | `long` | Required | - | long getRevenueAtRiskInCents() | setRevenueAtRiskInCents(long revenueAtRiskInCents) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `Attempts` | `int` | Required | - | int getAttempts() | setAttempts(int attempts) |
| `LastAttemptedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getLastAttemptedAt() | setLastAttemptedAt(ZonedDateTime lastAttemptedAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.DunnerData;

DunnerData dunnerData = new DunnerData.Builder(
    "state4",
    230,
    134L,
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    6,
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

