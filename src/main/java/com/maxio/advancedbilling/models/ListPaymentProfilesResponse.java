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
 * This is a model class for ListPaymentProfilesResponse type.
 */
public class ListPaymentProfilesResponse {
    private ListPaymentProfileItem paymentProfile;

    /**
     * Default constructor.
     */
    public ListPaymentProfilesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  ListPaymentProfileItem value for paymentProfile.
     */
    public ListPaymentProfilesResponse(
            ListPaymentProfileItem paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the ListPaymentProfileItem
     */
    @JsonGetter("payment_profile")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListPaymentProfileItem getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for ListPaymentProfileItem
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(ListPaymentProfileItem paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this ListPaymentProfilesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPaymentProfilesResponse [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link ListPaymentProfilesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPaymentProfilesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paymentProfile(getPaymentProfile());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPaymentProfilesResponse}.
     */
    public static class Builder {
        private ListPaymentProfileItem paymentProfile;



        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  ListPaymentProfileItem value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(ListPaymentProfileItem paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link ListPaymentProfilesResponse} object using the set fields.
         * @return {@link ListPaymentProfilesResponse}
         */
        public ListPaymentProfilesResponse build() {
            return new ListPaymentProfilesResponse(paymentProfile);
        }
    }
}
