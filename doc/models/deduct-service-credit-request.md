
# Deduct Service Credit Request

## Structure

`DeductServiceCreditRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Deduction` | [`DeductServiceCredit`](../../doc/models/deduct-service-credit.md) | Required | - | DeductServiceCredit getDeduction() | setDeduction(DeductServiceCredit deduction) |

## Example

```java
import com.maxio.advancedbilling.models.DeductServiceCredit;
import com.maxio.advancedbilling.models.DeductServiceCreditRequest;
import com.maxio.advancedbilling.models.containers.DeductServiceCreditAmount;

DeductServiceCreditRequest deductServiceCreditRequest = new DeductServiceCreditRequest.Builder(
    new DeductServiceCredit.Builder(
        DeductServiceCreditAmount.fromString(
            "String9"
        )
    )
    .memo("memo0")
    .build()
)
.build();
```

