package java.timejs;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="TemporalQueries")
public class TemporalQueries
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "chronology")
    public static native TemporalQuery chronology();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "localDate")
    public static native TemporalQuery localDate();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "localTime")
    public static native TemporalQuery localTime();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "offset")
    public static native TemporalQuery offset();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "precision")
    public static native TemporalQuery precision();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "zone")
    public static native TemporalQuery zone();

    
    @JsMethod(namespace="JSJoda.TemporalQueries", name = "zoneId")
    public static native TemporalQuery zoneId();
}
