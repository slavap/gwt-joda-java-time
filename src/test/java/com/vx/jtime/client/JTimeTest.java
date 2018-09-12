package com.vx.jtime.client;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Logger;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.junit.client.GWTTestCase;

public class JTimeTest extends GWTTestCase {

    /**
     * Specifies a module to use when running this test case. The returned
     * module must include the source for this class.
     *
     * @see com.google.gwt.junit.client.GWTTestCase#getModuleName()
     */
    @Override
    public String getModuleName() {
        return "com.vx.jtime.JTime";
    }

    private static Logger log = Logger.getLogger("JTimeTest");

    @SuppressWarnings("deprecation")
    private static void execJavaTime() {
        ZonedDateTime zdt01 = ZonedDateTime.parse("2011-12-03T10:15:30+01:00[Europe/Paris]", DateTimeFormatter.ISO_ZONED_DATE_TIME);
        assertEquals("2011-12-03T10:15:30+01:00[Europe/Paris]", zdt01.toString());
		LocalDateTime ldt01 = LocalDateTime.parse("2011-12-03T10:15:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		assertEquals("2011-12-03T10:15:30", ldt01.toString());
		log.info("PASSED - DateTimeFormatter test");

        ZonedDateTime zdt02 = LocalDateTime.parse("2016-06-30T11:30").atZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime zdt03 = ZonedDateTime.parse("2016-06-30T11:30+02:00[Europe/Berlin]")
                .withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime zdt04 = ZonedDateTime.parse("2016-06-30T11:30+02:00[Europe/Berlin]")
                .withZoneSameLocal(ZoneId.of("America/New_York"));

        assertEquals("2016-06-30T11:30+02:00[Europe/Berlin]", zdt02.toString());
        assertEquals("2016-06-30T05:30-04:00[America/New_York]", zdt03.toString());
        assertEquals("2016-06-30T11:30-04:00[America/New_York]", zdt04.toString());
        log.info("PASSED - ZonedDateTime.parse() with zones test");

        ZonedDateTime zdt05 = ZonedDateTime.of(LocalDateTime.parse("2016-06-30T11:30"),
                ZoneId.ofOffset("", ZoneOffset.ofHours(-8)));
        ZonedDateTime zdt06 = ZonedDateTime.parse("2016-06-30T11:30-08:00");
        assertEquals("2016-06-30T11:30-08:00", zdt05.toString());
        assertEquals("2016-06-30T11:30-08:00", zdt06.toString());
        log.info("PASSED - make sure OffsetDateTime.toZonedDateTime() format without IANA zone is supported");

		// Test for: Fri Nov 28 1941 23:00:00 GMT+0000
        final long millis1941 = -886467600000L;
        Date dd0 = new Date(millis1941);
        ZonedDateTime dd1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("GMT"));
        ZonedDateTime dd2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("CET"));
        ZonedDateTime dd3 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Rome"));
        ZonedDateTime dd4 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1941), ZoneId.of("Europe/Berlin"));
        assertEquals("28 Nov 1941 23:00:00 GMT", dd0.toGMTString());
        assertEquals("1941-11-28T23:00Z[GMT]", dd1.toString());
        assertEquals("1941-11-29T01:00+02:00[CET]", dd2.toString());
        assertEquals("1941-11-29T01:00+02:00[Europe/Rome]", dd3.toString());
        assertEquals("1941-11-29T01:00+02:00[Europe/Berlin]", dd4.toString());
        log.info("PASSED - ZonedDateTime test of CET(UTC+2) == Berlin == Rome: Fri Nov 28 1941 23:00:00 GMT+0000");

        LocalDateTime d0 = LocalDateTime.parse("2012-12-24T01:02:03").plusMonths(2);
        LocalDateTime d1 = LocalDateTime.parse("2017-12-24T01:02:03").plusMonths(2);
        assertEquals("2013-02-24T01:02:03", d0.toString());
        assertEquals("2018-02-24T01:02:03", d1.toString());
        log.info("PASSED - LocalDateTime.parse().plusMonths()");

        // Example: for 1951 PST -> PDT was changed on Sun, Apr 29, 2:00 AM
        // But 04/04/1951 is PDT(-7h) in JsDate (which is wrong) and PST(-8h) in Java Date and moment.tz (which is right).
        // Wed Apr 04 1951 01:00:00 GMT-0800
        final long millis1951 = -591548400000L;
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis1951), ZoneId.of("America/Los_Angeles"));
        assertEquals("1951-04-04T01:00-08:00[America/Los_Angeles]", zdt.toString());
        assertEquals(-480, zdt.getOffset().getTotalSeconds() / 60);
        log.info("PASSED - ZonedDateTime test of 04/04/1951 01:00 is PST(-8h) in Los_Angeles");

        final long msec19400526Moscow = -934167600000L; // Sun May 26 1940 00:00:00 GMT+0300
        ZonedDateTime zdt10m = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt10u = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("UTC"));
        ZonedDateTime zdt10r = ZonedDateTime.ofInstant(Instant.ofEpochMilli(msec19400526Moscow), ZoneId.of("Asia/Riyadh"));
        assertEquals("1940-05-26T00:00+03:00[Europe/Moscow]", zdt10m.toString());
        assertEquals("1940-05-25T21:00Z[UTC]", zdt10u.toString());
        assertEquals("1940-05-26T00:06:52+03:06:52[Asia/Riyadh]", zdt10r.toString());
        assertEquals(zdt10m.getOffset().getTotalSeconds() / 60, 180);
        assertEquals(zdt10u.getOffset().getTotalSeconds() / 60, 0);
        assertEquals(zdt10r.getOffset().getTotalSeconds() / 60, 186);
        log.info("PASSED - ZonedDateTime test of Sun May 26 1940 00:00:00 GMT+0300");
    }

    public void testJavaTime() {
        delayTestFinish(30000);
        // See https://stackoverflow.com/a/18930067
        final String url0 = GWT.getModuleBaseForStaticFiles() + "js/js-joda.min.js";
        final String url1 = GWT.getModuleBaseForStaticFiles() + "js/js-joda-timezone.min.js";
        ScriptInjector.fromUrl(url0).setWindow(ScriptInjector.TOP_WINDOW).setCallback(
            new Callback<Void, Exception>() {
                @Override
                public void onFailure(Exception reason) {
                    assertNotNull(reason);
                    fail("Injection failed: " + reason.toString());
                }

                @Override
                public void onSuccess(Void result) {
                    ScriptInjector.fromUrl(url1).setWindow(ScriptInjector.TOP_WINDOW).setCallback(
                            new Callback<Void, Exception>() {
                                @Override
                                public void onFailure(Exception reason) {
                                    assertNotNull(reason);
                                    fail("Injection failed: " + reason.toString());
                                }

                                @Override
                                public void onSuccess(Void result) {
                                    execJavaTime();
                                    finishTest();
                                }
                            }).inject();
                }
            }).inject();
    }
}