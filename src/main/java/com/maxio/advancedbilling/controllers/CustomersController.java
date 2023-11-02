/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.CustomerErrorResponseException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CustomerResponse;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;
import com.maxio.advancedbilling.models.containers.ListCustomersDirection;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CustomersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CustomersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * You may create a new Customer at any time, or you may create a Customer at the same time you
     * create a Subscription. The only validation restriction is that you may only create one
     * customer for a given reference value. If provided, the `reference` value must be unique. It
     * represents a unique identifier for the customer from your own app, i.e. the customer’s ID.
     * This allows you to retrieve a given customer via a piece of shared information.
     * Alternatively, you may choose to leave `reference` blank, and store Chargify’s unique ID for
     * the customer, which is in the `id` attribute. Full documentation on how to locate, create and
     * edit Customers in the Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407659914267). ## Required Country
     * Format Chargify requires that you use the ISO Standard Country codes when formatting country
     * attribute of the customer. Countries should be formatted as 2 characters. For more
     * information, please see the following wikipedia article on
     * [ISO_3166-1.](http://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) ## Required State Format
     * Chargify requires that you use the ISO Standard State codes when formatting state attribute
     * of the customer. + US States (2 characters):
     * [ISO_3166-2](https://en.wikipedia.org/wiki/ISO_3166-2:US) + States Outside the US (2-3
     * characters): To find the correct state codes outside of the US, please go to
     * [ISO_3166-1](http://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) and click on the link in
     * the “ISO 3166-2 codes” column next to country you wish to populate. ## Locale Chargify allows
     * you to attribute a language/region to your customer to deliver invoices in any required
     * language. For more: [Customer
     * Locale](https://chargify.zendesk.com/hc/en-us/articles/4407870384283#customer-locale).
     * @param  body  Optional parameter: Example:
     * @return    Returns the CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerResponse createCustomer(
            final CreateCustomerRequest body) throws ApiException, IOException {
        return prepareCreateCustomerRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createCustomer.
     */
    private ApiCall<CustomerResponse, ApiException> prepareCreateCustomerRequest(
            final CreateCustomerRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CustomerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new CustomerErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will by default list all customers associated with your Site. ## Find Customer
     * Use the search feature with the `q` query parameter to retrieve an array of customers that
     * matches the search query. Common use cases are: + Search by an email + Search by a Chargify
     * ID + Search by an organization + Search by a reference value from your application + Search
     * by a first or last name To retrieve a single, exact match by reference, please use the
     * [lookup
     * endpoint](https://developers.chargify.com/docs/api-docs/b710d8fbef104-read-customer-by-reference).
     * @param  direction  Optional parameter: Direction to sort customers by time of creation
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 50. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  dateField  Optional parameter: The type of filter you would like to apply to your
     *         search. Use in query: `date_field=created_at`.
     * @param  startDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns subscriptions with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  endDate  Optional parameter: The end date (format YYYY-MM-DD) with which to filter
     *         the date_field. Returns subscriptions with a timestamp up to and including 11:59:59PM
     *         in your site’s time zone on the date specified.
     * @param  startDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns subscriptions with a timestamp
     *         at or after exact time provided in query. You can specify timezone in query -
     *         otherwise your site's time zone will be used. If provided, this parameter will be
     *         used instead of start_date.
     * @param  endDatetime  Optional parameter: The end date and time (format YYYY-MM-DD HH:MM:SS)
     *         with which to filter the date_field. Returns subscriptions with a timestamp at or
     *         before exact time provided in query. You can specify timezone in query - otherwise
     *         your site's time zone will be used. If provided, this parameter will be used instead
     *         of end_date.
     * @param  q  Optional parameter: A search query by which to filter customers (can be an email,
     *         an ID, a reference, organization)
     * @return    Returns the List of CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CustomerResponse> listCustomers(
            final ListCustomersDirection direction,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final String q) throws ApiException, IOException {
        return prepareListCustomersRequest(direction, page, perPage, dateField, startDate, endDate,
                startDatetime, endDatetime, q).execute();
    }

    /**
     * Builds the ApiCall object for listCustomers.
     */
    private ApiCall<List<CustomerResponse>, ApiException> prepareListCustomersRequest(
            final ListCustomersDirection direction,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final String q) throws IOException {
        return new ApiCall.Builder<List<CustomerResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers.json")
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 50).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((dateField != null) ? dateField.value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(startDate).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(endDate).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(startDatetime).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(endDatetime).isRequired(false))
                        .queryParam(param -> param.key("q")
                                .value(q).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CustomerResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows to retrieve the Customer properties by Chargify-generated Customer ID.
     * @param  id  Required parameter: The Chargify id of the customer
     * @return    Returns the CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerResponse readCustomer(
            final int id) throws ApiException, IOException {
        return prepareReadCustomerRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readCustomer.
     */
    private ApiCall<CustomerResponse, ApiException> prepareReadCustomerRequest(
            final int id) throws IOException {
        return new ApiCall.Builder<CustomerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows to update the Customer.
     * @param  id  Required parameter: The Chargify id of the customer
     * @param  body  Optional parameter: Example:
     * @return    Returns the CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerResponse updateCustomer(
            final int id,
            final UpdateCustomerRequest body) throws ApiException, IOException {
        return prepareUpdateCustomerRequest(id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCustomer.
     */
    private ApiCall<CustomerResponse, ApiException> prepareUpdateCustomerRequest(
            final int id,
            final UpdateCustomerRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CustomerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows you to delete the Customer.
     * @param  id  Required parameter: The Chargify id of the customer
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteCustomer(
            final int id) throws ApiException, IOException {
        prepareDeleteCustomerRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for deleteCustomer.
     */
    private ApiCall<Void, ApiException> prepareDeleteCustomerRequest(
            final int id) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this method to return the customer object if you have the unique **Reference ID (Your
     * App)** value handy. It will return a single match.
     * @param  reference  Required parameter: Customer reference
     * @return    Returns the CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerResponse readCustomerByReference(
            final String reference) throws ApiException, IOException {
        return prepareReadCustomerByReferenceRequest(reference).execute();
    }

    /**
     * Builds the ApiCall object for readCustomerByReference.
     */
    private ApiCall<CustomerResponse, ApiException> prepareReadCustomerByReferenceRequest(
            final String reference) throws IOException {
        return new ApiCall.Builder<CustomerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers/lookup.json")
                        .queryParam(param -> param.key("reference")
                                .value(reference))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method lists all subscriptions that belong to a customer.
     * @param  customerId  Required parameter: The Chargify id of the customer
     * @return    Returns the List of SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SubscriptionResponse> listCustomerSubscriptions(
            final int customerId) throws ApiException, IOException {
        return prepareListCustomerSubscriptionsRequest(customerId).execute();
    }

    /**
     * Builds the ApiCall object for listCustomerSubscriptions.
     */
    private ApiCall<List<SubscriptionResponse>, ApiException> prepareListCustomerSubscriptionsRequest(
            final int customerId) throws IOException {
        return new ApiCall.Builder<List<SubscriptionResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/customers/{customer_id}/subscriptions.json")
                        .templateParam(param -> param.key("customer_id").value(customerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}