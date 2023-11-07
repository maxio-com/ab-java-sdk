/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SaleRepSubscription type.
 */
public class SaleRepSubscription {
    private Integer id;
    private String siteName;
    private String subscriptionUrl;
    private String customerName;
    private String createdAt;
    private String mrr;
    private String usage;
    private String recurring;
    private String lastPayment;
    private OptionalNullable<String> churnDate;

    /**
     * Default constructor.
     */
    public SaleRepSubscription() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteName  String value for siteName.
     * @param  subscriptionUrl  String value for subscriptionUrl.
     * @param  customerName  String value for customerName.
     * @param  createdAt  String value for createdAt.
     * @param  mrr  String value for mrr.
     * @param  usage  String value for usage.
     * @param  recurring  String value for recurring.
     * @param  lastPayment  String value for lastPayment.
     * @param  churnDate  String value for churnDate.
     */
    public SaleRepSubscription(
            Integer id,
            String siteName,
            String subscriptionUrl,
            String customerName,
            String createdAt,
            String mrr,
            String usage,
            String recurring,
            String lastPayment,
            String churnDate) {
        this.id = id;
        this.siteName = siteName;
        this.subscriptionUrl = subscriptionUrl;
        this.customerName = customerName;
        this.createdAt = createdAt;
        this.mrr = mrr;
        this.usage = usage;
        this.recurring = recurring;
        this.lastPayment = lastPayment;
        this.churnDate = OptionalNullable.of(churnDate);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteName  String value for siteName.
     * @param  subscriptionUrl  String value for subscriptionUrl.
     * @param  customerName  String value for customerName.
     * @param  createdAt  String value for createdAt.
     * @param  mrr  String value for mrr.
     * @param  usage  String value for usage.
     * @param  recurring  String value for recurring.
     * @param  lastPayment  String value for lastPayment.
     * @param  churnDate  String value for churnDate.
     */

    protected SaleRepSubscription(Integer id, String siteName, String subscriptionUrl,
            String customerName, String createdAt, String mrr, String usage, String recurring,
            String lastPayment, OptionalNullable<String> churnDate) {
        this.id = id;
        this.siteName = siteName;
        this.subscriptionUrl = subscriptionUrl;
        this.customerName = customerName;
        this.createdAt = createdAt;
        this.mrr = mrr;
        this.usage = usage;
        this.recurring = recurring;
        this.lastPayment = lastPayment;
        this.churnDate = churnDate;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SiteName.
     * @return Returns the String
     */
    @JsonGetter("site_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSiteName() {
        return siteName;
    }

    /**
     * Setter for SiteName.
     * @param siteName Value for String
     */
    @JsonSetter("site_name")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Getter for SubscriptionUrl.
     * @return Returns the String
     */
    @JsonGetter("subscription_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * Setter for SubscriptionUrl.
     * @param subscriptionUrl Value for String
     */
    @JsonSetter("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * Getter for CustomerName.
     * @return Returns the String
     */
    @JsonGetter("customer_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter for CustomerName.
     * @param customerName Value for String
     */
    @JsonSetter("customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Mrr.
     * @return Returns the String
     */
    @JsonGetter("mrr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMrr() {
        return mrr;
    }

    /**
     * Setter for Mrr.
     * @param mrr Value for String
     */
    @JsonSetter("mrr")
    public void setMrr(String mrr) {
        this.mrr = mrr;
    }

    /**
     * Getter for Usage.
     * @return Returns the String
     */
    @JsonGetter("usage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsage() {
        return usage;
    }

    /**
     * Setter for Usage.
     * @param usage Value for String
     */
    @JsonSetter("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Getter for Recurring.
     * @return Returns the String
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * @param recurring Value for String
     */
    @JsonSetter("recurring")
    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    /**
     * Getter for LastPayment.
     * @return Returns the String
     */
    @JsonGetter("last_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastPayment() {
        return lastPayment;
    }

    /**
     * Setter for LastPayment.
     * @param lastPayment Value for String
     */
    @JsonSetter("last_payment")
    public void setLastPayment(String lastPayment) {
        this.lastPayment = lastPayment;
    }

    /**
     * Internal Getter for ChurnDate.
     * @return Returns the Internal String
     */
    @JsonGetter("churn_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChurnDate() {
        return this.churnDate;
    }

    /**
     * Getter for ChurnDate.
     * @return Returns the String
     */
    public String getChurnDate() {
        return OptionalNullable.getFrom(churnDate);
    }

    /**
     * Setter for ChurnDate.
     * @param churnDate Value for String
     */
    @JsonSetter("churn_date")
    public void setChurnDate(String churnDate) {
        this.churnDate = OptionalNullable.of(churnDate);
    }

    /**
     * UnSetter for ChurnDate.
     */
    public void unsetChurnDate() {
        churnDate = null;
    }

    /**
     * Converts this SaleRepSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SaleRepSubscription [" + "id=" + id + ", siteName=" + siteName
                + ", subscriptionUrl=" + subscriptionUrl + ", customerName=" + customerName
                + ", createdAt=" + createdAt + ", mrr=" + mrr + ", usage=" + usage + ", recurring="
                + recurring + ", lastPayment=" + lastPayment + ", churnDate=" + churnDate + "]";
    }

    /**
     * Builds a new {@link SaleRepSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SaleRepSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .siteName(getSiteName())
                .subscriptionUrl(getSubscriptionUrl())
                .customerName(getCustomerName())
                .createdAt(getCreatedAt())
                .mrr(getMrr())
                .usage(getUsage())
                .recurring(getRecurring())
                .lastPayment(getLastPayment());
        builder.churnDate = internalGetChurnDate();
        return builder;
    }

    /**
     * Class to build instances of {@link SaleRepSubscription}.
     */
    public static class Builder {
        private Integer id;
        private String siteName;
        private String subscriptionUrl;
        private String customerName;
        private String createdAt;
        private String mrr;
        private String usage;
        private String recurring;
        private String lastPayment;
        private OptionalNullable<String> churnDate;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for siteName.
         * @param  siteName  String value for siteName.
         * @return Builder
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * Setter for subscriptionUrl.
         * @param  subscriptionUrl  String value for subscriptionUrl.
         * @return Builder
         */
        public Builder subscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
            return this;
        }

        /**
         * Setter for customerName.
         * @param  customerName  String value for customerName.
         * @return Builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
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
         * Setter for mrr.
         * @param  mrr  String value for mrr.
         * @return Builder
         */
        public Builder mrr(String mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
         * Setter for usage.
         * @param  usage  String value for usage.
         * @return Builder
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  String value for recurring.
         * @return Builder
         */
        public Builder recurring(String recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Setter for lastPayment.
         * @param  lastPayment  String value for lastPayment.
         * @return Builder
         */
        public Builder lastPayment(String lastPayment) {
            this.lastPayment = lastPayment;
            return this;
        }

        /**
         * Setter for churnDate.
         * @param  churnDate  String value for churnDate.
         * @return Builder
         */
        public Builder churnDate(String churnDate) {
            this.churnDate = OptionalNullable.of(churnDate);
            return this;
        }

        /**
         * UnSetter for churnDate.
         * @return Builder
         */
        public Builder unsetChurnDate() {
            churnDate = null;
            return this;
        }

        /**
         * Builds a new {@link SaleRepSubscription} object using the set fields.
         * @return {@link SaleRepSubscription}
         */
        public SaleRepSubscription build() {
            return new SaleRepSubscription(id, siteName, subscriptionUrl, customerName, createdAt,
                    mrr, usage, recurring, lastPayment, churnDate);
        }
    }
}
