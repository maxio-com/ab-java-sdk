
# Dunning Step Reached

## Structure

`DunningStepReached`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Dunner` | [`DunnerData`](../../doc/models/dunner-data.md) | Required | - | DunnerData getDunner() | setDunner(DunnerData dunner) |
| `CurrentStep` | [`DunningStepData`](../../doc/models/dunning-step-data.md) | Required | - | DunningStepData getCurrentStep() | setCurrentStep(DunningStepData currentStep) |
| `NextStep` | [`DunningStepData`](../../doc/models/dunning-step-data.md) | Required | - | DunningStepData getNextStep() | setNextStep(DunningStepData nextStep) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.DunnerData;
import com.maxio.advancedbilling.models.DunningStepData;
import com.maxio.advancedbilling.models.DunningStepReached;

DunningStepReached dunningStepReached = new DunningStepReached.Builder(
    new DunnerData.Builder(
        "state8",
        194,
        98L,
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        42,
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
    )
    .build(),
    new DunningStepData.Builder(
        198,
        "action4",
        false,
        false,
        false
    )
    .emailBody("email_body4")
    .emailSubject("email_subject6")
    .smsBody("sms_body0")
    .build(),
    new DunningStepData.Builder(
        30,
        "action4",
        false,
        false,
        false
    )
    .emailBody("email_body4")
    .emailSubject("email_subject4")
    .smsBody("sms_body0")
    .build()
)
.build();
```

