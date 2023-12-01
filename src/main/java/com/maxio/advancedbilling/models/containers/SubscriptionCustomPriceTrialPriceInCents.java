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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionCustomPriceTrialPriceInCents.SubscriptionCustomPriceTrialPriceInCentsDeserializer.class)
public abstract class SubscriptionCustomPriceTrialPriceInCents {
    
    /**
     * This is String case.
     * @param string String value for string.
     * @return The StringCase object.
     */
    public static SubscriptionCustomPriceTrialPriceInCents fromString(String string) {
        return string == null ? null : new StringCase(string);
    }

    /**
     * This is Long case.
     * @param mLong long value for mLong.
     * @return The LongCase object.
     */
    public static SubscriptionCustomPriceTrialPriceInCents fromLong(long mLong) {
        return new LongCase(mLong);
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
        R string(String string);

        R mLong(long mLong);
    }

    /**
     * This is a implementation class for StringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class StringCase extends SubscriptionCustomPriceTrialPriceInCents {

        @JsonValue
        private String string;

        StringCase(String string) {
            this.string = string;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.string(this.string);
        }

        @JsonCreator
        private StringCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.string = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return string.toString();
        }
    }

    /**
     * This is a implementation class for LongCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "long")
    private static class LongCase extends SubscriptionCustomPriceTrialPriceInCents {

        @JsonValue
        private long mLong;

        LongCase(long mLong) {
            this.mLong = mLong;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mLong(this.mLong);
        }

        @JsonCreator
        private LongCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isLong()) {
                this.mLong = ApiHelper.deserialize(jsonNode, Long.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mLong);
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionCustomPriceTrialPriceInCents.
     */
    protected static class SubscriptionCustomPriceTrialPriceInCentsDeserializer
            extends JsonDeserializer<SubscriptionCustomPriceTrialPriceInCents> {

        @Override
        public SubscriptionCustomPriceTrialPriceInCents deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(StringCase.class,
                    LongCase.class), true);
        }
    }

}
