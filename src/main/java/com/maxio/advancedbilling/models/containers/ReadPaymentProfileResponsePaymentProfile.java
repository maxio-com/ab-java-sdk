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
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReadPaymentProfileResponsePaymentProfile.ReadPaymentProfileResponsePaymentProfileDeserializer.class)
public abstract class ReadPaymentProfileResponsePaymentProfile {
    
    /**
     * This is Bank Account Payment Profile case.
     * @param bankAccountPaymentProfile BankAccountPaymentProfile value for bankAccountPaymentProfile.
     * @return The BankAccountPaymentProfileCase object.
     */
    public static ReadPaymentProfileResponsePaymentProfile fromBankAccountPaymentProfile(
            BankAccountPaymentProfile bankAccountPaymentProfile) {
        return bankAccountPaymentProfile == null ? null : new BankAccountPaymentProfileCase(bankAccountPaymentProfile);
    }

    /**
     * This is Credit Card Payment Profile case.
     * @param creditCardPaymentProfile CreditCardPaymentProfile value for creditCardPaymentProfile.
     * @return The CreditCardPaymentProfileCase object.
     */
    public static ReadPaymentProfileResponsePaymentProfile fromCreditCardPaymentProfile(
            CreditCardPaymentProfile creditCardPaymentProfile) {
        return creditCardPaymentProfile == null ? null : new CreditCardPaymentProfileCase(creditCardPaymentProfile);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R bankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile);

        R creditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile);
    }

    /**
     * This is a implementation class for BankAccountPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BankAccountPaymentProfile")
    private static class BankAccountPaymentProfileCase extends ReadPaymentProfileResponsePaymentProfile {

        @JsonValue
        private BankAccountPaymentProfile bankAccountPaymentProfile;

        BankAccountPaymentProfileCase(BankAccountPaymentProfile bankAccountPaymentProfile) {
            this.bankAccountPaymentProfile = bankAccountPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.bankAccountPaymentProfile(this.bankAccountPaymentProfile);
        }

        @JsonCreator
        private BankAccountPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.bankAccountPaymentProfile = ApiHelper.deserialize(jsonNode,
                BankAccountPaymentProfile.class);
        }

        @Override
        public String toString() {
            return bankAccountPaymentProfile.toString();
        }
    }

    /**
     * This is a implementation class for CreditCardPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreditCardPaymentProfile")
    private static class CreditCardPaymentProfileCase extends ReadPaymentProfileResponsePaymentProfile {

        @JsonValue
        private CreditCardPaymentProfile creditCardPaymentProfile;

        CreditCardPaymentProfileCase(CreditCardPaymentProfile creditCardPaymentProfile) {
            this.creditCardPaymentProfile = creditCardPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.creditCardPaymentProfile(this.creditCardPaymentProfile);
        }

        @JsonCreator
        private CreditCardPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.creditCardPaymentProfile = ApiHelper.deserialize(jsonNode,
                CreditCardPaymentProfile.class);
        }

        @Override
        public String toString() {
            return creditCardPaymentProfile.toString();
        }
    }

    /**
     * This is a custom deserializer class for ReadPaymentProfileResponsePaymentProfile.
     */
    protected static class ReadPaymentProfileResponsePaymentProfileDeserializer
            extends JsonDeserializer<ReadPaymentProfileResponsePaymentProfile> {

        @Override
        public ReadPaymentProfileResponsePaymentProfile deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(BankAccountPaymentProfileCase.class,
                    CreditCardPaymentProfileCase.class), true);
        }
    }

}
