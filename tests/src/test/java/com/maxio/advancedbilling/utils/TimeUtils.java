package com.maxio.advancedbilling.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    private static final SimpleDateFormat AB_DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
    private static final SimpleDateFormat TRUNCATED_DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd");

    public static Date parseStringTimestamp(String source) throws ParseException {
        return AB_DATE_FORMAT.parse(source);
    }

    public static String toTimestamp(Date source) {
        return AB_DATE_FORMAT.format(source);
    }

    public static String toTruncatedTimestamp(Date source) {
        return TRUNCATED_DATE_FORMAT.format(source);
    }

}
