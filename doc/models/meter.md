
# Meter

The metering meter this wallet is paired with, or `null` for a wallet with no meter. Set on create and immutable afterward.

## Structure

`Meter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `ConversionRate` | `String` | Optional | How many wallet units one meter unit is worth, as a decimal string. Defaults to `"1.0"`. | String getConversionRate() | setConversionRate(String conversionRate) |

## Example

```java
import com.maxio.advancedbilling.models.Meter;

Meter meter = new Meter.Builder()
    .id(198)
    .name("name0")
    .handle("handle6")
    .conversionRate("conversion_rate2")
    .build();
```

