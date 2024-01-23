package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.containers.PaymentProfileResponsePaymentProfile;

public class PaymentProfileResponsePaymentProfileGetter<R> implements PaymentProfileResponsePaymentProfile.Cases<R> {
    @Override
    public R bankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile) {
        return (R) bankAccountPaymentProfile;
    }

    @Override
    public R creditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile) {
        return (R) creditCardPaymentProfile;
    }
}
