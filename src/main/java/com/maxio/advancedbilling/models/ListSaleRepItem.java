/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for ListSaleRepItem type.
 */
public class ListSaleRepItem {
    private Integer id;
    private String fullName;
    private Integer subscriptionsCount;
    private Map<String, SaleRepItemMrr> mrrData;
    private Boolean testMode;

    /**
     * Default constructor.
     */
    public ListSaleRepItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  fullName  String value for fullName.
     * @param  subscriptionsCount  Integer value for subscriptionsCount.
     * @param  mrrData  Map of String, value for mrrData.
     * @param  testMode  Boolean value for testMode.
     */
    public ListSaleRepItem(
            Integer id,
            String fullName,
            Integer subscriptionsCount,
            Map<String, SaleRepItemMrr> mrrData,
            Boolean testMode) {
        this.id = id;
        this.fullName = fullName;
        this.subscriptionsCount = subscriptionsCount;
        this.mrrData = mrrData;
        this.testMode = testMode;
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
     * Getter for FullName.
     * @return Returns the String
     */
    @JsonGetter("full_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter for FullName.
     * @param fullName Value for String
     */
    @JsonSetter("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter for SubscriptionsCount.
     * @return Returns the Integer
     */
    @JsonGetter("subscriptions_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionsCount() {
        return subscriptionsCount;
    }

    /**
     * Setter for SubscriptionsCount.
     * @param subscriptionsCount Value for Integer
     */
    @JsonSetter("subscriptions_count")
    public void setSubscriptionsCount(Integer subscriptionsCount) {
        this.subscriptionsCount = subscriptionsCount;
    }

    /**
     * Getter for MrrData.
     * @return Returns the Map of String, SaleRepItemMrr
     */
    @JsonGetter("mrr_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, SaleRepItemMrr> getMrrData() {
        return mrrData;
    }

    /**
     * Setter for MrrData.
     * @param mrrData Value for Map of String, SaleRepItemMrr
     */
    @JsonSetter("mrr_data")
    public void setMrrData(Map<String, SaleRepItemMrr> mrrData) {
        this.mrrData = mrrData;
    }

    /**
     * Getter for TestMode.
     * @return Returns the Boolean
     */
    @JsonGetter("test_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTestMode() {
        return testMode;
    }

    /**
     * Setter for TestMode.
     * @param testMode Value for Boolean
     */
    @JsonSetter("test_mode")
    public void setTestMode(Boolean testMode) {
        this.testMode = testMode;
    }

    /**
     * Converts this ListSaleRepItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSaleRepItem [" + "id=" + id + ", fullName=" + fullName + ", subscriptionsCount="
                + subscriptionsCount + ", mrrData=" + mrrData + ", testMode=" + testMode + "]";
    }

    /**
     * Builds a new {@link ListSaleRepItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSaleRepItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .fullName(getFullName())
                .subscriptionsCount(getSubscriptionsCount())
                .mrrData(getMrrData())
                .testMode(getTestMode());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSaleRepItem}.
     */
    public static class Builder {
        private Integer id;
        private String fullName;
        private Integer subscriptionsCount;
        private Map<String, SaleRepItemMrr> mrrData;
        private Boolean testMode;



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
         * Setter for fullName.
         * @param  fullName  String value for fullName.
         * @return Builder
         */
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        /**
         * Setter for subscriptionsCount.
         * @param  subscriptionsCount  Integer value for subscriptionsCount.
         * @return Builder
         */
        public Builder subscriptionsCount(Integer subscriptionsCount) {
            this.subscriptionsCount = subscriptionsCount;
            return this;
        }

        /**
         * Setter for mrrData.
         * @param  mrrData  Map of String, value for mrrData.
         * @return Builder
         */
        public Builder mrrData(Map<String, SaleRepItemMrr> mrrData) {
            this.mrrData = mrrData;
            return this;
        }

        /**
         * Setter for testMode.
         * @param  testMode  Boolean value for testMode.
         * @return Builder
         */
        public Builder testMode(Boolean testMode) {
            this.testMode = testMode;
            return this;
        }

        /**
         * Builds a new {@link ListSaleRepItem} object using the set fields.
         * @return {@link ListSaleRepItem}
         */
        public ListSaleRepItem build() {
            return new ListSaleRepItem(id, fullName, subscriptionsCount, mrrData, testMode);
        }
    }
}
