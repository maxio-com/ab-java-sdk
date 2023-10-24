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
import com.maxio.advancedbilling.models.PaymentCollectionMethod;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionPaymentCollectionMethod.SubscriptionPaymentCollectionMethodDeserializer.class)
public abstract class SubscriptionPaymentCollectionMethod {
    
    /**
     * This is Payment Collection Method case.
     * @param paymentCollectionMethod PaymentCollectionMethod value for paymentCollectionMethod.
     * @return The PaymentCollectionMethodCase object.
     */
    public static SubscriptionPaymentCollectionMethod fromPaymentCollectionMethod(
            PaymentCollectionMethod paymentCollectionMethod) {
        return paymentCollectionMethod == null ? null : new PaymentCollectionMethodCase(paymentCollectionMethod);
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
        R paymentCollectionMethod(PaymentCollectionMethod paymentCollectionMethod);
    }

    /**
     * This is a implementation class for PaymentCollectionMethodCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentCollectionMethod")
    private static class PaymentCollectionMethodCase extends SubscriptionPaymentCollectionMethod {

        @JsonValue
        private PaymentCollectionMethod paymentCollectionMethod;

        PaymentCollectionMethodCase(PaymentCollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentCollectionMethod(this.paymentCollectionMethod);
        }

        @JsonCreator
        private PaymentCollectionMethodCase(JsonNode jsonNode) throws IOException {
            this.paymentCollectionMethod = 
                PaymentCollectionMethod.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.paymentCollectionMethod == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return paymentCollectionMethod.toString();
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionPaymentCollectionMethod.
     */
    protected static class SubscriptionPaymentCollectionMethodDeserializer
            extends JsonDeserializer<SubscriptionPaymentCollectionMethod> {

        @Override
        public SubscriptionPaymentCollectionMethod deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    PaymentCollectionMethodCase.class), true);
        }
    }

}
