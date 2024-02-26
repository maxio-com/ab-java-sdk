/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SubscriptionGroupSignupFailureData type.
 */
public class SubscriptionGroupSignupFailureData {
    private Integer payerId;
    private String payerReference;
    private Integer paymentProfileId;
    private String paymentCollectionMethod;
    private PayerAttributes payerAttributes;
    private SubscriptionGroupCreditCard creditCardAttributes;
    private SubscriptionGroupBankAccount bankAccountAttributes;
    private List<SubscriptionGroupSignupItem> subscriptions;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupFailureData() {
    }

    /**
     * Initialization constructor.
     * @param  payerId  Integer value for payerId.
     * @param  payerReference  String value for payerReference.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
     * @param  payerAttributes  PayerAttributes value for payerAttributes.
     * @param  creditCardAttributes  SubscriptionGroupCreditCard value for creditCardAttributes.
     * @param  bankAccountAttributes  SubscriptionGroupBankAccount value for bankAccountAttributes.
     * @param  subscriptions  List of SubscriptionGroupSignupItem value for subscriptions.
     */
    public SubscriptionGroupSignupFailureData(
            Integer payerId,
            String payerReference,
            Integer paymentProfileId,
            String paymentCollectionMethod,
            PayerAttributes payerAttributes,
            SubscriptionGroupCreditCard creditCardAttributes,
            SubscriptionGroupBankAccount bankAccountAttributes,
            List<SubscriptionGroupSignupItem> subscriptions) {
        this.payerId = payerId;
        this.payerReference = payerReference;
        this.paymentProfileId = paymentProfileId;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.payerAttributes = payerAttributes;
        this.creditCardAttributes = creditCardAttributes;
        this.bankAccountAttributes = bankAccountAttributes;
        this.subscriptions = subscriptions;
    }

    /**
     * Getter for PayerId.
     * @return Returns the Integer
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * @param payerId Value for Integer
     */
    @JsonSetter("payer_id")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for PayerReference.
     * @return Returns the String
     */
    @JsonGetter("payer_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerReference() {
        return payerReference;
    }

    /**
     * Setter for PayerReference.
     * @param payerReference Value for String
     */
    @JsonSetter("payer_reference")
    public void setPayerReference(String payerReference) {
        this.payerReference = payerReference;
    }

    /**
     * Getter for PaymentProfileId.
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * @return Returns the String
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * @param paymentCollectionMethod Value for String
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(String paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for PayerAttributes.
     * @return Returns the PayerAttributes
     */
    @JsonGetter("payer_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerAttributes getPayerAttributes() {
        return payerAttributes;
    }

    /**
     * Setter for PayerAttributes.
     * @param payerAttributes Value for PayerAttributes
     */
    @JsonSetter("payer_attributes")
    public void setPayerAttributes(PayerAttributes payerAttributes) {
        this.payerAttributes = payerAttributes;
    }

    /**
     * Getter for CreditCardAttributes.
     * @return Returns the SubscriptionGroupCreditCard
     */
    @JsonGetter("credit_card_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupCreditCard getCreditCardAttributes() {
        return creditCardAttributes;
    }

    /**
     * Setter for CreditCardAttributes.
     * @param creditCardAttributes Value for SubscriptionGroupCreditCard
     */
    @JsonSetter("credit_card_attributes")
    public void setCreditCardAttributes(SubscriptionGroupCreditCard creditCardAttributes) {
        this.creditCardAttributes = creditCardAttributes;
    }

    /**
     * Getter for BankAccountAttributes.
     * @return Returns the SubscriptionGroupBankAccount
     */
    @JsonGetter("bank_account_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupBankAccount getBankAccountAttributes() {
        return bankAccountAttributes;
    }

    /**
     * Setter for BankAccountAttributes.
     * @param bankAccountAttributes Value for SubscriptionGroupBankAccount
     */
    @JsonSetter("bank_account_attributes")
    public void setBankAccountAttributes(SubscriptionGroupBankAccount bankAccountAttributes) {
        this.bankAccountAttributes = bankAccountAttributes;
    }

    /**
     * Getter for Subscriptions.
     * @return Returns the List of SubscriptionGroupSignupItem
     */
    @JsonGetter("subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionGroupSignupItem> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Setter for Subscriptions.
     * @param subscriptions Value for List of SubscriptionGroupSignupItem
     */
    @JsonSetter("subscriptions")
    public void setSubscriptions(List<SubscriptionGroupSignupItem> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * Converts this SubscriptionGroupSignupFailureData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupFailureData [" + "payerId=" + payerId + ", payerReference="
                + payerReference + ", paymentProfileId=" + paymentProfileId
                + ", paymentCollectionMethod=" + paymentCollectionMethod + ", payerAttributes="
                + payerAttributes + ", creditCardAttributes=" + creditCardAttributes
                + ", bankAccountAttributes=" + bankAccountAttributes + ", subscriptions="
                + subscriptions + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupFailureData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupFailureData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payerId(getPayerId())
                .payerReference(getPayerReference())
                .paymentProfileId(getPaymentProfileId())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .payerAttributes(getPayerAttributes())
                .creditCardAttributes(getCreditCardAttributes())
                .bankAccountAttributes(getBankAccountAttributes())
                .subscriptions(getSubscriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupFailureData}.
     */
    public static class Builder {
        private Integer payerId;
        private String payerReference;
        private Integer paymentProfileId;
        private String paymentCollectionMethod;
        private PayerAttributes payerAttributes;
        private SubscriptionGroupCreditCard creditCardAttributes;
        private SubscriptionGroupBankAccount bankAccountAttributes;
        private List<SubscriptionGroupSignupItem> subscriptions;



        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for payerReference.
         * @param  payerReference  String value for payerReference.
         * @return Builder
         */
        public Builder payerReference(String payerReference) {
            this.payerReference = payerReference;
            return this;
        }

        /**
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(String paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

        /**
         * Setter for payerAttributes.
         * @param  payerAttributes  PayerAttributes value for payerAttributes.
         * @return Builder
         */
        public Builder payerAttributes(PayerAttributes payerAttributes) {
            this.payerAttributes = payerAttributes;
            return this;
        }

        /**
         * Setter for creditCardAttributes.
         * @param  creditCardAttributes  SubscriptionGroupCreditCard value for creditCardAttributes.
         * @return Builder
         */
        public Builder creditCardAttributes(SubscriptionGroupCreditCard creditCardAttributes) {
            this.creditCardAttributes = creditCardAttributes;
            return this;
        }

        /**
         * Setter for bankAccountAttributes.
         * @param  bankAccountAttributes  SubscriptionGroupBankAccount value for
         *         bankAccountAttributes.
         * @return Builder
         */
        public Builder bankAccountAttributes(SubscriptionGroupBankAccount bankAccountAttributes) {
            this.bankAccountAttributes = bankAccountAttributes;
            return this;
        }

        /**
         * Setter for subscriptions.
         * @param  subscriptions  List of SubscriptionGroupSignupItem value for subscriptions.
         * @return Builder
         */
        public Builder subscriptions(List<SubscriptionGroupSignupItem> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupFailureData} object using the set fields.
         * @return {@link SubscriptionGroupSignupFailureData}
         */
        public SubscriptionGroupSignupFailureData build() {
            return new SubscriptionGroupSignupFailureData(payerId, payerReference, paymentProfileId,
                    paymentCollectionMethod, payerAttributes, creditCardAttributes,
                    bankAccountAttributes, subscriptions);
        }
    }
}
