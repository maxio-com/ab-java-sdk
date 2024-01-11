
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `subdomain` | `String` | The subdomain for your Chargify site.<br>*Default*: `"subdomain"` |
| `domain` | `String` | The Chargify server domain.<br>*Default*: `"chargify.com"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
AdvancedBillingClient client = new AdvancedBillingClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .environment(Environment.PRODUCTION)
    .subdomain("subdomain")
    .domain("chargify.com")
    .build();
```

## Maxio Advanced BillingClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAPIExportsController()` | Provides access to APIExports controller. | `APIExportsController` |
| `getAdvanceInvoiceController()` | Provides access to AdvanceInvoice controller. | `AdvanceInvoiceController` |
| `getBillingPortalController()` | Provides access to BillingPortal controller. | `BillingPortalController` |
| `getCouponsController()` | Provides access to Coupons controller. | `CouponsController` |
| `getComponentsController()` | Provides access to Components controller. | `ComponentsController` |
| `getCustomersController()` | Provides access to Customers controller. | `CustomersController` |
| `getCustomFieldsController()` | Provides access to CustomFields controller. | `CustomFieldsController` |
| `getEventsController()` | Provides access to Events controller. | `EventsController` |
| `getEventsBasedBillingSegmentsController()` | Provides access to EventsBasedBillingSegments controller. | `EventsBasedBillingSegmentsController` |
| `getInsightsController()` | Provides access to Insights controller. | `InsightsController` |
| `getInvoicesController()` | Provides access to Invoices controller. | `InvoicesController` |
| `getOffersController()` | Provides access to Offers controller. | `OffersController` |
| `getPaymentProfilesController()` | Provides access to PaymentProfiles controller. | `PaymentProfilesController` |
| `getProductFamiliesController()` | Provides access to ProductFamilies controller. | `ProductFamiliesController` |
| `getProductsController()` | Provides access to Products controller. | `ProductsController` |
| `getProductPricePointsController()` | Provides access to ProductPricePoints controller. | `ProductPricePointsController` |
| `getProformaInvoicesController()` | Provides access to ProformaInvoices controller. | `ProformaInvoicesController` |
| `getReasonCodesController()` | Provides access to ReasonCodes controller. | `ReasonCodesController` |
| `getReferralCodesController()` | Provides access to ReferralCodes controller. | `ReferralCodesController` |
| `getSalesCommissionsController()` | Provides access to SalesCommissions controller. | `SalesCommissionsController` |
| `getSitesController()` | Provides access to Sites controller. | `SitesController` |
| `getSubscriptionsController()` | Provides access to Subscriptions controller. | `SubscriptionsController` |
| `getSubscriptionComponentsController()` | Provides access to SubscriptionComponents controller. | `SubscriptionComponentsController` |
| `getSubscriptionGroupsController()` | Provides access to SubscriptionGroups controller. | `SubscriptionGroupsController` |
| `getSubscriptionGroupInvoiceAccountController()` | Provides access to SubscriptionGroupInvoiceAccount controller. | `SubscriptionGroupInvoiceAccountController` |
| `getSubscriptionGroupStatusController()` | Provides access to SubscriptionGroupStatus controller. | `SubscriptionGroupStatusController` |
| `getSubscriptionInvoiceAccountController()` | Provides access to SubscriptionInvoiceAccount controller. | `SubscriptionInvoiceAccountController` |
| `getSubscriptionNotesController()` | Provides access to SubscriptionNotes controller. | `SubscriptionNotesController` |
| `getSubscriptionProductsController()` | Provides access to SubscriptionProducts controller. | `SubscriptionProductsController` |
| `getSubscriptionStatusController()` | Provides access to SubscriptionStatus controller. | `SubscriptionStatusController` |
| `getWebhooksController()` | Provides access to Webhooks controller. | `WebhooksController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getSubdomain()` | The subdomain for your Chargify site. | `String` |
| `getDomain()` | The Chargify server domain. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

