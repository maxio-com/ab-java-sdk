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
 * This is a model class for WalletProductUsageTemplate type.
 */
public class WalletProductUsageTemplate
        extends BaseModel {
    private OptionalNullable<String> planName;
    private OptionalNullable<String> walletTemplateName;
    private String unitName;
    private OptionalNullable<String> purchaseMechanism;
    private OptionalNullable<String> pricePointName;
    private String currency;
    private Boolean active;
    private OptionalNullable<Integer> featureTemplateId;
    private OptionalNullable<String> featureTemplateName;
    private Boolean pricePointOverride;

    /**
     * Default constructor.
     */
    public WalletProductUsageTemplate() {
    }

    /**
     * Initialization constructor.
     * @param  planName  String value for planName.
     * @param  walletTemplateName  String value for walletTemplateName.
     * @param  unitName  String value for unitName.
     * @param  purchaseMechanism  String value for purchaseMechanism.
     * @param  pricePointName  String value for pricePointName.
     * @param  currency  String value for currency.
     * @param  active  Boolean value for active.
     * @param  featureTemplateId  Integer value for featureTemplateId.
     * @param  featureTemplateName  String value for featureTemplateName.
     * @param  pricePointOverride  Boolean value for pricePointOverride.
     */
    public WalletProductUsageTemplate(
            String planName,
            String walletTemplateName,
            String unitName,
            String purchaseMechanism,
            String pricePointName,
            String currency,
            Boolean active,
            Integer featureTemplateId,
            String featureTemplateName,
            Boolean pricePointOverride) {
        this.planName = OptionalNullable.of(planName);
        this.walletTemplateName = OptionalNullable.of(walletTemplateName);
        this.unitName = unitName;
        this.purchaseMechanism = OptionalNullable.of(purchaseMechanism);
        this.pricePointName = OptionalNullable.of(pricePointName);
        this.currency = currency;
        this.active = active;
        this.featureTemplateId = OptionalNullable.of(featureTemplateId);
        this.featureTemplateName = OptionalNullable.of(featureTemplateName);
        this.pricePointOverride = pricePointOverride;
    }

    /**
     * Initialization constructor.
     * @param  planName  String value for planName.
     * @param  walletTemplateName  String value for walletTemplateName.
     * @param  unitName  String value for unitName.
     * @param  purchaseMechanism  String value for purchaseMechanism.
     * @param  pricePointName  String value for pricePointName.
     * @param  currency  String value for currency.
     * @param  active  Boolean value for active.
     * @param  featureTemplateId  Integer value for featureTemplateId.
     * @param  featureTemplateName  String value for featureTemplateName.
     * @param  pricePointOverride  Boolean value for pricePointOverride.
     */

    protected WalletProductUsageTemplate(OptionalNullable<String> planName,
            OptionalNullable<String> walletTemplateName, String unitName,
            OptionalNullable<String> purchaseMechanism, OptionalNullable<String> pricePointName,
            String currency, Boolean active, OptionalNullable<Integer> featureTemplateId,
            OptionalNullable<String> featureTemplateName, Boolean pricePointOverride) {
        this.planName = planName;
        this.walletTemplateName = walletTemplateName;
        this.unitName = unitName;
        this.purchaseMechanism = purchaseMechanism;
        this.pricePointName = pricePointName;
        this.currency = currency;
        this.active = active;
        this.featureTemplateId = featureTemplateId;
        this.featureTemplateName = featureTemplateName;
        this.pricePointOverride = pricePointOverride;
    }

    /**
     * Internal Getter for PlanName.
     * The name of the product or component the Feature is assigned to. `null` when the wallet
     * template has no assigning Feature.
     * @return Returns the Internal String
     */
    @JsonGetter("plan_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPlanName() {
        return this.planName;
    }

    /**
     * Getter for PlanName.
     * The name of the product or component the Feature is assigned to. `null` when the wallet
     * template has no assigning Feature.
     * @return Returns the String
     */
    public String getPlanName() {
        return OptionalNullable.getFrom(planName);
    }

    /**
     * Setter for PlanName.
     * The name of the product or component the Feature is assigned to. `null` when the wallet
     * template has no assigning Feature.
     * @param planName Value for String
     */
    @JsonSetter("plan_name")
    public void setPlanName(String planName) {
        this.planName = OptionalNullable.of(planName);
    }

    /**
     * UnSetter for PlanName.
     * The name of the product or component the Feature is assigned to. `null` when the wallet
     * template has no assigning Feature.
     */
    public void unsetPlanName() {
        planName = null;
    }

    /**
     * Internal Getter for WalletTemplateName.
     * The label set in `wallet_behavior.name` on the Feature, or the standalone wallet's own
     * `name`.
     * @return Returns the Internal String
     */
    @JsonGetter("wallet_template_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetWalletTemplateName() {
        return this.walletTemplateName;
    }

    /**
     * Getter for WalletTemplateName.
     * The label set in `wallet_behavior.name` on the Feature, or the standalone wallet's own
     * `name`.
     * @return Returns the String
     */
    public String getWalletTemplateName() {
        return OptionalNullable.getFrom(walletTemplateName);
    }

    /**
     * Setter for WalletTemplateName.
     * The label set in `wallet_behavior.name` on the Feature, or the standalone wallet's own
     * `name`.
     * @param walletTemplateName Value for String
     */
    @JsonSetter("wallet_template_name")
    public void setWalletTemplateName(String walletTemplateName) {
        this.walletTemplateName = OptionalNullable.of(walletTemplateName);
    }

    /**
     * UnSetter for WalletTemplateName.
     * The label set in `wallet_behavior.name` on the Feature, or the standalone wallet's own
     * `name`.
     */
    public void unsetWalletTemplateName() {
        walletTemplateName = null;
    }

    /**
     * Getter for UnitName.
     * @return Returns the String
     */
    @JsonGetter("unit_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitName() {
        return unitName;
    }

    /**
     * Setter for UnitName.
     * @param unitName Value for String
     */
    @JsonSetter("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Internal Getter for PurchaseMechanism.
     * A best-effort label for how this wallet is expected to be replenished. Currently reports
     * `"Overage"` when the wallet template allows a negative balance, and `null` otherwise; there's
     * no persisted field yet distinguishing, for example, an intended "Auto top-up" from "Purchase
     * more" setup. Treat this as informational, not a stable enum.
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
     * A best-effort label for how this wallet is expected to be replenished. Currently reports
     * `"Overage"` when the wallet template allows a negative balance, and `null` otherwise; there's
     * no persisted field yet distinguishing, for example, an intended "Auto top-up" from "Purchase
     * more" setup. Treat this as informational, not a stable enum.
     * @return Returns the String
     */
    public String getPurchaseMechanism() {
        return OptionalNullable.getFrom(purchaseMechanism);
    }

    /**
     * Setter for PurchaseMechanism.
     * A best-effort label for how this wallet is expected to be replenished. Currently reports
     * `"Overage"` when the wallet template allows a negative balance, and `null` otherwise; there's
     * no persisted field yet distinguishing, for example, an intended "Auto top-up" from "Purchase
     * more" setup. Treat this as informational, not a stable enum.
     * @param purchaseMechanism Value for String
     */
    @JsonSetter("purchase_mechanism")
    public void setPurchaseMechanism(String purchaseMechanism) {
        this.purchaseMechanism = OptionalNullable.of(purchaseMechanism);
    }

    /**
     * UnSetter for PurchaseMechanism.
     * A best-effort label for how this wallet is expected to be replenished. Currently reports
     * `"Overage"` when the wallet template allows a negative balance, and `null` otherwise; there's
     * no persisted field yet distinguishing, for example, an intended "Auto top-up" from "Purchase
     * more" setup. Treat this as informational, not a stable enum.
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
     * `false` when the assigning Feature is archived.
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * `false` when the assigning Feature is archived.
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Internal Getter for FeatureTemplateId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("feature_template_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFeatureTemplateId() {
        return this.featureTemplateId;
    }

    /**
     * Getter for FeatureTemplateId.
     * @return Returns the Integer
     */
    public Integer getFeatureTemplateId() {
        return OptionalNullable.getFrom(featureTemplateId);
    }

    /**
     * Setter for FeatureTemplateId.
     * @param featureTemplateId Value for Integer
     */
    @JsonSetter("feature_template_id")
    public void setFeatureTemplateId(Integer featureTemplateId) {
        this.featureTemplateId = OptionalNullable.of(featureTemplateId);
    }

    /**
     * UnSetter for FeatureTemplateId.
     */
    public void unsetFeatureTemplateId() {
        featureTemplateId = null;
    }

    /**
     * Internal Getter for FeatureTemplateName.
     * @return Returns the Internal String
     */
    @JsonGetter("feature_template_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFeatureTemplateName() {
        return this.featureTemplateName;
    }

    /**
     * Getter for FeatureTemplateName.
     * @return Returns the String
     */
    public String getFeatureTemplateName() {
        return OptionalNullable.getFrom(featureTemplateName);
    }

    /**
     * Setter for FeatureTemplateName.
     * @param featureTemplateName Value for String
     */
    @JsonSetter("feature_template_name")
    public void setFeatureTemplateName(String featureTemplateName) {
        this.featureTemplateName = OptionalNullable.of(featureTemplateName);
    }

    /**
     * UnSetter for FeatureTemplateName.
     */
    public void unsetFeatureTemplateName() {
        featureTemplateName = null;
    }

    /**
     * Getter for PricePointOverride.
     * `true` when this wallet template is priced at a price point other than the Wallet Product's
     * default.
     * @return Returns the Boolean
     */
    @JsonGetter("price_point_override")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPricePointOverride() {
        return pricePointOverride;
    }

    /**
     * Setter for PricePointOverride.
     * `true` when this wallet template is priced at a price point other than the Wallet Product's
     * default.
     * @param pricePointOverride Value for Boolean
     */
    @JsonSetter("price_point_override")
    public void setPricePointOverride(Boolean pricePointOverride) {
        this.pricePointOverride = pricePointOverride;
    }

    /**
     * Converts this WalletProductUsageTemplate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductUsageTemplate [" + "planName=" + planName + ", walletTemplateName="
                + walletTemplateName + ", unitName=" + unitName + ", purchaseMechanism="
                + purchaseMechanism + ", pricePointName=" + pricePointName + ", currency="
                + currency + ", active=" + active + ", featureTemplateId=" + featureTemplateId
                + ", featureTemplateName=" + featureTemplateName + ", pricePointOverride="
                + pricePointOverride + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductUsageTemplate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductUsageTemplate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .unitName(getUnitName())
                .currency(getCurrency())
                .active(getActive())
                .pricePointOverride(getPricePointOverride());
        builder.planName = internalGetPlanName();
        builder.walletTemplateName = internalGetWalletTemplateName();
        builder.purchaseMechanism = internalGetPurchaseMechanism();
        builder.pricePointName = internalGetPricePointName();
        builder.featureTemplateId = internalGetFeatureTemplateId();
        builder.featureTemplateName = internalGetFeatureTemplateName();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductUsageTemplate}.
     */
    public static class Builder {
        private OptionalNullable<String> planName;
        private OptionalNullable<String> walletTemplateName;
        private String unitName;
        private OptionalNullable<String> purchaseMechanism;
        private OptionalNullable<String> pricePointName;
        private String currency;
        private Boolean active;
        private OptionalNullable<Integer> featureTemplateId;
        private OptionalNullable<String> featureTemplateName;
        private Boolean pricePointOverride;



        /**
         * Setter for planName.
         * @param  planName  String value for planName.
         * @return Builder
         */
        public Builder planName(String planName) {
            this.planName = OptionalNullable.of(planName);
            return this;
        }

        /**
         * UnSetter for planName.
         * @return Builder
         */
        public Builder unsetPlanName() {
            planName = null;
            return this;
        }

        /**
         * Setter for walletTemplateName.
         * @param  walletTemplateName  String value for walletTemplateName.
         * @return Builder
         */
        public Builder walletTemplateName(String walletTemplateName) {
            this.walletTemplateName = OptionalNullable.of(walletTemplateName);
            return this;
        }

        /**
         * UnSetter for walletTemplateName.
         * @return Builder
         */
        public Builder unsetWalletTemplateName() {
            walletTemplateName = null;
            return this;
        }

        /**
         * Setter for unitName.
         * @param  unitName  String value for unitName.
         * @return Builder
         */
        public Builder unitName(String unitName) {
            this.unitName = unitName;
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
         * Setter for featureTemplateId.
         * @param  featureTemplateId  Integer value for featureTemplateId.
         * @return Builder
         */
        public Builder featureTemplateId(Integer featureTemplateId) {
            this.featureTemplateId = OptionalNullable.of(featureTemplateId);
            return this;
        }

        /**
         * UnSetter for featureTemplateId.
         * @return Builder
         */
        public Builder unsetFeatureTemplateId() {
            featureTemplateId = null;
            return this;
        }

        /**
         * Setter for featureTemplateName.
         * @param  featureTemplateName  String value for featureTemplateName.
         * @return Builder
         */
        public Builder featureTemplateName(String featureTemplateName) {
            this.featureTemplateName = OptionalNullable.of(featureTemplateName);
            return this;
        }

        /**
         * UnSetter for featureTemplateName.
         * @return Builder
         */
        public Builder unsetFeatureTemplateName() {
            featureTemplateName = null;
            return this;
        }

        /**
         * Setter for pricePointOverride.
         * @param  pricePointOverride  Boolean value for pricePointOverride.
         * @return Builder
         */
        public Builder pricePointOverride(Boolean pricePointOverride) {
            this.pricePointOverride = pricePointOverride;
            return this;
        }

        /**
         * Builds a new {@link WalletProductUsageTemplate} object using the set fields.
         * @return {@link WalletProductUsageTemplate}
         */
        public WalletProductUsageTemplate build() {
            return new WalletProductUsageTemplate(planName, walletTemplateName, unitName,
                    purchaseMechanism, pricePointName, currency, active, featureTemplateId,
                    featureTemplateName, pricePointOverride);
        }
    }
}
