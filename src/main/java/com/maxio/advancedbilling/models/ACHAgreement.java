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
 * This is a model class for ACHAgreement type.
 */
public class ACHAgreement {
    private String agreementTerms;
    private String authorizerFirstName;
    private String authorizerLastName;
    private String ipAddress;

    /**
     * Default constructor.
     */
    public ACHAgreement() {
    }

    /**
     * Initialization constructor.
     * @param  agreementTerms  String value for agreementTerms.
     * @param  authorizerFirstName  String value for authorizerFirstName.
     * @param  authorizerLastName  String value for authorizerLastName.
     * @param  ipAddress  String value for ipAddress.
     */
    public ACHAgreement(
            String agreementTerms,
            String authorizerFirstName,
            String authorizerLastName,
            String ipAddress) {
        this.agreementTerms = agreementTerms;
        this.authorizerFirstName = authorizerFirstName;
        this.authorizerLastName = authorizerLastName;
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for AgreementTerms.
     * (Required when providing ACH agreement params) The ACH authorization agreement terms.
     * @return Returns the String
     */
    @JsonGetter("agreement_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAgreementTerms() {
        return agreementTerms;
    }

    /**
     * Setter for AgreementTerms.
     * (Required when providing ACH agreement params) The ACH authorization agreement terms.
     * @param agreementTerms Value for String
     */
    @JsonSetter("agreement_terms")
    public void setAgreementTerms(String agreementTerms) {
        this.agreementTerms = agreementTerms;
    }

    /**
     * Getter for AuthorizerFirstName.
     * (Required when providing ACH agreement params) The first name of the person authorizing the
     * ACH agreement.
     * @return Returns the String
     */
    @JsonGetter("authorizer_first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorizerFirstName() {
        return authorizerFirstName;
    }

    /**
     * Setter for AuthorizerFirstName.
     * (Required when providing ACH agreement params) The first name of the person authorizing the
     * ACH agreement.
     * @param authorizerFirstName Value for String
     */
    @JsonSetter("authorizer_first_name")
    public void setAuthorizerFirstName(String authorizerFirstName) {
        this.authorizerFirstName = authorizerFirstName;
    }

    /**
     * Getter for AuthorizerLastName.
     * (Required when providing ACH agreement params) The last name of the person authorizing the
     * ACH agreement.
     * @return Returns the String
     */
    @JsonGetter("authorizer_last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorizerLastName() {
        return authorizerLastName;
    }

    /**
     * Setter for AuthorizerLastName.
     * (Required when providing ACH agreement params) The last name of the person authorizing the
     * ACH agreement.
     * @param authorizerLastName Value for String
     */
    @JsonSetter("authorizer_last_name")
    public void setAuthorizerLastName(String authorizerLastName) {
        this.authorizerLastName = authorizerLastName;
    }

    /**
     * Getter for IpAddress.
     * (Required when providing ACH agreement params) The IP address of the person authorizing the
     * ACH agreement.
     * @return Returns the String
     */
    @JsonGetter("ip_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * (Required when providing ACH agreement params) The IP address of the person authorizing the
     * ACH agreement.
     * @param ipAddress Value for String
     */
    @JsonSetter("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Converts this ACHAgreement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ACHAgreement [" + "agreementTerms=" + agreementTerms + ", authorizerFirstName="
                + authorizerFirstName + ", authorizerLastName=" + authorizerLastName
                + ", ipAddress=" + ipAddress + "]";
    }

    /**
     * Builds a new {@link ACHAgreement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ACHAgreement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .agreementTerms(getAgreementTerms())
                .authorizerFirstName(getAuthorizerFirstName())
                .authorizerLastName(getAuthorizerLastName())
                .ipAddress(getIpAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link ACHAgreement}.
     */
    public static class Builder {
        private String agreementTerms;
        private String authorizerFirstName;
        private String authorizerLastName;
        private String ipAddress;



        /**
         * Setter for agreementTerms.
         * @param  agreementTerms  String value for agreementTerms.
         * @return Builder
         */
        public Builder agreementTerms(String agreementTerms) {
            this.agreementTerms = agreementTerms;
            return this;
        }

        /**
         * Setter for authorizerFirstName.
         * @param  authorizerFirstName  String value for authorizerFirstName.
         * @return Builder
         */
        public Builder authorizerFirstName(String authorizerFirstName) {
            this.authorizerFirstName = authorizerFirstName;
            return this;
        }

        /**
         * Setter for authorizerLastName.
         * @param  authorizerLastName  String value for authorizerLastName.
         * @return Builder
         */
        public Builder authorizerLastName(String authorizerLastName) {
            this.authorizerLastName = authorizerLastName;
            return this;
        }

        /**
         * Setter for ipAddress.
         * @param  ipAddress  String value for ipAddress.
         * @return Builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Builds a new {@link ACHAgreement} object using the set fields.
         * @return {@link ACHAgreement}
         */
        public ACHAgreement build() {
            return new ACHAgreement(agreementTerms, authorizerFirstName, authorizerLastName,
                    ipAddress);
        }
    }
}
