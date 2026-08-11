
# Payment Collection Method Changed

## Structure

`PaymentCollectionMethodChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousValue` | `String` | Required | - | String getPreviousValue() | setPreviousValue(String previousValue) |
| `CurrentValue` | `String` | Required | - | String getCurrentValue() | setCurrentValue(String currentValue) |

## Example

```java
import com.maxio.advancedbilling.models.PaymentCollectionMethodChanged;

PaymentCollectionMethodChanged paymentCollectionMethodChanged = new PaymentCollectionMethodChanged.Builder(
    "previous_value4",
    "current_value2"
)
.build();
```

