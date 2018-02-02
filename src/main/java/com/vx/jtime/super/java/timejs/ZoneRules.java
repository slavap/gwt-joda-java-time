package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ZoneRules")
public class ZoneRules
{

    /*
        Static methods
    */

    
    @JsMethod(namespace="JSJoda.ZoneRules", name = "of")
    public static native ZoneRules of(ZoneOffset offest);

    /*
        Methods
    */
    
    public native Boolean isFixedOffset();
    
    public native Boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset offset);
    public native ZoneOffset offset(LocalDateTime instantOrLocalDateTime);
    public native ZoneOffset offset(Instant instantOrLocalDateTime);
    
    public native ZoneOffset offset(UnionOfInstantAndLocalDateTime instantOrLocalDateTime);
    
    public native ZoneOffset offsetOfEpochMilli(@DoNotAutobox Number epochMilli);
    
    public native ZoneOffset offsetOfInstant(Instant instant);
    
    public native ZoneOffset offsetOfLocalDateTime(LocalDateTime localDateTime);
}
