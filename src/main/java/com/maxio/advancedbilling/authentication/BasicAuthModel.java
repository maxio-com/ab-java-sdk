/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.authentication;

/**
 * A data class for Basic Authentication credentials.
 */
public class BasicAuthModel {
    private String username;
    private String password;

    /**
     * A Constructor for BasicAuthModel.
     */
    private BasicAuthModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Getter for username.
     * @return username The value of Username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Getter for password.
     * @return password The value of Password.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Builds a new {@link BasicAuthModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link BasicAuthModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getUsername(), getPassword());
    }

    /**
     * A Builder class for Basic Authentication credentials.
     */
    public static class Builder {
        private String username;
        private String password;

        /**
         * The constructor with required auth credentials.
         * @param username The value of Username.
         * @param password The value of Password.
         */
        public Builder(String username, String password) {
            if (username == null) {
                throw new NullPointerException("Username cannot be null.");
            }

            if (password == null) {
                throw new NullPointerException("Password cannot be null.");
            }

            this.username = username;
            this.password = password;
        }

        /**
         * Setter for username.
         * @param username The value of Username.
         * @return Builder The current instance of Builder.
         */
        public Builder username(String username) {
            if (username == null) {
                throw new NullPointerException("Username cannot be null.");
            }

            this.username = username;
            return this;
        }

        /**
         * Setter for password.
         * @param password The value of Password.
         * @return Builder The current instance of Builder.
         */
        public Builder password(String password) {
            if (password == null) {
                throw new NullPointerException("Password cannot be null.");
            }

            this.password = password;
            return this;
        }

        /**
         * Builds the instance of BasicAuthModel using the provided credentials.
         * @return The instance of BasicAuthModel.
         */
        public BasicAuthModel build() {
            return new BasicAuthModel(username, password);
        }
    }
}