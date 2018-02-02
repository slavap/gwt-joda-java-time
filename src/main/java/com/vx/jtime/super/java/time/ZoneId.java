package java.time;

import java.time.zone.ZoneRules;
import java.util.LinkedHashSet;
import java.util.Set;

public class ZoneId {
    
    final java.timejs.ZoneId v;
    
    public ZoneId() {
        v = new java.timejs.ZoneId();
    }
    
    public ZoneId(java.timejs.ZoneId value) {
        this.v = value;
    }
    
    public static final ZoneId SYSTEM = new ZoneId(java.timejs.ZoneId.SYSTEM);
    public static final ZoneId UTC = new ZoneId(java.timejs.ZoneId.UTC);

    public static ZoneId systemDefault() {
        return new ZoneId(java.timejs.ZoneId.systemDefault());
    }

    public static ZoneId of(String zoneId) {
        return new ZoneId(java.timejs.ZoneId.of(zoneId));
    }

    public static ZoneId ofOffset(String prefix, ZoneOffset offset) {
        return new ZoneId(java.timejs.ZoneId.ofOffset(prefix, offset.v));
    }

    public static Set<String> getAvailableZoneIds() {
        Set<String> rslt = new LinkedHashSet<String>();
        java.timejs.browser.Array<String> arr = java.timejs.ZoneId.getAvailableZoneIds();
        for (int i = 0; i < arr.length; i++) {
            String s = arr.getByIndex(i); 
            rslt.add(s);
        }
        return rslt;
    }

    /*
        Methods
    */
    
    public boolean equals(Object other) {
        if (other instanceof ZoneId) return v.equals(((ZoneId) other).v);
        return false;
    }
    
    public int hashCode() {
        return v.hashCode();
    }
    
    public String toString() {
        return v.toString();
    }
    
    public ZoneId normalized() {
        return new ZoneId(v.normalized());
    }
    
    public ZoneRules getRules() {
        return new ZoneRules(v.rules());
    }
}
