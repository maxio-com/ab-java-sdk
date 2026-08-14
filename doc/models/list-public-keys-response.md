
# List Public Keys Response

## Structure

`ListPublicKeysResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyJsKeys` | [`List<PublicKey>`](../../doc/models/public-key.md) | Optional | - | List<PublicKey> getChargifyJsKeys() | setChargifyJsKeys(List<PublicKey> chargifyJsKeys) |
| `Meta` | [`ListPublicKeysMeta`](../../doc/models/list-public-keys-meta.md) | Optional | - | ListPublicKeysMeta getMeta() | setMeta(ListPublicKeysMeta meta) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ListPublicKeysMeta;
import com.maxio.advancedbilling.models.ListPublicKeysResponse;
import com.maxio.advancedbilling.models.PublicKey;
import java.util.Arrays;

ListPublicKeysResponse listPublicKeysResponse = new ListPublicKeysResponse.Builder()
    .chargifyJsKeys(Arrays.asList(
        new PublicKey.Builder()
            .publicKey("public_key8")
            .requiresSecurityToken(false)
            .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build()
    ))
    .meta(new ListPublicKeysMeta.Builder()
        .totalCount(150)
        .currentPage(126)
        .totalPages(138)
        .perPage(152)
        .build())
    .build();
```

