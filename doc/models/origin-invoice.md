
# Origin Invoice

## Structure

`OriginInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | The UID of the invoice serving as an origin invoice. | String getUid() | setUid(String uid) |
| `Number` | `String` | Optional | The number of the invoice serving as an origin invoice. | String getNumber() | setNumber(String number) |

## Example

```java
import com.maxio.advancedbilling.models.OriginInvoice;

OriginInvoice originInvoice = new OriginInvoice.Builder()
    .uid("uid8")
    .number("number4")
    .build();
```

