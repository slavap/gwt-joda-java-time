package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="TemporalAdjusters")
public class TemporalAdjusters
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "dayOfWeekInMonth")
    public static native TemporalAdjuster dayOfWeekInMonth(@DoNotAutobox Number ordinal, DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "firstDayOfMonth")
    public static native TemporalAdjuster firstDayOfMonth();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "firstDayOfNextMonth")
    public static native TemporalAdjuster firstDayOfNextMonth();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "firstDayOfNextYear")
    public static native TemporalAdjuster firstDayOfNextYear();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "firstDayOfYear")
    public static native TemporalAdjuster firstDayOfYear();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "firstInMonth")
    public static native TemporalAdjuster firstInMonth(DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "lastDayOfMonth")
    public static native TemporalAdjuster lastDayOfMonth();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "lastDayOfYear")
    public static native TemporalAdjuster lastDayOfYear();

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "lastInMonth")
    public static native TemporalAdjuster lastInMonth(DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "next")
    public static native TemporalAdjuster next(DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "nextOrSame")
    public static native TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "previous")
    public static native TemporalAdjuster previous(DayOfWeek dayOfWeek);

    
    @JsMethod(namespace="JSJoda.TemporalAdjusters", name = "previousOrSame")
    public static native TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek);
}
