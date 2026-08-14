
# Issue Service Credit

## Structure

`IssueServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`IssueServiceCreditAmount`](../../doc/models/containers/issue-service-credit-amount.md) | Required | This is a container for one-of cases. | IssueServiceCreditAmount getAmount() | setAmount(IssueServiceCreditAmount amount) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example

```java
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;

IssueServiceCredit issueServiceCredit = new IssueServiceCredit.Builder(
    IssueServiceCreditAmount.fromPrecision(
        44.88D
    )
)
.memo("memo6")
.build();
```

