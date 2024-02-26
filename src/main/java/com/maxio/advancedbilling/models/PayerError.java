/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PayerError type.
 */
public class PayerError {
    private List<String> lastName;
    private List<String> firstName;
    private List<String> email;

    /**
     * Default constructor.
     */
    public PayerError() {
    }

    /**
     * Initialization constructor.
     * @param  lastName  List of String value for lastName.
     * @param  firstName  List of String value for firstName.
     * @param  email  List of String value for email.
     */
    public PayerError(
            List<String> lastName,
            List<String> firstName,
            List<String> email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    /**
     * Getter for LastName.
     * @return Returns the List of String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for List of String
     */
    @JsonSetter("last_name")
    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for FirstName.
     * @return Returns the List of String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for List of String
     */
    @JsonSetter("first_name")
    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for Email.
     * @return Returns the List of String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for List of String
     */
    @JsonSetter("email")
    public void setEmail(List<String> email) {
        this.email = email;
    }

    /**
     * Converts this PayerError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerError [" + "lastName=" + lastName + ", firstName=" + firstName + ", email="
                + email + "]";
    }

    /**
     * Builds a new {@link PayerError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lastName(getLastName())
                .firstName(getFirstName())
                .email(getEmail());
        return builder;
    }

    /**
     * Class to build instances of {@link PayerError}.
     */
    public static class Builder {
        private List<String> lastName;
        private List<String> firstName;
        private List<String> email;



        /**
         * Setter for lastName.
         * @param  lastName  List of String value for lastName.
         * @return Builder
         */
        public Builder lastName(List<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  List of String value for firstName.
         * @return Builder
         */
        public Builder firstName(List<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  List of String value for email.
         * @return Builder
         */
        public Builder email(List<String> email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link PayerError} object using the set fields.
         * @return {@link PayerError}
         */
        public PayerError build() {
            return new PayerError(lastName, firstName, email);
        }
    }
}
