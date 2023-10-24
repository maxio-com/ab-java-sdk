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
 * This is a model class for ProformaCustomField type.
 */
public class ProformaCustomField {
    private Double ownerId;
    private String ownerType;
    private String name;
    private String value;
    private Double metadatumId;

    /**
     * Default constructor.
     */
    public ProformaCustomField() {
    }

    /**
     * Initialization constructor.
     * @param  ownerId  Double value for ownerId.
     * @param  ownerType  String value for ownerType.
     * @param  name  String value for name.
     * @param  value  String value for value.
     * @param  metadatumId  Double value for metadatumId.
     */
    public ProformaCustomField(
            Double ownerId,
            String ownerType,
            String name,
            String value,
            Double metadatumId) {
        this.ownerId = ownerId;
        this.ownerType = ownerType;
        this.name = name;
        this.value = value;
        this.metadatumId = metadatumId;
    }

    /**
     * Getter for OwnerId.
     * @return Returns the Double
     */
    @JsonGetter("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOwnerId() {
        return ownerId;
    }

    /**
     * Setter for OwnerId.
     * @param ownerId Value for Double
     */
    @JsonSetter("owner_id")
    public void setOwnerId(Double ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Getter for OwnerType.
     * @return Returns the String
     */
    @JsonGetter("owner_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Setter for OwnerType.
     * @param ownerType Value for String
     */
    @JsonSetter("owner_type")
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for MetadatumId.
     * @return Returns the Double
     */
    @JsonGetter("metadatum_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getMetadatumId() {
        return metadatumId;
    }

    /**
     * Setter for MetadatumId.
     * @param metadatumId Value for Double
     */
    @JsonSetter("metadatum_id")
    public void setMetadatumId(Double metadatumId) {
        this.metadatumId = metadatumId;
    }

    /**
     * Converts this ProformaCustomField into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaCustomField [" + "ownerId=" + ownerId + ", ownerType=" + ownerType
                + ", name=" + name + ", value=" + value + ", metadatumId=" + metadatumId + "]";
    }

    /**
     * Builds a new {@link ProformaCustomField.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaCustomField.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ownerId(getOwnerId())
                .ownerType(getOwnerType())
                .name(getName())
                .value(getValue())
                .metadatumId(getMetadatumId());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaCustomField}.
     */
    public static class Builder {
        private Double ownerId;
        private String ownerType;
        private String name;
        private String value;
        private Double metadatumId;



        /**
         * Setter for ownerId.
         * @param  ownerId  Double value for ownerId.
         * @return Builder
         */
        public Builder ownerId(Double ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Setter for ownerType.
         * @param  ownerType  String value for ownerType.
         * @return Builder
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for metadatumId.
         * @param  metadatumId  Double value for metadatumId.
         * @return Builder
         */
        public Builder metadatumId(Double metadatumId) {
            this.metadatumId = metadatumId;
            return this;
        }

        /**
         * Builds a new {@link ProformaCustomField} object using the set fields.
         * @return {@link ProformaCustomField}
         */
        public ProformaCustomField build() {
            return new ProformaCustomField(ownerId, ownerType, name, value, metadatumId);
        }
    }
}
