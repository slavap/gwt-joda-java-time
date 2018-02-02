package java.timejs;

import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="TemporalAccessor")
public class TemporalAccessor
{

    /*
        Methods
    */
    
    public native double get(TemporalField field);
    
    public native Object query(TemporalQuery query);
    
    public native ValueRange range(TemporalField field);
}
