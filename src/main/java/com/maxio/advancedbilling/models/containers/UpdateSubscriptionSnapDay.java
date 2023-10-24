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
import com.maxio.advancedbilling.models.SnapDayOneOf0;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = UpdateSubscriptionSnapDay.UpdateSubscriptionSnapDayDeserializer.class)
public abstract class UpdateSubscriptionSnapDay {
    
    /**
     * This is SnapDay_OneOf0 case.
     * @param snapDayOneOf0 SnapDayOneOf0 value for snapDayOneOf0.
     * @return The SnapDayOneOf0Case object.
     */
    public static UpdateSubscriptionSnapDay fromSnapDayOneOf0(SnapDayOneOf0 snapDayOneOf0) {
        return snapDayOneOf0 == null ? null : new SnapDayOneOf0Case(snapDayOneOf0);
    }

    /**
     * This is Number case.
     * @param number int value for number.
     * @return The NumberCase object.
     */
    public static UpdateSubscriptionSnapDay fromNumber(int number) {
        return new NumberCase(number);
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
        R snapDayOneOf0(SnapDayOneOf0 snapDayOneOf0);

        R number(int number);
    }

    /**
     * This is a implementation class for SnapDayOneOf0Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SnapDayOneOf0")
    private static class SnapDayOneOf0Case extends UpdateSubscriptionSnapDay {

        @JsonValue
        private SnapDayOneOf0 snapDayOneOf0;

        SnapDayOneOf0Case(SnapDayOneOf0 snapDayOneOf0) {
            this.snapDayOneOf0 = snapDayOneOf0;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.snapDayOneOf0(this.snapDayOneOf0);
        }

        @JsonCreator
        private SnapDayOneOf0Case(JsonNode jsonNode) throws IOException {
            this.snapDayOneOf0 = 
                SnapDayOneOf0.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.snapDayOneOf0 == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return snapDayOneOf0.toString();
        }
    }

    /**
     * This is a implementation class for NumberCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "int")
    private static class NumberCase extends UpdateSubscriptionSnapDay {

        @JsonValue
        private int number;

        NumberCase(int number) {
            this.number = number;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.number(this.number);
        }

        @JsonCreator
        private NumberCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isInt()) {
                this.number = ApiHelper.deserialize(jsonNode, Integer.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }

    /**
     * This is a custom deserializer class for UpdateSubscriptionSnapDay.
     */
    protected static class UpdateSubscriptionSnapDayDeserializer
            extends JsonDeserializer<UpdateSubscriptionSnapDay> {

        @Override
        public UpdateSubscriptionSnapDay deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(SnapDayOneOf0Case.class,
                    NumberCase.class), true);
        }
    }

}
