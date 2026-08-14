
# Created Prepayment

## Structure

`CreatedPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | **Constraints**: `>= 1` | Long getId() | setId(Long id) |
| `SubscriptionId` | `Integer` | Optional | **Constraints**: `>= 1` | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `AmountInCents` | `Long` | Optional | **Constraints**: `>= 0.01` | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `StartingBalanceInCents` | `Long` | Optional | **Constraints**: `>= 0` | Long getStartingBalanceInCents() | setStartingBalanceInCents(Long startingBalanceInCents) |
| `EndingBalanceInCents` | `Long` | Optional | - | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreatedPrepayment;

CreatedPrepayment createdPrepayment = new CreatedPrepayment.Builder()
    .id(186L)
    .subscriptionId(40)
    .amountInCents(240L)
    .memo("memo6")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

