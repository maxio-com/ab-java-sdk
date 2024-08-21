package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.ApplePayPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.PaypalPaymentProfile;
import com.maxio.advancedbilling.models.containers.PaymentProfile;

public class PaymentProfileResponsePaymentProfileGetter<R> implements PaymentProfile.Cases<R> {
    @Override
    public R applePayPaymentProfile(ApplePayPaymentProfile applePayPaymentProfile) {
        return (R) applePayPaymentProfile;
    }

    @Override
    public R bankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile) {
        return (R) bankAccountPaymentProfile;
    }

    @Override
    public R creditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile) {
        return (R) creditCardPaymentProfile;
    }

    @Override
    public R paypalPaymentProfile(PaypalPaymentProfile paypalPaymentProfile) {
        return (R) paypalPaymentProfile;
    }
}
