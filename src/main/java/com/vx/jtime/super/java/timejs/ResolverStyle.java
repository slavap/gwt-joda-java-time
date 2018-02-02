package java.timejs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="ResolverStyle")
public class ResolverStyle
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.ResolverStyle", name="STRICT")
    public static ResolverStyle STRICT;

    @JsProperty(namespace="JSJoda.ResolverStyle", name="SMART")
    public static ResolverStyle SMART;

    @JsProperty(namespace="JSJoda.ResolverStyle", name="LENIENT")
    public static ResolverStyle LENIENT;

}
