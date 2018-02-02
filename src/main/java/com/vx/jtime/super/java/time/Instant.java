package java.time;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

public class Instant {
    
    final java.timejs.Instant v;
    
    public Instant() {
        v = new java.timejs.Instant();
    }
    
    public Instant(java.timejs.Instant value) {
        this.v = value;
    }

    public static final Instant EPOCH = new Instant(java.timejs.Instant.EPOCH);

    public static final Instant MIN = new Instant(java.timejs.Instant.MIN);
    public static final Instant MAX  = new Instant(java.timejs.Instant.MAX);

    public static final Instant MIN_SECONDS  = new Instant(java.timejs.Instant.MIN_SECONDS);
    public static final Instant MAX_SECONDS  = new Instant(java.timejs.Instant.MAX_SECONDS);

    
    public static Instant ofEpochMilli(long epochMilli) {
        return new Instant(java.timejs.Instant.ofEpochMilli(epochMilli));
    }

    public static Instant ofEpochSecond(long epochSecond, long nanoAdjustment) {
        return new Instant(java.timejs.Instant.ofEpochSecond(epochSecond, nanoAdjustment));
    }
    
    public static Instant ofEpochSecond(long epochSecond) {
        return new Instant(java.timejs.Instant.ofEpochSecond(epochSecond));
    }
    
    public static Instant parse(String text) {
        return new Instant(java.timejs.Instant.parse(text));
    }

    public static Instant now() {
        return new Instant(java.timejs.Instant.now());
    }

    /*
        Methods
    */
    
    public int compareTo(Instant other) {
        return (int) v.compareTo(other.v);
    }
    
    public boolean equals(Object otherInstant) {
        if (otherInstant instanceof Instant) return v.equals(((Instant) otherInstant).v);
        return false;
    }
    
    public int hashCode() {
        return v.hashCode();
    }
    
    public long getEpochSecond() {
        return (long) v.epochSecond();
    }
    
    public boolean isAfter(Instant otherInstant) {
        return v.isAfter(otherInstant.v);
    }
    
    public boolean isBefore(Instant otherInstant) {
        return v.isBefore(otherInstant.v);
    }
    
    public Instant minusMillis(long millisToSubtract) {
        return new Instant(v.minusMillis(millisToSubtract));
    }
    
    public Instant minusNanos(long nanosToSubtract) {
        return new Instant(v.minusNanos(nanosToSubtract));
    }
    
    public Instant minusSeconds(long secondsToSubtract) {
        return new Instant(v.minusSeconds(secondsToSubtract));
    }
    
    public int getNano() {
        return (int) v.nano();
    }
    
    public Instant plusMillis(long millisToAdd) {
        return new Instant(v.plusMillis(millisToAdd));
    }
    
    public Instant plusNanos(long nanosToAdd) {
        return new Instant(v.plusNanos(nanosToAdd));
    }
    
    public Instant plusSeconds(long secondsToAdd) {
        return new Instant(v.plusSeconds(secondsToAdd));
    }
    
    public long toEpochMilli() {
        return (long) v.toEpochMilli();
    }

}
