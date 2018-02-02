package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ValueRange")
public class ValueRange
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ValueRange", name = "of")
    public static native ValueRange of(@DoNotAutobox Number min, @DoNotAutobox Number max);

    
    @JsMethod(namespace="JSJoda.ValueRange", name = "of")
    public static native ValueRange of(@DoNotAutobox Number min, @DoNotAutobox Number maxSmallest, @DoNotAutobox Number maxLargest);

    
    @JsMethod(namespace="JSJoda.ValueRange", name = "of")
    public static native ValueRange of(@DoNotAutobox Number minSmallest, @DoNotAutobox Number minLargest, @DoNotAutobox Number maxSmallest, @DoNotAutobox Number maxLargest);

    /*
        Methods
    */
    
    public native double checkValidIntValue(@DoNotAutobox Number value, TemporalField field);
    
    public native Object checkValidValue(@DoNotAutobox Number value, TemporalField field);
    
    public native boolean equals(Object other);
    
    public native int hashCode();
    
    public native Boolean isFixed();
    
    public native Boolean isIntValue();
    
    public native Boolean isValidIntValue(@DoNotAutobox Number value);
    
    public native Boolean isValidValue(Object value);
    
    public native double largestMinimum();
    
    public native double maximum();
    
    public native double minimum();
    
    public native double smallestMaximum();
}
