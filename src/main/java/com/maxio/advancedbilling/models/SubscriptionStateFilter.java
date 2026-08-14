/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * SubscriptionStateFilter to be used.
 */
public enum SubscriptionStateFilter {
    ACTIVE,

    CANCELED,

    EXPIRED,

    EXPIRED_CARDS,

    ENUM_EXPIRED_CARDS_LIVE_SUBSCRIPTIONS,

    ENUM_EXPIRED_CARDS_ALL_SUBSCRIPTIONS,

    ON_HOLD,

    AWAITING_SIGNUP,

    AWAITING_SIGNUP_DATE,

    PAST_DUE,

    PENDING_CANCELLATION,

    PENDING_RENEWAL,

    PREPAID_DUNNING,

    SUSPENDED,

    TRIAL_ENDED,

    TRIALING,

    UNPAID;

    private static TreeMap<String, SubscriptionStateFilter> valueMap = new TreeMap<>();
    private String value;

    static {
        ACTIVE.value = "active";
        CANCELED.value = "canceled";
        EXPIRED.value = "expired";
        EXPIRED_CARDS.value = "expired_cards";
        ENUM_EXPIRED_CARDS_LIVE_SUBSCRIPTIONS.value = "expired_cards_(live_subscriptions)";
        ENUM_EXPIRED_CARDS_ALL_SUBSCRIPTIONS.value = "expired_cards_(all_subscriptions)";
        ON_HOLD.value = "on_hold";
        AWAITING_SIGNUP.value = "awaiting_signup";
        AWAITING_SIGNUP_DATE.value = "awaiting_signup_date";
        PAST_DUE.value = "past_due";
        PENDING_CANCELLATION.value = "pending_cancellation";
        PENDING_RENEWAL.value = "pending_renewal";
        PREPAID_DUNNING.value = "prepaid_dunning";
        SUSPENDED.value = "suspended";
        TRIAL_ENDED.value = "trial_ended";
        TRIALING.value = "trialing";
        UNPAID.value = "unpaid";

        valueMap.put("active", ACTIVE);
        valueMap.put("canceled", CANCELED);
        valueMap.put("expired", EXPIRED);
        valueMap.put("expired_cards", EXPIRED_CARDS);
        valueMap.put("expired_cards_(live_subscriptions)", ENUM_EXPIRED_CARDS_LIVE_SUBSCRIPTIONS);
        valueMap.put("expired_cards_(all_subscriptions)", ENUM_EXPIRED_CARDS_ALL_SUBSCRIPTIONS);
        valueMap.put("on_hold", ON_HOLD);
        valueMap.put("awaiting_signup", AWAITING_SIGNUP);
        valueMap.put("awaiting_signup_date", AWAITING_SIGNUP_DATE);
        valueMap.put("past_due", PAST_DUE);
        valueMap.put("pending_cancellation", PENDING_CANCELLATION);
        valueMap.put("pending_renewal", PENDING_RENEWAL);
        valueMap.put("prepaid_dunning", PREPAID_DUNNING);
        valueMap.put("suspended", SUSPENDED);
        valueMap.put("trial_ended", TRIAL_ENDED);
        valueMap.put("trialing", TRIALING);
        valueMap.put("unpaid", UNPAID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionStateFilter constructFromString(String toConvert) throws IOException {
        SubscriptionStateFilter enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static SubscriptionStateFilter fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SubscriptionStateFilter values to list of string values.
     * @param toConvert The list of SubscriptionStateFilter values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionStateFilter> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionStateFilter enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 