package java.timejs.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/** 
  * Tuple adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TupleOf4<A, B, C, D> {
    @JsOverlay
    public final A getNb1() {
        return (A) Js.asArrayLike(this).getAt(0);
    }
    @JsOverlay
    public final void setNb1(A value) {
        Js.asArrayLike(this).setAt(0, value);
    }
    @JsOverlay
    public final B getNb2() {
        return (B) Js.asArrayLike(this).getAt(1);
    }
    @JsOverlay
    public final void setNb2(B value) {
        Js.asArrayLike(this).setAt(1, value);
    }
    @JsOverlay
    public final C getNb3() {
        return (C) Js.asArrayLike(this).getAt(2);
    }
    @JsOverlay
    public final void setNb3(C value) {
        Js.asArrayLike(this).setAt(2, value);
    }
    @JsOverlay
    public final D getNb4() {
        return (D) Js.asArrayLike(this).getAt(3);
    }
    @JsOverlay
    public final void setNb4(D value) {
        Js.asArrayLike(this).setAt(3, value);
    }
    @JsOverlay
    public final JsArrayLike<Object> asList() {
        return Js.uncheckedCast(this);
    }
}
