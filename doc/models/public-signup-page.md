
# Public Signup Page

## Structure

`PublicSignupPage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The id of the signup page (public_signup_pages only) | Integer getId() | setId(Integer id) |
| `ReturnUrl` | `String` | Optional | The url to which a customer will be returned after a successful signup (public_signup_pages only). | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `ReturnParams` | `String` | Optional | The params to be appended to the return_url (public_signup_pages only) | String getReturnParams() | setReturnParams(String returnParams) |
| `Url` | `String` | Optional | The url where the signup page can be viewed (public_signup_pages only). | String getUrl() | setUrl(String url) |

## Example

```java
import com.maxio.advancedbilling.models.PublicSignupPage;

PublicSignupPage publicSignupPage = new PublicSignupPage.Builder()
    .id(20)
    .returnUrl("return_url0")
    .returnParams("return_params2")
    .url("url8")
    .build();
```

