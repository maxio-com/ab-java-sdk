
# Issue Service Credit

## Structure

`IssueServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`IssueServiceCreditAmount`](../../doc/models/containers/issue-service-credit-amount.md) | Required | This is a container for one-of cases. | IssueServiceCreditAmount getAmount() | setAmount(IssueServiceCreditAmount amount) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "amount": 5.82,
  "memo": "memo4"
}
```

