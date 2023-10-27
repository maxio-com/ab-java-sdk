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
import com.maxio.advancedbilling.models.PaymentMethodApplePayType;
import com.maxio.advancedbilling.models.PaymentMethodBankAccountType;
import com.maxio.advancedbilling.models.PaymentMethodCreditCardType;
import com.maxio.advancedbilling.models.PaymentMethodExternalType;
import com.maxio.advancedbilling.models.PaymentMethodPaypalType;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = InvoiceEvent1PaymentMethod.InvoiceEvent1PaymentMethodDeserializer.class)
public abstract class InvoiceEvent1PaymentMethod {
    
    /**
     * This is Payment Method Apple Pay Type case.
     * @param paymentMethodApplePayType PaymentMethodApplePayType value for paymentMethodApplePayType.
     * @return The PaymentMethodApplePayTypeCase object.
     */
    public static InvoiceEvent1PaymentMethod fromPaymentMethodApplePayType(
            PaymentMethodApplePayType paymentMethodApplePayType) {
        return paymentMethodApplePayType == null ? null : new PaymentMethodApplePayTypeCase(paymentMethodApplePayType);
    }

    /**
     * This is Payment Method Bank Account Type case.
     * @param paymentMethodBankAccountType PaymentMethodBankAccountType value for paymentMethodBankAccountType.
     * @return The PaymentMethodBankAccountTypeCase object.
     */
    public static InvoiceEvent1PaymentMethod fromPaymentMethodBankAccountType(
            PaymentMethodBankAccountType paymentMethodBankAccountType) {
        return paymentMethodBankAccountType == null ? null : new PaymentMethodBankAccountTypeCase(paymentMethodBankAccountType);
    }

    /**
     * This is Payment Method Credit Card Type case.
     * @param paymentMethodCreditCardType PaymentMethodCreditCardType value for paymentMethodCreditCardType.
     * @return The PaymentMethodCreditCardTypeCase object.
     */
    public static InvoiceEvent1PaymentMethod fromPaymentMethodCreditCardType(
            PaymentMethodCreditCardType paymentMethodCreditCardType) {
        return paymentMethodCreditCardType == null ? null : new PaymentMethodCreditCardTypeCase(paymentMethodCreditCardType);
    }

    /**
     * This is Payment Method External Type case.
     * @param paymentMethodExternalType PaymentMethodExternalType value for paymentMethodExternalType.
     * @return The PaymentMethodExternalTypeCase object.
     */
    public static InvoiceEvent1PaymentMethod fromPaymentMethodExternalType(
            PaymentMethodExternalType paymentMethodExternalType) {
        return paymentMethodExternalType == null ? null : new PaymentMethodExternalTypeCase(paymentMethodExternalType);
    }

    /**
     * This is Payment Method Paypal Type case.
     * @param paymentMethodPaypalType PaymentMethodPaypalType value for paymentMethodPaypalType.
     * @return The PaymentMethodPaypalTypeCase object.
     */
    public static InvoiceEvent1PaymentMethod fromPaymentMethodPaypalType(
            PaymentMethodPaypalType paymentMethodPaypalType) {
        return paymentMethodPaypalType == null ? null : new PaymentMethodPaypalTypeCase(paymentMethodPaypalType);
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
        R paymentMethodApplePayType(PaymentMethodApplePayType paymentMethodApplePayType);

        R paymentMethodBankAccountType(PaymentMethodBankAccountType paymentMethodBankAccountType);

        R paymentMethodCreditCardType(PaymentMethodCreditCardType paymentMethodCreditCardType);

        R paymentMethodExternalType(PaymentMethodExternalType paymentMethodExternalType);

        R paymentMethodPaypalType(PaymentMethodPaypalType paymentMethodPaypalType);
    }

    /**
     * This is a implementation class for PaymentMethodApplePayTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodApplePayType")
    private static class PaymentMethodApplePayTypeCase extends InvoiceEvent1PaymentMethod {

        @JsonValue
        private PaymentMethodApplePayType paymentMethodApplePayType;

        PaymentMethodApplePayTypeCase(PaymentMethodApplePayType paymentMethodApplePayType) {
            this.paymentMethodApplePayType = paymentMethodApplePayType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodApplePayType(this.paymentMethodApplePayType);
        }

        @JsonCreator
        private PaymentMethodApplePayTypeCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodApplePayType = ApiHelper.deserialize(jsonNode,
                PaymentMethodApplePayType.class);
        }

        @Override
        public String toString() {
            return paymentMethodApplePayType.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodBankAccountTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodBankAccountType")
    private static class PaymentMethodBankAccountTypeCase extends InvoiceEvent1PaymentMethod {

        @JsonValue
        private PaymentMethodBankAccountType paymentMethodBankAccountType;

        PaymentMethodBankAccountTypeCase(PaymentMethodBankAccountType paymentMethodBankAccountType) {
            this.paymentMethodBankAccountType = paymentMethodBankAccountType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodBankAccountType(this.paymentMethodBankAccountType);
        }

        @JsonCreator
        private PaymentMethodBankAccountTypeCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodBankAccountType = ApiHelper.deserialize(jsonNode,
                PaymentMethodBankAccountType.class);
        }

        @Override
        public String toString() {
            return paymentMethodBankAccountType.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodCreditCardTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodCreditCardType")
    private static class PaymentMethodCreditCardTypeCase extends InvoiceEvent1PaymentMethod {

        @JsonValue
        private PaymentMethodCreditCardType paymentMethodCreditCardType;

        PaymentMethodCreditCardTypeCase(PaymentMethodCreditCardType paymentMethodCreditCardType) {
            this.paymentMethodCreditCardType = paymentMethodCreditCardType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodCreditCardType(this.paymentMethodCreditCardType);
        }

        @JsonCreator
        private PaymentMethodCreditCardTypeCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodCreditCardType = ApiHelper.deserialize(jsonNode,
                PaymentMethodCreditCardType.class);
        }

        @Override
        public String toString() {
            return paymentMethodCreditCardType.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodExternalTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodExternalType")
    private static class PaymentMethodExternalTypeCase extends InvoiceEvent1PaymentMethod {

        @JsonValue
        private PaymentMethodExternalType paymentMethodExternalType;

        PaymentMethodExternalTypeCase(PaymentMethodExternalType paymentMethodExternalType) {
            this.paymentMethodExternalType = paymentMethodExternalType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodExternalType(this.paymentMethodExternalType);
        }

        @JsonCreator
        private PaymentMethodExternalTypeCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodExternalType = ApiHelper.deserialize(jsonNode,
                PaymentMethodExternalType.class);
        }

        @Override
        public String toString() {
            return paymentMethodExternalType.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodPaypalTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodPaypalType")
    private static class PaymentMethodPaypalTypeCase extends InvoiceEvent1PaymentMethod {

        @JsonValue
        private PaymentMethodPaypalType paymentMethodPaypalType;

        PaymentMethodPaypalTypeCase(PaymentMethodPaypalType paymentMethodPaypalType) {
            this.paymentMethodPaypalType = paymentMethodPaypalType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodPaypalType(this.paymentMethodPaypalType);
        }

        @JsonCreator
        private PaymentMethodPaypalTypeCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodPaypalType = ApiHelper.deserialize(jsonNode,
                PaymentMethodPaypalType.class);
        }

        @Override
        public String toString() {
            return paymentMethodPaypalType.toString();
        }
    }

    /**
     * This is a custom deserializer class for InvoiceEvent1PaymentMethod.
     */
    protected static class InvoiceEvent1PaymentMethodDeserializer
            extends JsonDeserializer<InvoiceEvent1PaymentMethod> {

        @Override
        public InvoiceEvent1PaymentMethod deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PaymentMethodApplePayTypeCase.class,
                    PaymentMethodBankAccountTypeCase.class, PaymentMethodCreditCardTypeCase.class,
                    PaymentMethodExternalTypeCase.class, PaymentMethodPaypalTypeCase.class), true);
        }
    }

}
