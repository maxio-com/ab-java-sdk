
# Metafield Input

Indicates the type of metafield. A text metafield allows any string value. Dropdown and radio metafields have a set of values that can be selected. Defaults to 'text'.

## Enumeration

`MetafieldInput`

## Fields

| Name |
|  --- |
| `BALANCE_TRACKER` |
| `TEXT` |
| `RADIO` |
| `DROPDOWN` |

## Example

```java
import com.maxio.advancedbilling.models.MetafieldInput;

MetafieldInput metafieldInput = MetafieldInput.BALANCE_TRACKER;
```

