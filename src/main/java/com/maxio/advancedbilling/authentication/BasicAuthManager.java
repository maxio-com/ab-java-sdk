/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.authentication;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.BasicAuthCredentials;
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

}
