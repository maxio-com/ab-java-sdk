/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for SubscriptionAddCouponErrorException type.
 */
public class SubscriptionAddCouponErrorException extends ApiException {
    private static final long serialVersionUID = -6232654840138521883L;
    private List<String> codes;
    private List<String> couponCodes;
    private List<String> subscription;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionAddCouponErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Codes.
     * @return Returns the List of String
     */
    @JsonGetter("codes")
    public List<String> getCodes() {
        return this.codes;
    }

    /**
     * Setter for Codes.
     * @param codes Value for List of String
     */
    @JsonSetter("codes")
    private void setCodes(List<String> codes) {
        this.codes = codes;
    }

    /**
     * Getter for CouponCodes.
     * @return Returns the List of String
     */
    @JsonGetter("coupon_codes")
    public List<String> getCouponCodes() {
        return this.couponCodes;
    }

    /**
     * Setter for CouponCodes.
     * @param couponCodes Value for List of String
     */
    @JsonSetter("coupon_codes")
    private void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    /**
     * Getter for Subscription.
     * @return Returns the List of String
     */
    @JsonGetter("subscription")
    public List<String> getSubscription() {
        return this.subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for List of String
     */
    @JsonSetter("subscription")
    private void setSubscription(List<String> subscription) {
        this.subscription = subscription;
    }
}
