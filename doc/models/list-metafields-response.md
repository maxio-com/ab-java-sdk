
# List Metafields Response

## Structure

`ListMetafieldsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `Metafields` | [`List<Metafield>`](../../doc/models/metafield.md) | Optional | - | List<Metafield> getMetafields() | setMetafields(List<Metafield> metafields) |

## Example (as JSON)

```json
{
  "total_count": 210,
  "current_page": 186,
  "total_pages": 198,
  "per_page": 92,
  "metafields": [
    {
      "id": 64.22,
      "name": "name2",
      "scope": {
        "csv": "0",
        "invoices": "0",
        "statements": "0",
        "portal": "0",
        "public_show": "0"
      },
      "data_count": 10,
      "input_type": "input_type4"
    }
  ]
}
```

