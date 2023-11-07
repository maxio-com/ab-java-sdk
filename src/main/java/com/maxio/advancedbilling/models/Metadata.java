/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Metadata type.
 */
public class Metadata {
    private Integer id;
    private String value;
    private Integer resourceId;
    private String name;
    private OptionalNullable<String> deletedAt;
    private Double metafieldId;

    /**
     * Default constructor.
     */
    public Metadata() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  value  String value for value.
     * @param  resourceId  Integer value for resourceId.
     * @param  name  String value for name.
     * @param  deletedAt  String value for deletedAt.
     * @param  metafieldId  Double value for metafieldId.
     */
    public Metadata(
            Integer id,
            String value,
            Integer resourceId,
            String name,
            String deletedAt,
            Double metafieldId) {
        this.id = id;
        this.value = value;
        this.resourceId = resourceId;
        this.name = name;
        this.deletedAt = OptionalNullable.of(deletedAt);
        this.metafieldId = metafieldId;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  value  String value for value.
     * @param  resourceId  Integer value for resourceId.
     * @param  name  String value for name.
     * @param  deletedAt  String value for deletedAt.
     * @param  metafieldId  Double value for metafieldId.
     */

    protected Metadata(Integer id, String value, Integer resourceId, String name,
            OptionalNullable<String> deletedAt, Double metafieldId) {
        this.id = id;
        this.value = value;
        this.resourceId = resourceId;
        this.name = name;
        this.deletedAt = deletedAt;
        this.metafieldId = metafieldId;
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
     * Getter for ResourceId.
     * @return Returns the Integer
     */
    @JsonGetter("resource_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * Setter for ResourceId.
     * @param resourceId Value for Integer
     */
    @JsonSetter("resource_id")
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
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
     * Internal Getter for DeletedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeletedAt() {
        return this.deletedAt;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the String
     */
    public String getDeletedAt() {
        return OptionalNullable.getFrom(deletedAt);
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for String
     */
    @JsonSetter("deleted_at")
    public void setDeletedAt(String deletedAt) {
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * UnSetter for DeletedAt.
     */
    public void unsetDeletedAt() {
        deletedAt = null;
    }

    /**
     * Getter for MetafieldId.
     * @return Returns the Double
     */
    @JsonGetter("metafield_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getMetafieldId() {
        return metafieldId;
    }

    /**
     * Setter for MetafieldId.
     * @param metafieldId Value for Double
     */
    @JsonSetter("metafield_id")
    public void setMetafieldId(Double metafieldId) {
        this.metafieldId = metafieldId;
    }

    /**
     * Converts this Metadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metadata [" + "id=" + id + ", value=" + value + ", resourceId=" + resourceId
                + ", name=" + name + ", deletedAt=" + deletedAt + ", metafieldId=" + metafieldId
                + "]";
    }

    /**
     * Builds a new {@link Metadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .value(getValue())
                .resourceId(getResourceId())
                .name(getName())
                .metafieldId(getMetafieldId());
        builder.deletedAt = internalGetDeletedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Metadata}.
     */
    public static class Builder {
        private Integer id;
        private String value;
        private Integer resourceId;
        private String name;
        private OptionalNullable<String> deletedAt;
        private Double metafieldId;



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
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for resourceId.
         * @param  resourceId  Integer value for resourceId.
         * @return Builder
         */
        public Builder resourceId(Integer resourceId) {
            this.resourceId = resourceId;
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
         * Setter for deletedAt.
         * @param  deletedAt  String value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(String deletedAt) {
            this.deletedAt = OptionalNullable.of(deletedAt);
            return this;
        }

        /**
         * UnSetter for deletedAt.
         * @return Builder
         */
        public Builder unsetDeletedAt() {
            deletedAt = null;
            return this;
        }

        /**
         * Setter for metafieldId.
         * @param  metafieldId  Double value for metafieldId.
         * @return Builder
         */
        public Builder metafieldId(Double metafieldId) {
            this.metafieldId = metafieldId;
            return this;
        }

        /**
         * Builds a new {@link Metadata} object using the set fields.
         * @return {@link Metadata}
         */
        public Metadata build() {
            return new Metadata(id, value, resourceId, name, deletedAt, metafieldId);
        }
    }
}
