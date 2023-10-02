
# Paginated Metadata

## Structure

`PaginatedMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `Metadata` | [`List<Metadata>`](../../doc/models/metadata.md) | Optional | - | List<Metadata> getMetadata() | setMetadata(List<Metadata> metadata) |

## Example (as JSON)

```json
{
  "total_count": 26,
  "current_page": 2,
  "total_pages": 14,
  "per_page": 20,
  "metadata": [
    {
      "id": 50,
      "value": "value8",
      "resource_id": 134,
      "name": "name6",
      "deleted_at": "deleted_at4"
    },
    {
      "id": 50,
      "value": "value8",
      "resource_id": 134,
      "name": "name6",
      "deleted_at": "deleted_at4"
    }
  ]
}
```

