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
 * This is a model class for PrepaidConfiguration type.
 */
public class PrepaidConfiguration {
    private Integer id;
    private Integer initialFundingAmountInCents;
    private Integer replenishToAmountInCents;
    private Boolean autoReplenish;
    private Integer replenishThresholdAmountInCents;

    /**
     * Default constructor.
     */
    public PrepaidConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  initialFundingAmountInCents  Integer value for initialFundingAmountInCents.
     * @param  replenishToAmountInCents  Integer value for replenishToAmountInCents.
     * @param  autoReplenish  Boolean value for autoReplenish.
     * @param  replenishThresholdAmountInCents  Integer value for replenishThresholdAmountInCents.
     */
    public PrepaidConfiguration(
            Integer id,
            Integer initialFundingAmountInCents,
            Integer replenishToAmountInCents,
            Boolean autoReplenish,
            Integer replenishThresholdAmountInCents) {
        this.id = id;
        this.initialFundingAmountInCents = initialFundingAmountInCents;
        this.replenishToAmountInCents = replenishToAmountInCents;
        this.autoReplenish = autoReplenish;
        this.replenishThresholdAmountInCents = replenishThresholdAmountInCents;
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
     * Getter for InitialFundingAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("initial_funding_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialFundingAmountInCents() {
        return initialFundingAmountInCents;
    }

    /**
     * Setter for InitialFundingAmountInCents.
     * @param initialFundingAmountInCents Value for Integer
     */
    @JsonSetter("initial_funding_amount_in_cents")
    public void setInitialFundingAmountInCents(Integer initialFundingAmountInCents) {
        this.initialFundingAmountInCents = initialFundingAmountInCents;
    }

    /**
     * Getter for ReplenishToAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("replenish_to_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReplenishToAmountInCents() {
        return replenishToAmountInCents;
    }

    /**
     * Setter for ReplenishToAmountInCents.
     * @param replenishToAmountInCents Value for Integer
     */
    @JsonSetter("replenish_to_amount_in_cents")
    public void setReplenishToAmountInCents(Integer replenishToAmountInCents) {
        this.replenishToAmountInCents = replenishToAmountInCents;
    }

    /**
     * Getter for AutoReplenish.
     * @return Returns the Boolean
     */
    @JsonGetter("auto_replenish")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoReplenish() {
        return autoReplenish;
    }

    /**
     * Setter for AutoReplenish.
     * @param autoReplenish Value for Boolean
     */
    @JsonSetter("auto_replenish")
    public void setAutoReplenish(Boolean autoReplenish) {
        this.autoReplenish = autoReplenish;
    }

    /**
     * Getter for ReplenishThresholdAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("replenish_threshold_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReplenishThresholdAmountInCents() {
        return replenishThresholdAmountInCents;
    }

    /**
     * Setter for ReplenishThresholdAmountInCents.
     * @param replenishThresholdAmountInCents Value for Integer
     */
    @JsonSetter("replenish_threshold_amount_in_cents")
    public void setReplenishThresholdAmountInCents(Integer replenishThresholdAmountInCents) {
        this.replenishThresholdAmountInCents = replenishThresholdAmountInCents;
    }

    /**
     * Converts this PrepaidConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidConfiguration [" + "id=" + id + ", initialFundingAmountInCents="
                + initialFundingAmountInCents + ", replenishToAmountInCents="
                + replenishToAmountInCents + ", autoReplenish=" + autoReplenish
                + ", replenishThresholdAmountInCents=" + replenishThresholdAmountInCents + "]";
    }

    /**
     * Builds a new {@link PrepaidConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .initialFundingAmountInCents(getInitialFundingAmountInCents())
                .replenishToAmountInCents(getReplenishToAmountInCents())
                .autoReplenish(getAutoReplenish())
                .replenishThresholdAmountInCents(getReplenishThresholdAmountInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidConfiguration}.
     */
    public static class Builder {
        private Integer id;
        private Integer initialFundingAmountInCents;
        private Integer replenishToAmountInCents;
        private Boolean autoReplenish;
        private Integer replenishThresholdAmountInCents;



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
         * Setter for initialFundingAmountInCents.
         * @param  initialFundingAmountInCents  Integer value for initialFundingAmountInCents.
         * @return Builder
         */
        public Builder initialFundingAmountInCents(Integer initialFundingAmountInCents) {
            this.initialFundingAmountInCents = initialFundingAmountInCents;
            return this;
        }

        /**
         * Setter for replenishToAmountInCents.
         * @param  replenishToAmountInCents  Integer value for replenishToAmountInCents.
         * @return Builder
         */
        public Builder replenishToAmountInCents(Integer replenishToAmountInCents) {
            this.replenishToAmountInCents = replenishToAmountInCents;
            return this;
        }

        /**
         * Setter for autoReplenish.
         * @param  autoReplenish  Boolean value for autoReplenish.
         * @return Builder
         */
        public Builder autoReplenish(Boolean autoReplenish) {
            this.autoReplenish = autoReplenish;
            return this;
        }

        /**
         * Setter for replenishThresholdAmountInCents.
         * @param  replenishThresholdAmountInCents  Integer value for
         *         replenishThresholdAmountInCents.
         * @return Builder
         */
        public Builder replenishThresholdAmountInCents(Integer replenishThresholdAmountInCents) {
            this.replenishThresholdAmountInCents = replenishThresholdAmountInCents;
            return this;
        }

        /**
         * Builds a new {@link PrepaidConfiguration} object using the set fields.
         * @return {@link PrepaidConfiguration}
         */
        public PrepaidConfiguration build() {
            return new PrepaidConfiguration(id, initialFundingAmountInCents,
                    replenishToAmountInCents, autoReplenish, replenishThresholdAmountInCents);
        }
    }
}
