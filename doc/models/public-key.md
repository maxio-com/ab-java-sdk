
# Public Key

## Structure

`PublicKey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PublicKey` | `String` | Optional | - | String getPublicKey() | setPublicKey(String publicKey) |
| `RequiresSecurityToken` | `Boolean` | Optional | - | Boolean getRequiresSecurityToken() | setRequiresSecurityToken(Boolean requiresSecurityToken) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.PublicKey;

PublicKey publicKey = new PublicKey.Builder()
    .publicKey("public_key2")
    .requiresSecurityToken(false)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

