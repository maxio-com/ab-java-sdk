
# Reason Code

## Structure

`ReasonCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Position` | `Integer` | Optional | - | Integer getPosition() | setPosition(Integer position) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |

## Example

```java
import com.maxio.advancedbilling.models.ReasonCode;

ReasonCode reasonCode = new ReasonCode.Builder()
    .id(174)
    .siteId(100)
    .code("code4")
    .description("description6")
    .position(204)
    .build();
```

