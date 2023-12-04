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
import com.maxio.advancedbilling.models.SubscriptionGroupInlined;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionGroup2.SubscriptionGroup2Deserializer.class)
public abstract class SubscriptionGroup2 {
    
    /**
     * This is Subscription Group Inlined case.
     * @param subscriptionGroupInlined SubscriptionGroupInlined value for subscriptionGroupInlined.
     * @return The SubscriptionGroupInlinedCase object.
     */
    public static SubscriptionGroup2 fromSubscriptionGroupInlined(
            SubscriptionGroupInlined subscriptionGroupInlined) {
        return subscriptionGroupInlined == null ? null : new SubscriptionGroupInlinedCase(subscriptionGroupInlined);
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
        R subscriptionGroupInlined(SubscriptionGroupInlined subscriptionGroupInlined);
    }

    /**
     * This is a implementation class for SubscriptionGroupInlinedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionGroupInlined")
    private static class SubscriptionGroupInlinedCase extends SubscriptionGroup2 {

        @JsonValue
        private SubscriptionGroupInlined subscriptionGroupInlined;

        SubscriptionGroupInlinedCase(SubscriptionGroupInlined subscriptionGroupInlined) {
            this.subscriptionGroupInlined = subscriptionGroupInlined;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionGroupInlined(this.subscriptionGroupInlined);
        }

        @JsonCreator
        private SubscriptionGroupInlinedCase(JsonNode jsonNode) throws IOException {
            this.subscriptionGroupInlined = ApiHelper.deserialize(jsonNode,
                SubscriptionGroupInlined.class);
        }

        @Override
        public String toString() {
            return subscriptionGroupInlined.toString();
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionGroup2.
     */
    protected static class SubscriptionGroup2Deserializer
            extends JsonDeserializer<SubscriptionGroup2> {

        @Override
        public SubscriptionGroup2 deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    SubscriptionGroupInlinedCase.class), true);
        }
    }

}
