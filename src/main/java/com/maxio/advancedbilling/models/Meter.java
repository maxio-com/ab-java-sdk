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
 * This is a model class for Meter type.
 */
public class Meter
        extends BaseModel {
    private Integer id;
    private String name;
    private String handle;
    private String conversionRate;

    /**
     * Default constructor.
     */
    public Meter() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  conversionRate  String value for conversionRate.
     */
    public Meter(
            Integer id,
            String name,
            String handle,
            String conversionRate) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.conversionRate = conversionRate;
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
     * Getter for ConversionRate.
     * How many wallet units one meter unit is worth, as a decimal string. Defaults to `"1.0"`.
     * @return Returns the String
     */
    @JsonGetter("conversion_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConversionRate() {
        return conversionRate;
    }

    /**
     * Setter for ConversionRate.
     * How many wallet units one meter unit is worth, as a decimal string. Defaults to `"1.0"`.
     * @param conversionRate Value for String
     */
    @JsonSetter("conversion_rate")
    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**
     * Converts this Meter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Meter [" + "id=" + id + ", name=" + name + ", handle=" + handle
                + ", conversionRate=" + conversionRate + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Meter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Meter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .handle(getHandle())
                .conversionRate(getConversionRate());
        return builder;
    }

    /**
     * Class to build instances of {@link Meter}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String handle;
        private String conversionRate;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for conversionRate.
         * @param  conversionRate  String value for conversionRate.
         * @return Builder
         */
        public Builder conversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        /**
         * Builds a new {@link Meter} object using the set fields.
         * @return {@link Meter}
         */
        public Meter build() {
            return new Meter(id, name, handle, conversionRate);
        }
    }
}
