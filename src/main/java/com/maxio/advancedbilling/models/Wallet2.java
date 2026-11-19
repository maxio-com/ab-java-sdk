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
 * This is a model class for Wallet2 type.
 */
public class Wallet2
        extends BaseModel {
    private OptionalNullable<String> name;

    /**
     * Default constructor.
     */
    public Wallet2() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    public Wallet2(
            String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */

    protected Wallet2(OptionalNullable<String> name) {
        this.name = name;
    }

    /**
     * Internal Getter for Name.
     * A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank or `null`
     * value clears it.
     * @return Returns the Internal String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetName() {
        return this.name;
    }

    /**
     * Getter for Name.
     * A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank or `null`
     * value clears it.
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank or `null`
     * value clears it.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     * A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank or `null`
     * value clears it.
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Converts this Wallet2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Wallet2 [" + "name=" + name + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Wallet2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Wallet2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.name = internalGetName();
        return builder;
    }

    /**
     * Class to build instances of {@link Wallet2}.
     */
    public static class Builder {
        private OptionalNullable<String> name;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = OptionalNullable.of(name);
            return this;
        }

        /**
         * UnSetter for name.
         * @return Builder
         */
        public Builder unsetName() {
            name = null;
            return this;
        }

        /**
         * Builds a new {@link Wallet2} object using the set fields.
         * @return {@link Wallet2}
         */
        public Wallet2 build() {
            return new Wallet2(name);
        }
    }
}
