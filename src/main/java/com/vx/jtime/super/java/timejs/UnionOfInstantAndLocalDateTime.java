package java.timejs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfInstantAndLocalDateTime extends Temporal  {
    @JsOverlay
    public final Instant asInstant() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfInstantAndLocalDateTime ofInstant(Instant value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final LocalDateTime asLocalDateTime() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfInstantAndLocalDateTime ofLocalDateTime(LocalDateTime value) {
        return Js.uncheckedCast( value );
    }
    
}
