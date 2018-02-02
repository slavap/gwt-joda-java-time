package com.vx.jtime.client;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;

import com.google.gwt.core.client.EntryPoint;

public class EntryJTime implements EntryPoint {

    @Override
    public void onModuleLoad() {
        //javaTimeTests(text -> Window.alert(text));
    }

    public static interface ILog {
        void log(String text);
    }

    @SuppressWarnings("deprecation")
    public static void javaTimeTests(ILog out) {
        // Test for: Fri Nov 28 1941 23:00:00 GMT+0000
        final long millis1941 = -886467600000L;
        Date dd0 = new Date(millis1941);
        ZonedDateTime dd1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("GMT"));
        ZonedDateTime dd2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("CET"));
        ZonedDateTime dd3 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Rome"));
        ZonedDateTime dd4 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Berlin"));
        if (out != null) out.log(dd0.toGMTString() + "\n" + dd1.toString() + "\n" + dd2.toString() + "\n" + dd3.toString() + "\n" + dd4.toString());

        LocalDateTime d0 = LocalDateTime.parse("2012-12-24T01:02:03").plusMonths(2); // 2013-02-24T01:02:03
        LocalDateTime d1 = LocalDateTime.parse("2017-12-24T01:02:03").plusMonths(2); // 2018-02-24T01:02:03
        Class<?> clz0 = d0.getClass();
        Class<?> clz1 = d1.getClass();
        Class<?> clzM = LocalDateTime.class;
        if (clz0.equals(clz1) && clzM.equals(clz0)) {
            if (out != null) out.log(clzM.getName() + " is OK"
                    + "\n" + d0.toString() + " " + d0.getClass().getName()
                    + "\n" + d1.toString() + " " + d1.getClass().getName()
            );
        }

        Set<String> zones = ZoneId.getAvailableZoneIds();
        String z = "";
        for (String j : zones) z += j + "\n";
        if (out != null) out.log(z);

        String zone = getClientTimezone();
        // Example: for 1951 PST -> PDT was changed on Sun, Apr 29, 2:00 AM
        // But 04/04/1951 is PDT(-7h) in JsDate (which is wrong) and PST(-8h) in Java Date and moment.tz (which is right).
        // Wed Apr 04 1951 01:00:00 GMT-0800
        final long millis1951 = -591548400000L;
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1951), ZoneId.of("America/Los_Angeles"));
        Date ddMillis = new Date(millis1951);
        Date ddYYMMDD = new Date(51, 3, 4, 1, 0, 0);
        double zoneOffset = getZoneOffset(zone, millis1951);
        if (out != null) out.log("Browser's zone: " + zone
                + "\n This zone moment.tz offset: " + millis1951 + " | " + zoneOffset
                + "\n gwt-joda-java-time ZonedDateTime: " + zdt.toString() + "; offset: " + zdt.getOffset().getTotalSeconds() / 60
                + "\n GWT Date >> ddMillis vs ddYYMMDD: " + ddMillis.getTime() + " vs " + ddYYMMDD.getTime()
                + "\n ddMillis: " + ddMillis.toString() + "; offset: " + ddMillis.getTimezoneOffset()
                + "\n ddYYMMDD: " + ddYYMMDD.toString() + "; offset: " + ddYYMMDD.getTimezoneOffset()
        );
    }

    private static native String getClientTimezone() /*-{
        return $wnd.moment.tz.guess();
    }-*/;

    private static native double getZoneOffset(String zone, double timestamp) /*-{
        return $wnd.moment.tz.zone(zone).utcOffset(timestamp);
    }-*/;

}
