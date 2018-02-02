package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="MathUtil")
public class MathUtil
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "compareNumbers")
    public static native double compareNumbers(@DoNotAutobox Number a, @DoNotAutobox Number b);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "floorDiv")
    public static native double floorDiv(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "floorMod")
    public static native double floorMod(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "intDiv")
    public static native double intDiv(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "intMod")
    public static native double intMod(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "parseInt")
    public static native double parseInt(@DoNotAutobox Number value);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "roundDown")
    public static native double roundDown(@DoNotAutobox Number r);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "safeAdd")
    public static native double safeAdd(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "safeMultiply")
    public static native double safeMultiply(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "safeSubtract")
    public static native double safeSubtract(@DoNotAutobox Number x, @DoNotAutobox Number y);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "safeToInt")
    public static native double safeToInt(@DoNotAutobox Number value);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "safeZero")
    public static native double safeZero(@DoNotAutobox Number value);

    
    @JsMethod(namespace="JSJoda.MathUtil", name = "verifyInt")
    public static native void verifyInt(@DoNotAutobox Number value);
}
