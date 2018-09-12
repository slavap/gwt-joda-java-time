package com.vx.jtime.client;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Window;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class EntryJTime implements EntryPoint {

    @JsType(isNative = true, namespace = JsPackage.GLOBAL)
    public static class JsMisc {
        @JsProperty(namespace = JsPackage.GLOBAL)
        public static boolean testGwtJodaJavaTime;
    }

    @JsType(isNative = true)
    public static interface Zone {
        double utcOffset(double timestamp);
    }

    @JsType(isNative = true)
    public static interface MomentTz {
        String guess();
        Zone zone(String value);
    }

    @JsType(isNative = true)
    public static class Moment {
        @JsProperty(namespace = JsPackage.GLOBAL, name = "moment.tz")
        public static MomentTz tz;
    }

    @Override
    public void onModuleLoad() {
        if (JsMisc.testGwtJodaJavaTime) {
            final Element results = Document.get().getElementById("resultsGwt");
            javaTimeTests(text -> {
                if (results == null) Window.alert(text);
                else {
                    text = text.replaceAll("\\n", "<br>");
                    String s = results.getInnerHTML();
                    if (!s.isEmpty()) s += "<br><br>";
                    s += text;
                    results.setInnerHTML(s);
                }
            });
        }
    }

    public static interface ILog {
        void log(String text);
    }

    @SuppressWarnings("deprecation")
    public static void javaTimeTests(ILog out) {
        if (out != null) {
            out.log("========== GWT java.time Tests: ==========\n");
        }
        // Test for: Fri Nov 28 1941 23:00:00 GMT+0000
        final long millis1941 = -886467600000L;
        Date dd0 = new Date(millis1941);
        ZonedDateTime dd1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("GMT"));
        ZonedDateTime dd2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("CET"));
        ZonedDateTime dd3 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Rome"));
        ZonedDateTime dd4 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Berlin"));
        if (out != null) {
            out.log("ZonedDateTime test of CET(UTC+2) == Berlin == Rome: Fri Nov 28 1941 23:00:00 GMT+0000"
                    + "\nGWT Date(millis1941).toGMTString(): " + dd0.toGMTString()
                    + "\n" + dd1.toString() + "\n" + dd2.toString() + "\n" + dd3.toString() + "\n" + dd4.toString());
        }

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
        String z = "ZoneId.getAvailableZoneIds() test:\n";
        for (String j : zones) z += j + "\n";
        if (out != null) out.log(z);

        final String zone = Moment.tz.guess();
        // Example: for 1951 PST -> PDT was changed on Sun, Apr 29, 2:00 AM
        // But 04/04/1951 is PDT(-7h) in JsDate (which is wrong) and PST(-8h) in Java Date and moment.tz (which is right).
        // Wed Apr 04 1951 01:00:00 GMT-0800
        final long millis1951 = -591548400000L;
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1951), ZoneId.of("America/Los_Angeles"));
        Date ddMillis = new Date(millis1951);
        Date ddYYMMDD = new Date(51, 3, 4, 1, 0, 0);
        double zoneOffset = Moment.tz.zone(zone).utcOffset(millis1951);
        if (out != null) out.log("Test for: Wed Apr 04 1951 01:00:00 GMT-0800 [America/Los_Angeles]"
                + "\n Browser's zone: " + zone
                + "\n moment.tz milliseconds and offset: " + millis1951 + " | " + zoneOffset
                + "\n gwt-joda-java-time ZonedDateTime: " + zdt.toString() + "; offset: " + zdt.getOffset().getTotalSeconds() / 60
                + "\n GWT Date getTime() >> Date(millis1951) vs Date(51, 3, 4, 1, 0, 0): " + ddMillis.getTime() + " vs " + ddYYMMDD.getTime()
                + "\n Date(millis1951).toString(): " + ddMillis.toString() + "; offset: " + ddMillis.getTimezoneOffset()
                + "\n Date(51, 3, 4, 1, 0, 0).toString(): " + ddYYMMDD.toString() + "; offset: " + ddYYMMDD.getTimezoneOffset()
        );

        ZonedDateTime zdt01 = ZonedDateTime.parse("2011-12-03T10:15:30+01:00[Europe/Paris]", DateTimeFormatter.ISO_ZONED_DATE_TIME);
        LocalDateTime ldt01 = LocalDateTime.parse("2011-12-03T10:15:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        if (out != null) out.log("Test for DateTimeFormatter: 2011-12-03T10:15:30+01:00[Europe/Paris]"
                + "\nZonedDateTime: " + zdt01.toString()
                + "\nLocalDateTime: " + ldt01.toString());

        ZonedDateTime zdt02 = LocalDateTime.parse("2016-06-30T11:30").atZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime zdt03 = ZonedDateTime.parse("2016-06-30T11:30+02:00[Europe/Berlin]")
                .withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime zdt04 = ZonedDateTime.parse("2016-06-30T11:30+02:00[Europe/Berlin]")
                .withZoneSameLocal(ZoneId.of("America/New_York"));
        ZonedDateTime zdt05 = ZonedDateTime.of(LocalDateTime.parse("2016-06-30T11:30"),
                ZoneId.ofOffset("", ZoneOffset.ofHours(-8)));
        ZonedDateTime zdt06 = ZonedDateTime.parse("2016-06-30T11:30-08:00");

        if (out != null) out.log("Tests for ZonedDateTime: "
                + "\nExpected: 2016-06-30T11:30+02:00[Europe/Berlin]"
                + "\nActual: " + zdt02.toString()
                + "\nExpected: 2016-06-30T05:30-04:00[America/New_York]"
                + "\nActual: " + zdt03.toString()
                + "\nExpected: 2016-06-30T11:30-04:00[America/New_York]"
                + "\nActual: " + zdt04.toString()
                + "\nExpected: 2016-06-30T11:30-08:00"
                + "\nActual: " + zdt05.toString()
                + "\nZonedDateTime.parse(\"2016-06-30T11:30-08:00\") is " + zdt06.toString()
            );

        final long msec19400526Moscow = -934167600000L; // Sun May 26 1940 00:00:00 GMT+0300
        double zoneOffset10 = Moment.tz.zone(zone).utcOffset(msec19400526Moscow);
        Date d10 = new Date(msec19400526Moscow);
        JsDate jsd10 = JsDate.create(msec19400526Moscow);
        JsDate jsd10a = JsDate.create(1940, 4, 26, 0, 0, 0, 0);
        Date d10a = new Date(40, 4, 26, 0, 0, 0);
        ZonedDateTime zdt10m = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt10u = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("UTC"));
        ZonedDateTime zdt10r = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("Asia/Riyadh"));

        if (out != null) out.log("Test for: Sun May 26 1940 00:00:00 GMT+0300 [Europe/Moscow]"
                + "\n Browser's zone: " + zone
                + "\n moment.tz milliseconds and offset: " + msec19400526Moscow + " | " + zoneOffset10
                + "\n gwt-joda-java-time ZonedDateTime Moscow: " + zdt10m.toString() + "; offset: " + zdt10m.getOffset().getTotalSeconds() / 60
                + "\n gwt-joda-java-time ZonedDateTime UTC: "    + zdt10u.toString() + "; offset: " + zdt10u.getOffset().getTotalSeconds() / 60
                + "\n gwt-joda-java-time ZonedDateTime Riyadh: " + zdt10r.toString() + "; offset: " + zdt10r.getOffset().getTotalSeconds() / 60
                + "\n JsDate.toUTCString() and getTimezoneOffset(): " + jsd10.toUTCString() + " | " + jsd10.getTimezoneOffset()
                + "\n Date().toString() and toGMTString() and getTimezoneOffset(): "
                + d10.toString() + " | " + d10.toGMTString() + " | " + d10.getTimezoneOffset()
                + "\n JsDate(1940, 4, 26, 0, 0, 0, 0).getTime() and diff with msec19400526Moscow and and getTimezoneOffset(): "
                + jsd10a.getTime() +  " | " + (msec19400526Moscow - jsd10a.getTime()) / (1000 * 60) + " | " + jsd10a.getTimezoneOffset()
                + "\n Date(40, 4, 26, 0, 0, 0).getTime() and diff with msec19400526Moscow and getTimezoneOffset(): "
                + d10a.getTime() + " | " + (msec19400526Moscow - d10a.getTime()) / (1000 * 60) + " | " + d10a.getTimezoneOffset()
            );
    }

}
