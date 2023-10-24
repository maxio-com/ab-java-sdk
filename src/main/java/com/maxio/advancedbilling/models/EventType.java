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
 * EventType to be used.
 */
public enum EventType {
    ACCOUNT_TRANSACTION_CHANGED,

    BILLING_DATE_CHANGE,

    COMPONENT_ALLOCATION_CHANGE,

    CUSTOMER_UPDATE,

    CUSTOMER_CREATE,

    DUNNING_STEP_REACHED,

    EXPIRATION_DATE_CHANGE,

    EXPIRING_CARD,

    METERED_USAGE,

    PAYMENT_SUCCESS,

    PAYMENT_SUCCESS_RECREATED,

    PAYMENT_FAILURE,

    PAYMENT_FAILURE_RECREATED,

    REFUND_FAILURE,

    REFUND_SUCCESS,

    RENEWAL_SUCCESS,

    RENEWAL_SUCCESS_RECREATED,

    RENEWAL_FAILURE,

    SIGNUP_SUCCESS,

    SIGNUP_FAILURE,

    STATEMENT_CLOSED,

    STATEMENT_SETTLED,

    SUBSCRIPTION_BANK_ACCOUNT_UPDATE,

    SUBSCRIPTION_DELETION,

    SUBSCRIPTION_PAYPAL_ACCOUNT_UPDATE,

    SUBSCRIPTION_PRODUCT_CHANGE,

    SUBSCRIPTION_STATE_CHANGE,

    TRIAL_END_NOTICE,

    UPGRADE_DOWNGRADE_SUCCESS,

    UPGRADE_DOWNGRADE_FAILURE,

    UPCOMING_RENEWAL_NOTICE,

    CUSTOM_FIELD_VALUE_CHANGE,

    SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED,

    SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED;


    private static TreeMap<String, EventType> valueMap = new TreeMap<>();
    private String value;

    static {
        ACCOUNT_TRANSACTION_CHANGED.value = "account_transaction_changed";
        BILLING_DATE_CHANGE.value = "billing_date_change";
        COMPONENT_ALLOCATION_CHANGE.value = "component_allocation_change";
        CUSTOMER_UPDATE.value = "customer_update";
        CUSTOMER_CREATE.value = "customer_create";
        DUNNING_STEP_REACHED.value = "dunning_step_reached";
        EXPIRATION_DATE_CHANGE.value = "expiration_date_change";
        EXPIRING_CARD.value = "expiring_card";
        METERED_USAGE.value = "metered_usage";
        PAYMENT_SUCCESS.value = "payment_success";
        PAYMENT_SUCCESS_RECREATED.value = "payment_success_recreated";
        PAYMENT_FAILURE.value = "payment_failure";
        PAYMENT_FAILURE_RECREATED.value = "payment_failure_recreated";
        REFUND_FAILURE.value = "refund_failure";
        REFUND_SUCCESS.value = "refund_success";
        RENEWAL_SUCCESS.value = "renewal_success";
        RENEWAL_SUCCESS_RECREATED.value = "renewal_success_recreated";
        RENEWAL_FAILURE.value = "renewal_failure";
        SIGNUP_SUCCESS.value = "signup_success";
        SIGNUP_FAILURE.value = "signup_failure";
        STATEMENT_CLOSED.value = "statement_closed";
        STATEMENT_SETTLED.value = "statement_settled";
        SUBSCRIPTION_BANK_ACCOUNT_UPDATE.value = "subscription_bank_account_update";
        SUBSCRIPTION_DELETION.value = "subscription_deletion";
        SUBSCRIPTION_PAYPAL_ACCOUNT_UPDATE.value = "subscription_paypal_account_update";
        SUBSCRIPTION_PRODUCT_CHANGE.value = "subscription_product_change";
        SUBSCRIPTION_STATE_CHANGE.value = "subscription_state_change";
        TRIAL_END_NOTICE.value = "trial_end_notice";
        UPGRADE_DOWNGRADE_SUCCESS.value = "upgrade_downgrade_success";
        UPGRADE_DOWNGRADE_FAILURE.value = "upgrade_downgrade_failure";
        UPCOMING_RENEWAL_NOTICE.value = "upcoming_renewal_notice";
        CUSTOM_FIELD_VALUE_CHANGE.value = "custom_field_value_change";
        SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED.value = "subscription_prepayment_account_balance_changed";
        SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED.value = "subscription_service_credit_account_balance_changed";

        valueMap.put("account_transaction_changed", ACCOUNT_TRANSACTION_CHANGED);
        valueMap.put("billing_date_change", BILLING_DATE_CHANGE);
        valueMap.put("component_allocation_change", COMPONENT_ALLOCATION_CHANGE);
        valueMap.put("customer_update", CUSTOMER_UPDATE);
        valueMap.put("customer_create", CUSTOMER_CREATE);
        valueMap.put("dunning_step_reached", DUNNING_STEP_REACHED);
        valueMap.put("expiration_date_change", EXPIRATION_DATE_CHANGE);
        valueMap.put("expiring_card", EXPIRING_CARD);
        valueMap.put("metered_usage", METERED_USAGE);
        valueMap.put("payment_success", PAYMENT_SUCCESS);
        valueMap.put("payment_success_recreated", PAYMENT_SUCCESS_RECREATED);
        valueMap.put("payment_failure", PAYMENT_FAILURE);
        valueMap.put("payment_failure_recreated", PAYMENT_FAILURE_RECREATED);
        valueMap.put("refund_failure", REFUND_FAILURE);
        valueMap.put("refund_success", REFUND_SUCCESS);
        valueMap.put("renewal_success", RENEWAL_SUCCESS);
        valueMap.put("renewal_success_recreated", RENEWAL_SUCCESS_RECREATED);
        valueMap.put("renewal_failure", RENEWAL_FAILURE);
        valueMap.put("signup_success", SIGNUP_SUCCESS);
        valueMap.put("signup_failure", SIGNUP_FAILURE);
        valueMap.put("statement_closed", STATEMENT_CLOSED);
        valueMap.put("statement_settled", STATEMENT_SETTLED);
        valueMap.put("subscription_bank_account_update", SUBSCRIPTION_BANK_ACCOUNT_UPDATE);
        valueMap.put("subscription_deletion", SUBSCRIPTION_DELETION);
        valueMap.put("subscription_paypal_account_update", SUBSCRIPTION_PAYPAL_ACCOUNT_UPDATE);
        valueMap.put("subscription_product_change", SUBSCRIPTION_PRODUCT_CHANGE);
        valueMap.put("subscription_state_change", SUBSCRIPTION_STATE_CHANGE);
        valueMap.put("trial_end_notice", TRIAL_END_NOTICE);
        valueMap.put("upgrade_downgrade_success", UPGRADE_DOWNGRADE_SUCCESS);
        valueMap.put("upgrade_downgrade_failure", UPGRADE_DOWNGRADE_FAILURE);
        valueMap.put("upcoming_renewal_notice", UPCOMING_RENEWAL_NOTICE);
        valueMap.put("custom_field_value_change", CUSTOM_FIELD_VALUE_CHANGE);
        valueMap.put("subscription_prepayment_account_balance_changed", SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED);
        valueMap.put("subscription_service_credit_account_balance_changed", SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventType constructFromString(String toConvert) throws IOException {
        EventType enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static EventType fromString(String toConvert) {
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
     * Convert list of EventType values to list of string values.
     * @param toConvert The list of EventType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 