
# Metafield Scope

Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings.

## Structure

`MetafieldScope`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Csv` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from the csv export. | IncludeOption getCsv() | setCsv(IncludeOption csv) |
| `Invoices` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from invoices. | IncludeOption getInvoices() | setInvoices(IncludeOption invoices) |
| `Statements` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from statements. | IncludeOption getStatements() | setStatements(IncludeOption statements) |
| `Portal` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from the portal. | IncludeOption getPortal() | setPortal(IncludeOption portal) |
| `PublicShow` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from being viewable by your ecosystem. | IncludeOption getPublicShow() | setPublicShow(IncludeOption publicShow) |
| `PublicEdit` | [`IncludeOption`](../../doc/models/include-option.md) | Optional | Include (1) or exclude (0) metafields from being edited by your ecosystem. | IncludeOption getPublicEdit() | setPublicEdit(IncludeOption publicEdit) |
| `Hosted` | `List<String>` | Optional | - | List<String> getHosted() | setHosted(List<String> hosted) |

## Example (as JSON)

```json
{
  "csv": "0",
  "invoices": "0",
  "statements": "0",
  "portal": "0",
  "public_show": "0"
}
```

