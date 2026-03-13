/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalUpdateRequestRenewalConfigurationItem;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ScheduledRenewalUpdateRequest type.
 */
public class ScheduledRenewalUpdateRequest
        extends BaseModel {
    private ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem;

    /**
     * Default constructor.
     */
    public ScheduledRenewalUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  renewalConfigurationItem  ScheduledRenewalUpdateRequestRenewalConfigurationItem value
     *         for renewalConfigurationItem.
     */
    public ScheduledRenewalUpdateRequest(
            ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem) {
        this.renewalConfigurationItem = renewalConfigurationItem;
    }

    /**
     * Getter for RenewalConfigurationItem.
     * @return Returns the ScheduledRenewalUpdateRequestRenewalConfigurationItem
     */
    @JsonGetter("renewal_configuration_item")
    public ScheduledRenewalUpdateRequestRenewalConfigurationItem getRenewalConfigurationItem() {
        return renewalConfigurationItem;
    }

    /**
     * Setter for RenewalConfigurationItem.
     * @param renewalConfigurationItem Value for ScheduledRenewalUpdateRequestRenewalConfigurationItem
     */
    @JsonSetter("renewal_configuration_item")
    public void setRenewalConfigurationItem(ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem) {
        this.renewalConfigurationItem = renewalConfigurationItem;
    }

    /**
     * Converts this ScheduledRenewalUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalUpdateRequest [" + "renewalConfigurationItem="
                + renewalConfigurationItem + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(renewalConfigurationItem);
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalUpdateRequest}.
     */
    public static class Builder {
        private ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  renewalConfigurationItem  ScheduledRenewalUpdateRequestRenewalConfigurationItem
         *         value for renewalConfigurationItem.
         */
        public Builder(
                ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem) {
            this.renewalConfigurationItem = renewalConfigurationItem;
        }

        /**
         * Setter for renewalConfigurationItem.
         * @param  renewalConfigurationItem  ScheduledRenewalUpdateRequestRenewalConfigurationItem
         *         value for renewalConfigurationItem.
         * @return Builder
         */
        public Builder renewalConfigurationItem(
                ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem) {
            this.renewalConfigurationItem = renewalConfigurationItem;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalUpdateRequest} object using the set fields.
         * @return {@link ScheduledRenewalUpdateRequest}
         */
        public ScheduledRenewalUpdateRequest build() {
            return new ScheduledRenewalUpdateRequest(renewalConfigurationItem);
        }
    }
}
