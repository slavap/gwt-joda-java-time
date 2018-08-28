package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.google.gwt.core.client.UnsafeNativeLong;

@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="LocalDateTime")
public class LocalDateTime extends ChronoLocalDateTime 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.LocalDateTime", name="MIN")
    public static LocalDateTime MIN;

    @JsProperty(namespace="JSJoda.LocalDateTime", name="MAX")
    public static LocalDateTime MAX;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "from")
    public static native LocalDateTime from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "now")
    public static native LocalDateTime now(UnionOfClockAndZoneId clockOrZone /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(LocalDate date, LocalTime time);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */, @DoNotAutobox Number nanoSecond /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "ofEpochSecond")
    public static native LocalDateTime ofEpochSecond(@DoNotAutobox Number epochSecond, ZoneOffset offset);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "ofEpochSecond")
    public static native LocalDateTime ofEpochSecond(@DoNotAutobox Number epochSecond, @DoNotAutobox Number nanoOfSecond, ZoneOffset offset);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "ofInstant")
    public static native LocalDateTime ofInstant(Instant instant, ZoneId zoneId /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalDateTime", name = "parse")
    public static native LocalDateTime parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "now")
    public static native LocalDateTime now(Clock clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "now")
    public static native LocalDateTime now(ZoneId clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */, @DoNotAutobox Number nanoSecond /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */, @DoNotAutobox Number nanoSecond /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "now")
    public static native LocalDateTime now();

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, UnionOfMonthAndNumber month /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of();

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "ofInstant")
    public static native LocalDateTime ofInstant(Instant instant);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "parse")
    public static native LocalDateTime parse(String text);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, Month month /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */, @DoNotAutobox Number hour /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number dayOfMonth /* optional */);

    @JsMethod(namespace="JSJoda.LocalDateTime", name = "of")
    public static native LocalDateTime of(@DoNotAutobox Number year /* optional */, @DoNotAutobox Number month /* optional */);

    /*
        Methods
    */
    
    public native LocalDateTime adjustInto(TemporalAdjuster temporal);
    
    public native ZonedDateTime atZone(ZoneId zone);
    
    public native double compareTo(LocalDateTime other);
    
    public native double dayOfMonth();
    
    public native DayOfWeek dayOfWeek();
    
    public native double dayOfYear();
    
    public native boolean equals(Object other);
    
    public native String format(DateTimeFormatter formatter);
    
    public native double getLong(TemporalField field);
    
    public native int hashCode();
    
    public native double hour();
    
    public native Boolean isAfter(LocalDateTime other);
    
    public native Boolean isBefore(LocalDateTime other);
    
    public native Boolean isEqual(Object other);
    public native Boolean isSupported(TemporalField fieldOrUnit);
    public native Boolean isSupported(TemporalUnit fieldOrUnit);
    
    public native Boolean isSupported(UnionOfTemporalFieldAndTemporalUnit fieldOrUnit);
    
    public native LocalDateTime minus(TemporalAmount amount);
    
    public native LocalDateTime minus(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native LocalDateTime minusDays(@DoNotAutobox Number days);
    
    public native LocalDateTime minusHours(@DoNotAutobox Number hours);
    
    public native LocalDateTime minusMinutes(@DoNotAutobox Number minutes);
    
    public native LocalDateTime minusMonths(@DoNotAutobox Number months);
    
    public native LocalDateTime minusNanos(@DoNotAutobox Number nanos);
    
    public native LocalDateTime minusSeconds(@DoNotAutobox Number seconds);
    
    public native LocalDateTime minusTemporalAmount(TemporalAmount amount);
    
    public native LocalDateTime minusWeeks(@DoNotAutobox Number weeks);
    
    public native LocalDateTime minusYears(@DoNotAutobox Number years);
    
    public native double minute();
    
    public native Month month();
    
    public native double monthValue();
    
    public native double nano();
    
    public native LocalDateTime plus(TemporalAmount amount);
    
    public native LocalDateTime plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    //public native LocalDateTime plusDays(@DoNotAutobox Number days);
    @UnsafeNativeLong public native LocalDateTime plusDays(long days);
    
    public native LocalDateTime plusHours(@DoNotAutobox Number hours);
    
    public native LocalDateTime plusMinutes(@DoNotAutobox Number minutes);
    
    //public native LocalDateTime plusMonths(@DoNotAutobox Number months);
    @UnsafeNativeLong public native LocalDateTime plusMonths(long months);
    
    public native LocalDateTime plusNanos(@DoNotAutobox Number nanos);
    
    public native LocalDateTime plusSeconds(@DoNotAutobox Number seconds);
    
    public native LocalDateTime plusTemporalAmount(TemporalAmount amount);
    
    public native LocalDateTime plusWeeks(@DoNotAutobox Number weeks);
    
    public native LocalDateTime plusYears(@DoNotAutobox Number years);
    
    public native double second();
    
    public native String toJSON();
    
    public native LocalDate toLocalDate();
    
    public native LocalTime toLocalTime();
    
    public native LocalDateTime truncatedTo(TemporalUnit unit);
    
    public native double until(Temporal endExclusive, TemporalUnit unit);
    
    public native LocalDateTime with(TemporalField field, @DoNotAutobox Number newValue);
    
    public native LocalDateTime with(TemporalAdjuster adjuster);
    
    public native LocalDateTime withDayOfMonth(@DoNotAutobox Number dayOfMonth);
    
    public native LocalDateTime withDayOfYear(@DoNotAutobox Number dayOfYear);
    
    public native LocalDateTime withHour(@DoNotAutobox Number hour);
    
    public native LocalDateTime withMinute(@DoNotAutobox Number minute);
    public native LocalDateTime withMonth(Month month);
    public native LocalDateTime withMonth(@DoNotAutobox Number month);
    
    public native LocalDateTime withMonth(UnionOfMonthAndNumber month);
    
    public native LocalDateTime withNano(@DoNotAutobox Number nanoOfSecond);
    
    public native LocalDateTime withSecond(@DoNotAutobox Number second);
    
    public native LocalDateTime withTemporalAdjuster(TemporalAdjuster adjuster);
    
    public native LocalDateTime withYear(@DoNotAutobox Number year);
    
    public native double year();
    
    public native String toString();

}
