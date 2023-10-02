
# Send Invoice Request

## Structure

`SendInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `CcRecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getCcRecipientEmails() | setCcRecipientEmails(List<String> ccRecipientEmails) |
| `BccRecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getBccRecipientEmails() | setBccRecipientEmails(List<String> bccRecipientEmails) |

## Example (as JSON)

```json
{
  "recipient_emails": [
    "recipient_emails3",
    "recipient_emails4"
  ],
  "cc_recipient_emails": [
    "cc_recipient_emails6",
    "cc_recipient_emails5"
  ],
  "bcc_recipient_emails": [
    "bcc_recipient_emails6"
  ]
}
```

