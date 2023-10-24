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
 * This is a model class for SubscriptionsAddCouponJson422ErrorException type.
 */
public class SubscriptionsAddCouponJson422ErrorException extends ApiException {
    private static final long serialVersionUID = 4115475985273940640L;
    private List<String> codes;
    private List<String> subscription;
    private List<String> couponCodes;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionsAddCouponJson422ErrorException(String reason, Context context) {
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
}
