package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.CustomerError;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;

import java.util.List;

public class CustomerErrorResponseErrorsGetter<R> implements CustomerErrorResponseErrors.Cases<R> {
    @Override
    public R customerError(CustomerError customerError) {
        return (R) customerError;
    }

    @Override
    public R listOfString(List<String> listOfString) {
        return (R) listOfString;
    }
}
