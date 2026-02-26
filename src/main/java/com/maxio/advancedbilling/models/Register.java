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
 * This is a model class for Register type.
 */
public class Register
        extends BaseModel {
    private Integer id;
    private String maxioId;
    private String name;
    private String currencyCode;

    /**
     * Default constructor.
     */
    public Register() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  maxioId  String value for maxioId.
     * @param  name  String value for name.
     * @param  currencyCode  String value for currencyCode.
     */
    public Register(
            Integer id,
            String maxioId,
            String name,
            String currencyCode) {
        this.id = id;
        this.maxioId = maxioId;
        this.name = name;
        this.currencyCode = currencyCode;
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
     * Getter for MaxioId.
     * @return Returns the String
     */
    @JsonGetter("maxio_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaxioId() {
        return maxioId;
    }

    /**
     * Setter for MaxioId.
     * @param maxioId Value for String
     */
    @JsonSetter("maxio_id")
    public void setMaxioId(String maxioId) {
        this.maxioId = maxioId;
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
     * Getter for CurrencyCode.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @return Returns the String
     */
    @JsonGetter("currency_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @param currencyCode Value for String
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Converts this Register into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Register [" + "id=" + id + ", maxioId=" + maxioId + ", name=" + name
                + ", currencyCode=" + currencyCode + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Register.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Register.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .maxioId(getMaxioId())
                .name(getName())
                .currencyCode(getCurrencyCode());
        return builder;
    }

    /**
     * Class to build instances of {@link Register}.
     */
    public static class Builder {
        private Integer id;
        private String maxioId;
        private String name;
        private String currencyCode;



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
         * Setter for maxioId.
         * @param  maxioId  String value for maxioId.
         * @return Builder
         */
        public Builder maxioId(String maxioId) {
            this.maxioId = maxioId;
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
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Builds a new {@link Register} object using the set fields.
         * @return {@link Register}
         */
        public Register build() {
            return new Register(id, maxioId, name, currencyCode);
        }
    }
}
