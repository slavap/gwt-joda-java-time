package java.timejs;

import java.timejs.browser.Array;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="Month")
public class Month extends Temporal 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.Month", name="JANUARY")
    public static Month JANUARY;

    @JsProperty(namespace="JSJoda.Month", name="FEBRUARY")
    public static Month FEBRUARY;

    @JsProperty(namespace="JSJoda.Month", name="MARCH")
    public static Month MARCH;

    @JsProperty(namespace="JSJoda.Month", name="APRIL")
    public static Month APRIL;

    @JsProperty(namespace="JSJoda.Month", name="MAY")
    public static Month MAY;

    @JsProperty(namespace="JSJoda.Month", name="JUNE")
    public static Month JUNE;

    @JsProperty(namespace="JSJoda.Month", name="JULY")
    public static Month JULY;

    @JsProperty(namespace="JSJoda.Month", name="AUGUST")
    public static Month AUGUST;

    @JsProperty(namespace="JSJoda.Month", name="SEPTEMBER")
    public static Month SEPTEMBER;

    @JsProperty(namespace="JSJoda.Month", name="OCTOBER")
    public static Month OCTOBER;

    @JsProperty(namespace="JSJoda.Month", name="NOVEMBER")
    public static Month NOVEMBER;

    @JsProperty(namespace="JSJoda.Month", name="DECEMBER")
    public static Month DECEMBER;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Month", name = "from")
    public static native Month from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.Month", name = "of")
    public static native Month of(@DoNotAutobox Number month);

    
    @JsMethod(namespace="JSJoda.Month", name = "values")
    public static native Array<Month> values();

    /*
        Methods
    */
    
    public native Temporal adjustInto(Temporal temporal);
    
    public native double firstDayOfYear(Boolean leapYear);
    
    public native Month firstMonthOfQuarter();
    
    public native String getDisplayName(TextStyle style, Locale locale);
    
    public native double getLong(TemporalField field);
    
    public native Boolean isSupported(TemporalField field);
    
    public native double length(Boolean leapYear);
    
    public native double maxLength();
    
    public native double minLength();
    
    public native Month minus(@DoNotAutobox Number months);
    
    public native Month plus(@DoNotAutobox Number months);
    
    public native double value();
}
