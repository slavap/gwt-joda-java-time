package java.timejs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("unusable-by-js")
@JsType(isNative=true, namespace="JSJoda", name="ChronoUnit")
public class ChronoUnit extends TemporalUnit 
{

    /*
        Static properties
    */

    @JsProperty(namespace="JSJoda.ChronoUnit", name="MICROS")
    public static ChronoUnit MICROS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="MILLIS")
    public static ChronoUnit MILLIS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="SECONDS")
    public static ChronoUnit SECONDS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="MINUTES")
    public static ChronoUnit MINUTES;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="HOURS")
    public static ChronoUnit HOURS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="HALF_DAYS")
    public static ChronoUnit HALF_DAYS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="DAYS")
    public static ChronoUnit DAYS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="WEEKS")
    public static ChronoUnit WEEKS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="MONTHS")
    public static ChronoUnit MONTHS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="YEARS")
    public static ChronoUnit YEARS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="DECADES")
    public static ChronoUnit DECADES;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="CENTURIES")
    public static ChronoUnit CENTURIES;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="MILLENNIA")
    public static ChronoUnit MILLENNIA;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="ERAS")
    public static ChronoUnit ERAS;

    @JsProperty(namespace="JSJoda.ChronoUnit", name="FOREVER")
    public static ChronoUnit FOREVER;

    /*
        Methods
    */
    
    public native double compareTo(TemporalUnit other);
}
