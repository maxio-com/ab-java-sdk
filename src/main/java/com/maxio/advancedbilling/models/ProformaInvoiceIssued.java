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
 * This is a model class for ProformaInvoiceIssued type.
 */
public class ProformaInvoiceIssued {
    private String uid;
    private String number;
    private String role;
    private String deliveryDate;
    private String createdAt;
    private String dueAmount;
    private String paidAmount;
    private String taxAmount;
    private String totalAmount;
    private String productName;
    private List<InvoiceLineItemEventData> lineItems;

    /**
     * Default constructor.
     */
    public ProformaInvoiceIssued() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  number  String value for number.
     * @param  role  String value for role.
     * @param  deliveryDate  String value for deliveryDate.
     * @param  createdAt  String value for createdAt.
     * @param  dueAmount  String value for dueAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  productName  String value for productName.
     * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
     */
    @JsonCreator
    public ProformaInvoiceIssued(
            @JsonProperty("uid") String uid,
            @JsonProperty("number") String number,
            @JsonProperty("role") String role,
            @JsonProperty("delivery_date") String deliveryDate,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("due_amount") String dueAmount,
            @JsonProperty("paid_amount") String paidAmount,
            @JsonProperty("tax_amount") String taxAmount,
            @JsonProperty("total_amount") String totalAmount,
            @JsonProperty("product_name") String productName,
            @JsonProperty("line_items") List<InvoiceLineItemEventData> lineItems) {
        this.uid = uid;
        this.number = number;
        this.role = role;
        this.deliveryDate = deliveryDate;
        this.createdAt = createdAt;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.productName = productName;
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
     * Getter for DeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("delivery_date")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Setter for DeliveryDate.
     * @param deliveryDate Value for String
     */
    @JsonSetter("delivery_date")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
     * Converts this ProformaInvoiceIssued into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceIssued [" + "uid=" + uid + ", number=" + number + ", role=" + role
                + ", deliveryDate=" + deliveryDate + ", createdAt=" + createdAt + ", dueAmount="
                + dueAmount + ", paidAmount=" + paidAmount + ", taxAmount=" + taxAmount
                + ", totalAmount=" + totalAmount + ", productName=" + productName + ", lineItems="
                + lineItems + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceIssued.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceIssued.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid, number, role, deliveryDate, createdAt, dueAmount,
                paidAmount, taxAmount, totalAmount, productName, lineItems);
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoiceIssued}.
     */
    public static class Builder {
        private String uid;
        private String number;
        private String role;
        private String deliveryDate;
        private String createdAt;
        private String dueAmount;
        private String paidAmount;
        private String taxAmount;
        private String totalAmount;
        private String productName;
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
         * @param  deliveryDate  String value for deliveryDate.
         * @param  createdAt  String value for createdAt.
         * @param  dueAmount  String value for dueAmount.
         * @param  paidAmount  String value for paidAmount.
         * @param  taxAmount  String value for taxAmount.
         * @param  totalAmount  String value for totalAmount.
         * @param  productName  String value for productName.
         * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
         */
        public Builder(String uid, String number, String role, String deliveryDate,
                String createdAt, String dueAmount, String paidAmount, String taxAmount,
                String totalAmount, String productName, List<InvoiceLineItemEventData> lineItems) {
            this.uid = uid;
            this.number = number;
            this.role = role;
            this.deliveryDate = deliveryDate;
            this.createdAt = createdAt;
            this.dueAmount = dueAmount;
            this.paidAmount = paidAmount;
            this.taxAmount = taxAmount;
            this.totalAmount = totalAmount;
            this.productName = productName;
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
         * Setter for deliveryDate.
         * @param  deliveryDate  String value for deliveryDate.
         * @return Builder
         */
        public Builder deliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
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
         * Setter for lineItems.
         * @param  lineItems  List of InvoiceLineItemEventData value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<InvoiceLineItemEventData> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoiceIssued} object using the set fields.
         * @return {@link ProformaInvoiceIssued}
         */
        public ProformaInvoiceIssued build() {
            return new ProformaInvoiceIssued(uid, number, role, deliveryDate, createdAt, dueAmount,
                    paidAmount, taxAmount, totalAmount, productName, lineItems);
        }
    }
}
