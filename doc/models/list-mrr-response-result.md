
# List MRR Response Result

## Structure

`ListMRRResponseResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | - | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `TotalEntries` | `Integer` | Optional | - | Integer getTotalEntries() | setTotalEntries(Integer totalEntries) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CurrencySymbol` | `String` | Optional | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Movements` | [`List<Movement>`](../../doc/models/movement.md) | Optional | - | List<Movement> getMovements() | setMovements(List<Movement> movements) |

## Example (as JSON)

```json
{
  "page": 150,
  "per_page": 238,
  "total_pages": 16,
  "total_entries": 112,
  "currency": "currency8"
}
```

