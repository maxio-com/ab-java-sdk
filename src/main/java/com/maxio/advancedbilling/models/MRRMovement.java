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
 * This is a model class for MRRMovement type.
 */
public class MRRMovement {
    private Integer amount;
    private String category;
    private Integer subscriberDelta;
    private Integer leadDelta;

    /**
     * Default constructor.
     */
    public MRRMovement() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Integer value for amount.
     * @param  category  String value for category.
     * @param  subscriberDelta  Integer value for subscriberDelta.
     * @param  leadDelta  Integer value for leadDelta.
     */
    public MRRMovement(
            Integer amount,
            String category,
            Integer subscriberDelta,
            Integer leadDelta) {
        this.amount = amount;
        this.category = category;
        this.subscriberDelta = subscriberDelta;
        this.leadDelta = leadDelta;
    }

    /**
     * Getter for Amount.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Category.
     * @return Returns the String
     */
    @JsonGetter("category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * @param category Value for String
     */
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter for SubscriberDelta.
     * @return Returns the Integer
     */
    @JsonGetter("subscriber_delta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriberDelta() {
        return subscriberDelta;
    }

    /**
     * Setter for SubscriberDelta.
     * @param subscriberDelta Value for Integer
     */
    @JsonSetter("subscriber_delta")
    public void setSubscriberDelta(Integer subscriberDelta) {
        this.subscriberDelta = subscriberDelta;
    }

    /**
     * Getter for LeadDelta.
     * @return Returns the Integer
     */
    @JsonGetter("lead_delta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLeadDelta() {
        return leadDelta;
    }

    /**
     * Setter for LeadDelta.
     * @param leadDelta Value for Integer
     */
    @JsonSetter("lead_delta")
    public void setLeadDelta(Integer leadDelta) {
        this.leadDelta = leadDelta;
    }

    /**
     * Converts this MRRMovement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MRRMovement [" + "amount=" + amount + ", category=" + category
                + ", subscriberDelta=" + subscriberDelta + ", leadDelta=" + leadDelta + "]";
    }

    /**
     * Builds a new {@link MRRMovement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MRRMovement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .category(getCategory())
                .subscriberDelta(getSubscriberDelta())
                .leadDelta(getLeadDelta());
        return builder;
    }

    /**
     * Class to build instances of {@link MRRMovement}.
     */
    public static class Builder {
        private Integer amount;
        private String category;
        private Integer subscriberDelta;
        private Integer leadDelta;



        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for category.
         * @param  category  String value for category.
         * @return Builder
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for subscriberDelta.
         * @param  subscriberDelta  Integer value for subscriberDelta.
         * @return Builder
         */
        public Builder subscriberDelta(Integer subscriberDelta) {
            this.subscriberDelta = subscriberDelta;
            return this;
        }

        /**
         * Setter for leadDelta.
         * @param  leadDelta  Integer value for leadDelta.
         * @return Builder
         */
        public Builder leadDelta(Integer leadDelta) {
            this.leadDelta = leadDelta;
            return this;
        }

        /**
         * Builds a new {@link MRRMovement} object using the set fields.
         * @return {@link MRRMovement}
         */
        public MRRMovement build() {
            return new MRRMovement(amount, category, subscriberDelta, leadDelta);
        }
    }
}
