package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="LocalTime")
public class LocalTime extends Temporal 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.LocalTime", name="MIN")
    public static LocalTime MIN;

    @JsProperty(namespace="JSJoda.LocalTime", name="MAX")
    public static LocalTime MAX;

    @JsProperty(namespace="JSJoda.LocalTime", name="MIDNIGHT")
    public static LocalTime MIDNIGHT;

    @JsProperty(namespace="JSJoda.LocalTime", name="NOON")
    public static LocalTime NOON;

    @JsProperty(namespace="JSJoda.LocalTime", name="HOURS_PER_DAY")
    public static Number HOURS_PER_DAY;

    @JsProperty(namespace="JSJoda.LocalTime", name="MINUTES_PER_HOUR")
    public static Number MINUTES_PER_HOUR;

    @JsProperty(namespace="JSJoda.LocalTime", name="MINUTES_PER_DAY")
    public static Number MINUTES_PER_DAY;

    @JsProperty(namespace="JSJoda.LocalTime", name="SECONDS_PER_MINUTE")
    public static Number SECONDS_PER_MINUTE;

    @JsProperty(namespace="JSJoda.LocalTime", name="SECONDS_PER_HOUR")
    public static Number SECONDS_PER_HOUR;

    @JsProperty(namespace="JSJoda.LocalTime", name="SECONDS_PER_DAY")
    public static Number SECONDS_PER_DAY;

    @JsProperty(namespace="JSJoda.LocalTime", name="MILLIS_PER_DAY")
    public static Number MILLIS_PER_DAY;

    @JsProperty(namespace="JSJoda.LocalTime", name="MICROS_PER_DAY")
    public static Number MICROS_PER_DAY;

    @JsProperty(namespace="JSJoda.LocalTime", name="NANOS_PER_SECOND")
    public static Number NANOS_PER_SECOND;

    @JsProperty(namespace="JSJoda.LocalTime", name="NANOS_PER_MINUTE")
    public static Number NANOS_PER_MINUTE;

    @JsProperty(namespace="JSJoda.LocalTime", name="NANOS_PER_HOUR")
    public static Number NANOS_PER_HOUR;

    @JsProperty(namespace="JSJoda.LocalTime", name="NANOS_PER_DAY")
    public static Number NANOS_PER_DAY;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "from")
    public static native LocalTime from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "now")
    public static native LocalTime now(UnionOfClockAndZoneId clockOrZone /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "of")
    public static native LocalTime of(@DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */, @DoNotAutobox Number nanoOfSecond /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "ofInstant")
    public static native LocalTime ofInstant(Instant instant, ZoneId zone /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "ofNanoOfDay")
    public static native LocalTime ofNanoOfDay(@DoNotAutobox Number nanoOfDay);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "ofSecondOfDay")
    public static native LocalTime ofSecondOfDay(@DoNotAutobox Number secondOfDay /* optional */, @DoNotAutobox Number nanoOfSecond /* optional */);

    
    @JsMethod(namespace="JSJoda.LocalTime", name = "parse")
    public static native LocalTime parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "now")
    public static native LocalTime now(Clock clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "now")
    public static native LocalTime now(ZoneId clockOrZone /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "now")
    public static native LocalTime now();

    @JsMethod(namespace="JSJoda.LocalTime", name = "of")
    public static native LocalTime of(@DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */, @DoNotAutobox Number second /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "of")
    public static native LocalTime of(@DoNotAutobox Number hour /* optional */, @DoNotAutobox Number minute /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "of")
    public static native LocalTime of(@DoNotAutobox Number hour /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "of")
    public static native LocalTime of();

    @JsMethod(namespace="JSJoda.LocalTime", name = "ofInstant")
    public static native LocalTime ofInstant(Instant instant);

    @JsMethod(namespace="JSJoda.LocalTime", name = "ofSecondOfDay")
    public static native LocalTime ofSecondOfDay(@DoNotAutobox Number secondOfDay /* optional */);

    @JsMethod(namespace="JSJoda.LocalTime", name = "ofSecondOfDay")
    public static native LocalTime ofSecondOfDay();

    @JsMethod(namespace="JSJoda.LocalTime", name = "parse")
    public static native LocalTime parse(String text);

    /*
        Methods
    */
    
    public native Temporal adjustInto(TemporalAdjuster temporal);
    
    public native LocalDateTime atDate(LocalDate date);
    
    public native double compareTo(LocalTime other);
    
    public native boolean equals(Object other);
    
    public native String format(DateTimeFormatter formatter);
    
    public native double get(ChronoField field);
    
    public native double getLong(ChronoField field);
    
    public native int hashCode();
    
    public native double hour();
    
    public native Boolean isAfter(LocalTime other);
    
    public native Boolean isBefore(LocalTime other);
    public native Boolean isSupported(ChronoUnit fieldOrUnit);
    public native Boolean isSupported(ChronoField fieldOrUnit);
    
    public native Boolean isSupported(UnionOfChronoFieldAndChronoUnit fieldOrUnit);
    
    public native LocalTime minus(TemporalAmount amount);
    
    public native LocalTime minus(@DoNotAutobox Number amountToSubtract, ChronoUnit unit);
    
    public native LocalTime minusHours(@DoNotAutobox Number hoursToSubtract);
    
    public native LocalTime minusMinutes(@DoNotAutobox Number minutesToSubtract);
    
    public native LocalTime minusNanos(@DoNotAutobox Number nanosToSubtract);
    
    public native LocalTime minusSeconds(@DoNotAutobox Number secondsToSubtract);
    
    public native double minute();
    
    public native double nano();
    
    public native LocalTime plus(TemporalAmount amount);
    
    public native LocalTime plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native LocalTime plusHours(@DoNotAutobox Number hoursToAdd);
    
    public native LocalTime plusMinutes(@DoNotAutobox Number minutesToAdd);
    
    public native LocalTime plusNanos(@DoNotAutobox Number nanosToAdd);
    
    public native LocalTime plusSeconds(@DoNotAutobox Number secondstoAdd);
    
    public native ValueRange range(ChronoField field);
    
    public native double second();
    
    public native String toJSON();
    
    public native double toNanoOfDay();
    
    public native double toSecondOfDay();
    
    public native LocalTime truncatedTo(ChronoUnit unit);
    
    public native double until(TemporalAccessor endExclusive, TemporalUnit unit);
    
    public native LocalTime with(TemporalField field, @DoNotAutobox Number newValue);
    
    public native LocalTime with(TemporalAdjuster adjuster);
    
    public native LocalTime withHour(@DoNotAutobox Number hour);
    
    public native LocalTime withMinute(@DoNotAutobox Number minute);
    
    public native LocalTime withNano(@DoNotAutobox Number nanoOfSecond);
    
    public native LocalTime withSecond(@DoNotAutobox Number second);
    
    public native LocalTime withTemporalAdjuster(TemporalAdjuster adjuster);
}
