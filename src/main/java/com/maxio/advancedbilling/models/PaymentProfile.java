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
 * This is a model class for PaymentProfile type.
 */
public class PaymentProfile
        extends BaseModel {
    private int id;
    private String vaultToken;
    private OptionalNullable<String> gatewayHandle;
    private OptionalNullable<String> customerVaultToken;

    /**
     * Default constructor.
     */
    public PaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  vaultToken  String value for vaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  customerVaultToken  String value for customerVaultToken.
     */
    public PaymentProfile(
            int id,
            String vaultToken,
            String gatewayHandle,
            String customerVaultToken) {
        this.id = id;
        this.vaultToken = vaultToken;
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  vaultToken  String value for vaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  customerVaultToken  String value for customerVaultToken.
     */

    protected PaymentProfile(int id, String vaultToken, OptionalNullable<String> gatewayHandle,
            OptionalNullable<String> customerVaultToken) {
        this.id = id;
        this.vaultToken = vaultToken;
        this.gatewayHandle = gatewayHandle;
        this.customerVaultToken = customerVaultToken;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for VaultToken.
     * @return Returns the String
     */
    @JsonGetter("vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultToken() {
        return vaultToken;
    }

    /**
     * Setter for VaultToken.
     * @param vaultToken Value for String
     */
    @JsonSetter("vault_token")
    public void setVaultToken(String vaultToken) {
        this.vaultToken = vaultToken;
    }

    /**
     * Internal Getter for GatewayHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayHandle() {
        return this.gatewayHandle;
    }

    /**
     * Getter for GatewayHandle.
     * @return Returns the String
     */
    public String getGatewayHandle() {
        return OptionalNullable.getFrom(gatewayHandle);
    }

    /**
     * Setter for GatewayHandle.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * UnSetter for GatewayHandle.
     */
    public void unsetGatewayHandle() {
        gatewayHandle = null;
    }

    /**
     * Internal Getter for CustomerVaultToken.
     * @return Returns the Internal String
     */
    @JsonGetter("customer_vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCustomerVaultToken() {
        return this.customerVaultToken;
    }

    /**
     * Getter for CustomerVaultToken.
     * @return Returns the String
     */
    public String getCustomerVaultToken() {
        return OptionalNullable.getFrom(customerVaultToken);
    }

    /**
     * Setter for CustomerVaultToken.
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
    }

    /**
     * UnSetter for CustomerVaultToken.
     */
    public void unsetCustomerVaultToken() {
        customerVaultToken = null;
    }

    /**
     * Converts this PaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentProfile [" + "id=" + id + ", vaultToken=" + vaultToken + ", gatewayHandle="
                + gatewayHandle + ", customerVaultToken=" + customerVaultToken
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .vaultToken(getVaultToken());
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.customerVaultToken = internalGetCustomerVaultToken();
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentProfile}.
     */
    public static class Builder {
        private int id;
        private String vaultToken;
        private OptionalNullable<String> gatewayHandle;
        private OptionalNullable<String> customerVaultToken;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         */
        public Builder(int id) {
            this.id = id;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for vaultToken.
         * @param  vaultToken  String value for vaultToken.
         * @return Builder
         */
        public Builder vaultToken(String vaultToken) {
            this.vaultToken = vaultToken;
            return this;
        }

        /**
         * Setter for gatewayHandle.
         * @param  gatewayHandle  String value for gatewayHandle.
         * @return Builder
         */
        public Builder gatewayHandle(String gatewayHandle) {
            this.gatewayHandle = OptionalNullable.of(gatewayHandle);
            return this;
        }

        /**
         * UnSetter for gatewayHandle.
         * @return Builder
         */
        public Builder unsetGatewayHandle() {
            gatewayHandle = null;
            return this;
        }

        /**
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = OptionalNullable.of(customerVaultToken);
            return this;
        }

        /**
         * UnSetter for customerVaultToken.
         * @return Builder
         */
        public Builder unsetCustomerVaultToken() {
            customerVaultToken = null;
            return this;
        }

        /**
         * Builds a new {@link PaymentProfile} object using the set fields.
         * @return {@link PaymentProfile}
         */
        public PaymentProfile build() {
            return new PaymentProfile(id, vaultToken, gatewayHandle, customerVaultToken);
        }
    }
}
