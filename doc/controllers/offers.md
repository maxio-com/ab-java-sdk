# Offers

```java
OffersController offersController = client.getOffersController();
```

## Class Name

`OffersController`

## Methods

* [Create Offer](../../doc/controllers/offers.md#create-offer)
* [List Offers](../../doc/controllers/offers.md#list-offers)
* [Read Offers](../../doc/controllers/offers.md#read-offers)
* [Archive Offer](../../doc/controllers/offers.md#archive-offer)
* [Unarchive Offer](../../doc/controllers/offers.md#unarchive-offer)


# Create Offer

Create an offer within your Chargify site by sending a POST request.

## Documentation

Offers allow you to package complicated combinations of products, components and coupons into a convenient package which can then be subscribed to just like products.

Once an offer is defined it can be used as an alternative to the product when creating subscriptions.

Full documentation on how to use offers in the Chargify UI can be located [here](https://chargify.zendesk.com/hc/en-us/articles/4407753852059).

## Using a Product Price Point

You can optionally pass in a `product_price_point_id` that corresponds with the `product_id` and the offer will use that price point. If a `product_price_point_id` is not passed in, the product's default price point will be used.

```java
OfferResponse createOffer(
    final CreateOfferRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateOfferRequest`](../../doc/models/create-offer-request.md) | Body, Optional | - |

## Response Type

[`OfferResponse`](../../doc/models/offer-response.md)

## Example Usage

```java
CreateOfferRequest body = new CreateOfferRequest.Builder(
    new CreateOffer.Builder()
        .name("Solo")
        .handle("han_shot_first")
        .description("A Star Wars Story")
        .productId(31)
        .productPricePointId(102)
        .components(Arrays.asList(
            new CreateOfferComponent.Builder()
                .componentId(24)
                .startingQuantity(1)
                .build()
        ))
        .coupons(Arrays.asList(
            "DEF456"
        ))
        .build()
)
.build();

try {
    OfferResponse result = offersController.createOffer(body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "offer": {
    "id": 3,
    "site_id": 2,
    "product_family_id": 4,
    "product_family_name": "Chargify",
    "product_id": 31,
    "product_name": "30-Day Square Trial",
    "product_price_in_cents": 2000,
    "product_revisable_number": 0,
    "name": "Solo",
    "handle": "han_shot_first",
    "description": "A Star Wars Story",
    "created_at": "2018-06-08T14:51:52-04:00",
    "updated_at": "2018-06-08T14:51:52-04:00",
    "archived_at": null,
    "product_price_point_name": "Default",
    "offer_items": [
      {
        "component_id": 24,
        "component_name": "Invoices",
        "component_unit_price": "3.0",
        "price_point_id": 104,
        "price_point_name": "Original",
        "starting_quantity": "1.0",
        "editable": false
      }
    ],
    "offer_discounts": [
      {
        "coupon_id": 3,
        "coupon_code": "DEF456",
        "coupon_name": "IB Loyalty"
      }
    ]
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorMapResponseException`](../../doc/models/error-map-response-exception.md) |


# List Offers

This endpoint will list offers for a site.

```java
ListOffersResponse listOffers()
```

## Response Type

[`ListOffersResponse`](../../doc/models/list-offers-response.md)

## Example Usage

```java
try {
    ListOffersResponse result = offersController.listOffers();
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "offers": [
    {
      "id": 239,
      "site_id": 48110,
      "product_family_id": 1025627,
      "product_family_name": "Gold",
      "product_id": 110,
      "product_name": "Pro",
      "product_price_in_cents": 1000,
      "product_revisable_number": 0,
      "product_price_point_id": 138,
      "product_price_point_name": "Default",
      "name": "Third Offer",
      "handle": "third",
      "description": "",
      "created_at": "2018-08-03T09:56:11-05:00",
      "updated_at": "2018-08-03T09:56:11-05:00",
      "archived_at": null,
      "offer_items": [
        {
          "component_id": 426665,
          "component_name": "Database Size (GB)",
          "component_unit_price": "1.0",
          "price_point_id": 149438,
          "price_point_name": "Auto-created",
          "starting_quantity": "0.0",
          "editable": false,
          "currency_prices": []
        }
      ],
      "offer_discounts": [
        {
          "coupon_id": 234,
          "coupon_code": "GR8_CUSTOMER",
          "coupon_name": "Multi-service Discount"
        }
      ],
      "offer_signup_pages": [
        {
          "id": 356482,
          "nickname": "ggoods",
          "enabled": true,
          "return_url": "",
          "return_params": "",
          "url": "https://general-goods.chargifypay.com/subscribe/hjpvhnw63tzy"
        }
      ]
    }
  ]
}
```


# Read Offers

This method allows you to list a specific offer's attributes. This is different than list all offers for a site, as it requires an `offer_id`.

```java
OfferResponse readOffers(
    final int offerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offerId` | `int` | Template, Required | The Chargify id of the offer |

## Response Type

[`OfferResponse`](../../doc/models/offer-response.md)

## Example Usage

```java
int offerId = 130;

try {
    OfferResponse result = offersController.readOffers(offerId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |


# Archive Offer

Archive an existing offer. Please provide an `offer_id` in order to archive the correct item.

```java
Void archiveOffer(
    final int offerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offerId` | `int` | Template, Required | The Chargify id of the offer |

## Response Type

`void`

## Example Usage

```java
int offerId = 130;

try {
    offersController.archiveOffer(offerId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |


# Unarchive Offer

Unarchive a previously archived offer. Please provide an `offer_id` in order to un-archive the correct item.

```java
Void unarchiveOffer(
    final int offerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `offerId` | `int` | Template, Required | The Chargify id of the offer |

## Response Type

`void`

## Example Usage

```java
int offerId = 130;

try {
    offersController.unarchiveOffer(offerId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |

