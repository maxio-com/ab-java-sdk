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
import com.maxio.advancedbilling.exceptions.ErrorStringMapResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.BankAccountResponse;
import com.maxio.advancedbilling.models.BankAccountVerificationRequest;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.GetOneTimeTokenRequest;
import com.maxio.advancedbilling.models.ListPaymentProfilesInput;
import com.maxio.advancedbilling.models.PaymentProfileResponse;
import com.maxio.advancedbilling.models.UpdatePaymentProfileRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class PaymentProfilesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PaymentProfilesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a payment profile for a customer. When you create a new payment profile for a
     * customer via the API, it does not automatically make the profile current for any of the
     * customer’s subscriptions. To use the payment profile as the default, you must set it
     * explicitly for the subscription or subscription group. Select an option from the **Request
     * Examples** drop-down on the right side of the portal to see examples of common scenarios for
     * creating payment profiles. Do not use real card information for testing. See the Sites
     * articles that cover [testing your site
     * setup](https://docs.maxio.com/hc/en-us/articles/24250712113165-Testing-Overview#testing-overview-0-0)
     * for more details on testing in your sandbox. Note that collecting and sending raw card
     * details in production requires [PCI
     * compliance](https://docs.maxio.com/hc/en-us/articles/24183956938381-PCI-Compliance#pci-compliance-0-0)
     * on your end. If your business is not PCI compliant, use
     * [Chargify.js](https://docs.maxio.com/hc/en-us/articles/38163190843789-Chargify-js-Overview#chargify-js-overview-0-0)
     * to collect credit card or bank account information. See the following articles to learn more
     * about subscriptions and payments: + [Subscriber Payment
     * Details](https://maxio.zendesk.com/hc/en-us/articles/24251599929613-Subscription-Summary-Payment-Details-Tab)
     * + [Self Service
     * Pages](https://maxio.zendesk.com/hc/en-us/articles/24261425318541-Self-Service-Pages) (Allows
     * credit card updates by Subscriber) + [Public Signup Pages payment
     * settings](https://maxio.zendesk.com/hc/en-us/articles/24261368332557-Individual-Page-Settings)
     * + [Taxes](https://developers.chargify.com/docs/developer-docs/d2e9e34db740e-signups#taxes) +
     * [Chargify.js](https://docs.maxio.com/hc/en-us/articles/38163190843789-Chargify-js-Overview) +
     * [Chargify.js with GoCardless - minimal
     * example](https://docs.maxio.com/hc/en-us/articles/38206331271693-Examples#h_01K0PJ15QQZKCER8CFK40MR6XJ)
     * + [Chargify.js with GoCardless - full
     * example](https://docs.maxio.com/hc/en-us/articles/38206331271693-Examples#h_01K0PJ15QR09JVHWW0MCA7HVJV)
     * + [Chargify.js with Stripe Direct Debit - minimal
     * example](https://docs.maxio.com/hc/en-us/articles/38206331271693-Examples#h_01K0PJ15QQFKKN8Z7B7DZ9AJS5)
     * + [Chargify.js with Stripe Direct Debit - full
     * example](https://docs.maxio.com/hc/en-us/articles/38206331271693-Examples#h_01K0PJ15QRECQQ4ECS3ZA55GY7)
     * + [Chargify.js with Stripe BECS Direct Debit - minimal
     * example](https://developers.chargify.com/docs/developer-docs/ZG9jOjE0NjAzNDIy-examples#minimal-example-with-sepa-or-becs-direct-debit-stripe-gateway)
     * + [Chargify.js with Stripe BECS Direct Debit - full
     * example](https://developers.chargify.com/docs/developer-docs/ZG9jOjE0NjAzNDIy-examples#full-example-with-sepa-direct-debit-stripe-gateway)
     * + [Full documentation on
     * GoCardless](https://maxio.zendesk.com/hc/en-us/articles/24176159136909-GoCardless) + [Full
     * documentation on Stripe SEPA Direct
     * Debit](https://maxio.zendesk.com/hc/en-us/articles/24176170430093-Stripe-SEPA-and-BECS-Direct-Debit)
     * + [Full documentation on Stripe BECS Direct
     * Debit](https://maxio.zendesk.com/hc/en-us/articles/24176170430093-Stripe-SEPA-and-BECS-Direct-Debit)
     * + [Full documentation on Stripe BACS Direct
     * Debit](https://maxio.zendesk.com/hc/en-us/articles/24176170430093-Stripe-SEPA-and-BECS-Direct-Debit)
     * ## 3D Secure Authentication during payment profile creation. When a payment requires 3D
     * Secure Authentication to adhear to Strong Customer Authentication (SCA) during payment
     * profile creation, the request enters a [post-authentication
     * flow](https://maxio.zendesk.com/hc/en-us/articles/24176278996493-Testing-Implementing-3D-Secure#psd2-flows-pre-authentication-and-post-authentication).
     * In this case, a 422 Unprocessable Entity status is returned with the following response:
     * ```json { "jsonapi": { "version": "1.0" }, "errors": [ { "title": "This card requires
     * 3DSecure verification.", "detail": "This card requires 3D secure authentication. Redirect the
     * customer to the URL from the action_link attribute to authenticate. Attach callback_url param
     * to this URL if you want to be notified about the result of 3D Secure authentication. Attach
     * redirect_url param to this URL if you want to redirect a customer back to your page after 3D
     * Secure authentication. Example:
     * https://checkout-test.chargifypay.test/3d-secure/checkout/pay_uerzhsxd5uhkbodx5jhvkg6yeu?one_time_token_id=93&amp;callback_url=http://localhost:4000&amp;redirect_url=https://yourpage.com
     * will do a POST request to https://localhost:4000 after credit card is authenticated and will
     * redirect a customer to https://yourpage.com after 3DS authentication.", "links": {
     * "action_link":
     * "https://checkout-test.chargifypay.test/3d-secure/checkout/pay_uerzhsxd5uhkbodx5jhvkg6yeu?one_time_token_id=93"
     * } } ] } ``` To let the customer go through 3D Secure Authentication, they need to be
     * redirected to the URL specified in `action_link`. Optionally, you can specify the
     * `callback_url` parameter in the `action_link` URL to receive notification about the result of
     * 3D Secure Authentication. The `callback_url` will return the following information: - whether
     * the authentication was successful (`success`) - the payment profile ID (`payment_profile_id`)
     * You can also specify a `redirect_url` parameter in the `action_link` URL to redirect the
     * customer back to your site. You cannot use action_link in an iframe inside a custom
     * application. You must redirect the customer directly to the `action_link` and use the
     * `redirect_url` or `callback_url` to be notified of the result. The final URL that you send a
     * customer to complete 3D Secure may resemble the following, where the first half is the
     * `action_link` and the second half contains a `redirect_url` and `callback_url`:
     * `https://checkout-test.chargifypay.test/3d-secure/checkout/pay_uerzhsxd5uhkbodx5jhvkg6yeu?one_time_token_id=93&amp;callback_url=http://localhost:4000&amp;redirect_url=https://yourpage.com`
     * ### Example Redirect Flow Here's an example flow to redirect customers to different pages
     * depending on whether SCA was performed successfully: 1. Create a payment profile via the API;
     * it requires 3DS. 2. You receive an `action_link` in the response. 3. Use this `action_link`
     * to, for example, connect with your internal resources or generate a `session_id`. 4. Include
     * one of those attributes inside the `callback_url` and `redirect_url` to be aware which
     * “session” this applies to. 5. Redirect the customer to the `action_link` with `callback_url`
     * and `redirect_url` applied 6. After the customer completes 3DS authentication, we notify you
     * of the result via the applied `callback_url`. 7. After that, we redirect the customer to the
     * `redirect_url`; at this point the result of authentication is known. 8. Optionally, you can
     * use the applied "msg" param in the `redirect_url` to determine if the redirect was
     * successful.
     * @param  body  Optional parameter: When following the IBAN or the Local Bank details examples,
     *         a customer, bank account and mandate will be created in your current vault. If the
     *         customer, bank account, and mandate already exist in your vault, follow the Import
     *         example to link the payment profile into Advanced Billing.
     * @return    Returns the PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentProfileResponse createPaymentProfile(
            final CreatePaymentProfileRequest body) throws ApiException, IOException {
        return prepareCreatePaymentProfileRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createPaymentProfile.
     */
    private ApiCall<PaymentProfileResponse, ApiException> prepareCreatePaymentProfileRequest(
            final CreatePaymentProfileRequest body) {
        return new ApiCall.Builder<PaymentProfileResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/payment_profiles.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentProfileResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method will return all of the active `payment_profiles` for a Site, or for one Customer
     * within a site. If no payment profiles are found, this endpoint will return an empty array,
     * not a 404.
     * @param  input  ListPaymentProfilesInput object containing request parameters
     * @return    Returns the List of PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<PaymentProfileResponse> listPaymentProfiles(
            final ListPaymentProfilesInput input) throws ApiException, IOException {
        return prepareListPaymentProfilesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listPaymentProfiles.
     */
    private ApiCall<List<PaymentProfileResponse>, ApiException> prepareListPaymentProfilesRequest(
            final ListPaymentProfilesInput input) {
        return new ApiCall.Builder<List<PaymentProfileResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/payment_profiles.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("customer_id")
                                .value(input.getCustomerId()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        PaymentProfileResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Using the GET method you can retrieve a Payment Profile identified by its unique ID. Note
     * that a different JSON object will be returned if the card method on file is a bank account.
     * ### Response for Bank Account Example response for Bank Account: ``` { "payment_profile": {
     * "id": 10089892, "first_name": "Chester", "last_name": "Tester", "created_at":
     * "2025-01-01T00:00:00-05:00", "updated_at": "2025-01-01T00:00:00-05:00", "customer_id":
     * 14543792, "current_vault": "bogus", "vault_token": "0011223344", "billing_address": "456
     * Juniper Court", "billing_city": "Boulder", "billing_state": "CO", "billing_zip": "80302",
     * "billing_country": "US", "customer_vault_token": null, "billing_address_2": "", "bank_name":
     * "Bank of Kansas City", "masked_bank_routing_number": "XXXX6789",
     * "masked_bank_account_number": "XXXX3344", "bank_account_type": "checking",
     * "bank_account_holder_type": "personal", "payment_type": "bank_account",
     * "site_gateway_setting_id": 1, "gateway_handle": null } } ```.
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @return    Returns the PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentProfileResponse readPaymentProfile(
            final int paymentProfileId) throws ApiException, IOException {
        return prepareReadPaymentProfileRequest(paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for readPaymentProfile.
     */
    private ApiCall<PaymentProfileResponse, ApiException> prepareReadPaymentProfileRequest(
            final int paymentProfileId) {
        return new ApiCall.Builder<PaymentProfileResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/payment_profiles/{payment_profile_id}.json")
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentProfileResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * ## Partial Card Updates In the event that you are using the Authorize.net, Stripe,
     * Cybersource, Forte or Braintree Blue payment gateways, you can update just the billing and
     * contact information for a payment method. Note the lack of credit-card related data contained
     * in the JSON payload. In this case, the following JSON is acceptable: ``` { "payment_profile":
     * { "first_name": "Kelly", "last_name": "Test", "billing_address": "789 Juniper Court",
     * "billing_city": "Boulder", "billing_state": "CO", "billing_zip": "80302", "billing_country":
     * "US", "billing_address_2": null } } ``` The result will be that you have updated the billing
     * information for the card, yet retained the original card number data. ## Specific notes on
     * updating payment profiles - Merchants with **Authorize.net**, **Cybersource**, **Forte**,
     * **Braintree Blue** or **Stripe** as their payment gateway can update their Customer’s credit
     * cards without passing in the full credit card number and CVV. - If you are using
     * **Authorize.net**, **Cybersource**, **Forte**, **Braintree Blue** or **Stripe**, Advanced
     * Billing will ignore the credit card number and CVV when processing an update via the API, and
     * attempt a partial update instead. If you wish to change the card number on a payment profile,
     * you will need to create a new payment profile for the given customer. - A Payment Profile
     * cannot be updated with the attributes of another type of Payment Profile. For example, if the
     * payment profile you are attempting to update is a credit card, you cannot pass in bank
     * account attributes (like `bank_account_number`), and vice versa. - Updating a payment profile
     * directly will not trigger an attempt to capture a past-due balance. If this is the intent,
     * update the card details via the Subscription instead. - If you are using Authorize.net or
     * Stripe, you may elect to manually trigger a retry for a past due subscription after a partial
     * update.
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @param  body  Optional parameter:
     * @return    Returns the PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentProfileResponse updatePaymentProfile(
            final int paymentProfileId,
            final UpdatePaymentProfileRequest body) throws ApiException, IOException {
        return prepareUpdatePaymentProfileRequest(paymentProfileId, body).execute();
    }

    /**
     * Builds the ApiCall object for updatePaymentProfile.
     */
    private ApiCall<PaymentProfileResponse, ApiException> prepareUpdatePaymentProfileRequest(
            final int paymentProfileId,
            final UpdatePaymentProfileRequest body) {
        return new ApiCall.Builder<PaymentProfileResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/payment_profiles/{payment_profile_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentProfileResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorStringMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes an unused payment profile. If the payment profile is in use by one or more
     * subscriptions or groups, a 422 and error message will be returned.
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteUnusedPaymentProfile(
            final int paymentProfileId) throws ApiException, IOException {
        prepareDeleteUnusedPaymentProfileRequest(paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for deleteUnusedPaymentProfile.
     */
    private ApiCall<Void, ApiException> prepareDeleteUnusedPaymentProfileRequest(
            final int paymentProfileId) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/payment_profiles/{payment_profile_id}.json")
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes a payment profile belonging to the customer on the subscription. + If the customer
     * has multiple subscriptions, the payment profile will be removed from all of them. + If you
     * delete the default payment profile for a subscription, you will need to specify another
     * payment profile to be the default through the api, or either prompt the user to enter a card
     * in the billing portal or on the self-service page, or visit the Payment Details tab on the
     * subscription in the Admin UI and use the “Add New Credit Card” or “Make Active Payment
     * Method” link, (depending on whether there are other cards present).
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteSubscriptionsPaymentProfile(
            final int subscriptionId,
            final int paymentProfileId) throws ApiException, IOException {
        prepareDeleteSubscriptionsPaymentProfileRequest(subscriptionId, paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for deleteSubscriptionsPaymentProfile.
     */
    private ApiCall<Void, ApiException> prepareDeleteSubscriptionsPaymentProfileRequest(
            final int subscriptionId,
            final int paymentProfileId) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/payment_profiles/{payment_profile_id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Submit the two small deposit amounts the customer received in their bank account in order to
     * verify the bank account. (Stripe only).
     * @param  bankAccountId  Required parameter: Identifier of the bank account in the system.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResponse verifyBankAccount(
            final int bankAccountId,
            final BankAccountVerificationRequest body) throws ApiException, IOException {
        return prepareVerifyBankAccountRequest(bankAccountId, body).execute();
    }

    /**
     * Builds the ApiCall object for verifyBankAccount.
     */
    private ApiCall<BankAccountResponse, ApiException> prepareVerifyBankAccountRequest(
            final int bankAccountId,
            final BankAccountVerificationRequest body) {
        return new ApiCall.Builder<BankAccountResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/bank_accounts/{bank_account_id}/verification.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("bank_account_id").value(bankAccountId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes a Payment Profile belonging to a Subscription Group. **Note**: If the Payment Profile
     * belongs to multiple Subscription Groups and/or Subscriptions, it will be removed from all of
     * them.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteSubscriptionGroupPaymentProfile(
            final String uid,
            final int paymentProfileId) throws ApiException, IOException {
        prepareDeleteSubscriptionGroupPaymentProfileRequest(uid, paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for deleteSubscriptionGroupPaymentProfile.
     */
    private ApiCall<Void, ApiException> prepareDeleteSubscriptionGroupPaymentProfileRequest(
            final String uid,
            final int paymentProfileId) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/payment_profiles/{payment_profile_id}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This will change the default payment profile on the subscription to the existing payment
     * profile with the id specified. You must elect to change the existing payment profile to a new
     * payment profile ID in order to receive a satisfactory response from this endpoint.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @return    Returns the PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentProfileResponse changeSubscriptionDefaultPaymentProfile(
            final int subscriptionId,
            final int paymentProfileId) throws ApiException, IOException {
        return prepareChangeSubscriptionDefaultPaymentProfileRequest(subscriptionId,
                paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for changeSubscriptionDefaultPaymentProfile.
     */
    private ApiCall<PaymentProfileResponse, ApiException> prepareChangeSubscriptionDefaultPaymentProfileRequest(
            final int subscriptionId,
            final int paymentProfileId) {
        return new ApiCall.Builder<PaymentProfileResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/payment_profiles/{payment_profile_id}/change_payment_profile.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentProfileResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This will change the default payment profile on the subscription group to the existing
     * payment profile with the id specified. You must elect to change the existing payment profile
     * to a new payment profile ID in order to receive a satisfactory response from this endpoint.
     * The new payment profile must belong to the subscription group's customer, otherwise you will
     * receive an error.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  paymentProfileId  Required parameter: The Chargify id of the payment profile
     * @return    Returns the PaymentProfileResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentProfileResponse changeSubscriptionGroupDefaultPaymentProfile(
            final String uid,
            final int paymentProfileId) throws ApiException, IOException {
        return prepareChangeSubscriptionGroupDefaultPaymentProfileRequest(uid,
                paymentProfileId).execute();
    }

    /**
     * Builds the ApiCall object for changeSubscriptionGroupDefaultPaymentProfile.
     */
    private ApiCall<PaymentProfileResponse, ApiException> prepareChangeSubscriptionGroupDefaultPaymentProfileRequest(
            final String uid,
            final int paymentProfileId) {
        return new ApiCall.Builder<PaymentProfileResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/payment_profiles/{payment_profile_id}/change_payment_profile.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("payment_profile_id").value(paymentProfileId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentProfileResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * One Time Tokens aka Advanced Billing Tokens house the credit card or ACH (Authorize.Net or
     * Stripe only) data for a customer. You can use One Time Tokens while creating a subscription
     * or payment profile instead of passing all bank account or credit card data directly to a
     * given API endpoint. To obtain a One Time Token you have to use
     * [Chargify.js](https://docs.maxio.com/hc/en-us/articles/38163190843789-Chargify-js-Overview#chargify-js-overview-0-0).
     * @param  chargifyToken  Required parameter: Advanced Billing Token
     * @return    Returns the GetOneTimeTokenRequest response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOneTimeTokenRequest readOneTimeToken(
            final String chargifyToken) throws ApiException, IOException {
        return prepareReadOneTimeTokenRequest(chargifyToken).execute();
    }

    /**
     * Builds the ApiCall object for readOneTimeToken.
     */
    private ApiCall<GetOneTimeTokenRequest, ApiException> prepareReadOneTimeTokenRequest(
            final String chargifyToken) {
        return new ApiCall.Builder<GetOneTimeTokenRequest, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/one_time_tokens/{chargify_token}.json")
                        .templateParam(param -> param.key("chargify_token").value(chargifyToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOneTimeTokenRequest.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * You can send a "request payment update" email to the customer associated with the
     * subscription. If you attempt to send a "request payment update" email more than five times
     * within a 30-minute period, you will receive a `422` response with an error message in the
     * body. This error message will indicate that the request has been rejected due to excessive
     * attempts, and will provide instructions on how to resubmit the request. Additionally, if you
     * attempt to send a "request payment update" email for a subscription that does not exist, you
     * will receive a `404` error response. This error message will indicate that the subscription
     * could not be found, and will provide instructions on how to correct the error and resubmit
     * the request. These error responses are designed to prevent excessive or invalid requests, and
     * to provide clear and helpful information to users who encounter errors during the request
     * process.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void sendRequestUpdatePaymentEmail(
            final int subscriptionId) throws ApiException, IOException {
        prepareSendRequestUpdatePaymentEmailRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for sendRequestUpdatePaymentEmail.
     */
    private ApiCall<Void, ApiException> prepareSendRequestUpdatePaymentEmailRequest(
            final int subscriptionId) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/request_payment_profiles_update.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}