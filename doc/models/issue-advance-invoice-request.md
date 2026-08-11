
# Issue Advance Invoice Request

## Structure

`IssueAdvanceInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Force` | `Boolean` | Optional | - | Boolean getForce() | setForce(Boolean force) |

## Example

```java
import com.maxio.advancedbilling.models.IssueAdvanceInvoiceRequest;

IssueAdvanceInvoiceRequest issueAdvanceInvoiceRequest = new IssueAdvanceInvoiceRequest.Builder()
    .force(false)
    .build();
```

