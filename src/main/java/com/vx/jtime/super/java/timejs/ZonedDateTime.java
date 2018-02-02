package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ZonedDateTime")
public class ZonedDateTime extends ChronoZonedDateTime 
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "from")
    public static native ZonedDateTime from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "now")
    public static native ZonedDateTime now(UnionOfClockAndZoneId clockOrZone /* optional */);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "of")
    public static native ZonedDateTime of();

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "of")
    public static native ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "of")
    public static native ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "of")
    public static native ZonedDateTime of(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number dayOfMonth, @DoNotAutobox Number hour, @DoNotAutobox Number minute, @DoNotAutobox Number second, @DoNotAutobox Number nanoOfSecond, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "ofInstant")
    public static native ZonedDateTime ofInstant();

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "ofInstant")
    public static native ZonedDateTime ofInstant(Instant instant, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "ofInstant")
    public static native ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "ofLocal")
    public static native ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zone, ZoneOffset preferredOffset);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "ofStrict")
    public static native ZonedDateTime ofStrict(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone);

    
    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "parse")
    public static native ZonedDateTime parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "now")
    public static native ZonedDateTime now(Clock clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "now")
    public static native ZonedDateTime now(ZoneId clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "now")
    public static native ZonedDateTime now();

    @JsMethod(namespace="JSJoda.ZonedDateTime", name = "parse")
    public static native ZonedDateTime parse(String text);

    /*
        Methods
    */
    
    public native double dayOfMonth();
    
    public native DayOfWeek dayOfWeek();
    
    public native double dayOfYear();
    
    public native double getLong(TemporalField field);
    
    public native int hashCode();
    
    public native double hour();
    public native Boolean isSupported(TemporalField fieldOrUnit);
    public native Boolean isSupported(TemporalUnit fieldOrUnit);
    
    public native Boolean isSupported(UnionOfTemporalFieldAndTemporalUnit fieldOrUnit);
    
    public native Object minus();
    
    public native ZonedDateTime minus(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native ZonedDateTime minusDays(@DoNotAutobox Number days);
    
    public native ZonedDateTime minusHours(@DoNotAutobox Number hours);
    
    public native ZonedDateTime minusMinutes(@DoNotAutobox Number minutes);
    
    public native ZonedDateTime minusMonths(@DoNotAutobox Number months);
    
    public native ZonedDateTime minusNanos(@DoNotAutobox Number nanos);
    
    public native ZonedDateTime minusSeconds(@DoNotAutobox Number seconds);
    
    public native ZonedDateTime minusTemporalAmount(TemporalAmount amount);
    
    public native ZonedDateTime minusWeeks(@DoNotAutobox Number weeks);
    
    public native ZonedDateTime minusYears(@DoNotAutobox Number years);
    
    public native double minute();
    
    public native Month month();
    
    public native double monthValue();
    
    public native double nano();
    
    public native ZoneOffset offset();
    
    public native Object plus();
    
    public native ZonedDateTime plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native ZonedDateTime plusDays(@DoNotAutobox Number days);
    
    public native ZonedDateTime plusHours(@DoNotAutobox Number hours);
    
    public native ZonedDateTime plusMinutes(@DoNotAutobox Number minutes);
    
    public native ZonedDateTime plusMonths(@DoNotAutobox Number months);
    
    public native ZonedDateTime plusNanos(@DoNotAutobox Number nanos);
    
    public native ZonedDateTime plusSeconds(@DoNotAutobox Number seconds);
    
    public native ZonedDateTime plusTemporalAmount(TemporalAmount amount);
    
    public native ZonedDateTime plusWeeks(@DoNotAutobox Number weeks);
    
    public native ZonedDateTime plusYears(@DoNotAutobox Number years);
    
    public native double second();
    
    public native String toJSON();
    
    public native LocalDate toLocalDate();
    
    public native LocalDateTime toLocalDateTime();
    
    public native LocalTime toLocalTime();
    
    public native OffsetDateTime toOffsetDateTime();
    
    public native ZonedDateTime truncatedTo(TemporalUnit unit);
    
    public native double until(Temporal endExclusive, TemporalUnit unit);
    
    public native Object with();
    
    public native ZonedDateTime with(TemporalField field, @DoNotAutobox Number newValue);
    
    public native ZonedDateTime withDayOfMonth(@DoNotAutobox Number dayOfMonth);
    
    public native ZonedDateTime withDayOfYear(@DoNotAutobox Number dayOfYear);
    
    public native ZonedDateTime withFixedOffsetZone();
    
    public native ZonedDateTime withHour(@DoNotAutobox Number hour);
    
    public native ZonedDateTime withMinute(@DoNotAutobox Number minute);
    
    public native ZonedDateTime withMonth(@DoNotAutobox Number month);
    
    public native ZonedDateTime withNano(@DoNotAutobox Number nanoOfSecond);
    
    public native ZonedDateTime withSecond(@DoNotAutobox Number second);
    
    public native ZonedDateTime withTemporalAdjuster(TemporalAdjuster adjuster);
    
    public native ZonedDateTime withYear(@DoNotAutobox Number year);
    
    public native ZonedDateTime withZoneSameInstant(ZoneId zone);
    
    public native ZonedDateTime withZoneSameLocal(ZoneId zone);
    
    public native double year();
    
    public native ZoneId zone();
    
    public native String toString();
}
