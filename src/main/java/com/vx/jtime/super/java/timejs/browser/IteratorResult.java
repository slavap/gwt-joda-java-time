package java.timejs.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IteratorResult
  * flags: Object (32768)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 241249

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IteratorResult<T>
{

    /*
        Properties
    */

    public Boolean done;

    public T value;

    /*
        Methods
    */
    @JsProperty(name = "done")
    public native Boolean getDone();
    @JsProperty(name = "value")
    public native T getValue();
    @JsProperty(name = "done")
    public native void setDone(Boolean value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox T value);
}
