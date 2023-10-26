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
import com.maxio.advancedbilling.models.GroupSettings;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateSubscriptionGroup2.CreateSubscriptionGroup2Deserializer.class)
public abstract class CreateSubscriptionGroup2 {
    
    /**
     * This is Group Settings case.
     * @param groupSettings GroupSettings value for groupSettings.
     * @return The GroupSettingsCase object.
     */
    public static CreateSubscriptionGroup2 fromGroupSettings(GroupSettings groupSettings) {
        return groupSettings == null ? null : new GroupSettingsCase(groupSettings);
    }

    /**
     * This is Boolean case.
     * @param mBoolean boolean value for mBoolean.
     * @return The MBooleanCase object.
     */
    public static CreateSubscriptionGroup2 fromMBoolean(boolean mBoolean) {
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
        R groupSettings(GroupSettings groupSettings);

        R mBoolean(boolean mBoolean);
    }

    /**
     * This is a implementation class for GroupSettingsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GroupSettings")
    private static class GroupSettingsCase extends CreateSubscriptionGroup2 {

        @JsonValue
        private GroupSettings groupSettings;

        GroupSettingsCase(GroupSettings groupSettings) {
            this.groupSettings = groupSettings;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.groupSettings(this.groupSettings);
        }

        @JsonCreator
        private GroupSettingsCase(JsonNode jsonNode) throws IOException {
            this.groupSettings = ApiHelper.deserialize(jsonNode,
                GroupSettings.class);
        }

        @Override
        public String toString() {
            return groupSettings.toString();
        }
    }

    /**
     * This is a implementation class for MBooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "boolean")
    private static class MBooleanCase extends CreateSubscriptionGroup2 {

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
     * This is a custom deserializer class for CreateSubscriptionGroup2.
     */
    protected static class CreateSubscriptionGroup2Deserializer
            extends JsonDeserializer<CreateSubscriptionGroup2> {

        @Override
        public CreateSubscriptionGroup2 deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(GroupSettingsCase.class,
                    MBooleanCase.class), true);
        }
    }

}
