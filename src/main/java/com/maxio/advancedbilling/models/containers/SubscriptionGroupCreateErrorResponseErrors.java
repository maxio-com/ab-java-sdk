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
import com.maxio.advancedbilling.models.SubscriptionGroupMembersArrayError;
import com.maxio.advancedbilling.models.SubscriptionGroupSingleError;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionGroupCreateErrorResponseErrors.SubscriptionGroupCreateErrorResponseErrorsDeserializer.class)
public abstract class SubscriptionGroupCreateErrorResponseErrors {
    
    /**
     * This is Subscription Group Members Array Error case.
     * @param subscriptionGroupMembersArrayError SubscriptionGroupMembersArrayError value for subscriptionGroupMembersArrayError.
     * @return The SubscriptionGroupMembersArrayErrorCase object.
     */
    public static SubscriptionGroupCreateErrorResponseErrors fromSubscriptionGroupMembersArrayError(
            SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError) {
        return subscriptionGroupMembersArrayError == null ? null : new SubscriptionGroupMembersArrayErrorCase(subscriptionGroupMembersArrayError);
    }

    /**
     * This is Subscription Group Single Error case.
     * @param subscriptionGroupSingleError SubscriptionGroupSingleError value for subscriptionGroupSingleError.
     * @return The SubscriptionGroupSingleErrorCase object.
     */
    public static SubscriptionGroupCreateErrorResponseErrors fromSubscriptionGroupSingleError(
            SubscriptionGroupSingleError subscriptionGroupSingleError) {
        return subscriptionGroupSingleError == null ? null : new SubscriptionGroupSingleErrorCase(subscriptionGroupSingleError);
    }

    /**
     * This is String case.
     * @param string String value for string.
     * @return The StringCase object.
     */
    public static SubscriptionGroupCreateErrorResponseErrors fromString(String string) {
        return string == null ? null : new StringCase(string);
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
        R subscriptionGroupMembersArrayError(SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError);

        R subscriptionGroupSingleError(SubscriptionGroupSingleError subscriptionGroupSingleError);

        R string(String string);
    }

    /**
     * This is a implementation class for SubscriptionGroupMembersArrayErrorCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionGroupMembersArrayError")
    private static class SubscriptionGroupMembersArrayErrorCase extends SubscriptionGroupCreateErrorResponseErrors {

        @JsonValue
        private SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError;

        SubscriptionGroupMembersArrayErrorCase(SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError) {
            this.subscriptionGroupMembersArrayError = subscriptionGroupMembersArrayError;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionGroupMembersArrayError(this.subscriptionGroupMembersArrayError);
        }

        @JsonCreator
        private SubscriptionGroupMembersArrayErrorCase(JsonNode jsonNode) throws IOException {
            this.subscriptionGroupMembersArrayError = ApiHelper.deserialize(jsonNode,
                SubscriptionGroupMembersArrayError.class);
        }

        @Override
        public String toString() {
            return subscriptionGroupMembersArrayError.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionGroupSingleErrorCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionGroupSingleError")
    private static class SubscriptionGroupSingleErrorCase extends SubscriptionGroupCreateErrorResponseErrors {

        @JsonValue
        private SubscriptionGroupSingleError subscriptionGroupSingleError;

        SubscriptionGroupSingleErrorCase(SubscriptionGroupSingleError subscriptionGroupSingleError) {
            this.subscriptionGroupSingleError = subscriptionGroupSingleError;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionGroupSingleError(this.subscriptionGroupSingleError);
        }

        @JsonCreator
        private SubscriptionGroupSingleErrorCase(JsonNode jsonNode) throws IOException {
            this.subscriptionGroupSingleError = ApiHelper.deserialize(jsonNode,
                SubscriptionGroupSingleError.class);
        }

        @Override
        public String toString() {
            return subscriptionGroupSingleError.toString();
        }
    }

    /**
     * This is a implementation class for StringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class StringCase extends SubscriptionGroupCreateErrorResponseErrors {

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
     * This is a custom deserializer class for SubscriptionGroupCreateErrorResponseErrors.
     */
    protected static class SubscriptionGroupCreateErrorResponseErrorsDeserializer
            extends JsonDeserializer<SubscriptionGroupCreateErrorResponseErrors> {

        @Override
        public SubscriptionGroupCreateErrorResponseErrors deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    SubscriptionGroupMembersArrayErrorCase.class,
                    SubscriptionGroupSingleErrorCase.class, StringCase.class), true);
        }
    }

}
