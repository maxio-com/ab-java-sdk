# Feature Templates

```java
FeatureTemplatesController featureTemplatesController = client.getFeatureTemplatesController();
```

## Class Name

`FeatureTemplatesController`

## Methods

* [List Feature Templates](../../doc/controllers/feature-templates.md#list-feature-templates)
* [Create Feature Template](../../doc/controllers/feature-templates.md#create-feature-template)
* [Read Feature Template](../../doc/controllers/feature-templates.md#read-feature-template)
* [Update Feature Template](../../doc/controllers/feature-templates.md#update-feature-template)
* [Archive Feature Template](../../doc/controllers/feature-templates.md#archive-feature-template)
* [Restore Feature Template](../../doc/controllers/feature-templates.md#restore-feature-template)


# List Feature Templates

Lists the feature templates defined for your site, active (non-archived) ones by default. Pass `status=archived` or `status=all` to widen the result set.

Supply `page` or `per_page` to paginate. Without either parameter, the response includes the full result set.

```java
FeatureTemplatesListResponse listFeatureTemplates(
    final Integer page,
    final Integer perPage,
    final Status1 status,
    final String q,
    final Kind kind,
    final LocalDate updatedFrom,
    final LocalDate updatedTo,
    final SortBy sortBy,
    final SortDirection sortDirection)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` |
| `status` | [`Status1`](../../doc/models/status-1.md) | Query, Optional | Filters by archived state. Defaults to `active` (non-archived templates only).<br><br>**Default**: `Status1.ACTIVE` |
| `q` | `String` | Query, Optional | Filters to feature templates whose name contains this substring (case-insensitive). |
| `kind` | [`Kind`](../../doc/models/kind.md) | Query, Optional | Filters by feature kind. |
| `updatedFrom` | `LocalDate` | Query, Optional | Returns feature templates updated on or after this date. |
| `updatedTo` | `LocalDate` | Query, Optional | Returns feature templates updated on or before this date. |
| `sortBy` | [`SortBy`](../../doc/models/sort-by.md) | Query, Optional | The field to sort results by.<br><br>**Default**: `SortBy.NAME` |
| `sortDirection` | [`SortDirection`](../../doc/models/sort-direction.md) | Query, Optional | The sort direction of the returned feature templates.<br><br>**Default**: `SortDirection.ASC` |

## Response Type

**200**: OK

[`FeatureTemplatesListResponse`](../../doc/models/feature-templates-list-response.md)

## Example Usage

```java
Integer page = 1;
Integer perPage = 50;
Status1 status = Status1.ACTIVE;
SortBy sortBy = SortBy.NAME;
SortDirection sortDirection = SortDirection.ASC;

try {
    FeatureTemplatesListResponse result = featureTemplatesController.listFeatureTemplates(page, perPage, status, null, null, null, null, sortBy, sortDirection);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "items": [
    {
      "id": 1001,
      "key": "sso",
      "name": "Single Sign-On",
      "description": null,
      "kind": "access_right",
      "unit": null,
      "value_type": "boolean",
      "default_value": "true",
      "default_periodicity_interval": null,
      "default_periodicity_unit": null,
      "archived_at": null,
      "created_at": "2024-01-15T10:00:00-05:00",
      "updated_at": "2024-01-15T10:00:00-05:00",
      "products_count": 2,
      "plans_count": 5
    }
  ],
  "total_count": 1,
  "archived_count": 0
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Create Feature Template

Defines a new feature at the site level. Feature templates aren't billable on their own. Attach a template to products or components to grant the feature to subscribers.

```java
FeatureTemplateResponse createFeatureTemplate(
    final CreateFeatureTemplateRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateFeatureTemplateRequest`](../../doc/models/create-feature-template-request.md) | Body, Optional | - |

## Response Type

**201**: Created

[`FeatureTemplateResponse`](../../doc/models/feature-template-response.md)

## Example Usage

```java
CreateFeatureTemplateRequest body = new CreateFeatureTemplateRequest.Builder(
    new Feature.Builder(
        "sso",
        "Single Sign-On",
        FeatureKind.ACCESS_RIGHT
    )
    .build()
)
.build();

try {
    FeatureTemplateResponse result = featureTemplatesController.createFeatureTemplate(body);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "feature": {
    "id": 1001,
    "key": "sso",
    "name": "Single Sign-On",
    "description": null,
    "kind": "access_right",
    "unit": null,
    "value_type": "boolean",
    "default_value": "true",
    "default_periodicity_interval": null,
    "default_periodicity_unit": null,
    "archived_at": null,
    "created_at": "2024-01-15T10:00:00-05:00",
    "updated_at": "2024-01-15T10:00:00-05:00",
    "products_count": 0,
    "plans_count": 0
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Read Feature Template

Returns a single feature template. Archived feature templates are not addressable here and return `404`. Restore a template first to read or update it.

```java
FeatureTemplateResponse readFeatureTemplate(
    final int id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the feature template. |

## Response Type

**200**: OK

[`FeatureTemplateResponse`](../../doc/models/feature-template-response.md)

## Example Usage

```java
int id = 112;

try {
    FeatureTemplateResponse result = featureTemplatesController.readFeatureTemplate(id);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |
| 404 | Not Found | `ApiException` |


# Update Feature Template

Updates the name, description, unit, value type, default value, or default periodicity of a feature template. `key` is rejected on every update. `kind` is rejected once any feature catalog item has been created from this template.

Archived feature templates are not addressable here and return `404`. Restore a template first to update it.

```java
FeatureTemplateResponse updateFeatureTemplate(
    final int id,
    final UpdateFeatureTemplateRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the feature template. |
| `body` | [`UpdateFeatureTemplateRequest`](../../doc/models/update-feature-template-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`FeatureTemplateResponse`](../../doc/models/feature-template-response.md)

## Example Usage

```java
int id = 112;
try {
    FeatureTemplateResponse result = featureTemplatesController.updateFeatureTemplate(id, null);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Archive Feature Template

Archives a feature template. Archived feature templates are not addressable via [Read Feature Template](../../doc/controllers/feature-templates.md#read-feature-template) or [Update Feature Template](../../doc/controllers/feature-templates.md#update-feature-template). Both endpoints return `404` until the template is restored.

The feature template record itself is never hard-deleted, and can always be restored with [Restore Feature Template](../../doc/controllers/feature-templates.md#restore-feature-template). Reversibility does not extend to `remove_from_catalog=true`: the feature catalog items and entitlements that parameter destroys are gone permanently, and restoring the template will not bring subscriber access back.

```java
Void archiveFeatureTemplate(
    final int id,
    final Boolean removeFromCatalog)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the feature template. |
| `removeFromCatalog` | `Boolean` | Query, Optional | When `true`, also destroys every feature catalog item created from this template and cascades to their entitlements, revoking subscriber access immediately. When `false` (default), the feature template and its feature catalog items are archived, and existing entitlements are preserved.<br><br>**Default**: `false` |

## Response Type

**204**: No Content

`void`

## Example Usage

```java
int id = 112;
Boolean removeFromCatalog = false;

try {
    featureTemplatesController.archiveFeatureTemplate(id, removeFromCatalog);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |
| 404 | Not Found | `ApiException` |


# Restore Feature Template

Clears the feature template's archived state. Feature catalog items created from this template are not automatically restored. Restore each one individually.

```java
FeatureTemplateResponse restoreFeatureTemplate(
    final int id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the feature template. |

## Response Type

**200**: OK

[`FeatureTemplateResponse`](../../doc/models/feature-template-response.md)

## Example Usage

```java
int id = 112;

try {
    FeatureTemplateResponse result = featureTemplatesController.restoreFeatureTemplate(id);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |

