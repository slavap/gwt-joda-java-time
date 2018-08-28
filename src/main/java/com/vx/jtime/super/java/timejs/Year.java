package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="Year")
public class Year extends Temporal 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.Year", name="MIN_VALUE")
    public static Number MIN_VALUE;

    @JsProperty(namespace="JSJoda.Year", name="MAX_VALUE")
    public static Number MAX_VALUE;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Year", name = "from")
    public static native Year from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.Year", name = "isLeap")
    public static native Boolean isLeap(@DoNotAutobox Number year);

    
    @JsMethod(namespace="JSJoda.Year", name = "now")
    public static native Year now(UnionOfClockAndZoneId zoneIdOrClock /* optional */);

    
    @JsMethod(namespace="JSJoda.Year", name = "of")
    public static native Year of(@DoNotAutobox Number isoYear);

    
    @JsMethod(namespace="JSJoda.Year", name = "parse")
    public static native Year parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.Year", name = "now")
    public static native Year now(Clock zoneIdOrClock /* optional */);

    @JsMethod(namespace="JSJoda.Year", name = "now")
    public static native Year now(ZoneId zoneIdOrClock /* optional */);

    @JsMethod(namespace="JSJoda.Year", name = "now")
    public static native Year now();

    @JsMethod(namespace="JSJoda.Year", name = "parse")
    public static native Year parse(String text);

    /*
        Methods
    */
    public native YearMonth atMonth(Month monthOrNumber);
    public native YearMonth atMonth(@DoNotAutobox Number monthOrNumber);
    public native YearMonth atMonth(UnionOfMonthAndNumber monthOrNumber);
    
    public native Year minus(TemporalAmount amountOrNumber);
    public native Year minus(TemporalAmount amountOrNumber, TemporalUnit unit /* optional */);
    public native Year minus(@DoNotAutobox Number amountOrNumber);
    public native Year minus(@DoNotAutobox Number amountOrNumber, TemporalUnit unit /* optional */);
    public native Year minus(UnionOfNumberAndTemporalAmount amountOrNumber);
    public native Year minus(UnionOfNumberAndTemporalAmount amountOrNumber, TemporalUnit unit /* optional */);
    
    public native Year plus(TemporalAmount amountOrNumber);
    public native Year plus(TemporalAmount amountOrNumber, TemporalUnit unit /* optional */);
    public native Year plus(@DoNotAutobox Number amountOrNumber);
    public native Year plus(@DoNotAutobox Number amountOrNumber, TemporalUnit unit /* optional */);
    public native Year plus(UnionOfNumberAndTemporalAmount amountOrNumber);
    public native Year plus(UnionOfNumberAndTemporalAmount amountOrNumber, TemporalUnit unit /* optional */);
    
    public native double value();
}
