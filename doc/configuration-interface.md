
# Configuration Interface

This is the interface for client class that holds the configuration getters.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getSite()` | The subdomain for your Advanced Billing site. | `String` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment. | `String` |
| `getBaseUri()` | Get base URI by current environment. | `String` |

