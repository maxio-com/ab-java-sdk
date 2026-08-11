
# Credit Scheme Request

## Structure

`CreditSchemeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditScheme` | [`CreditScheme`](../../doc/models/credit-scheme.md) | Required | - | CreditScheme getCreditScheme() | setCreditScheme(CreditScheme creditScheme) |

## Example

```java
import com.maxio.advancedbilling.models.CreditScheme;
import com.maxio.advancedbilling.models.CreditSchemeRequest;

CreditSchemeRequest creditSchemeRequest = new CreditSchemeRequest.Builder(
    CreditScheme.CREDIT
)
.build();
```

