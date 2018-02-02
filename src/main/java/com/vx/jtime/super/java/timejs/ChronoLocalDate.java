package java.timejs;

import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="ChronoLocalDate")
public class ChronoLocalDate extends Temporal 
{

    /*
        Methods
    */
    
    public native ChronoLocalDate adjustInto(TemporalAdjuster temporal);
    
    public native String format(DateTimeFormatter formatter);
    public native Boolean isSupported(TemporalField fieldOrUnit);
    public native Boolean isSupported(TemporalUnit fieldOrUnit);
    
    public native Boolean isSupported(UnionOfTemporalFieldAndTemporalUnit fieldOrUnit);
}
