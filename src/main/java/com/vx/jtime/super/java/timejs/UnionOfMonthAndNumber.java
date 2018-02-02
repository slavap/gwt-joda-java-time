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
public interface UnionOfMonthAndNumber  {
    @JsOverlay
    default Month asMonth() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfMonthAndNumber ofMonth(Month value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfMonthAndNumber ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
}
