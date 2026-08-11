
# Multi Invoice Payment

## Structure

`MultiInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `Integer` | Optional | The numeric ID of the transaction. | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `TotalAmount` | `String` | Optional | Dollar amount of the sum of the paid invoices. | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `CurrencyCode` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of invoice transaction. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `Applications` | [`List<InvoicePaymentApplication>`](../../doc/models/invoice-payment-application.md) | Optional | - | List<InvoicePaymentApplication> getApplications() | setApplications(List<InvoicePaymentApplication> applications) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePaymentApplication;
import com.maxio.advancedbilling.models.MultiInvoicePayment;
import java.util.Arrays;

MultiInvoicePayment multiInvoicePayment = new MultiInvoicePayment.Builder()
    .transactionId(246)
    .totalAmount("total_amount0")
    .currencyCode("currency_code0")
    .applications(Arrays.asList(
        new InvoicePaymentApplication.Builder()
            .invoiceUid("invoice_uid8")
            .applicationUid("application_uid8")
            .appliedAmount("applied_amount0")
            .build(),
        new InvoicePaymentApplication.Builder()
            .invoiceUid("invoice_uid8")
            .applicationUid("application_uid8")
            .appliedAmount("applied_amount0")
            .build()
    ))
    .build();
```

