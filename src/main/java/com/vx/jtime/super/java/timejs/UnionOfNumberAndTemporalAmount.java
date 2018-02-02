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
public interface UnionOfNumberAndTemporalAmount  {
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndTemporalAmount ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TemporalAmount asTemporalAmount() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndTemporalAmount ofTemporalAmount(TemporalAmount value) {
        return Js.cast( value );
    }
    
}
