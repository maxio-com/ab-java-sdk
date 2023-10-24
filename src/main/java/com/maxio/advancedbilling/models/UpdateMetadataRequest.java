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
 * This is a model class for UpdateMetadataRequest type.
 */
public class UpdateMetadataRequest {
    private UpdateMetadata metadata;

    /**
     * Default constructor.
     */
    public UpdateMetadataRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  UpdateMetadata value for metadata.
     */
    public UpdateMetadataRequest(
            UpdateMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Metadata.
     * @return Returns the UpdateMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for UpdateMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(UpdateMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this UpdateMetadataRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateMetadataRequest [" + "metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link UpdateMetadataRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateMetadataRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metadata(getMetadata());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateMetadataRequest}.
     */
    public static class Builder {
        private UpdateMetadata metadata;



        /**
         * Setter for metadata.
         * @param  metadata  UpdateMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(UpdateMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link UpdateMetadataRequest} object using the set fields.
         * @return {@link UpdateMetadataRequest}
         */
        public UpdateMetadataRequest build() {
            return new UpdateMetadataRequest(metadata);
        }
    }
}
