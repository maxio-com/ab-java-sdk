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
 * This is a model class for SiteStatistics type.
 */
public class SiteStatistics {
    private Integer totalSubscriptions;
    private Integer subscriptionsToday;
    private String totalRevenue;
    private String revenueToday;
    private String revenueThisMonth;
    private String revenueThisYear;
    private Integer totalCanceledSubscriptions;
    private Double totalActiveSubscriptions;
    private Double totalPastDueSubscriptions;
    private Double totalUnpaidSubscriptions;
    private Double totalDunningSubscriptions;

    /**
     * Default constructor.
     */
    public SiteStatistics() {
    }

    /**
     * Initialization constructor.
     * @param  totalSubscriptions  Integer value for totalSubscriptions.
     * @param  subscriptionsToday  Integer value for subscriptionsToday.
     * @param  totalRevenue  String value for totalRevenue.
     * @param  revenueToday  String value for revenueToday.
     * @param  revenueThisMonth  String value for revenueThisMonth.
     * @param  revenueThisYear  String value for revenueThisYear.
     * @param  totalCanceledSubscriptions  Integer value for totalCanceledSubscriptions.
     * @param  totalActiveSubscriptions  Double value for totalActiveSubscriptions.
     * @param  totalPastDueSubscriptions  Double value for totalPastDueSubscriptions.
     * @param  totalUnpaidSubscriptions  Double value for totalUnpaidSubscriptions.
     * @param  totalDunningSubscriptions  Double value for totalDunningSubscriptions.
     */
    public SiteStatistics(
            Integer totalSubscriptions,
            Integer subscriptionsToday,
            String totalRevenue,
            String revenueToday,
            String revenueThisMonth,
            String revenueThisYear,
            Integer totalCanceledSubscriptions,
            Double totalActiveSubscriptions,
            Double totalPastDueSubscriptions,
            Double totalUnpaidSubscriptions,
            Double totalDunningSubscriptions) {
        this.totalSubscriptions = totalSubscriptions;
        this.subscriptionsToday = subscriptionsToday;
        this.totalRevenue = totalRevenue;
        this.revenueToday = revenueToday;
        this.revenueThisMonth = revenueThisMonth;
        this.revenueThisYear = revenueThisYear;
        this.totalCanceledSubscriptions = totalCanceledSubscriptions;
        this.totalActiveSubscriptions = totalActiveSubscriptions;
        this.totalPastDueSubscriptions = totalPastDueSubscriptions;
        this.totalUnpaidSubscriptions = totalUnpaidSubscriptions;
        this.totalDunningSubscriptions = totalDunningSubscriptions;
    }

    /**
     * Getter for TotalSubscriptions.
     * @return Returns the Integer
     */
    @JsonGetter("total_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalSubscriptions() {
        return totalSubscriptions;
    }

    /**
     * Setter for TotalSubscriptions.
     * @param totalSubscriptions Value for Integer
     */
    @JsonSetter("total_subscriptions")
    public void setTotalSubscriptions(Integer totalSubscriptions) {
        this.totalSubscriptions = totalSubscriptions;
    }

    /**
     * Getter for SubscriptionsToday.
     * @return Returns the Integer
     */
    @JsonGetter("subscriptions_today")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionsToday() {
        return subscriptionsToday;
    }

    /**
     * Setter for SubscriptionsToday.
     * @param subscriptionsToday Value for Integer
     */
    @JsonSetter("subscriptions_today")
    public void setSubscriptionsToday(Integer subscriptionsToday) {
        this.subscriptionsToday = subscriptionsToday;
    }

    /**
     * Getter for TotalRevenue.
     * @return Returns the String
     */
    @JsonGetter("total_revenue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Setter for TotalRevenue.
     * @param totalRevenue Value for String
     */
    @JsonSetter("total_revenue")
    public void setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    /**
     * Getter for RevenueToday.
     * @return Returns the String
     */
    @JsonGetter("revenue_today")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRevenueToday() {
        return revenueToday;
    }

    /**
     * Setter for RevenueToday.
     * @param revenueToday Value for String
     */
    @JsonSetter("revenue_today")
    public void setRevenueToday(String revenueToday) {
        this.revenueToday = revenueToday;
    }

    /**
     * Getter for RevenueThisMonth.
     * @return Returns the String
     */
    @JsonGetter("revenue_this_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRevenueThisMonth() {
        return revenueThisMonth;
    }

    /**
     * Setter for RevenueThisMonth.
     * @param revenueThisMonth Value for String
     */
    @JsonSetter("revenue_this_month")
    public void setRevenueThisMonth(String revenueThisMonth) {
        this.revenueThisMonth = revenueThisMonth;
    }

    /**
     * Getter for RevenueThisYear.
     * @return Returns the String
     */
    @JsonGetter("revenue_this_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRevenueThisYear() {
        return revenueThisYear;
    }

    /**
     * Setter for RevenueThisYear.
     * @param revenueThisYear Value for String
     */
    @JsonSetter("revenue_this_year")
    public void setRevenueThisYear(String revenueThisYear) {
        this.revenueThisYear = revenueThisYear;
    }

    /**
     * Getter for TotalCanceledSubscriptions.
     * @return Returns the Integer
     */
    @JsonGetter("total_canceled_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalCanceledSubscriptions() {
        return totalCanceledSubscriptions;
    }

    /**
     * Setter for TotalCanceledSubscriptions.
     * @param totalCanceledSubscriptions Value for Integer
     */
    @JsonSetter("total_canceled_subscriptions")
    public void setTotalCanceledSubscriptions(Integer totalCanceledSubscriptions) {
        this.totalCanceledSubscriptions = totalCanceledSubscriptions;
    }

    /**
     * Getter for TotalActiveSubscriptions.
     * @return Returns the Double
     */
    @JsonGetter("total_active_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalActiveSubscriptions() {
        return totalActiveSubscriptions;
    }

    /**
     * Setter for TotalActiveSubscriptions.
     * @param totalActiveSubscriptions Value for Double
     */
    @JsonSetter("total_active_subscriptions")
    public void setTotalActiveSubscriptions(Double totalActiveSubscriptions) {
        this.totalActiveSubscriptions = totalActiveSubscriptions;
    }

    /**
     * Getter for TotalPastDueSubscriptions.
     * @return Returns the Double
     */
    @JsonGetter("total_past_due_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalPastDueSubscriptions() {
        return totalPastDueSubscriptions;
    }

    /**
     * Setter for TotalPastDueSubscriptions.
     * @param totalPastDueSubscriptions Value for Double
     */
    @JsonSetter("total_past_due_subscriptions")
    public void setTotalPastDueSubscriptions(Double totalPastDueSubscriptions) {
        this.totalPastDueSubscriptions = totalPastDueSubscriptions;
    }

    /**
     * Getter for TotalUnpaidSubscriptions.
     * @return Returns the Double
     */
    @JsonGetter("total_unpaid_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalUnpaidSubscriptions() {
        return totalUnpaidSubscriptions;
    }

    /**
     * Setter for TotalUnpaidSubscriptions.
     * @param totalUnpaidSubscriptions Value for Double
     */
    @JsonSetter("total_unpaid_subscriptions")
    public void setTotalUnpaidSubscriptions(Double totalUnpaidSubscriptions) {
        this.totalUnpaidSubscriptions = totalUnpaidSubscriptions;
    }

    /**
     * Getter for TotalDunningSubscriptions.
     * @return Returns the Double
     */
    @JsonGetter("total_dunning_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalDunningSubscriptions() {
        return totalDunningSubscriptions;
    }

    /**
     * Setter for TotalDunningSubscriptions.
     * @param totalDunningSubscriptions Value for Double
     */
    @JsonSetter("total_dunning_subscriptions")
    public void setTotalDunningSubscriptions(Double totalDunningSubscriptions) {
        this.totalDunningSubscriptions = totalDunningSubscriptions;
    }

    /**
     * Converts this SiteStatistics into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SiteStatistics [" + "totalSubscriptions=" + totalSubscriptions
                + ", subscriptionsToday=" + subscriptionsToday + ", totalRevenue=" + totalRevenue
                + ", revenueToday=" + revenueToday + ", revenueThisMonth=" + revenueThisMonth
                + ", revenueThisYear=" + revenueThisYear + ", totalCanceledSubscriptions="
                + totalCanceledSubscriptions + ", totalActiveSubscriptions="
                + totalActiveSubscriptions + ", totalPastDueSubscriptions="
                + totalPastDueSubscriptions + ", totalUnpaidSubscriptions="
                + totalUnpaidSubscriptions + ", totalDunningSubscriptions="
                + totalDunningSubscriptions + "]";
    }

    /**
     * Builds a new {@link SiteStatistics.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SiteStatistics.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalSubscriptions(getTotalSubscriptions())
                .subscriptionsToday(getSubscriptionsToday())
                .totalRevenue(getTotalRevenue())
                .revenueToday(getRevenueToday())
                .revenueThisMonth(getRevenueThisMonth())
                .revenueThisYear(getRevenueThisYear())
                .totalCanceledSubscriptions(getTotalCanceledSubscriptions())
                .totalActiveSubscriptions(getTotalActiveSubscriptions())
                .totalPastDueSubscriptions(getTotalPastDueSubscriptions())
                .totalUnpaidSubscriptions(getTotalUnpaidSubscriptions())
                .totalDunningSubscriptions(getTotalDunningSubscriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link SiteStatistics}.
     */
    public static class Builder {
        private Integer totalSubscriptions;
        private Integer subscriptionsToday;
        private String totalRevenue;
        private String revenueToday;
        private String revenueThisMonth;
        private String revenueThisYear;
        private Integer totalCanceledSubscriptions;
        private Double totalActiveSubscriptions;
        private Double totalPastDueSubscriptions;
        private Double totalUnpaidSubscriptions;
        private Double totalDunningSubscriptions;



        /**
         * Setter for totalSubscriptions.
         * @param  totalSubscriptions  Integer value for totalSubscriptions.
         * @return Builder
         */
        public Builder totalSubscriptions(Integer totalSubscriptions) {
            this.totalSubscriptions = totalSubscriptions;
            return this;
        }

        /**
         * Setter for subscriptionsToday.
         * @param  subscriptionsToday  Integer value for subscriptionsToday.
         * @return Builder
         */
        public Builder subscriptionsToday(Integer subscriptionsToday) {
            this.subscriptionsToday = subscriptionsToday;
            return this;
        }

        /**
         * Setter for totalRevenue.
         * @param  totalRevenue  String value for totalRevenue.
         * @return Builder
         */
        public Builder totalRevenue(String totalRevenue) {
            this.totalRevenue = totalRevenue;
            return this;
        }

        /**
         * Setter for revenueToday.
         * @param  revenueToday  String value for revenueToday.
         * @return Builder
         */
        public Builder revenueToday(String revenueToday) {
            this.revenueToday = revenueToday;
            return this;
        }

        /**
         * Setter for revenueThisMonth.
         * @param  revenueThisMonth  String value for revenueThisMonth.
         * @return Builder
         */
        public Builder revenueThisMonth(String revenueThisMonth) {
            this.revenueThisMonth = revenueThisMonth;
            return this;
        }

        /**
         * Setter for revenueThisYear.
         * @param  revenueThisYear  String value for revenueThisYear.
         * @return Builder
         */
        public Builder revenueThisYear(String revenueThisYear) {
            this.revenueThisYear = revenueThisYear;
            return this;
        }

        /**
         * Setter for totalCanceledSubscriptions.
         * @param  totalCanceledSubscriptions  Integer value for totalCanceledSubscriptions.
         * @return Builder
         */
        public Builder totalCanceledSubscriptions(Integer totalCanceledSubscriptions) {
            this.totalCanceledSubscriptions = totalCanceledSubscriptions;
            return this;
        }

        /**
         * Setter for totalActiveSubscriptions.
         * @param  totalActiveSubscriptions  Double value for totalActiveSubscriptions.
         * @return Builder
         */
        public Builder totalActiveSubscriptions(Double totalActiveSubscriptions) {
            this.totalActiveSubscriptions = totalActiveSubscriptions;
            return this;
        }

        /**
         * Setter for totalPastDueSubscriptions.
         * @param  totalPastDueSubscriptions  Double value for totalPastDueSubscriptions.
         * @return Builder
         */
        public Builder totalPastDueSubscriptions(Double totalPastDueSubscriptions) {
            this.totalPastDueSubscriptions = totalPastDueSubscriptions;
            return this;
        }

        /**
         * Setter for totalUnpaidSubscriptions.
         * @param  totalUnpaidSubscriptions  Double value for totalUnpaidSubscriptions.
         * @return Builder
         */
        public Builder totalUnpaidSubscriptions(Double totalUnpaidSubscriptions) {
            this.totalUnpaidSubscriptions = totalUnpaidSubscriptions;
            return this;
        }

        /**
         * Setter for totalDunningSubscriptions.
         * @param  totalDunningSubscriptions  Double value for totalDunningSubscriptions.
         * @return Builder
         */
        public Builder totalDunningSubscriptions(Double totalDunningSubscriptions) {
            this.totalDunningSubscriptions = totalDunningSubscriptions;
            return this;
        }

        /**
         * Builds a new {@link SiteStatistics} object using the set fields.
         * @return {@link SiteStatistics}
         */
        public SiteStatistics build() {
            return new SiteStatistics(totalSubscriptions, subscriptionsToday, totalRevenue,
                    revenueToday, revenueThisMonth, revenueThisYear, totalCanceledSubscriptions,
                    totalActiveSubscriptions, totalPastDueSubscriptions, totalUnpaidSubscriptions,
                    totalDunningSubscriptions);
        }
    }
}
