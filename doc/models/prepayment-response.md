
# Prepayment Response

## Structure

`PrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`Prepayment`](../../doc/models/prepayment.md) | Required | - | Prepayment getPrepayment() | setPrepayment(Prepayment prepayment) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.PrepaymentMethod;
import com.maxio.advancedbilling.models.PrepaymentResponse;

PrepaymentResponse prepaymentResponse = new PrepaymentResponse.Builder(
    new Prepayment.Builder(
        38,
        148,
        124L,
        182L,
        false,
        "memo2",
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
    )
    .refundedAmountInCents(132L)
    .details("details8")
    .paymentType(PrepaymentMethod.CREDIT_CARD)
    .build()
)
.build();
```

