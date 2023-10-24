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
import com.maxio.advancedbilling.models.ResumeOptions;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReactivateSubscriptionRequestResume.ReactivateSubscriptionRequestResumeDeserializer.class)
public abstract class ReactivateSubscriptionRequestResume {
    
    /**
     * This is Boolean case.
     * @param mBoolean boolean value for mBoolean.
     * @return The MBooleanCase object.
     */
    public static ReactivateSubscriptionRequestResume fromMBoolean(boolean mBoolean) {
        return new MBooleanCase(mBoolean);
    }

    /**
     * This is Resume Options case.
     * @param resumeOptions ResumeOptions value for resumeOptions.
     * @return The ResumeOptionsCase object.
     */
    public static ReactivateSubscriptionRequestResume fromResumeOptions(
            ResumeOptions resumeOptions) {
        return resumeOptions == null ? null : new ResumeOptionsCase(resumeOptions);
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

        R resumeOptions(ResumeOptions resumeOptions);
    }

    /**
     * This is a implementation class for MBooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "boolean")
    private static class MBooleanCase extends ReactivateSubscriptionRequestResume {

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
     * This is a implementation class for ResumeOptionsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ResumeOptions")
    private static class ResumeOptionsCase extends ReactivateSubscriptionRequestResume {

        @JsonValue
        private ResumeOptions resumeOptions;

        ResumeOptionsCase(ResumeOptions resumeOptions) {
            this.resumeOptions = resumeOptions;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.resumeOptions(this.resumeOptions);
        }

        @JsonCreator
        private ResumeOptionsCase(JsonNode jsonNode) throws IOException {
            this.resumeOptions = ApiHelper.deserialize(jsonNode,
                ResumeOptions.class);
        }

        @Override
        public String toString() {
            return resumeOptions.toString();
        }
    }

    /**
     * This is a custom deserializer class for ReactivateSubscriptionRequestResume.
     */
    protected static class ReactivateSubscriptionRequestResumeDeserializer
            extends JsonDeserializer<ReactivateSubscriptionRequestResume> {

        @Override
        public ReactivateSubscriptionRequestResume deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MBooleanCase.class,
                    ResumeOptionsCase.class), true);
        }
    }

}
