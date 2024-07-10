
# Getting Started with Maxio Advanced Billing

## Introduction

Maxio Advanced Billing (formerly Chargify) provides an HTTP-based API that conforms to the principles of REST.
One of the many reasons to use Advanced Billing is the immense feature set and surrounding community [client libraries](page:development-tools/client-libraries).
The Maxio API returns JSON responses as the primary and recommended format, but XML is also provided as a backwards compatible option for Merchants who require it.

### Steps to make your first Maxio Advanced Billing API call

1. [Sign-up](https://app.chargify.com/signup/maxio-billing-sandbox) or [log-in](https://app.chargify.com/login.html) to your [test site](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405553861773-Testing-Intro) account.
2. [Setup and configure authentication](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405281550477-API-Keys#api) credentials.
3. Submit your API request and try it out.
4. Verify results through response.
5. Test our integrations.

We strongly suggest exploring the developer portal, our [integrations](https://www.maxio.com/integrations) and the API guide, as well as the entire set of application-based documentation to aid in your discovery of the product.

#### Example

The following example uses the curl command-line tool to execute API requests.

**Request**

curl -u <api_key>:x -H Accept:application/json -H Content-Type:application/json https://acme.chargify.com/subscriptions.json

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=import3)

* After successfully building the project, the client library needs to be installed as a Maven package in your local cache. Right-click on the project, select `Show in Local Terminal -> Terminal` or use `Ctrl + Alt + T` to open Terminal.

![Importing SDK into Eclipse - Step 5](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=openTerminal)

* In the terminal dialog, run the following command to install client library.

```
mvn install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

![Importing SDK into Eclipse - Step 6](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=installCommand)

## Installation

The following section explains how to use the AdvancedBilling library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *AdvancedBilling* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify com.maxio in `Group Id`, advanced-billing-sdk in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=AdvancedBilling-Java&workspaceName=AdvancedBilling&projectName=AdvancedBilling&rootNamespace=com.maxio.advancedbilling&groupId=com.maxio&artifactId=advanced-billing-sdk&version=1.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `subdomain` | `String` | The subdomain for your Chargify site.<br>*Default*: `"subdomain"` |
| `domain` | `String` | The Chargify server domain.<br>*Default*: `"chargify.com"` |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

The API client can be initialized as follows:

```java
AdvancedBillingClient client = new AdvancedBillingClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "BasicAuthUserName",
            "BasicAuthPassword"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .subdomain("subdomain")
    .domain("chargify.com")
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** Production server |
| environment2 | Production server |

## Authorization

This API uses the following authentication schemes.

* [`BasicAuth (Basic Authentication)`](doc/auth/basic-authentication.md)

## List of APIs

* [API Exports](doc/controllers/api-exports.md)
* [Advance Invoice](doc/controllers/advance-invoice.md)
* [Billing Portal](doc/controllers/billing-portal.md)
* [Component Price Points](doc/controllers/component-price-points.md)
* [Custom Fields](doc/controllers/custom-fields.md)
* [Events-Based Billing Segments](doc/controllers/events-based-billing-segments.md)
* [Payment Profiles](doc/controllers/payment-profiles.md)
* [Product Families](doc/controllers/product-families.md)
* [Product Price Points](doc/controllers/product-price-points.md)
* [Proforma Invoices](doc/controllers/proforma-invoices.md)
* [Reason Codes](doc/controllers/reason-codes.md)
* [Referral Codes](doc/controllers/referral-codes.md)
* [Sales Commissions](doc/controllers/sales-commissions.md)
* [Subscription Components](doc/controllers/subscription-components.md)
* [Subscription Groups](doc/controllers/subscription-groups.md)
* [Subscription Group Invoice Account](doc/controllers/subscription-group-invoice-account.md)
* [Subscription Group Status](doc/controllers/subscription-group-status.md)
* [Subscription Invoice Account](doc/controllers/subscription-invoice-account.md)
* [Subscription Notes](doc/controllers/subscription-notes.md)
* [Subscription Products](doc/controllers/subscription-products.md)
* [Subscription Status](doc/controllers/subscription-status.md)
* [Coupons](doc/controllers/coupons.md)
* [Components](doc/controllers/components.md)
* [Customers](doc/controllers/customers.md)
* [Events](doc/controllers/events.md)
* [Insights](doc/controllers/insights.md)
* [Invoices](doc/controllers/invoices.md)
* [Offers](doc/controllers/offers.md)
* [Products](doc/controllers/products.md)
* [Sites](doc/controllers/sites.md)
* [Subscriptions](doc/controllers/subscriptions.md)
* [Webhooks](doc/controllers/webhooks.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

