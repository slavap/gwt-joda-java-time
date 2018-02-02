package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="TemporalUnit")
public class TemporalUnit
{

    /*
        Methods
    */
    
    public native <T> T addTo(@DoNotAutobox T temporal, @DoNotAutobox Number amount);
    
    public native double between(Temporal temporal1, Temporal temporal2);
    
    public native Duration duration();
    
    public native Boolean isDateBased();
    
    public native Boolean isDurationEstimated();
    
    public native Boolean isSupportedBy(Temporal temporal);
    
    public native Boolean isTimeBased();
}
