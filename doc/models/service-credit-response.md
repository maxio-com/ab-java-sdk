
# Service Credit Response

## Structure

`ServiceCreditResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceCredit` | [`ServiceCredit`](../../doc/models/service-credit.md) | Required | - | ServiceCredit getServiceCredit() | setServiceCredit(ServiceCredit serviceCredit) |

## Example (as JSON)

```json
{
  "service_credit": {
    "id": 38,
    "amount_in_cents": 124,
    "ending_balance_in_cents": 164,
    "entry_type": "Credit",
    "memo": "memo0"
  }
}
```

