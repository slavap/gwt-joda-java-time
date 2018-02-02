package java.timejs;

import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="TemporalAdjuster")
public class TemporalAdjuster
{

    /*
        Methods
    */
    
    public native Temporal adjustInto(Temporal temporal);
}
