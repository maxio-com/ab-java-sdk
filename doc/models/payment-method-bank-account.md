
# Payment Method Bank Account

## Structure

`PaymentMethodBankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaskedAccountNumber` | `String` | Required | - | String getMaskedAccountNumber() | setMaskedAccountNumber(String maskedAccountNumber) |
| `MaskedRoutingNumber` | `String` | Required | - | String getMaskedRoutingNumber() | setMaskedRoutingNumber(String maskedRoutingNumber) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodBankAccount;

PaymentMethodBankAccount paymentMethodBankAccount = new PaymentMethodBankAccount.Builder(
    "masked_account_number4",
    "masked_routing_number4",
    InvoiceEventPaymentMethod.BANK_ACCOUNT
)
.build();
```

