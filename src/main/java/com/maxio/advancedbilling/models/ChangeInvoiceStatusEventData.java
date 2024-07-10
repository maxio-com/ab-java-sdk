/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ChangeInvoiceStatusEventData type.
 */
public class ChangeInvoiceStatusEventData
        extends BaseModel {
    private String gatewayTransId;
    private String amount;
    private InvoiceStatus fromStatus;
    private InvoiceStatus toStatus;
    private InvoiceConsolidationLevel consolidationLevel;

    /**
     * Default constructor.
     */
    public ChangeInvoiceStatusEventData() {
    }

    /**
     * Initialization constructor.
     * @param  fromStatus  InvoiceStatus value for fromStatus.
     * @param  toStatus  InvoiceStatus value for toStatus.
     * @param  gatewayTransId  String value for gatewayTransId.
     * @param  amount  String value for amount.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     */
    public ChangeInvoiceStatusEventData(
            InvoiceStatus fromStatus,
            InvoiceStatus toStatus,
            String gatewayTransId,
            String amount,
            InvoiceConsolidationLevel consolidationLevel) {
        this.gatewayTransId = gatewayTransId;
        this.amount = amount;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Getter for GatewayTransId.
     * Identifier for the transaction within the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("gateway_trans_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayTransId() {
        return gatewayTransId;
    }

    /**
     * Setter for GatewayTransId.
     * Identifier for the transaction within the payment gateway.
     * @param gatewayTransId Value for String
     */
    @JsonSetter("gateway_trans_id")
    public void setGatewayTransId(String gatewayTransId) {
        this.gatewayTransId = gatewayTransId;
    }

    /**
     * Getter for Amount.
     * The monetary value associated with the linked payment, expressed in dollars.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The monetary value associated with the linked payment, expressed in dollars.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for FromStatus.
     * The status of the invoice before any changes occurred. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("from_status")
    public InvoiceStatus getFromStatus() {
        return fromStatus;
    }

    /**
     * Setter for FromStatus.
     * The status of the invoice before any changes occurred. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @param fromStatus Value for InvoiceStatus
     */
    @JsonSetter("from_status")
    public void setFromStatus(InvoiceStatus fromStatus) {
        this.fromStatus = fromStatus;
    }

    /**
     * Getter for ToStatus.
     * The updated status of the invoice after changes have been made. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("to_status")
    public InvoiceStatus getToStatus() {
        return toStatus;
    }

    /**
     * Setter for ToStatus.
     * The updated status of the invoice after changes have been made. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @param toStatus Value for InvoiceStatus
     */
    @JsonSetter("to_status")
    public void setToStatus(InvoiceStatus toStatus) {
        this.toStatus = toStatus;
    }

    /**
     * Getter for ConsolidationLevel.
     * @return Returns the InvoiceConsolidationLevel
     */
    @JsonGetter("consolidation_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceConsolidationLevel getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * @param consolidationLevel Value for InvoiceConsolidationLevel
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Converts this ChangeInvoiceStatusEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangeInvoiceStatusEventData [" + "fromStatus=" + fromStatus + ", toStatus="
                + toStatus + ", gatewayTransId=" + gatewayTransId + ", amount=" + amount
                + ", consolidationLevel=" + consolidationLevel + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(fromStatus, toStatus)
                .gatewayTransId(getGatewayTransId())
                .amount(getAmount())
                .consolidationLevel(getConsolidationLevel());
        return builder;
    }

    /**
     * Class to build instances of {@link ChangeInvoiceStatusEventData}.
     */
    public static class Builder {
        private InvoiceStatus fromStatus;
        private InvoiceStatus toStatus;
        private String gatewayTransId;
        private String amount;
        private InvoiceConsolidationLevel consolidationLevel;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  fromStatus  InvoiceStatus value for fromStatus.
         * @param  toStatus  InvoiceStatus value for toStatus.
         */
        public Builder(InvoiceStatus fromStatus, InvoiceStatus toStatus) {
            this.fromStatus = fromStatus;
            this.toStatus = toStatus;
        }

        /**
         * Setter for fromStatus.
         * @param  fromStatus  InvoiceStatus value for fromStatus.
         * @return Builder
         */
        public Builder fromStatus(InvoiceStatus fromStatus) {
            this.fromStatus = fromStatus;
            return this;
        }

        /**
         * Setter for toStatus.
         * @param  toStatus  InvoiceStatus value for toStatus.
         * @return Builder
         */
        public Builder toStatus(InvoiceStatus toStatus) {
            this.toStatus = toStatus;
            return this;
        }

        /**
         * Setter for gatewayTransId.
         * @param  gatewayTransId  String value for gatewayTransId.
         * @return Builder
         */
        public Builder gatewayTransId(String gatewayTransId) {
            this.gatewayTransId = gatewayTransId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Builds a new {@link ChangeInvoiceStatusEventData} object using the set fields.
         * @return {@link ChangeInvoiceStatusEventData}
         */
        public ChangeInvoiceStatusEventData build() {
            return new ChangeInvoiceStatusEventData(fromStatus, toStatus, gatewayTransId, amount,
                    consolidationLevel);
        }
    }
}
