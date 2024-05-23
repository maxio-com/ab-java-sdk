/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for IssueInvoiceEventData type.
 */
public class IssueInvoiceEventData
        extends BaseModel {
    private InvoiceConsolidationLevel consolidationLevel;
    private InvoiceStatus fromStatus;
    private InvoiceStatus toStatus;
    private String dueAmount;
    private String totalAmount;

    /**
     * Default constructor.
     */
    public IssueInvoiceEventData() {
    }

    /**
     * Initialization constructor.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  fromStatus  InvoiceStatus value for fromStatus.
     * @param  toStatus  InvoiceStatus value for toStatus.
     * @param  dueAmount  String value for dueAmount.
     * @param  totalAmount  String value for totalAmount.
     */
    public IssueInvoiceEventData(
            InvoiceConsolidationLevel consolidationLevel,
            InvoiceStatus fromStatus,
            InvoiceStatus toStatus,
            String dueAmount,
            String totalAmount) {
        this.consolidationLevel = consolidationLevel;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.dueAmount = dueAmount;
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @return Returns the InvoiceConsolidationLevel
     */
    @JsonGetter("consolidation_level")
    public InvoiceConsolidationLevel getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @param consolidationLevel Value for InvoiceConsolidationLevel
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Getter for FromStatus.
     * The status of the invoice before event occurrence. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statusess)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("from_status")
    public InvoiceStatus getFromStatus() {
        return fromStatus;
    }

    /**
     * Setter for FromStatus.
     * The status of the invoice before event occurrence. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statusess)
     * for more.
     * @param fromStatus Value for InvoiceStatus
     */
    @JsonSetter("from_status")
    public void setFromStatus(InvoiceStatus fromStatus) {
        this.fromStatus = fromStatus;
    }

    /**
     * Getter for ToStatus.
     * The status of the invoice after event occurrence. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statusess)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("to_status")
    public InvoiceStatus getToStatus() {
        return toStatus;
    }

    /**
     * Setter for ToStatus.
     * The status of the invoice after event occurrence. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statusess)
     * for more.
     * @param toStatus Value for InvoiceStatus
     */
    @JsonSetter("to_status")
    public void setToStatus(InvoiceStatus toStatus) {
        this.toStatus = toStatus;
    }

    /**
     * Getter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Converts this IssueInvoiceEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueInvoiceEventData [" + "consolidationLevel=" + consolidationLevel
                + ", fromStatus=" + fromStatus + ", toStatus=" + toStatus + ", dueAmount="
                + dueAmount + ", totalAmount=" + totalAmount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link IssueInvoiceEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueInvoiceEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(consolidationLevel, fromStatus, toStatus, dueAmount,
                totalAmount);
        return builder;
    }

    /**
     * Class to build instances of {@link IssueInvoiceEventData}.
     */
    public static class Builder {
        private InvoiceConsolidationLevel consolidationLevel;
        private InvoiceStatus fromStatus;
        private InvoiceStatus toStatus;
        private String dueAmount;
        private String totalAmount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @param  fromStatus  InvoiceStatus value for fromStatus.
         * @param  toStatus  InvoiceStatus value for toStatus.
         * @param  dueAmount  String value for dueAmount.
         * @param  totalAmount  String value for totalAmount.
         */
        public Builder(InvoiceConsolidationLevel consolidationLevel, InvoiceStatus fromStatus,
                InvoiceStatus toStatus, String dueAmount, String totalAmount) {
            this.consolidationLevel = consolidationLevel;
            this.fromStatus = fromStatus;
            this.toStatus = toStatus;
            this.dueAmount = dueAmount;
            this.totalAmount = totalAmount;
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
         * Setter for dueAmount.
         * @param  dueAmount  String value for dueAmount.
         * @return Builder
         */
        public Builder dueAmount(String dueAmount) {
            this.dueAmount = dueAmount;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Builds a new {@link IssueInvoiceEventData} object using the set fields.
         * @return {@link IssueInvoiceEventData}
         */
        public IssueInvoiceEventData build() {
            return new IssueInvoiceEventData(consolidationLevel, fromStatus, toStatus, dueAmount,
                    totalAmount);
        }
    }
}
