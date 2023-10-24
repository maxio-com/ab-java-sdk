/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for InvoiceIssued type.
 */
public class InvoiceIssued {
    private String uid;
    private String number;
    private String role;
    private String dueDate;
    private String issueDate;
    private String paidDate;
    private String dueAmount;
    private String paidAmount;
    private String taxAmount;
    private String refundAmount;
    private String totalAmount;
    private String statusAmount;
    private String productName;
    private String consolidationLevel;
    private List<InvoiceLineItemEventData> lineItems;

    /**
     * Default constructor.
     */
    public InvoiceIssued() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  number  String value for number.
     * @param  role  String value for role.
     * @param  dueDate  String value for dueDate.
     * @param  issueDate  String value for issueDate.
     * @param  paidDate  String value for paidDate.
     * @param  dueAmount  String value for dueAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  statusAmount  String value for statusAmount.
     * @param  productName  String value for productName.
     * @param  consolidationLevel  String value for consolidationLevel.
     * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
     */
    @JsonCreator
    public InvoiceIssued(
            @JsonProperty("uid") String uid,
            @JsonProperty("number") String number,
            @JsonProperty("role") String role,
            @JsonProperty("due_date") String dueDate,
            @JsonProperty("issue_date") String issueDate,
            @JsonProperty("paid_date") String paidDate,
            @JsonProperty("due_amount") String dueAmount,
            @JsonProperty("paid_amount") String paidAmount,
            @JsonProperty("tax_amount") String taxAmount,
            @JsonProperty("refund_amount") String refundAmount,
            @JsonProperty("total_amount") String totalAmount,
            @JsonProperty("status_amount") String statusAmount,
            @JsonProperty("product_name") String productName,
            @JsonProperty("consolidation_level") String consolidationLevel,
            @JsonProperty("line_items") List<InvoiceLineItemEventData> lineItems) {
        this.uid = uid;
        this.number = number;
        this.role = role;
        this.dueDate = dueDate;
        this.issueDate = issueDate;
        this.paidDate = paidDate;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
        this.taxAmount = taxAmount;
        this.refundAmount = refundAmount;
        this.totalAmount = totalAmount;
        this.statusAmount = statusAmount;
        this.productName = productName;
        this.consolidationLevel = consolidationLevel;
        this.lineItems = lineItems;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for Role.
     * @return Returns the String
     */
    @JsonGetter("role")
    public String getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * @param role Value for String
     */
    @JsonSetter("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter for DueDate.
     * @return Returns the String
     */
    @JsonGetter("due_date")
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * @param dueDate Value for String
     */
    @JsonSetter("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for IssueDate.
     * @return Returns the String
     */
    @JsonGetter("issue_date")
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * @param issueDate Value for String
     */
    @JsonSetter("issue_date")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for PaidDate.
     * @return Returns the String
     */
    @JsonGetter("paid_date")
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * Setter for PaidDate.
     * @param paidDate Value for String
     */
    @JsonSetter("paid_date")
    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    /**
     * Getter for DueAmount.
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for PaidAmount.
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for TaxAmount.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for RefundAmount.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Setter for RefundAmount.
     * @param refundAmount Value for String
     */
    @JsonSetter("refund_amount")
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Getter for TotalAmount.
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for StatusAmount.
     * @return Returns the String
     */
    @JsonGetter("status_amount")
    public String getStatusAmount() {
        return statusAmount;
    }

    /**
     * Setter for StatusAmount.
     * @param statusAmount Value for String
     */
    @JsonSetter("status_amount")
    public void setStatusAmount(String statusAmount) {
        this.statusAmount = statusAmount;
    }

    /**
     * Getter for ProductName.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ConsolidationLevel.
     * @return Returns the String
     */
    @JsonGetter("consolidation_level")
    public String getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * @param consolidationLevel Value for String
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(String consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of InvoiceLineItemEventData
     */
    @JsonGetter("line_items")
    public List<InvoiceLineItemEventData> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of InvoiceLineItemEventData
     */
    @JsonSetter("line_items")
    public void setLineItems(List<InvoiceLineItemEventData> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Converts this InvoiceIssued into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceIssued [" + "uid=" + uid + ", number=" + number + ", role=" + role
                + ", dueDate=" + dueDate + ", issueDate=" + issueDate + ", paidDate=" + paidDate
                + ", dueAmount=" + dueAmount + ", paidAmount=" + paidAmount + ", taxAmount="
                + taxAmount + ", refundAmount=" + refundAmount + ", totalAmount=" + totalAmount
                + ", statusAmount=" + statusAmount + ", productName=" + productName
                + ", consolidationLevel=" + consolidationLevel + ", lineItems=" + lineItems + "]";
    }

    /**
     * Builds a new {@link InvoiceIssued.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceIssued.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid, number, role, dueDate, issueDate, paidDate, dueAmount,
                paidAmount, taxAmount, refundAmount, totalAmount, statusAmount, productName,
                consolidationLevel, lineItems);
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceIssued}.
     */
    public static class Builder {
        private String uid;
        private String number;
        private String role;
        private String dueDate;
        private String issueDate;
        private String paidDate;
        private String dueAmount;
        private String paidAmount;
        private String taxAmount;
        private String refundAmount;
        private String totalAmount;
        private String statusAmount;
        private String productName;
        private String consolidationLevel;
        private List<InvoiceLineItemEventData> lineItems;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  uid  String value for uid.
         * @param  number  String value for number.
         * @param  role  String value for role.
         * @param  dueDate  String value for dueDate.
         * @param  issueDate  String value for issueDate.
         * @param  paidDate  String value for paidDate.
         * @param  dueAmount  String value for dueAmount.
         * @param  paidAmount  String value for paidAmount.
         * @param  taxAmount  String value for taxAmount.
         * @param  refundAmount  String value for refundAmount.
         * @param  totalAmount  String value for totalAmount.
         * @param  statusAmount  String value for statusAmount.
         * @param  productName  String value for productName.
         * @param  consolidationLevel  String value for consolidationLevel.
         * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
         */
        public Builder(String uid, String number, String role, String dueDate, String issueDate,
                String paidDate, String dueAmount, String paidAmount, String taxAmount,
                String refundAmount, String totalAmount, String statusAmount, String productName,
                String consolidationLevel, List<InvoiceLineItemEventData> lineItems) {
            this.uid = uid;
            this.number = number;
            this.role = role;
            this.dueDate = dueDate;
            this.issueDate = issueDate;
            this.paidDate = paidDate;
            this.dueAmount = dueAmount;
            this.paidAmount = paidAmount;
            this.taxAmount = taxAmount;
            this.refundAmount = refundAmount;
            this.totalAmount = totalAmount;
            this.statusAmount = statusAmount;
            this.productName = productName;
            this.consolidationLevel = consolidationLevel;
            this.lineItems = lineItems;
        }

        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  String value for role.
         * @return Builder
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for dueDate.
         * @param  dueDate  String value for dueDate.
         * @return Builder
         */
        public Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Setter for paidDate.
         * @param  paidDate  String value for paidDate.
         * @return Builder
         */
        public Builder paidDate(String paidDate) {
            this.paidDate = paidDate;
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
         * Setter for paidAmount.
         * @param  paidAmount  String value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(String paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Setter for refundAmount.
         * @param  refundAmount  String value for refundAmount.
         * @return Builder
         */
        public Builder refundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
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
         * Setter for statusAmount.
         * @param  statusAmount  String value for statusAmount.
         * @return Builder
         */
        public Builder statusAmount(String statusAmount) {
            this.statusAmount = statusAmount;
            return this;
        }

        /**
         * Setter for productName.
         * @param  productName  String value for productName.
         * @return Builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setter for consolidationLevel.
         * @param  consolidationLevel  String value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(String consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<InvoiceLineItemEventData> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Builds a new {@link InvoiceIssued} object using the set fields.
         * @return {@link InvoiceIssued}
         */
        public InvoiceIssued build() {
            return new InvoiceIssued(uid, number, role, dueDate, issueDate, paidDate, dueAmount,
                    paidAmount, taxAmount, refundAmount, totalAmount, statusAmount, productName,
                    consolidationLevel, lineItems);
        }
    }
}
