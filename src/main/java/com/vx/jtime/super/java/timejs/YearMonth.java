package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="YearMonth")
public class YearMonth extends Temporal 
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.YearMonth", name = "from")
    public static native YearMonth from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.YearMonth", name = "now")
    public static native YearMonth now(UnionOfClockAndZoneId zoneIdOrClock /* optional */);

    
    @JsMethod(namespace="JSJoda.YearMonth", name = "of")
    public static native YearMonth of(@DoNotAutobox Number year, UnionOfMonthAndNumber monthOrNumber);

    
    @JsMethod(namespace="JSJoda.YearMonth", name = "parse")
    public static native YearMonth parse(String text, DateTimeFormatter formatter /* optional */);

    @JsMethod(namespace="JSJoda.YearMonth", name = "now")
    public static native YearMonth now(Clock zoneIdOrClock /* optional */);

    @JsMethod(namespace="JSJoda.YearMonth", name = "now")
    public static native YearMonth now(ZoneId zoneIdOrClock /* optional */);

    @JsMethod(namespace="JSJoda.YearMonth", name = "of")
    public static native YearMonth of(@DoNotAutobox Number year, Month monthOrNumber);

    @JsMethod(namespace="JSJoda.YearMonth", name = "of")
    public static native YearMonth of(@DoNotAutobox Number year, @DoNotAutobox Number monthOrNumber);

    @JsMethod(namespace="JSJoda.YearMonth", name = "now")
    public static native YearMonth now();

    @JsMethod(namespace="JSJoda.YearMonth", name = "parse")
    public static native YearMonth parse(String text);

    /*
        Methods
    */
    
    public native LocalDate atDay(@DoNotAutobox Number dayOfMonth);
    
    public native LocalDate atEndOfMonth();
    
    public native double compareTo(YearMonth other);
    
    public native Boolean equals(YearMonth other);
    
    public native String format(DateTimeFormatter formatter);
    
    public native Boolean isAfter(YearMonth other);
    
    public native Boolean isBefore(YearMonth other);
    
    public native Boolean isLeapYear();
    public native Boolean isSupported(TemporalField fieldOrUnit);
    public native Boolean isSupported(ChronoUnit fieldOrUnit);
    
    public native Boolean isSupported(UnionOfChronoUnitAndTemporalField fieldOrUnit);
    
    public native Boolean isValidDay();
    
    public native double lengthOfMonth();
    
    public native double lengthOfYear();
    
    public native YearMonth minus(TemporalAmount amount);
    
    public native YearMonth minus(@DoNotAutobox Number amountToSubtract, TemporalUnit unit);
    
    public native YearMonth minusMonths(@DoNotAutobox Number monthsToSubtract);
    
    public native YearMonth minusYears(@DoNotAutobox Number yearsToSubtract);
    
    public native Month month();
    
    public native double monthValue();
    
    public native YearMonth plus(TemporalAmount amount);
    
    public native YearMonth plus(@DoNotAutobox Number amountToAdd, TemporalUnit unit);
    
    public native YearMonth plusMonths(@DoNotAutobox Number monthsToAdd);
    
    public native YearMonth plusYears(@DoNotAutobox Number yearsToAdd);
    
    public native String toJSON();
    
    public native YearMonth with(TemporalField field, @DoNotAutobox Number value);
    
    public native YearMonth with(TemporalAdjuster adjuster);
    
    public native YearMonth withMonth(@DoNotAutobox Number month);
    
    public native YearMonth withYear(@DoNotAutobox Number year);
    
    public native YearMonth withYearMonth(@DoNotAutobox Number newYear, @DoNotAutobox Number newMonth);
    
    public native double year();
}
