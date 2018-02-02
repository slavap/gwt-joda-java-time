package java.timejs.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Iterator
  * flags: Object (32768)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 241315
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Iterator<T>
{

    /*
        Methods
    */
    IteratorResult<T> next();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@241345
     */
    IteratorResult<T> next(Object value /* optional */);
    @JsMethod(name = "return")
    IteratorResult<T> return_();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@241387
     */
    @JsMethod(name = "return")
    IteratorResult<T> return_(Object value /* optional */);
    @JsMethod(name = "throw")
    IteratorResult<T> throw_();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@241432
     */
    @JsMethod(name = "throw")
    IteratorResult<T> throw_(Object e /* optional */);
}
