
# MRR

## Structure

`MRR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `AmountFormatted` | `String` | Optional | - | String getAmountFormatted() | setAmountFormatted(String amountFormatted) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CurrencySymbol` | `String` | Optional | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Breakouts` | [`Breakouts`](../../doc/models/breakouts.md) | Optional | - | Breakouts getBreakouts() | setBreakouts(Breakouts breakouts) |
| `AtTime` | `ZonedDateTime` | Optional | ISO8601 timestamp | ZonedDateTime getAtTime() | setAtTime(ZonedDateTime atTime) |

## Example

```java
import com.maxio.advancedbilling.models.Breakouts;
import com.maxio.advancedbilling.models.MRR;

MRR mRR = new MRR.Builder()
    .amountInCents(122L)
    .amountFormatted("amount_formatted4")
    .currency("currency2")
    .currencySymbol("currency_symbol0")
    .breakouts(new Breakouts.Builder()
        .planAmountInCents(254L)
        .planAmountFormatted("plan_amount_formatted0")
        .usageAmountInCents(106L)
        .usageAmountFormatted("usage_amount_formatted8")
        .build())
    .build();
```

