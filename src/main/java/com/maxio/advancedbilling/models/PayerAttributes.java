/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for PayerAttributes type.
 */
public class PayerAttributes {
    private String firstName;
    private String lastName;
    private String email;
    private String ccEmails;
    private String organization;
    private String reference;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String locale;
    private String vatNumber;
    private String taxExempt;
    private String taxExemptReason;
    private Map<String, String> metafields;

    /**
     * Default constructor.
     */
    public PayerAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  email  String value for email.
     * @param  ccEmails  String value for ccEmails.
     * @param  organization  String value for organization.
     * @param  reference  String value for reference.
     * @param  address  String value for address.
     * @param  address2  String value for address2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     * @param  phone  String value for phone.
     * @param  locale  String value for locale.
     * @param  vatNumber  String value for vatNumber.
     * @param  taxExempt  String value for taxExempt.
     * @param  taxExemptReason  String value for taxExemptReason.
     * @param  metafields  Map of String, value for metafields.
     */
    public PayerAttributes(
            String firstName,
            String lastName,
            String email,
            String ccEmails,
            String organization,
            String reference,
            String address,
            String address2,
            String city,
            String state,
            String zip,
            String country,
            String phone,
            String locale,
            String vatNumber,
            String taxExempt,
            String taxExemptReason,
            Map<String, String> metafields) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ccEmails = ccEmails;
        this.organization = organization;
        this.reference = reference;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.locale = locale;
        this.vatNumber = vatNumber;
        this.taxExempt = taxExempt;
        this.taxExemptReason = taxExemptReason;
        this.metafields = metafields;
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
     * Getter for CcEmails.
     * @return Returns the String
     */
    @JsonGetter("cc_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCcEmails() {
        return ccEmails;
    }

    /**
     * Setter for CcEmails.
     * @param ccEmails Value for String
     */
    @JsonSetter("cc_emails")
    public void setCcEmails(String ccEmails) {
        this.ccEmails = ccEmails;
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
     * Getter for Address.
     * @return Returns the String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for Address2.
     * @return Returns the String
     */
    @JsonGetter("address_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter for Address2.
     * @param address2 Value for String
     */
    @JsonSetter("address_2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Zip.
     * @return Returns the String
     */
    @JsonGetter("zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZip() {
        return zip;
    }

    /**
     * Setter for Zip.
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Getter for Country.
     * @return Returns the String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Phone.
     * @return Returns the String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for Locale.
     * @return Returns the String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for VatNumber.
     * @return Returns the String
     */
    @JsonGetter("vat_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Setter for VatNumber.
     * @param vatNumber Value for String
     */
    @JsonSetter("vat_number")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * Getter for TaxExempt.
     * @return Returns the String
     */
    @JsonGetter("tax_exempt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Setter for TaxExempt.
     * @param taxExempt Value for String
     */
    @JsonSetter("tax_exempt")
    public void setTaxExempt(String taxExempt) {
        this.taxExempt = taxExempt;
    }

    /**
     * Getter for TaxExemptReason.
     * @return Returns the String
     */
    @JsonGetter("tax_exempt_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxExemptReason() {
        return taxExemptReason;
    }

    /**
     * Setter for TaxExemptReason.
     * @param taxExemptReason Value for String
     */
    @JsonSetter("tax_exempt_reason")
    public void setTaxExemptReason(String taxExemptReason) {
        this.taxExemptReason = taxExemptReason;
    }

    /**
     * Getter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metafields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @param metafields Value for Map of String, String
     */
    @JsonSetter("metafields")
    public void setMetafields(Map<String, String> metafields) {
        this.metafields = metafields;
    }

    /**
     * Converts this PayerAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerAttributes [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", ccEmails=" + ccEmails + ", organization=" + organization
                + ", reference=" + reference + ", address=" + address + ", address2=" + address2
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
                + ", phone=" + phone + ", locale=" + locale + ", vatNumber=" + vatNumber
                + ", taxExempt=" + taxExempt + ", taxExemptReason=" + taxExemptReason
                + ", metafields=" + metafields + "]";
    }

    /**
     * Builds a new {@link PayerAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .email(getEmail())
                .ccEmails(getCcEmails())
                .organization(getOrganization())
                .reference(getReference())
                .address(getAddress())
                .address2(getAddress2())
                .city(getCity())
                .state(getState())
                .zip(getZip())
                .country(getCountry())
                .phone(getPhone())
                .locale(getLocale())
                .vatNumber(getVatNumber())
                .taxExempt(getTaxExempt())
                .taxExemptReason(getTaxExemptReason())
                .metafields(getMetafields());
        return builder;
    }

    /**
     * Class to build instances of {@link PayerAttributes}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String ccEmails;
        private String organization;
        private String reference;
        private String address;
        private String address2;
        private String city;
        private String state;
        private String zip;
        private String country;
        private String phone;
        private String locale;
        private String vatNumber;
        private String taxExempt;
        private String taxExemptReason;
        private Map<String, String> metafields;



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
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for ccEmails.
         * @param  ccEmails  String value for ccEmails.
         * @return Builder
         */
        public Builder ccEmails(String ccEmails) {
            this.ccEmails = ccEmails;
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
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for address2.
         * @param  address2  String value for address2.
         * @return Builder
         */
        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for zip.
         * @param  zip  String value for zip.
         * @return Builder
         */
        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for vatNumber.
         * @param  vatNumber  String value for vatNumber.
         * @return Builder
         */
        public Builder vatNumber(String vatNumber) {
            this.vatNumber = vatNumber;
            return this;
        }

        /**
         * Setter for taxExempt.
         * @param  taxExempt  String value for taxExempt.
         * @return Builder
         */
        public Builder taxExempt(String taxExempt) {
            this.taxExempt = taxExempt;
            return this;
        }

        /**
         * Setter for taxExemptReason.
         * @param  taxExemptReason  String value for taxExemptReason.
         * @return Builder
         */
        public Builder taxExemptReason(String taxExemptReason) {
            this.taxExemptReason = taxExemptReason;
            return this;
        }

        /**
         * Setter for metafields.
         * @param  metafields  Map of String, value for metafields.
         * @return Builder
         */
        public Builder metafields(Map<String, String> metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Builds a new {@link PayerAttributes} object using the set fields.
         * @return {@link PayerAttributes}
         */
        public PayerAttributes build() {
            return new PayerAttributes(firstName, lastName, email, ccEmails, organization,
                    reference, address, address2, city, state, zip, country, phone, locale,
                    vatNumber, taxExempt, taxExemptReason, metafields);
        }
    }
}
