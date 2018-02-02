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
public interface UnionOfNumberAndTemporalUnit  {
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndTemporalUnit ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TemporalUnit asTemporalUnit() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndTemporalUnit ofTemporalUnit(TemporalUnit value) {
        return Js.cast( value );
    }
    
}
