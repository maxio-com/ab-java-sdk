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
 * This is a model class for SaleRepSettings type.
 */
public class SaleRepSettings {
    private String customerName;
    private Integer subscriptionId;
    private String siteLink;
    private String siteName;
    private String subscriptionMrr;
    private Integer salesRepId;
    private String salesRepName;

    /**
     * Default constructor.
     */
    public SaleRepSettings() {
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  siteLink  String value for siteLink.
     * @param  siteName  String value for siteName.
     * @param  subscriptionMrr  String value for subscriptionMrr.
     * @param  salesRepId  Integer value for salesRepId.
     * @param  salesRepName  String value for salesRepName.
     */
    public SaleRepSettings(
            String customerName,
            Integer subscriptionId,
            String siteLink,
            String siteName,
            String subscriptionMrr,
            Integer salesRepId,
            String salesRepName) {
        this.customerName = customerName;
        this.subscriptionId = subscriptionId;
        this.siteLink = siteLink;
        this.siteName = siteName;
        this.subscriptionMrr = subscriptionMrr;
        this.salesRepId = salesRepId;
        this.salesRepName = salesRepName;
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
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for SiteLink.
     * @return Returns the String
     */
    @JsonGetter("site_link")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSiteLink() {
        return siteLink;
    }

    /**
     * Setter for SiteLink.
     * @param siteLink Value for String
     */
    @JsonSetter("site_link")
    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
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
     * Getter for SubscriptionMrr.
     * @return Returns the String
     */
    @JsonGetter("subscription_mrr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionMrr() {
        return subscriptionMrr;
    }

    /**
     * Setter for SubscriptionMrr.
     * @param subscriptionMrr Value for String
     */
    @JsonSetter("subscription_mrr")
    public void setSubscriptionMrr(String subscriptionMrr) {
        this.subscriptionMrr = subscriptionMrr;
    }

    /**
     * Getter for SalesRepId.
     * @return Returns the Integer
     */
    @JsonGetter("sales_rep_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSalesRepId() {
        return salesRepId;
    }

    /**
     * Setter for SalesRepId.
     * @param salesRepId Value for Integer
     */
    @JsonSetter("sales_rep_id")
    public void setSalesRepId(Integer salesRepId) {
        this.salesRepId = salesRepId;
    }

    /**
     * Getter for SalesRepName.
     * @return Returns the String
     */
    @JsonGetter("sales_rep_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSalesRepName() {
        return salesRepName;
    }

    /**
     * Setter for SalesRepName.
     * @param salesRepName Value for String
     */
    @JsonSetter("sales_rep_name")
    public void setSalesRepName(String salesRepName) {
        this.salesRepName = salesRepName;
    }

    /**
     * Converts this SaleRepSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SaleRepSettings [" + "customerName=" + customerName + ", subscriptionId="
                + subscriptionId + ", siteLink=" + siteLink + ", siteName=" + siteName
                + ", subscriptionMrr=" + subscriptionMrr + ", salesRepId=" + salesRepId
                + ", salesRepName=" + salesRepName + "]";
    }

    /**
     * Builds a new {@link SaleRepSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SaleRepSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerName(getCustomerName())
                .subscriptionId(getSubscriptionId())
                .siteLink(getSiteLink())
                .siteName(getSiteName())
                .subscriptionMrr(getSubscriptionMrr())
                .salesRepId(getSalesRepId())
                .salesRepName(getSalesRepName());
        return builder;
    }

    /**
     * Class to build instances of {@link SaleRepSettings}.
     */
    public static class Builder {
        private String customerName;
        private Integer subscriptionId;
        private String siteLink;
        private String siteName;
        private String subscriptionMrr;
        private Integer salesRepId;
        private String salesRepName;



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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for siteLink.
         * @param  siteLink  String value for siteLink.
         * @return Builder
         */
        public Builder siteLink(String siteLink) {
            this.siteLink = siteLink;
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
         * Setter for subscriptionMrr.
         * @param  subscriptionMrr  String value for subscriptionMrr.
         * @return Builder
         */
        public Builder subscriptionMrr(String subscriptionMrr) {
            this.subscriptionMrr = subscriptionMrr;
            return this;
        }

        /**
         * Setter for salesRepId.
         * @param  salesRepId  Integer value for salesRepId.
         * @return Builder
         */
        public Builder salesRepId(Integer salesRepId) {
            this.salesRepId = salesRepId;
            return this;
        }

        /**
         * Setter for salesRepName.
         * @param  salesRepName  String value for salesRepName.
         * @return Builder
         */
        public Builder salesRepName(String salesRepName) {
            this.salesRepName = salesRepName;
            return this;
        }

        /**
         * Builds a new {@link SaleRepSettings} object using the set fields.
         * @return {@link SaleRepSettings}
         */
        public SaleRepSettings build() {
            return new SaleRepSettings(customerName, subscriptionId, siteLink, siteName,
                    subscriptionMrr, salesRepId, salesRepName);
        }
    }
}
