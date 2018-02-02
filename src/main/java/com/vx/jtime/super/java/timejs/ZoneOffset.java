package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ZoneOffset")
public class ZoneOffset extends ZoneId 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.ZoneOffset", name="MAX_SECONDS")
    public static ZoneOffset MAX_SECONDS;

    @JsProperty(namespace="JSJoda.ZoneOffset", name="UTC")
    public static ZoneOffset UTC;

    @JsProperty(namespace="JSJoda.ZoneOffset", name="MIN")
    public static ZoneOffset MIN;

    @JsProperty(namespace="JSJoda.ZoneOffset", name="MAX")
    public static ZoneOffset MAX;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "of")
    public static native ZoneOffset of(String offsetId);

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "ofHours")
    public static native ZoneOffset ofHours(@DoNotAutobox Number hours);

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "ofHoursMinutes")
    public static native ZoneOffset ofHoursMinutes(@DoNotAutobox Number hours, @DoNotAutobox Number minutes);

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "ofHoursMinutesSeconds")
    public static native ZoneOffset ofHoursMinutesSeconds(@DoNotAutobox Number hours, @DoNotAutobox Number minutes, @DoNotAutobox Number seconds);

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "ofTotalMinutes")
    public static native ZoneOffset ofTotalMinutes(@DoNotAutobox Number totalMinutes);

    
    @JsMethod(namespace="JSJoda.ZoneOffset", name = "ofTotalSeconds")
    public static native ZoneOffset ofTotalSeconds(@DoNotAutobox Number totalSeconds);

    /*
        Methods
    */
    
    public native Temporal adjustInto(Temporal temporal);
    
    public native double compareTo(ZoneOffset other);
    
    public native double get(TemporalField field);
    
    public native double getLong(TemporalField field);
    
    public native String id();
    
    public native Object query(TemporalQuery query);
    
    public native double totalSeconds();
    
    public native String toString();
}
