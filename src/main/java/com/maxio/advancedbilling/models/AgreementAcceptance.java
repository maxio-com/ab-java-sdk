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
 * This is a model class for AgreementAcceptance type.
 */
public class AgreementAcceptance {
    private String ipAddress;
    private String termsUrl;
    private String privacyPolicyUrl;
    private String returnRefundPolicyUrl;
    private String deliveryPolicyUrl;
    private String secureCheckoutPolicyUrl;

    /**
     * Default constructor.
     */
    public AgreementAcceptance() {
    }

    /**
     * Initialization constructor.
     * @param  ipAddress  String value for ipAddress.
     * @param  termsUrl  String value for termsUrl.
     * @param  privacyPolicyUrl  String value for privacyPolicyUrl.
     * @param  returnRefundPolicyUrl  String value for returnRefundPolicyUrl.
     * @param  deliveryPolicyUrl  String value for deliveryPolicyUrl.
     * @param  secureCheckoutPolicyUrl  String value for secureCheckoutPolicyUrl.
     */
    public AgreementAcceptance(
            String ipAddress,
            String termsUrl,
            String privacyPolicyUrl,
            String returnRefundPolicyUrl,
            String deliveryPolicyUrl,
            String secureCheckoutPolicyUrl) {
        this.ipAddress = ipAddress;
        this.termsUrl = termsUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.returnRefundPolicyUrl = returnRefundPolicyUrl;
        this.deliveryPolicyUrl = deliveryPolicyUrl;
        this.secureCheckoutPolicyUrl = secureCheckoutPolicyUrl;
    }

    /**
     * Getter for IpAddress.
     * Required when providing agreement acceptance params.
     * @return Returns the String
     */
    @JsonGetter("ip_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * Required when providing agreement acceptance params.
     * @param ipAddress Value for String
     */
    @JsonSetter("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for TermsUrl.
     * Required when creating a subscription with Maxio Payments. Either terms_url or
     * provacy_policy_url required when providing agreement_acceptance params.
     * @return Returns the String
     */
    @JsonGetter("terms_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTermsUrl() {
        return termsUrl;
    }

    /**
     * Setter for TermsUrl.
     * Required when creating a subscription with Maxio Payments. Either terms_url or
     * provacy_policy_url required when providing agreement_acceptance params.
     * @param termsUrl Value for String
     */
    @JsonSetter("terms_url")
    public void setTermsUrl(String termsUrl) {
        this.termsUrl = termsUrl;
    }

    /**
     * Getter for PrivacyPolicyUrl.
     * @return Returns the String
     */
    @JsonGetter("privacy_policy_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Setter for PrivacyPolicyUrl.
     * @param privacyPolicyUrl Value for String
     */
    @JsonSetter("privacy_policy_url")
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    /**
     * Getter for ReturnRefundPolicyUrl.
     * @return Returns the String
     */
    @JsonGetter("return_refund_policy_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnRefundPolicyUrl() {
        return returnRefundPolicyUrl;
    }

    /**
     * Setter for ReturnRefundPolicyUrl.
     * @param returnRefundPolicyUrl Value for String
     */
    @JsonSetter("return_refund_policy_url")
    public void setReturnRefundPolicyUrl(String returnRefundPolicyUrl) {
        this.returnRefundPolicyUrl = returnRefundPolicyUrl;
    }

    /**
     * Getter for DeliveryPolicyUrl.
     * @return Returns the String
     */
    @JsonGetter("delivery_policy_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryPolicyUrl() {
        return deliveryPolicyUrl;
    }

    /**
     * Setter for DeliveryPolicyUrl.
     * @param deliveryPolicyUrl Value for String
     */
    @JsonSetter("delivery_policy_url")
    public void setDeliveryPolicyUrl(String deliveryPolicyUrl) {
        this.deliveryPolicyUrl = deliveryPolicyUrl;
    }

    /**
     * Getter for SecureCheckoutPolicyUrl.
     * @return Returns the String
     */
    @JsonGetter("secure_checkout_policy_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecureCheckoutPolicyUrl() {
        return secureCheckoutPolicyUrl;
    }

    /**
     * Setter for SecureCheckoutPolicyUrl.
     * @param secureCheckoutPolicyUrl Value for String
     */
    @JsonSetter("secure_checkout_policy_url")
    public void setSecureCheckoutPolicyUrl(String secureCheckoutPolicyUrl) {
        this.secureCheckoutPolicyUrl = secureCheckoutPolicyUrl;
    }

    /**
     * Converts this AgreementAcceptance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AgreementAcceptance [" + "ipAddress=" + ipAddress + ", termsUrl=" + termsUrl
                + ", privacyPolicyUrl=" + privacyPolicyUrl + ", returnRefundPolicyUrl="
                + returnRefundPolicyUrl + ", deliveryPolicyUrl=" + deliveryPolicyUrl
                + ", secureCheckoutPolicyUrl=" + secureCheckoutPolicyUrl + "]";
    }

    /**
     * Builds a new {@link AgreementAcceptance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AgreementAcceptance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ipAddress(getIpAddress())
                .termsUrl(getTermsUrl())
                .privacyPolicyUrl(getPrivacyPolicyUrl())
                .returnRefundPolicyUrl(getReturnRefundPolicyUrl())
                .deliveryPolicyUrl(getDeliveryPolicyUrl())
                .secureCheckoutPolicyUrl(getSecureCheckoutPolicyUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link AgreementAcceptance}.
     */
    public static class Builder {
        private String ipAddress;
        private String termsUrl;
        private String privacyPolicyUrl;
        private String returnRefundPolicyUrl;
        private String deliveryPolicyUrl;
        private String secureCheckoutPolicyUrl;



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
         * Setter for termsUrl.
         * @param  termsUrl  String value for termsUrl.
         * @return Builder
         */
        public Builder termsUrl(String termsUrl) {
            this.termsUrl = termsUrl;
            return this;
        }

        /**
         * Setter for privacyPolicyUrl.
         * @param  privacyPolicyUrl  String value for privacyPolicyUrl.
         * @return Builder
         */
        public Builder privacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }

        /**
         * Setter for returnRefundPolicyUrl.
         * @param  returnRefundPolicyUrl  String value for returnRefundPolicyUrl.
         * @return Builder
         */
        public Builder returnRefundPolicyUrl(String returnRefundPolicyUrl) {
            this.returnRefundPolicyUrl = returnRefundPolicyUrl;
            return this;
        }

        /**
         * Setter for deliveryPolicyUrl.
         * @param  deliveryPolicyUrl  String value for deliveryPolicyUrl.
         * @return Builder
         */
        public Builder deliveryPolicyUrl(String deliveryPolicyUrl) {
            this.deliveryPolicyUrl = deliveryPolicyUrl;
            return this;
        }

        /**
         * Setter for secureCheckoutPolicyUrl.
         * @param  secureCheckoutPolicyUrl  String value for secureCheckoutPolicyUrl.
         * @return Builder
         */
        public Builder secureCheckoutPolicyUrl(String secureCheckoutPolicyUrl) {
            this.secureCheckoutPolicyUrl = secureCheckoutPolicyUrl;
            return this;
        }

        /**
         * Builds a new {@link AgreementAcceptance} object using the set fields.
         * @return {@link AgreementAcceptance}
         */
        public AgreementAcceptance build() {
            return new AgreementAcceptance(ipAddress, termsUrl, privacyPolicyUrl,
                    returnRefundPolicyUrl, deliveryPolicyUrl, secureCheckoutPolicyUrl);
        }
    }
}
