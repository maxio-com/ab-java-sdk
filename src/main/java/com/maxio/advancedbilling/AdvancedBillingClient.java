/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling;

import com.maxio.advancedbilling.authentication.BasicAuthManager;
import com.maxio.advancedbilling.authentication.BasicAuthModel;
import com.maxio.advancedbilling.controllers.APIExportsController;
import com.maxio.advancedbilling.controllers.AdvanceInvoiceController;
import com.maxio.advancedbilling.controllers.BillingPortalController;
import com.maxio.advancedbilling.controllers.ComponentPricePointsController;
import com.maxio.advancedbilling.controllers.ComponentsController;
import com.maxio.advancedbilling.controllers.CouponsController;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.controllers.EventsBasedBillingSegmentsController;
import com.maxio.advancedbilling.controllers.EventsController;
import com.maxio.advancedbilling.controllers.InsightsController;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.controllers.OffersController;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.controllers.ProductPricePointsController;
import com.maxio.advancedbilling.controllers.ProductsController;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.controllers.ReferralCodesController;
import com.maxio.advancedbilling.controllers.SalesCommissionsController;
import com.maxio.advancedbilling.controllers.SitesController;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.controllers.SubscriptionGroupInvoiceAccountController;
import com.maxio.advancedbilling.controllers.SubscriptionGroupStatusController;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.controllers.SubscriptionNotesController;
import com.maxio.advancedbilling.controllers.SubscriptionProductsController;
import com.maxio.advancedbilling.controllers.SubscriptionStatusController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.controllers.WebhooksController;
import com.maxio.advancedbilling.http.client.HttpCallback;
import com.maxio.advancedbilling.http.client.HttpClientConfiguration;
import com.maxio.advancedbilling.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class AdvancedBillingClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private APIExportsController aPIExports;
    private AdvanceInvoiceController advanceInvoice;
    private BillingPortalController billingPortal;
    private CouponsController coupons;
    private ComponentsController components;
    private ComponentPricePointsController componentPricePoints;
    private CustomersController customers;
    private CustomFieldsController customFields;
    private EventsController events;
    private EventsBasedBillingSegmentsController eventsBasedBillingSegments;
    private InsightsController insights;
    private InvoicesController invoices;
    private OffersController offers;
    private PaymentProfilesController paymentProfiles;
    private ProductFamiliesController productFamilies;
    private ProductsController products;
    private ProductPricePointsController productPricePoints;
    private ProformaInvoicesController proformaInvoices;
    private ReasonCodesController reasonCodes;
    private ReferralCodesController referralCodes;
    private SalesCommissionsController salesCommissions;
    private SitesController sites;
    private SubscriptionsController subscriptions;
    private SubscriptionComponentsController subscriptionComponents;
    private SubscriptionGroupsController subscriptionGroups;
    private SubscriptionGroupInvoiceAccountController subscriptionGroupInvoiceAccount;
    private SubscriptionGroupStatusController subscriptionGroupStatus;
    private SubscriptionInvoiceAccountController subscriptionInvoiceAccount;
    private SubscriptionNotesController subscriptionNotes;
    private SubscriptionProductsController subscriptionProducts;
    private SubscriptionStatusController subscriptionStatus;
    private WebhooksController webhooks;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "AB SDK Java:6.1.0 on OS {os-info}";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The subdomain for your Advanced Billing site.
     */
    private final String site;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BasicAuthManager.
     */
    private BasicAuthManager basicAuthManager;

    /**
     * The instance of BasicAuthModel.
     */
    private BasicAuthModel basicAuthModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private AdvancedBillingClient(Environment environment, String site, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, BasicAuthModel basicAuthModel,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.site = site;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.basicAuthModel = basicAuthModel;

        this.basicAuthManager = new BasicAuthManager(basicAuthModel);
        this.authentications.put("BasicAuth", basicAuthManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        aPIExports = new APIExportsController(globalConfig);
        advanceInvoice = new AdvanceInvoiceController(globalConfig);
        billingPortal = new BillingPortalController(globalConfig);
        coupons = new CouponsController(globalConfig);
        components = new ComponentsController(globalConfig);
        componentPricePoints = new ComponentPricePointsController(globalConfig);
        customers = new CustomersController(globalConfig);
        customFields = new CustomFieldsController(globalConfig);
        events = new EventsController(globalConfig);
        eventsBasedBillingSegments = new EventsBasedBillingSegmentsController(globalConfig);
        insights = new InsightsController(globalConfig);
        invoices = new InvoicesController(globalConfig);
        offers = new OffersController(globalConfig);
        paymentProfiles = new PaymentProfilesController(globalConfig);
        productFamilies = new ProductFamiliesController(globalConfig);
        products = new ProductsController(globalConfig);
        productPricePoints = new ProductPricePointsController(globalConfig);
        proformaInvoices = new ProformaInvoicesController(globalConfig);
        reasonCodes = new ReasonCodesController(globalConfig);
        referralCodes = new ReferralCodesController(globalConfig);
        salesCommissions = new SalesCommissionsController(globalConfig);
        sites = new SitesController(globalConfig);
        subscriptions = new SubscriptionsController(globalConfig);
        subscriptionComponents = new SubscriptionComponentsController(globalConfig);
        subscriptionGroups = new SubscriptionGroupsController(globalConfig);
        subscriptionGroupInvoiceAccount = new SubscriptionGroupInvoiceAccountController(
                globalConfig);
        subscriptionGroupStatus = new SubscriptionGroupStatusController(globalConfig);
        subscriptionInvoiceAccount = new SubscriptionInvoiceAccountController(globalConfig);
        subscriptionNotes = new SubscriptionNotesController(globalConfig);
        subscriptionProducts = new SubscriptionProductsController(globalConfig);
        subscriptionStatus = new SubscriptionStatusController(globalConfig);
        webhooks = new WebhooksController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of APIExportsController.
     * @return aPIExports
     */
    public APIExportsController getAPIExportsController() {
        return aPIExports;
    }

    /**
     * Get the instance of AdvanceInvoiceController.
     * @return advanceInvoice
     */
    public AdvanceInvoiceController getAdvanceInvoiceController() {
        return advanceInvoice;
    }

    /**
     * Get the instance of BillingPortalController.
     * @return billingPortal
     */
    public BillingPortalController getBillingPortalController() {
        return billingPortal;
    }

    /**
     * Get the instance of CouponsController.
     * @return coupons
     */
    public CouponsController getCouponsController() {
        return coupons;
    }

    /**
     * Get the instance of ComponentsController.
     * @return components
     */
    public ComponentsController getComponentsController() {
        return components;
    }

    /**
     * Get the instance of ComponentPricePointsController.
     * @return componentPricePoints
     */
    public ComponentPricePointsController getComponentPricePointsController() {
        return componentPricePoints;
    }

    /**
     * Get the instance of CustomersController.
     * @return customers
     */
    public CustomersController getCustomersController() {
        return customers;
    }

    /**
     * Get the instance of CustomFieldsController.
     * @return customFields
     */
    public CustomFieldsController getCustomFieldsController() {
        return customFields;
    }

    /**
     * Get the instance of EventsController.
     * @return events
     */
    public EventsController getEventsController() {
        return events;
    }

    /**
     * Get the instance of EventsBasedBillingSegmentsController.
     * @return eventsBasedBillingSegments
     */
    public EventsBasedBillingSegmentsController getEventsBasedBillingSegmentsController() {
        return eventsBasedBillingSegments;
    }

    /**
     * Get the instance of InsightsController.
     * @return insights
     */
    public InsightsController getInsightsController() {
        return insights;
    }

    /**
     * Get the instance of InvoicesController.
     * @return invoices
     */
    public InvoicesController getInvoicesController() {
        return invoices;
    }

    /**
     * Get the instance of OffersController.
     * @return offers
     */
    public OffersController getOffersController() {
        return offers;
    }

    /**
     * Get the instance of PaymentProfilesController.
     * @return paymentProfiles
     */
    public PaymentProfilesController getPaymentProfilesController() {
        return paymentProfiles;
    }

    /**
     * Get the instance of ProductFamiliesController.
     * @return productFamilies
     */
    public ProductFamiliesController getProductFamiliesController() {
        return productFamilies;
    }

    /**
     * Get the instance of ProductsController.
     * @return products
     */
    public ProductsController getProductsController() {
        return products;
    }

    /**
     * Get the instance of ProductPricePointsController.
     * @return productPricePoints
     */
    public ProductPricePointsController getProductPricePointsController() {
        return productPricePoints;
    }

    /**
     * Get the instance of ProformaInvoicesController.
     * @return proformaInvoices
     */
    public ProformaInvoicesController getProformaInvoicesController() {
        return proformaInvoices;
    }

    /**
     * Get the instance of ReasonCodesController.
     * @return reasonCodes
     */
    public ReasonCodesController getReasonCodesController() {
        return reasonCodes;
    }

    /**
     * Get the instance of ReferralCodesController.
     * @return referralCodes
     */
    public ReferralCodesController getReferralCodesController() {
        return referralCodes;
    }

    /**
     * Get the instance of SalesCommissionsController.
     * @return salesCommissions
     */
    public SalesCommissionsController getSalesCommissionsController() {
        return salesCommissions;
    }

    /**
     * Get the instance of SitesController.
     * @return sites
     */
    public SitesController getSitesController() {
        return sites;
    }

    /**
     * Get the instance of SubscriptionsController.
     * @return subscriptions
     */
    public SubscriptionsController getSubscriptionsController() {
        return subscriptions;
    }

    /**
     * Get the instance of SubscriptionComponentsController.
     * @return subscriptionComponents
     */
    public SubscriptionComponentsController getSubscriptionComponentsController() {
        return subscriptionComponents;
    }

    /**
     * Get the instance of SubscriptionGroupsController.
     * @return subscriptionGroups
     */
    public SubscriptionGroupsController getSubscriptionGroupsController() {
        return subscriptionGroups;
    }

    /**
     * Get the instance of SubscriptionGroupInvoiceAccountController.
     * @return subscriptionGroupInvoiceAccount
     */
    public SubscriptionGroupInvoiceAccountController getSubscriptionGroupInvoiceAccountController() {
        return subscriptionGroupInvoiceAccount;
    }

    /**
     * Get the instance of SubscriptionGroupStatusController.
     * @return subscriptionGroupStatus
     */
    public SubscriptionGroupStatusController getSubscriptionGroupStatusController() {
        return subscriptionGroupStatus;
    }

    /**
     * Get the instance of SubscriptionInvoiceAccountController.
     * @return subscriptionInvoiceAccount
     */
    public SubscriptionInvoiceAccountController getSubscriptionInvoiceAccountController() {
        return subscriptionInvoiceAccount;
    }

    /**
     * Get the instance of SubscriptionNotesController.
     * @return subscriptionNotes
     */
    public SubscriptionNotesController getSubscriptionNotesController() {
        return subscriptionNotes;
    }

    /**
     * Get the instance of SubscriptionProductsController.
     * @return subscriptionProducts
     */
    public SubscriptionProductsController getSubscriptionProductsController() {
        return subscriptionProducts;
    }

    /**
     * Get the instance of SubscriptionStatusController.
     * @return subscriptionStatus
     */
    public SubscriptionStatusController getSubscriptionStatusController() {
        return subscriptionStatus;
    }

    /**
     * Get the instance of WebhooksController.
     * @return webhooks
     */
    public WebhooksController getWebhooksController() {
        return webhooks;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The subdomain for your Advanced Billing site.
     * @return site
     */
    public String getSite() {
        return site;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    public BasicAuthCredentials getBasicAuthCredentials() {
        return basicAuthManager;
    }

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    public BasicAuthModel getBasicAuthModel() {
        return basicAuthModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("site",
                new SimpleEntry<Object, Boolean>(this.site, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.PRODUCTION);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.US)) {
            if (server.equals(Server.PRODUCTION)) {
                return "https://{site}.chargify.com";
            }
            if (server.equals(Server.EBB)) {
                return "https://events.chargify.com/{site}";
            }
        }
        if (environment.equals(Environment.EU)) {
            if (server.equals(Server.PRODUCTION)) {
                return "https://{site}.ebilling.maxio.com";
            }
            if (server.equals(Server.EBB)) {
                return "https://events.chargify.com/{site}";
            }
        }
        return "https://{site}.chargify.com";
    }

    /**
     * Converts this AdvancedBillingClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdvancedBillingClient [" + "environment=" + environment + ", site=" + site
                + ", httpClientConfig=" + httpClientConfig + ", authentications=" + authentications
                + "]";
    }

    /**
     * Builds a new {@link AdvancedBillingClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link AdvancedBillingClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.site = getSite();
        builder.httpClient = getHttpClient();
        builder.basicAuthCredentials(getBasicAuthModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link AdvancedBillingClient}.
     */
    public static class Builder {

        private Environment environment = Environment.US;
        private String site = "subdomain";
        private HttpClient httpClient;
        private BasicAuthModel basicAuthModel = new BasicAuthModel.Builder("", "").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BasicAuthCredentials.
         * @param basicAuthModel The instance of BasicAuthModel.
         * @return The current instance of builder.
         */
        public Builder basicAuthCredentials(BasicAuthModel basicAuthModel) {
            this.basicAuthModel = basicAuthModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The subdomain for your Advanced Billing site.
         * @param site The site for client.
         * @return Builder
         */
        public Builder site(String site) {
            this.site = site;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new AdvancedBillingClient object using the set fields.
         * @return AdvancedBillingClient
         */
        public AdvancedBillingClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new AdvancedBillingClient(environment, site, httpClient, httpClientConfig,
                    basicAuthModel, httpCallback);
        }
    }
}