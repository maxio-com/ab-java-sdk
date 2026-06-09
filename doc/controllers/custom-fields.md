# Custom Fields

```java
CustomFieldsController customFieldsController = client.getCustomFieldsController();
```

## Class Name

`CustomFieldsController`

## Methods

* [Create Metafields](../../doc/controllers/custom-fields.md#create-metafields)
* [List Metafields](../../doc/controllers/custom-fields.md#list-metafields)
* [Update Metafield](../../doc/controllers/custom-fields.md#update-metafield)
* [Delete Metafield](../../doc/controllers/custom-fields.md#delete-metafield)
* [Create Metadata](../../doc/controllers/custom-fields.md#create-metadata)
* [List Metadata](../../doc/controllers/custom-fields.md#list-metadata)
* [Update Metadata](../../doc/controllers/custom-fields.md#update-metadata)
* [Delete Metadata](../../doc/controllers/custom-fields.md#delete-metadata)
* [List Metadata for Resource Type](../../doc/controllers/custom-fields.md#list-metadata-for-resource-type)


# Create Metafields

Creates metafields on a Site for either the Subscriptions or Customers resource.

Metafields and their metadata are created in the Custom Fields configuration page on your Site. Metafields can be populated with metadata when you create them or later with the [Update Metafield](../../doc/controllers/custom-fields.md#update-metafield), [Create Metadata](../../doc/controllers/custom-fields.md#create-metadata), or [Update Metadata](../../doc/controllers/custom-fields.md#update-metadata) endpoints. The Create Metadata and Update Metadata endpoints allow you to add metafields and metadata values to a specific subscription or customer.

Each site is limited to 100 unique metafields per resource. This means you can have 100 metafields for Subscriptions and another 100 for Customers.

> Note: After creating a metafield, the resource type cannot be modified.

In the UI and product documentation, metafields and metadata are called Custom Fields.

- Metafield is the custom field
- Metadata is the data populating the custom field.

See [Custom Fields Reference](https://docs.maxio.com/hc/en-us/articles/24266140850573-Custom-Fields-Reference) and [Custom Fields Tab](https://maxio.zendesk.com/hc/en-us/articles/24251701302925-Subscription-Summary-Custom-Fields-Tab) for information on using Custom Fields in the Advanced Billing UI.

```java
List<Metafield> createMetafields(
    final ResourceType resourceType,
    final CreateMetafieldsRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `body` | [`CreateMetafieldsRequest`](../../doc/models/create-metafields-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`List<Metafield>`](../../doc/models/metafield.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
CreateMetafieldsRequest body = new CreateMetafieldsRequest.Builder(
    CreateMetafieldsRequestMetafields.fromCreateMetafield(
        new CreateMetafield.Builder()
            .name("Dropdown field")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.INCLUDE)
                .build())
            .inputType(MetafieldInput.DROPDOWN)
            .mEnum(Arrays.asList(
                "option 1",
                "option 2"
            ))
            .build()
    )
)
.build();

try {
    List<Metafield> result = customFieldsController.createMetafields(resourceType, body);
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "name": "Color",
    "scope": {
      "csv": "0",
      "statements": "0",
      "invoices": "0",
      "portal": "0"
    },
    "data_count": 0,
    "input_type": "text",
    "enum": null
  },
  {
    "name": "Brand",
    "scope": {
      "csv": "0",
      "statements": "0",
      "invoices": "0",
      "portal": "0"
    },
    "data_count": 0,
    "input_type": "text",
    "enum": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# List Metafields

Lists the metafields and their associated details for a Site and resource type. You can filter the request to a specific metafield.

```java
ListMetafieldsResponse listMetafields(
    final ListMetafieldsInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListMetafieldsInput`](../../doc/models/list-metafields-input.md) | Required | Input structure for the method ListMetafields |

## Response Type

**200**: OK

[`ListMetafieldsResponse`](../../doc/models/list-metafields-response.md)

## Example Usage

```java
ListMetafieldsInput listMetafieldsInput = new ListMetafieldsInput.Builder(
    ResourceType.SUBSCRIPTIONS
)
.page(1)
.perPage(50)
.build();

try {
    ListMetafieldsResponse result = customFieldsController.listMetafields(listMetafieldsInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "current_page": 1,
  "total_pages": 0,
  "per_page": 50,
  "metafields": [
    {
      "id": 0,
      "name": "string",
      "scope": {
        "csv": "0",
        "statements": "0",
        "invoices": "0",
        "portal": "0",
        "public_show": "0",
        "public_edit": "0"
      },
      "data_count": 0,
      "input_type": "text",
      "enum": null
    }
  ]
}
```


# Update Metafield

Updates metafields on your Site for a resource type.  Depending on the request structure, you can update or add metafields and metadata to the Subscriptions or Customers resource.

With this endpoint, you can:

- Add metafields. If the metafield specified in current_name does not exist, a new metafield is added.
  
  > Note: Each site is limited to 100 unique metafields per resource. This means you can have 100 metafields for Subscriptions and another 100 for Customers.

- Change the name of a metafield.
  
  > Note: To keep the metafield name the same and only update the metadata for the metafield, you must use the current metafield name in both the `current_name` and `name` parameters.

- Change the input type for the metafield. For example, you can change a metafield input type from text to a dropdown. If you change the input type from text to a dropdown or radio, you must update the specific subscriptions or customers where the metafield was used to reflect the updated metafield and metadata.

- Add metadata values to the existing metadata for a dropdown or radio metafield.
  
  > Note: Updates to metadata overwrite. To add one or more values, you must specify all metadata values including the new value you want to add.

- Add new metadata to a dropdown or radio for a metafield that was created without metadata.

- Remove  metadata for a dropdown or radio for a metafield.
  
  > Note: Updates to metadata overwrite existing values. To remove one or more values, specify all metadata values except those you want to remove.

- Add or update scope settings for a metafield.
  
  > Note: Scope changes overwrite existing settings. You must specify the complete scope, including the changes you want to make.

```java
List<Metafield> updateMetafield(
    final ResourceType resourceType,
    final UpdateMetafieldsRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `body` | [`UpdateMetafieldsRequest`](../../doc/models/update-metafields-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`List<Metafield>`](../../doc/models/metafield.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
try {
    List<Metafield> result = customFieldsController.updateMetafield(resourceType, null);
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Delete Metafield

Deletes a metafield from your Site. Removes the metafield and associated metadata from all Subscriptions or Customers resources on the Site.

```java
Void deleteMetafield(
    final ResourceType resourceType,
    final String name)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `name` | `String` | Query, Optional | The name of the metafield to be deleted |

## Response Type

**200**: OK

`void`

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;

try {
    customFieldsController.deleteMetafield(resourceType, null);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Create Metadata

Creates metadata and metafields for a specific subscription or customer, or updates metadata values of existing metafields for a subscription or customer. Metadata values are limited to 2 KB in size.

If you create metadata on a subscription or customer with a metafield that does not already exist, the metafield is created with the metadata you specify and it is always added as a text field. You can update the input_type for the metafield with the [Update Metafield](../../doc/controllers/custom-fields.md#update-metafield) endpoint.

> Note: Each site is limited to 100 unique metafields per resource. This means you can have 100 metafields for Subscriptions and another 100 for Customers.

```java
List<Metadata> createMetadata(
    final ResourceType resourceType,
    final int resourceId,
    final CreateMetadataRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `resourceId` | `int` | Template, Required | The Advanced Billing id of the customer or the subscription for which the metadata applies |
| `body` | [`CreateMetadataRequest`](../../doc/models/create-metadata-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`List<Metadata>`](../../doc/models/metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
int resourceId = 60;
CreateMetadataRequest body = new CreateMetadataRequest.Builder(
    Arrays.asList(
        new CreateMetadata.Builder()
            .name("Color")
            .value("Blue")
            .build(),
        new CreateMetadata.Builder()
            .name("Something")
            .value("Useful")
            .build()
    )
)
.build();

try {
    List<Metadata> result = customFieldsController.createMetadata(resourceType, resourceId, body);
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# List Metadata

Lists metadata and metafields for a specific customer or subscription.

```java
PaginatedMetadata listMetadata(
    final ListMetadataInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListMetadataInput`](../../doc/models/list-metadata-input.md) | Required | Input structure for the method ListMetadata |

## Response Type

**200**: OK

[`PaginatedMetadata`](../../doc/models/paginated-metadata.md)

## Example Usage

```java
ListMetadataInput listMetadataInput = new ListMetadataInput.Builder(
    ResourceType.SUBSCRIPTIONS,
    60
)
.page(1)
.perPage(50)
.build();

try {
    PaginatedMetadata result = customFieldsController.listMetadata(listMetadataInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "current_page": 1,
  "total_pages": 1,
  "per_page": 50,
  "metadata": [
    {
      "id": 77889911,
      "value": "green",
      "resource_id": 1234567,
      "metafield_id": 112233,
      "deleted_at": null,
      "name": "Color"
    }
  ]
}
```


# Update Metadata

Updates metadata and metafields on the Site and the customer or subscription specified, and updates the metadata value on a subscription or customer.

If you update metadata on a subscription or customer with a metafield that does not already exist, the metafield is created with the metadata you specify and it is always added as a text field to the Site and to the subscription or customer you specify. You can update the input_type for the metafield with the Update Metafield endpoint.

Each site is limited to 100 unique metafields per resource. This means you can have 100 metafields for Subscription and another 100 for Customer.

```java
List<Metadata> updateMetadata(
    final ResourceType resourceType,
    final int resourceId,
    final UpdateMetadataRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `resourceId` | `int` | Template, Required | The Advanced Billing id of the customer or the subscription for which the metadata applies |
| `body` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`List<Metadata>`](../../doc/models/metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
int resourceId = 60;
try {
    List<Metadata> result = customFieldsController.updateMetadata(resourceType, resourceId, null);
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Delete Metadata

Deletes one or more metafields (and associated metadata) from the specified subscription or customer.

```java
Void deleteMetadata(
    final ResourceType resourceType,
    final int resourceId,
    final String name,
    final List<String> names)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | The resource type to which the metafields belong. |
| `resourceId` | `int` | Template, Required | The Advanced Billing id of the customer or the subscription for which the metadata applies |
| `name` | `String` | Query, Optional | Name of field to be removed. |
| `names` | `List<String>` | Query, Optional | Names of fields to be removed. Use in query: `names[]=field1&names[]=my-field&names[]=another-field`. |

## Response Type

**200**: OK

`void`

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
int resourceId = 60;
try {
    customFieldsController.deleteMetadata(resourceType, resourceId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Metadata for Resource Type

Lists  metadata for a specified array of subscriptions or customers.

```java
PaginatedMetadata listMetadataForResourceType(
    final ListMetadataForResourceTypeInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListMetadataForResourceTypeInput`](../../doc/models/list-metadata-for-resource-type-input.md) | Required | Input structure for the method ListMetadataForResourceType |

## Response Type

**200**: OK

[`PaginatedMetadata`](../../doc/models/paginated-metadata.md)

## Example Usage

```java
ListMetadataForResourceTypeInput listMetadataForResourceTypeInput = new ListMetadataForResourceTypeInput.Builder(
    ResourceType.SUBSCRIPTIONS
)
.page(1)
.perPage(50)
.dateField(BasicDateField.UPDATED_AT)
.build();

try {
    PaginatedMetadata result = customFieldsController.listMetadataForResourceType(listMetadataForResourceTypeInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

