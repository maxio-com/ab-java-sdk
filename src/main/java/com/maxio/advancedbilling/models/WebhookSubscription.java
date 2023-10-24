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
 * WebhookSubscription to be used.
 */
public enum WebhookSubscription {
    BILLING_DATE_CHANGE,

    COMPONENT_ALLOCATION_CHANGE,

    CUSTOMER_CREATE,

    CUSTOMER_UPDATE,

    DUNNING_STEP_REACHED,

    EXPIRING_CARD,

    EXPIRATION_DATE_CHANGE,

    INVOICE_ISSUED,

    METERED_USAGE,

    PAYMENT_FAILURE,

    PAYMENT_SUCCESS,

    DIRECT_DEBIT_PAYMENT_PENDING,

    DIRECT_DEBIT_PAYMENT_PAID_OUT,

    DIRECT_DEBIT_PAYMENT_REJECTED,

    PREPAID_SUBSCRIPTION_BALANCE_CHANGED,

    PREPAID_USAGE,

    REFUND_FAILURE,

    REFUND_SUCCESS,

    RENEWAL_FAILURE,

    RENEWAL_SUCCESS,

    SIGNUP_FAILURE,

    SIGNUP_SUCCESS,

    STATEMENT_CLOSED,

    STATEMENT_SETTLED,

    SUBSCRIPTION_CARD_UPDATE,

    SUBSCRIPTION_GROUP_CARD_UPDATE,

    SUBSCRIPTION_PRODUCT_CHANGE,

    SUBSCRIPTION_STATE_CHANGE,

    TRIAL_END_NOTICE,

    UPCOMING_RENEWAL_NOTICE,

    UPGRADE_DOWNGRADE_FAILURE,

    UPGRADE_DOWNGRADE_SUCCESS,

    PENDING_CANCELLATION_CHANGE,

    SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED,

    SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED;


    private static TreeMap<String, WebhookSubscription> valueMap = new TreeMap<>();
    private String value;

    static {
        BILLING_DATE_CHANGE.value = "billing_date_change";
        COMPONENT_ALLOCATION_CHANGE.value = "component_allocation_change";
        CUSTOMER_CREATE.value = "customer_create";
        CUSTOMER_UPDATE.value = "customer_update";
        DUNNING_STEP_REACHED.value = "dunning_step_reached";
        EXPIRING_CARD.value = "expiring_card";
        EXPIRATION_DATE_CHANGE.value = "expiration_date_change";
        INVOICE_ISSUED.value = "invoice_issued";
        METERED_USAGE.value = "metered_usage";
        PAYMENT_FAILURE.value = "payment_failure";
        PAYMENT_SUCCESS.value = "payment_success";
        DIRECT_DEBIT_PAYMENT_PENDING.value = "direct_debit_payment_pending";
        DIRECT_DEBIT_PAYMENT_PAID_OUT.value = "direct_debit_payment_paid_out";
        DIRECT_DEBIT_PAYMENT_REJECTED.value = "direct_debit_payment_rejected";
        PREPAID_SUBSCRIPTION_BALANCE_CHANGED.value = "prepaid_subscription_balance_changed";
        PREPAID_USAGE.value = "prepaid_usage";
        REFUND_FAILURE.value = "refund_failure";
        REFUND_SUCCESS.value = "refund_success";
        RENEWAL_FAILURE.value = "renewal_failure";
        RENEWAL_SUCCESS.value = "renewal_success";
        SIGNUP_FAILURE.value = "signup_failure";
        SIGNUP_SUCCESS.value = "signup_success";
        STATEMENT_CLOSED.value = "statement_closed";
        STATEMENT_SETTLED.value = "statement_settled";
        SUBSCRIPTION_CARD_UPDATE.value = "subscription_card_update";
        SUBSCRIPTION_GROUP_CARD_UPDATE.value = "subscription_group_card_update";
        SUBSCRIPTION_PRODUCT_CHANGE.value = "subscription_product_change";
        SUBSCRIPTION_STATE_CHANGE.value = "subscription_state_change";
        TRIAL_END_NOTICE.value = "trial_end_notice";
        UPCOMING_RENEWAL_NOTICE.value = "upcoming_renewal_notice";
        UPGRADE_DOWNGRADE_FAILURE.value = "upgrade_downgrade_failure";
        UPGRADE_DOWNGRADE_SUCCESS.value = "upgrade_downgrade_success";
        PENDING_CANCELLATION_CHANGE.value = "pending_cancellation_change";
        SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED.value = "subscription_prepayment_account_balance_changed";
        SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED.value = "subscription_service_credit_account_balance_changed";

        valueMap.put("billing_date_change", BILLING_DATE_CHANGE);
        valueMap.put("component_allocation_change", COMPONENT_ALLOCATION_CHANGE);
        valueMap.put("customer_create", CUSTOMER_CREATE);
        valueMap.put("customer_update", CUSTOMER_UPDATE);
        valueMap.put("dunning_step_reached", DUNNING_STEP_REACHED);
        valueMap.put("expiring_card", EXPIRING_CARD);
        valueMap.put("expiration_date_change", EXPIRATION_DATE_CHANGE);
        valueMap.put("invoice_issued", INVOICE_ISSUED);
        valueMap.put("metered_usage", METERED_USAGE);
        valueMap.put("payment_failure", PAYMENT_FAILURE);
        valueMap.put("payment_success", PAYMENT_SUCCESS);
        valueMap.put("direct_debit_payment_pending", DIRECT_DEBIT_PAYMENT_PENDING);
        valueMap.put("direct_debit_payment_paid_out", DIRECT_DEBIT_PAYMENT_PAID_OUT);
        valueMap.put("direct_debit_payment_rejected", DIRECT_DEBIT_PAYMENT_REJECTED);
        valueMap.put("prepaid_subscription_balance_changed", PREPAID_SUBSCRIPTION_BALANCE_CHANGED);
        valueMap.put("prepaid_usage", PREPAID_USAGE);
        valueMap.put("refund_failure", REFUND_FAILURE);
        valueMap.put("refund_success", REFUND_SUCCESS);
        valueMap.put("renewal_failure", RENEWAL_FAILURE);
        valueMap.put("renewal_success", RENEWAL_SUCCESS);
        valueMap.put("signup_failure", SIGNUP_FAILURE);
        valueMap.put("signup_success", SIGNUP_SUCCESS);
        valueMap.put("statement_closed", STATEMENT_CLOSED);
        valueMap.put("statement_settled", STATEMENT_SETTLED);
        valueMap.put("subscription_card_update", SUBSCRIPTION_CARD_UPDATE);
        valueMap.put("subscription_group_card_update", SUBSCRIPTION_GROUP_CARD_UPDATE);
        valueMap.put("subscription_product_change", SUBSCRIPTION_PRODUCT_CHANGE);
        valueMap.put("subscription_state_change", SUBSCRIPTION_STATE_CHANGE);
        valueMap.put("trial_end_notice", TRIAL_END_NOTICE);
        valueMap.put("upcoming_renewal_notice", UPCOMING_RENEWAL_NOTICE);
        valueMap.put("upgrade_downgrade_failure", UPGRADE_DOWNGRADE_FAILURE);
        valueMap.put("upgrade_downgrade_success", UPGRADE_DOWNGRADE_SUCCESS);
        valueMap.put("pending_cancellation_change", PENDING_CANCELLATION_CHANGE);
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
    public static WebhookSubscription constructFromString(String toConvert) throws IOException {
        WebhookSubscription enumValue = fromString(toConvert);
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
    public static WebhookSubscription fromString(String toConvert) {
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
     * Convert list of WebhookSubscription values to list of string values.
     * @param toConvert The list of WebhookSubscription values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<WebhookSubscription> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (WebhookSubscription enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 