package java.timejs;

import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ChronoZonedDateTime")
public class ChronoZonedDateTime extends Temporal 
{

    /*
        Methods
    */
    
    public native double compareTo(ChronoZonedDateTime other);
    
    public native boolean equals(Object other);
    
    public native String format(DateTimeFormatter formatter);
    
    public native Boolean isAfter(ChronoZonedDateTime other);
    
    public native Boolean isBefore(ChronoZonedDateTime other);
    
    public native Boolean isEqual(ChronoZonedDateTime other);
    
    public native Object query(Object query);
    
    public native double toEpochSecond();
    
    public native Instant toInstant();
}
