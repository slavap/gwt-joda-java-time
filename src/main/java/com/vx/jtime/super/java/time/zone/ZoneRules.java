package java.time.zone;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ZoneRules {
    
    final java.timejs.ZoneRules v;
    
    public ZoneRules() {
        v = new java.timejs.ZoneRules();
    }
    
    public ZoneRules(java.timejs.ZoneRules value) {
        this.v = value;
    }
    
    public static ZoneRules of(ZoneOffset offset) {
        return new ZoneRules(java.timejs.ZoneRules.of(offset.v));
    }

    /*
        Methods
    */
    
    public boolean isFixedOffset() {
        return v.isFixedOffset();
    }
    
    public boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset offset) {
        return v.isValidOffset(localDateTime.v, offset.v);
    }
    
    public ZoneOffset getOffset(LocalDateTime value) {
        return new ZoneOffset(v.offsetOfLocalDateTime(value.v));
    }
    
    public ZoneOffset getOffsetOfEpochMilli(long epochMilli) {
        return new ZoneOffset(v.offsetOfEpochMilli(epochMilli));
    }

}
