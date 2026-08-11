
# Send Invoice Request

## Structure

`SendInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `CcRecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getCcRecipientEmails() | setCcRecipientEmails(List<String> ccRecipientEmails) |
| `BccRecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getBccRecipientEmails() | setBccRecipientEmails(List<String> bccRecipientEmails) |
| `AttachmentUrls` | `List<String>` | Optional | Array of URLs to files to attach to the invoice email. Max 10 files, 10MB each.<br><br>**Constraints**: *Maximum Items*: `10` | List<String> getAttachmentUrls() | setAttachmentUrls(List<String> attachmentUrls) |

## Example

```java
import com.maxio.advancedbilling.models.SendInvoiceRequest;
import java.util.Arrays;

SendInvoiceRequest sendInvoiceRequest = new SendInvoiceRequest.Builder()
    .recipientEmails(Arrays.asList(
        "recipient_emails7"
    ))
    .ccRecipientEmails(Arrays.asList(
        "cc_recipient_emails2"
    ))
    .bccRecipientEmails(Arrays.asList(
        "bcc_recipient_emails0",
        "bcc_recipient_emails1",
        "bcc_recipient_emails2"
    ))
    .attachmentUrls(Arrays.asList(
        "attachment_urls4"
    ))
    .build();
```

