/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ListSubscriptionGroupProformaInvoicesInput type.
 */
public class ListSubscriptionGroupProformaInvoicesInput {
    private String uid;
    private Boolean lineItems;
    private Boolean discounts;
    private Boolean taxes;
    private Boolean credits;
    private Boolean payments;
    private Boolean customFields;

    /**
     * Default constructor.
     */
    public ListSubscriptionGroupProformaInvoicesInput() {
        lineItems = false;
        discounts = false;
        taxes = false;
        credits = false;
        payments = false;
        customFields = false;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  lineItems  Boolean value for lineItems.
     * @param  discounts  Boolean value for discounts.
     * @param  taxes  Boolean value for taxes.
     * @param  credits  Boolean value for credits.
     * @param  payments  Boolean value for payments.
     * @param  customFields  Boolean value for customFields.
     */
    public ListSubscriptionGroupProformaInvoicesInput(
            String uid,
            Boolean lineItems,
            Boolean discounts,
            Boolean taxes,
            Boolean credits,
            Boolean payments,
            Boolean customFields) {
        this.uid = uid;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.payments = payments;
        this.customFields = customFields;
    }

    /**
     * Getter for Uid.
     * The uid of the subscription group
     * @return Returns the String
     */
    @JsonGetter("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * The uid of the subscription group
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for LineItems.
     * Include line items data
     * @return Returns the Boolean
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Include line items data
     * @param lineItems Value for Boolean
     */
    @JsonSetter("line_items")
    public void setLineItems(Boolean lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * Include discounts data
     * @return Returns the Boolean
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * Include discounts data
     * @param discounts Value for Boolean
     */
    @JsonSetter("discounts")
    public void setDiscounts(Boolean discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * Include taxes data
     * @return Returns the Boolean
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * Include taxes data
     * @param taxes Value for Boolean
     */
    @JsonSetter("taxes")
    public void setTaxes(Boolean taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Credits.
     * Include credits data
     * @return Returns the Boolean
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * Include credits data
     * @param credits Value for Boolean
     */
    @JsonSetter("credits")
    public void setCredits(Boolean credits) {
        this.credits = credits;
    }

    /**
     * Getter for Payments.
     * Include payments data
     * @return Returns the Boolean
     */
    @JsonGetter("payments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPayments() {
        return payments;
    }

    /**
     * Setter for Payments.
     * Include payments data
     * @param payments Value for Boolean
     */
    @JsonSetter("payments")
    public void setPayments(Boolean payments) {
        this.payments = payments;
    }

    /**
     * Getter for CustomFields.
     * Include custom fields data
     * @return Returns the Boolean
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * Include custom fields data
     * @param customFields Value for Boolean
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(Boolean customFields) {
        this.customFields = customFields;
    }

    /**
     * Converts this ListSubscriptionGroupProformaInvoicesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionGroupProformaInvoicesInput [" + "uid=" + uid + ", lineItems="
                + lineItems + ", discounts=" + discounts + ", taxes=" + taxes + ", credits="
                + credits + ", payments=" + payments + ", customFields=" + customFields + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid)
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .payments(getPayments())
                .customFields(getCustomFields());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionGroupProformaInvoicesInput}.
     */
    public static class Builder {
        private String uid;
        private Boolean lineItems = false;
        private Boolean discounts = false;
        private Boolean taxes = false;
        private Boolean credits = false;
        private Boolean payments = false;
        private Boolean customFields = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  uid  String value for uid.
         */
        public Builder(String uid) {
            this.uid = uid;
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
         * Setter for lineItems.
         * @param  lineItems  Boolean value for lineItems.
         * @return Builder
         */
        public Builder lineItems(Boolean lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  Boolean value for discounts.
         * @return Builder
         */
        public Builder discounts(Boolean discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  Boolean value for taxes.
         * @return Builder
         */
        public Builder taxes(Boolean taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  Boolean value for credits.
         * @return Builder
         */
        public Builder credits(Boolean credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for payments.
         * @param  payments  Boolean value for payments.
         * @return Builder
         */
        public Builder payments(Boolean payments) {
            this.payments = payments;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  Boolean value for customFields.
         * @return Builder
         */
        public Builder customFields(Boolean customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionGroupProformaInvoicesInput} object using the set
         * fields.
         * @return {@link ListSubscriptionGroupProformaInvoicesInput}
         */
        public ListSubscriptionGroupProformaInvoicesInput build() {
            return new ListSubscriptionGroupProformaInvoicesInput(uid, lineItems, discounts, taxes,
                    credits, payments, customFields);
        }
    }
}
