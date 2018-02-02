package fr.lteconsulting.prebuilt;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * 
 */
@JsFunction
public interface Function3<P1, P2, P3, R>{
    R call(@DoNotAutobox P1 p1, @DoNotAutobox P2 p2, @DoNotAutobox P3 p3);
}
