package java.timejs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfClockAndZoneId  {
    @JsOverlay
    default Clock asClock() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfClockAndZoneId ofClock(Clock value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ZoneId asZoneId() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfClockAndZoneId ofZoneId(ZoneId value) {
        return Js.cast( value );
    }
    
}
