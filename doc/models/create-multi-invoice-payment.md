
# Create Multi Invoice Payment

## Structure

`CreateMultiInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Memo` | `String` | Optional | A description to be attached to the payment. | String getMemo() | setMemo(String memo) |
| `Details` | `String` | Optional | Additional information related to the payment method (eg. Check #). | String getDetails() | setDetails(String details) |
| `Method` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Optional | The type of payment method used. Defaults to other. | InvoicePaymentMethodType getMethod() | setMethod(InvoicePaymentMethodType method) |
| `Amount` | [`CreateMultiInvoicePaymentAmount`](../../doc/models/containers/create-multi-invoice-payment-amount.md) | Required | This is a container for one-of cases. | CreateMultiInvoicePaymentAmount getAmount() | setAmount(CreateMultiInvoicePaymentAmount amount) |
| `ReceivedOn` | `String` | Optional | Date reflecting when the payment was received from a customer. Must be in the past. | String getReceivedOn() | setReceivedOn(String receivedOn) |
| `Applications` | [`List<CreateInvoicePaymentApplication>`](../../doc/models/create-invoice-payment-application.md) | Required | - | List<CreateInvoicePaymentApplication> getApplications() | setApplications(List<CreateInvoicePaymentApplication> applications) |

## Example

```java
import com.maxio.advancedbilling.models.CreateInvoicePaymentApplication;
import com.maxio.advancedbilling.models.CreateMultiInvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.containers.CreateMultiInvoicePaymentAmount;
import java.util.Arrays;

CreateMultiInvoicePayment createMultiInvoicePayment = new CreateMultiInvoicePayment.Builder(
    CreateMultiInvoicePaymentAmount.fromString(
        "String9"
    ),
    Arrays.asList(
        new CreateInvoicePaymentApplication.Builder(
            "invoice_uid8",
            "amount0"
        )
        .build()
    )
)
.memo("memo0")
.details("details6")
.method(InvoicePaymentMethodType.ACH)
.receivedOn("received_on8")
.build();
```

