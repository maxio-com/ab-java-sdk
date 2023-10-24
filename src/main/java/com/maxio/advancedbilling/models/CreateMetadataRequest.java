/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreateMetadataRequest type.
 */
public class CreateMetadataRequest {
    private List<CreateMetadata> metadata;

    /**
     * Default constructor.
     */
    public CreateMetadataRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  List of CreateMetadata value for metadata.
     */
    public CreateMetadataRequest(
            List<CreateMetadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Metadata.
     * @return Returns the List of CreateMetadata
     */
    @JsonGetter("metadata")
    public List<CreateMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for List of CreateMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(List<CreateMetadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this CreateMetadataRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMetadataRequest [" + "metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link CreateMetadataRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMetadataRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(metadata);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMetadataRequest}.
     */
    public static class Builder {
        private List<CreateMetadata> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  metadata  List of CreateMetadata value for metadata.
         */
        public Builder(List<CreateMetadata> metadata) {
            this.metadata = metadata;
        }

        /**
         * Setter for metadata.
         * @param  metadata  List of CreateMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(List<CreateMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link CreateMetadataRequest} object using the set fields.
         * @return {@link CreateMetadataRequest}
         */
        public CreateMetadataRequest build() {
            return new CreateMetadataRequest(metadata);
        }
    }
}
