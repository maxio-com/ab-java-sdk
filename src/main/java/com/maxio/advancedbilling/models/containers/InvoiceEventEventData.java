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
import com.maxio.advancedbilling.models.ApplyCreditNoteEventData;
import com.maxio.advancedbilling.models.ApplyDebitNoteEventData;
import com.maxio.advancedbilling.models.ApplyPaymentEventData;
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEventData;
import com.maxio.advancedbilling.models.IssueInvoiceEventData;
import com.maxio.advancedbilling.models.RefundInvoiceEventData;
import com.maxio.advancedbilling.models.RemovePaymentEventData;
import com.maxio.advancedbilling.models.VoidInvoiceEventData;
import com.maxio.advancedbilling.models.VoidInvoiceEventData1;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InvoiceEventEventData.InvoiceEventEventDataDeserializer.class)
public abstract class InvoiceEventEventData {
    
    /**
     * This is Apply Credit Note Event Data case.
     * @param applyCreditNoteEventData ApplyCreditNoteEventData value for applyCreditNoteEventData.
     * @return The ApplyCreditNoteEventDataCase object.
     */
    public static InvoiceEventEventData fromApplyCreditNoteEventData(
            ApplyCreditNoteEventData applyCreditNoteEventData) {
        return applyCreditNoteEventData == null ? null : new ApplyCreditNoteEventDataCase(applyCreditNoteEventData);
    }

    /**
     * This is Apply Debit Note Event Data case.
     * @param applyDebitNoteEventData ApplyDebitNoteEventData value for applyDebitNoteEventData.
     * @return The ApplyDebitNoteEventDataCase object.
     */
    public static InvoiceEventEventData fromApplyDebitNoteEventData(
            ApplyDebitNoteEventData applyDebitNoteEventData) {
        return applyDebitNoteEventData == null ? null : new ApplyDebitNoteEventDataCase(applyDebitNoteEventData);
    }

    /**
     * This is Apply Payment Event Data case.
     * @param applyPaymentEventData ApplyPaymentEventData value for applyPaymentEventData.
     * @return The ApplyPaymentEventDataCase object.
     */
    public static InvoiceEventEventData fromApplyPaymentEventData(
            ApplyPaymentEventData applyPaymentEventData) {
        return applyPaymentEventData == null ? null : new ApplyPaymentEventDataCase(applyPaymentEventData);
    }

    /**
     * This is Change Invoice Collection Method Event Data case.
     * @param changeInvoiceCollectionMethodEventData ChangeInvoiceCollectionMethodEventData value for changeInvoiceCollectionMethodEventData.
     * @return The ChangeInvoiceCollectionMethodEventDataCase object.
     */
    public static InvoiceEventEventData fromChangeInvoiceCollectionMethodEventData(
            ChangeInvoiceCollectionMethodEventData changeInvoiceCollectionMethodEventData) {
        return changeInvoiceCollectionMethodEventData == null ? null : new ChangeInvoiceCollectionMethodEventDataCase(changeInvoiceCollectionMethodEventData);
    }

    /**
     * This is Issue Invoice Event Data case.
     * @param issueInvoiceEventData IssueInvoiceEventData value for issueInvoiceEventData.
     * @return The IssueInvoiceEventDataCase object.
     */
    public static InvoiceEventEventData fromIssueInvoiceEventData(
            IssueInvoiceEventData issueInvoiceEventData) {
        return issueInvoiceEventData == null ? null : new IssueInvoiceEventDataCase(issueInvoiceEventData);
    }

    /**
     * This is Refund Invoice Event Data case.
     * @param refundInvoiceEventData RefundInvoiceEventData value for refundInvoiceEventData.
     * @return The RefundInvoiceEventDataCase object.
     */
    public static InvoiceEventEventData fromRefundInvoiceEventData(
            RefundInvoiceEventData refundInvoiceEventData) {
        return refundInvoiceEventData == null ? null : new RefundInvoiceEventDataCase(refundInvoiceEventData);
    }

    /**
     * This is Remove Payment Event Data case.
     * @param removePaymentEventData RemovePaymentEventData value for removePaymentEventData.
     * @return The RemovePaymentEventDataCase object.
     */
    public static InvoiceEventEventData fromRemovePaymentEventData(
            RemovePaymentEventData removePaymentEventData) {
        return removePaymentEventData == null ? null : new RemovePaymentEventDataCase(removePaymentEventData);
    }

    /**
     * This is Void Invoice Event Data case.
     * @param voidInvoiceEventData VoidInvoiceEventData value for voidInvoiceEventData.
     * @return The VoidInvoiceEventDataCase object.
     */
    public static InvoiceEventEventData fromVoidInvoiceEventData(
            VoidInvoiceEventData voidInvoiceEventData) {
        return voidInvoiceEventData == null ? null : new VoidInvoiceEventDataCase(voidInvoiceEventData);
    }

    /**
     * This is Void Invoice Event Data1 case.
     * @param voidInvoiceEventData1 VoidInvoiceEventData1 value for voidInvoiceEventData1.
     * @return The VoidInvoiceEventData1Case object.
     */
    public static InvoiceEventEventData fromVoidInvoiceEventData1(
            VoidInvoiceEventData1 voidInvoiceEventData1) {
        return voidInvoiceEventData1 == null ? null : new VoidInvoiceEventData1Case(voidInvoiceEventData1);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R applyCreditNoteEventData(ApplyCreditNoteEventData applyCreditNoteEventData);

        R applyDebitNoteEventData(ApplyDebitNoteEventData applyDebitNoteEventData);

        R applyPaymentEventData(ApplyPaymentEventData applyPaymentEventData);

        R changeInvoiceCollectionMethodEventData(ChangeInvoiceCollectionMethodEventData changeInvoiceCollectionMethodEventData);

        R issueInvoiceEventData(IssueInvoiceEventData issueInvoiceEventData);

        R refundInvoiceEventData(RefundInvoiceEventData refundInvoiceEventData);

        R removePaymentEventData(RemovePaymentEventData removePaymentEventData);

        R voidInvoiceEventData(VoidInvoiceEventData voidInvoiceEventData);

        R voidInvoiceEventData1(VoidInvoiceEventData1 voidInvoiceEventData1);
    }

    /**
     * This is a implementation class for ApplyCreditNoteEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyCreditNoteEventData")
    private static class ApplyCreditNoteEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private ApplyCreditNoteEventData applyCreditNoteEventData;

        ApplyCreditNoteEventDataCase(ApplyCreditNoteEventData applyCreditNoteEventData) {
            this.applyCreditNoteEventData = applyCreditNoteEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyCreditNoteEventData(this.applyCreditNoteEventData);
        }

        @JsonCreator
        private ApplyCreditNoteEventDataCase(JsonNode jsonNode) throws IOException {
            this.applyCreditNoteEventData = ApiHelper.deserialize(jsonNode,
                ApplyCreditNoteEventData.class);
        }

        @Override
        public String toString() {
            return applyCreditNoteEventData.toString();
        }
    }

    /**
     * This is a implementation class for ApplyDebitNoteEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyDebitNoteEventData")
    private static class ApplyDebitNoteEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private ApplyDebitNoteEventData applyDebitNoteEventData;

        ApplyDebitNoteEventDataCase(ApplyDebitNoteEventData applyDebitNoteEventData) {
            this.applyDebitNoteEventData = applyDebitNoteEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyDebitNoteEventData(this.applyDebitNoteEventData);
        }

        @JsonCreator
        private ApplyDebitNoteEventDataCase(JsonNode jsonNode) throws IOException {
            this.applyDebitNoteEventData = ApiHelper.deserialize(jsonNode,
                ApplyDebitNoteEventData.class);
        }

        @Override
        public String toString() {
            return applyDebitNoteEventData.toString();
        }
    }

    /**
     * This is a implementation class for ApplyPaymentEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyPaymentEventData")
    private static class ApplyPaymentEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private ApplyPaymentEventData applyPaymentEventData;

        ApplyPaymentEventDataCase(ApplyPaymentEventData applyPaymentEventData) {
            this.applyPaymentEventData = applyPaymentEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyPaymentEventData(this.applyPaymentEventData);
        }

        @JsonCreator
        private ApplyPaymentEventDataCase(JsonNode jsonNode) throws IOException {
            this.applyPaymentEventData = ApiHelper.deserialize(jsonNode,
                ApplyPaymentEventData.class);
        }

        @Override
        public String toString() {
            return applyPaymentEventData.toString();
        }
    }

    /**
     * This is a implementation class for ChangeInvoiceCollectionMethodEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChangeInvoiceCollectionMethodEventData")
    private static class ChangeInvoiceCollectionMethodEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private ChangeInvoiceCollectionMethodEventData changeInvoiceCollectionMethodEventData;

        ChangeInvoiceCollectionMethodEventDataCase(ChangeInvoiceCollectionMethodEventData changeInvoiceCollectionMethodEventData) {
            this.changeInvoiceCollectionMethodEventData = changeInvoiceCollectionMethodEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.changeInvoiceCollectionMethodEventData(this.changeInvoiceCollectionMethodEventData);
        }

        @JsonCreator
        private ChangeInvoiceCollectionMethodEventDataCase(JsonNode jsonNode) throws IOException {
            this.changeInvoiceCollectionMethodEventData = ApiHelper.deserialize(jsonNode,
                ChangeInvoiceCollectionMethodEventData.class);
        }

        @Override
        public String toString() {
            return changeInvoiceCollectionMethodEventData.toString();
        }
    }

    /**
     * This is a implementation class for IssueInvoiceEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "IssueInvoiceEventData")
    private static class IssueInvoiceEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private IssueInvoiceEventData issueInvoiceEventData;

        IssueInvoiceEventDataCase(IssueInvoiceEventData issueInvoiceEventData) {
            this.issueInvoiceEventData = issueInvoiceEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.issueInvoiceEventData(this.issueInvoiceEventData);
        }

        @JsonCreator
        private IssueInvoiceEventDataCase(JsonNode jsonNode) throws IOException {
            this.issueInvoiceEventData = ApiHelper.deserialize(jsonNode,
                IssueInvoiceEventData.class);
        }

        @Override
        public String toString() {
            return issueInvoiceEventData.toString();
        }
    }

    /**
     * This is a implementation class for RefundInvoiceEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundInvoiceEventData")
    private static class RefundInvoiceEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private RefundInvoiceEventData refundInvoiceEventData;

        RefundInvoiceEventDataCase(RefundInvoiceEventData refundInvoiceEventData) {
            this.refundInvoiceEventData = refundInvoiceEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundInvoiceEventData(this.refundInvoiceEventData);
        }

        @JsonCreator
        private RefundInvoiceEventDataCase(JsonNode jsonNode) throws IOException {
            this.refundInvoiceEventData = ApiHelper.deserialize(jsonNode,
                RefundInvoiceEventData.class);
        }

        @Override
        public String toString() {
            return refundInvoiceEventData.toString();
        }
    }

    /**
     * This is a implementation class for RemovePaymentEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RemovePaymentEventData")
    private static class RemovePaymentEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private RemovePaymentEventData removePaymentEventData;

        RemovePaymentEventDataCase(RemovePaymentEventData removePaymentEventData) {
            this.removePaymentEventData = removePaymentEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.removePaymentEventData(this.removePaymentEventData);
        }

        @JsonCreator
        private RemovePaymentEventDataCase(JsonNode jsonNode) throws IOException {
            this.removePaymentEventData = ApiHelper.deserialize(jsonNode,
                RemovePaymentEventData.class);
        }

        @Override
        public String toString() {
            return removePaymentEventData.toString();
        }
    }

    /**
     * This is a implementation class for VoidInvoiceEventDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "VoidInvoiceEventData")
    private static class VoidInvoiceEventDataCase extends InvoiceEventEventData {

        @JsonValue
        private VoidInvoiceEventData voidInvoiceEventData;

        VoidInvoiceEventDataCase(VoidInvoiceEventData voidInvoiceEventData) {
            this.voidInvoiceEventData = voidInvoiceEventData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.voidInvoiceEventData(this.voidInvoiceEventData);
        }

        @JsonCreator
        private VoidInvoiceEventDataCase(JsonNode jsonNode) throws IOException {
            this.voidInvoiceEventData = ApiHelper.deserialize(jsonNode,
                VoidInvoiceEventData.class);
        }

        @Override
        public String toString() {
            return voidInvoiceEventData.toString();
        }
    }

    /**
     * This is a implementation class for VoidInvoiceEventData1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "VoidInvoiceEventData1")
    private static class VoidInvoiceEventData1Case extends InvoiceEventEventData {

        @JsonValue
        private VoidInvoiceEventData1 voidInvoiceEventData1;

        VoidInvoiceEventData1Case(VoidInvoiceEventData1 voidInvoiceEventData1) {
            this.voidInvoiceEventData1 = voidInvoiceEventData1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.voidInvoiceEventData1(this.voidInvoiceEventData1);
        }

        @JsonCreator
        private VoidInvoiceEventData1Case(JsonNode jsonNode) throws IOException {
            this.voidInvoiceEventData1 = ApiHelper.deserialize(jsonNode,
                VoidInvoiceEventData1.class);
        }

        @Override
        public String toString() {
            return voidInvoiceEventData1.toString();
        }
    }

    /**
     * This is a custom deserializer class for InvoiceEventEventData.
     */
    protected static class InvoiceEventEventDataDeserializer
            extends JsonDeserializer<InvoiceEventEventData> {

        @Override
        public InvoiceEventEventData deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ApplyCreditNoteEventDataCase.class,
                    ApplyDebitNoteEventDataCase.class, ApplyPaymentEventDataCase.class,
                    ChangeInvoiceCollectionMethodEventDataCase.class,
                    IssueInvoiceEventDataCase.class, RefundInvoiceEventDataCase.class,
                    RemovePaymentEventDataCase.class, VoidInvoiceEventDataCase.class,
                    VoidInvoiceEventData1Case.class), false);
        }
    }

}
