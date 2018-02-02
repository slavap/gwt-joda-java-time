package java.timejs;

import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ChronoLocalDateTime")
public class ChronoLocalDateTime extends Temporal 
{

    /*
        Methods
    */
    
    public native Object adjustInto(Object temporal);
    
    public native Chronology chronology();
    
    public native double toEpochSecond(ZoneOffset offset);
    
    public native Instant toInstant(ZoneOffset offset);
}
