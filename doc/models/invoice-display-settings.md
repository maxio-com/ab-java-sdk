
# Invoice Display Settings

## Structure

`InvoiceDisplaySettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HideZeroSubtotalLines` | `Boolean` | Optional | - | Boolean getHideZeroSubtotalLines() | setHideZeroSubtotalLines(Boolean hideZeroSubtotalLines) |
| `IncludeDiscountsOnLines` | `Boolean` | Optional | - | Boolean getIncludeDiscountsOnLines() | setIncludeDiscountsOnLines(Boolean includeDiscountsOnLines) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceDisplaySettings;

InvoiceDisplaySettings invoiceDisplaySettings = new InvoiceDisplaySettings.Builder()
    .hideZeroSubtotalLines(false)
    .includeDiscountsOnLines(false)
    .build();
```

