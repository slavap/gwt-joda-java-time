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
public interface UnionOfChronoUnitAndTemporalField  {
    @JsOverlay
    default ChronoUnit asChronoUnit() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfChronoUnitAndTemporalField ofChronoUnit(ChronoUnit value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TemporalField asTemporalField() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfChronoUnitAndTemporalField ofTemporalField(TemporalField value) {
        return Js.cast( value );
    }
    
}
