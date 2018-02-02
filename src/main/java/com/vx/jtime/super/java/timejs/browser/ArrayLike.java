package java.timejs.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: ArrayLike
  * flags: Object (32768)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 65042

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ArrayLike<T>
{

    @JsOverlay
    public final void setByIndex(int index, @DoNotAutobox T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native int getLength();
    @JsProperty(name = "length")
    public native void setLength(int value);
}
