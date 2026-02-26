
# Scheduled Renewal Configuration Request Body

## Structure

`ScheduledRenewalConfigurationRequestBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartsAt` | `ZonedDateTime` | Optional | (Optional) Start of the renewal term. | ZonedDateTime getStartsAt() | setStartsAt(ZonedDateTime startsAt) |
| `EndsAt` | `ZonedDateTime` | Optional | (Optional) End of the renewal term. | ZonedDateTime getEndsAt() | setEndsAt(ZonedDateTime endsAt) |
| `LockInAt` | `ZonedDateTime` | Optional | (Optional) Lock-in date for the renewal. | ZonedDateTime getLockInAt() | setLockInAt(ZonedDateTime lockInAt) |
| `ContractId` | `Integer` | Optional | (Optional) Existing contract to associate with the scheduled renewal. Contracts must be enabled for your site. | Integer getContractId() | setContractId(Integer contractId) |
| `CreateNewContract` | `Boolean` | Optional | (Optional) Set to true to create a new contract when contracts are enabled. Contracts must be enabled for your site. | Boolean getCreateNewContract() | setCreateNewContract(Boolean createNewContract) |

## Example (as JSON)

```json
{
  "starts_at": "2016-03-13T12:52:32.123Z",
  "ends_at": "2016-03-13T12:52:32.123Z",
  "lock_in_at": "2016-03-13T12:52:32.123Z",
  "contract_id": 110,
  "create_new_contract": false
}
```

