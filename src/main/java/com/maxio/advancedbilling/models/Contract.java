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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Contract type.
 */
public class Contract
        extends BaseModel {
    private Integer id;
    private String maxioId;
    private OptionalNullable<String> number;
    private Register register;

    /**
     * Default constructor.
     */
    public Contract() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  maxioId  String value for maxioId.
     * @param  number  String value for number.
     * @param  register  Register value for register.
     */
    public Contract(
            Integer id,
            String maxioId,
            String number,
            Register register) {
        this.id = id;
        this.maxioId = maxioId;
        this.number = OptionalNullable.of(number);
        this.register = register;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  maxioId  String value for maxioId.
     * @param  number  String value for number.
     * @param  register  Register value for register.
     */

    protected Contract(Integer id, String maxioId, OptionalNullable<String> number,
            Register register) {
        this.id = id;
        this.maxioId = maxioId;
        this.number = number;
        this.register = register;
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
     * Internal Getter for Number.
     * @return Returns the Internal String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNumber() {
        return this.number;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    public String getNumber() {
        return OptionalNullable.getFrom(number);
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = OptionalNullable.of(number);
    }

    /**
     * UnSetter for Number.
     */
    public void unsetNumber() {
        number = null;
    }

    /**
     * Getter for Register.
     * @return Returns the Register
     */
    @JsonGetter("register")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Register getRegister() {
        return register;
    }

    /**
     * Setter for Register.
     * @param register Value for Register
     */
    @JsonSetter("register")
    public void setRegister(Register register) {
        this.register = register;
    }

    /**
     * Converts this Contract into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Contract [" + "id=" + id + ", maxioId=" + maxioId + ", number=" + number
                + ", register=" + register + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Contract.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Contract.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .maxioId(getMaxioId())
                .register(getRegister());
        builder.number = internalGetNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link Contract}.
     */
    public static class Builder {
        private Integer id;
        private String maxioId;
        private OptionalNullable<String> number;
        private Register register;



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
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = OptionalNullable.of(number);
            return this;
        }

        /**
         * UnSetter for number.
         * @return Builder
         */
        public Builder unsetNumber() {
            number = null;
            return this;
        }

        /**
         * Setter for register.
         * @param  register  Register value for register.
         * @return Builder
         */
        public Builder register(Register register) {
            this.register = register;
            return this;
        }

        /**
         * Builds a new {@link Contract} object using the set fields.
         * @return {@link Contract}
         */
        public Contract build() {
            return new Contract(id, maxioId, number, register);
        }
    }
}
