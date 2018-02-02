package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="DateTimeFormatterBuilder")
public class DateTimeFormatterBuilder
{

    /*
        Constructors
    */
    public DateTimeFormatterBuilder () {
    } 

    /*
        Methods
    */
    
    public native DateTimeFormatterBuilder append(DateTimeFormatter formatter);
    
    public native DateTimeFormatterBuilder appendFraction(TemporalField field, @DoNotAutobox Number minWidth, @DoNotAutobox Number maxWidth, Boolean decimalPoint);
    
    public native DateTimeFormatterBuilder appendInstant(@DoNotAutobox Number fractionalDigits);
    
    public native DateTimeFormatterBuilder appendLiteral(Object literal);
    
    public native DateTimeFormatterBuilder appendOffset(String pattern, String noOffsetText);
    
    public native DateTimeFormatterBuilder appendOffsetId();
    
    public native DateTimeFormatterBuilder appendPattern(String pattern);
    
    public native DateTimeFormatterBuilder appendValue();
    
    public native DateTimeFormatterBuilder appendValueReduced();
    
    public native DateTimeFormatterBuilder appendZoneId();
    
    public native DateTimeFormatterBuilder optionalEnd();
    
    public native DateTimeFormatterBuilder optionalStart();
    
    public native DateTimeFormatterBuilder padNext();
    
    public native DateTimeFormatterBuilder parseCaseInsensitive();
    
    public native DateTimeFormatterBuilder parseCaseSensitive();
    
    public native DateTimeFormatterBuilder parseLenient();
    
    public native DateTimeFormatterBuilder parseStrict();
    
    public native DateTimeFormatter toFormatter(ResolverStyle resolverStyle);
}
