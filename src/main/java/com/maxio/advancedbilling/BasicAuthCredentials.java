/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling;

/**
 * Interface for defining the behavior of Basic Authentication.
 */
public interface BasicAuthCredentials {

    /**
     * String value for basicAuthUserName.
     * @return basicAuthUserName
     */
    String getBasicAuthUserName();

    /**
     * String value for basicAuthPassword.
     * @return basicAuthPassword
     */
    String getBasicAuthPassword();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param basicAuthUserName String value for credentials.
     * @param basicAuthPassword String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String basicAuthUserName, String basicAuthPassword);
}