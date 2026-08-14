
# Issue Service Credit Request

## Structure

`IssueServiceCreditRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceCredit` | [`IssueServiceCredit`](../../doc/models/issue-service-credit.md) | Required | - | IssueServiceCredit getServiceCredit() | setServiceCredit(IssueServiceCredit serviceCredit) |

## Example

```java
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;

IssueServiceCreditRequest issueServiceCreditRequest = new IssueServiceCreditRequest.Builder(
    new IssueServiceCredit.Builder(
        IssueServiceCreditAmount.fromPrecision(
            31.42D
        )
    )
    .memo("memo0")
    .build()
)
.build();
```

