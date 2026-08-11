
# Create Reason Code

## Structure

`CreateReasonCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | The unique identifier for the ReasonCode | String getCode() | setCode(String code) |
| `Description` | `String` | Required | The friendly summary of what the code signifies | String getDescription() | setDescription(String description) |
| `Position` | `Integer` | Optional | The order that code appears in lists | Integer getPosition() | setPosition(Integer position) |

## Example

```java
import com.maxio.advancedbilling.models.CreateReasonCode;

CreateReasonCode createReasonCode = new CreateReasonCode.Builder(
    "code4",
    "description6"
)
.position(40)
.build();
```

