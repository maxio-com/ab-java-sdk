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
 * This is a model class for SubscriptionGroupCustomer type.
 */
public class SubscriptionGroupCustomer {
    private String firstName;
    private String lastName;
    private String organization;
    private String email;
    private String reference;

    /**
     * Default constructor.
     */
    public SubscriptionGroupCustomer() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  organization  String value for organization.
     * @param  email  String value for email.
     * @param  reference  String value for reference.
     */
    public SubscriptionGroupCustomer(
            String firstName,
            String lastName,
            String organization,
            String email,
            String reference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.email = email;
        this.reference = reference;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Organization.
     * @return Returns the String
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for String
     */
    @JsonSetter("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Reference.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Converts this SubscriptionGroupCustomer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupCustomer [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", organization=" + organization + ", email=" + email + ", reference=" + reference
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupCustomer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupCustomer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .organization(getOrganization())
                .email(getEmail())
                .reference(getReference());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupCustomer}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String organization;
        private String email;
        private String reference;



        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  String value for organization.
         * @return Builder
         */
        public Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupCustomer} object using the set fields.
         * @return {@link SubscriptionGroupCustomer}
         */
        public SubscriptionGroupCustomer build() {
            return new SubscriptionGroupCustomer(firstName, lastName, organization, email,
                    reference);
        }
    }
}
