package java.timejs;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="ZoneRegion")
public class ZoneRegion extends ZoneId 
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ZoneRegion", name = "ofId")
    public static native ZoneId ofId(String zoneId);

    /*
        Methods
    */
    
    public native String id();
}
