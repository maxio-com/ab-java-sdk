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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionPrepaidDunning.SubscriptionPrepaidDunningDeserializer.class)
public abstract class SubscriptionPrepaidDunning {
    
    /**
     * This is Boolean case.
     * @param mBoolean boolean value for mBoolean.
     * @return The MBooleanCase object.
     */
    public static SubscriptionPrepaidDunning fromMBoolean(boolean mBoolean) {
        return new MBooleanCase(mBoolean);
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
        R mBoolean(boolean mBoolean);
    }

    /**
     * This is a implementation class for MBooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "boolean")
    private static class MBooleanCase extends SubscriptionPrepaidDunning {

        @JsonValue
        private boolean mBoolean;

        MBooleanCase(boolean mBoolean) {
            this.mBoolean = mBoolean;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mBoolean(this.mBoolean);
        }

        @JsonCreator
        private MBooleanCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isBoolean()) {
                this.mBoolean = ApiHelper.deserialize(jsonNode, Boolean.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mBoolean);
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionPrepaidDunning.
     */
    protected static class SubscriptionPrepaidDunningDeserializer
            extends JsonDeserializer<SubscriptionPrepaidDunning> {

        @Override
        public SubscriptionPrepaidDunning deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MBooleanCase.class), true);
        }
    }

}
