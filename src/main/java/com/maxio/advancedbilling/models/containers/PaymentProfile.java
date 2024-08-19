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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.ApplePayPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.PaypalPaymentProfile;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = PaymentProfile.PaymentProfileDeserializer.class)
public abstract class PaymentProfile {
    
    /**
     * This is ApplePay Payment Profile case.
     * @param applePayPaymentProfile ApplePayPaymentProfile value for applePayPaymentProfile.
     * @return The ApplePayPaymentProfileCase object.
     */
    public static PaymentProfile fromApplePayPaymentProfile(
            ApplePayPaymentProfile applePayPaymentProfile) {
        return applePayPaymentProfile == null ? null : new ApplePayPaymentProfileCase(applePayPaymentProfile);
    }

    /**
     * This is Bank Account Payment Profile case.
     * @param bankAccountPaymentProfile BankAccountPaymentProfile value for bankAccountPaymentProfile.
     * @return The BankAccountPaymentProfileCase object.
     */
    public static PaymentProfile fromBankAccountPaymentProfile(
            BankAccountPaymentProfile bankAccountPaymentProfile) {
        return bankAccountPaymentProfile == null ? null : new BankAccountPaymentProfileCase(bankAccountPaymentProfile);
    }

    /**
     * This is Credit Card Payment Profile case.
     * @param creditCardPaymentProfile CreditCardPaymentProfile value for creditCardPaymentProfile.
     * @return The CreditCardPaymentProfileCase object.
     */
    public static PaymentProfile fromCreditCardPaymentProfile(
            CreditCardPaymentProfile creditCardPaymentProfile) {
        return creditCardPaymentProfile == null ? null : new CreditCardPaymentProfileCase(creditCardPaymentProfile);
    }

    /**
     * This is Paypal Payment Profile case.
     * @param paypalPaymentProfile PaypalPaymentProfile value for paypalPaymentProfile.
     * @return The PaypalPaymentProfileCase object.
     */
    public static PaymentProfile fromPaypalPaymentProfile(
            PaypalPaymentProfile paypalPaymentProfile) {
        return paypalPaymentProfile == null ? null : new PaypalPaymentProfileCase(paypalPaymentProfile);
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
        R applePayPaymentProfile(ApplePayPaymentProfile applePayPaymentProfile);

        R bankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile);

        R creditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile);

        R paypalPaymentProfile(PaypalPaymentProfile paypalPaymentProfile);
    }

    /**
     * This is a implementation class for ApplePayPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplePayPaymentProfile")
    private static class ApplePayPaymentProfileCase extends PaymentProfile {

        @JsonValue
        private ApplePayPaymentProfile applePayPaymentProfile;

        ApplePayPaymentProfileCase(ApplePayPaymentProfile applePayPaymentProfile) {
            this.applePayPaymentProfile = applePayPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applePayPaymentProfile(this.applePayPaymentProfile);
        }

        @JsonCreator
        private ApplePayPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.applePayPaymentProfile = ApiHelper.deserialize(jsonNode,
                ApplePayPaymentProfile.class);
        }

        @Override
        public String toString() {
            return applePayPaymentProfile.toString();
        }
    }

    /**
     * This is a implementation class for BankAccountPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BankAccountPaymentProfile")
    private static class BankAccountPaymentProfileCase extends PaymentProfile {

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
    private static class CreditCardPaymentProfileCase extends PaymentProfile {

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
     * This is a implementation class for PaypalPaymentProfileCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaypalPaymentProfile")
    private static class PaypalPaymentProfileCase extends PaymentProfile {

        @JsonValue
        private PaypalPaymentProfile paypalPaymentProfile;

        PaypalPaymentProfileCase(PaypalPaymentProfile paypalPaymentProfile) {
            this.paypalPaymentProfile = paypalPaymentProfile;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paypalPaymentProfile(this.paypalPaymentProfile);
        }

        @JsonCreator
        private PaypalPaymentProfileCase(JsonNode jsonNode) throws IOException {
            this.paypalPaymentProfile = ApiHelper.deserialize(jsonNode,
                PaypalPaymentProfile.class);
        }

        @Override
        public String toString() {
            return paypalPaymentProfile.toString();
        }
    }

    /**
     * This is a custom deserializer class for PaymentProfile.
     */
    protected static class PaymentProfileDeserializer
            extends JsonDeserializer<PaymentProfile> {

        private String discriminator = "payment_type";
        private List<Map<String, Class<? extends PaymentProfile>>> registry =
                Arrays.asList(
                        Collections.singletonMap("apple_pay", ApplePayPaymentProfileCase.class),
                        Collections.singletonMap("bank_account", BankAccountPaymentProfileCase.class),
                        Collections.singletonMap("credit_card", CreditCardPaymentProfileCase.class),
                        Collections.singletonMap("paypal_account", PaypalPaymentProfileCase.class));

        @Override
        public PaymentProfile deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, false);
        }
    }

}
