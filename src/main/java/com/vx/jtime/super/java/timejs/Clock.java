package java.timejs;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="Clock")
public class Clock
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.Clock", name = "fixed")
    public static native Clock fixed(Instant fixedInstant, ZoneOffset zoneOffset);

    
    @JsMethod(namespace="JSJoda.Clock", name = "system")
    public static native Clock system(ZoneId zone);

    
    @JsMethod(namespace="JSJoda.Clock", name = "systemDefaultZone")
    public static native Clock systemDefaultZone();

    
    @JsMethod(namespace="JSJoda.Clock", name = "systemUTC")
    public static native Clock systemUTC();

    /*
        Methods
    */
    
    public native Instant instant();
    
    public native double millis();
    
    public native Object zone();
}
