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
public interface UnionOfTemporalFieldAndTemporalUnit  {
    @JsOverlay
    default TemporalField asTemporalField() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfTemporalFieldAndTemporalUnit ofTemporalField(TemporalField value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TemporalUnit asTemporalUnit() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfTemporalFieldAndTemporalUnit ofTemporalUnit(TemporalUnit value) {
        return Js.cast( value );
    }
    
}
