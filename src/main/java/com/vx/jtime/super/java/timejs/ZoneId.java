package java.timejs;

import java.timejs.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="ZoneId")
public class ZoneId
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.ZoneId", name="SYSTEM")
    public static ZoneId SYSTEM;

    @JsProperty(namespace="JSJoda.ZoneId", name="UTC")
    public static ZoneId UTC;

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ZoneId", name = "systemDefault")
    public static native ZoneId systemDefault();

    
    @JsMethod(namespace="JSJoda.ZoneId", name = "of")
    public static native ZoneId of(String zoneId);

    
    @JsMethod(namespace="JSJoda.ZoneId", name = "ofOffset")
    public static native ZoneId ofOffset(String prefix, ZoneOffset offset);

    
    @JsMethod(namespace="JSJoda.ZoneId", name = "from")
    public static native ZoneId from(TemporalAccessor temporal);

    
    @JsMethod(namespace="JSJoda.ZoneId", name = "getAvailableZoneIds")
    public static native Array<String> getAvailableZoneIds();

    /*
        Methods
    */
    
    public native boolean equals(Object other);
    
    public native int hashCode();
    
    public native ZoneId normalized();
    
    public native ZoneRules rules();
    
    public native String toString();
}
