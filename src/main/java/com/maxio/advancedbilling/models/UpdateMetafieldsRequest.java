/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.UpdateMetafieldsRequestMetafields;

/**
 * This is a model class for UpdateMetafieldsRequest type.
 */
public class UpdateMetafieldsRequest {
    private UpdateMetafieldsRequestMetafields metafields;

    /**
     * Default constructor.
     */
    public UpdateMetafieldsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metafields  UpdateMetafieldsRequestMetafields value for metafields.
     */
    public UpdateMetafieldsRequest(
            UpdateMetafieldsRequestMetafields metafields) {
        this.metafields = metafields;
    }

    /**
     * Getter for Metafields.
     * @return Returns the UpdateMetafieldsRequestMetafields
     */
    @JsonGetter("metafields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateMetafieldsRequestMetafields getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * @param metafields Value for UpdateMetafieldsRequestMetafields
     */
    @JsonSetter("metafields")
    public void setMetafields(UpdateMetafieldsRequestMetafields metafields) {
        this.metafields = metafields;
    }

    /**
     * Converts this UpdateMetafieldsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateMetafieldsRequest [" + "metafields=" + metafields + "]";
    }

    /**
     * Builds a new {@link UpdateMetafieldsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateMetafieldsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metafields(getMetafields());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateMetafieldsRequest}.
     */
    public static class Builder {
        private UpdateMetafieldsRequestMetafields metafields;



        /**
         * Setter for metafields.
         * @param  metafields  UpdateMetafieldsRequestMetafields value for metafields.
         * @return Builder
         */
        public Builder metafields(UpdateMetafieldsRequestMetafields metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Builds a new {@link UpdateMetafieldsRequest} object using the set fields.
         * @return {@link UpdateMetafieldsRequest}
         */
        public UpdateMetafieldsRequest build() {
            return new UpdateMetafieldsRequest(metafields);
        }
    }
}
