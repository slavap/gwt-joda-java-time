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
public abstract class UnionOfLocalDateAndLocalDateTimeAndZonedDateTime extends Temporal  {
    @JsOverlay
    public final LocalDate asLocalDate() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfLocalDateAndLocalDateTimeAndZonedDateTime ofLocalDate(LocalDate value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final LocalDateTime asLocalDateTime() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfLocalDateAndLocalDateTimeAndZonedDateTime ofLocalDateTime(LocalDateTime value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final ZonedDateTime asZonedDateTime() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfLocalDateAndLocalDateTimeAndZonedDateTime ofZonedDateTime(ZonedDateTime value) {
        return Js.uncheckedCast( value );
    }
    
}
