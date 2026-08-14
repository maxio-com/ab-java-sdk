
# Send Email

## Structure

`SendEmail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CanExecute` | `boolean` | Required | - | boolean getCanExecute() | setCanExecute(boolean canExecute) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example

```java
import com.maxio.advancedbilling.models.SendEmail;

SendEmail sendEmail = new SendEmail.Builder(
    false,
    "url2"
)
.build();
```

