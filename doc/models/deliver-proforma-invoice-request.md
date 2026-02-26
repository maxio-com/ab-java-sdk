
# Deliver Proforma Invoice Request

## Structure

`DeliverProformaInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecipientEmails` | `List<String>` | Optional | - | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `CcRecipientEmails` | `List<String>` | Optional | - | List<String> getCcRecipientEmails() | setCcRecipientEmails(List<String> ccRecipientEmails) |
| `BccRecipientEmails` | `List<String>` | Optional | - | List<String> getBccRecipientEmails() | setBccRecipientEmails(List<String> bccRecipientEmails) |

## Example (as JSON)

```json
{
  "recipient_emails": [
    "recipient_emails9"
  ],
  "cc_recipient_emails": [
    "cc_recipient_emails8"
  ],
  "bcc_recipient_emails": [
    "bcc_recipient_emails2",
    "bcc_recipient_emails3",
    "bcc_recipient_emails4"
  ]
}
```

