package java.time;

import javaemul.internal.annotations.DoNotAutobox;

public enum Month {

    JANUARY  (java.timejs.Month.JANUARY),
    FEBRUARY (java.timejs.Month.FEBRUARY),
    MARCH    (java.timejs.Month.MARCH),
    APRIL    (java.timejs.Month.APRIL),
    MAY      (java.timejs.Month.MAY),
    JUNE     (java.timejs.Month.JUNE),
    JULY     (java.timejs.Month.JULY),
    AUGUST   (java.timejs.Month.AUGUST),
    SEPTEMBER(java.timejs.Month.SEPTEMBER),
    OCTOBER  (java.timejs.Month.OCTOBER),
    NOVEMBER (java.timejs.Month.NOVEMBER),
    DECEMBER (java.timejs.Month.DECEMBER);
    
    final java.timejs.Month v;
    
    private Month(java.timejs.Month value) {
        this.v = value;
    }
    
    public static Month of(int month) {
        for (Month i : Month.values()) {
            if (i.getValue() == month) return i;
        }
        return null;
    }
    
    public int firstDayOfYear(boolean leapYear) {
        return (int) v.firstDayOfYear(leapYear);
    }
    
    public Month firstMonthOfQuarter() {
        return of((int) v.firstMonthOfQuarter().value());
    }
    
    public int getValue() {
        return (int) v.value();
    }
    
    public int length(boolean leapYear) {
        return (int) v.length(leapYear);
    }
    
    public int maxLength() {
        return (int) v.maxLength();
    }
    
    public int minLength() {
        return (int) v.minLength();
    }
    
    public Month minus(long months) {
        return of((int) v.minus(months).value());
    }
    
    public Month plus(long months) {
        return of((int) v.plus(months).value());
    }
    
}