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
 * This is a model class for SiteSummary type.
 */
public class SiteSummary {
    private String sellerName;
    private String siteName;
    private Integer siteId;
    private String siteCurrency;
    private SiteStatistics stats;

    /**
     * Default constructor.
     */
    public SiteSummary() {
    }

    /**
     * Initialization constructor.
     * @param  sellerName  String value for sellerName.
     * @param  siteName  String value for siteName.
     * @param  siteId  Integer value for siteId.
     * @param  siteCurrency  String value for siteCurrency.
     * @param  stats  SiteStatistics value for stats.
     */
    public SiteSummary(
            String sellerName,
            String siteName,
            Integer siteId,
            String siteCurrency,
            SiteStatistics stats) {
        this.sellerName = sellerName;
        this.siteName = siteName;
        this.siteId = siteId;
        this.siteCurrency = siteCurrency;
        this.stats = stats;
    }

    /**
     * Getter for SellerName.
     * @return Returns the String
     */
    @JsonGetter("seller_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Setter for SellerName.
     * @param sellerName Value for String
     */
    @JsonSetter("seller_name")
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
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
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for SiteCurrency.
     * @return Returns the String
     */
    @JsonGetter("site_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSiteCurrency() {
        return siteCurrency;
    }

    /**
     * Setter for SiteCurrency.
     * @param siteCurrency Value for String
     */
    @JsonSetter("site_currency")
    public void setSiteCurrency(String siteCurrency) {
        this.siteCurrency = siteCurrency;
    }

    /**
     * Getter for Stats.
     * @return Returns the SiteStatistics
     */
    @JsonGetter("stats")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SiteStatistics getStats() {
        return stats;
    }

    /**
     * Setter for Stats.
     * @param stats Value for SiteStatistics
     */
    @JsonSetter("stats")
    public void setStats(SiteStatistics stats) {
        this.stats = stats;
    }

    /**
     * Converts this SiteSummary into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SiteSummary [" + "sellerName=" + sellerName + ", siteName=" + siteName + ", siteId="
                + siteId + ", siteCurrency=" + siteCurrency + ", stats=" + stats + "]";
    }

    /**
     * Builds a new {@link SiteSummary.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SiteSummary.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sellerName(getSellerName())
                .siteName(getSiteName())
                .siteId(getSiteId())
                .siteCurrency(getSiteCurrency())
                .stats(getStats());
        return builder;
    }

    /**
     * Class to build instances of {@link SiteSummary}.
     */
    public static class Builder {
        private String sellerName;
        private String siteName;
        private Integer siteId;
        private String siteCurrency;
        private SiteStatistics stats;



        /**
         * Setter for sellerName.
         * @param  sellerName  String value for sellerName.
         * @return Builder
         */
        public Builder sellerName(String sellerName) {
            this.sellerName = sellerName;
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
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for siteCurrency.
         * @param  siteCurrency  String value for siteCurrency.
         * @return Builder
         */
        public Builder siteCurrency(String siteCurrency) {
            this.siteCurrency = siteCurrency;
            return this;
        }

        /**
         * Setter for stats.
         * @param  stats  SiteStatistics value for stats.
         * @return Builder
         */
        public Builder stats(SiteStatistics stats) {
            this.stats = stats;
            return this;
        }

        /**
         * Builds a new {@link SiteSummary} object using the set fields.
         * @return {@link SiteSummary}
         */
        public SiteSummary build() {
            return new SiteSummary(sellerName, siteName, siteId, siteCurrency, stats);
        }
    }
}
