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
 * This is a model class for Seller type.
 */
public class Seller {
    private String name;
    private InvoiceAddress address;
    private String phone;

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
     */
    public Seller(
            String name,
            InvoiceAddress address,
            String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
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
     * Converts this Seller into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Seller [" + "name=" + name + ", address=" + address + ", phone=" + phone + "]";
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
        return builder;
    }

    /**
     * Class to build instances of {@link Seller}.
     */
    public static class Builder {
        private String name;
        private InvoiceAddress address;
        private String phone;



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
         * Builds a new {@link Seller} object using the set fields.
         * @return {@link Seller}
         */
        public Seller build() {
            return new Seller(name, address, phone);
        }
    }
}
