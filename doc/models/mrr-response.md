
# MRR Response

## Structure

`MRRResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mrr` | [`MRR`](../../doc/models/mrr.md) | Required | - | MRR getMrr() | setMrr(MRR mrr) |

## Example

```java
import com.maxio.advancedbilling.models.Breakouts;
import com.maxio.advancedbilling.models.MRR;
import com.maxio.advancedbilling.models.MRRResponse;

MRRResponse mRRResponse = new MRRResponse.Builder(
    new MRR.Builder()
        .amountInCents(198L)
        .amountFormatted("amount_formatted6")
        .currency("currency4")
        .currencySymbol("currency_symbol2")
        .breakouts(new Breakouts.Builder()
            .planAmountInCents(254L)
            .planAmountFormatted("plan_amount_formatted0")
            .usageAmountInCents(106L)
            .usageAmountFormatted("usage_amount_formatted8")
            .build())
        .build()
)
.build();
```

