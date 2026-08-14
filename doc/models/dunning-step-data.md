
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

## Example

```java
import com.maxio.advancedbilling.models.DunningStepData;

DunningStepData dunningStepData = new DunningStepData.Builder(
    206,
    "action6",
    false,
    false,
    false
)
.emailBody("email_body6")
.emailSubject("email_subject6")
.smsBody("sms_body8")
.build();
```

