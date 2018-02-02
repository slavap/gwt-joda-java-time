package fr.lteconsulting.prebuilt;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * 
 */
@JsFunction
public interface Function2<P1, P2, R>{
    R call(@DoNotAutobox P1 p1, @DoNotAutobox P2 p2);
}
