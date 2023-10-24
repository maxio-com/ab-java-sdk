
# List Public Keys Response

## Structure

`ListPublicKeysResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyJsKeys` | [`List<PublicKey>`](../../doc/models/public-key.md) | Optional | - | List<PublicKey> getChargifyJsKeys() | setChargifyJsKeys(List<PublicKey> chargifyJsKeys) |
| `Meta` | [`ListPublicKeysMeta`](../../doc/models/list-public-keys-meta.md) | Optional | - | ListPublicKeysMeta getMeta() | setMeta(ListPublicKeysMeta meta) |

## Example (as JSON)

```json
{
  "chargify_js_keys": [
    {
      "public_key": "public_key8",
      "requires_security_token": false,
      "created_at": "created_at6"
    },
    {
      "public_key": "public_key8",
      "requires_security_token": false,
      "created_at": "created_at6"
    }
  ],
  "meta": {
    "total_count": 150,
    "current_page": 126,
    "total_pages": 138,
    "per_page": 152
  }
}
```

