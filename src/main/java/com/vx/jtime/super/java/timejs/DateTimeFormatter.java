package java.timejs;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="DateTimeFormatter")
public class DateTimeFormatter
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.DateTimeFormatter", name="ISO_LOCAL_DATE")
    public static DateTimeFormatter ISO_LOCAL_DATE;

    @JsProperty(namespace="JSJoda.DateTimeFormatter", name="ISO_LOCAL_TIME")
    public static DateTimeFormatter ISO_LOCAL_TIME;

    @JsProperty(namespace="JSJoda.DateTimeFormatter", name="ISO_LOCAL_DATE_TIME")
    public static DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.DateTimeFormatter", name = "ofPattern")
    public static native DateTimeFormatter ofPattern(String pattern);

    
    @JsMethod(namespace="JSJoda.DateTimeFormatter", name = "parsedExcessDays")
    public static native TemporalQuery parsedExcessDays();

    
    @JsMethod(namespace="JSJoda.DateTimeFormatter", name = "parsedLeapSecond")
    public static native Boolean parsedLeapSecond();

    /*
        Methods
    */
    
    public native Object chronology();
    
    public native Object decimalStyle();
    
    public native String format(TemporalAccessor temporal);
    
    public native Object locale();
    
    public native TemporalAccessor parse(String text, TemporalQuery type);
    
    public native TemporalAccessor parse1(String text);
    
    public native Object parse2(Object text, Object type);
    
    public native Object parseUnresolved(Object text, Object position);
    
    public native Object withChronology(Object chrono);
    
    public native DateTimeFormatter withLocale();
    
    public native DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle);
}
