
# Payer Error

## Structure

`PayerError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastName` | `List<String>` | Optional | - | List<String> getLastName() | setLastName(List<String> lastName) |
| `FirstName` | `List<String>` | Optional | - | List<String> getFirstName() | setFirstName(List<String> firstName) |
| `Email` | `List<String>` | Optional | - | List<String> getEmail() | setEmail(List<String> email) |

## Example

```java
import com.maxio.advancedbilling.models.PayerError;
import java.util.Arrays;

PayerError payerError = new PayerError.Builder()
    .lastName(Arrays.asList(
        "last_name9"
    ))
    .firstName(Arrays.asList(
        "first_name2",
        "first_name3",
        "first_name4"
    ))
    .email(Arrays.asList(
        "email6",
        "email7",
        "email8"
    ))
    .build();
```

