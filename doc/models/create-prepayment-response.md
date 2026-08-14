
# Create Prepayment Response

## Structure

`CreatePrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`CreatedPrepayment`](../../doc/models/created-prepayment.md) | Required | - | CreatedPrepayment getPrepayment() | setPrepayment(CreatedPrepayment prepayment) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreatePrepaymentResponse;
import com.maxio.advancedbilling.models.CreatedPrepayment;

CreatePrepaymentResponse createPrepaymentResponse = new CreatePrepaymentResponse.Builder(
    new CreatedPrepayment.Builder()
        .id(38L)
        .subscriptionId(148)
        .amountInCents(124L)
        .memo("memo2")
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build()
)
.build();
```

