
# Wallet 2

## Structure

`Wallet2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank or `null` value clears it.<br><br>**Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |

## Example

```java
import com.maxio.advancedbilling.models.Wallet2;

Wallet2 wallet2 = new Wallet2.Builder()
    .name("name2")
    .build();
```

