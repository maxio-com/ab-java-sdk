
# Create Prepayment Request

## Structure

`CreatePrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`CreatePrepayment`](../../doc/models/create-prepayment.md) | Required | - | CreatePrepayment getPrepayment() | setPrepayment(CreatePrepayment prepayment) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;

CreatePrepaymentRequest createPrepaymentRequest = new CreatePrepaymentRequest.Builder(
    new CreatePrepayment.Builder(
        11.6D,
        "details8",
        "memo2",
        CreatePrepaymentMethod.MONEY_ORDER
    )
    .paymentProfileId(240)
    .build()
)
.build();
```

