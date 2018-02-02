package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="Duration")
public class Duration extends TemporalAmount 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.Duration", name="ZERO")
    public static Duration ZERO;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Duration", name = "between")
    public static native Duration between(Temporal startInclusive, Temporal endExclusive);

    
    @JsMethod(namespace="JSJoda.Duration", name = "from")
    public static native Duration from(TemporalAmount amount);

    
    @JsMethod(namespace="JSJoda.Duration", name = "of")
    public static native Duration of(@DoNotAutobox Number amount, TemporalUnit unit);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofDays")
    public static native Duration ofDays(@DoNotAutobox Number days);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofHours")
    public static native Duration ofHours(@DoNotAutobox Number hours);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofMillis")
    public static native Duration ofMillis(@DoNotAutobox Number millis);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofMinutes")
    public static native Duration ofMinutes(@DoNotAutobox Number minutes);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofNanos")
    public static native Duration ofNanos(@DoNotAutobox Number nanos);

    
    @JsMethod(namespace="JSJoda.Duration", name = "ofSeconds")
    public static native Duration ofSeconds(@DoNotAutobox Number seconds);

    
    @JsMethod(namespace="JSJoda.Duration", name = "parse")
    public static native Duration parse(String text);

    /*
        Methods
    */
    
    public native Duration abs();
    
    public native double compareTo(Duration otherDuration);
    
    public native Duration dividedBy(@DoNotAutobox Number divisor);
    
    public native boolean equals(Object otherDuration);
    
    public native Boolean isNegative();
    
    public native Boolean isZero();
    public native Duration minus(Duration durationOrNumber, ChronoUnit unit);
    public native Duration minus(@DoNotAutobox Number durationOrNumber, ChronoUnit unit);
    
    public native Duration minus(UnionOfDurationAndNumber durationOrNumber, ChronoUnit unit);
    
    public native Duration minusAmountUnit(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native Duration minusDays(@DoNotAutobox Number daysToSubtract);
    
    public native Duration minusDuration(Duration duration);
    
    public native Duration minusHours(@DoNotAutobox Number hoursToSubtract);
    
    public native Duration minusMillis(@DoNotAutobox Number millisToSubtract);
    
    public native Duration minusMinutes(@DoNotAutobox Number minutesToSubtract);
    
    public native Duration minusNanos(@DoNotAutobox Number nanosToSubtract);
    
    public native Duration minusSeconds(@DoNotAutobox Number secondsToSubtract);
    
    public native Duration multipliedBy(@DoNotAutobox Number multiplicand);
    
    public native double nano();
    
    public native Duration negated();
    public native Duration plus(Duration durationOrNumber, TemporalUnit unitOrNumber);
    public native Duration plus(Duration durationOrNumber, @DoNotAutobox Number unitOrNumber);
    public native Duration plus(@DoNotAutobox Number durationOrNumber, TemporalUnit unitOrNumber);
    public native Duration plus(@DoNotAutobox Number durationOrNumber, @DoNotAutobox Number unitOrNumber);
    
    public native Duration plus(UnionOfDurationAndNumber durationOrNumber, UnionOfNumberAndTemporalUnit unitOrNumber);
    
    public native Duration plusAmountUnit(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native Duration plusDays(@DoNotAutobox Number daysToAdd);
    
    public native Duration plusDuration(Duration duration);
    
    public native Duration plusHours(@DoNotAutobox Number hoursToAdd);
    
    public native Duration plusMillis(@DoNotAutobox Number millisToAdd);
    
    public native Duration plusMinutes(@DoNotAutobox Number minutesToAdd);
    
    public native Duration plusNanos(@DoNotAutobox Number nanosToAdd);
    
    public native Duration plusSeconds(@DoNotAutobox Number secondsToAdd);
    
    public native Duration plusSecondsNanos(@DoNotAutobox Number secondsToAdd, @DoNotAutobox Number nanosToAdd);
    
    public native double seconds();
    
    public native double toDays();
    
    public native double toHours();
    
    public native String toJSON();
    
    public native double toMillis();
    
    public native double toMinutes();
    
    public native double toNanos();
    
    public native Duration withNanos(@DoNotAutobox Number nanoOfSecond);
    
    public native Duration withSeconds(@DoNotAutobox Number seconds);
}
