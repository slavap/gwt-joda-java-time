package java.timejs.browser;

import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: Array
  * flags: Object (32768)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 48469
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 62575
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 216679
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 241635
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 272925
  * source type: Array
  * flags: TypeParameter (16384)
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 48469
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 62575
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 216679
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 241635
  * declared in: c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts at pos 272925
  * 2 constructors
 */
@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Array")
public class Array<T>
{

    /*
        Constructors
    */
    public Array (@DoNotAutobox Number arrayLength /* optional */) {
    } 
    public Array () {
    } 

    @JsOverlay
    public final void setByIndex(int index, @DoNotAutobox T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Static methods
    */

    /** 
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:62485
     */
    @JsMethod(namespace="Array", name = "isArray")
    public static native <T> Boolean isArray(Object arg);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:219929
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike, Function2<T, Number, U> mapfn);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:219929
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220028
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220147
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220394
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T> Array<T> from(ArrayLike<T> arrayLike);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:219929
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220028
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220147
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220394
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:242377
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T, U> Array<U> from(Iterable<T> iterable, Function2<T, Number, U> mapfn);

    /** 
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:219929
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220028
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220147
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220394
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:242377
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:242474
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:242591
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:242830
     */
    @JsMethod(namespace="Array", name = "from")
    public static native <T> Array<T> from(Iterable<T> iterable);

    /** 
      * Returns a new array from a set of elements.
      * source : c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts:220587
     */
    @JsMethod(namespace="Array", name = "of")
    public static native <T> Array<T> of(@DoNotAutobox T...  items);

    @JsMethod(namespace="Array", name = "of")
    public static native <T> Array<T> of();

    /*
        Properties
    */

    /** 
      * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
     */
    public int length;

    /*
        Methods
    */
    // skipped method ___at_iterator
    // skipped method ___at_unscopables
    public native Array<T> concat();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49185
      * Combines two or more arrays.
      * Combines two or more arrays.
     */
    public native Array<T> concat(Array<T>...  items);
    public native Array<T> concat(@DoNotAutobox T...  items);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49340
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 1
     */
    public native Array<T> concat(UnionOfArrayOfTAndT<T>...  items);
    public native Array<T> copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@219547
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
     */
    public native Array<T> copyWithin(@DoNotAutobox Number target, @DoNotAutobox Number start, @DoNotAutobox Number end /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@241820
      * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, T>> entries();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@52560
      * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<T, Number, Array<T>, Boolean> callbackfn);
    public native Array<T> fill(@DoNotAutobox T value);
    public native Array<T> fill(@DoNotAutobox T value, @DoNotAutobox Number start /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@218973
      * Returns the this object after filling the section identified by start and end with value
     */
    public native Array<T> fill(@DoNotAutobox T value, @DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@58885
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native Array<T> filter(Function3<T, Number, Array<T>, Object> callbackfn);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@217279
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    public native T find(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@218194
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    public native double findIndex(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@54087
      * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<T, Number, Array<T>> callbackfn);
    @JsProperty(name = "length")
    public native int getLength();
    public native double indexOf(@DoNotAutobox T searchElement);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@51658
      * Returns the index of the first occurrence of a value in an array.
     */
    public native double indexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    public native String join();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49657
      * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@241929
      * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();
    public native double lastIndexOf(@DoNotAutobox T searchElement);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@52026
      * Returns the index of the last occurrence of a specified value in an array.
     */
    public native double lastIndexOf(@DoNotAutobox T searchElement, @DoNotAutobox Number fromIndex /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@54850
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     */
    public native <U> TupleOf5<U, U, U, U, U> map(Function3<T, Number, Array<T>, U> callbackfn);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49038
      * Removes the last element from an array and returns it.
     */
    public native T pop();
    public native double push();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@48925
      * Appends new elements to an array, and returns the new length of the array.
     */
    public native double push(@DoNotAutobox T...  items);
    public native T reduce(Function4<T, T, Number, Array<T>, T> callbackfn);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@59809
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    public native T reduce(Function4<T, T, Number, Array<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    public native T reduceRight(Function4<T, T, Number, Array<T>, T> callbackfn);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@61321
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     */
    public native T reduceRight(Function4<T, T, Number, Array<T>, T> callbackfn, @DoNotAutobox T initialValue /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49755
      * Reverses the elements in an Array.
     */
    public native Array<T> reverse();
    @JsProperty(name = "length")
    public native void setLength(int value);
    
    public native void setLength(double value);
    
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@49856
      * Removes the first element from an array and returns it.
     */
    public native T shift();
    public native Array<T> slice();
    public native Array<T> slice(@DoNotAutobox Number start /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@50080
      * Returns a section of an array.
     */
    public native Array<T> slice(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@53371
      * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<T, Number, Array<T>, Boolean> callbackfn);
    public native Array<T> sort();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@50335
      * Sorts an array.
     */
    public native Array<T> sort(Function2<T, T, Number> compareFn /* optional */);
    public native Array<T> splice(@DoNotAutobox Number start);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@50689
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     */
    public native Array<T> splice(@DoNotAutobox Number start, @DoNotAutobox Number deleteCount /* optional */);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@51134
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * VERSION 1
     */
    public native Array<T> splice(@DoNotAutobox Number start, @DoNotAutobox Number deleteCount, @DoNotAutobox T...  items);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@48747
     */
    public native String toLocaleString();
    public native double unshift();
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@51342
      * Inserts new elements at the start of an array.
     */
    public native double unshift(@DoNotAutobox T...  items);
    /** 
      * c:/Temp/typescript2java-master/node_modules/typescript/lib/lib.es6.d.ts@242032
      * Returns an list of values in the array
     */
    public native IterableIterator<T> values();
}
