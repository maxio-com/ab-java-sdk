/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ActiveWallets type.
 */
public class ActiveWallets
        extends BaseModel {
    private int total;
    private List<WalletProductActiveWallet> sample;

    /**
     * Default constructor.
     */
    public ActiveWallets() {
    }

    /**
     * Initialization constructor.
     * @param  total  int value for total.
     * @param  sample  List of WalletProductActiveWallet value for sample.
     */
    public ActiveWallets(
            int total,
            List<WalletProductActiveWallet> sample) {
        this.total = total;
        this.sample = sample;
    }

    /**
     * Getter for Total.
     * Total count of active wallets drawing on this product.
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * Total count of active wallets drawing on this product.
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for Sample.
     * Up to 50 of the most recently created active wallets, newest first.
     * @return Returns the List of WalletProductActiveWallet
     */
    @JsonGetter("sample")
    public List<WalletProductActiveWallet> getSample() {
        return sample;
    }

    /**
     * Setter for Sample.
     * Up to 50 of the most recently created active wallets, newest first.
     * @param sample Value for List of WalletProductActiveWallet
     */
    @JsonSetter("sample")
    public void setSample(List<WalletProductActiveWallet> sample) {
        this.sample = sample;
    }

    /**
     * Converts this ActiveWallets into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActiveWallets [" + "total=" + total + ", sample=" + sample
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ActiveWallets.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActiveWallets.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(total, sample);
        return builder;
    }

    /**
     * Class to build instances of {@link ActiveWallets}.
     */
    public static class Builder {
        private int total;
        private List<WalletProductActiveWallet> sample;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  total  int value for total.
         * @param  sample  List of WalletProductActiveWallet value for sample.
         */
        public Builder(int total, List<WalletProductActiveWallet> sample) {
            this.total = total;
            this.sample = sample;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for sample.
         * @param  sample  List of WalletProductActiveWallet value for sample.
         * @return Builder
         */
        public Builder sample(List<WalletProductActiveWallet> sample) {
            this.sample = sample;
            return this;
        }

        /**
         * Builds a new {@link ActiveWallets} object using the set fields.
         * @return {@link ActiveWallets}
         */
        public ActiveWallets build() {
            return new ActiveWallets(total, sample);
        }
    }
}
