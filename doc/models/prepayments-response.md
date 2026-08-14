
# Prepayments Response

## Structure

`PrepaymentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayments` | [`List<Prepayment>`](../../doc/models/prepayment.md) | Optional | **Constraints**: *Unique Items Required* | List<Prepayment> getPrepayments() | setPrepayments(List<Prepayment> prepayments) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.PrepaymentMethod;
import com.maxio.advancedbilling.models.PrepaymentsResponse;
import java.util.Arrays;

PrepaymentsResponse prepaymentsResponse = new PrepaymentsResponse.Builder()
    .prepayments(Arrays.asList(
        new Prepayment.Builder(
            76,
            186,
            94L,
            220L,
            false,
            "memo0",
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
        )
        .refundedAmountInCents(170L)
        .details("details6")
        .paymentType(PrepaymentMethod.CASH)
        .build()
    ))
    .build();
```

