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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for WalletProductActiveWallet type.
 */
public class WalletProductActiveWallet
        extends BaseModel {
    private Integer id;
    private Integer subscriptionId;
    private String companyName;
    private OptionalNullable<String> purchaseMechanism;
    private OptionalNullable<String> pricePointName;
    private String currency;
    private Boolean active;

    /**
     * Default constructor.
     */
    public WalletProductActiveWallet() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  companyName  String value for companyName.
     * @param  purchaseMechanism  String value for purchaseMechanism.
     * @param  pricePointName  String value for pricePointName.
     * @param  currency  String value for currency.
     * @param  active  Boolean value for active.
     */
    public WalletProductActiveWallet(
            Integer id,
            Integer subscriptionId,
            String companyName,
            String purchaseMechanism,
            String pricePointName,
            String currency,
            Boolean active) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.companyName = companyName;
        this.purchaseMechanism = OptionalNullable.of(purchaseMechanism);
        this.pricePointName = OptionalNullable.of(pricePointName);
        this.currency = currency;
        this.active = active;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  companyName  String value for companyName.
     * @param  purchaseMechanism  String value for purchaseMechanism.
     * @param  pricePointName  String value for pricePointName.
     * @param  currency  String value for currency.
     * @param  active  Boolean value for active.
     */

    protected WalletProductActiveWallet(Integer id, Integer subscriptionId, String companyName,
            OptionalNullable<String> purchaseMechanism, OptionalNullable<String> pricePointName,
            String currency, Boolean active) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.companyName = companyName;
        this.purchaseMechanism = purchaseMechanism;
        this.pricePointName = pricePointName;
        this.currency = currency;
        this.active = active;
    }

    /**
     * Getter for Id.
     * The Advanced Billing id of the wallet.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Advanced Billing id of the wallet.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for CompanyName.
     * The owning customer's organization name, falling back to their full name, then to `"Customer
     * #&lt;id&gt;"`. `"Customer"` (with no id) when the wallet's subscription has no customer at all.
     * @return Returns the String
     */
    @JsonGetter("company_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * The owning customer's organization name, falling back to their full name, then to `"Customer
     * #&lt;id&gt;"`. `"Customer"` (with no id) when the wallet's subscription has no customer at all.
     * @param companyName Value for String
     */
    @JsonSetter("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Internal Getter for PurchaseMechanism.
     * See the same field on [Wallet Product Usage
     * Template]($m/Wallet%20Product%20Usage%20Template). The same caveats apply.
     * @return Returns the Internal String
     */
    @JsonGetter("purchase_mechanism")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPurchaseMechanism() {
        return this.purchaseMechanism;
    }

    /**
     * Getter for PurchaseMechanism.
     * See the same field on [Wallet Product Usage
     * Template]($m/Wallet%20Product%20Usage%20Template). The same caveats apply.
     * @return Returns the String
     */
    public String getPurchaseMechanism() {
        return OptionalNullable.getFrom(purchaseMechanism);
    }

    /**
     * Setter for PurchaseMechanism.
     * See the same field on [Wallet Product Usage
     * Template]($m/Wallet%20Product%20Usage%20Template). The same caveats apply.
     * @param purchaseMechanism Value for String
     */
    @JsonSetter("purchase_mechanism")
    public void setPurchaseMechanism(String purchaseMechanism) {
        this.purchaseMechanism = OptionalNullable.of(purchaseMechanism);
    }

    /**
     * UnSetter for PurchaseMechanism.
     * See the same field on [Wallet Product Usage
     * Template]($m/Wallet%20Product%20Usage%20Template). The same caveats apply.
     */
    public void unsetPurchaseMechanism() {
        purchaseMechanism = null;
    }

    /**
     * Internal Getter for PricePointName.
     * @return Returns the Internal String
     */
    @JsonGetter("price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricePointName() {
        return this.pricePointName;
    }

    /**
     * Getter for PricePointName.
     * @return Returns the String
     */
    public String getPricePointName() {
        return OptionalNullable.getFrom(pricePointName);
    }

    /**
     * Setter for PricePointName.
     * @param pricePointName Value for String
     */
    @JsonSetter("price_point_name")
    public void setPricePointName(String pricePointName) {
        this.pricePointName = OptionalNullable.of(pricePointName);
    }

    /**
     * UnSetter for PricePointName.
     */
    public void unsetPricePointName() {
        pricePointName = null;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Active.
     * `false` when the wallet's Feature is archived.
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * `false` when the wallet's Feature is archived.
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Converts this WalletProductActiveWallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductActiveWallet [" + "id=" + id + ", subscriptionId=" + subscriptionId
                + ", companyName=" + companyName + ", purchaseMechanism=" + purchaseMechanism
                + ", pricePointName=" + pricePointName + ", currency=" + currency + ", active="
                + active + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductActiveWallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductActiveWallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .subscriptionId(getSubscriptionId())
                .companyName(getCompanyName())
                .currency(getCurrency())
                .active(getActive());
        builder.purchaseMechanism = internalGetPurchaseMechanism();
        builder.pricePointName = internalGetPricePointName();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductActiveWallet}.
     */
    public static class Builder {
        private Integer id;
        private Integer subscriptionId;
        private String companyName;
        private OptionalNullable<String> purchaseMechanism;
        private OptionalNullable<String> pricePointName;
        private String currency;
        private Boolean active;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * Setter for purchaseMechanism.
         * @param  purchaseMechanism  String value for purchaseMechanism.
         * @return Builder
         */
        public Builder purchaseMechanism(String purchaseMechanism) {
            this.purchaseMechanism = OptionalNullable.of(purchaseMechanism);
            return this;
        }

        /**
         * UnSetter for purchaseMechanism.
         * @return Builder
         */
        public Builder unsetPurchaseMechanism() {
            purchaseMechanism = null;
            return this;
        }

        /**
         * Setter for pricePointName.
         * @param  pricePointName  String value for pricePointName.
         * @return Builder
         */
        public Builder pricePointName(String pricePointName) {
            this.pricePointName = OptionalNullable.of(pricePointName);
            return this;
        }

        /**
         * UnSetter for pricePointName.
         * @return Builder
         */
        public Builder unsetPricePointName() {
            pricePointName = null;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for active.
         * @param  active  Boolean value for active.
         * @return Builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Builds a new {@link WalletProductActiveWallet} object using the set fields.
         * @return {@link WalletProductActiveWallet}
         */
        public WalletProductActiveWallet build() {
            return new WalletProductActiveWallet(id, subscriptionId, companyName, purchaseMechanism,
                    pricePointName, currency, active);
        }
    }
}
