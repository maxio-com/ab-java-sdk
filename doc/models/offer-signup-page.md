
# Offer Signup Page

## Structure

`OfferSignupPage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Nickname` | `String` | Optional | - | String getNickname() | setNickname(String nickname) |
| `Enabled` | `Boolean` | Optional | - | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `ReturnUrl` | `String` | Optional | - | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `ReturnParams` | `String` | Optional | - | String getReturnParams() | setReturnParams(String returnParams) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |

## Example

```java
import com.maxio.advancedbilling.models.OfferSignupPage;

OfferSignupPage offerSignupPage = new OfferSignupPage.Builder()
    .id(102)
    .nickname("nickname6")
    .enabled(false)
    .returnUrl("return_url6")
    .returnParams("return_params8")
    .build();
```

