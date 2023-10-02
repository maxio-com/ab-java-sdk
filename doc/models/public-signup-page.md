
# Public Signup Page

## Structure

`PublicSignupPage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The id of the signup page (public_signup_pages only) | Integer getId() | setId(Integer id) |
| `ReturnUrl` | `String` | Optional | The url to which a customer will be returned after a successful signup (public_signup_pages only) | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `ReturnParams` | `String` | Optional | The params to be appended to the return_url (public_signup_pages only) | String getReturnParams() | setReturnParams(String returnParams) |
| `Url` | `String` | Optional | The url where the signup page can be viewed (public_signup_pages only) | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "id": 6,
  "return_url": "return_url0",
  "return_params": "return_params2",
  "url": "url8"
}
```

