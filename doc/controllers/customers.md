# Customers

```java
CustomersController customersController = client.getCustomersController();
```

## Class Name

`CustomersController`

## Methods

* [Create Customer](../../doc/controllers/customers.md#create-customer)
* [List Customers](../../doc/controllers/customers.md#list-customers)
* [Read Customer](../../doc/controllers/customers.md#read-customer)
* [Update Customer](../../doc/controllers/customers.md#update-customer)
* [Delete Customer](../../doc/controllers/customers.md#delete-customer)
* [Read Customer by Reference](../../doc/controllers/customers.md#read-customer-by-reference)
* [List Customer Subscriptions](../../doc/controllers/customers.md#list-customer-subscriptions)


# Create Customer

Creates a new customer; can also be created alongside a new subscription. The only validation restriction is that you may only create one customer for a given reference value.

If provided, the `reference` value must be unique. It represents a unique identifier for the customer from your own app, i.e. the customer’s ID. This allows you to retrieve a given customer via a piece of shared information. Alternatively, you may choose to leave `reference` blank, and store Advanced Billing’s unique ID for the customer, which is in the `id` attribute.

Full documentation on how to locate, create and edit Customers in the Advanced Billing UI can be located [here](https://maxio.zendesk.com/hc/en-us/articles/24252190590093-Customer-Details).

## Required Country Format

Advanced Billing requires that you use the ISO Standard Country codes when formatting country attribute of the customer.

Countries should be formatted as 2 characters. For more information, see the following wikipedia article on [ISO_3166-1.](http://en.wikipedia.org/wiki/ISO_3166-1#Current_codes)

## Required State Format

Advanced Billing requires that you use the ISO Standard State codes when formatting state attribute of the customer.

+ US States (2 characters): [ISO_3166-2](https://en.wikipedia.org/wiki/ISO_3166-2:US)

+ States Outside the US (2-3 characters): To find the correct state codes outside of the US, go to [ISO_3166-1](http://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) and click on the link in the “ISO 3166-2 codes” column next to country you wish to populate.

## Locale

Advanced Billing allows you to attribute a language/region to your customer to deliver invoices in any required language.
For more: [Customer Locale](https://maxio.zendesk.com/hc/en-us/articles/24286672013709-Customer-Locale)

```java
CustomerResponse createCustomer(
    final CreateCustomerRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`CustomerResponse`](../../doc/models/customer-response.md)

## Example Usage

```java
CreateCustomerRequest body = new CreateCustomerRequest.Builder(
    new CreateCustomer.Builder(
        "Martha",
        "Washington",
        "martha@example.com"
    )
    .ccEmails("george@example.com")
    .organization("ABC, Inc.")
    .reference("1234567890")
    .address("123 Main Street")
    .address2("Unit 10")
    .city("Anytown")
    .state("MA")
    .zip("02120")
    .country("US")
    .phone("555-555-1212")
    .locale("es-MX")
    .build()
)
.build();

try {
    CustomerResponse result = customersController.createCustomer(body);
    System.out.println(result);
} catch (CustomerErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "customer": {
    "first_name": "Cathryn",
    "last_name": "Parisian",
    "email": "Stella.McLaughlin6@example.net",
    "cc_emails": null,
    "organization": "Greenholt - Oberbrunner",
    "reference": null,
    "id": 76,
    "created_at": "2021-03-29T07:47:00-04:00",
    "updated_at": "2021-03-29T07:47:00-04:00",
    "address": "739 Stephon Bypass",
    "address_2": "Apt. 386",
    "city": "Sedrickchester",
    "state": "KY",
    "state_name": "Kentucky",
    "zip": "46979-7719",
    "country": "US",
    "country_name": "United States",
    "phone": "230-934-3685",
    "verified": false,
    "portal_customer_created_at": null,
    "portal_invite_last_sent_at": null,
    "portal_invite_last_accepted_at": null,
    "tax_exempt": false,
    "vat_number": null,
    "parent_id": null,
    "locale": "en-US"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`CustomerErrorResponseException`](../../doc/models/customer-error-response-exception.md) |


# List Customers

Lists all customers associated with your site, or filters results using the search parameter.

## Find Customer

Use the search feature with the `q` query parameter to retrieve an array of customers that matches the search query.

Common use cases are:

+ Search by an email
+ Search by an Advanced Billing ID
+ Search by an organization
+ Search by a reference value from your application
+ Search by a first or last name

To retrieve a single, exact match by reference, use the [lookup endpoint](https://developers.chargify.com/docs/api-docs/b710d8fbef104-read-customer-by-reference).

```java
List<CustomerResponse> listCustomers(
    final ListCustomersInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListCustomersInput`](../../doc/models/list-customers-input.md) | Required | Input structure for the method ListCustomers |

## Response Type

**200**: OK

[`List<CustomerResponse>`](../../doc/models/customer-response.md)

## Example Usage

```java
ListCustomersInput listCustomersInput = new ListCustomersInput.Builder()
    .page(1)
    .perPage(30)
    .dateField(BasicDateField.UPDATED_AT)
    .build();

try {
    List<CustomerResponse> result = customersController.listCustomers(listCustomersInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "customer": {
      "first_name": "Kayla",
      "last_name": "Test",
      "email": "kayla@example.com",
      "cc_emails": "john@example.com, sue@example.com",
      "organization": "",
      "reference": null,
      "id": 14126091,
      "created_at": "2016-10-04T15:22:27-04:00",
      "updated_at": "2016-10-04T15:22:30-04:00",
      "address": "",
      "address_2": "",
      "city": "",
      "state": "",
      "zip": "",
      "country": "",
      "phone": "",
      "verified": null,
      "portal_customer_created_at": "2016-10-04T15:22:29-04:00",
      "portal_invite_last_sent_at": "2016-10-04T15:22:30-04:00",
      "portal_invite_last_accepted_at": null,
      "tax_exempt": false
    }
  },
  {
    "customer": {
      "first_name": "Nick ",
      "last_name": "Test",
      "email": "nick@example.com",
      "cc_emails": "john@example.com, sue@example.com",
      "organization": "",
      "reference": null,
      "id": 14254093,
      "created_at": "2016-10-13T16:52:51-04:00",
      "updated_at": "2016-10-13T16:52:54-04:00",
      "address": "",
      "address_2": "",
      "city": "",
      "state": "",
      "zip": "",
      "country": "",
      "phone": "",
      "verified": null,
      "portal_customer_created_at": "2016-10-13T16:52:54-04:00",
      "portal_invite_last_sent_at": "2016-10-13T16:52:54-04:00",
      "portal_invite_last_accepted_at": null,
      "tax_exempt": false,
      "parent_id": 123
    }
  },
  {
    "customer": {
      "first_name": "Don",
      "last_name": "Test",
      "email": "don@example.com",
      "cc_emails": "john@example.com, sue@example.com",
      "organization": "",
      "reference": null,
      "id": 14332342,
      "created_at": "2016-10-19T10:49:13-04:00",
      "updated_at": "2016-10-19T10:49:19-04:00",
      "address": "1737 15th St",
      "address_2": "",
      "city": "Boulder",
      "state": "CO",
      "zip": "80302",
      "country": "US",
      "phone": "",
      "verified": null,
      "portal_customer_created_at": "2016-10-19T10:49:19-04:00",
      "portal_invite_last_sent_at": "2016-10-19T10:49:19-04:00",
      "portal_invite_last_accepted_at": null,
      "tax_exempt": false,
      "parent_id": null
    }
  }
]
```


# Read Customer

Retrieves the Customer properties by Advanced Billing-generated Customer ID.

```java
CustomerResponse readCustomer(
    final int id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the customer |

## Response Type

**200**: OK

[`CustomerResponse`](../../doc/models/customer-response.md)

## Example Usage

```java
int id = 112;

try {
    CustomerResponse result = customersController.readCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "customer": {
    "first_name": "Jane",
    "last_name": "Doe",
    "email": "jane@example.com",
    "cc_emails": "joe@example.com",
    "organization": "ABC, Inc.",
    "reference": "1234567890",
    "id": 88833369,
    "created_at": "2025-05-08T11:39:18-04:00",
    "updated_at": "2025-05-08T11:39:18-04:00",
    "address": "123 Main Street",
    "address_2": "Unit 10",
    "city": "Anytown",
    "state": "MA",
    "state_name": "Massachusetts",
    "zip": "02120",
    "country": "US",
    "country_name": "United States",
    "phone": "555-555-1212",
    "verified": false,
    "portal_customer_created_at": null,
    "portal_invite_last_sent_at": null,
    "portal_invite_last_accepted_at": null,
    "tax_exempt": false,
    "vat_number": null,
    "parent_id": null,
    "locale": "es-MX",
    "salesforce_id": null,
    "default_auto_renewal_profile_id": null
  }
}
```


# Update Customer

Updates the customer.

```java
CustomerResponse updateCustomer(
    final int id,
    final UpdateCustomerRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the customer |
| `body` | [`UpdateCustomerRequest`](../../doc/models/update-customer-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`CustomerResponse`](../../doc/models/customer-response.md)

## Example Usage

```java
int id = 112;
UpdateCustomerRequest body = new UpdateCustomerRequest.Builder(
    new UpdateCustomer.Builder()
        .firstName("Martha")
        .lastName("Washington")
        .email("martha.washington@example.com")
        .build()
)
.build();

try {
    CustomerResponse result = customersController.updateCustomer(id, body);
    System.out.println(result);
} catch (CustomerErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "customer": {
    "first_name": "Martha",
    "last_name": "Washington",
    "email": "martha.washington@example.com",
    "cc_emails": "george.washington@example.com",
    "organization": null,
    "reference": null,
    "id": 14967442,
    "created_at": "2016-12-05T10:33:07-05:00",
    "updated_at": "2016-12-05T10:38:00-05:00",
    "address": null,
    "address_2": null,
    "city": null,
    "state": null,
    "zip": null,
    "country": null,
    "phone": null,
    "verified": false,
    "portal_customer_created_at": null,
    "portal_invite_last_sent_at": null,
    "portal_invite_last_accepted_at": null,
    "tax_exempt": false,
    "vat_number": "012345678"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`CustomerErrorResponseException`](../../doc/models/customer-error-response-exception.md) |


# Delete Customer

Deletes the customer.

```java
Void deleteCustomer(
    final int id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the customer |

## Response Type

**204**: No Content

`void`

## Example Usage

```java
int id = 112;

try {
    customersController.deleteCustomer(id);
} catch (ApiException e) {
    e.printStackTrace();
}
```


# Read Customer by Reference

Returns a customer by their unique reference ID. It will return a single match.

```java
CustomerResponse readCustomerByReference(
    final String reference)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reference` | `String` | Query, Required | Customer reference |

## Response Type

**200**: OK

[`CustomerResponse`](../../doc/models/customer-response.md)

## Example Usage

```java
String reference = "reference4";

try {
    CustomerResponse result = customersController.readCustomerByReference(reference);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```


# List Customer Subscriptions

Lists all subscriptions that belong to a customer.

```java
List<SubscriptionResponse> listCustomerSubscriptions(
    final int customerId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `int` | Template, Required | The Chargify id of the customer |

## Response Type

**200**: OK

[`List<SubscriptionResponse>`](../../doc/models/subscription-response.md)

## Example Usage

```java
int customerId = 150;

try {
    List<SubscriptionResponse> result = customersController.listCustomerSubscriptions(customerId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

