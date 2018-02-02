package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="IsoChronology")
public class IsoChronology
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.IsoChronology", name = "isLeapYear")
    public static native Boolean isLeapYear(@DoNotAutobox Number prolepticYear);

    /*
        Methods
    */
    
    public native boolean equals(Object other);
    
    public native Object resolveDate(Object fieldValues, Object resolverStyle);
}
