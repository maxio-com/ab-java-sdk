
# Basic Authentication



Documentation for accessing and setting credentials for BasicAuth.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| BasicAuthUserName | `String` | The username to use with basic authentication | `username` | `getBasicAuthUserName()` |
| BasicAuthPassword | `String` | The password to use with basic authentication | `password` | `getBasicAuthPassword()` |



**Note:** Auth credentials can be set using `basicAuthCredentials` in the client builder and accessed through `getBasicAuthCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
AdvancedBillingClient client = new AdvancedBillingClient.Builder()
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "BasicAuthUserName",
            "BasicAuthPassword"
        )
        .build())
    .build();
```


