/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GroupSettings type.
 */
public class GroupSettings {
    private GroupTarget target;
    private GroupBilling billing;

    /**
     * Default constructor.
     */
    public GroupSettings() {
    }

    /**
     * Initialization constructor.
     * @param  target  GroupTarget value for target.
     * @param  billing  GroupBilling value for billing.
     */
    public GroupSettings(
            GroupTarget target,
            GroupBilling billing) {
        this.target = target;
        this.billing = billing;
    }

    /**
     * Initialization constructor.
     * @param  target  GroupTarget value for target.
     */
    @JsonCreator
    protected GroupSettings(
            @JsonProperty("target") GroupTarget target) {
        this(target, null);
    }

    /**
     * Getter for Target.
     * Attributes of the target customer who will be the responsible payer of the created
     * subscription. Required.
     * @return Returns the GroupTarget
     */
    @JsonGetter("target")
    public GroupTarget getTarget() {
        return target;
    }

    /**
     * Setter for Target.
     * Attributes of the target customer who will be the responsible payer of the created
     * subscription. Required.
     * @param target Value for GroupTarget
     */
    @JsonSetter("target")
    public void setTarget(GroupTarget target) {
        this.target = target;
    }

    /**
     * Getter for Billing.
     * Optional attributes related to billing date and accrual. Note: Only applicable for new
     * subscriptions.
     * @return Returns the GroupBilling
     */
    @JsonGetter("billing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GroupBilling getBilling() {
        return billing;
    }

    /**
     * Setter for Billing.
     * Optional attributes related to billing date and accrual. Note: Only applicable for new
     * subscriptions.
     * @param billing Value for GroupBilling
     */
    @JsonSetter("billing")
    public void setBilling(GroupBilling billing) {
        this.billing = billing;
    }

    /**
     * Converts this GroupSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GroupSettings [" + "target=" + target + ", billing=" + billing + "]";
    }

    /**
     * Builds a new {@link GroupSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GroupSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(target)
                .billing(getBilling());
        return builder;
    }

    /**
     * Class to build instances of {@link GroupSettings}.
     */
    public static class Builder {
        private GroupTarget target;
        private GroupBilling billing;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  target  GroupTarget value for target.
         */
        public Builder(GroupTarget target) {
            this.target = target;
        }

        /**
         * Setter for target.
         * @param  target  GroupTarget value for target.
         * @return Builder
         */
        public Builder target(GroupTarget target) {
            this.target = target;
            return this;
        }

        /**
         * Setter for billing.
         * @param  billing  GroupBilling value for billing.
         * @return Builder
         */
        public Builder billing(GroupBilling billing) {
            this.billing = billing;
            return this;
        }

        /**
         * Builds a new {@link GroupSettings} object using the set fields.
         * @return {@link GroupSettings}
         */
        public GroupSettings build() {
            return new GroupSettings(target, billing);
        }
    }
}
