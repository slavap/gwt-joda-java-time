package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="LocalDate")
public class LocalDate extends ChronoLocalDate 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.LocalDate", name="MIN")
    public static LocalDate MIN;

    @JsProperty(namespace="JSJoda.LocalDate", name="MAX")
    public static LocalDate MAX;

    @JsProperty(namespace="JSJoda.LocalDate", name="EPOCH_0")
    public static LocalDate EPOCH_0;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "from")
    public static native LocalDate from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "now")
    public static native LocalDate now(UnionOfClockAndZoneId clockOrZone /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "of")
    public static native LocalDate of(@DoNotAutobox Number year, UnionOfMonthAndNumber month, @DoNotAutobox Number dayOfMonth);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "ofEpochDay")
    public static native LocalDate ofEpochDay(@DoNotAutobox Number epochDay);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "ofInstant")
    public static native LocalDate ofInstant(Instant instant, ZoneId zoneId /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "ofYearDay")
    public static native LocalDate ofYearDay(@DoNotAutobox Number year, @DoNotAutobox Number dayOfYear);

    
    @JsMethod(namespace="JSJoda.LocalDate", name = "parse")
    public static native LocalDate parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.LocalDate", name = "now")
    public static native LocalDate now(Clock clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalDate", name = "now")
    public static native LocalDate now(ZoneId clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalDate", name = "of")
    public static native LocalDate of(@DoNotAutobox Number year, Month month, @DoNotAutobox Number dayOfMonth);

    @JsMethod(namespace="JSJoda.LocalDate", name = "of")
    public static native LocalDate of(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number dayOfMonth);

    @JsMethod(namespace="JSJoda.LocalDate", name = "now")
    public static native LocalDate now();

    @JsMethod(namespace="JSJoda.LocalDate", name = "ofInstant")
    public static native LocalDate ofInstant(Instant instant);

    @JsMethod(namespace="JSJoda.LocalDate", name = "parse")
    public static native LocalDate parse(String text);

    /*
        Methods
    */
    
    public native LocalDateTime atStartOfDay();
    
    public native ZonedDateTime atStartOfDay(ZoneId zone);
    
    public native ZonedDateTime atStartOfDayWithZone(ZoneId zone);
    
    public native LocalDateTime atTime(LocalTime time);
    public native LocalDateTime atTime(@DoNotAutobox Number hour, @DoNotAutobox Number minute);
    public native LocalDateTime atTime(@DoNotAutobox Number hour, @DoNotAutobox Number minute, @DoNotAutobox Number second /* optional */);
    
    public native LocalDateTime atTime(@DoNotAutobox Number hour, @DoNotAutobox Number minute, @DoNotAutobox Number second /* optional */, @DoNotAutobox Number nanoOfSecond /* optional */);
    
    public native Chronology chronology();
    
    public native double compareTo(LocalDate other);
    
    public native double dayOfMonth();
    
    public native DayOfWeek dayOfWeek();
    
    public native double dayOfYear();
    
    public native boolean equals(Object otherDate);
    
    public native double getLong(TemporalField field);
    
    public native int hashCode();
    
    public native Boolean isAfter(LocalDate other);
    
    public native Boolean isBefore(LocalDate other);
    
    public native Boolean isEqual(LocalDate other);
    
    public native Boolean isLeapYear();
    
    public native double isoWeekOfWeekyear();
    
    public native double isoWeekyear();
    
    public native double lengthOfMonth();
    
    public native double lengthOfYear();
    
    public native LocalDate minus(TemporalAmount amount);
    
    public native LocalDate minus(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native LocalDate minusDays(@DoNotAutobox Number daysToSubtract);
    
    public native LocalDate minusMonths(@DoNotAutobox Number monthsToSubtract);
    
    public native LocalDate minusWeeks(@DoNotAutobox Number weeksToSubtract);
    
    public native LocalDate minusYears(@DoNotAutobox Number yearsToSubtract);
    
    public native Month month();
    
    public native double monthValue();
    
    public native LocalDate plus(TemporalAmount amount);
    
    public native LocalDate plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native LocalDate plusDays(@DoNotAutobox Number daysToAdd);
    
    public native LocalDate plusMonths(@DoNotAutobox Number monthsToAdd);
    
    public native LocalDate plusWeeks(@DoNotAutobox Number weeksToAdd);
    
    public native LocalDate plusYears(@DoNotAutobox Number yearsToAdd);
    
    public native double toEpochDay();
    
    public native String toJSON();
    
    public native Period until(TemporalAccessor endDate);
    
    public native double until(TemporalAccessor endExclusive, TemporalUnit unit);
    
    public native LocalDate with(TemporalField fieldOrAdjuster, @DoNotAutobox Number newValue);
    
    public native LocalDate with(TemporalAdjuster adjuster);
    
    public native LocalDate withDayOfMonth(@DoNotAutobox Number dayOfMonth);
    
    public native LocalDate withDayOfYear(@DoNotAutobox Number dayOfYear);
    
    public native LocalDate withFieldAndValue(TemporalField field, @DoNotAutobox Number newValue);
    public native LocalDate withMonth(Month month);
    public native LocalDate withMonth(@DoNotAutobox Number month);
    
    public native LocalDate withMonth(UnionOfMonthAndNumber month);
    
    public native LocalDate withTemporalAdjuster(TemporalAdjuster adjuster);
    
    public native LocalDate withYear(@DoNotAutobox Number year);
    
    public native double year();
    
    public native String toString();
}
