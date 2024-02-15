package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.InvoicePrePayment;
import com.maxio.advancedbilling.models.containers.RecordPaymentResponsePrepayment;

public class RecordPaymentResponsePrepaymentGetter implements RecordPaymentResponsePrepayment.Cases<InvoicePrePayment> {
    @Override
    public InvoicePrePayment invoicePrePayment(InvoicePrePayment invoicePrePayment) {
        return invoicePrePayment;
    }
}
