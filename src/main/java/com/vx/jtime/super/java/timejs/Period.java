package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="Period")
public class Period extends TemporalAmount 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.Period", name="ZERO")
    public static Period ZERO;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Period", name = "between")
    public static native Period between(LocalDate startDate, LocalDate endDate);

    
    @JsMethod(namespace="JSJoda.Period", name = "create")
    public static native Duration create(@DoNotAutobox Number years, @DoNotAutobox Number months, @DoNotAutobox Number days);

    
    @JsMethod(namespace="JSJoda.Period", name = "from")
    public static native Period from(TemporalAmount amount);

    
    @JsMethod(namespace="JSJoda.Period", name = "of")
    public static native Period of(@DoNotAutobox Number years, @DoNotAutobox Number months, @DoNotAutobox Number days);

    
    @JsMethod(namespace="JSJoda.Period", name = "ofDays")
    public static native Period ofDays(@DoNotAutobox Number days);

    
    @JsMethod(namespace="JSJoda.Period", name = "ofMonths")
    public static native Period ofMonths(@DoNotAutobox Number months);

    
    @JsMethod(namespace="JSJoda.Period", name = "ofWeeks")
    public static native Period ofWeeks(@DoNotAutobox Number weeks);

    
    @JsMethod(namespace="JSJoda.Period", name = "ofYears")
    public static native Period ofYears(@DoNotAutobox Number years);

    
    @JsMethod(namespace="JSJoda.Period", name = "parse")
    public static native Period parse(String text);

    /*
        Methods
    */
    
    public native IsoChronology chronology();
    
    public native double days();
    
    public native boolean equals(Object obj);
    
    public native int hashCode();
    
    public native Boolean isNegative();
    
    public native Boolean isZero();
    
    public native Period minus(TemporalAmount amountToSubtract);
    
    public native Period minusDays(@DoNotAutobox Number daysToSubtract);
    
    public native Period minusMonths(@DoNotAutobox Number monthsToSubtract);
    
    public native Period minusYears(@DoNotAutobox Number yearsToSubtract);
    
    public native double months();
    
    public native Period multipliedBy(@DoNotAutobox Number scalar);
    
    public native Period negated();
    
    public native Period normalized();
    
    public native Period plus(TemporalAmount amountToAdd);
    
    public native Period plusDays(@DoNotAutobox Number daysToAdd);
    
    public native Period plusMonths(@DoNotAutobox Number monthsToAdd);
    
    public native Period plusYears(@DoNotAutobox Number yearsToAdd);
    
    public native String toJSON();
    
    public native double toTotalMonths();
    
    public native Period withDays(@DoNotAutobox Number days);
    
    public native Period withMonths(@DoNotAutobox Number months);
    
    public native Period withYears(@DoNotAutobox Number years);
    
    public native double years();
}
