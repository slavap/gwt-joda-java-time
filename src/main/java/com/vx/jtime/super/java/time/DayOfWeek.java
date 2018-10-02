package java.time;

import jsinterop.annotations.JsProperty;

public enum DayOfWeek {
    
    MONDAY   (java.timejs.DayOfWeek.MONDAY),   
    TUESDAY  (java.timejs.DayOfWeek.TUESDAY),  
    WEDNESDAY(java.timejs.DayOfWeek.WEDNESDAY),
    THURSDAY (java.timejs.DayOfWeek.THURSDAY), 
    FRIDAY   (java.timejs.DayOfWeek.FRIDAY),   
    SATURDAY (java.timejs.DayOfWeek.SATURDAY), 
    SUNDAY   (java.timejs.DayOfWeek.SUNDAY);   
    
    final java.timejs.DayOfWeek v;
    
    private DayOfWeek(java.timejs.DayOfWeek value) {
        this.v = value;
    }
    
    public static DayOfWeek of(int dayOfWeek) {
        for (DayOfWeek i : DayOfWeek.values()) {
            if (i.getValue() == dayOfWeek) return i;
        }
        return null;
    }
    
    public int getValue() {
        return (int) v.value();
    }
    
    public DayOfWeek minus(long days) {
        return of((int) v.minus(days).value());
    }
    
    public DayOfWeek plus(long days) {
        return of((int) v.plus(days).value());
    }
}