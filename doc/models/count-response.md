
# Count Response

## Structure

`CountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `Integer` | Optional | - | Integer getCount() | setCount(Integer count) |

## Example

```java
import com.maxio.advancedbilling.models.CountResponse;

CountResponse countResponse = new CountResponse.Builder()
    .count(56)
    .build();
```

