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
import com.maxio.advancedbilling.models.CancellationMethod;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionCancellationMethod.SubscriptionCancellationMethodDeserializer.class)
public abstract class SubscriptionCancellationMethod {
    
    /**
     * This is Cancellation Method case.
     * @param cancellationMethod CancellationMethod value for cancellationMethod.
     * @return The CancellationMethodCase object.
     */
    public static SubscriptionCancellationMethod fromCancellationMethod(
            CancellationMethod cancellationMethod) {
        return cancellationMethod == null ? null : new CancellationMethodCase(cancellationMethod);
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
        R cancellationMethod(CancellationMethod cancellationMethod);
    }

    /**
     * This is a implementation class for CancellationMethodCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CancellationMethod")
    private static class CancellationMethodCase extends SubscriptionCancellationMethod {

        @JsonValue
        private CancellationMethod cancellationMethod;

        CancellationMethodCase(CancellationMethod cancellationMethod) {
            this.cancellationMethod = cancellationMethod;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.cancellationMethod(this.cancellationMethod);
        }

        @JsonCreator
        private CancellationMethodCase(JsonNode jsonNode) throws IOException {
            this.cancellationMethod = 
                CancellationMethod.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.cancellationMethod == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return cancellationMethod.toString();
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionCancellationMethod.
     */
    protected static class SubscriptionCancellationMethodDeserializer
            extends JsonDeserializer<SubscriptionCancellationMethod> {

        @Override
        public SubscriptionCancellationMethod deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CancellationMethodCase.class), true);
        }
    }

}
