
# List Components Filter

## Structure

`ListComponentsFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ids` | `List<Integer>` | Optional | Allows fetching components with matching id based on provided value. Use in query `filter[ids]=1,2,3`.<br>**Constraints**: *Minimum Items*: `1` | List<Integer> getIds() | setIds(List<Integer> ids) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Allows fetching components with matching use_site_exchange_rate based on provided value (refers to default price point). Use in query `filter[use_site_exchange_rate]=true`. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |

## Example (as JSON)

```json
{
  "ids": [
    1,
    2,
    3
  ],
  "use_site_exchange_rate": false
}
```

