
# Site Response

## Structure

`SiteResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Site` | [`Site`](../../doc/models/site.md) | Required | - | Site getSite() | setSite(Site site) |

## Example

```java
import com.maxio.advancedbilling.models.Site;
import com.maxio.advancedbilling.models.SiteResponse;

SiteResponse siteResponse = new SiteResponse.Builder(
    new Site.Builder()
        .id(64)
        .name("name4")
        .subdomain("subdomain0")
        .currency("currency4")
        .sellerId(228)
        .build()
)
.build();
```

