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
import com.maxio.advancedbilling.models.containers.Wallet1ConversionRate;
import com.maxio.advancedbilling.models.containers.Wallet1InitialBalance;
import com.maxio.advancedbilling.models.containers.Wallet1WalletProductId;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Wallet1 type.
 */
public class Wallet1
        extends BaseModel {
    private int subscriptionId;
    private Wallet1WalletProductId walletProductId;
    private OptionalNullable<String> name;
    private String depletionPolicy;
    private WalletHardStopOverflow hardStopOverflow;
    private Integer meterId;
    private Wallet1ConversionRate conversionRate;
    private Integer pricePointId;
    private Wallet1InitialBalance initialBalance;
    private OptionalNullable<String> initialBalanceExpiresAt;

    /**
     * Default constructor.
     */
    public Wallet1() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  walletProductId  Wallet1WalletProductId value for walletProductId.
     * @param  name  String value for name.
     * @param  depletionPolicy  String value for depletionPolicy.
     * @param  hardStopOverflow  WalletHardStopOverflow value for hardStopOverflow.
     * @param  meterId  Integer value for meterId.
     * @param  conversionRate  Wallet1ConversionRate value for conversionRate.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  initialBalance  Wallet1InitialBalance value for initialBalance.
     * @param  initialBalanceExpiresAt  String value for initialBalanceExpiresAt.
     */
    public Wallet1(
            int subscriptionId,
            Wallet1WalletProductId walletProductId,
            String name,
            String depletionPolicy,
            WalletHardStopOverflow hardStopOverflow,
            Integer meterId,
            Wallet1ConversionRate conversionRate,
            Integer pricePointId,
            Wallet1InitialBalance initialBalance,
            String initialBalanceExpiresAt) {
        this.subscriptionId = subscriptionId;
        this.walletProductId = walletProductId;
        this.name = OptionalNullable.of(name);
        this.depletionPolicy = depletionPolicy;
        this.hardStopOverflow = hardStopOverflow;
        this.meterId = meterId;
        this.conversionRate = conversionRate;
        this.pricePointId = pricePointId;
        this.initialBalance = initialBalance;
        this.initialBalanceExpiresAt = OptionalNullable.of(initialBalanceExpiresAt);
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  walletProductId  Wallet1WalletProductId value for walletProductId.
     * @param  name  String value for name.
     * @param  depletionPolicy  String value for depletionPolicy.
     * @param  hardStopOverflow  WalletHardStopOverflow value for hardStopOverflow.
     * @param  meterId  Integer value for meterId.
     * @param  conversionRate  Wallet1ConversionRate value for conversionRate.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  initialBalance  Wallet1InitialBalance value for initialBalance.
     * @param  initialBalanceExpiresAt  String value for initialBalanceExpiresAt.
     */

    protected Wallet1(int subscriptionId, Wallet1WalletProductId walletProductId,
            OptionalNullable<String> name, String depletionPolicy,
            WalletHardStopOverflow hardStopOverflow, Integer meterId,
            Wallet1ConversionRate conversionRate, Integer pricePointId,
            Wallet1InitialBalance initialBalance,
            OptionalNullable<String> initialBalanceExpiresAt) {
        this.subscriptionId = subscriptionId;
        this.walletProductId = walletProductId;
        this.name = name;
        this.depletionPolicy = depletionPolicy;
        this.hardStopOverflow = hardStopOverflow;
        this.meterId = meterId;
        this.conversionRate = conversionRate;
        this.pricePointId = pricePointId;
        this.initialBalance = initialBalance;
        this.initialBalanceExpiresAt = initialBalanceExpiresAt;
    }

    /**
     * Getter for SubscriptionId.
     * The subscription that will own the wallet.
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The subscription that will own the wallet.
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for WalletProductId.
     * The [Wallet Product]($e/Wallet%20Products/createWalletProduct) that will denominate the
     * wallet: its numeric id, or its handle prefixed with `handle:` (for example
     * `handle:token-pack`). A bare handle with no prefix is looked up as an id and returns `404`.
     * Immutable once the wallet is created.
     * @return Returns the Wallet1WalletProductId
     */
    @JsonGetter("wallet_product_id")
    public Wallet1WalletProductId getWalletProductId() {
        return walletProductId;
    }

    /**
     * Setter for WalletProductId.
     * The [Wallet Product]($e/Wallet%20Products/createWalletProduct) that will denominate the
     * wallet: its numeric id, or its handle prefixed with `handle:` (for example
     * `handle:token-pack`). A bare handle with no prefix is looked up as an id and returns `404`.
     * Immutable once the wallet is created.
     * @param walletProductId Value for Wallet1WalletProductId
     */
    @JsonSetter("wallet_product_id")
    public void setWalletProductId(Wallet1WalletProductId walletProductId) {
        this.walletProductId = walletProductId;
    }

    /**
     * Internal Getter for Name.
     * (Optional) A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank
     * value is stored as `null`.
     * @return Returns the Internal String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetName() {
        return this.name;
    }

    /**
     * Getter for Name.
     * (Optional) A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank
     * value is stored as `null`.
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * (Optional) A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank
     * value is stored as `null`.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     * (Optional) A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank
     * value is stored as `null`.
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Getter for DepletionPolicy.
     * Defaults to `hard_stop`, currently the only supported value.
     * @return Returns the String
     */
    @JsonGetter("depletion_policy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDepletionPolicy() {
        return depletionPolicy;
    }

    /**
     * Setter for DepletionPolicy.
     * Defaults to `hard_stop`, currently the only supported value.
     * @param depletionPolicy Value for String
     */
    @JsonSetter("depletion_policy")
    public void setDepletionPolicy(String depletionPolicy) {
        this.depletionPolicy = depletionPolicy;
    }

    /**
     * Getter for HardStopOverflow.
     * Defaults to `discard`.
     * @return Returns the WalletHardStopOverflow
     */
    @JsonGetter("hard_stop_overflow")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletHardStopOverflow getHardStopOverflow() {
        return hardStopOverflow;
    }

    /**
     * Setter for HardStopOverflow.
     * Defaults to `discard`.
     * @param hardStopOverflow Value for WalletHardStopOverflow
     */
    @JsonSetter("hard_stop_overflow")
    public void setHardStopOverflow(WalletHardStopOverflow hardStopOverflow) {
        this.hardStopOverflow = hardStopOverflow;
    }

    /**
     * Getter for MeterId.
     * Pairs the wallet with a merchant-owned metering meter, so its balance factors in live usage
     * (see the wallet resource's `meter` and `metered_through_at` fields). Only a `sum` or `count`
     * meter can be paired. Requires metered wallet consumption to be enabled for the site, checked
     * whenever this or `conversion_rate` is sent: `403` (plain text, not JSON) if it isn't. A meter
     * id that doesn't resolve to a merchant-owned meter on this site, including a system-maintained
     * shadow meter, is `404`. Immutable once the wallet is created.
     * @return Returns the Integer
     */
    @JsonGetter("meter_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMeterId() {
        return meterId;
    }

    /**
     * Setter for MeterId.
     * Pairs the wallet with a merchant-owned metering meter, so its balance factors in live usage
     * (see the wallet resource's `meter` and `metered_through_at` fields). Only a `sum` or `count`
     * meter can be paired. Requires metered wallet consumption to be enabled for the site, checked
     * whenever this or `conversion_rate` is sent: `403` (plain text, not JSON) if it isn't. A meter
     * id that doesn't resolve to a merchant-owned meter on this site, including a system-maintained
     * shadow meter, is `404`. Immutable once the wallet is created.
     * @param meterId Value for Integer
     */
    @JsonSetter("meter_id")
    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    /**
     * Getter for ConversionRate.
     * How many wallet units one meter unit is worth, as a decimal string with at most 8 fractional
     * digits, greater than `0` and below 10^16. Send fractional values as strings: a JSON number
     * with a decimal point is rejected with `422`, because a double-precision float may already
     * have lost precision before the request arrives. Only meaningful with `meter_id`. Defaults to
     * `"1.0"`. Immutable once the wallet is created.
     * @return Returns the Wallet1ConversionRate
     */
    @JsonGetter("conversion_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Wallet1ConversionRate getConversionRate() {
        return conversionRate;
    }

    /**
     * Setter for ConversionRate.
     * How many wallet units one meter unit is worth, as a decimal string with at most 8 fractional
     * digits, greater than `0` and below 10^16. Send fractional values as strings: a JSON number
     * with a decimal point is rejected with `422`, because a double-precision float may already
     * have lost precision before the request arrives. Only meaningful with `meter_id`. Defaults to
     * `"1.0"`. Immutable once the wallet is created.
     * @param conversionRate Value for Wallet1ConversionRate
     */
    @JsonSetter("conversion_rate")
    public void setConversionRate(Wallet1ConversionRate conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**
     * Getter for PricePointId.
     * The price point used to price [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase) calls against this wallet. Must belong
     * to the Wallet Product, and can't be archived or a subscription-specific custom price point.
     * Defaults to the Wallet Product's default price point. Immutable once the wallet is created.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * The price point used to price [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase) calls against this wallet. Must belong
     * to the Wallet Product, and can't be archived or a subscription-specific custom price point.
     * Defaults to the Wallet Product's default price point. Immutable once the wallet is created.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for InitialBalance.
     * (Optional) A free opening balance, not a purchase and not reflected on any invoice. When
     * non-zero, wallet creation also writes an initial-balance grant and a matching
     * `initial_balance` ledger row. Omitted or exactly `0` creates a zero-balance wallet, not an
     * error. Encoded as a decimal string with at most 8 fractional digits, and must be non-negative
     * and below 10^16. Send fractional values as strings: a JSON number with a decimal point is
     * rejected with `422`, because a double-precision float may already have lost precision before
     * the request arrives.
     * @return Returns the Wallet1InitialBalance
     */
    @JsonGetter("initial_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Wallet1InitialBalance getInitialBalance() {
        return initialBalance;
    }

    /**
     * Setter for InitialBalance.
     * (Optional) A free opening balance, not a purchase and not reflected on any invoice. When
     * non-zero, wallet creation also writes an initial-balance grant and a matching
     * `initial_balance` ledger row. Omitted or exactly `0` creates a zero-balance wallet, not an
     * error. Encoded as a decimal string with at most 8 fractional digits, and must be non-negative
     * and below 10^16. Send fractional values as strings: a JSON number with a decimal point is
     * rejected with `422`, because a double-precision float may already have lost precision before
     * the request arrives.
     * @param initialBalance Value for Wallet1InitialBalance
     */
    @JsonSetter("initial_balance")
    public void setInitialBalance(Wallet1InitialBalance initialBalance) {
        this.initialBalance = initialBalance;
    }

    /**
     * Internal Getter for InitialBalanceExpiresAt.
     * An expiration for the initial-balance grant. Only accepted together with a non-zero
     * `initial_balance`, and must be in the future. Accepts either a bare calendar date
     * (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp.
     * A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than
     * rolled into the next month.
     * @return Returns the Internal String
     */
    @JsonGetter("initial_balance_expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInitialBalanceExpiresAt() {
        return this.initialBalanceExpiresAt;
    }

    /**
     * Getter for InitialBalanceExpiresAt.
     * An expiration for the initial-balance grant. Only accepted together with a non-zero
     * `initial_balance`, and must be in the future. Accepts either a bare calendar date
     * (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp.
     * A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than
     * rolled into the next month.
     * @return Returns the String
     */
    public String getInitialBalanceExpiresAt() {
        return OptionalNullable.getFrom(initialBalanceExpiresAt);
    }

    /**
     * Setter for InitialBalanceExpiresAt.
     * An expiration for the initial-balance grant. Only accepted together with a non-zero
     * `initial_balance`, and must be in the future. Accepts either a bare calendar date
     * (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp.
     * A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than
     * rolled into the next month.
     * @param initialBalanceExpiresAt Value for String
     */
    @JsonSetter("initial_balance_expires_at")
    public void setInitialBalanceExpiresAt(String initialBalanceExpiresAt) {
        this.initialBalanceExpiresAt = OptionalNullable.of(initialBalanceExpiresAt);
    }

    /**
     * UnSetter for InitialBalanceExpiresAt.
     * An expiration for the initial-balance grant. Only accepted together with a non-zero
     * `initial_balance`, and must be in the future. Accepts either a bare calendar date
     * (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp.
     * A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than
     * rolled into the next month.
     */
    public void unsetInitialBalanceExpiresAt() {
        initialBalanceExpiresAt = null;
    }

    /**
     * Converts this Wallet1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Wallet1 [" + "subscriptionId=" + subscriptionId + ", walletProductId="
                + walletProductId + ", name=" + name + ", depletionPolicy=" + depletionPolicy
                + ", hardStopOverflow=" + hardStopOverflow + ", meterId=" + meterId
                + ", conversionRate=" + conversionRate + ", pricePointId=" + pricePointId
                + ", initialBalance=" + initialBalance + ", initialBalanceExpiresAt="
                + initialBalanceExpiresAt + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Wallet1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Wallet1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId, walletProductId)
                .depletionPolicy(getDepletionPolicy())
                .hardStopOverflow(getHardStopOverflow())
                .meterId(getMeterId())
                .conversionRate(getConversionRate())
                .pricePointId(getPricePointId())
                .initialBalance(getInitialBalance());
        builder.name = internalGetName();
        builder.initialBalanceExpiresAt = internalGetInitialBalanceExpiresAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Wallet1}.
     */
    public static class Builder {
        private int subscriptionId;
        private Wallet1WalletProductId walletProductId;
        private OptionalNullable<String> name;
        private String depletionPolicy;
        private WalletHardStopOverflow hardStopOverflow;
        private Integer meterId;
        private Wallet1ConversionRate conversionRate;
        private Integer pricePointId;
        private Wallet1InitialBalance initialBalance;
        private OptionalNullable<String> initialBalanceExpiresAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  walletProductId  Wallet1WalletProductId value for walletProductId.
         */
        public Builder(int subscriptionId, Wallet1WalletProductId walletProductId) {
            this.subscriptionId = subscriptionId;
            this.walletProductId = walletProductId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for walletProductId.
         * @param  walletProductId  Wallet1WalletProductId value for walletProductId.
         * @return Builder
         */
        public Builder walletProductId(Wallet1WalletProductId walletProductId) {
            this.walletProductId = walletProductId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = OptionalNullable.of(name);
            return this;
        }

        /**
         * UnSetter for name.
         * @return Builder
         */
        public Builder unsetName() {
            name = null;
            return this;
        }

        /**
         * Setter for depletionPolicy.
         * @param  depletionPolicy  String value for depletionPolicy.
         * @return Builder
         */
        public Builder depletionPolicy(String depletionPolicy) {
            this.depletionPolicy = depletionPolicy;
            return this;
        }

        /**
         * Setter for hardStopOverflow.
         * @param  hardStopOverflow  WalletHardStopOverflow value for hardStopOverflow.
         * @return Builder
         */
        public Builder hardStopOverflow(WalletHardStopOverflow hardStopOverflow) {
            this.hardStopOverflow = hardStopOverflow;
            return this;
        }

        /**
         * Setter for meterId.
         * @param  meterId  Integer value for meterId.
         * @return Builder
         */
        public Builder meterId(Integer meterId) {
            this.meterId = meterId;
            return this;
        }

        /**
         * Setter for conversionRate.
         * @param  conversionRate  Wallet1ConversionRate value for conversionRate.
         * @return Builder
         */
        public Builder conversionRate(Wallet1ConversionRate conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for initialBalance.
         * @param  initialBalance  Wallet1InitialBalance value for initialBalance.
         * @return Builder
         */
        public Builder initialBalance(Wallet1InitialBalance initialBalance) {
            this.initialBalance = initialBalance;
            return this;
        }

        /**
         * Setter for initialBalanceExpiresAt.
         * @param  initialBalanceExpiresAt  String value for initialBalanceExpiresAt.
         * @return Builder
         */
        public Builder initialBalanceExpiresAt(String initialBalanceExpiresAt) {
            this.initialBalanceExpiresAt = OptionalNullable.of(initialBalanceExpiresAt);
            return this;
        }

        /**
         * UnSetter for initialBalanceExpiresAt.
         * @return Builder
         */
        public Builder unsetInitialBalanceExpiresAt() {
            initialBalanceExpiresAt = null;
            return this;
        }

        /**
         * Builds a new {@link Wallet1} object using the set fields.
         * @return {@link Wallet1}
         */
        public Wallet1 build() {
            return new Wallet1(subscriptionId, walletProductId, name, depletionPolicy,
                    hardStopOverflow, meterId, conversionRate, pricePointId, initialBalance,
                    initialBalanceExpiresAt);
        }
    }
}
