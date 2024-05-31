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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.ApplyCreditNoteEvent;
import com.maxio.advancedbilling.models.ApplyDebitNoteEvent;
import com.maxio.advancedbilling.models.ApplyPaymentEvent;
import com.maxio.advancedbilling.models.BackportInvoiceEvent;
import com.maxio.advancedbilling.models.ChangeChargebackStatusEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceStatusEvent;
import com.maxio.advancedbilling.models.CreateCreditNoteEvent;
import com.maxio.advancedbilling.models.CreateDebitNoteEvent;
import com.maxio.advancedbilling.models.FailedPaymentEvent;
import com.maxio.advancedbilling.models.IssueInvoiceEvent;
import com.maxio.advancedbilling.models.RefundInvoiceEvent;
import com.maxio.advancedbilling.models.RemovePaymentEvent;
import com.maxio.advancedbilling.models.VoidInvoiceEvent;
import com.maxio.advancedbilling.models.VoidRemainderEvent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InvoiceEvent.InvoiceEventDeserializer.class)
public abstract class InvoiceEvent {
    
    /**
     * This is Apply Credit Note Event case.
     * @param applyCreditNoteEvent ApplyCreditNoteEvent value for applyCreditNoteEvent.
     * @return The ApplyCreditNoteEventCase object.
     */
    public static InvoiceEvent fromApplyCreditNoteEvent(ApplyCreditNoteEvent applyCreditNoteEvent) {
        return applyCreditNoteEvent == null ? null : new ApplyCreditNoteEventCase(applyCreditNoteEvent);
    }

    /**
     * This is Apply Debit Note Event case.
     * @param applyDebitNoteEvent ApplyDebitNoteEvent value for applyDebitNoteEvent.
     * @return The ApplyDebitNoteEventCase object.
     */
    public static InvoiceEvent fromApplyDebitNoteEvent(ApplyDebitNoteEvent applyDebitNoteEvent) {
        return applyDebitNoteEvent == null ? null : new ApplyDebitNoteEventCase(applyDebitNoteEvent);
    }

    /**
     * This is Apply Payment Event case.
     * @param applyPaymentEvent ApplyPaymentEvent value for applyPaymentEvent.
     * @return The ApplyPaymentEventCase object.
     */
    public static InvoiceEvent fromApplyPaymentEvent(ApplyPaymentEvent applyPaymentEvent) {
        return applyPaymentEvent == null ? null : new ApplyPaymentEventCase(applyPaymentEvent);
    }

    /**
     * This is Backport Invoice Event case.
     * @param backportInvoiceEvent BackportInvoiceEvent value for backportInvoiceEvent.
     * @return The BackportInvoiceEventCase object.
     */
    public static InvoiceEvent fromBackportInvoiceEvent(BackportInvoiceEvent backportInvoiceEvent) {
        return backportInvoiceEvent == null ? null : new BackportInvoiceEventCase(backportInvoiceEvent);
    }

    /**
     * This is Change Chargeback Status Event case.
     * @param changeChargebackStatusEvent ChangeChargebackStatusEvent value for changeChargebackStatusEvent.
     * @return The ChangeChargebackStatusEventCase object.
     */
    public static InvoiceEvent fromChangeChargebackStatusEvent(
            ChangeChargebackStatusEvent changeChargebackStatusEvent) {
        return changeChargebackStatusEvent == null ? null : new ChangeChargebackStatusEventCase(changeChargebackStatusEvent);
    }

    /**
     * This is Change Invoice Collection Method Event case.
     * @param changeInvoiceCollectionMethodEvent ChangeInvoiceCollectionMethodEvent value for changeInvoiceCollectionMethodEvent.
     * @return The ChangeInvoiceCollectionMethodEventCase object.
     */
    public static InvoiceEvent fromChangeInvoiceCollectionMethodEvent(
            ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent) {
        return changeInvoiceCollectionMethodEvent == null ? null : new ChangeInvoiceCollectionMethodEventCase(changeInvoiceCollectionMethodEvent);
    }

    /**
     * This is Change Invoice Status Event case.
     * @param changeInvoiceStatusEvent ChangeInvoiceStatusEvent value for changeInvoiceStatusEvent.
     * @return The ChangeInvoiceStatusEventCase object.
     */
    public static InvoiceEvent fromChangeInvoiceStatusEvent(
            ChangeInvoiceStatusEvent changeInvoiceStatusEvent) {
        return changeInvoiceStatusEvent == null ? null : new ChangeInvoiceStatusEventCase(changeInvoiceStatusEvent);
    }

    /**
     * This is Create Credit Note Event case.
     * @param createCreditNoteEvent CreateCreditNoteEvent value for createCreditNoteEvent.
     * @return The CreateCreditNoteEventCase object.
     */
    public static InvoiceEvent fromCreateCreditNoteEvent(
            CreateCreditNoteEvent createCreditNoteEvent) {
        return createCreditNoteEvent == null ? null : new CreateCreditNoteEventCase(createCreditNoteEvent);
    }

    /**
     * This is Create Debit Note Event case.
     * @param createDebitNoteEvent CreateDebitNoteEvent value for createDebitNoteEvent.
     * @return The CreateDebitNoteEventCase object.
     */
    public static InvoiceEvent fromCreateDebitNoteEvent(CreateDebitNoteEvent createDebitNoteEvent) {
        return createDebitNoteEvent == null ? null : new CreateDebitNoteEventCase(createDebitNoteEvent);
    }

    /**
     * This is Failed Payment Event case.
     * @param failedPaymentEvent FailedPaymentEvent value for failedPaymentEvent.
     * @return The FailedPaymentEventCase object.
     */
    public static InvoiceEvent fromFailedPaymentEvent(FailedPaymentEvent failedPaymentEvent) {
        return failedPaymentEvent == null ? null : new FailedPaymentEventCase(failedPaymentEvent);
    }

    /**
     * This is Issue Invoice Event case.
     * @param issueInvoiceEvent IssueInvoiceEvent value for issueInvoiceEvent.
     * @return The IssueInvoiceEventCase object.
     */
    public static InvoiceEvent fromIssueInvoiceEvent(IssueInvoiceEvent issueInvoiceEvent) {
        return issueInvoiceEvent == null ? null : new IssueInvoiceEventCase(issueInvoiceEvent);
    }

    /**
     * This is Refund Invoice Event case.
     * @param refundInvoiceEvent RefundInvoiceEvent value for refundInvoiceEvent.
     * @return The RefundInvoiceEventCase object.
     */
    public static InvoiceEvent fromRefundInvoiceEvent(RefundInvoiceEvent refundInvoiceEvent) {
        return refundInvoiceEvent == null ? null : new RefundInvoiceEventCase(refundInvoiceEvent);
    }

    /**
     * This is Remove Payment Event case.
     * @param removePaymentEvent RemovePaymentEvent value for removePaymentEvent.
     * @return The RemovePaymentEventCase object.
     */
    public static InvoiceEvent fromRemovePaymentEvent(RemovePaymentEvent removePaymentEvent) {
        return removePaymentEvent == null ? null : new RemovePaymentEventCase(removePaymentEvent);
    }

    /**
     * This is Void Invoice Event case.
     * @param voidInvoiceEvent VoidInvoiceEvent value for voidInvoiceEvent.
     * @return The VoidInvoiceEventCase object.
     */
    public static InvoiceEvent fromVoidInvoiceEvent(VoidInvoiceEvent voidInvoiceEvent) {
        return voidInvoiceEvent == null ? null : new VoidInvoiceEventCase(voidInvoiceEvent);
    }

    /**
     * This is Void Remainder Event case.
     * @param voidRemainderEvent VoidRemainderEvent value for voidRemainderEvent.
     * @return The VoidRemainderEventCase object.
     */
    public static InvoiceEvent fromVoidRemainderEvent(VoidRemainderEvent voidRemainderEvent) {
        return voidRemainderEvent == null ? null : new VoidRemainderEventCase(voidRemainderEvent);
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
        R applyCreditNoteEvent(ApplyCreditNoteEvent applyCreditNoteEvent);

        R applyDebitNoteEvent(ApplyDebitNoteEvent applyDebitNoteEvent);

        R applyPaymentEvent(ApplyPaymentEvent applyPaymentEvent);

        R backportInvoiceEvent(BackportInvoiceEvent backportInvoiceEvent);

        R changeChargebackStatusEvent(ChangeChargebackStatusEvent changeChargebackStatusEvent);

        R changeInvoiceCollectionMethodEvent(ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent);

        R changeInvoiceStatusEvent(ChangeInvoiceStatusEvent changeInvoiceStatusEvent);

        R createCreditNoteEvent(CreateCreditNoteEvent createCreditNoteEvent);

        R createDebitNoteEvent(CreateDebitNoteEvent createDebitNoteEvent);

        R failedPaymentEvent(FailedPaymentEvent failedPaymentEvent);

        R issueInvoiceEvent(IssueInvoiceEvent issueInvoiceEvent);

        R refundInvoiceEvent(RefundInvoiceEvent refundInvoiceEvent);

        R removePaymentEvent(RemovePaymentEvent removePaymentEvent);

        R voidInvoiceEvent(VoidInvoiceEvent voidInvoiceEvent);

        R voidRemainderEvent(VoidRemainderEvent voidRemainderEvent);
    }

    /**
     * This is a implementation class for ApplyCreditNoteEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyCreditNoteEvent")
    private static class ApplyCreditNoteEventCase extends InvoiceEvent {

        @JsonValue
        private ApplyCreditNoteEvent applyCreditNoteEvent;

        ApplyCreditNoteEventCase(ApplyCreditNoteEvent applyCreditNoteEvent) {
            this.applyCreditNoteEvent = applyCreditNoteEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyCreditNoteEvent(this.applyCreditNoteEvent);
        }

        @JsonCreator
        private ApplyCreditNoteEventCase(JsonNode jsonNode) throws IOException {
            this.applyCreditNoteEvent = ApiHelper.deserialize(jsonNode,
                ApplyCreditNoteEvent.class);
        }

        @Override
        public String toString() {
            return applyCreditNoteEvent.toString();
        }
    }

    /**
     * This is a implementation class for ApplyDebitNoteEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyDebitNoteEvent")
    private static class ApplyDebitNoteEventCase extends InvoiceEvent {

        @JsonValue
        private ApplyDebitNoteEvent applyDebitNoteEvent;

        ApplyDebitNoteEventCase(ApplyDebitNoteEvent applyDebitNoteEvent) {
            this.applyDebitNoteEvent = applyDebitNoteEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyDebitNoteEvent(this.applyDebitNoteEvent);
        }

        @JsonCreator
        private ApplyDebitNoteEventCase(JsonNode jsonNode) throws IOException {
            this.applyDebitNoteEvent = ApiHelper.deserialize(jsonNode,
                ApplyDebitNoteEvent.class);
        }

        @Override
        public String toString() {
            return applyDebitNoteEvent.toString();
        }
    }

    /**
     * This is a implementation class for ApplyPaymentEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ApplyPaymentEvent")
    private static class ApplyPaymentEventCase extends InvoiceEvent {

        @JsonValue
        private ApplyPaymentEvent applyPaymentEvent;

        ApplyPaymentEventCase(ApplyPaymentEvent applyPaymentEvent) {
            this.applyPaymentEvent = applyPaymentEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.applyPaymentEvent(this.applyPaymentEvent);
        }

        @JsonCreator
        private ApplyPaymentEventCase(JsonNode jsonNode) throws IOException {
            this.applyPaymentEvent = ApiHelper.deserialize(jsonNode,
                ApplyPaymentEvent.class);
        }

        @Override
        public String toString() {
            return applyPaymentEvent.toString();
        }
    }

    /**
     * This is a implementation class for BackportInvoiceEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BackportInvoiceEvent")
    private static class BackportInvoiceEventCase extends InvoiceEvent {

        @JsonValue
        private BackportInvoiceEvent backportInvoiceEvent;

        BackportInvoiceEventCase(BackportInvoiceEvent backportInvoiceEvent) {
            this.backportInvoiceEvent = backportInvoiceEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.backportInvoiceEvent(this.backportInvoiceEvent);
        }

        @JsonCreator
        private BackportInvoiceEventCase(JsonNode jsonNode) throws IOException {
            this.backportInvoiceEvent = ApiHelper.deserialize(jsonNode,
                BackportInvoiceEvent.class);
        }

        @Override
        public String toString() {
            return backportInvoiceEvent.toString();
        }
    }

    /**
     * This is a implementation class for ChangeChargebackStatusEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChangeChargebackStatusEvent")
    private static class ChangeChargebackStatusEventCase extends InvoiceEvent {

        @JsonValue
        private ChangeChargebackStatusEvent changeChargebackStatusEvent;

        ChangeChargebackStatusEventCase(ChangeChargebackStatusEvent changeChargebackStatusEvent) {
            this.changeChargebackStatusEvent = changeChargebackStatusEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.changeChargebackStatusEvent(this.changeChargebackStatusEvent);
        }

        @JsonCreator
        private ChangeChargebackStatusEventCase(JsonNode jsonNode) throws IOException {
            this.changeChargebackStatusEvent = ApiHelper.deserialize(jsonNode,
                ChangeChargebackStatusEvent.class);
        }

        @Override
        public String toString() {
            return changeChargebackStatusEvent.toString();
        }
    }

    /**
     * This is a implementation class for ChangeInvoiceCollectionMethodEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChangeInvoiceCollectionMethodEvent")
    private static class ChangeInvoiceCollectionMethodEventCase extends InvoiceEvent {

        @JsonValue
        private ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent;

        ChangeInvoiceCollectionMethodEventCase(ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent) {
            this.changeInvoiceCollectionMethodEvent = changeInvoiceCollectionMethodEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.changeInvoiceCollectionMethodEvent(this.changeInvoiceCollectionMethodEvent);
        }

        @JsonCreator
        private ChangeInvoiceCollectionMethodEventCase(JsonNode jsonNode) throws IOException {
            this.changeInvoiceCollectionMethodEvent = ApiHelper.deserialize(jsonNode,
                ChangeInvoiceCollectionMethodEvent.class);
        }

        @Override
        public String toString() {
            return changeInvoiceCollectionMethodEvent.toString();
        }
    }

    /**
     * This is a implementation class for ChangeInvoiceStatusEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChangeInvoiceStatusEvent")
    private static class ChangeInvoiceStatusEventCase extends InvoiceEvent {

        @JsonValue
        private ChangeInvoiceStatusEvent changeInvoiceStatusEvent;

        ChangeInvoiceStatusEventCase(ChangeInvoiceStatusEvent changeInvoiceStatusEvent) {
            this.changeInvoiceStatusEvent = changeInvoiceStatusEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.changeInvoiceStatusEvent(this.changeInvoiceStatusEvent);
        }

        @JsonCreator
        private ChangeInvoiceStatusEventCase(JsonNode jsonNode) throws IOException {
            this.changeInvoiceStatusEvent = ApiHelper.deserialize(jsonNode,
                ChangeInvoiceStatusEvent.class);
        }

        @Override
        public String toString() {
            return changeInvoiceStatusEvent.toString();
        }
    }

    /**
     * This is a implementation class for CreateCreditNoteEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateCreditNoteEvent")
    private static class CreateCreditNoteEventCase extends InvoiceEvent {

        @JsonValue
        private CreateCreditNoteEvent createCreditNoteEvent;

        CreateCreditNoteEventCase(CreateCreditNoteEvent createCreditNoteEvent) {
            this.createCreditNoteEvent = createCreditNoteEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createCreditNoteEvent(this.createCreditNoteEvent);
        }

        @JsonCreator
        private CreateCreditNoteEventCase(JsonNode jsonNode) throws IOException {
            this.createCreditNoteEvent = ApiHelper.deserialize(jsonNode,
                CreateCreditNoteEvent.class);
        }

        @Override
        public String toString() {
            return createCreditNoteEvent.toString();
        }
    }

    /**
     * This is a implementation class for CreateDebitNoteEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateDebitNoteEvent")
    private static class CreateDebitNoteEventCase extends InvoiceEvent {

        @JsonValue
        private CreateDebitNoteEvent createDebitNoteEvent;

        CreateDebitNoteEventCase(CreateDebitNoteEvent createDebitNoteEvent) {
            this.createDebitNoteEvent = createDebitNoteEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createDebitNoteEvent(this.createDebitNoteEvent);
        }

        @JsonCreator
        private CreateDebitNoteEventCase(JsonNode jsonNode) throws IOException {
            this.createDebitNoteEvent = ApiHelper.deserialize(jsonNode,
                CreateDebitNoteEvent.class);
        }

        @Override
        public String toString() {
            return createDebitNoteEvent.toString();
        }
    }

    /**
     * This is a implementation class for FailedPaymentEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "FailedPaymentEvent")
    private static class FailedPaymentEventCase extends InvoiceEvent {

        @JsonValue
        private FailedPaymentEvent failedPaymentEvent;

        FailedPaymentEventCase(FailedPaymentEvent failedPaymentEvent) {
            this.failedPaymentEvent = failedPaymentEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.failedPaymentEvent(this.failedPaymentEvent);
        }

        @JsonCreator
        private FailedPaymentEventCase(JsonNode jsonNode) throws IOException {
            this.failedPaymentEvent = ApiHelper.deserialize(jsonNode,
                FailedPaymentEvent.class);
        }

        @Override
        public String toString() {
            return failedPaymentEvent.toString();
        }
    }

    /**
     * This is a implementation class for IssueInvoiceEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "IssueInvoiceEvent")
    private static class IssueInvoiceEventCase extends InvoiceEvent {

        @JsonValue
        private IssueInvoiceEvent issueInvoiceEvent;

        IssueInvoiceEventCase(IssueInvoiceEvent issueInvoiceEvent) {
            this.issueInvoiceEvent = issueInvoiceEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.issueInvoiceEvent(this.issueInvoiceEvent);
        }

        @JsonCreator
        private IssueInvoiceEventCase(JsonNode jsonNode) throws IOException {
            this.issueInvoiceEvent = ApiHelper.deserialize(jsonNode,
                IssueInvoiceEvent.class);
        }

        @Override
        public String toString() {
            return issueInvoiceEvent.toString();
        }
    }

    /**
     * This is a implementation class for RefundInvoiceEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundInvoiceEvent")
    private static class RefundInvoiceEventCase extends InvoiceEvent {

        @JsonValue
        private RefundInvoiceEvent refundInvoiceEvent;

        RefundInvoiceEventCase(RefundInvoiceEvent refundInvoiceEvent) {
            this.refundInvoiceEvent = refundInvoiceEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundInvoiceEvent(this.refundInvoiceEvent);
        }

        @JsonCreator
        private RefundInvoiceEventCase(JsonNode jsonNode) throws IOException {
            this.refundInvoiceEvent = ApiHelper.deserialize(jsonNode,
                RefundInvoiceEvent.class);
        }

        @Override
        public String toString() {
            return refundInvoiceEvent.toString();
        }
    }

    /**
     * This is a implementation class for RemovePaymentEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RemovePaymentEvent")
    private static class RemovePaymentEventCase extends InvoiceEvent {

        @JsonValue
        private RemovePaymentEvent removePaymentEvent;

        RemovePaymentEventCase(RemovePaymentEvent removePaymentEvent) {
            this.removePaymentEvent = removePaymentEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.removePaymentEvent(this.removePaymentEvent);
        }

        @JsonCreator
        private RemovePaymentEventCase(JsonNode jsonNode) throws IOException {
            this.removePaymentEvent = ApiHelper.deserialize(jsonNode,
                RemovePaymentEvent.class);
        }

        @Override
        public String toString() {
            return removePaymentEvent.toString();
        }
    }

    /**
     * This is a implementation class for VoidInvoiceEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "VoidInvoiceEvent")
    private static class VoidInvoiceEventCase extends InvoiceEvent {

        @JsonValue
        private VoidInvoiceEvent voidInvoiceEvent;

        VoidInvoiceEventCase(VoidInvoiceEvent voidInvoiceEvent) {
            this.voidInvoiceEvent = voidInvoiceEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.voidInvoiceEvent(this.voidInvoiceEvent);
        }

        @JsonCreator
        private VoidInvoiceEventCase(JsonNode jsonNode) throws IOException {
            this.voidInvoiceEvent = ApiHelper.deserialize(jsonNode,
                VoidInvoiceEvent.class);
        }

        @Override
        public String toString() {
            return voidInvoiceEvent.toString();
        }
    }

    /**
     * This is a implementation class for VoidRemainderEventCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "VoidRemainderEvent")
    private static class VoidRemainderEventCase extends InvoiceEvent {

        @JsonValue
        private VoidRemainderEvent voidRemainderEvent;

        VoidRemainderEventCase(VoidRemainderEvent voidRemainderEvent) {
            this.voidRemainderEvent = voidRemainderEvent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.voidRemainderEvent(this.voidRemainderEvent);
        }

        @JsonCreator
        private VoidRemainderEventCase(JsonNode jsonNode) throws IOException {
            this.voidRemainderEvent = ApiHelper.deserialize(jsonNode,
                VoidRemainderEvent.class);
        }

        @Override
        public String toString() {
            return voidRemainderEvent.toString();
        }
    }

    /**
     * This is a custom deserializer class for InvoiceEvent.
     */
    protected static class InvoiceEventDeserializer
            extends JsonDeserializer<InvoiceEvent> {

        private String discriminator = "event_type";
        private List<Map<String, Class<? extends InvoiceEvent>>> registry =
                Arrays.asList(
                        Collections.singletonMap("apply_credit_note", ApplyCreditNoteEventCase.class),
                        Collections.singletonMap("apply_debit_note", ApplyDebitNoteEventCase.class),
                        Collections.singletonMap("apply_payment", ApplyPaymentEventCase.class),
                        Collections.singletonMap("backport_invoice", BackportInvoiceEventCase.class),
                        Collections.singletonMap("change_chargeback_status", ChangeChargebackStatusEventCase.class),
                        Collections.singletonMap("change_invoice_collection_method", ChangeInvoiceCollectionMethodEventCase.class),
                        Collections.singletonMap("change_invoice_status", ChangeInvoiceStatusEventCase.class),
                        Collections.singletonMap("create_credit_note", CreateCreditNoteEventCase.class),
                        Collections.singletonMap("create_debit_note", CreateDebitNoteEventCase.class),
                        Collections.singletonMap("failed_payment", FailedPaymentEventCase.class),
                        Collections.singletonMap("issue_invoice", IssueInvoiceEventCase.class),
                        Collections.singletonMap("refund_invoice", RefundInvoiceEventCase.class),
                        Collections.singletonMap("remove_payment", RemovePaymentEventCase.class),
                        Collections.singletonMap("void_invoice", VoidInvoiceEventCase.class),
                        Collections.singletonMap("void_remainder", VoidRemainderEventCase.class));

        @Override
        public InvoiceEvent deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, false);
        }
    }

}
