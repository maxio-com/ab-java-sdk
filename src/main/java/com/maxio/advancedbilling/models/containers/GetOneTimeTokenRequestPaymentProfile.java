/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.GetOneTimeTokenBankAccountPaymentProfile;
import com.maxio.advancedbilling.models.GetOneTimeTokenPaymentProfile;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = GetOneTimeTokenRequestPaymentProfile.GetOneTimeTokenRequestPaymentProfileDeserializer.class)
public abstract class GetOneTimeTokenRequestPaymentProfile {
    
    /**
     * This is Get One Time Token Payment Profile case.
     * @param getOneTimeTokenPaymentProfile GetOneTimeTokenPaymentProfile value for getOneTimeTokenPaymentProfile.
     * @return The GetOneTimeTokenPaymentProfileCase object.
     */
    public static GetOneTimeTokenRequestPaymentProfile fromGetOneTimeTokenPaymentProfile(
            GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile) {
        return getOneTimeTokenPaymentProfile == null ? null : new GetOneTimeTokenPaymentProfileCase(getOneTimeTokenPaymentProfile);
    }

    /**
     * This is Get One Time Token Bank Account Payment Profile case.
     * @param getOneTimeTokenBankAccountPaymentProfile GetOneTimeTokenBankAccountPaymentProfile value for getOneTimeTokenBankAccountPaymentProfile.
     * @return The GetOneTimeTokenBankAccountPaymentProfileCase object.
     */
    public static GetOneTimeTokenRequestPaymentProfile fromGetOneTimeTokenBankAccountPaymentProfile(
            GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile) {
        return getOneTimeTokenBankAccountPaymentProfile == null ? null : new GetOneTimeTokenBankAccountPaymentProfileCase(getOneTimeTokenBankAccountPaymentProfile);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R getOneTimeTokenPaymentProfile(GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile);

        R getOneTimeTokenBankAccountPaymentProfile(GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile);
    }

    /**
     * This is a implementation class for GetOneTimeTokenPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GetOneTimeTokenPaymentProfile")
    private static class GetOneTimeTokenPaymentProfileCase extends GetOneTimeTokenRequestPaymentProfile {

        @JsonValue
        private GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile;

        GetOneTimeTokenPaymentProfileCase(GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile) {
            this.getOneTimeTokenPaymentProfile = getOneTimeTokenPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.getOneTimeTokenPaymentProfile(this.getOneTimeTokenPaymentProfile);
        }

        @JsonCreator
        private GetOneTimeTokenPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.getOneTimeTokenPaymentProfile = ApiHelper.deserialize(jsonNode,
                GetOneTimeTokenPaymentProfile.class);
        }

        @Override
        public String toString() {
            return getOneTimeTokenPaymentProfile.toString();
        }
    }

    /**
     * This is a implementation class for GetOneTimeTokenBankAccountPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GetOneTimeTokenBankAccountPaymentProfile")
    private static class GetOneTimeTokenBankAccountPaymentProfileCase extends GetOneTimeTokenRequestPaymentProfile {

        @JsonValue
        private GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile;

        GetOneTimeTokenBankAccountPaymentProfileCase(GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile) {
            this.getOneTimeTokenBankAccountPaymentProfile = getOneTimeTokenBankAccountPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.getOneTimeTokenBankAccountPaymentProfile(this.getOneTimeTokenBankAccountPaymentProfile);
        }

        @JsonCreator
        private GetOneTimeTokenBankAccountPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.getOneTimeTokenBankAccountPaymentProfile = ApiHelper.deserialize(jsonNode,
                GetOneTimeTokenBankAccountPaymentProfile.class);
        }

        @Override
        public String toString() {
            return getOneTimeTokenBankAccountPaymentProfile.toString();
        }
    }

    /**
     * This is a custom deserializer class for GetOneTimeTokenRequestPaymentProfile.
     */
    protected static class GetOneTimeTokenRequestPaymentProfileDeserializer
            extends JsonDeserializer<GetOneTimeTokenRequestPaymentProfile> {

        @Override
        public GetOneTimeTokenRequestPaymentProfile deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    GetOneTimeTokenPaymentProfileCase.class,
                    GetOneTimeTokenBankAccountPaymentProfileCase.class), false);
        }
    }

}
