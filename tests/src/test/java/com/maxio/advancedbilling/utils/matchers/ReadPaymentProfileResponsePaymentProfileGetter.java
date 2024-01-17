package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.containers.ReadPaymentProfileResponsePaymentProfile;

public class ReadPaymentProfileResponsePaymentProfileGetter<R> implements ReadPaymentProfileResponsePaymentProfile.Cases<R> {
    @Override
    public R bankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile) {
        return (R) bankAccountPaymentProfile;
    }

    @Override
    public R creditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile) {
        return (R) creditCardPaymentProfile;
    }
}
