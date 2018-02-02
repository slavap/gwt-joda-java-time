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
public interface UnionOfChronoFieldAndChronoUnit  {
    @JsOverlay
    default ChronoField asChronoField() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfChronoFieldAndChronoUnit ofChronoField(ChronoField value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ChronoUnit asChronoUnit() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfChronoFieldAndChronoUnit ofChronoUnit(ChronoUnit value) {
        return Js.cast( value );
    }
    
}
