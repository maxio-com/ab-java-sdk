
# Available Actions

## Structure

`AvailableActions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SendEmail` | [`SendEmail`](../../doc/models/send-email.md) | Optional | - | SendEmail getSendEmail() | setSendEmail(SendEmail sendEmail) |

## Example

```java
import com.maxio.advancedbilling.models.AvailableActions;
import com.maxio.advancedbilling.models.SendEmail;

AvailableActions availableActions = new AvailableActions.Builder()
    .sendEmail(new SendEmail.Builder(
        false,
        "url0"
    )
    .build())
    .build();
```

