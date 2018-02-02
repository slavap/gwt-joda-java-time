package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ChronoField")
public class ChronoField
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.ChronoField", name="NANO_OF_SECOND")
    public static ChronoField NANO_OF_SECOND;

    @JsProperty(namespace="JSJoda.ChronoField", name="NANO_OF_DAY")
    public static ChronoField NANO_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="MICRO_OF_SECOND")
    public static ChronoField MICRO_OF_SECOND;

    @JsProperty(namespace="JSJoda.ChronoField", name="MICRO_OF_DAY")
    public static ChronoField MICRO_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="MILLI_OF_SECOND")
    public static ChronoField MILLI_OF_SECOND;

    @JsProperty(namespace="JSJoda.ChronoField", name="MILLI_OF_DAY")
    public static ChronoField MILLI_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="SECOND_OF_MINUTE")
    public static ChronoField SECOND_OF_MINUTE;

    @JsProperty(namespace="JSJoda.ChronoField", name="SECOND_OF_DAY")
    public static ChronoField SECOND_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="MINUTE_OF_HOUR")
    public static ChronoField MINUTE_OF_HOUR;

    @JsProperty(namespace="JSJoda.ChronoField", name="MINUTE_OF_DAY")
    public static ChronoField MINUTE_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="HOUR_OF_AMPM")
    public static ChronoField HOUR_OF_AMPM;

    @JsProperty(namespace="JSJoda.ChronoField", name="CLOCK_HOUR_OF_AMPM")
    public static ChronoField CLOCK_HOUR_OF_AMPM;

    @JsProperty(namespace="JSJoda.ChronoField", name="HOUR_OF_DAY")
    public static ChronoField HOUR_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="CLOCK_HOUR_OF_DAY")
    public static ChronoField CLOCK_HOUR_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="AMPM_OF_DAY")
    public static ChronoField AMPM_OF_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="DAY_OF_WEEK")
    public static ChronoField DAY_OF_WEEK;

    @JsProperty(namespace="JSJoda.ChronoField", name="ALIGNED_DAY_OF_WEEK_IN_MONTH")
    public static ChronoField ALIGNED_DAY_OF_WEEK_IN_MONTH;

    @JsProperty(namespace="JSJoda.ChronoField", name="ALIGNED_DAY_OF_WEEK_IN_YEAR")
    public static ChronoField ALIGNED_DAY_OF_WEEK_IN_YEAR;

    @JsProperty(namespace="JSJoda.ChronoField", name="DAY_OF_MONTH")
    public static ChronoField DAY_OF_MONTH;

    @JsProperty(namespace="JSJoda.ChronoField", name="DAY_OF_YEAR")
    public static ChronoField DAY_OF_YEAR;

    @JsProperty(namespace="JSJoda.ChronoField", name="EPOCH_DAY")
    public static ChronoField EPOCH_DAY;

    @JsProperty(namespace="JSJoda.ChronoField", name="ALIGNED_WEEK_OF_MONTH")
    public static ChronoField ALIGNED_WEEK_OF_MONTH;

    @JsProperty(namespace="JSJoda.ChronoField", name="ALIGNED_WEEK_OF_YEAR")
    public static ChronoField ALIGNED_WEEK_OF_YEAR;

    @JsProperty(namespace="JSJoda.ChronoField", name="MONTH_OF_YEAR")
    public static ChronoField MONTH_OF_YEAR;

    @JsProperty(namespace="JSJoda.ChronoField", name="PROLEPTIC_MONTH")
    public static ChronoField PROLEPTIC_MONTH;

    @JsProperty(namespace="JSJoda.ChronoField", name="YEAR_OF_ERA")
    public static ChronoField YEAR_OF_ERA;

    @JsProperty(namespace="JSJoda.ChronoField", name="YEAR")
    public static ChronoField YEAR;

    @JsProperty(namespace="JSJoda.ChronoField", name="ERA")
    public static ChronoField ERA;

    @JsProperty(namespace="JSJoda.ChronoField", name="INSTANT_SECONDS")
    public static ChronoField INSTANT_SECONDS;

    @JsProperty(namespace="JSJoda.ChronoField", name="OFFSET_SECONDS")
    public static ChronoField OFFSET_SECONDS;

    /*
        Methods
    */
    
    public native double baseUnit();
    
    public native double checkValidIntValue(@DoNotAutobox Number value);
    
    public native Object checkValidValue(@DoNotAutobox Number value);
    
    public native String displayName();
    
    public native boolean equals(Object other);
    
    public native double getFrom(TemporalAccessor temporal);
    
    public native Boolean isDateBased();
    
    public native Boolean isTimeBased();
    
    public native String name();
    
    public native ValueRange range();
    
    public native ValueRange rangeRefinedBy(TemporalAccessor temporal);
    
    public native double rangeUnit();
}
