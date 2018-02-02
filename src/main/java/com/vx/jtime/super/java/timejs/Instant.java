package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="Instant")
public class Instant extends Temporal 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.Instant", name="EPOCH")
    public static Instant EPOCH;

    @JsProperty(namespace="JSJoda.Instant", name="MIN")
    public static Instant MIN;

    @JsProperty(namespace="JSJoda.Instant", name="MAX")
    public static Instant MAX;

    @JsProperty(namespace="JSJoda.Instant", name="MIN_SECONDS")
    public static Instant MIN_SECONDS;

    @JsProperty(namespace="JSJoda.Instant", name="MAX_SECONDS")
    public static Instant MAX_SECONDS;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Instant", name = "from")
    public static native Instant from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.Instant", name = "now")
    public static native Instant now(Clock clock /* optional */);

    
    @JsMethod(namespace="JSJoda.Instant", name = "ofEpochMilli")
    public static native Instant ofEpochMilli(@DoNotAutobox Number epochMilli);

    
    @JsMethod(namespace="JSJoda.Instant", name = "ofEpochSecond")
    public static native Instant ofEpochSecond(@DoNotAutobox Number epochSecond, @DoNotAutobox Number nanoAdjustment /* optional */);

    
    @JsMethod(namespace="JSJoda.Instant", name = "parse")
    public static native Instant parse(String text);

    @JsMethod(namespace="JSJoda.Instant", name = "now")
    public static native Instant now();

    @JsMethod(namespace="JSJoda.Instant", name = "ofEpochSecond")
    public static native Instant ofEpochSecond(@DoNotAutobox Number epochSecond);

    /*
        Methods
    */
    
    public native Temporal adjustInto(Temporal temporal);
    
    public native double compareTo(Instant otherInstant);
    
    public native double epochSecond();
    
    public native boolean equals(Object otherInstant);
    
    public native double getLong(TemporalField field);
    
    public native int hashCode();
    
    public native Boolean isAfter(Instant otherInstant);
    
    public native Boolean isBefore(Instant otherInstant);
    public native Boolean isSupported(TemporalField fieldOrUnit);
    public native Boolean isSupported(TemporalUnit fieldOrUnit);
    
    public native Boolean isSupported(UnionOfTemporalFieldAndTemporalUnit fieldOrUnit);
    
    public native Instant minus(TemporalAmount amount);
    
    public native Instant minus(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native Instant minusMillis(@DoNotAutobox Number millisToSubtract);
    
    public native Instant minusNanos(@DoNotAutobox Number nanosToSubtract);
    
    public native Instant minusSeconds(@DoNotAutobox Number secondsToSubtract);
    
    public native double nano();
    
    public native Instant plus(TemporalAmount amount);
    
    public native Instant plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native Instant plusMillis(@DoNotAutobox Number millisToAdd);
    
    public native Instant plusNanos(@DoNotAutobox Number nanosToAdd);
    
    public native Instant plusSeconds(@DoNotAutobox Number secondsToAdd);
    
    public native double toEpochMilli();
    
    public native Instant truncatedTo(TemporalUnit unit);
    
    public native double until(Temporal endExclusive, TemporalUnit unit);
    
    public native Instant with(TemporalField field, @DoNotAutobox Number newValue);
    
    public native Instant with(TemporalAdjuster adjuster);
    
    public native Instant withTemporalAdjuster(TemporalAdjuster adjuster);
}
