package java.timejs;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfDurationAndNumber  {
    @JsOverlay
    default Duration asDuration() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDurationAndNumber ofDuration(Duration value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDurationAndNumber ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
}
