/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;

/**
 * This is a model class for CreateMetafieldsRequest type.
 */
public class CreateMetafieldsRequest {
    private CreateMetafieldsRequestMetafields metafields;

    /**
     * Default constructor.
     */
    public CreateMetafieldsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metafields  CreateMetafieldsRequestMetafields value for metafields.
     */
    public CreateMetafieldsRequest(
            CreateMetafieldsRequestMetafields metafields) {
        this.metafields = metafields;
    }

    /**
     * Getter for Metafields.
     * @return Returns the CreateMetafieldsRequestMetafields
     */
    @JsonGetter("metafields")
    public CreateMetafieldsRequestMetafields getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * @param metafields Value for CreateMetafieldsRequestMetafields
     */
    @JsonSetter("metafields")
    public void setMetafields(CreateMetafieldsRequestMetafields metafields) {
        this.metafields = metafields;
    }

    /**
     * Converts this CreateMetafieldsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMetafieldsRequest [" + "metafields=" + metafields + "]";
    }

    /**
     * Builds a new {@link CreateMetafieldsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMetafieldsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(metafields);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMetafieldsRequest}.
     */
    public static class Builder {
        private CreateMetafieldsRequestMetafields metafields;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  metafields  CreateMetafieldsRequestMetafields value for metafields.
         */
        public Builder(CreateMetafieldsRequestMetafields metafields) {
            this.metafields = metafields;
        }

        /**
         * Setter for metafields.
         * @param  metafields  CreateMetafieldsRequestMetafields value for metafields.
         * @return Builder
         */
        public Builder metafields(CreateMetafieldsRequestMetafields metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Builds a new {@link CreateMetafieldsRequest} object using the set fields.
         * @return {@link CreateMetafieldsRequest}
         */
        public CreateMetafieldsRequest build() {
            return new CreateMetafieldsRequest(metafields);
        }
    }
}
