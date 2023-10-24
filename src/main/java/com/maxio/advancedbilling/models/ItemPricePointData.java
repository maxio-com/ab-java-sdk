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
 * This is a model class for ItemPricePointData type.
 */
public class ItemPricePointData {
    private Integer id;
    private String handle;
    private String name;

    /**
     * Default constructor.
     */
    public ItemPricePointData() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  handle  String value for handle.
     * @param  name  String value for name.
     */
    public ItemPricePointData(
            Integer id,
            String handle,
            String name) {
        this.id = id;
        this.handle = handle;
        this.name = name;
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
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
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
     * Converts this ItemPricePointData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ItemPricePointData [" + "id=" + id + ", handle=" + handle + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link ItemPricePointData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ItemPricePointData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .handle(getHandle())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link ItemPricePointData}.
     */
    public static class Builder {
        private Integer id;
        private String handle;
        private String name;



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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
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
         * Builds a new {@link ItemPricePointData} object using the set fields.
         * @return {@link ItemPricePointData}
         */
        public ItemPricePointData build() {
            return new ItemPricePointData(id, handle, name);
        }
    }
}
