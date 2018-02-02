package java.time;

public class ZoneOffset extends ZoneId {
    
    public final java.timejs.ZoneOffset v;
    
    public ZoneOffset() {
        v = new java.timejs.ZoneOffset();
    }
    
    public ZoneOffset(java.timejs.ZoneOffset value) {
        this.v = value;
    }
    
    public static final ZoneOffset MAX_SECONDS = new ZoneOffset(java.timejs.ZoneOffset.MAX_SECONDS); 
    public static final ZoneOffset UTC = new ZoneOffset(java.timejs.ZoneOffset.UTC);
    public static final ZoneOffset MIN = new ZoneOffset(java.timejs.ZoneOffset.MIN);
    public static final ZoneOffset MAX = new ZoneOffset(java.timejs.ZoneOffset.MAX);

    public static ZoneOffset of(String offsetId) {
        return new ZoneOffset(java.timejs.ZoneOffset.of(offsetId));
    }

    public static ZoneOffset ofHours(int hours) {
        return new ZoneOffset(java.timejs.ZoneOffset.ofHours(hours));
    }

    public static ZoneOffset ofHoursMinutes(int hours, int minutes) {
        return new ZoneOffset(java.timejs.ZoneOffset.ofHoursMinutes(hours, minutes));
    }
    
    public static ZoneOffset ofHoursMinutesSeconds(int hours, int minutes, int seconds) {
        return new ZoneOffset(java.timejs.ZoneOffset.ofHoursMinutesSeconds(hours, minutes, seconds));
    }
    
    public static ZoneOffset ofTotalMinutes(int totalMinutes) {
        return new ZoneOffset(java.timejs.ZoneOffset.ofTotalMinutes(totalMinutes));
    }

    public static ZoneOffset ofTotalSeconds(int totalSeconds) {
        return new ZoneOffset(java.timejs.ZoneOffset.ofTotalSeconds(totalSeconds));
    }

    /*
        Methods
    */
    
    public int compareTo(ZoneOffset other) {
        return (int) v.compareTo(other.v);
    }
    
    public String getId() {
        return v.id();
    }
    
    public int getTotalSeconds() {
        return (int) v.totalSeconds();
    }
    
    public String toString() {
        return v.toString();
    }
    
}