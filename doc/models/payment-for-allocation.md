
# Payment for Allocation

Information for captured payment, if applicable

## Structure

`PaymentForAllocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Success` | `Boolean` | Optional | - | Boolean getSuccess() | setSuccess(Boolean success) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example

```java
import com.maxio.advancedbilling.models.PaymentForAllocation;

PaymentForAllocation paymentForAllocation = new PaymentForAllocation.Builder()
    .id(68)
    .amountInCents(102L)
    .success(false)
    .memo("memo6")
    .build();
```

