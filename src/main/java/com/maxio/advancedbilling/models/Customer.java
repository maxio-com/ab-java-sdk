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
 * This is a model class for Customer type.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private OptionalNullable<String> ccEmails;
    private OptionalNullable<String> organization;
    private OptionalNullable<String> reference;
    private Integer id;
    private String createdAt;
    private String updatedAt;
    private OptionalNullable<String> address;
    private OptionalNullable<String> address2;
    private OptionalNullable<String> city;
    private OptionalNullable<String> state;
    private OptionalNullable<String> stateName;
    private OptionalNullable<String> zip;
    private OptionalNullable<String> country;
    private OptionalNullable<String> countryName;
    private OptionalNullable<String> phone;
    private OptionalNullable<Boolean> verified;
    private OptionalNullable<String> portalCustomerCreatedAt;
    private OptionalNullable<String> portalInviteLastSentAt;
    private OptionalNullable<String> portalInviteLastAcceptedAt;
    private Boolean taxExempt;
    private OptionalNullable<String> vatNumber;
    private OptionalNullable<Integer> parentId;
    private OptionalNullable<String> locale;
    private OptionalNullable<String> defaultSubscriptionGroupUid;

    /**
     * Default constructor.
     */
    public Customer() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  email  String value for email.
     * @param  ccEmails  String value for ccEmails.
     * @param  organization  String value for organization.
     * @param  reference  String value for reference.
     * @param  id  Integer value for id.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  address  String value for address.
     * @param  address2  String value for address2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  stateName  String value for stateName.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     * @param  countryName  String value for countryName.
     * @param  phone  String value for phone.
     * @param  verified  Boolean value for verified.
     * @param  portalCustomerCreatedAt  String value for portalCustomerCreatedAt.
     * @param  portalInviteLastSentAt  String value for portalInviteLastSentAt.
     * @param  portalInviteLastAcceptedAt  String value for portalInviteLastAcceptedAt.
     * @param  taxExempt  Boolean value for taxExempt.
     * @param  vatNumber  String value for vatNumber.
     * @param  parentId  Integer value for parentId.
     * @param  locale  String value for locale.
     * @param  defaultSubscriptionGroupUid  String value for defaultSubscriptionGroupUid.
     */
    public Customer(
            String firstName,
            String lastName,
            String email,
            String ccEmails,
            String organization,
            String reference,
            Integer id,
            String createdAt,
            String updatedAt,
            String address,
            String address2,
            String city,
            String state,
            String stateName,
            String zip,
            String country,
            String countryName,
            String phone,
            Boolean verified,
            String portalCustomerCreatedAt,
            String portalInviteLastSentAt,
            String portalInviteLastAcceptedAt,
            Boolean taxExempt,
            String vatNumber,
            Integer parentId,
            String locale,
            String defaultSubscriptionGroupUid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ccEmails = OptionalNullable.of(ccEmails);
        this.organization = OptionalNullable.of(organization);
        this.reference = OptionalNullable.of(reference);
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.address = OptionalNullable.of(address);
        this.address2 = OptionalNullable.of(address2);
        this.city = OptionalNullable.of(city);
        this.state = OptionalNullable.of(state);
        this.stateName = OptionalNullable.of(stateName);
        this.zip = OptionalNullable.of(zip);
        this.country = OptionalNullable.of(country);
        this.countryName = OptionalNullable.of(countryName);
        this.phone = OptionalNullable.of(phone);
        this.verified = OptionalNullable.of(verified);
        this.portalCustomerCreatedAt = OptionalNullable.of(portalCustomerCreatedAt);
        this.portalInviteLastSentAt = OptionalNullable.of(portalInviteLastSentAt);
        this.portalInviteLastAcceptedAt = OptionalNullable.of(portalInviteLastAcceptedAt);
        this.taxExempt = taxExempt;
        this.vatNumber = OptionalNullable.of(vatNumber);
        this.parentId = OptionalNullable.of(parentId);
        this.locale = OptionalNullable.of(locale);
        this.defaultSubscriptionGroupUid = OptionalNullable.of(defaultSubscriptionGroupUid);
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  email  String value for email.
     * @param  ccEmails  String value for ccEmails.
     * @param  organization  String value for organization.
     * @param  reference  String value for reference.
     * @param  id  Integer value for id.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  address  String value for address.
     * @param  address2  String value for address2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  stateName  String value for stateName.
     * @param  zip  String value for zip.
     * @param  country  String value for country.
     * @param  countryName  String value for countryName.
     * @param  phone  String value for phone.
     * @param  verified  Boolean value for verified.
     * @param  portalCustomerCreatedAt  String value for portalCustomerCreatedAt.
     * @param  portalInviteLastSentAt  String value for portalInviteLastSentAt.
     * @param  portalInviteLastAcceptedAt  String value for portalInviteLastAcceptedAt.
     * @param  taxExempt  Boolean value for taxExempt.
     * @param  vatNumber  String value for vatNumber.
     * @param  parentId  Integer value for parentId.
     * @param  locale  String value for locale.
     * @param  defaultSubscriptionGroupUid  String value for defaultSubscriptionGroupUid.
     */

    protected Customer(String firstName, String lastName, String email,
            OptionalNullable<String> ccEmails, OptionalNullable<String> organization,
            OptionalNullable<String> reference, Integer id, String createdAt, String updatedAt,
            OptionalNullable<String> address, OptionalNullable<String> address2,
            OptionalNullable<String> city, OptionalNullable<String> state,
            OptionalNullable<String> stateName, OptionalNullable<String> zip,
            OptionalNullable<String> country, OptionalNullable<String> countryName,
            OptionalNullable<String> phone, OptionalNullable<Boolean> verified,
            OptionalNullable<String> portalCustomerCreatedAt,
            OptionalNullable<String> portalInviteLastSentAt,
            OptionalNullable<String> portalInviteLastAcceptedAt, Boolean taxExempt,
            OptionalNullable<String> vatNumber, OptionalNullable<Integer> parentId,
            OptionalNullable<String> locale,
            OptionalNullable<String> defaultSubscriptionGroupUid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ccEmails = ccEmails;
        this.organization = organization;
        this.reference = reference;
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.stateName = stateName;
        this.zip = zip;
        this.country = country;
        this.countryName = countryName;
        this.phone = phone;
        this.verified = verified;
        this.portalCustomerCreatedAt = portalCustomerCreatedAt;
        this.portalInviteLastSentAt = portalInviteLastSentAt;
        this.portalInviteLastAcceptedAt = portalInviteLastAcceptedAt;
        this.taxExempt = taxExempt;
        this.vatNumber = vatNumber;
        this.parentId = parentId;
        this.locale = locale;
        this.defaultSubscriptionGroupUid = defaultSubscriptionGroupUid;
    }

    /**
     * Getter for FirstName.
     * The first name of the customer
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the customer
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the customer
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the customer
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Email.
     * The email address of the customer
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The email address of the customer
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Internal Getter for CcEmails.
     * A comma-separated list of emails that should be cc’d on all customer communications (i.e.
     * “joe{@literal @}example.com, sue{@literal @}example.com”)
     * @return Returns the Internal String
     */
    @JsonGetter("cc_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCcEmails() {
        return this.ccEmails;
    }

    /**
     * Getter for CcEmails.
     * A comma-separated list of emails that should be cc’d on all customer communications (i.e.
     * “joe{@literal @}example.com, sue{@literal @}example.com”)
     * @return Returns the String
     */
    public String getCcEmails() {
        return OptionalNullable.getFrom(ccEmails);
    }

    /**
     * Setter for CcEmails.
     * A comma-separated list of emails that should be cc’d on all customer communications (i.e.
     * “joe{@literal @}example.com, sue{@literal @}example.com”)
     * @param ccEmails Value for String
     */
    @JsonSetter("cc_emails")
    public void setCcEmails(String ccEmails) {
        this.ccEmails = OptionalNullable.of(ccEmails);
    }

    /**
     * UnSetter for CcEmails.
     * A comma-separated list of emails that should be cc’d on all customer communications (i.e.
     * “joe{@literal @}example.com, sue{@literal @}example.com”)
     */
    public void unsetCcEmails() {
        ccEmails = null;
    }

    /**
     * Internal Getter for Organization.
     * The organization of the customer
     * @return Returns the Internal String
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOrganization() {
        return this.organization;
    }

    /**
     * Getter for Organization.
     * The organization of the customer
     * @return Returns the String
     */
    public String getOrganization() {
        return OptionalNullable.getFrom(organization);
    }

    /**
     * Setter for Organization.
     * The organization of the customer
     * @param organization Value for String
     */
    @JsonSetter("organization")
    public void setOrganization(String organization) {
        this.organization = OptionalNullable.of(organization);
    }

    /**
     * UnSetter for Organization.
     * The organization of the customer
     */
    public void unsetOrganization() {
        organization = null;
    }

    /**
     * Internal Getter for Reference.
     * The unique identifier used within your own application for this customer
     * @return Returns the Internal String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReference() {
        return this.reference;
    }

    /**
     * Getter for Reference.
     * The unique identifier used within your own application for this customer
     * @return Returns the String
     */
    public String getReference() {
        return OptionalNullable.getFrom(reference);
    }

    /**
     * Setter for Reference.
     * The unique identifier used within your own application for this customer
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = OptionalNullable.of(reference);
    }

    /**
     * UnSetter for Reference.
     * The unique identifier used within your own application for this customer
     */
    public void unsetReference() {
        reference = null;
    }

    /**
     * Getter for Id.
     * The customer ID in Chargify
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The customer ID in Chargify
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for CreatedAt.
     * The timestamp in which the customer object was created in Chargify
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The timestamp in which the customer object was created in Chargify
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The timestamp in which the customer object was last edited
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * The timestamp in which the customer object was last edited
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Internal Getter for Address.
     * The customer’s shipping street address (i.e. “123 Main St.”)
     * @return Returns the Internal String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddress() {
        return this.address;
    }

    /**
     * Getter for Address.
     * The customer’s shipping street address (i.e. “123 Main St.”)
     * @return Returns the String
     */
    public String getAddress() {
        return OptionalNullable.getFrom(address);
    }

    /**
     * Setter for Address.
     * The customer’s shipping street address (i.e. “123 Main St.”)
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = OptionalNullable.of(address);
    }

    /**
     * UnSetter for Address.
     * The customer’s shipping street address (i.e. “123 Main St.”)
     */
    public void unsetAddress() {
        address = null;
    }

    /**
     * Internal Getter for Address2.
     * Second line of the customer’s shipping address i.e. “Apt. 100”
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
     * Second line of the customer’s shipping address i.e. “Apt. 100”
     * @return Returns the String
     */
    public String getAddress2() {
        return OptionalNullable.getFrom(address2);
    }

    /**
     * Setter for Address2.
     * Second line of the customer’s shipping address i.e. “Apt. 100”
     * @param address2 Value for String
     */
    @JsonSetter("address_2")
    public void setAddress2(String address2) {
        this.address2 = OptionalNullable.of(address2);
    }

    /**
     * UnSetter for Address2.
     * Second line of the customer’s shipping address i.e. “Apt. 100”
     */
    public void unsetAddress2() {
        address2 = null;
    }

    /**
     * Internal Getter for City.
     * The customer’s shipping address city (i.e. “Boston”)
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
     * The customer’s shipping address city (i.e. “Boston”)
     * @return Returns the String
     */
    public String getCity() {
        return OptionalNullable.getFrom(city);
    }

    /**
     * Setter for City.
     * The customer’s shipping address city (i.e. “Boston”)
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = OptionalNullable.of(city);
    }

    /**
     * UnSetter for City.
     * The customer’s shipping address city (i.e. “Boston”)
     */
    public void unsetCity() {
        city = null;
    }

    /**
     * Internal Getter for State.
     * The customer’s shipping address state (i.e. “MA”)
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
     * The customer’s shipping address state (i.e. “MA”)
     * @return Returns the String
     */
    public String getState() {
        return OptionalNullable.getFrom(state);
    }

    /**
     * Setter for State.
     * The customer’s shipping address state (i.e. “MA”)
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = OptionalNullable.of(state);
    }

    /**
     * UnSetter for State.
     * The customer’s shipping address state (i.e. “MA”)
     */
    public void unsetState() {
        state = null;
    }

    /**
     * Internal Getter for StateName.
     * The customer's full name of state
     * @return Returns the Internal String
     */
    @JsonGetter("state_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStateName() {
        return this.stateName;
    }

    /**
     * Getter for StateName.
     * The customer's full name of state
     * @return Returns the String
     */
    public String getStateName() {
        return OptionalNullable.getFrom(stateName);
    }

    /**
     * Setter for StateName.
     * The customer's full name of state
     * @param stateName Value for String
     */
    @JsonSetter("state_name")
    public void setStateName(String stateName) {
        this.stateName = OptionalNullable.of(stateName);
    }

    /**
     * UnSetter for StateName.
     * The customer's full name of state
     */
    public void unsetStateName() {
        stateName = null;
    }

    /**
     * Internal Getter for Zip.
     * The customer’s shipping address zip code (i.e. “12345”)
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
     * The customer’s shipping address zip code (i.e. “12345”)
     * @return Returns the String
     */
    public String getZip() {
        return OptionalNullable.getFrom(zip);
    }

    /**
     * Setter for Zip.
     * The customer’s shipping address zip code (i.e. “12345”)
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = OptionalNullable.of(zip);
    }

    /**
     * UnSetter for Zip.
     * The customer’s shipping address zip code (i.e. “12345”)
     */
    public void unsetZip() {
        zip = null;
    }

    /**
     * Internal Getter for Country.
     * The customer shipping address country
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
     * The customer shipping address country
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * The customer shipping address country
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     * The customer shipping address country
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for CountryName.
     * The customer's full name of country
     * @return Returns the Internal String
     */
    @JsonGetter("country_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountryName() {
        return this.countryName;
    }

    /**
     * Getter for CountryName.
     * The customer's full name of country
     * @return Returns the String
     */
    public String getCountryName() {
        return OptionalNullable.getFrom(countryName);
    }

    /**
     * Setter for CountryName.
     * The customer's full name of country
     * @param countryName Value for String
     */
    @JsonSetter("country_name")
    public void setCountryName(String countryName) {
        this.countryName = OptionalNullable.of(countryName);
    }

    /**
     * UnSetter for CountryName.
     * The customer's full name of country
     */
    public void unsetCountryName() {
        countryName = null;
    }

    /**
     * Internal Getter for Phone.
     * The phone number of the customer
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
     * The phone number of the customer
     * @return Returns the String
     */
    public String getPhone() {
        return OptionalNullable.getFrom(phone);
    }

    /**
     * Setter for Phone.
     * The phone number of the customer
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = OptionalNullable.of(phone);
    }

    /**
     * UnSetter for Phone.
     * The phone number of the customer
     */
    public void unsetPhone() {
        phone = null;
    }

    /**
     * Internal Getter for Verified.
     * Is the customer verified to use ACH as a payment method. Available only on Authorize.Net
     * gateway
     * @return Returns the Internal Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetVerified() {
        return this.verified;
    }

    /**
     * Getter for Verified.
     * Is the customer verified to use ACH as a payment method. Available only on Authorize.Net
     * gateway
     * @return Returns the Boolean
     */
    public Boolean getVerified() {
        return OptionalNullable.getFrom(verified);
    }

    /**
     * Setter for Verified.
     * Is the customer verified to use ACH as a payment method. Available only on Authorize.Net
     * gateway
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = OptionalNullable.of(verified);
    }

    /**
     * UnSetter for Verified.
     * Is the customer verified to use ACH as a payment method. Available only on Authorize.Net
     * gateway
     */
    public void unsetVerified() {
        verified = null;
    }

    /**
     * Internal Getter for PortalCustomerCreatedAt.
     * The timestamp of when the Billing Portal entry was created at for the customer
     * @return Returns the Internal String
     */
    @JsonGetter("portal_customer_created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPortalCustomerCreatedAt() {
        return this.portalCustomerCreatedAt;
    }

    /**
     * Getter for PortalCustomerCreatedAt.
     * The timestamp of when the Billing Portal entry was created at for the customer
     * @return Returns the String
     */
    public String getPortalCustomerCreatedAt() {
        return OptionalNullable.getFrom(portalCustomerCreatedAt);
    }

    /**
     * Setter for PortalCustomerCreatedAt.
     * The timestamp of when the Billing Portal entry was created at for the customer
     * @param portalCustomerCreatedAt Value for String
     */
    @JsonSetter("portal_customer_created_at")
    public void setPortalCustomerCreatedAt(String portalCustomerCreatedAt) {
        this.portalCustomerCreatedAt = OptionalNullable.of(portalCustomerCreatedAt);
    }

    /**
     * UnSetter for PortalCustomerCreatedAt.
     * The timestamp of when the Billing Portal entry was created at for the customer
     */
    public void unsetPortalCustomerCreatedAt() {
        portalCustomerCreatedAt = null;
    }

    /**
     * Internal Getter for PortalInviteLastSentAt.
     * The timestamp of when the Billing Portal invite was last sent at
     * @return Returns the Internal String
     */
    @JsonGetter("portal_invite_last_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPortalInviteLastSentAt() {
        return this.portalInviteLastSentAt;
    }

    /**
     * Getter for PortalInviteLastSentAt.
     * The timestamp of when the Billing Portal invite was last sent at
     * @return Returns the String
     */
    public String getPortalInviteLastSentAt() {
        return OptionalNullable.getFrom(portalInviteLastSentAt);
    }

    /**
     * Setter for PortalInviteLastSentAt.
     * The timestamp of when the Billing Portal invite was last sent at
     * @param portalInviteLastSentAt Value for String
     */
    @JsonSetter("portal_invite_last_sent_at")
    public void setPortalInviteLastSentAt(String portalInviteLastSentAt) {
        this.portalInviteLastSentAt = OptionalNullable.of(portalInviteLastSentAt);
    }

    /**
     * UnSetter for PortalInviteLastSentAt.
     * The timestamp of when the Billing Portal invite was last sent at
     */
    public void unsetPortalInviteLastSentAt() {
        portalInviteLastSentAt = null;
    }

    /**
     * Internal Getter for PortalInviteLastAcceptedAt.
     * The timestamp of when the Billing Portal invite was last accepted
     * @return Returns the Internal String
     */
    @JsonGetter("portal_invite_last_accepted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPortalInviteLastAcceptedAt() {
        return this.portalInviteLastAcceptedAt;
    }

    /**
     * Getter for PortalInviteLastAcceptedAt.
     * The timestamp of when the Billing Portal invite was last accepted
     * @return Returns the String
     */
    public String getPortalInviteLastAcceptedAt() {
        return OptionalNullable.getFrom(portalInviteLastAcceptedAt);
    }

    /**
     * Setter for PortalInviteLastAcceptedAt.
     * The timestamp of when the Billing Portal invite was last accepted
     * @param portalInviteLastAcceptedAt Value for String
     */
    @JsonSetter("portal_invite_last_accepted_at")
    public void setPortalInviteLastAcceptedAt(String portalInviteLastAcceptedAt) {
        this.portalInviteLastAcceptedAt = OptionalNullable.of(portalInviteLastAcceptedAt);
    }

    /**
     * UnSetter for PortalInviteLastAcceptedAt.
     * The timestamp of when the Billing Portal invite was last accepted
     */
    public void unsetPortalInviteLastAcceptedAt() {
        portalInviteLastAcceptedAt = null;
    }

    /**
     * Getter for TaxExempt.
     * The tax exempt status for the customer. Acceptable values are true or 1 for true and false or
     * 0 for false.
     * @return Returns the Boolean
     */
    @JsonGetter("tax_exempt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxExempt() {
        return taxExempt;
    }

    /**
     * Setter for TaxExempt.
     * The tax exempt status for the customer. Acceptable values are true or 1 for true and false or
     * 0 for false.
     * @param taxExempt Value for Boolean
     */
    @JsonSetter("tax_exempt")
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    /**
     * Internal Getter for VatNumber.
     * The VAT business identification number for the customer. This number is used to determine VAT
     * tax opt out rules. It is not validated when added or updated on a customer record. Instead,
     * it is validated via VIES before calculating taxes. Only valid business identification numbers
     * will allow for VAT opt out.
     * @return Returns the Internal String
     */
    @JsonGetter("vat_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetVatNumber() {
        return this.vatNumber;
    }

    /**
     * Getter for VatNumber.
     * The VAT business identification number for the customer. This number is used to determine VAT
     * tax opt out rules. It is not validated when added or updated on a customer record. Instead,
     * it is validated via VIES before calculating taxes. Only valid business identification numbers
     * will allow for VAT opt out.
     * @return Returns the String
     */
    public String getVatNumber() {
        return OptionalNullable.getFrom(vatNumber);
    }

    /**
     * Setter for VatNumber.
     * The VAT business identification number for the customer. This number is used to determine VAT
     * tax opt out rules. It is not validated when added or updated on a customer record. Instead,
     * it is validated via VIES before calculating taxes. Only valid business identification numbers
     * will allow for VAT opt out.
     * @param vatNumber Value for String
     */
    @JsonSetter("vat_number")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = OptionalNullable.of(vatNumber);
    }

    /**
     * UnSetter for VatNumber.
     * The VAT business identification number for the customer. This number is used to determine VAT
     * tax opt out rules. It is not validated when added or updated on a customer record. Instead,
     * it is validated via VIES before calculating taxes. Only valid business identification numbers
     * will allow for VAT opt out.
     */
    public void unsetVatNumber() {
        vatNumber = null;
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
     * Internal Getter for Locale.
     * The locale for the customer to identify language-region
     * @return Returns the Internal String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLocale() {
        return this.locale;
    }

    /**
     * Getter for Locale.
     * The locale for the customer to identify language-region
     * @return Returns the String
     */
    public String getLocale() {
        return OptionalNullable.getFrom(locale);
    }

    /**
     * Setter for Locale.
     * The locale for the customer to identify language-region
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = OptionalNullable.of(locale);
    }

    /**
     * UnSetter for Locale.
     * The locale for the customer to identify language-region
     */
    public void unsetLocale() {
        locale = null;
    }

    /**
     * Internal Getter for DefaultSubscriptionGroupUid.
     * @return Returns the Internal String
     */
    @JsonGetter("default_subscription_group_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultSubscriptionGroupUid() {
        return this.defaultSubscriptionGroupUid;
    }

    /**
     * Getter for DefaultSubscriptionGroupUid.
     * @return Returns the String
     */
    public String getDefaultSubscriptionGroupUid() {
        return OptionalNullable.getFrom(defaultSubscriptionGroupUid);
    }

    /**
     * Setter for DefaultSubscriptionGroupUid.
     * @param defaultSubscriptionGroupUid Value for String
     */
    @JsonSetter("default_subscription_group_uid")
    public void setDefaultSubscriptionGroupUid(String defaultSubscriptionGroupUid) {
        this.defaultSubscriptionGroupUid = OptionalNullable.of(defaultSubscriptionGroupUid);
    }

    /**
     * UnSetter for DefaultSubscriptionGroupUid.
     */
    public void unsetDefaultSubscriptionGroupUid() {
        defaultSubscriptionGroupUid = null;
    }

    /**
     * Converts this Customer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Customer [" + "firstName=" + firstName + ", lastName=" + lastName + ", email="
                + email + ", ccEmails=" + ccEmails + ", organization=" + organization
                + ", reference=" + reference + ", id=" + id + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", address=" + address + ", address2=" + address2
                + ", city=" + city + ", state=" + state + ", stateName=" + stateName + ", zip="
                + zip + ", country=" + country + ", countryName=" + countryName + ", phone=" + phone
                + ", verified=" + verified + ", portalCustomerCreatedAt=" + portalCustomerCreatedAt
                + ", portalInviteLastSentAt=" + portalInviteLastSentAt
                + ", portalInviteLastAcceptedAt=" + portalInviteLastAcceptedAt + ", taxExempt="
                + taxExempt + ", vatNumber=" + vatNumber + ", parentId=" + parentId + ", locale="
                + locale + ", defaultSubscriptionGroupUid=" + defaultSubscriptionGroupUid + "]";
    }

    /**
     * Builds a new {@link Customer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Customer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .email(getEmail())
                .id(getId())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .taxExempt(getTaxExempt());
        builder.ccEmails = internalGetCcEmails();
        builder.organization = internalGetOrganization();
        builder.reference = internalGetReference();
        builder.address = internalGetAddress();
        builder.address2 = internalGetAddress2();
        builder.city = internalGetCity();
        builder.state = internalGetState();
        builder.stateName = internalGetStateName();
        builder.zip = internalGetZip();
        builder.country = internalGetCountry();
        builder.countryName = internalGetCountryName();
        builder.phone = internalGetPhone();
        builder.verified = internalGetVerified();
        builder.portalCustomerCreatedAt = internalGetPortalCustomerCreatedAt();
        builder.portalInviteLastSentAt = internalGetPortalInviteLastSentAt();
        builder.portalInviteLastAcceptedAt = internalGetPortalInviteLastAcceptedAt();
        builder.vatNumber = internalGetVatNumber();
        builder.parentId = internalGetParentId();
        builder.locale = internalGetLocale();
        builder.defaultSubscriptionGroupUid = internalGetDefaultSubscriptionGroupUid();
        return builder;
    }

    /**
     * Class to build instances of {@link Customer}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private OptionalNullable<String> ccEmails;
        private OptionalNullable<String> organization;
        private OptionalNullable<String> reference;
        private Integer id;
        private String createdAt;
        private String updatedAt;
        private OptionalNullable<String> address;
        private OptionalNullable<String> address2;
        private OptionalNullable<String> city;
        private OptionalNullable<String> state;
        private OptionalNullable<String> stateName;
        private OptionalNullable<String> zip;
        private OptionalNullable<String> country;
        private OptionalNullable<String> countryName;
        private OptionalNullable<String> phone;
        private OptionalNullable<Boolean> verified;
        private OptionalNullable<String> portalCustomerCreatedAt;
        private OptionalNullable<String> portalInviteLastSentAt;
        private OptionalNullable<String> portalInviteLastAcceptedAt;
        private Boolean taxExempt;
        private OptionalNullable<String> vatNumber;
        private OptionalNullable<Integer> parentId;
        private OptionalNullable<String> locale;
        private OptionalNullable<String> defaultSubscriptionGroupUid;



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
            this.ccEmails = OptionalNullable.of(ccEmails);
            return this;
        }

        /**
         * UnSetter for ccEmails.
         * @return Builder
         */
        public Builder unsetCcEmails() {
            ccEmails = null;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  String value for organization.
         * @return Builder
         */
        public Builder organization(String organization) {
            this.organization = OptionalNullable.of(organization);
            return this;
        }

        /**
         * UnSetter for organization.
         * @return Builder
         */
        public Builder unsetOrganization() {
            organization = null;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = OptionalNullable.of(reference);
            return this;
        }

        /**
         * UnSetter for reference.
         * @return Builder
         */
        public Builder unsetReference() {
            reference = null;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = OptionalNullable.of(address);
            return this;
        }

        /**
         * UnSetter for address.
         * @return Builder
         */
        public Builder unsetAddress() {
            address = null;
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
         * Setter for stateName.
         * @param  stateName  String value for stateName.
         * @return Builder
         */
        public Builder stateName(String stateName) {
            this.stateName = OptionalNullable.of(stateName);
            return this;
        }

        /**
         * UnSetter for stateName.
         * @return Builder
         */
        public Builder unsetStateName() {
            stateName = null;
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
         * Setter for countryName.
         * @param  countryName  String value for countryName.
         * @return Builder
         */
        public Builder countryName(String countryName) {
            this.countryName = OptionalNullable.of(countryName);
            return this;
        }

        /**
         * UnSetter for countryName.
         * @return Builder
         */
        public Builder unsetCountryName() {
            countryName = null;
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
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = OptionalNullable.of(verified);
            return this;
        }

        /**
         * UnSetter for verified.
         * @return Builder
         */
        public Builder unsetVerified() {
            verified = null;
            return this;
        }

        /**
         * Setter for portalCustomerCreatedAt.
         * @param  portalCustomerCreatedAt  String value for portalCustomerCreatedAt.
         * @return Builder
         */
        public Builder portalCustomerCreatedAt(String portalCustomerCreatedAt) {
            this.portalCustomerCreatedAt = OptionalNullable.of(portalCustomerCreatedAt);
            return this;
        }

        /**
         * UnSetter for portalCustomerCreatedAt.
         * @return Builder
         */
        public Builder unsetPortalCustomerCreatedAt() {
            portalCustomerCreatedAt = null;
            return this;
        }

        /**
         * Setter for portalInviteLastSentAt.
         * @param  portalInviteLastSentAt  String value for portalInviteLastSentAt.
         * @return Builder
         */
        public Builder portalInviteLastSentAt(String portalInviteLastSentAt) {
            this.portalInviteLastSentAt = OptionalNullable.of(portalInviteLastSentAt);
            return this;
        }

        /**
         * UnSetter for portalInviteLastSentAt.
         * @return Builder
         */
        public Builder unsetPortalInviteLastSentAt() {
            portalInviteLastSentAt = null;
            return this;
        }

        /**
         * Setter for portalInviteLastAcceptedAt.
         * @param  portalInviteLastAcceptedAt  String value for portalInviteLastAcceptedAt.
         * @return Builder
         */
        public Builder portalInviteLastAcceptedAt(String portalInviteLastAcceptedAt) {
            this.portalInviteLastAcceptedAt = OptionalNullable.of(portalInviteLastAcceptedAt);
            return this;
        }

        /**
         * UnSetter for portalInviteLastAcceptedAt.
         * @return Builder
         */
        public Builder unsetPortalInviteLastAcceptedAt() {
            portalInviteLastAcceptedAt = null;
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
            this.vatNumber = OptionalNullable.of(vatNumber);
            return this;
        }

        /**
         * UnSetter for vatNumber.
         * @return Builder
         */
        public Builder unsetVatNumber() {
            vatNumber = null;
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
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = OptionalNullable.of(locale);
            return this;
        }

        /**
         * UnSetter for locale.
         * @return Builder
         */
        public Builder unsetLocale() {
            locale = null;
            return this;
        }

        /**
         * Setter for defaultSubscriptionGroupUid.
         * @param  defaultSubscriptionGroupUid  String value for defaultSubscriptionGroupUid.
         * @return Builder
         */
        public Builder defaultSubscriptionGroupUid(String defaultSubscriptionGroupUid) {
            this.defaultSubscriptionGroupUid = OptionalNullable.of(defaultSubscriptionGroupUid);
            return this;
        }

        /**
         * UnSetter for defaultSubscriptionGroupUid.
         * @return Builder
         */
        public Builder unsetDefaultSubscriptionGroupUid() {
            defaultSubscriptionGroupUid = null;
            return this;
        }

        /**
         * Builds a new {@link Customer} object using the set fields.
         * @return {@link Customer}
         */
        public Customer build() {
            return new Customer(firstName, lastName, email, ccEmails, organization, reference, id,
                    createdAt, updatedAt, address, address2, city, state, stateName, zip, country,
                    countryName, phone, verified, portalCustomerCreatedAt, portalInviteLastSentAt,
                    portalInviteLastAcceptedAt, taxExempt, vatNumber, parentId, locale,
                    defaultSubscriptionGroupUid);
        }
    }
}
