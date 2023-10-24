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
 * This is a model class for CreateReasonCode type.
 */
public class CreateReasonCode {
    private String code;
    private String description;
    private Integer position;

    /**
     * Default constructor.
     */
    public CreateReasonCode() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  position  Integer value for position.
     */
    public CreateReasonCode(
            String code,
            String description,
            Integer position) {
        this.code = code;
        this.description = description;
        this.position = position;
    }

    /**
     * Getter for Code.
     * The unique identifier for the ReasonCode
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The unique identifier for the ReasonCode
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * The friendly summary of what the code signifies
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The friendly summary of what the code signifies
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Position.
     * The order that code appears in lists
     * @return Returns the Integer
     */
    @JsonGetter("position")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * The order that code appears in lists
     * @param position Value for Integer
     */
    @JsonSetter("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Converts this CreateReasonCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateReasonCode [" + "code=" + code + ", description=" + description
                + ", position=" + position + "]";
    }

    /**
     * Builds a new {@link CreateReasonCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateReasonCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, description)
                .position(getPosition());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateReasonCode}.
     */
    public static class Builder {
        private String code;
        private String description;
        private Integer position;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  String value for code.
         * @param  description  String value for description.
         */
        public Builder(String code, String description) {
            this.code = code;
            this.description = description;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for position.
         * @param  position  Integer value for position.
         * @return Builder
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * Builds a new {@link CreateReasonCode} object using the set fields.
         * @return {@link CreateReasonCode}
         */
        public CreateReasonCode build() {
            return new CreateReasonCode(code, description, position);
        }
    }
}
