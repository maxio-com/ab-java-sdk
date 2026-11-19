/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for Wallet type.
 */
public class Wallet
        extends BaseModel {
    private Integer id;
    private OwnerType ownerType;
    private Integer ownerId;
    private OptionalNullable<String> name;
    private Integer walletProductId;
    private String walletProductName;
    private String unit;
    private OptionalNullable<Integer> pricePointId;
    private String balance;
    private String postedBalance;
    private OptionalNullable<Meter> meter;
    private OptionalNullable<ZonedDateTime> meteredThroughAt;
    private OptionalNullable<Integer> meteredRecheckAfterSeconds;
    private OptionalNullable<Boolean> meteredStale;
    private WalletStatus status;
    private String depletionPolicy;
    private WalletHardStopOverflow hardStopOverflow;
    private WalletOrigin origin;
    private OptionalNullable<String> featureKey;
    private List<WalletGrant> grants;
    private List<WalletRecurringFunding> recurringFunding;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

    /**
     * Default constructor.
     */
    public Wallet() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  ownerType  OwnerType value for ownerType.
     * @param  ownerId  Integer value for ownerId.
     * @param  name  String value for name.
     * @param  walletProductId  Integer value for walletProductId.
     * @param  walletProductName  String value for walletProductName.
     * @param  unit  String value for unit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  balance  String value for balance.
     * @param  postedBalance  String value for postedBalance.
     * @param  meter  Meter value for meter.
     * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
     * @param  meteredRecheckAfterSeconds  Integer value for meteredRecheckAfterSeconds.
     * @param  meteredStale  Boolean value for meteredStale.
     * @param  status  WalletStatus value for status.
     * @param  depletionPolicy  String value for depletionPolicy.
     * @param  hardStopOverflow  WalletHardStopOverflow value for hardStopOverflow.
     * @param  origin  WalletOrigin value for origin.
     * @param  featureKey  String value for featureKey.
     * @param  grants  List of WalletGrant value for grants.
     * @param  recurringFunding  List of WalletRecurringFunding value for recurringFunding.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     */
    public Wallet(
            Integer id,
            OwnerType ownerType,
            Integer ownerId,
            String name,
            Integer walletProductId,
            String walletProductName,
            String unit,
            Integer pricePointId,
            String balance,
            String postedBalance,
            Meter meter,
            ZonedDateTime meteredThroughAt,
            Integer meteredRecheckAfterSeconds,
            Boolean meteredStale,
            WalletStatus status,
            String depletionPolicy,
            WalletHardStopOverflow hardStopOverflow,
            WalletOrigin origin,
            String featureKey,
            List<WalletGrant> grants,
            List<WalletRecurringFunding> recurringFunding,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt) {
        this.id = id;
        this.ownerType = ownerType;
        this.ownerId = ownerId;
        this.name = OptionalNullable.of(name);
        this.walletProductId = walletProductId;
        this.walletProductName = walletProductName;
        this.unit = unit;
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.balance = balance;
        this.postedBalance = postedBalance;
        this.meter = OptionalNullable.of(meter);
        this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
        this.meteredRecheckAfterSeconds = OptionalNullable.of(meteredRecheckAfterSeconds);
        this.meteredStale = OptionalNullable.of(meteredStale);
        this.status = status;
        this.depletionPolicy = depletionPolicy;
        this.hardStopOverflow = hardStopOverflow;
        this.origin = origin;
        this.featureKey = OptionalNullable.of(featureKey);
        this.grants = grants;
        this.recurringFunding = recurringFunding;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  ownerType  OwnerType value for ownerType.
     * @param  ownerId  Integer value for ownerId.
     * @param  name  String value for name.
     * @param  walletProductId  Integer value for walletProductId.
     * @param  walletProductName  String value for walletProductName.
     * @param  unit  String value for unit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  balance  String value for balance.
     * @param  postedBalance  String value for postedBalance.
     * @param  meter  Meter value for meter.
     * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
     * @param  meteredRecheckAfterSeconds  Integer value for meteredRecheckAfterSeconds.
     * @param  meteredStale  Boolean value for meteredStale.
     * @param  status  WalletStatus value for status.
     * @param  depletionPolicy  String value for depletionPolicy.
     * @param  hardStopOverflow  WalletHardStopOverflow value for hardStopOverflow.
     * @param  origin  WalletOrigin value for origin.
     * @param  featureKey  String value for featureKey.
     * @param  grants  List of WalletGrant value for grants.
     * @param  recurringFunding  List of WalletRecurringFunding value for recurringFunding.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     */

    protected Wallet(Integer id, OwnerType ownerType, Integer ownerId,
            OptionalNullable<String> name, Integer walletProductId, String walletProductName,
            String unit, OptionalNullable<Integer> pricePointId, String balance,
            String postedBalance, OptionalNullable<Meter> meter,
            OptionalNullable<ZonedDateTime> meteredThroughAt,
            OptionalNullable<Integer> meteredRecheckAfterSeconds,
            OptionalNullable<Boolean> meteredStale, WalletStatus status, String depletionPolicy,
            WalletHardStopOverflow hardStopOverflow, WalletOrigin origin,
            OptionalNullable<String> featureKey, List<WalletGrant> grants,
            List<WalletRecurringFunding> recurringFunding, ZonedDateTime createdAt,
            ZonedDateTime updatedAt) {
        this.id = id;
        this.ownerType = ownerType;
        this.ownerId = ownerId;
        this.name = name;
        this.walletProductId = walletProductId;
        this.walletProductName = walletProductName;
        this.unit = unit;
        this.pricePointId = pricePointId;
        this.balance = balance;
        this.postedBalance = postedBalance;
        this.meter = meter;
        this.meteredThroughAt = meteredThroughAt;
        this.meteredRecheckAfterSeconds = meteredRecheckAfterSeconds;
        this.meteredStale = meteredStale;
        this.status = status;
        this.depletionPolicy = depletionPolicy;
        this.hardStopOverflow = hardStopOverflow;
        this.origin = origin;
        this.featureKey = featureKey;
        this.grants = grants;
        this.recurringFunding = recurringFunding;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * Getter for OwnerType.
     * The polymorphic owner type. `subscription` is the only value currently supported.
     * @return Returns the OwnerType
     */
    @JsonGetter("owner_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OwnerType getOwnerType() {
        return ownerType;
    }

    /**
     * Setter for OwnerType.
     * The polymorphic owner type. `subscription` is the only value currently supported.
     * @param ownerType Value for OwnerType
     */
    @JsonSetter("owner_type")
    public void setOwnerType(OwnerType ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * Getter for OwnerId.
     * The id of the owning subscription.
     * @return Returns the Integer
     */
    @JsonGetter("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Setter for OwnerId.
     * The id of the owning subscription.
     * @param ownerId Value for Integer
     */
    @JsonSetter("owner_id")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Internal Getter for Name.
     * (Optional) A merchant-facing label for the wallet, set on create and changeable with [Update
     * Wallet]($e/Wallets/updateWallet). Surrounding spaces are stripped; a blank value is stored as
     * `null`.
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
     * (Optional) A merchant-facing label for the wallet, set on create and changeable with [Update
     * Wallet]($e/Wallets/updateWallet). Surrounding spaces are stripped; a blank value is stored as
     * `null`.
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * (Optional) A merchant-facing label for the wallet, set on create and changeable with [Update
     * Wallet]($e/Wallets/updateWallet). Surrounding spaces are stripped; a blank value is stored as
     * `null`.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     * (Optional) A merchant-facing label for the wallet, set on create and changeable with [Update
     * Wallet]($e/Wallets/updateWallet). Surrounding spaces are stripped; a blank value is stored as
     * `null`.
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Getter for WalletProductId.
     * The id of the [Wallet Product]($e/Wallet%20Products/createWalletProduct) that denominates the
     * wallet. Immutable for the life of the wallet.
     * @return Returns the Integer
     */
    @JsonGetter("wallet_product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getWalletProductId() {
        return walletProductId;
    }

    /**
     * Setter for WalletProductId.
     * The id of the [Wallet Product]($e/Wallet%20Products/createWalletProduct) that denominates the
     * wallet. Immutable for the life of the wallet.
     * @param walletProductId Value for Integer
     */
    @JsonSetter("wallet_product_id")
    public void setWalletProductId(Integer walletProductId) {
        this.walletProductId = walletProductId;
    }

    /**
     * Getter for WalletProductName.
     * The name of the Wallet Product that denominates the wallet.
     * @return Returns the String
     */
    @JsonGetter("wallet_product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWalletProductName() {
        return walletProductName;
    }

    /**
     * Setter for WalletProductName.
     * The name of the Wallet Product that denominates the wallet.
     * @param walletProductName Value for String
     */
    @JsonSetter("wallet_product_name")
    public void setWalletProductName(String walletProductName) {
        this.walletProductName = walletProductName;
    }

    /**
     * Getter for Unit.
     * The billing product's unit name, immutable for the life of the wallet.
     * @return Returns the String
     */
    @JsonGetter("unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnit() {
        return unit;
    }

    /**
     * Setter for Unit.
     * The billing product's unit name, immutable for the life of the wallet.
     * @param unit Value for String
     */
    @JsonSetter("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Internal Getter for PricePointId.
     * The price point that priced this wallet's
     * [purchases]($e/Wallet%20Purchases/createWalletPurchase), set on create and immutable
     * afterward. Defaults to the Wallet Product's default price point; `null` if the Wallet Product
     * has none and none was given on create.
     * @return Returns the Internal Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPricePointId() {
        return this.pricePointId;
    }

    /**
     * Getter for PricePointId.
     * The price point that priced this wallet's
     * [purchases]($e/Wallet%20Purchases/createWalletPurchase), set on create and immutable
     * afterward. Defaults to the Wallet Product's default price point; `null` if the Wallet Product
     * has none and none was given on create.
     * @return Returns the Integer
     */
    public Integer getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * The price point that priced this wallet's
     * [purchases]($e/Wallet%20Purchases/createWalletPurchase), set on create and immutable
     * afterward. Defaults to the Wallet Product's default price point; `null` if the Wallet Product
     * has none and none was given on create.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     * The price point that priced this wallet's
     * [purchases]($e/Wallet%20Purchases/createWalletPurchase), set on create and immutable
     * afterward. Defaults to the Wallet Product's default price point; `null` if the Wallet Product
     * has none and none was given on create.
     */
    public void unsetPricePointId() {
        pricePointId = null;
    }

    /**
     * Getter for Balance.
     * What the wallet can spend now, encoded as a decimal string to avoid floating-point precision
     * loss. This is the number to enforce against. For a metered wallet, it includes usage not yet
     * posted to the ledger, through `metered_through_at`, but only in the response from [Read
     * Wallet]($e/Wallets/readWallet); every other response (list, create, update, archive) reports
     * the balance as of the last ledger write, equal to `posted_balance`, even for a metered
     * wallet. The grants' `remaining` follow this figure, so they add up to it whenever it is zero
     * or more.
     * @return Returns the String
     */
    @JsonGetter("balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBalance() {
        return balance;
    }

    /**
     * Setter for Balance.
     * What the wallet can spend now, encoded as a decimal string to avoid floating-point precision
     * loss. This is the number to enforce against. For a metered wallet, it includes usage not yet
     * posted to the ledger, through `metered_through_at`, but only in the response from [Read
     * Wallet]($e/Wallets/readWallet); every other response (list, create, update, archive) reports
     * the balance as of the last ledger write, equal to `posted_balance`, even for a metered
     * wallet. The grants' `remaining` follow this figure, so they add up to it whenever it is zero
     * or more.
     * @param balance Value for String
     */
    @JsonSetter("balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * Getter for PostedBalance.
     * The balance from written ledger entries alone: grants funded, minus debits written to the
     * ledger, as a decimal string. Always present, also for a wallet with no meter. It equals
     * `balance` wherever no live metered balance is computed: list, create, update, and archive
     * responses, an unlinked or archived wallet, and a read where `metered_stale` is `true`. Only
     * an active, metered wallet read through [Read Wallet]($e/Wallets/readWallet), with
     * `metered_stale` not `true`, can have a `balance` below its `posted_balance`. It stays exact
     * when `metered_stale` is `true`. Reconcile the transactions list (`balance_after`) against
     * this figure, not against `balance`.
     * @return Returns the String
     */
    @JsonGetter("posted_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostedBalance() {
        return postedBalance;
    }

    /**
     * Setter for PostedBalance.
     * The balance from written ledger entries alone: grants funded, minus debits written to the
     * ledger, as a decimal string. Always present, also for a wallet with no meter. It equals
     * `balance` wherever no live metered balance is computed: list, create, update, and archive
     * responses, an unlinked or archived wallet, and a read where `metered_stale` is `true`. Only
     * an active, metered wallet read through [Read Wallet]($e/Wallets/readWallet), with
     * `metered_stale` not `true`, can have a `balance` below its `posted_balance`. It stays exact
     * when `metered_stale` is `true`. Reconcile the transactions list (`balance_after`) against
     * this figure, not against `balance`.
     * @param postedBalance Value for String
     */
    @JsonSetter("posted_balance")
    public void setPostedBalance(String postedBalance) {
        this.postedBalance = postedBalance;
    }

    /**
     * Internal Getter for Meter.
     * The metering meter this wallet is paired with, or `null` for a wallet with no meter. Set on
     * create and immutable afterward.
     * @return Returns the Internal Meter
     */
    @JsonGetter("meter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Meter> internalGetMeter() {
        return this.meter;
    }

    /**
     * Getter for Meter.
     * The metering meter this wallet is paired with, or `null` for a wallet with no meter. Set on
     * create and immutable afterward.
     * @return Returns the Meter
     */
    public Meter getMeter() {
        return OptionalNullable.getFrom(meter);
    }

    /**
     * Setter for Meter.
     * The metering meter this wallet is paired with, or `null` for a wallet with no meter. Set on
     * create and immutable afterward.
     * @param meter Value for Meter
     */
    @JsonSetter("meter")
    public void setMeter(Meter meter) {
        this.meter = OptionalNullable.of(meter);
    }

    /**
     * UnSetter for Meter.
     * The metering meter this wallet is paired with, or `null` for a wallet with no meter. Set on
     * create and immutable afterward.
     */
    public void unsetMeter() {
        meter = null;
    }

    /**
     * Internal Getter for MeteredThroughAt.
     * The point up to which live meter usage has been factored into `balance`. Populated only in
     * the response from [Read Wallet]($e/Wallets/readWallet), for an active, metered wallet on a
     * site with metered consumption enabled; `null` everywhere else, including list, create,
     * update, and archive responses for the same wallet.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("metered_through_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetMeteredThroughAt() {
        return this.meteredThroughAt;
    }

    /**
     * Getter for MeteredThroughAt.
     * The point up to which live meter usage has been factored into `balance`. Populated only in
     * the response from [Read Wallet]($e/Wallets/readWallet), for an active, metered wallet on a
     * site with metered consumption enabled; `null` everywhere else, including list, create,
     * update, and archive responses for the same wallet.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getMeteredThroughAt() {
        return OptionalNullable.getFrom(meteredThroughAt);
    }

    /**
     * Setter for MeteredThroughAt.
     * The point up to which live meter usage has been factored into `balance`. Populated only in
     * the response from [Read Wallet]($e/Wallets/readWallet), for an active, metered wallet on a
     * site with metered consumption enabled; `null` everywhere else, including list, create,
     * update, and archive responses for the same wallet.
     * @param meteredThroughAt Value for ZonedDateTime
     */
    @JsonSetter("metered_through_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMeteredThroughAt(ZonedDateTime meteredThroughAt) {
        this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
    }

    /**
     * UnSetter for MeteredThroughAt.
     * The point up to which live meter usage has been factored into `balance`. Populated only in
     * the response from [Read Wallet]($e/Wallets/readWallet), for an active, metered wallet on a
     * site with metered consumption enabled; `null` everywhere else, including list, create,
     * update, and archive responses for the same wallet.
     */
    public void unsetMeteredThroughAt() {
        meteredThroughAt = null;
    }

    /**
     * Internal Getter for MeteredRecheckAfterSeconds.
     * How many seconds to wait before re-reading `balance` to see usage past `metered_through_at`.
     * Same availability as `metered_through_at`.
     * @return Returns the Internal Integer
     */
    @JsonGetter("metered_recheck_after_seconds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMeteredRecheckAfterSeconds() {
        return this.meteredRecheckAfterSeconds;
    }

    /**
     * Getter for MeteredRecheckAfterSeconds.
     * How many seconds to wait before re-reading `balance` to see usage past `metered_through_at`.
     * Same availability as `metered_through_at`.
     * @return Returns the Integer
     */
    public Integer getMeteredRecheckAfterSeconds() {
        return OptionalNullable.getFrom(meteredRecheckAfterSeconds);
    }

    /**
     * Setter for MeteredRecheckAfterSeconds.
     * How many seconds to wait before re-reading `balance` to see usage past `metered_through_at`.
     * Same availability as `metered_through_at`.
     * @param meteredRecheckAfterSeconds Value for Integer
     */
    @JsonSetter("metered_recheck_after_seconds")
    public void setMeteredRecheckAfterSeconds(Integer meteredRecheckAfterSeconds) {
        this.meteredRecheckAfterSeconds = OptionalNullable.of(meteredRecheckAfterSeconds);
    }

    /**
     * UnSetter for MeteredRecheckAfterSeconds.
     * How many seconds to wait before re-reading `balance` to see usage past `metered_through_at`.
     * Same availability as `metered_through_at`.
     */
    public void unsetMeteredRecheckAfterSeconds() {
        meteredRecheckAfterSeconds = null;
    }

    /**
     * Internal Getter for MeteredStale.
     * `true` when live usage could not be read fresh and `balance` reflects an earlier snapshot.
     * Same availability as `metered_through_at`.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("metered_stale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetMeteredStale() {
        return this.meteredStale;
    }

    /**
     * Getter for MeteredStale.
     * `true` when live usage could not be read fresh and `balance` reflects an earlier snapshot.
     * Same availability as `metered_through_at`.
     * @return Returns the Boolean
     */
    public Boolean getMeteredStale() {
        return OptionalNullable.getFrom(meteredStale);
    }

    /**
     * Setter for MeteredStale.
     * `true` when live usage could not be read fresh and `balance` reflects an earlier snapshot.
     * Same availability as `metered_through_at`.
     * @param meteredStale Value for Boolean
     */
    @JsonSetter("metered_stale")
    public void setMeteredStale(Boolean meteredStale) {
        this.meteredStale = OptionalNullable.of(meteredStale);
    }

    /**
     * UnSetter for MeteredStale.
     * `true` when live usage could not be read fresh and `balance` reflects an earlier snapshot.
     * Same availability as `metered_through_at`.
     */
    public void unsetMeteredStale() {
        meteredStale = null;
    }

    /**
     * Getter for Status.
     * @return Returns the WalletStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for WalletStatus
     */
    @JsonSetter("status")
    public void setStatus(WalletStatus status) {
        this.status = status;
    }

    /**
     * Getter for DepletionPolicy.
     * What happens when a debit would take the wallet below zero. Known values: `hard_stop` (the
     * only value you can set today). More values are expected over time, so treat this as an open
     * string and don't fail on one you don't recognize. At the zero boundary, `hard_stop` behaves
     * as set by `hard_stop_overflow`.
     * @return Returns the String
     */
    @JsonGetter("depletion_policy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDepletionPolicy() {
        return depletionPolicy;
    }

    /**
     * Setter for DepletionPolicy.
     * What happens when a debit would take the wallet below zero. Known values: `hard_stop` (the
     * only value you can set today). More values are expected over time, so treat this as an open
     * string and don't fail on one you don't recognize. At the zero boundary, `hard_stop` behaves
     * as set by `hard_stop_overflow`.
     * @param depletionPolicy Value for String
     */
    @JsonSetter("depletion_policy")
    public void setDepletionPolicy(String depletionPolicy) {
        this.depletionPolicy = depletionPolicy;
    }

    /**
     * Getter for HardStopOverflow.
     * Behavior at the hard-stop boundary. `discard` drains the wallet to zero and rejects the
     * excess (the default). `allow_negative` deducts the full amount, letting the balance go
     * negative. The excess past the wallet's grants is booked as an overdraft ledger row with
     * `grant_id` set to `null`.
     * @return Returns the WalletHardStopOverflow
     */
    @JsonGetter("hard_stop_overflow")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletHardStopOverflow getHardStopOverflow() {
        return hardStopOverflow;
    }

    /**
     * Setter for HardStopOverflow.
     * Behavior at the hard-stop boundary. `discard` drains the wallet to zero and rejects the
     * excess (the default). `allow_negative` deducts the full amount, letting the balance go
     * negative. The excess past the wallet's grants is booked as an overdraft ledger row with
     * `grant_id` set to `null`.
     * @param hardStopOverflow Value for WalletHardStopOverflow
     */
    @JsonSetter("hard_stop_overflow")
    public void setHardStopOverflow(WalletHardStopOverflow hardStopOverflow) {
        this.hardStopOverflow = hardStopOverflow;
    }

    /**
     * Getter for Origin.
     * How the wallet came to exist. `manual` for a wallet created directly with [Create
     * Wallet]($e/Wallets/createWallet). `feature` for a wallet auto-provisioned because a
     * subscription resolved a usage-limit entitlement whose Feature has `wallet_behavior`
     * configured.
     * @return Returns the WalletOrigin
     */
    @JsonGetter("origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletOrigin getOrigin() {
        return origin;
    }

    /**
     * Setter for Origin.
     * How the wallet came to exist. `manual` for a wallet created directly with [Create
     * Wallet]($e/Wallets/createWallet). `feature` for a wallet auto-provisioned because a
     * subscription resolved a usage-limit entitlement whose Feature has `wallet_behavior`
     * configured.
     * @param origin Value for WalletOrigin
     */
    @JsonSetter("origin")
    public void setOrigin(WalletOrigin origin) {
        this.origin = origin;
    }

    /**
     * Internal Getter for FeatureKey.
     * The key of the Feature this wallet was provisioned for, when `origin` is `feature`. `null`
     * for a `manual` wallet.
     * @return Returns the Internal String
     */
    @JsonGetter("feature_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFeatureKey() {
        return this.featureKey;
    }

    /**
     * Getter for FeatureKey.
     * The key of the Feature this wallet was provisioned for, when `origin` is `feature`. `null`
     * for a `manual` wallet.
     * @return Returns the String
     */
    public String getFeatureKey() {
        return OptionalNullable.getFrom(featureKey);
    }

    /**
     * Setter for FeatureKey.
     * The key of the Feature this wallet was provisioned for, when `origin` is `feature`. `null`
     * for a `manual` wallet.
     * @param featureKey Value for String
     */
    @JsonSetter("feature_key")
    public void setFeatureKey(String featureKey) {
        this.featureKey = OptionalNullable.of(featureKey);
    }

    /**
     * UnSetter for FeatureKey.
     * The key of the Feature this wallet was provisioned for, when `origin` is `feature`. `null`
     * for a `manual` wallet.
     */
    public void unsetFeatureKey() {
        featureKey = null;
    }

    /**
     * Getter for Grants.
     * Every grant on the wallet, including ones already spent or expired, in drain order (the order
     * debits would consume the still-open ones in): the soonest-expiring grant first, evergreen
     * grants last.
     * @return Returns the List of WalletGrant
     */
    @JsonGetter("grants")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<WalletGrant> getGrants() {
        return grants;
    }

    /**
     * Setter for Grants.
     * Every grant on the wallet, including ones already spent or expired, in drain order (the order
     * debits would consume the still-open ones in): the soonest-expiring grant first, evergreen
     * grants last.
     * @param grants Value for List of WalletGrant
     */
    @JsonSetter("grants")
    public void setGrants(List<WalletGrant> grants) {
        this.grants = grants;
    }

    /**
     * Getter for RecurringFunding.
     * The wallet's automatic funding schedules, if any. Empty for a `manual` wallet with no funding
     * entitlement. A wallet funds automatically when it's provisioned from a Feature with
     * `wallet_behavior` configured; see [the Wallets concept
     * guide](page:introduction/basic-concepts/wallets#provisioning-a-wallet-from-a-feature).
     * @return Returns the List of WalletRecurringFunding
     */
    @JsonGetter("recurring_funding")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<WalletRecurringFunding> getRecurringFunding() {
        return recurringFunding;
    }

    /**
     * Setter for RecurringFunding.
     * The wallet's automatic funding schedules, if any. Empty for a `manual` wallet with no funding
     * entitlement. A wallet funds automatically when it's provisioned from a Feature with
     * `wallet_behavior` configured; see [the Wallets concept
     * guide](page:introduction/basic-concepts/wallets#provisioning-a-wallet-from-a-feature).
     * @param recurringFunding Value for List of WalletRecurringFunding
     */
    @JsonSetter("recurring_funding")
    public void setRecurringFunding(List<WalletRecurringFunding> recurringFunding) {
        this.recurringFunding = recurringFunding;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this Wallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Wallet [" + "id=" + id + ", ownerType=" + ownerType + ", ownerId=" + ownerId
                + ", name=" + name + ", walletProductId=" + walletProductId + ", walletProductName="
                + walletProductName + ", unit=" + unit + ", pricePointId=" + pricePointId
                + ", balance=" + balance + ", postedBalance=" + postedBalance + ", meter=" + meter
                + ", meteredThroughAt=" + meteredThroughAt + ", meteredRecheckAfterSeconds="
                + meteredRecheckAfterSeconds + ", meteredStale=" + meteredStale + ", status="
                + status + ", depletionPolicy=" + depletionPolicy + ", hardStopOverflow="
                + hardStopOverflow + ", origin=" + origin + ", featureKey=" + featureKey
                + ", grants=" + grants + ", recurringFunding=" + recurringFunding + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Wallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Wallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .ownerType(getOwnerType())
                .ownerId(getOwnerId())
                .walletProductId(getWalletProductId())
                .walletProductName(getWalletProductName())
                .unit(getUnit())
                .balance(getBalance())
                .postedBalance(getPostedBalance())
                .status(getStatus())
                .depletionPolicy(getDepletionPolicy())
                .hardStopOverflow(getHardStopOverflow())
                .origin(getOrigin())
                .grants(getGrants())
                .recurringFunding(getRecurringFunding())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt());
        builder.name = internalGetName();
        builder.pricePointId = internalGetPricePointId();
        builder.meter = internalGetMeter();
        builder.meteredThroughAt = internalGetMeteredThroughAt();
        builder.meteredRecheckAfterSeconds = internalGetMeteredRecheckAfterSeconds();
        builder.meteredStale = internalGetMeteredStale();
        builder.featureKey = internalGetFeatureKey();
        return builder;
    }

    /**
     * Class to build instances of {@link Wallet}.
     */
    public static class Builder {
        private Integer id;
        private OwnerType ownerType;
        private Integer ownerId;
        private OptionalNullable<String> name;
        private Integer walletProductId;
        private String walletProductName;
        private String unit;
        private OptionalNullable<Integer> pricePointId;
        private String balance;
        private String postedBalance;
        private OptionalNullable<Meter> meter;
        private OptionalNullable<ZonedDateTime> meteredThroughAt;
        private OptionalNullable<Integer> meteredRecheckAfterSeconds;
        private OptionalNullable<Boolean> meteredStale;
        private WalletStatus status;
        private String depletionPolicy;
        private WalletHardStopOverflow hardStopOverflow;
        private WalletOrigin origin;
        private OptionalNullable<String> featureKey;
        private List<WalletGrant> grants;
        private List<WalletRecurringFunding> recurringFunding;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;



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
         * Setter for ownerType.
         * @param  ownerType  OwnerType value for ownerType.
         * @return Builder
         */
        public Builder ownerType(OwnerType ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * Setter for ownerId.
         * @param  ownerId  Integer value for ownerId.
         * @return Builder
         */
        public Builder ownerId(Integer ownerId) {
            this.ownerId = ownerId;
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
         * Setter for walletProductId.
         * @param  walletProductId  Integer value for walletProductId.
         * @return Builder
         */
        public Builder walletProductId(Integer walletProductId) {
            this.walletProductId = walletProductId;
            return this;
        }

        /**
         * Setter for walletProductName.
         * @param  walletProductName  String value for walletProductName.
         * @return Builder
         */
        public Builder walletProductName(String walletProductName) {
            this.walletProductName = walletProductName;
            return this;
        }

        /**
         * Setter for unit.
         * @param  unit  String value for unit.
         * @return Builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = OptionalNullable.of(pricePointId);
            return this;
        }

        /**
         * UnSetter for pricePointId.
         * @return Builder
         */
        public Builder unsetPricePointId() {
            pricePointId = null;
            return this;
        }

        /**
         * Setter for balance.
         * @param  balance  String value for balance.
         * @return Builder
         */
        public Builder balance(String balance) {
            this.balance = balance;
            return this;
        }

        /**
         * Setter for postedBalance.
         * @param  postedBalance  String value for postedBalance.
         * @return Builder
         */
        public Builder postedBalance(String postedBalance) {
            this.postedBalance = postedBalance;
            return this;
        }

        /**
         * Setter for meter.
         * @param  meter  Meter value for meter.
         * @return Builder
         */
        public Builder meter(Meter meter) {
            this.meter = OptionalNullable.of(meter);
            return this;
        }

        /**
         * UnSetter for meter.
         * @return Builder
         */
        public Builder unsetMeter() {
            meter = null;
            return this;
        }

        /**
         * Setter for meteredThroughAt.
         * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
         * @return Builder
         */
        public Builder meteredThroughAt(ZonedDateTime meteredThroughAt) {
            this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
            return this;
        }

        /**
         * UnSetter for meteredThroughAt.
         * @return Builder
         */
        public Builder unsetMeteredThroughAt() {
            meteredThroughAt = null;
            return this;
        }

        /**
         * Setter for meteredRecheckAfterSeconds.
         * @param  meteredRecheckAfterSeconds  Integer value for meteredRecheckAfterSeconds.
         * @return Builder
         */
        public Builder meteredRecheckAfterSeconds(Integer meteredRecheckAfterSeconds) {
            this.meteredRecheckAfterSeconds = OptionalNullable.of(meteredRecheckAfterSeconds);
            return this;
        }

        /**
         * UnSetter for meteredRecheckAfterSeconds.
         * @return Builder
         */
        public Builder unsetMeteredRecheckAfterSeconds() {
            meteredRecheckAfterSeconds = null;
            return this;
        }

        /**
         * Setter for meteredStale.
         * @param  meteredStale  Boolean value for meteredStale.
         * @return Builder
         */
        public Builder meteredStale(Boolean meteredStale) {
            this.meteredStale = OptionalNullable.of(meteredStale);
            return this;
        }

        /**
         * UnSetter for meteredStale.
         * @return Builder
         */
        public Builder unsetMeteredStale() {
            meteredStale = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  WalletStatus value for status.
         * @return Builder
         */
        public Builder status(WalletStatus status) {
            this.status = status;
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
         * Setter for origin.
         * @param  origin  WalletOrigin value for origin.
         * @return Builder
         */
        public Builder origin(WalletOrigin origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Setter for featureKey.
         * @param  featureKey  String value for featureKey.
         * @return Builder
         */
        public Builder featureKey(String featureKey) {
            this.featureKey = OptionalNullable.of(featureKey);
            return this;
        }

        /**
         * UnSetter for featureKey.
         * @return Builder
         */
        public Builder unsetFeatureKey() {
            featureKey = null;
            return this;
        }

        /**
         * Setter for grants.
         * @param  grants  List of WalletGrant value for grants.
         * @return Builder
         */
        public Builder grants(List<WalletGrant> grants) {
            this.grants = grants;
            return this;
        }

        /**
         * Setter for recurringFunding.
         * @param  recurringFunding  List of WalletRecurringFunding value for recurringFunding.
         * @return Builder
         */
        public Builder recurringFunding(List<WalletRecurringFunding> recurringFunding) {
            this.recurringFunding = recurringFunding;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link Wallet} object using the set fields.
         * @return {@link Wallet}
         */
        public Wallet build() {
            return new Wallet(id, ownerType, ownerId, name, walletProductId, walletProductName,
                    unit, pricePointId, balance, postedBalance, meter, meteredThroughAt,
                    meteredRecheckAfterSeconds, meteredStale, status, depletionPolicy,
                    hardStopOverflow, origin, featureKey, grants, recurringFunding, createdAt,
                    updatedAt);
        }
    }
}
