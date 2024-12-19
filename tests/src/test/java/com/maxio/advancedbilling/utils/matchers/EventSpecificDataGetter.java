package com.maxio.advancedbilling.utils.matchers;

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
import com.maxio.advancedbilling.models.SubscriptionGroupSignupEventData;
import com.maxio.advancedbilling.models.SubscriptionProductChange;
import com.maxio.advancedbilling.models.SubscriptionStateChange;
import com.maxio.advancedbilling.models.containers.EventEventSpecificData;

public class EventSpecificDataGetter<R> implements EventEventSpecificData.Cases<R> {

    @Override
    public R subscriptionProductChange(SubscriptionProductChange subscriptionProductChange) {
        return (R) subscriptionProductChange;
    }

    @Override
    public R subscriptionStateChange(SubscriptionStateChange subscriptionStateChange) {
        return (R) subscriptionStateChange;
    }

    @Override
    public R paymentRelatedEvents(PaymentRelatedEvents paymentRelatedEvents) {
        return (R) paymentRelatedEvents;
    }

    @Override
    public R refundSuccess(RefundSuccess refundSuccess) {
        return (R) refundSuccess;
    }

    @Override
    public R componentAllocationChange(ComponentAllocationChange componentAllocationChange) {
        return (R) componentAllocationChange;
    }

    @Override
    public R meteredUsage(MeteredUsage meteredUsage) {
        return (R) meteredUsage;
    }

    @Override
    public R prepaidUsage(PrepaidUsage prepaidUsage) {
        return (R) prepaidUsage;
    }

    @Override
    public R dunningStepReached(DunningStepReached dunningStepReached) {
        return (R) dunningStepReached;
    }

    @Override
    public R invoiceIssued(InvoiceIssued invoiceIssued) {
        return (R) invoiceIssued;
    }

    @Override
    public R pendingCancellationChange(PendingCancellationChange pendingCancellationChange) {
        return (R) pendingCancellationChange;
    }

    @Override
    public R prepaidSubscriptionBalanceChanged(PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged) {
        return (R) prepaidSubscriptionBalanceChanged;
    }

    @Override
    public R proformaInvoiceIssued(ProformaInvoiceIssued proformaInvoiceIssued) {
        return (R) proformaInvoiceIssued;
    }

    @Override
    public R subscriptionGroupSignupEventData(SubscriptionGroupSignupEventData subscriptionGroupSignupEventData) {
        return (R) subscriptionGroupSignupEventData;
    }

    @Override
    public R creditAccountBalanceChanged(CreditAccountBalanceChanged creditAccountBalanceChanged) {
        return (R) creditAccountBalanceChanged;
    }

    @Override
    public R prepaymentAccountBalanceChanged(PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged) {
        return (R) prepaymentAccountBalanceChanged;
    }

    @Override
    public R paymentCollectionMethodChanged(PaymentCollectionMethodChanged paymentCollectionMethodChanged) {
        return (R) paymentCollectionMethodChanged;
    }

    @Override
    public R itemPricePointChanged(ItemPricePointChanged itemPricePointChanged) {
        return (R) itemPricePointChanged;
    }

    @Override
    public R customFieldValueChange(CustomFieldValueChange customFieldValueChange) {
        return (R) customFieldValueChange;
    }
}
