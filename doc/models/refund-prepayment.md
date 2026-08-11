
# Refund Prepayment

## Structure

`RefundPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `Long` | Required | `amount` is not required if you pass `amount_in_cents`. | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Amount` | [`RefundPrepaymentAmount`](../../doc/models/containers/refund-prepayment-amount.md) | Required | This is a container for one-of cases. | RefundPrepaymentAmount getAmount() | setAmount(RefundPrepaymentAmount amount) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `External` | `Boolean` | Optional | Specify the type of refund you wish to initiate. When the prepayment is external, the `external` flag is optional. But if the prepayment was made through a payment profile, the `external` flag is required. | Boolean getExternal() | setExternal(Boolean external) |

## Example

```java
import com.maxio.advancedbilling.models.RefundPrepayment;
import com.maxio.advancedbilling.models.containers.RefundPrepaymentAmount;

RefundPrepayment refundPrepayment = new RefundPrepayment.Builder(
    22L,
    RefundPrepaymentAmount.fromString(
        "String1"
    ),
    "memo2"
)
.external(false)
.build();
```

