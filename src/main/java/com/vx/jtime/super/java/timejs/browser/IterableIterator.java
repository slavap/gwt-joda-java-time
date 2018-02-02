package java.timejs.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: IterableIterator
  * flags: Object (32768)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 241534

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IterableIterator<T> implements Iterator<T> 
{

    /*
        Methods
    */
    // skipped method ___at_iterator
    public native IteratorResult<T> next();
    /** 
      * inherited from (java.timejs.browser.Iterator)
     */
    public native IteratorResult<T> next(Object value /* optional */);
    @JsMethod(name = "return")
    public native IteratorResult<T> return_();
    /** 
      * inherited from (java.timejs.browser.Iterator)
     */
    @JsMethod(name = "return")
    public native IteratorResult<T> return_(Object value /* optional */);
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_();
    /** 
      * inherited from (java.timejs.browser.Iterator)
     */
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_(Object e /* optional */);
}
