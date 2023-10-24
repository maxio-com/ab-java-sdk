
# Dunning Step Data

## Structure

`DunningStepData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DayThreshold` | `int` | Required | - | int getDayThreshold() | setDayThreshold(int dayThreshold) |
| `Action` | `String` | Required | - | String getAction() | setAction(String action) |
| `EmailBody` | `String` | Optional | - | String getEmailBody() | setEmailBody(String emailBody) |
| `EmailSubject` | `String` | Optional | - | String getEmailSubject() | setEmailSubject(String emailSubject) |
| `SendEmail` | `boolean` | Required | - | boolean getSendEmail() | setSendEmail(boolean sendEmail) |
| `SendBccEmail` | `boolean` | Required | - | boolean getSendBccEmail() | setSendBccEmail(boolean sendBccEmail) |
| `SendSms` | `boolean` | Required | - | boolean getSendSms() | setSendSms(boolean sendSms) |
| `SmsBody` | `String` | Optional | - | String getSmsBody() | setSmsBody(String smsBody) |

## Example (as JSON)

```json
{
  "day_threshold": 88,
  "action": "action4",
  "email_body": "email_body4",
  "email_subject": "email_subject4",
  "send_email": false,
  "send_bcc_email": false,
  "send_sms": false,
  "sms_body": "sms_body0"
}
```

