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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for OrganizationAddress type.
 */
public class OrganizationAddress {
    private OptionalNullable<String> street;
    private OptionalNullable<String> line2;
    private OptionalNullable<String> city;
    private OptionalNullable<String> state;
    private OptionalNullable<String> zip;
    private OptionalNullable<String> country;
    private OptionalNullable<String> name;
    private OptionalNullable<String> phone;

    /**
     * Default constructor.
     */
    public OrganizationAddress() {
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  line2  String value for line2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     * @param  name  String value for name.
     * @param  phone  String value for phone.
     */
    public OrganizationAddress(
            String street,
            String line2,
            String city,
            String state,
            String zip,
            String country,
            String name,
            String phone) {
        this.street = OptionalNullable.of(street);
        this.line2 = OptionalNullable.of(line2);
        this.city = OptionalNullable.of(city);
        this.state = OptionalNullable.of(state);
        this.zip = OptionalNullable.of(zip);
        this.country = OptionalNullable.of(country);
        this.name = OptionalNullable.of(name);
        this.phone = OptionalNullable.of(phone);
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  line2  String value for line2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     * @param  name  String value for name.
     * @param  phone  String value for phone.
     */

    protected OrganizationAddress(OptionalNullable<String> street, OptionalNullable<String> line2,
            OptionalNullable<String> city, OptionalNullable<String> state,
            OptionalNullable<String> zip, OptionalNullable<String> country,
            OptionalNullable<String> name, OptionalNullable<String> phone) {
        this.street = street;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.name = name;
        this.phone = phone;
    }

    /**
     * Internal Getter for Street.
     * @return Returns the Internal String
     */
    @JsonGetter("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStreet() {
        return this.street;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    public String getStreet() {
        return OptionalNullable.getFrom(street);
    }

    /**
     * Setter for Street.
     * @param street Value for String
     */
    @JsonSetter("street")
    public void setStreet(String street) {
        this.street = OptionalNullable.of(street);
    }

    /**
     * UnSetter for Street.
     */
    public void unsetStreet() {
        street = null;
    }

    /**
     * Internal Getter for Line2.
     * @return Returns the Internal String
     */
    @JsonGetter("line2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLine2() {
        return this.line2;
    }

    /**
     * Getter for Line2.
     * @return Returns the String
     */
    public String getLine2() {
        return OptionalNullable.getFrom(line2);
    }

    /**
     * Setter for Line2.
     * @param line2 Value for String
     */
    @JsonSetter("line2")
    public void setLine2(String line2) {
        this.line2 = OptionalNullable.of(line2);
    }

    /**
     * UnSetter for Line2.
     */
    public void unsetLine2() {
        line2 = null;
    }

    /**
     * Internal Getter for City.
     * @return Returns the Internal String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCity() {
        return this.city;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    public String getCity() {
        return OptionalNullable.getFrom(city);
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = OptionalNullable.of(city);
    }

    /**
     * UnSetter for City.
     */
    public void unsetCity() {
        city = null;
    }

    /**
     * Internal Getter for State.
     * @return Returns the Internal String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetState() {
        return this.state;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    public String getState() {
        return OptionalNullable.getFrom(state);
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = OptionalNullable.of(state);
    }

    /**
     * UnSetter for State.
     */
    public void unsetState() {
        state = null;
    }

    /**
     * Internal Getter for Zip.
     * @return Returns the Internal String
     */
    @JsonGetter("zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetZip() {
        return this.zip;
    }

    /**
     * Getter for Zip.
     * @return Returns the String
     */
    public String getZip() {
        return OptionalNullable.getFrom(zip);
    }

    /**
     * Setter for Zip.
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = OptionalNullable.of(zip);
    }

    /**
     * UnSetter for Zip.
     */
    public void unsetZip() {
        zip = null;
    }

    /**
     * Internal Getter for Country.
     * @return Returns the Internal String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountry() {
        return this.country;
    }

    /**
     * Getter for Country.
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for Name.
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
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Internal Getter for Phone.
     * @return Returns the Internal String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPhone() {
        return this.phone;
    }

    /**
     * Getter for Phone.
     * @return Returns the String
     */
    public String getPhone() {
        return OptionalNullable.getFrom(phone);
    }

    /**
     * Setter for Phone.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = OptionalNullable.of(phone);
    }

    /**
     * UnSetter for Phone.
     */
    public void unsetPhone() {
        phone = null;
    }

    /**
     * Converts this OrganizationAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrganizationAddress [" + "street=" + street + ", line2=" + line2 + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", country=" + country + ", name=" + name
                + ", phone=" + phone + "]";
    }

    /**
     * Builds a new {@link OrganizationAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrganizationAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.street = internalGetStreet();
        builder.line2 = internalGetLine2();
        builder.city = internalGetCity();
        builder.state = internalGetState();
        builder.zip = internalGetZip();
        builder.country = internalGetCountry();
        builder.name = internalGetName();
        builder.phone = internalGetPhone();
        return builder;
    }

    /**
     * Class to build instances of {@link OrganizationAddress}.
     */
    public static class Builder {
        private OptionalNullable<String> street;
        private OptionalNullable<String> line2;
        private OptionalNullable<String> city;
        private OptionalNullable<String> state;
        private OptionalNullable<String> zip;
        private OptionalNullable<String> country;
        private OptionalNullable<String> name;
        private OptionalNullable<String> phone;



        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = OptionalNullable.of(street);
            return this;
        }

        /**
         * UnSetter for street.
         * @return Builder
         */
        public Builder unsetStreet() {
            street = null;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = OptionalNullable.of(line2);
            return this;
        }

        /**
         * UnSetter for line2.
         * @return Builder
         */
        public Builder unsetLine2() {
            line2 = null;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = OptionalNullable.of(city);
            return this;
        }

        /**
         * UnSetter for city.
         * @return Builder
         */
        public Builder unsetCity() {
            city = null;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = OptionalNullable.of(state);
            return this;
        }

        /**
         * UnSetter for state.
         * @return Builder
         */
        public Builder unsetState() {
            state = null;
            return this;
        }

        /**
         * Setter for zip.
         * @param  zip  String value for zip.
         * @return Builder
         */
        public Builder zip(String zip) {
            this.zip = OptionalNullable.of(zip);
            return this;
        }

        /**
         * UnSetter for zip.
         * @return Builder
         */
        public Builder unsetZip() {
            zip = null;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = OptionalNullable.of(country);
            return this;
        }

        /**
         * UnSetter for country.
         * @return Builder
         */
        public Builder unsetCountry() {
            country = null;
            return this;
        }

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
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = OptionalNullable.of(phone);
            return this;
        }

        /**
         * UnSetter for phone.
         * @return Builder
         */
        public Builder unsetPhone() {
            phone = null;
            return this;
        }

        /**
         * Builds a new {@link OrganizationAddress} object using the set fields.
         * @return {@link OrganizationAddress}
         */
        public OrganizationAddress build() {
            return new OrganizationAddress(street, line2, city, state, zip, country, name, phone);
        }
    }
}
