package java.timejs;

import java.timejs.browser.Array;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="DayOfWeek")
public class DayOfWeek extends Temporal 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.DayOfWeek", name="MONDAY")
    public static DayOfWeek MONDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="TUESDAY")
    public static DayOfWeek TUESDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="WEDNESDAY")
    public static DayOfWeek WEDNESDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="THURSDAY")
    public static DayOfWeek THURSDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="FRIDAY")
    public static DayOfWeek FRIDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="SATURDAY")
    public static DayOfWeek SATURDAY;

    @JsProperty(namespace="JSJoda.DayOfWeek", name="SUNDAY")
    public static DayOfWeek SUNDAY;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.DayOfWeek", name = "from")
    public static native DayOfWeek from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.DayOfWeek", name = "of")
    public static native DayOfWeek of(@DoNotAutobox Number dayOfWeek);

    
    @JsMethod(namespace="JSJoda.DayOfWeek", name = "valueOf")
    public static native DayOfWeek valueOf(String name);

    
    @JsMethod(namespace="JSJoda.DayOfWeek", name = "values")
    public static native Array<DayOfWeek> values();

    /*
        Methods
    */
    
    public native DayOfWeek adjustInto(TemporalAdjuster temporal);
    
    public native boolean equals(Object other);
    
    public native String getDisplayName(TextStyle style, Locale locale);
    
    public native double getLong(TemporalField field);
    
    public native Boolean isSupported(TemporalField field);
    
    public native DayOfWeek minus(@DoNotAutobox Number days);
    
    public native String name();
    
    public native double ordinal();
    
    public native DayOfWeek plus(@DoNotAutobox Number days);
    
    public native double value();
}
