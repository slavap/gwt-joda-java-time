package fr.lteconsulting.prebuilt;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * 
 */
@JsFunction
public interface Action3<P1, P2, P3>{
    void call(@DoNotAutobox P1 p1, @DoNotAutobox P2 p2, @DoNotAutobox P3 p3);
}
