/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ScheduledRenewalConfigurationItemRequest type.
 */
public class ScheduledRenewalConfigurationItemRequest
        extends BaseModel {
    private ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  renewalConfigurationItem
     *         ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem value for
     *         renewalConfigurationItem.
     */
    public ScheduledRenewalConfigurationItemRequest(
            ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem) {
        this.renewalConfigurationItem = renewalConfigurationItem;
    }

    /**
     * Getter for RenewalConfigurationItem.
     * @return Returns the ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem
     */
    @JsonGetter("renewal_configuration_item")
    public ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem getRenewalConfigurationItem() {
        return renewalConfigurationItem;
    }

    /**
     * Setter for RenewalConfigurationItem.
     * @param renewalConfigurationItem Value for ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem
     */
    @JsonSetter("renewal_configuration_item")
    public void setRenewalConfigurationItem(ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem) {
        this.renewalConfigurationItem = renewalConfigurationItem;
    }

    /**
     * Converts this ScheduledRenewalConfigurationItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationItemRequest [" + "renewalConfigurationItem="
                + renewalConfigurationItem + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(renewalConfigurationItem);
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationItemRequest}.
     */
    public static class Builder {
        private ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  renewalConfigurationItem
         *         ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem value for
         *         renewalConfigurationItem.
         */
        public Builder(
                ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem) {
            this.renewalConfigurationItem = renewalConfigurationItem;
        }

        /**
         * Setter for renewalConfigurationItem.
         * @param  renewalConfigurationItem
         *         ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem value for
         *         renewalConfigurationItem.
         * @return Builder
         */
        public Builder renewalConfigurationItem(
                ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem) {
            this.renewalConfigurationItem = renewalConfigurationItem;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationItemRequest} object using the set
         * fields.
         * @return {@link ScheduledRenewalConfigurationItemRequest}
         */
        public ScheduledRenewalConfigurationItemRequest build() {
            return new ScheduledRenewalConfigurationItemRequest(renewalConfigurationItem);
        }
    }
}
