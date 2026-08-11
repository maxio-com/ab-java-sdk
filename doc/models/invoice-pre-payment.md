
# Invoice Pre Payment

## Structure

`InvoicePrePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `Integer` | Optional | The subscription id for the prepayment account | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `AmountInCents` | `Long` | Optional | The amount in cents of the prepayment that was created as a result of this payment. | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `EndingBalanceInCents` | `Long` | Optional | The total balance of the prepayment account for this subscription including any prior prepayments | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePrePayment;

InvoicePrePayment invoicePrePayment = new InvoicePrePayment.Builder()
    .subscriptionId(252)
    .amountInCents(28L)
    .endingBalanceInCents(244L)
    .build();
```

