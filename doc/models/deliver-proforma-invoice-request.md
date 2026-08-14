
# Deliver Proforma Invoice Request

## Structure

`DeliverProformaInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecipientEmails` | `List<String>` | Optional | - | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `CcRecipientEmails` | `List<String>` | Optional | - | List<String> getCcRecipientEmails() | setCcRecipientEmails(List<String> ccRecipientEmails) |
| `BccRecipientEmails` | `List<String>` | Optional | - | List<String> getBccRecipientEmails() | setBccRecipientEmails(List<String> bccRecipientEmails) |

## Example

```java
import com.maxio.advancedbilling.models.DeliverProformaInvoiceRequest;
import java.util.Arrays;

DeliverProformaInvoiceRequest deliverProformaInvoiceRequest = new DeliverProformaInvoiceRequest.Builder()
    .recipientEmails(Arrays.asList(
        "recipient_emails3",
        "recipient_emails4"
    ))
    .ccRecipientEmails(Arrays.asList(
        "cc_recipient_emails2",
        "cc_recipient_emails1",
        "cc_recipient_emails0"
    ))
    .bccRecipientEmails(Arrays.asList(
        "bcc_recipient_emails6"
    ))
    .build();
```

