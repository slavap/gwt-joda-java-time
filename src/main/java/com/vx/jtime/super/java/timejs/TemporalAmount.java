package java.timejs;

import java.timejs.browser.Array;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="TemporalAmount")
public class TemporalAmount
{

    /*
        Methods
    */
    
    public native <T> T addTo(@DoNotAutobox T temporal);
    
    public native double get(TemporalUnit unit);
    
    public native <T> T subtractFrom(@DoNotAutobox T temporal);
    
    public native Array<TemporalUnit> units();
}
