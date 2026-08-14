
# Customer Error

## Structure

`CustomerError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | `String` | Optional | - | String getCustomer() | setCustomer(String customer) |

## Example

```java
import com.maxio.advancedbilling.models.CustomerError;

CustomerError customerError = new CustomerError.Builder()
    .customer("customer8")
    .build();
```

