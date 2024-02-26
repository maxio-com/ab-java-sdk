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
 * This is a model class for CreateInvoiceAddress type.
 */
public class CreateInvoiceAddress {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;

    /**
     * Default constructor.
     */
    public CreateInvoiceAddress() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  phone  String value for phone.
     * @param  address  String value for address.
     * @param  address2  String value for address2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     */
    public CreateInvoiceAddress(
            String firstName,
            String lastName,
            String phone,
            String address,
            String address2,
            String city,
            String state,
            String zip,
            String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
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
     * Converts this CreateInvoiceAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoiceAddress [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", phone=" + phone + ", address=" + address + ", address2=" + address2 + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
    }

    /**
     * Builds a new {@link CreateInvoiceAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoiceAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .phone(getPhone())
                .address(getAddress())
                .address2(getAddress2())
                .city(getCity())
                .state(getState())
                .zip(getZip())
                .country(getCountry());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoiceAddress}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String phone;
        private String address;
        private String address2;
        private String city;
        private String state;
        private String zip;
        private String country;



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
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
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
         * Builds a new {@link CreateInvoiceAddress} object using the set fields.
         * @return {@link CreateInvoiceAddress}
         */
        public CreateInvoiceAddress build() {
            return new CreateInvoiceAddress(firstName, lastName, phone, address, address2, city,
                    state, zip, country);
        }
    }
}
