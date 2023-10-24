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

    private String basicAuthUserName;

    private String basicAuthPassword;

    /**
     * Constructor.
     * @param username String value for username.
     * @param password String value for password.
     */
    public BasicAuthManager(String username, String password) {
        super(Collections.singletonMap("Authorization",
                ApiHelper.getBase64EncodedCredentials(username, password)));
        this.basicAuthUserName = username;
        this.basicAuthPassword = password;
    }

    /**
     * String value for basicAuthUserName.
     * @return basicAuthUserName
     */
    public String getBasicAuthUserName() {
        return basicAuthUserName;
    }

    /**
     * String value for basicAuthPassword.
     * @return basicAuthPassword
     */
    public String getBasicAuthPassword() {
        return basicAuthPassword;
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
        return "BasicAuthManager [" + "basicAuthUserName=" + basicAuthUserName
                + ", basicAuthPassword=" + basicAuthPassword + "]";
    }

}
