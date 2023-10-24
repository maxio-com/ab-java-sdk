/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SaleRep type.
 */
public class SaleRep {
    private Integer id;
    private String fullName;
    private Integer subscriptionsCount;
    private Boolean testMode;
    private List<SaleRepSubscription> subscriptions;

    /**
     * Default constructor.
     */
    public SaleRep() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  fullName  String value for fullName.
     * @param  subscriptionsCount  Integer value for subscriptionsCount.
     * @param  testMode  Boolean value for testMode.
     * @param  subscriptions  List of SaleRepSubscription value for subscriptions.
     */
    public SaleRep(
            Integer id,
            String fullName,
            Integer subscriptionsCount,
            Boolean testMode,
            List<SaleRepSubscription> subscriptions) {
        this.id = id;
        this.fullName = fullName;
        this.subscriptionsCount = subscriptionsCount;
        this.testMode = testMode;
        this.subscriptions = subscriptions;
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
     * Getter for Subscriptions.
     * @return Returns the List of SaleRepSubscription
     */
    @JsonGetter("subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SaleRepSubscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Setter for Subscriptions.
     * @param subscriptions Value for List of SaleRepSubscription
     */
    @JsonSetter("subscriptions")
    public void setSubscriptions(List<SaleRepSubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * Converts this SaleRep into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SaleRep [" + "id=" + id + ", fullName=" + fullName + ", subscriptionsCount="
                + subscriptionsCount + ", testMode=" + testMode + ", subscriptions=" + subscriptions
                + "]";
    }

    /**
     * Builds a new {@link SaleRep.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SaleRep.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .fullName(getFullName())
                .subscriptionsCount(getSubscriptionsCount())
                .testMode(getTestMode())
                .subscriptions(getSubscriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link SaleRep}.
     */
    public static class Builder {
        private Integer id;
        private String fullName;
        private Integer subscriptionsCount;
        private Boolean testMode;
        private List<SaleRepSubscription> subscriptions;



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
         * Setter for testMode.
         * @param  testMode  Boolean value for testMode.
         * @return Builder
         */
        public Builder testMode(Boolean testMode) {
            this.testMode = testMode;
            return this;
        }

        /**
         * Setter for subscriptions.
         * @param  subscriptions  List of SaleRepSubscription value for subscriptions.
         * @return Builder
         */
        public Builder subscriptions(List<SaleRepSubscription> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * Builds a new {@link SaleRep} object using the set fields.
         * @return {@link SaleRep}
         */
        public SaleRep build() {
            return new SaleRep(id, fullName, subscriptionsCount, testMode, subscriptions);
        }
    }
}
