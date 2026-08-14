
# Prepayment

## Structure

`Prepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `AmountInCents` | `long` | Required | - | long getAmountInCents() | setAmountInCents(long amountInCents) |
| `RemainingAmountInCents` | `long` | Required | - | long getRemainingAmountInCents() | setRemainingAmountInCents(long remainingAmountInCents) |
| `RefundedAmountInCents` | `Long` | Optional | - | Long getRefundedAmountInCents() | setRefundedAmountInCents(Long refundedAmountInCents) |
| `Details` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDetails() | setDetails(String details) |
| `External` | `boolean` | Required | - | boolean getExternal() | setExternal(boolean external) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | The payment type of the prepayment. | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.PrepaymentMethod;

Prepayment prepayment = new Prepayment.Builder(
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
.build();
```

