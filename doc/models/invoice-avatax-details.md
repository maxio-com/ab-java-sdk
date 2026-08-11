
# Invoice Avatax Details

## Structure

`InvoiceAvataxDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `DocumentCode` | `String` | Optional | - | String getDocumentCode() | setDocumentCode(String documentCode) |
| `CommitDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getCommitDate() | setCommitDate(ZonedDateTime commitDate) |
| `ModifyDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getModifyDate() | setModifyDate(ZonedDateTime modifyDate) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceAvataxDetails;

InvoiceAvataxDetails invoiceAvataxDetails = new InvoiceAvataxDetails.Builder()
    .id(184L)
    .status("status2")
    .documentCode("document_code4")
    .commitDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .modifyDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

