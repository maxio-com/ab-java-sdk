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
import com.maxio.advancedbilling.models.ComponentAllocationChange;
import com.maxio.advancedbilling.models.CreditAccountBalanceChanged;
import com.maxio.advancedbilling.models.CustomFieldValueChange;
import com.maxio.advancedbilling.models.DunningStepReached;
import com.maxio.advancedbilling.models.InvoiceIssued;
import com.maxio.advancedbilling.models.ItemPricePointChanged;
import com.maxio.advancedbilling.models.MeteredUsage;
import com.maxio.advancedbilling.models.PaymentCollectionMethodChanged;
import com.maxio.advancedbilling.models.PaymentRelatedEvents;
import com.maxio.advancedbilling.models.PendingCancellationChange;
import com.maxio.advancedbilling.models.PrepaidSubscriptionBalanceChanged;
import com.maxio.advancedbilling.models.PrepaidUsage;
import com.maxio.advancedbilling.models.PrepaymentAccountBalanceChanged;
import com.maxio.advancedbilling.models.ProformaInvoiceIssued;
import com.maxio.advancedbilling.models.RefundSuccess;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupFailure;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupSuccess;
import com.maxio.advancedbilling.models.SubscriptionProductChange;
import com.maxio.advancedbilling.models.SubscriptionStateChange;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = EventEventSpecificData.EventEventSpecificDataDeserializer.class)
public abstract class EventEventSpecificData {
    
    /**
     * This is Subscription Product Change case.
     * @param subscriptionProductChange SubscriptionProductChange value for subscriptionProductChange.
     * @return The SubscriptionProductChangeCase object.
     */
    public static EventEventSpecificData fromSubscriptionProductChange(
            SubscriptionProductChange subscriptionProductChange) {
        return subscriptionProductChange == null ? null : new SubscriptionProductChangeCase(subscriptionProductChange);
    }

    /**
     * This is Subscription State Change case.
     * @param subscriptionStateChange SubscriptionStateChange value for subscriptionStateChange.
     * @return The SubscriptionStateChangeCase object.
     */
    public static EventEventSpecificData fromSubscriptionStateChange(
            SubscriptionStateChange subscriptionStateChange) {
        return subscriptionStateChange == null ? null : new SubscriptionStateChangeCase(subscriptionStateChange);
    }

    /**
     * This is Payment Related Events case.
     * @param paymentRelatedEvents PaymentRelatedEvents value for paymentRelatedEvents.
     * @return The PaymentRelatedEventsCase object.
     */
    public static EventEventSpecificData fromPaymentRelatedEvents(
            PaymentRelatedEvents paymentRelatedEvents) {
        return paymentRelatedEvents == null ? null : new PaymentRelatedEventsCase(paymentRelatedEvents);
    }

    /**
     * This is Refund Success case.
     * @param refundSuccess RefundSuccess value for refundSuccess.
     * @return The RefundSuccessCase object.
     */
    public static EventEventSpecificData fromRefundSuccess(RefundSuccess refundSuccess) {
        return refundSuccess == null ? null : new RefundSuccessCase(refundSuccess);
    }

    /**
     * This is Component Allocation Change case.
     * @param componentAllocationChange ComponentAllocationChange value for componentAllocationChange.
     * @return The ComponentAllocationChangeCase object.
     */
    public static EventEventSpecificData fromComponentAllocationChange(
            ComponentAllocationChange componentAllocationChange) {
        return componentAllocationChange == null ? null : new ComponentAllocationChangeCase(componentAllocationChange);
    }

    /**
     * This is Metered Usage case.
     * @param meteredUsage MeteredUsage value for meteredUsage.
     * @return The MeteredUsageCase object.
     */
    public static EventEventSpecificData fromMeteredUsage(MeteredUsage meteredUsage) {
        return meteredUsage == null ? null : new MeteredUsageCase(meteredUsage);
    }

    /**
     * This is Prepaid Usage case.
     * @param prepaidUsage PrepaidUsage value for prepaidUsage.
     * @return The PrepaidUsageCase object.
     */
    public static EventEventSpecificData fromPrepaidUsage(PrepaidUsage prepaidUsage) {
        return prepaidUsage == null ? null : new PrepaidUsageCase(prepaidUsage);
    }

    /**
     * This is Dunning Step Reached case.
     * @param dunningStepReached DunningStepReached value for dunningStepReached.
     * @return The DunningStepReachedCase object.
     */
    public static EventEventSpecificData fromDunningStepReached(
            DunningStepReached dunningStepReached) {
        return dunningStepReached == null ? null : new DunningStepReachedCase(dunningStepReached);
    }

    /**
     * This is Invoice Issued case.
     * @param invoiceIssued InvoiceIssued value for invoiceIssued.
     * @return The InvoiceIssuedCase object.
     */
    public static EventEventSpecificData fromInvoiceIssued(InvoiceIssued invoiceIssued) {
        return invoiceIssued == null ? null : new InvoiceIssuedCase(invoiceIssued);
    }

    /**
     * This is Pending Cancellation Change case.
     * @param pendingCancellationChange PendingCancellationChange value for pendingCancellationChange.
     * @return The PendingCancellationChangeCase object.
     */
    public static EventEventSpecificData fromPendingCancellationChange(
            PendingCancellationChange pendingCancellationChange) {
        return pendingCancellationChange == null ? null : new PendingCancellationChangeCase(pendingCancellationChange);
    }

    /**
     * This is Prepaid Subscription Balance Changed case.
     * @param prepaidSubscriptionBalanceChanged PrepaidSubscriptionBalanceChanged value for prepaidSubscriptionBalanceChanged.
     * @return The PrepaidSubscriptionBalanceChangedCase object.
     */
    public static EventEventSpecificData fromPrepaidSubscriptionBalanceChanged(
            PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged) {
        return prepaidSubscriptionBalanceChanged == null ? null : new PrepaidSubscriptionBalanceChangedCase(prepaidSubscriptionBalanceChanged);
    }

    /**
     * This is Proforma Invoice Issued case.
     * @param proformaInvoiceIssued ProformaInvoiceIssued value for proformaInvoiceIssued.
     * @return The ProformaInvoiceIssuedCase object.
     */
    public static EventEventSpecificData fromProformaInvoiceIssued(
            ProformaInvoiceIssued proformaInvoiceIssued) {
        return proformaInvoiceIssued == null ? null : new ProformaInvoiceIssuedCase(proformaInvoiceIssued);
    }

    /**
     * This is Subscription Group Signup Success case.
     * @param subscriptionGroupSignupSuccess SubscriptionGroupSignupSuccess value for subscriptionGroupSignupSuccess.
     * @return The SubscriptionGroupSignupSuccessCase object.
     */
    public static EventEventSpecificData fromSubscriptionGroupSignupSuccess(
            SubscriptionGroupSignupSuccess subscriptionGroupSignupSuccess) {
        return subscriptionGroupSignupSuccess == null ? null : new SubscriptionGroupSignupSuccessCase(subscriptionGroupSignupSuccess);
    }

    /**
     * This is Subscription Group Signup Failure case.
     * @param subscriptionGroupSignupFailure SubscriptionGroupSignupFailure value for subscriptionGroupSignupFailure.
     * @return The SubscriptionGroupSignupFailureCase object.
     */
    public static EventEventSpecificData fromSubscriptionGroupSignupFailure(
            SubscriptionGroupSignupFailure subscriptionGroupSignupFailure) {
        return subscriptionGroupSignupFailure == null ? null : new SubscriptionGroupSignupFailureCase(subscriptionGroupSignupFailure);
    }

    /**
     * This is Credit Account Balance Changed case.
     * @param creditAccountBalanceChanged CreditAccountBalanceChanged value for creditAccountBalanceChanged.
     * @return The CreditAccountBalanceChangedCase object.
     */
    public static EventEventSpecificData fromCreditAccountBalanceChanged(
            CreditAccountBalanceChanged creditAccountBalanceChanged) {
        return creditAccountBalanceChanged == null ? null : new CreditAccountBalanceChangedCase(creditAccountBalanceChanged);
    }

    /**
     * This is Prepayment Account Balance Changed case.
     * @param prepaymentAccountBalanceChanged PrepaymentAccountBalanceChanged value for prepaymentAccountBalanceChanged.
     * @return The PrepaymentAccountBalanceChangedCase object.
     */
    public static EventEventSpecificData fromPrepaymentAccountBalanceChanged(
            PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged) {
        return prepaymentAccountBalanceChanged == null ? null : new PrepaymentAccountBalanceChangedCase(prepaymentAccountBalanceChanged);
    }

    /**
     * This is Payment Collection Method Changed case.
     * @param paymentCollectionMethodChanged PaymentCollectionMethodChanged value for paymentCollectionMethodChanged.
     * @return The PaymentCollectionMethodChangedCase object.
     */
    public static EventEventSpecificData fromPaymentCollectionMethodChanged(
            PaymentCollectionMethodChanged paymentCollectionMethodChanged) {
        return paymentCollectionMethodChanged == null ? null : new PaymentCollectionMethodChangedCase(paymentCollectionMethodChanged);
    }

    /**
     * This is Item Price Point Changed case.
     * @param itemPricePointChanged ItemPricePointChanged value for itemPricePointChanged.
     * @return The ItemPricePointChangedCase object.
     */
    public static EventEventSpecificData fromItemPricePointChanged(
            ItemPricePointChanged itemPricePointChanged) {
        return itemPricePointChanged == null ? null : new ItemPricePointChangedCase(itemPricePointChanged);
    }

    /**
     * This is Custom Field Value Change case.
     * @param customFieldValueChange CustomFieldValueChange value for customFieldValueChange.
     * @return The CustomFieldValueChangeCase object.
     */
    public static EventEventSpecificData fromCustomFieldValueChange(
            CustomFieldValueChange customFieldValueChange) {
        return customFieldValueChange == null ? null : new CustomFieldValueChangeCase(customFieldValueChange);
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
        R subscriptionProductChange(SubscriptionProductChange subscriptionProductChange);

        R subscriptionStateChange(SubscriptionStateChange subscriptionStateChange);

        R paymentRelatedEvents(PaymentRelatedEvents paymentRelatedEvents);

        R refundSuccess(RefundSuccess refundSuccess);

        R componentAllocationChange(ComponentAllocationChange componentAllocationChange);

        R meteredUsage(MeteredUsage meteredUsage);

        R prepaidUsage(PrepaidUsage prepaidUsage);

        R dunningStepReached(DunningStepReached dunningStepReached);

        R invoiceIssued(InvoiceIssued invoiceIssued);

        R pendingCancellationChange(PendingCancellationChange pendingCancellationChange);

        R prepaidSubscriptionBalanceChanged(PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged);

        R proformaInvoiceIssued(ProformaInvoiceIssued proformaInvoiceIssued);

        R subscriptionGroupSignupSuccess(SubscriptionGroupSignupSuccess subscriptionGroupSignupSuccess);

        R subscriptionGroupSignupFailure(SubscriptionGroupSignupFailure subscriptionGroupSignupFailure);

        R creditAccountBalanceChanged(CreditAccountBalanceChanged creditAccountBalanceChanged);

        R prepaymentAccountBalanceChanged(PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged);

        R paymentCollectionMethodChanged(PaymentCollectionMethodChanged paymentCollectionMethodChanged);

        R itemPricePointChanged(ItemPricePointChanged itemPricePointChanged);

        R customFieldValueChange(CustomFieldValueChange customFieldValueChange);
    }

    /**
     * This is a implementation class for SubscriptionProductChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionProductChange")
    private static class SubscriptionProductChangeCase extends EventEventSpecificData {

        @JsonValue
        private SubscriptionProductChange subscriptionProductChange;

        SubscriptionProductChangeCase(SubscriptionProductChange subscriptionProductChange) {
            this.subscriptionProductChange = subscriptionProductChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionProductChange(this.subscriptionProductChange);
        }

        @JsonCreator
        private SubscriptionProductChangeCase(JsonNode jsonNode) throws IOException {
            this.subscriptionProductChange = ApiHelper.deserialize(jsonNode,
                SubscriptionProductChange.class);
        }

        @Override
        public String toString() {
            return subscriptionProductChange.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionStateChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionStateChange")
    private static class SubscriptionStateChangeCase extends EventEventSpecificData {

        @JsonValue
        private SubscriptionStateChange subscriptionStateChange;

        SubscriptionStateChangeCase(SubscriptionStateChange subscriptionStateChange) {
            this.subscriptionStateChange = subscriptionStateChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionStateChange(this.subscriptionStateChange);
        }

        @JsonCreator
        private SubscriptionStateChangeCase(JsonNode jsonNode) throws IOException {
            this.subscriptionStateChange = ApiHelper.deserialize(jsonNode,
                SubscriptionStateChange.class);
        }

        @Override
        public String toString() {
            return subscriptionStateChange.toString();
        }
    }

    /**
     * This is a implementation class for PaymentRelatedEventsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentRelatedEvents")
    private static class PaymentRelatedEventsCase extends EventEventSpecificData {

        @JsonValue
        private PaymentRelatedEvents paymentRelatedEvents;

        PaymentRelatedEventsCase(PaymentRelatedEvents paymentRelatedEvents) {
            this.paymentRelatedEvents = paymentRelatedEvents;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentRelatedEvents(this.paymentRelatedEvents);
        }

        @JsonCreator
        private PaymentRelatedEventsCase(JsonNode jsonNode) throws IOException {
            this.paymentRelatedEvents = ApiHelper.deserialize(jsonNode,
                PaymentRelatedEvents.class);
        }

        @Override
        public String toString() {
            return paymentRelatedEvents.toString();
        }
    }

    /**
     * This is a implementation class for RefundSuccessCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundSuccess")
    private static class RefundSuccessCase extends EventEventSpecificData {

        @JsonValue
        private RefundSuccess refundSuccess;

        RefundSuccessCase(RefundSuccess refundSuccess) {
            this.refundSuccess = refundSuccess;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundSuccess(this.refundSuccess);
        }

        @JsonCreator
        private RefundSuccessCase(JsonNode jsonNode) throws IOException {
            this.refundSuccess = ApiHelper.deserialize(jsonNode,
                RefundSuccess.class);
        }

        @Override
        public String toString() {
            return refundSuccess.toString();
        }
    }

    /**
     * This is a implementation class for ComponentAllocationChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ComponentAllocationChange")
    private static class ComponentAllocationChangeCase extends EventEventSpecificData {

        @JsonValue
        private ComponentAllocationChange componentAllocationChange;

        ComponentAllocationChangeCase(ComponentAllocationChange componentAllocationChange) {
            this.componentAllocationChange = componentAllocationChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.componentAllocationChange(this.componentAllocationChange);
        }

        @JsonCreator
        private ComponentAllocationChangeCase(JsonNode jsonNode) throws IOException {
            this.componentAllocationChange = ApiHelper.deserialize(jsonNode,
                ComponentAllocationChange.class);
        }

        @Override
        public String toString() {
            return componentAllocationChange.toString();
        }
    }

    /**
     * This is a implementation class for MeteredUsageCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MeteredUsage")
    private static class MeteredUsageCase extends EventEventSpecificData {

        @JsonValue
        private MeteredUsage meteredUsage;

        MeteredUsageCase(MeteredUsage meteredUsage) {
            this.meteredUsage = meteredUsage;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.meteredUsage(this.meteredUsage);
        }

        @JsonCreator
        private MeteredUsageCase(JsonNode jsonNode) throws IOException {
            this.meteredUsage = ApiHelper.deserialize(jsonNode,
                MeteredUsage.class);
        }

        @Override
        public String toString() {
            return meteredUsage.toString();
        }
    }

    /**
     * This is a implementation class for PrepaidUsageCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PrepaidUsage")
    private static class PrepaidUsageCase extends EventEventSpecificData {

        @JsonValue
        private PrepaidUsage prepaidUsage;

        PrepaidUsageCase(PrepaidUsage prepaidUsage) {
            this.prepaidUsage = prepaidUsage;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.prepaidUsage(this.prepaidUsage);
        }

        @JsonCreator
        private PrepaidUsageCase(JsonNode jsonNode) throws IOException {
            this.prepaidUsage = ApiHelper.deserialize(jsonNode,
                PrepaidUsage.class);
        }

        @Override
        public String toString() {
            return prepaidUsage.toString();
        }
    }

    /**
     * This is a implementation class for DunningStepReachedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "DunningStepReached")
    private static class DunningStepReachedCase extends EventEventSpecificData {

        @JsonValue
        private DunningStepReached dunningStepReached;

        DunningStepReachedCase(DunningStepReached dunningStepReached) {
            this.dunningStepReached = dunningStepReached;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dunningStepReached(this.dunningStepReached);
        }

        @JsonCreator
        private DunningStepReachedCase(JsonNode jsonNode) throws IOException {
            this.dunningStepReached = ApiHelper.deserialize(jsonNode,
                DunningStepReached.class);
        }

        @Override
        public String toString() {
            return dunningStepReached.toString();
        }
    }

    /**
     * This is a implementation class for InvoiceIssuedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "InvoiceIssued")
    private static class InvoiceIssuedCase extends EventEventSpecificData {

        @JsonValue
        private InvoiceIssued invoiceIssued;

        InvoiceIssuedCase(InvoiceIssued invoiceIssued) {
            this.invoiceIssued = invoiceIssued;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.invoiceIssued(this.invoiceIssued);
        }

        @JsonCreator
        private InvoiceIssuedCase(JsonNode jsonNode) throws IOException {
            this.invoiceIssued = ApiHelper.deserialize(jsonNode,
                InvoiceIssued.class);
        }

        @Override
        public String toString() {
            return invoiceIssued.toString();
        }
    }

    /**
     * This is a implementation class for PendingCancellationChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PendingCancellationChange")
    private static class PendingCancellationChangeCase extends EventEventSpecificData {

        @JsonValue
        private PendingCancellationChange pendingCancellationChange;

        PendingCancellationChangeCase(PendingCancellationChange pendingCancellationChange) {
            this.pendingCancellationChange = pendingCancellationChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pendingCancellationChange(this.pendingCancellationChange);
        }

        @JsonCreator
        private PendingCancellationChangeCase(JsonNode jsonNode) throws IOException {
            this.pendingCancellationChange = ApiHelper.deserialize(jsonNode,
                PendingCancellationChange.class);
        }

        @Override
        public String toString() {
            return pendingCancellationChange.toString();
        }
    }

    /**
     * This is a implementation class for PrepaidSubscriptionBalanceChangedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PrepaidSubscriptionBalanceChanged")
    private static class PrepaidSubscriptionBalanceChangedCase extends EventEventSpecificData {

        @JsonValue
        private PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged;

        PrepaidSubscriptionBalanceChangedCase(PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged) {
            this.prepaidSubscriptionBalanceChanged = prepaidSubscriptionBalanceChanged;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.prepaidSubscriptionBalanceChanged(this.prepaidSubscriptionBalanceChanged);
        }

        @JsonCreator
        private PrepaidSubscriptionBalanceChangedCase(JsonNode jsonNode) throws IOException {
            this.prepaidSubscriptionBalanceChanged = ApiHelper.deserialize(jsonNode,
                PrepaidSubscriptionBalanceChanged.class);
        }

        @Override
        public String toString() {
            return prepaidSubscriptionBalanceChanged.toString();
        }
    }

    /**
     * This is a implementation class for ProformaInvoiceIssuedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ProformaInvoiceIssued")
    private static class ProformaInvoiceIssuedCase extends EventEventSpecificData {

        @JsonValue
        private ProformaInvoiceIssued proformaInvoiceIssued;

        ProformaInvoiceIssuedCase(ProformaInvoiceIssued proformaInvoiceIssued) {
            this.proformaInvoiceIssued = proformaInvoiceIssued;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.proformaInvoiceIssued(this.proformaInvoiceIssued);
        }

        @JsonCreator
        private ProformaInvoiceIssuedCase(JsonNode jsonNode) throws IOException {
            this.proformaInvoiceIssued = ApiHelper.deserialize(jsonNode,
                ProformaInvoiceIssued.class);
        }

        @Override
        public String toString() {
            return proformaInvoiceIssued.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionGroupSignupSuccessCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionGroupSignupSuccess")
    private static class SubscriptionGroupSignupSuccessCase extends EventEventSpecificData {

        @JsonValue
        private SubscriptionGroupSignupSuccess subscriptionGroupSignupSuccess;

        SubscriptionGroupSignupSuccessCase(SubscriptionGroupSignupSuccess subscriptionGroupSignupSuccess) {
            this.subscriptionGroupSignupSuccess = subscriptionGroupSignupSuccess;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionGroupSignupSuccess(this.subscriptionGroupSignupSuccess);
        }

        @JsonCreator
        private SubscriptionGroupSignupSuccessCase(JsonNode jsonNode) throws IOException {
            this.subscriptionGroupSignupSuccess = ApiHelper.deserialize(jsonNode,
                SubscriptionGroupSignupSuccess.class);
        }

        @Override
        public String toString() {
            return subscriptionGroupSignupSuccess.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionGroupSignupFailureCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionGroupSignupFailure")
    private static class SubscriptionGroupSignupFailureCase extends EventEventSpecificData {

        @JsonValue
        private SubscriptionGroupSignupFailure subscriptionGroupSignupFailure;

        SubscriptionGroupSignupFailureCase(SubscriptionGroupSignupFailure subscriptionGroupSignupFailure) {
            this.subscriptionGroupSignupFailure = subscriptionGroupSignupFailure;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionGroupSignupFailure(this.subscriptionGroupSignupFailure);
        }

        @JsonCreator
        private SubscriptionGroupSignupFailureCase(JsonNode jsonNode) throws IOException {
            this.subscriptionGroupSignupFailure = ApiHelper.deserialize(jsonNode,
                SubscriptionGroupSignupFailure.class);
        }

        @Override
        public String toString() {
            return subscriptionGroupSignupFailure.toString();
        }
    }

    /**
     * This is a implementation class for CreditAccountBalanceChangedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreditAccountBalanceChanged")
    private static class CreditAccountBalanceChangedCase extends EventEventSpecificData {

        @JsonValue
        private CreditAccountBalanceChanged creditAccountBalanceChanged;

        CreditAccountBalanceChangedCase(CreditAccountBalanceChanged creditAccountBalanceChanged) {
            this.creditAccountBalanceChanged = creditAccountBalanceChanged;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.creditAccountBalanceChanged(this.creditAccountBalanceChanged);
        }

        @JsonCreator
        private CreditAccountBalanceChangedCase(JsonNode jsonNode) throws IOException {
            this.creditAccountBalanceChanged = ApiHelper.deserialize(jsonNode,
                CreditAccountBalanceChanged.class);
        }

        @Override
        public String toString() {
            return creditAccountBalanceChanged.toString();
        }
    }

    /**
     * This is a implementation class for PrepaymentAccountBalanceChangedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PrepaymentAccountBalanceChanged")
    private static class PrepaymentAccountBalanceChangedCase extends EventEventSpecificData {

        @JsonValue
        private PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged;

        PrepaymentAccountBalanceChangedCase(PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged) {
            this.prepaymentAccountBalanceChanged = prepaymentAccountBalanceChanged;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.prepaymentAccountBalanceChanged(this.prepaymentAccountBalanceChanged);
        }

        @JsonCreator
        private PrepaymentAccountBalanceChangedCase(JsonNode jsonNode) throws IOException {
            this.prepaymentAccountBalanceChanged = ApiHelper.deserialize(jsonNode,
                PrepaymentAccountBalanceChanged.class);
        }

        @Override
        public String toString() {
            return prepaymentAccountBalanceChanged.toString();
        }
    }

    /**
     * This is a implementation class for PaymentCollectionMethodChangedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentCollectionMethodChanged")
    private static class PaymentCollectionMethodChangedCase extends EventEventSpecificData {

        @JsonValue
        private PaymentCollectionMethodChanged paymentCollectionMethodChanged;

        PaymentCollectionMethodChangedCase(PaymentCollectionMethodChanged paymentCollectionMethodChanged) {
            this.paymentCollectionMethodChanged = paymentCollectionMethodChanged;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentCollectionMethodChanged(this.paymentCollectionMethodChanged);
        }

        @JsonCreator
        private PaymentCollectionMethodChangedCase(JsonNode jsonNode) throws IOException {
            this.paymentCollectionMethodChanged = ApiHelper.deserialize(jsonNode,
                PaymentCollectionMethodChanged.class);
        }

        @Override
        public String toString() {
            return paymentCollectionMethodChanged.toString();
        }
    }

    /**
     * This is a implementation class for ItemPricePointChangedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ItemPricePointChanged")
    private static class ItemPricePointChangedCase extends EventEventSpecificData {

        @JsonValue
        private ItemPricePointChanged itemPricePointChanged;

        ItemPricePointChangedCase(ItemPricePointChanged itemPricePointChanged) {
            this.itemPricePointChanged = itemPricePointChanged;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.itemPricePointChanged(this.itemPricePointChanged);
        }

        @JsonCreator
        private ItemPricePointChangedCase(JsonNode jsonNode) throws IOException {
            this.itemPricePointChanged = ApiHelper.deserialize(jsonNode,
                ItemPricePointChanged.class);
        }

        @Override
        public String toString() {
            return itemPricePointChanged.toString();
        }
    }

    /**
     * This is a implementation class for CustomFieldValueChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CustomFieldValueChange")
    private static class CustomFieldValueChangeCase extends EventEventSpecificData {

        @JsonValue
        private CustomFieldValueChange customFieldValueChange;

        CustomFieldValueChangeCase(CustomFieldValueChange customFieldValueChange) {
            this.customFieldValueChange = customFieldValueChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.customFieldValueChange(this.customFieldValueChange);
        }

        @JsonCreator
        private CustomFieldValueChangeCase(JsonNode jsonNode) throws IOException {
            this.customFieldValueChange = ApiHelper.deserialize(jsonNode,
                CustomFieldValueChange.class);
        }

        @Override
        public String toString() {
            return customFieldValueChange.toString();
        }
    }

    /**
     * This is a custom deserializer class for EventEventSpecificData.
     */
    protected static class EventEventSpecificDataDeserializer
            extends JsonDeserializer<EventEventSpecificData> {

        @Override
        public EventEventSpecificData deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(SubscriptionProductChangeCase.class,
                    SubscriptionStateChangeCase.class, PaymentRelatedEventsCase.class,
                    RefundSuccessCase.class, ComponentAllocationChangeCase.class,
                    MeteredUsageCase.class, PrepaidUsageCase.class, DunningStepReachedCase.class,
                    InvoiceIssuedCase.class, PendingCancellationChangeCase.class,
                    PrepaidSubscriptionBalanceChangedCase.class, ProformaInvoiceIssuedCase.class,
                    SubscriptionGroupSignupSuccessCase.class,
                    SubscriptionGroupSignupFailureCase.class, CreditAccountBalanceChangedCase.class,
                    PrepaymentAccountBalanceChangedCase.class,
                    PaymentCollectionMethodChangedCase.class, ItemPricePointChangedCase.class,
                    CustomFieldValueChangeCase.class), true);
        }
    }

}
