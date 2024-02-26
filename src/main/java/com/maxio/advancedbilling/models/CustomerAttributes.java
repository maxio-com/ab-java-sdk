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
import java.util.Map;

/**
 * This is a model class for CustomerAttributes type.
 */
public class CustomerAttributes {
    private String firstName;
    private String lastName;
    private String email;
    private String ccEmails;
    private String organization;
    private String reference;
    private String address;
    private OptionalNullable<String> address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private Boolean verified;
    private Boolean taxExempt;
    private String vatNumber;
    private Map<String, String> metafields;
    private OptionalNullable<Integer> parentId;

    /**
     * Default constructor.
     */
    public CustomerAttributes() {
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
     * @param  verified  Boolean value for verified.
     * @param  taxExempt  Boolean value for taxExempt.
     * @param  vatNumber  String value for vatNumber.
     * @param  metafields  Map of String, value for metafields.
     * @param  parentId  Integer value for parentId.
     */
    public CustomerAttributes(
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
            Boolean verified,
            Boolean taxExempt,
            String vatNumber,
            Map<String, String> metafields,
            Integer parentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ccEmails = ccEmails;
        this.organization = organization;
        this.reference = reference;
        this.address = address;
        this.address2 = OptionalNullable.of(address2);
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.verified = verified;
        this.taxExempt = taxExempt;
        this.vatNumber = vatNumber;
        this.metafields = metafields;
        this.parentId = OptionalNullable.of(parentId);
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
     * @param  verified  Boolean value for verified.
     * @param  taxExempt  Boolean value for taxExempt.
     * @param  vatNumber  String value for vatNumber.
     * @param  metafields  Map of String, value for metafields.
     * @param  parentId  Integer value for parentId.
     */

    protected CustomerAttributes(String firstName, String lastName, String email, String ccEmails,
            String organization, String reference, String address,
            OptionalNullable<String> address2, String city, String state, String zip,
            String country, String phone, Boolean verified, Boolean taxExempt, String vatNumber,
            Map<String, String> metafields, OptionalNullable<Integer> parentId) {
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
        this.verified = verified;
        this.taxExempt = taxExempt;
        this.vatNumber = vatNumber;
        this.metafields = metafields;
        this.parentId = parentId;
    }

    /**
     * Getter for FirstName.
     * The first name of the customer. Required when creating a customer via attributes.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the customer. Required when creating a customer via attributes.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the customer. Required when creating a customer via attributes.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the customer. Required when creating a customer via attributes.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Email.
     * The email address of the customer. Required when creating a customer via attributes.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The email address of the customer. Required when creating a customer via attributes.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for CcEmails.
     * A list of emails that should be cc’d on all customer communications. Optional.
     * @return Returns the String
     */
    @JsonGetter("cc_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCcEmails() {
        return ccEmails;
    }

    /**
     * Setter for CcEmails.
     * A list of emails that should be cc’d on all customer communications. Optional.
     * @param ccEmails Value for String
     */
    @JsonSetter("cc_emails")
    public void setCcEmails(String ccEmails) {
        this.ccEmails = ccEmails;
    }

    /**
     * Getter for Organization.
     * The organization/company of the customer. Optional.
     * @return Returns the String
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * The organization/company of the customer. Optional.
     * @param organization Value for String
     */
    @JsonSetter("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Getter for Reference.
     * A customer “reference”, or unique identifier from your app, stored in Chargify. Can be used
     * so that you may reference your customer’s within Chargify using the same unique value you use
     * in your application. Optional.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * A customer “reference”, or unique identifier from your app, stored in Chargify. Can be used
     * so that you may reference your customer’s within Chargify using the same unique value you use
     * in your application. Optional.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for Address.
     * (Optional) The customer’s shipping street address (i.e. “123 Main St.”).
     * @return Returns the String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * (Optional) The customer’s shipping street address (i.e. “123 Main St.”).
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Internal Getter for Address2.
     * (Optional) Second line of the customer’s shipping address i.e. “Apt. 100”
     * @return Returns the Internal String
     */
    @JsonGetter("address_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddress2() {
        return this.address2;
    }

    /**
     * Getter for Address2.
     * (Optional) Second line of the customer’s shipping address i.e. “Apt. 100”
     * @return Returns the String
     */
    public String getAddress2() {
        return OptionalNullable.getFrom(address2);
    }

    /**
     * Setter for Address2.
     * (Optional) Second line of the customer’s shipping address i.e. “Apt. 100”
     * @param address2 Value for String
     */
    @JsonSetter("address_2")
    public void setAddress2(String address2) {
        this.address2 = OptionalNullable.of(address2);
    }

    /**
     * UnSetter for Address2.
     * (Optional) Second line of the customer’s shipping address i.e. “Apt. 100”
     */
    public void unsetAddress2() {
        address2 = null;
    }

    /**
     * Getter for City.
     * (Optional) The customer’s shipping address city (i.e. “Boston”).
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * (Optional) The customer’s shipping address city (i.e. “Boston”).
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for State.
     * (Optional) The customer’s shipping address state (i.e. “MA”). This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * (Optional) The customer’s shipping address state (i.e. “MA”). This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Zip.
     * (Optional) The customer’s shipping address zip code (i.e. “12345”).
     * @return Returns the String
     */
    @JsonGetter("zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZip() {
        return zip;
    }

    /**
     * Setter for Zip.
     * (Optional) The customer’s shipping address zip code (i.e. “12345”).
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Getter for Country.
     * (Optional) The customer shipping address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”).
     * @return Returns the String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * (Optional) The customer shipping address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”).
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Phone.
     * (Optional) The phone number of the customer.
     * @return Returns the String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * (Optional) The phone number of the customer.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for Verified.
     * @return Returns the Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Getter for TaxExempt.
     * (Optional) The tax_exempt status of the customer. Acceptable values are true or 1 for true
     * and false or 0 for false.
     * @return Returns the Boolean
     */
    @JsonGetter("tax_exempt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxExempt() {
        return taxExempt;
    }

    /**
     * Setter for TaxExempt.
     * (Optional) The tax_exempt status of the customer. Acceptable values are true or 1 for true
     * and false or 0 for false.
     * @param taxExempt Value for Boolean
     */
    @JsonSetter("tax_exempt")
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    /**
     * Getter for VatNumber.
     * (Optional) Supplying the VAT number allows EU customer’s to opt-out of the Value Added Tax
     * assuming the merchant address and customer billing address are not within the same EU
     * country. It’s important to omit the country code from the VAT number upon entry. Otherwise,
     * taxes will be assessed upon the purchase.
     * @return Returns the String
     */
    @JsonGetter("vat_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Setter for VatNumber.
     * (Optional) Supplying the VAT number allows EU customer’s to opt-out of the Value Added Tax
     * assuming the merchant address and customer billing address are not within the same EU
     * country. It’s important to omit the country code from the VAT number upon entry. Otherwise,
     * taxes will be assessed upon the purchase.
     * @param vatNumber Value for String
     */
    @JsonSetter("vat_number")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
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
     * Internal Getter for ParentId.
     * The parent ID in Chargify if applicable. Parent is another Customer object.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentId() {
        return this.parentId;
    }

    /**
     * Getter for ParentId.
     * The parent ID in Chargify if applicable. Parent is another Customer object.
     * @return Returns the Integer
     */
    public Integer getParentId() {
        return OptionalNullable.getFrom(parentId);
    }

    /**
     * Setter for ParentId.
     * The parent ID in Chargify if applicable. Parent is another Customer object.
     * @param parentId Value for Integer
     */
    @JsonSetter("parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = OptionalNullable.of(parentId);
    }

    /**
     * UnSetter for ParentId.
     * The parent ID in Chargify if applicable. Parent is another Customer object.
     */
    public void unsetParentId() {
        parentId = null;
    }

    /**
     * Converts this CustomerAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerAttributes [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", ccEmails=" + ccEmails + ", organization=" + organization
                + ", reference=" + reference + ", address=" + address + ", address2=" + address2
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
                + ", phone=" + phone + ", verified=" + verified + ", taxExempt=" + taxExempt
                + ", vatNumber=" + vatNumber + ", metafields=" + metafields + ", parentId="
                + parentId + "]";
    }

    /**
     * Builds a new {@link CustomerAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerAttributes.Builder} object
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
                .city(getCity())
                .state(getState())
                .zip(getZip())
                .country(getCountry())
                .phone(getPhone())
                .verified(getVerified())
                .taxExempt(getTaxExempt())
                .vatNumber(getVatNumber())
                .metafields(getMetafields());
        builder.address2 = internalGetAddress2();
        builder.parentId = internalGetParentId();
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerAttributes}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String ccEmails;
        private String organization;
        private String reference;
        private String address;
        private OptionalNullable<String> address2;
        private String city;
        private String state;
        private String zip;
        private String country;
        private String phone;
        private Boolean verified;
        private Boolean taxExempt;
        private String vatNumber;
        private Map<String, String> metafields;
        private OptionalNullable<Integer> parentId;



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
            this.address2 = OptionalNullable.of(address2);
            return this;
        }

        /**
         * UnSetter for address2.
         * @return Builder
         */
        public Builder unsetAddress2() {
            address2 = null;
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
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Setter for taxExempt.
         * @param  taxExempt  Boolean value for taxExempt.
         * @return Builder
         */
        public Builder taxExempt(Boolean taxExempt) {
            this.taxExempt = taxExempt;
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
         * Setter for metafields.
         * @param  metafields  Map of String, value for metafields.
         * @return Builder
         */
        public Builder metafields(Map<String, String> metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Setter for parentId.
         * @param  parentId  Integer value for parentId.
         * @return Builder
         */
        public Builder parentId(Integer parentId) {
            this.parentId = OptionalNullable.of(parentId);
            return this;
        }

        /**
         * UnSetter for parentId.
         * @return Builder
         */
        public Builder unsetParentId() {
            parentId = null;
            return this;
        }

        /**
         * Builds a new {@link CustomerAttributes} object using the set fields.
         * @return {@link CustomerAttributes}
         */
        public CustomerAttributes build() {
            return new CustomerAttributes(firstName, lastName, email, ccEmails, organization,
                    reference, address, address2, city, state, zip, country, phone, verified,
                    taxExempt, vatNumber, metafields, parentId);
        }
    }
}
