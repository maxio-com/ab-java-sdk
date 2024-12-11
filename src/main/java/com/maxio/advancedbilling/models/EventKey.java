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
 * EventKey to be used.
 */
public enum EventKey {
    PAYMENT_SUCCESS,

    PAYMENT_FAILURE,

    SIGNUP_SUCCESS,

    SIGNUP_FAILURE,

    DELAYED_SIGNUP_CREATION_SUCCESS,

    DELAYED_SIGNUP_CREATION_FAILURE,

    BILLING_DATE_CHANGE,

    EXPIRATION_DATE_CHANGE,

    RENEWAL_SUCCESS,

    RENEWAL_FAILURE,

    SUBSCRIPTION_STATE_CHANGE,

    SUBSCRIPTION_PRODUCT_CHANGE,

    PENDING_CANCELLATION_CHANGE,

    EXPIRING_CARD,

    CUSTOMER_UPDATE,

    CUSTOMER_CREATE,

    CUSTOMER_DELETE,

    COMPONENT_ALLOCATION_CHANGE,

    METERED_USAGE,

    PREPAID_USAGE,

    UPGRADE_DOWNGRADE_SUCCESS,

    UPGRADE_DOWNGRADE_FAILURE,

    STATEMENT_CLOSED,

    STATEMENT_SETTLED,

    SUBSCRIPTION_CARD_UPDATE,

    SUBSCRIPTION_GROUP_CARD_UPDATE,

    SUBSCRIPTION_BANK_ACCOUNT_UPDATE,

    REFUND_SUCCESS,

    REFUND_FAILURE,

    UPCOMING_RENEWAL_NOTICE,

    TRIAL_END_NOTICE,

    DUNNING_STEP_REACHED,

    INVOICE_ISSUED,

    PREPAID_SUBSCRIPTION_BALANCE_CHANGED,

    SUBSCRIPTION_GROUP_SIGNUP_SUCCESS,

    SUBSCRIPTION_GROUP_SIGNUP_FAILURE,

    DIRECT_DEBIT_PAYMENT_PAID_OUT,

    DIRECT_DEBIT_PAYMENT_REJECTED,

    DIRECT_DEBIT_PAYMENT_PENDING,

    PENDING_PAYMENT_CREATED,

    PENDING_PAYMENT_FAILED,

    PENDING_PAYMENT_COMPLETED,

    PROFORMA_INVOICE_ISSUED,

    SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED,

    SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED,

    CUSTOM_FIELD_VALUE_CHANGE,

    ITEM_PRICE_POINT_CHANGED;


    private static TreeMap<String, EventKey> valueMap = new TreeMap<>();
    private String value;

    static {
        PAYMENT_SUCCESS.value = "payment_success";
        PAYMENT_FAILURE.value = "payment_failure";
        SIGNUP_SUCCESS.value = "signup_success";
        SIGNUP_FAILURE.value = "signup_failure";
        DELAYED_SIGNUP_CREATION_SUCCESS.value = "delayed_signup_creation_success";
        DELAYED_SIGNUP_CREATION_FAILURE.value = "delayed_signup_creation_failure";
        BILLING_DATE_CHANGE.value = "billing_date_change";
        EXPIRATION_DATE_CHANGE.value = "expiration_date_change";
        RENEWAL_SUCCESS.value = "renewal_success";
        RENEWAL_FAILURE.value = "renewal_failure";
        SUBSCRIPTION_STATE_CHANGE.value = "subscription_state_change";
        SUBSCRIPTION_PRODUCT_CHANGE.value = "subscription_product_change";
        PENDING_CANCELLATION_CHANGE.value = "pending_cancellation_change";
        EXPIRING_CARD.value = "expiring_card";
        CUSTOMER_UPDATE.value = "customer_update";
        CUSTOMER_CREATE.value = "customer_create";
        CUSTOMER_DELETE.value = "customer_delete";
        COMPONENT_ALLOCATION_CHANGE.value = "component_allocation_change";
        METERED_USAGE.value = "metered_usage";
        PREPAID_USAGE.value = "prepaid_usage";
        UPGRADE_DOWNGRADE_SUCCESS.value = "upgrade_downgrade_success";
        UPGRADE_DOWNGRADE_FAILURE.value = "upgrade_downgrade_failure";
        STATEMENT_CLOSED.value = "statement_closed";
        STATEMENT_SETTLED.value = "statement_settled";
        SUBSCRIPTION_CARD_UPDATE.value = "subscription_card_update";
        SUBSCRIPTION_GROUP_CARD_UPDATE.value = "subscription_group_card_update";
        SUBSCRIPTION_BANK_ACCOUNT_UPDATE.value = "subscription_bank_account_update";
        REFUND_SUCCESS.value = "refund_success";
        REFUND_FAILURE.value = "refund_failure";
        UPCOMING_RENEWAL_NOTICE.value = "upcoming_renewal_notice";
        TRIAL_END_NOTICE.value = "trial_end_notice";
        DUNNING_STEP_REACHED.value = "dunning_step_reached";
        INVOICE_ISSUED.value = "invoice_issued";
        PREPAID_SUBSCRIPTION_BALANCE_CHANGED.value = "prepaid_subscription_balance_changed";
        SUBSCRIPTION_GROUP_SIGNUP_SUCCESS.value = "subscription_group_signup_success";
        SUBSCRIPTION_GROUP_SIGNUP_FAILURE.value = "subscription_group_signup_failure";
        DIRECT_DEBIT_PAYMENT_PAID_OUT.value = "direct_debit_payment_paid_out";
        DIRECT_DEBIT_PAYMENT_REJECTED.value = "direct_debit_payment_rejected";
        DIRECT_DEBIT_PAYMENT_PENDING.value = "direct_debit_payment_pending";
        PENDING_PAYMENT_CREATED.value = "pending_payment_created";
        PENDING_PAYMENT_FAILED.value = "pending_payment_failed";
        PENDING_PAYMENT_COMPLETED.value = "pending_payment_completed";
        PROFORMA_INVOICE_ISSUED.value = "proforma_invoice_issued";
        SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED.value = "subscription_prepayment_account_balance_changed";
        SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED.value = "subscription_service_credit_account_balance_changed";
        CUSTOM_FIELD_VALUE_CHANGE.value = "custom_field_value_change";
        ITEM_PRICE_POINT_CHANGED.value = "item_price_point_changed";

        valueMap.put("payment_success", PAYMENT_SUCCESS);
        valueMap.put("payment_failure", PAYMENT_FAILURE);
        valueMap.put("signup_success", SIGNUP_SUCCESS);
        valueMap.put("signup_failure", SIGNUP_FAILURE);
        valueMap.put("delayed_signup_creation_success", DELAYED_SIGNUP_CREATION_SUCCESS);
        valueMap.put("delayed_signup_creation_failure", DELAYED_SIGNUP_CREATION_FAILURE);
        valueMap.put("billing_date_change", BILLING_DATE_CHANGE);
        valueMap.put("expiration_date_change", EXPIRATION_DATE_CHANGE);
        valueMap.put("renewal_success", RENEWAL_SUCCESS);
        valueMap.put("renewal_failure", RENEWAL_FAILURE);
        valueMap.put("subscription_state_change", SUBSCRIPTION_STATE_CHANGE);
        valueMap.put("subscription_product_change", SUBSCRIPTION_PRODUCT_CHANGE);
        valueMap.put("pending_cancellation_change", PENDING_CANCELLATION_CHANGE);
        valueMap.put("expiring_card", EXPIRING_CARD);
        valueMap.put("customer_update", CUSTOMER_UPDATE);
        valueMap.put("customer_create", CUSTOMER_CREATE);
        valueMap.put("customer_delete", CUSTOMER_DELETE);
        valueMap.put("component_allocation_change", COMPONENT_ALLOCATION_CHANGE);
        valueMap.put("metered_usage", METERED_USAGE);
        valueMap.put("prepaid_usage", PREPAID_USAGE);
        valueMap.put("upgrade_downgrade_success", UPGRADE_DOWNGRADE_SUCCESS);
        valueMap.put("upgrade_downgrade_failure", UPGRADE_DOWNGRADE_FAILURE);
        valueMap.put("statement_closed", STATEMENT_CLOSED);
        valueMap.put("statement_settled", STATEMENT_SETTLED);
        valueMap.put("subscription_card_update", SUBSCRIPTION_CARD_UPDATE);
        valueMap.put("subscription_group_card_update", SUBSCRIPTION_GROUP_CARD_UPDATE);
        valueMap.put("subscription_bank_account_update", SUBSCRIPTION_BANK_ACCOUNT_UPDATE);
        valueMap.put("refund_success", REFUND_SUCCESS);
        valueMap.put("refund_failure", REFUND_FAILURE);
        valueMap.put("upcoming_renewal_notice", UPCOMING_RENEWAL_NOTICE);
        valueMap.put("trial_end_notice", TRIAL_END_NOTICE);
        valueMap.put("dunning_step_reached", DUNNING_STEP_REACHED);
        valueMap.put("invoice_issued", INVOICE_ISSUED);
        valueMap.put("prepaid_subscription_balance_changed", PREPAID_SUBSCRIPTION_BALANCE_CHANGED);
        valueMap.put("subscription_group_signup_success", SUBSCRIPTION_GROUP_SIGNUP_SUCCESS);
        valueMap.put("subscription_group_signup_failure", SUBSCRIPTION_GROUP_SIGNUP_FAILURE);
        valueMap.put("direct_debit_payment_paid_out", DIRECT_DEBIT_PAYMENT_PAID_OUT);
        valueMap.put("direct_debit_payment_rejected", DIRECT_DEBIT_PAYMENT_REJECTED);
        valueMap.put("direct_debit_payment_pending", DIRECT_DEBIT_PAYMENT_PENDING);
        valueMap.put("pending_payment_created", PENDING_PAYMENT_CREATED);
        valueMap.put("pending_payment_failed", PENDING_PAYMENT_FAILED);
        valueMap.put("pending_payment_completed", PENDING_PAYMENT_COMPLETED);
        valueMap.put("proforma_invoice_issued", PROFORMA_INVOICE_ISSUED);
        valueMap.put("subscription_prepayment_account_balance_changed", SUBSCRIPTION_PREPAYMENT_ACCOUNT_BALANCE_CHANGED);
        valueMap.put("subscription_service_credit_account_balance_changed", SUBSCRIPTION_SERVICE_CREDIT_ACCOUNT_BALANCE_CHANGED);
        valueMap.put("custom_field_value_change", CUSTOM_FIELD_VALUE_CHANGE);
        valueMap.put("item_price_point_changed", ITEM_PRICE_POINT_CHANGED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventKey constructFromString(String toConvert) throws IOException {
        EventKey enumValue = fromString(toConvert);
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
    public static EventKey fromString(String toConvert) {
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
     * Convert list of EventKey values to list of string values.
     * @param toConvert The list of EventKey values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventKey> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventKey enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 