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
* [Read Metadata](../../doc/controllers/custom-fields.md#read-metadata)
* [Update Metadata](../../doc/controllers/custom-fields.md#update-metadata)
* [Delete Metadata](../../doc/controllers/custom-fields.md#delete-metadata)
* [List Metadata](../../doc/controllers/custom-fields.md#list-metadata)


# Create Metafields

## Custom Fields: Metafield Intro

**Chargify refers to Custom Fields in the API documentation as metafields and metadata.** Within the Chargify UI, metadata and metafields are grouped together under the umbrella of "Custom Fields." All of our UI-based documentation that references custom fields will not cite the terminology metafields or metadata.

+ **Metafield is the custom field**
+ **Metadata is the data populating the custom field.**

Chargify Metafields are used to add meaningful attributes to subscription and customer resources. Full documentation on how to create Custom Fields in the Chargify UI can be located [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405332553613-Custom-Fields-Reference). For additional documentation on how to record data within custom fields, please see our subscription-based documentation [here.](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404434903181-Subscription-Summary#custom-fields)

Metafield are the place where you will set up your resource to accept additional data. It is scoped to the site instead of a specific customer or subscription. Think of it as the key, and Metadata as the value on every record.

## Create Metafields

Use this endpoint to create metafields for your Site. Metafields can be populated with metadata after the fact.

Each site is limited to 100 unique Metafields (i.e. keys, or names) per resource. This means you can have 100 Metafields for Subscription and another 100 for Customer.

### Metafields "On-the-Fly"

It is possible to create Metafields “on the fly” when you create your Metadata – if a non-existant name is passed when creating Metadata, a Metafield for that key will be automatically created. The Metafield API, however, gives you more control over your “keys”.

### Metafield Scope Warning

If configuring metafields in the Admin UI or via the API, be careful sending updates to metafields with the scope attribute – **if a partial update is sent it will overwrite the current configuration**.

```java
List<Metafield> createMetafields(
    final ResourceType resourceType,
    final CreateMetafieldsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `body` | [`CreateMetafieldsRequest`](../../doc/models/create-metafields-request.md) | Body, Optional | - |

## Response Type

[`List<Metafield>`](../../doc/models/metafield.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
CreateMetafieldsRequest body = new CreateMetafieldsRequest.Builder(
    CreateMetafieldsRequestMetafields.fromCreateMetafield(
        new CreateMetafield.Builder()
            .name("Dropdown field")
            .scope(new MetafieldScope.Builder()
                .publicShow(IncludeOption.INCLUDE)
                .publicEdit(IncludeOption.INCLUDE)
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
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# List Metafields

This endpoint lists metafields associated with a site. The metafield description and usage is contained in the response.

```java
ListMetafieldsResponse listMetafields(
    final ResourceType resourceType,
    final String name,
    final Integer page,
    final Integer perPage,
    final ListMetafieldsDirection direction)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `name` | `String` | Query, Optional | filter by the name of the metafield |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |
| `direction` | [`ListMetafieldsDirection`](../../doc/models/containers/list-metafields-direction.md) | Query, Optional | This is a container for one-of cases. |

## Response Type

[`ListMetafieldsResponse`](../../doc/models/list-metafields-response.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
Integer page = 2;
Integer perPage = 50;

try {
    ListMetafieldsResponse result = customFieldsController.listMetafields(resourceType, null, page, perPage, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Metafield

Use the following method to update metafields for your Site. Metafields can be populated with metadata after the fact.

```java
List<Metafield> updateMetafield(
    final ResourceType resourceType,
    final String name,
    final String currentName,
    final UpdateMetafieldsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `name` | `String` | Query, Required | Name of the custom field. |
| `currentName` | `String` | Query, Optional | This only applies when you are updating an existing record and you wish to rename the field. Note you must supply name and current_name to rename the field |
| `body` | [`UpdateMetafieldsRequest`](../../doc/models/update-metafields-request.md) | Body, Optional | - |

## Response Type

[`List<Metafield>`](../../doc/models/metafield.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
String name = "name0";
try {
    List<Metafield> result = customFieldsController.updateMetafield(resourceType, name, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Metafield

Use the following method to delete a metafield. This will remove the metafield from the Site.

Additionally, this will remove the metafield and associated metadata with all Subscriptions on the Site.

```java
Void deleteMetafield(
    final ResourceType resourceType,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `name` | `String` | Query, Optional | The name of the metafield to be deleted |

## Response Type

`void`

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;

try {
    customFieldsController.deleteMetafield(resourceType, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Create Metadata

## Custom Fields: Metadata Intro

**Chargify refers to Custom Fields in the API documentation as metafields and metadata.** Within the Chargify UI, metadata and metafields are grouped together under the umbrella of "Custom Fields." All of our UI-based documentation that references custom fields will not cite the terminology metafields or metadata.

+ **Metafield is the custom field**
+ **Metadata is the data populating the custom field.**

Chargify Metafields are used to add meaningful attributes to subscription and customer resources. Full documentation on how to create Custom Fields in the Chargify UI can be located [here](https://chargify.zendesk.com/hc/en-us/articles/4407659856411). For additional documentation on how to record data within custom fields, please see our subscription-based documentation [here.](https://chargify.zendesk.com/hc/en-us/articles/4407884887835#custom-fields)

Metadata is associated to a customer or subscription, and corresponds to a Metafield. When creating a new metadata object for a given record, **if the metafield is not present it will be created**.

## Metadata limits

Metadata values are limited to 2kB in size. Additonally, there are limits on the number of unique metafields available per resource.

## Create Metadata

This method will create a metafield for the site on the fly if it does not already exist, and populate the metadata value.

### Subscription or Customer Resource

Please pay special attention to the resource you use when creating metadata.

```java
List<Metadata> createMetadata(
    final ResourceType resourceType,
    final String resourceId,
    final String value,
    final CreateMetadataRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `resourceId` | `String` | Template, Required | The Chargify id of the customer or the subscription for which the metadata applies |
| `value` | `String` | Query, Optional | Can be a single item or a list of metadata |
| `body` | [`CreateMetadataRequest`](../../doc/models/create-metadata-request.md) | Body, Optional | - |

## Response Type

[`List<Metadata>`](../../doc/models/metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
String resourceId = "resource_id4";
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
    List<Metadata> result = customFieldsController.createMetadata(resourceType, resourceId, null, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Read Metadata

This request will list all of the metadata belonging to a particular resource (ie. subscription, customer) that is specified.

## Metadata Data

This endpoint will also display the current stats of your metadata to use as a tool for pagination.

```java
PaginatedMetadata readMetadata(
    final ResourceType resourceType,
    final String resourceId,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `resourceId` | `String` | Template, Required | The Chargify id of the customer or the subscription for which the metadata applies |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |

## Response Type

[`PaginatedMetadata`](../../doc/models/paginated-metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
String resourceId = "resource_id4";
Integer page = 2;
Integer perPage = 50;

try {
    PaginatedMetadata result = customFieldsController.readMetadata(resourceType, resourceId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Metadata

This method allows you to update the existing metadata associated with a subscription or customer.

```java
List<Metadata> updateMetadata(
    final ResourceType resourceType,
    final String resourceId,
    final String value,
    final UpdateMetadataRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `resourceId` | `String` | Template, Required | The Chargify id of the customer or the subscription for which the metadata applies |
| `value` | `String` | Query, Optional | Can be a single item or a list of metadata |
| `body` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Optional | - |

## Response Type

[`List<Metadata>`](../../doc/models/metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
String resourceId = "resource_id4";
try {
    List<Metadata> result = customFieldsController.updateMetadata(resourceType, resourceId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Metadata

This method removes the metadata from the subscriber/customer cited.

## Query String Usage

For instance if you wanted to delete the metadata for customer 99 named weight you would request:

```
https://acme.chargify.com/customers/99/metadata.json?name=weight
```

If you want to delete multiple metadata fields for a customer 99 named: `weight` and `age` you wrould request:

```
https://acme.chargify.com/customers/99/metadata.json?names[]=weight&names[]=age
```

## Successful Response

For a success, there will be a code `200` and the plain text response `true`.

## Unsuccessful Response

When a failed response is encountered, you will receive a `404` response and the plain text response of `true`.

```java
Void deleteMetadata(
    final ResourceType resourceType,
    final String resourceId,
    final String name,
    final List<String> names)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `resourceId` | `String` | Template, Required | The Chargify id of the customer or the subscription for which the metadata applies |
| `name` | `String` | Query, Optional | Name of field to be removed. |
| `names` | `List<String>` | Query, Optional | Names of fields to be removed. Use in query: `names[]=field1&names[]=my-field&names[]=another-field`. |

## Response Type

`void`

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
String resourceId = "resource_id4";
Liquid error: Value cannot be null. (Parameter 'key')try {
    customFieldsController.deleteMetadata(resourceType, resourceId, null, Liquid error: Value cannot be null. (Parameter 'key'));
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Metadata

This method will provide you information on usage of metadata across your selected resource (ie. subscriptions, customers)

## Metadata Data

This endpoint will also display the current stats of your metadata to use as a tool for pagination.

### Metadata for multiple records

`https://acme.chargify.com/subscriptions/metadata.json?resource_ids[]=1&resource_ids[]=2`

## Read Metadata for a Site

This endpoint will list the number of pages of metadata information that are contained within a site.

```java
PaginatedMetadata listMetadata(
    final ResourceType resourceType,
    final Integer page,
    final Integer perPage,
    final BasicDateField dateField,
    final String startDate,
    final String endDate,
    final String startDatetime,
    final String endDatetime,
    final Boolean withDeleted,
    final List<Integer> resourceIds,
    final ListMetadataDirection direction)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `resourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Template, Required | the resource type to which the metafields belong |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |
| `dateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The type of filter you would like to apply to your search. |
| `startDate` | `String` | Query, Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. |
| `endDate` | `String` | Query, Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. |
| `startDatetime` | `String` | Query, Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns metadata with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. |
| `endDatetime` | `String` | Query, Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns metadata with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. |
| `withDeleted` | `Boolean` | Query, Optional | Allow to fetch deleted metadata. |
| `resourceIds` | `List<Integer>` | Query, Optional | Allow to fetch metadata for multiple records based on provided ids. Use in query: `resource_ids[]=122&resource_ids[]=123&resource_ids[]=124`.<br>**Constraints**: *Maximum Items*: `50` |
| `direction` | [`ListMetadataDirection`](../../doc/models/containers/list-metadata-direction.md) | Query, Optional | This is a container for one-of cases. |

## Response Type

[`PaginatedMetadata`](../../doc/models/paginated-metadata.md)

## Example Usage

```java
ResourceType resourceType = ResourceType.SUBSCRIPTIONS;
Integer page = 2;
Integer perPage = 50;
BasicDateField dateField = BasicDateField.UPDATED_AT;
Liquid error: Value cannot be null. (Parameter 'key')
try {
    PaginatedMetadata result = customFieldsController.listMetadata(resourceType, page, perPage, dateField, null, null, null, null, null, Liquid error: Value cannot be null. (Parameter 'key'), null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

