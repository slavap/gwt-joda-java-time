package java.timejs;

import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="TemporalQuery")
public class TemporalQuery
{

    /*
        Methods
    */
    
    public native Object queryFrom(TemporalAccessor temporal);
}
