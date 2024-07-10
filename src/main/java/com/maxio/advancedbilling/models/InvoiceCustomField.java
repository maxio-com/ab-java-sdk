/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for InvoiceCustomField type.
 */
public class InvoiceCustomField
        extends BaseModel {
    private Integer ownerId;
    private CustomFieldOwner ownerType;
    private String name;
    private String value;
    private Integer metadatumId;

    /**
     * Default constructor.
     */
    public InvoiceCustomField() {
    }

    /**
     * Initialization constructor.
     * @param  ownerId  Integer value for ownerId.
     * @param  ownerType  CustomFieldOwner value for ownerType.
     * @param  name  String value for name.
     * @param  value  String value for value.
     * @param  metadatumId  Integer value for metadatumId.
     */
    public InvoiceCustomField(
            Integer ownerId,
            CustomFieldOwner ownerType,
            String name,
            String value,
            Integer metadatumId) {
        this.ownerId = ownerId;
        this.ownerType = ownerType;
        this.name = name;
        this.value = value;
        this.metadatumId = metadatumId;
    }

    /**
     * Getter for OwnerId.
     * @return Returns the Integer
     */
    @JsonGetter("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Setter for OwnerId.
     * @param ownerId Value for Integer
     */
    @JsonSetter("owner_id")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Getter for OwnerType.
     * @return Returns the CustomFieldOwner
     */
    @JsonGetter("owner_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomFieldOwner getOwnerType() {
        return ownerType;
    }

    /**
     * Setter for OwnerType.
     * @param ownerType Value for CustomFieldOwner
     */
    @JsonSetter("owner_type")
    public void setOwnerType(CustomFieldOwner ownerType) {
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
     * @return Returns the Integer
     */
    @JsonGetter("metadatum_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMetadatumId() {
        return metadatumId;
    }

    /**
     * Setter for MetadatumId.
     * @param metadatumId Value for Integer
     */
    @JsonSetter("metadatum_id")
    public void setMetadatumId(Integer metadatumId) {
        this.metadatumId = metadatumId;
    }

    /**
     * Converts this InvoiceCustomField into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceCustomField [" + "ownerId=" + ownerId + ", ownerType=" + ownerType
                + ", name=" + name + ", value=" + value + ", metadatumId=" + metadatumId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
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
     * Class to build instances of {@link InvoiceCustomField}.
     */
    public static class Builder {
        private Integer ownerId;
        private CustomFieldOwner ownerType;
        private String name;
        private String value;
        private Integer metadatumId;



        /**
         * Setter for ownerId.
         * @param  ownerId  Integer value for ownerId.
         * @return Builder
         */
        public Builder ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Setter for ownerType.
         * @param  ownerType  CustomFieldOwner value for ownerType.
         * @return Builder
         */
        public Builder ownerType(CustomFieldOwner ownerType) {
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
         * @param  metadatumId  Integer value for metadatumId.
         * @return Builder
         */
        public Builder metadatumId(Integer metadatumId) {
            this.metadatumId = metadatumId;
            return this;
        }

        /**
         * Builds a new {@link InvoiceCustomField} object using the set fields.
         * @return {@link InvoiceCustomField}
         */
        public InvoiceCustomField build() {
            return new InvoiceCustomField(ownerId, ownerType, name, value, metadatumId);
        }
    }
}
