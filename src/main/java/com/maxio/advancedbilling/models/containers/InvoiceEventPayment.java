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
import com.maxio.advancedbilling.models.PaymentMethodApplePay;
import com.maxio.advancedbilling.models.PaymentMethodBankAccount;
import com.maxio.advancedbilling.models.PaymentMethodCreditCard;
import com.maxio.advancedbilling.models.PaymentMethodExternal;
import com.maxio.advancedbilling.models.PaymentMethodPaypal;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InvoiceEventPayment.InvoiceEventPaymentDeserializer.class)
public abstract class InvoiceEventPayment {
    
    /**
     * This is Payment Method Apple Pay case.
     * @param paymentMethodApplePay PaymentMethodApplePay value for paymentMethodApplePay.
     * @return The PaymentMethodApplePayCase object.
     */
    public static InvoiceEventPayment fromPaymentMethodApplePay(
            PaymentMethodApplePay paymentMethodApplePay) {
        return paymentMethodApplePay == null ? null : new PaymentMethodApplePayCase(paymentMethodApplePay);
    }

    /**
     * This is Payment Method Bank Account case.
     * @param paymentMethodBankAccount PaymentMethodBankAccount value for paymentMethodBankAccount.
     * @return The PaymentMethodBankAccountCase object.
     */
    public static InvoiceEventPayment fromPaymentMethodBankAccount(
            PaymentMethodBankAccount paymentMethodBankAccount) {
        return paymentMethodBankAccount == null ? null : new PaymentMethodBankAccountCase(paymentMethodBankAccount);
    }

    /**
     * This is Payment Method Credit Card case.
     * @param paymentMethodCreditCard PaymentMethodCreditCard value for paymentMethodCreditCard.
     * @return The PaymentMethodCreditCardCase object.
     */
    public static InvoiceEventPayment fromPaymentMethodCreditCard(
            PaymentMethodCreditCard paymentMethodCreditCard) {
        return paymentMethodCreditCard == null ? null : new PaymentMethodCreditCardCase(paymentMethodCreditCard);
    }

    /**
     * This is Payment Method External case.
     * @param paymentMethodExternal PaymentMethodExternal value for paymentMethodExternal.
     * @return The PaymentMethodExternalCase object.
     */
    public static InvoiceEventPayment fromPaymentMethodExternal(
            PaymentMethodExternal paymentMethodExternal) {
        return paymentMethodExternal == null ? null : new PaymentMethodExternalCase(paymentMethodExternal);
    }

    /**
     * This is Payment Method Paypal case.
     * @param paymentMethodPaypal PaymentMethodPaypal value for paymentMethodPaypal.
     * @return The PaymentMethodPaypalCase object.
     */
    public static InvoiceEventPayment fromPaymentMethodPaypal(
            PaymentMethodPaypal paymentMethodPaypal) {
        return paymentMethodPaypal == null ? null : new PaymentMethodPaypalCase(paymentMethodPaypal);
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
        R paymentMethodApplePay(PaymentMethodApplePay paymentMethodApplePay);

        R paymentMethodBankAccount(PaymentMethodBankAccount paymentMethodBankAccount);

        R paymentMethodCreditCard(PaymentMethodCreditCard paymentMethodCreditCard);

        R paymentMethodExternal(PaymentMethodExternal paymentMethodExternal);

        R paymentMethodPaypal(PaymentMethodPaypal paymentMethodPaypal);
    }

    /**
     * This is a implementation class for PaymentMethodApplePayCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodApplePay")
    private static class PaymentMethodApplePayCase extends InvoiceEventPayment {

        @JsonValue
        private PaymentMethodApplePay paymentMethodApplePay;

        PaymentMethodApplePayCase(PaymentMethodApplePay paymentMethodApplePay) {
            this.paymentMethodApplePay = paymentMethodApplePay;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodApplePay(this.paymentMethodApplePay);
        }

        @JsonCreator
        private PaymentMethodApplePayCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodApplePay = ApiHelper.deserialize(jsonNode,
                PaymentMethodApplePay.class);
        }

        @Override
        public String toString() {
            return paymentMethodApplePay.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodBankAccountCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodBankAccount")
    private static class PaymentMethodBankAccountCase extends InvoiceEventPayment {

        @JsonValue
        private PaymentMethodBankAccount paymentMethodBankAccount;

        PaymentMethodBankAccountCase(PaymentMethodBankAccount paymentMethodBankAccount) {
            this.paymentMethodBankAccount = paymentMethodBankAccount;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodBankAccount(this.paymentMethodBankAccount);
        }

        @JsonCreator
        private PaymentMethodBankAccountCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodBankAccount = ApiHelper.deserialize(jsonNode,
                PaymentMethodBankAccount.class);
        }

        @Override
        public String toString() {
            return paymentMethodBankAccount.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodCreditCardCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodCreditCard")
    private static class PaymentMethodCreditCardCase extends InvoiceEventPayment {

        @JsonValue
        private PaymentMethodCreditCard paymentMethodCreditCard;

        PaymentMethodCreditCardCase(PaymentMethodCreditCard paymentMethodCreditCard) {
            this.paymentMethodCreditCard = paymentMethodCreditCard;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodCreditCard(this.paymentMethodCreditCard);
        }

        @JsonCreator
        private PaymentMethodCreditCardCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodCreditCard = ApiHelper.deserialize(jsonNode,
                PaymentMethodCreditCard.class);
        }

        @Override
        public String toString() {
            return paymentMethodCreditCard.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodExternalCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodExternal")
    private static class PaymentMethodExternalCase extends InvoiceEventPayment {

        @JsonValue
        private PaymentMethodExternal paymentMethodExternal;

        PaymentMethodExternalCase(PaymentMethodExternal paymentMethodExternal) {
            this.paymentMethodExternal = paymentMethodExternal;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodExternal(this.paymentMethodExternal);
        }

        @JsonCreator
        private PaymentMethodExternalCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodExternal = ApiHelper.deserialize(jsonNode,
                PaymentMethodExternal.class);
        }

        @Override
        public String toString() {
            return paymentMethodExternal.toString();
        }
    }

    /**
     * This is a implementation class for PaymentMethodPaypalCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentMethodPaypal")
    private static class PaymentMethodPaypalCase extends InvoiceEventPayment {

        @JsonValue
        private PaymentMethodPaypal paymentMethodPaypal;

        PaymentMethodPaypalCase(PaymentMethodPaypal paymentMethodPaypal) {
            this.paymentMethodPaypal = paymentMethodPaypal;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentMethodPaypal(this.paymentMethodPaypal);
        }

        @JsonCreator
        private PaymentMethodPaypalCase(JsonNode jsonNode) throws IOException {
            this.paymentMethodPaypal = ApiHelper.deserialize(jsonNode,
                PaymentMethodPaypal.class);
        }

        @Override
        public String toString() {
            return paymentMethodPaypal.toString();
        }
    }

    /**
     * This is a custom deserializer class for InvoiceEventPayment.
     */
    protected static class InvoiceEventPaymentDeserializer
            extends JsonDeserializer<InvoiceEventPayment> {

        private String discriminator = "type";
        private List<Map<String, Class<? extends InvoiceEventPayment>>> registry =
                Arrays.asList(
                        Collections.singletonMap("apple_pay", PaymentMethodApplePayCase.class),
                        Collections.singletonMap("bank_account", PaymentMethodBankAccountCase.class),
                        Collections.singletonMap("credit_card", PaymentMethodCreditCardCase.class),
                        Collections.singletonMap("external", PaymentMethodExternalCase.class),
                        Collections.singletonMap("paypal_account", PaymentMethodPaypalCase.class));

        @Override
        public InvoiceEventPayment deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, false);
        }
    }

}
