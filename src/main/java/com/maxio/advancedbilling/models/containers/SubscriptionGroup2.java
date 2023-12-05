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
import com.maxio.advancedbilling.models.NestedSubscriptionGroup;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionGroup2.SubscriptionGroup2Deserializer.class)
public abstract class SubscriptionGroup2 {
    
    /**
     * This is Nested Subscription Group case.
     * @param nestedSubscriptionGroup NestedSubscriptionGroup value for nestedSubscriptionGroup.
     * @return The NestedSubscriptionGroupCase object.
     */
    public static SubscriptionGroup2 fromNestedSubscriptionGroup(
            NestedSubscriptionGroup nestedSubscriptionGroup) {
        return nestedSubscriptionGroup == null ? null : new NestedSubscriptionGroupCase(nestedSubscriptionGroup);
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
        R nestedSubscriptionGroup(NestedSubscriptionGroup nestedSubscriptionGroup);
    }

    /**
     * This is a implementation class for NestedSubscriptionGroupCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "NestedSubscriptionGroup")
    private static class NestedSubscriptionGroupCase extends SubscriptionGroup2 {

        @JsonValue
        private NestedSubscriptionGroup nestedSubscriptionGroup;

        NestedSubscriptionGroupCase(NestedSubscriptionGroup nestedSubscriptionGroup) {
            this.nestedSubscriptionGroup = nestedSubscriptionGroup;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.nestedSubscriptionGroup(this.nestedSubscriptionGroup);
        }

        @JsonCreator
        private NestedSubscriptionGroupCase(JsonNode jsonNode) throws IOException {
            this.nestedSubscriptionGroup = ApiHelper.deserialize(jsonNode,
                NestedSubscriptionGroup.class);
        }

        @Override
        public String toString() {
            return nestedSubscriptionGroup.toString();
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
                    NestedSubscriptionGroupCase.class), true);
        }
    }

}
