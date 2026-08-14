
# Deduct Service Credit

## Structure

`DeductServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`DeductServiceCreditAmount`](../../doc/models/containers/deduct-service-credit-amount.md) | Required | This is a container for one-of cases. | DeductServiceCreditAmount getAmount() | setAmount(DeductServiceCreditAmount amount) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example

```java
import com.maxio.advancedbilling.models.DeductServiceCredit;
import com.maxio.advancedbilling.models.containers.DeductServiceCreditAmount;

DeductServiceCredit deductServiceCredit = new DeductServiceCredit.Builder(
    DeductServiceCreditAmount.fromString(
        "String5"
    )
)
.memo("memo6")
.build();
```

