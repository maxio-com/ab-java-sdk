
# Product Family

## Structure

`ProductFamily`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Surcharging` | `Boolean` | Optional | Whether surcharging applies to this product family. Only included on sites where surcharging is enabled. | Boolean getSurcharging() | setSurcharging(Boolean surcharging) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `ArchivedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this product family was archived. `null` if the product family is not archived. | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |

## Example

```java
import com.maxio.advancedbilling.models.ProductFamily;

ProductFamily productFamily = new ProductFamily.Builder()
    .id(134)
    .name("name4")
    .handle("handle0")
    .accountingCode("accounting_code0")
    .description("description4")
    .build();
```

