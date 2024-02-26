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
 * This is a model class for Seller type.
 */
public class Seller {
    private String name;
    private InvoiceAddress address;
    private String phone;
    private OptionalNullable<String> logoUrl;

    /**
     * Default constructor.
     */
    public Seller() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  address  InvoiceAddress value for address.
     * @param  phone  String value for phone.
     * @param  logoUrl  String value for logoUrl.
     */
    public Seller(
            String name,
            InvoiceAddress address,
            String phone,
            String logoUrl) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.logoUrl = OptionalNullable.of(logoUrl);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  address  InvoiceAddress value for address.
     * @param  phone  String value for phone.
     * @param  logoUrl  String value for logoUrl.
     */

    protected Seller(String name, InvoiceAddress address, String phone,
            OptionalNullable<String> logoUrl) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.logoUrl = logoUrl;
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
     * Getter for Address.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for InvoiceAddress
     */
    @JsonSetter("address")
    public void setAddress(InvoiceAddress address) {
        this.address = address;
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
     * Internal Getter for LogoUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("logo_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLogoUrl() {
        return this.logoUrl;
    }

    /**
     * Getter for LogoUrl.
     * @return Returns the String
     */
    public String getLogoUrl() {
        return OptionalNullable.getFrom(logoUrl);
    }

    /**
     * Setter for LogoUrl.
     * @param logoUrl Value for String
     */
    @JsonSetter("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = OptionalNullable.of(logoUrl);
    }

    /**
     * UnSetter for LogoUrl.
     */
    public void unsetLogoUrl() {
        logoUrl = null;
    }

    /**
     * Converts this Seller into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Seller [" + "name=" + name + ", address=" + address + ", phone=" + phone
                + ", logoUrl=" + logoUrl + "]";
    }

    /**
     * Builds a new {@link Seller.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Seller.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .address(getAddress())
                .phone(getPhone());
        builder.logoUrl = internalGetLogoUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link Seller}.
     */
    public static class Builder {
        private String name;
        private InvoiceAddress address;
        private String phone;
        private OptionalNullable<String> logoUrl;



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
         * Setter for address.
         * @param  address  InvoiceAddress value for address.
         * @return Builder
         */
        public Builder address(InvoiceAddress address) {
            this.address = address;
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
         * Setter for logoUrl.
         * @param  logoUrl  String value for logoUrl.
         * @return Builder
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = OptionalNullable.of(logoUrl);
            return this;
        }

        /**
         * UnSetter for logoUrl.
         * @return Builder
         */
        public Builder unsetLogoUrl() {
            logoUrl = null;
            return this;
        }

        /**
         * Builds a new {@link Seller} object using the set fields.
         * @return {@link Seller}
         */
        public Seller build() {
            return new Seller(name, address, phone, logoUrl);
        }
    }
}
