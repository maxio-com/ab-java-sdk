/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.exceptions.TooManyManagementLinkRequestsErrorException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.AutoInvite;
import com.maxio.advancedbilling.models.CustomerResponse;
import com.maxio.advancedbilling.models.PortalManagementLink;
import com.maxio.advancedbilling.models.ResentInvitation;
import com.maxio.advancedbilling.models.RevokedInvitation;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class BillingPortalController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public BillingPortalController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * ## Billing Portal Documentation Full documentation on how the Billing Portal operates within
     * the Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407648972443). This documentation is
     * focused on how the to configure the Billing Portal Settings, as well as Subscriber
     * Interaction and Merchant Management of the Billing Portal. You can use this endpoint to
     * enable Billing Portal access for a Customer, with the option of sending the Customer an
     * Invitation email at the same time. ## Billing Portal Security If your customer has been
     * invited to the Billing Portal, then they will receive a link to manage their subscription
     * (the “Management URL”) automatically at the bottom of their statements, invoices, and
     * receipts. **This link changes periodically for security and is only valid for 65 days.** If
     * you need to provide your customer their Management URL through other means, you can retrieve
     * it via the API. Because the URL is cryptographically signed with a timestamp, it is not
     * possible for merchants to generate the URL without requesting it from Chargify. In order to
     * prevent abuse &amp; overuse, we ask that you request a new URL only when absolutely necessary.
     * Management URLs are good for 65 days, so you should re-use a previously generated one as much
     * as possible. If you use the URL frequently (such as to display on your website), please **do
     * not** make an API request to Chargify every time.
     * @param  customerId  Required parameter: The Chargify id of the customer
     * @param  autoInvite  Optional parameter: When set to 1, an Invitation email will be sent to
     *         the Customer. When set to 0, or not sent, an email will not be sent. Use in query:
     *         `auto_invite=1`.
     * @return    Returns the CustomerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerResponse enableBillingPortalForCustomer(
            final int customerId,
            final AutoInvite autoInvite) throws ApiException, IOException {
        return prepareEnableBillingPortalForCustomerRequest(customerId, autoInvite).execute();
    }

    /**
     * Builds the ApiCall object for enableBillingPortalForCustomer.
     */
    private ApiCall<CustomerResponse, ApiException> prepareEnableBillingPortalForCustomerRequest(
            final int customerId,
            final AutoInvite autoInvite) throws IOException {
        return new ApiCall.Builder<CustomerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/portal/customers/{customer_id}/enable.json")
                        .queryParam(param -> param.key("auto_invite")
                                .value((autoInvite != null) ? autoInvite.value() : null).isRequired(false))
                        .templateParam(param -> param.key("customer_id").value(customerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
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
     * This method will provide to the API user the exact URL required for a subscriber to access
     * the Billing Portal. ## Rules for Management Link API + When retrieving a management URL,
     * multiple requests for the same customer in a short period will return the **same** URL + We
     * will not generate a new URL for 15 days + You must cache and remember this URL if you are
     * going to need it again within 15 days + Only request a new URL after the
     * `new_link_available_at` date + You are limited to 15 requests for the same URL. If you make
     * more than 15 requests before `new_link_available_at`, you will be blocked from further
     * Management URL requests (with a response code `429`).
     * @param  customerId  Required parameter: The Chargify id of the customer
     * @return    Returns the PortalManagementLink response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PortalManagementLink readBillingPortalLink(
            final int customerId) throws ApiException, IOException {
        return prepareReadBillingPortalLinkRequest(customerId).execute();
    }

    /**
     * Builds the ApiCall object for readBillingPortalLink.
     */
    private ApiCall<PortalManagementLink, ApiException> prepareReadBillingPortalLinkRequest(
            final int customerId) throws IOException {
        return new ApiCall.Builder<PortalManagementLink, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/portal/customers/{customer_id}/management_link.json")
                        .templateParam(param -> param.key("customer_id").value(customerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PortalManagementLink.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too Many Requests",
                                (reason, context) -> new TooManyManagementLinkRequestsErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can resend a customer's Billing Portal invitation. If you attempt to resend an invitation
     * 5 times within 30 minutes, you will receive a `422` response with `error` message in the
     * body. If you attempt to resend an invitation when the Billing Portal is already disabled for
     * a Customer, you will receive a `422` error response. If you attempt to resend an invitation
     * when the Billing Portal is already disabled for a Customer, you will receive a `422` error
     * response. If you attempt to resend an invitation when the Customer does not exist a Customer,
     * you will receive a `404` error response. ## Limitations This endpoint will only return a JSON
     * response.
     * @param  customerId  Required parameter: The Chargify id of the customer
     * @return    Returns the ResentInvitation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResentInvitation resendBillingPortalInvitation(
            final int customerId) throws ApiException, IOException {
        return prepareResendBillingPortalInvitationRequest(customerId).execute();
    }

    /**
     * Builds the ApiCall object for resendBillingPortalInvitation.
     */
    private ApiCall<ResentInvitation, ApiException> prepareResendBillingPortalInvitationRequest(
            final int customerId) throws IOException {
        return new ApiCall.Builder<ResentInvitation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/portal/customers/{customer_id}/invitations/invite.json")
                        .templateParam(param -> param.key("customer_id").value(customerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ResentInvitation.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can revoke a customer's Billing Portal invitation. If you attempt to revoke an invitation
     * when the Billing Portal is already disabled for a Customer, you will receive a 422 error
     * response. ## Limitations This endpoint will only return a JSON response.
     * @param  customerId  Required parameter: The Chargify id of the customer
     * @return    Returns the RevokedInvitation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RevokedInvitation revokeBillingPortalAccess(
            final int customerId) throws ApiException, IOException {
        return prepareRevokeBillingPortalAccessRequest(customerId).execute();
    }

    /**
     * Builds the ApiCall object for revokeBillingPortalAccess.
     */
    private ApiCall<RevokedInvitation, ApiException> prepareRevokeBillingPortalAccessRequest(
            final int customerId) throws IOException {
        return new ApiCall.Builder<RevokedInvitation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/portal/customers/{customer_id}/invitations/revoke.json")
                        .templateParam(param -> param.key("customer_id").value(customerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, RevokedInvitation.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}