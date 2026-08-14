
# Metadata

## Structure

`Metadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |
| `ResourceId` | `Integer` | Optional | - | Integer getResourceId() | setResourceId(Integer resourceId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `DeletedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getDeletedAt() | setDeletedAt(ZonedDateTime deletedAt) |
| `MetafieldId` | `Integer` | Optional | - | Integer getMetafieldId() | setMetafieldId(Integer metafieldId) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Metadata;

Metadata metadata = new Metadata.Builder()
    .id(50)
    .value("value8")
    .resourceId(134)
    .name("name6")
    .deletedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

