/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for WalletErrorResponseException type.
 */
public class WalletErrorResponseException extends ApiException {
    private static final long serialVersionUID = -6277882002523453103L;
    private List<String> errors;
    private String code;
    private String invoiceUid;
    private String invoiceNumber;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public WalletErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * Human-readable messages. These may be reworded, so match on `code` instead.
     * @return Returns the List of String
     */
    @JsonGetter("errors")
    public List<String> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * Human-readable messages. These may be reworded, so match on `code` instead.
     * @param errors Value for List of String
     */
    @JsonSetter("errors")
    private void setErrors(List<String> errors) {
        this.errors = errors;
    }

    /**
     * Getter for Code.
     * A stable, machine-readable reason, for example `wallet_depleted`, `wallet_not_found`,
     * `wallet_product_not_found`, `price_point_archived`, `kind_invalid`, or `parameter_missing`.
     * Failures that come from record validation, such as a field that fails a model rule, report
     * `validation_failed`.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * A stable, machine-readable reason, for example `wallet_depleted`, `wallet_not_found`,
     * `wallet_product_not_found`, `price_point_archived`, `kind_invalid`, or `parameter_missing`.
     * Failures that come from record validation, such as a field that fails a model rule, report
     * `validation_failed`.
     * @param code Value for String
     */
    @JsonSetter("code")
    private void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for InvoiceUid.
     * Returned only by Create Wallet Purchase with `purchase_paid_but_uncredited`,
     * `purchase_declined_invoice_open`, `purchase_invoice_left_open` and
     * `purchase_payment_outcome_unknown`: the uid of the invoice the purchase created. Check it
     * before buying again.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    public String getInvoiceUid() {
        return this.invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * Returned only by Create Wallet Purchase with `purchase_paid_but_uncredited`,
     * `purchase_declined_invoice_open`, `purchase_invoice_left_open` and
     * `purchase_payment_outcome_unknown`: the uid of the invoice the purchase created. Check it
     * before buying again.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    private void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for InvoiceNumber.
     * Returned alongside `invoice_uid`: the number of the invoice the purchase created.
     * @return Returns the String
     */
    @JsonGetter("invoice_number")
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Setter for InvoiceNumber.
     * Returned alongside `invoice_uid`: the number of the invoice the purchase created.
     * @param invoiceNumber Value for String
     */
    @JsonSetter("invoice_number")
    private void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * Converts this WalletErrorResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletErrorResponseException [" + "statusCode=" + getResponseCode() + ", message="
                + getMessage() + ", errors=" + errors + ", code=" + code + ", invoiceUid="
                + invoiceUid + ", invoiceNumber=" + invoiceNumber + "]";
    }
}
