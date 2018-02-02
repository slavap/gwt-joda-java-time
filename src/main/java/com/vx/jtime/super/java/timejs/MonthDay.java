package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="MonthDay")
public class MonthDay extends Temporal 
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "from")
    public static native MonthDay from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "now")
    public static native MonthDay now(UnionOfClockAndZoneId arg1 /* optional */);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(UnionOfMonthAndNumber monthOrNumber, @DoNotAutobox Number number /* optional */);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "ofMonthNumber")
    public static native MonthDay ofMonthNumber(Month month, @DoNotAutobox Number dayOfMonth);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "ofNumberNumber")
    public static native MonthDay ofNumberNumber(@DoNotAutobox Number month, @DoNotAutobox Number dayOfMonth);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "parse")
    public static native MonthDay parse(String text, DateTimeFormatter formatter /* optional */);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "parseString")
    public static native MonthDay parseString(String text);

    
    @JsMethod(namespace="JSJoda.MonthDay", name = "parseStringFormatter")
    public static native MonthDay parseStringFormatter(String text, DateTimeFormatter formatter);

    @JsMethod(namespace="JSJoda.MonthDay", name = "now")
    public static native MonthDay now(Clock arg1 /* optional */);

    @JsMethod(namespace="JSJoda.MonthDay", name = "now")
    public static native MonthDay now(ZoneId arg1 /* optional */);

    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(Month monthOrNumber, @DoNotAutobox Number number /* optional */);

    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(@DoNotAutobox Number monthOrNumber, @DoNotAutobox Number number /* optional */);

    @JsMethod(namespace="JSJoda.MonthDay", name = "now")
    public static native MonthDay now();

    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(UnionOfMonthAndNumber monthOrNumber);

    @JsMethod(namespace="JSJoda.MonthDay", name = "parse")
    public static native MonthDay parse(String text);

    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(Month monthOrNumber);

    @JsMethod(namespace="JSJoda.MonthDay", name = "of")
    public static native MonthDay of(@DoNotAutobox Number monthOrNumber);

    /*
        Methods
    */
    
    public native Temporal adjustInto(Temporal temporal);
    
    public native LocalDate atYear(@DoNotAutobox Number year);
    
    public native double compareTo(MonthDay other);
    
    public native double dayOfMonth();
    
    public native boolean equals(Object obj);
    
    public native String format(DateTimeFormatter formatter);
    
    public native double getLong(TemporalField field);
    
    public native Boolean isAfter(MonthDay other);
    
    public native Boolean isBefore(MonthDay other);
    
    public native Boolean isSupported(TemporalField field);
    
    public native Boolean isValidYear(@DoNotAutobox Number year);
    
    public native Month month();
    
    public native double monthValue();
    
    public native MonthDay with(Month month);
    
    public native MonthDay withDayOfMonth(@DoNotAutobox Number dayOfMonth);
    
    public native MonthDay withMonth(@DoNotAutobox Number month);
}
