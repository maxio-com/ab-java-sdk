/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.models.containers.UpdateSubscriptionNetTerms;
import com.maxio.advancedbilling.models.containers.UpdateSubscriptionSnapDay;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for UpdateSubscription type.
 */
public class UpdateSubscription {
    private CreditCardAttributes creditCardAttributes;
    private String productHandle;
    private Integer productId;
    private Boolean productChangeDelayed;
    private String nextProductId;
    private String nextProductPricePointId;
    private UpdateSubscriptionSnapDay snapDay;
    private String nextBillingAt;
    private String paymentCollectionMethod;
    private Boolean receivesInvoiceEmails;
    private UpdateSubscriptionNetTerms netTerms;
    private Integer storedCredentialTransactionId;
    private String reference;
    private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
    private List<UpdateSubscriptionComponent> components;
    private OptionalNullable<Boolean> dunningCommunicationDelayEnabled;
    private OptionalNullable<String> dunningCommunicationDelayTimeZone;

    /**
     * Default constructor.
     */
    public UpdateSubscription() {
        productChangeDelayed = false;
        dunningCommunicationDelayEnabled = OptionalNullable.of(false);
    }

    /**
     * Initialization constructor.
     * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
     * @param  productHandle  String value for productHandle.
     * @param  productId  Integer value for productId.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  nextProductId  String value for nextProductId.
     * @param  nextProductPricePointId  String value for nextProductPricePointId.
     * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
     * @param  nextBillingAt  String value for nextBillingAt.
     * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
     * @param  components  List of UpdateSubscriptionComponent value for components.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     */
    public UpdateSubscription(
            CreditCardAttributes creditCardAttributes,
            String productHandle,
            Integer productId,
            Boolean productChangeDelayed,
            String nextProductId,
            String nextProductPricePointId,
            UpdateSubscriptionSnapDay snapDay,
            String nextBillingAt,
            String paymentCollectionMethod,
            Boolean receivesInvoiceEmails,
            UpdateSubscriptionNetTerms netTerms,
            Integer storedCredentialTransactionId,
            String reference,
            CustomPriceUsedForSubscriptionCreateUpdate customPrice,
            List<UpdateSubscriptionComponent> components,
            Boolean dunningCommunicationDelayEnabled,
            String dunningCommunicationDelayTimeZone) {
        this.creditCardAttributes = creditCardAttributes;
        this.productHandle = productHandle;
        this.productId = productId;
        this.productChangeDelayed = productChangeDelayed;
        this.nextProductId = nextProductId;
        this.nextProductPricePointId = nextProductPricePointId;
        this.snapDay = snapDay;
        this.nextBillingAt = nextBillingAt;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.reference = reference;
        this.customPrice = customPrice;
        this.components = components;
        this.dunningCommunicationDelayEnabled =
                OptionalNullable.of(dunningCommunicationDelayEnabled);
        this.dunningCommunicationDelayTimeZone =
                OptionalNullable.of(dunningCommunicationDelayTimeZone);
    }

    /**
     * Initialization constructor.
     * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
     * @param  productHandle  String value for productHandle.
     * @param  productId  Integer value for productId.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  nextProductId  String value for nextProductId.
     * @param  nextProductPricePointId  String value for nextProductPricePointId.
     * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
     * @param  nextBillingAt  String value for nextBillingAt.
     * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
     * @param  components  List of UpdateSubscriptionComponent value for components.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     */

    protected UpdateSubscription(CreditCardAttributes creditCardAttributes, String productHandle,
            Integer productId, Boolean productChangeDelayed, String nextProductId,
            String nextProductPricePointId, UpdateSubscriptionSnapDay snapDay, String nextBillingAt,
            String paymentCollectionMethod, Boolean receivesInvoiceEmails,
            UpdateSubscriptionNetTerms netTerms, Integer storedCredentialTransactionId,
            String reference, CustomPriceUsedForSubscriptionCreateUpdate customPrice,
            List<UpdateSubscriptionComponent> components,
            OptionalNullable<Boolean> dunningCommunicationDelayEnabled,
            OptionalNullable<String> dunningCommunicationDelayTimeZone) {
        this.creditCardAttributes = creditCardAttributes;
        this.productHandle = productHandle;
        this.productId = productId;
        this.productChangeDelayed = productChangeDelayed;
        this.nextProductId = nextProductId;
        this.nextProductPricePointId = nextProductPricePointId;
        this.snapDay = snapDay;
        this.nextBillingAt = nextBillingAt;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.reference = reference;
        this.customPrice = customPrice;
        this.components = components;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone = dunningCommunicationDelayTimeZone;
    }

    /**
     * Getter for CreditCardAttributes.
     * @return Returns the CreditCardAttributes
     */
    @JsonGetter("credit_card_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditCardAttributes getCreditCardAttributes() {
        return creditCardAttributes;
    }

    /**
     * Setter for CreditCardAttributes.
     * @param creditCardAttributes Value for CreditCardAttributes
     */
    @JsonSetter("credit_card_attributes")
    public void setCreditCardAttributes(CreditCardAttributes creditCardAttributes) {
        this.creditCardAttributes = creditCardAttributes;
    }

    /**
     * Getter for ProductHandle.
     * Set to the handle of a different product to change the subscription's product
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * Set to the handle of a different product to change the subscription's product
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for ProductId.
     * Set to the id of a different product to change the subscription's product
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Set to the id of a different product to change the subscription's product
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductChangeDelayed.
     * @return Returns the Boolean
     */
    @JsonGetter("product_change_delayed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getProductChangeDelayed() {
        return productChangeDelayed;
    }

    /**
     * Setter for ProductChangeDelayed.
     * @param productChangeDelayed Value for Boolean
     */
    @JsonSetter("product_change_delayed")
    public void setProductChangeDelayed(Boolean productChangeDelayed) {
        this.productChangeDelayed = productChangeDelayed;
    }

    /**
     * Getter for NextProductId.
     * Set to an empty string to cancel a delayed product change.
     * @return Returns the String
     */
    @JsonGetter("next_product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextProductId() {
        return nextProductId;
    }

    /**
     * Setter for NextProductId.
     * Set to an empty string to cancel a delayed product change.
     * @param nextProductId Value for String
     */
    @JsonSetter("next_product_id")
    public void setNextProductId(String nextProductId) {
        this.nextProductId = nextProductId;
    }

    /**
     * Getter for NextProductPricePointId.
     * @return Returns the String
     */
    @JsonGetter("next_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextProductPricePointId() {
        return nextProductPricePointId;
    }

    /**
     * Setter for NextProductPricePointId.
     * @param nextProductPricePointId Value for String
     */
    @JsonSetter("next_product_price_point_id")
    public void setNextProductPricePointId(String nextProductPricePointId) {
        this.nextProductPricePointId = nextProductPricePointId;
    }

    /**
     * Getter for SnapDay.
     * Use for subscriptions with product eligible for calendar billing only. Value can be 1-28 or
     * 'end'.
     * @return Returns the UpdateSubscriptionSnapDay
     */
    @JsonGetter("snap_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateSubscriptionSnapDay getSnapDay() {
        return snapDay;
    }

    /**
     * Setter for SnapDay.
     * Use for subscriptions with product eligible for calendar billing only. Value can be 1-28 or
     * 'end'.
     * @param snapDay Value for UpdateSubscriptionSnapDay
     */
    @JsonSetter("snap_day")
    public void setSnapDay(UpdateSubscriptionSnapDay snapDay) {
        this.snapDay = snapDay;
    }

    /**
     * Getter for NextBillingAt.
     * @return Returns the String
     */
    @JsonGetter("next_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextBillingAt() {
        return nextBillingAt;
    }

    /**
     * Setter for NextBillingAt.
     * @param nextBillingAt Value for String
     */
    @JsonSetter("next_billing_at")
    public void setNextBillingAt(String nextBillingAt) {
        this.nextBillingAt = nextBillingAt;
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
     * Getter for ReceivesInvoiceEmails.
     * @return Returns the Boolean
     */
    @JsonGetter("receives_invoice_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReceivesInvoiceEmails() {
        return receivesInvoiceEmails;
    }

    /**
     * Setter for ReceivesInvoiceEmails.
     * @param receivesInvoiceEmails Value for Boolean
     */
    @JsonSetter("receives_invoice_emails")
    public void setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) {
        this.receivesInvoiceEmails = receivesInvoiceEmails;
    }

    /**
     * Getter for NetTerms.
     * @return Returns the UpdateSubscriptionNetTerms
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateSubscriptionNetTerms getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * @param netTerms Value for UpdateSubscriptionNetTerms
     */
    @JsonSetter("net_terms")
    public void setNetTerms(UpdateSubscriptionNetTerms netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for StoredCredentialTransactionId.
     * @return Returns the Integer
     */
    @JsonGetter("stored_credential_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStoredCredentialTransactionId() {
        return storedCredentialTransactionId;
    }

    /**
     * Setter for StoredCredentialTransactionId.
     * @param storedCredentialTransactionId Value for Integer
     */
    @JsonSetter("stored_credential_transaction_id")
    public void setStoredCredentialTransactionId(Integer storedCredentialTransactionId) {
        this.storedCredentialTransactionId = storedCredentialTransactionId;
    }

    /**
     * Getter for Reference.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdate getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @param customPrice Value for CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Getter for Components.
     * (Optional) An array of component ids and custom prices to be added to the subscription.
     * @return Returns the List of UpdateSubscriptionComponent
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdateSubscriptionComponent> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * (Optional) An array of component ids and custom prices to be added to the subscription.
     * @param components Value for List of UpdateSubscriptionComponent
     */
    @JsonSetter("components")
    public void setComponents(List<UpdateSubscriptionComponent> components) {
        this.components = components;
    }

    /**
     * Internal Getter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("dunning_communication_delay_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDunningCommunicationDelayEnabled() {
        return this.dunningCommunicationDelayEnabled;
    }

    /**
     * Getter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @return Returns the Boolean
     */
    public Boolean getDunningCommunicationDelayEnabled() {
        return OptionalNullable.getFrom(dunningCommunicationDelayEnabled);
    }

    /**
     * Setter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @param dunningCommunicationDelayEnabled Value for Boolean
     */
    @JsonSetter("dunning_communication_delay_enabled")
    public void setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) {
        this.dunningCommunicationDelayEnabled = OptionalNullable.of(dunningCommunicationDelayEnabled);
    }

    /**
     * UnSetter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     */
    public void unsetDunningCommunicationDelayEnabled() {
        dunningCommunicationDelayEnabled = null;
    }

    /**
     * Internal Getter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @return Returns the Internal String
     */
    @JsonGetter("dunning_communication_delay_time_zone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDunningCommunicationDelayTimeZone() {
        return this.dunningCommunicationDelayTimeZone;
    }

    /**
     * Getter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @return Returns the String
     */
    public String getDunningCommunicationDelayTimeZone() {
        return OptionalNullable.getFrom(dunningCommunicationDelayTimeZone);
    }

    /**
     * Setter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @param dunningCommunicationDelayTimeZone Value for String
     */
    @JsonSetter("dunning_communication_delay_time_zone")
    public void setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) {
        this.dunningCommunicationDelayTimeZone = OptionalNullable.of(dunningCommunicationDelayTimeZone);
    }

    /**
     * UnSetter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     */
    public void unsetDunningCommunicationDelayTimeZone() {
        dunningCommunicationDelayTimeZone = null;
    }

    /**
     * Converts this UpdateSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscription [" + "creditCardAttributes=" + creditCardAttributes
                + ", productHandle=" + productHandle + ", productId=" + productId
                + ", productChangeDelayed=" + productChangeDelayed + ", nextProductId="
                + nextProductId + ", nextProductPricePointId=" + nextProductPricePointId
                + ", snapDay=" + snapDay + ", nextBillingAt=" + nextBillingAt
                + ", paymentCollectionMethod=" + paymentCollectionMethod
                + ", receivesInvoiceEmails=" + receivesInvoiceEmails + ", netTerms=" + netTerms
                + ", storedCredentialTransactionId=" + storedCredentialTransactionId
                + ", reference=" + reference + ", customPrice=" + customPrice + ", components="
                + components + ", dunningCommunicationDelayEnabled="
                + dunningCommunicationDelayEnabled + ", dunningCommunicationDelayTimeZone="
                + dunningCommunicationDelayTimeZone + "]";
    }

    /**
     * Builds a new {@link UpdateSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .creditCardAttributes(getCreditCardAttributes())
                .productHandle(getProductHandle())
                .productId(getProductId())
                .productChangeDelayed(getProductChangeDelayed())
                .nextProductId(getNextProductId())
                .nextProductPricePointId(getNextProductPricePointId())
                .snapDay(getSnapDay())
                .nextBillingAt(getNextBillingAt())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .receivesInvoiceEmails(getReceivesInvoiceEmails())
                .netTerms(getNetTerms())
                .storedCredentialTransactionId(getStoredCredentialTransactionId())
                .reference(getReference())
                .customPrice(getCustomPrice())
                .components(getComponents());
        builder.dunningCommunicationDelayEnabled = internalGetDunningCommunicationDelayEnabled();
        builder.dunningCommunicationDelayTimeZone = internalGetDunningCommunicationDelayTimeZone();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscription}.
     */
    public static class Builder {
        private CreditCardAttributes creditCardAttributes;
        private String productHandle;
        private Integer productId;
        private Boolean productChangeDelayed = false;
        private String nextProductId;
        private String nextProductPricePointId;
        private UpdateSubscriptionSnapDay snapDay;
        private String nextBillingAt;
        private String paymentCollectionMethod;
        private Boolean receivesInvoiceEmails;
        private UpdateSubscriptionNetTerms netTerms;
        private Integer storedCredentialTransactionId;
        private String reference;
        private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
        private List<UpdateSubscriptionComponent> components;
        private OptionalNullable<Boolean> dunningCommunicationDelayEnabled =
                OptionalNullable.of(false);
        private OptionalNullable<String> dunningCommunicationDelayTimeZone;



        /**
         * Setter for creditCardAttributes.
         * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
         * @return Builder
         */
        public Builder creditCardAttributes(CreditCardAttributes creditCardAttributes) {
            this.creditCardAttributes = creditCardAttributes;
            return this;
        }

        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = productHandle;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for productChangeDelayed.
         * @param  productChangeDelayed  Boolean value for productChangeDelayed.
         * @return Builder
         */
        public Builder productChangeDelayed(Boolean productChangeDelayed) {
            this.productChangeDelayed = productChangeDelayed;
            return this;
        }

        /**
         * Setter for nextProductId.
         * @param  nextProductId  String value for nextProductId.
         * @return Builder
         */
        public Builder nextProductId(String nextProductId) {
            this.nextProductId = nextProductId;
            return this;
        }

        /**
         * Setter for nextProductPricePointId.
         * @param  nextProductPricePointId  String value for nextProductPricePointId.
         * @return Builder
         */
        public Builder nextProductPricePointId(String nextProductPricePointId) {
            this.nextProductPricePointId = nextProductPricePointId;
            return this;
        }

        /**
         * Setter for snapDay.
         * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
         * @return Builder
         */
        public Builder snapDay(UpdateSubscriptionSnapDay snapDay) {
            this.snapDay = snapDay;
            return this;
        }

        /**
         * Setter for nextBillingAt.
         * @param  nextBillingAt  String value for nextBillingAt.
         * @return Builder
         */
        public Builder nextBillingAt(String nextBillingAt) {
            this.nextBillingAt = nextBillingAt;
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
         * Setter for receivesInvoiceEmails.
         * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
         * @return Builder
         */
        public Builder receivesInvoiceEmails(Boolean receivesInvoiceEmails) {
            this.receivesInvoiceEmails = receivesInvoiceEmails;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
         * @return Builder
         */
        public Builder netTerms(UpdateSubscriptionNetTerms netTerms) {
            this.netTerms = netTerms;
            return this;
        }

        /**
         * Setter for storedCredentialTransactionId.
         * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
         * @return Builder
         */
        public Builder storedCredentialTransactionId(Integer storedCredentialTransactionId) {
            this.storedCredentialTransactionId = storedCredentialTransactionId;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
         * @return Builder
         */
        public Builder customPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Setter for components.
         * @param  components  List of UpdateSubscriptionComponent value for components.
         * @return Builder
         */
        public Builder components(List<UpdateSubscriptionComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for dunningCommunicationDelayEnabled.
         * @param  dunningCommunicationDelayEnabled  Boolean value for
         *         dunningCommunicationDelayEnabled.
         * @return Builder
         */
        public Builder dunningCommunicationDelayEnabled(
                Boolean dunningCommunicationDelayEnabled) {
            this.dunningCommunicationDelayEnabled =
                    OptionalNullable.of(dunningCommunicationDelayEnabled);
            return this;
        }

        /**
         * UnSetter for dunningCommunicationDelayEnabled.
         * @return Builder
         */
        public Builder unsetDunningCommunicationDelayEnabled() {
            dunningCommunicationDelayEnabled = null;
            return this;
        }

        /**
         * Setter for dunningCommunicationDelayTimeZone.
         * @param  dunningCommunicationDelayTimeZone  String value for
         *         dunningCommunicationDelayTimeZone.
         * @return Builder
         */
        public Builder dunningCommunicationDelayTimeZone(
                String dunningCommunicationDelayTimeZone) {
            this.dunningCommunicationDelayTimeZone =
                    OptionalNullable.of(dunningCommunicationDelayTimeZone);
            return this;
        }

        /**
         * UnSetter for dunningCommunicationDelayTimeZone.
         * @return Builder
         */
        public Builder unsetDunningCommunicationDelayTimeZone() {
            dunningCommunicationDelayTimeZone = null;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscription} object using the set fields.
         * @return {@link UpdateSubscription}
         */
        public UpdateSubscription build() {
            return new UpdateSubscription(creditCardAttributes, productHandle, productId,
                    productChangeDelayed, nextProductId, nextProductPricePointId, snapDay,
                    nextBillingAt, paymentCollectionMethod, receivesInvoiceEmails, netTerms,
                    storedCredentialTransactionId, reference, customPrice, components,
                    dunningCommunicationDelayEnabled, dunningCommunicationDelayTimeZone);
        }
    }
}
