/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling;

import io.apimatic.core.authentication.HeaderAuth;
import java.util.Collections;

/**
 * Utility class for authorization and token management.
 */
public class BasicAuthManager extends HeaderAuth implements BasicAuthCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private BasicAuthModel authModel;

    /**
     * Constructor.
     * @param authModel The data model instance for auth credentials.
     */
    public BasicAuthManager(BasicAuthModel authModel) {
        super(Collections.singletonMap("Authorization",
                ApiHelper.getBase64EncodedCredentials(
                        authModel.getUsername(),
                        authModel.getPassword())));
        this.authModel = authModel;
    }

    /**
     * String value for basicAuthUserName.
     * @return basicAuthUserName
     */
    public String getBasicAuthUserName() {
        return authModel.getUsername();
    }

    /**
     * String value for basicAuthPassword.
     * @return basicAuthPassword
     */
    public String getBasicAuthPassword() {
        return authModel.getPassword();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param basicAuthUserName String value for credentials.
     * @param basicAuthPassword String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String basicAuthUserName, String basicAuthPassword) {
        return basicAuthUserName.equals(getBasicAuthUserName())
                && basicAuthPassword.equals(getBasicAuthPassword());
    }

    /**
     * Converts this BasicAuthManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BasicAuthManager [" + "basicAuthUserName=" + getBasicAuthUserName()
                + ", basicAuthPassword=" + getBasicAuthPassword() + "]";
    }
    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "BasicAuth - " + errorMessage;
     }

    /**
    * A data class for BasicAuth credentials.
    */
    public static class BasicAuthModel {
        private String username;
        private String password;

        /**
        * A Constructor for BasicAuthModel.
        */
        public BasicAuthModel(String username, String password) {
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
        * A Builder class for BasicAuth credentials.
        */
        public static class Builder {
            private String username = "";
            private String password = "";

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
            * Builds the instance of BasicAuthModel.
            */
            public BasicAuthModel build() {
                return new BasicAuthModel(username, password);
            }
        }
    }
}
