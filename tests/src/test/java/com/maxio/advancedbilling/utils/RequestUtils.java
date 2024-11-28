package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.models.UpdateSubscriptionNote;
import com.maxio.advancedbilling.models.UpdateSubscriptionNoteRequest;

public final class RequestUtils {
    private RequestUtils() {
    }

    public static UpdateSubscriptionNoteRequest createNoteBody(String note, boolean sticky) {
        return new UpdateSubscriptionNoteRequest(new UpdateSubscriptionNote(note, sticky));
    }
}
