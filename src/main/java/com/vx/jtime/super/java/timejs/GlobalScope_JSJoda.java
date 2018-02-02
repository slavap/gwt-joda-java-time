package java.timejs;

import java.timejs.browser.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of JSJoda (java java.timejs.jsjoda) package
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="JSJoda")
public class GlobalScope_JSJoda
{

    /*
        Static methods
    */

    @JsMethod(namespace="JSJoda", name = "nativeJs")
    public static native TemporalAccessor nativeJs(Object date, ZoneId zone /* optional */);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(UnionOfLocalDateAndLocalDateTimeAndZonedDateTime temporal, ZoneId zone /* optional */);

    @JsMethod(namespace="JSJoda", name = "use")
    public static native Object use(Function plugin);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(LocalDate temporal, ZoneId zone /* optional */);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(LocalDateTime temporal, ZoneId zone /* optional */);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(ZonedDateTime temporal, ZoneId zone /* optional */);

    @JsMethod(namespace="JSJoda", name = "nativeJs")
    public static native TemporalAccessor nativeJs(Object date);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(UnionOfLocalDateAndLocalDateTimeAndZonedDateTime temporal);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(LocalDate temporal);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(LocalDateTime temporal);

    @JsMethod(namespace="JSJoda", name = "convert")
    public static native Object convert(ZonedDateTime temporal);
}
