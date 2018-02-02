package java.time;

import jsinterop.annotations.JsMethod;

public class LocalDateTime {
    
    public final java.timejs.LocalDateTime v;
    
    public LocalDateTime() {
        v = new java.timejs.LocalDateTime();
    }
    
    public LocalDateTime(java.timejs.LocalDateTime value) {
        this.v = value;
    }
    
    public static final LocalDateTime MIN = new LocalDateTime(java.timejs.LocalDateTime.MIN);  

    public static final LocalDateTime MAX = new LocalDateTime(java.timejs.LocalDateTime.MAX);

    public static LocalDateTime of() {
        return new LocalDateTime(java.timejs.LocalDateTime.of());
    }
    
    public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoSecond) {
        return new LocalDateTime(java.timejs.LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoSecond));
    }
    
    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        return new LocalDateTime(java.timejs.LocalDateTime.ofInstant(instant.v, zoneId.v));
    }
    
    public static LocalDateTime ofInstant(Instant instant) {
        return new LocalDateTime(java.timejs.LocalDateTime.ofInstant(instant.v));
    }

    public static LocalDateTime parse(String text) {
        return new LocalDateTime(java.timejs.LocalDateTime.parse(text));
    }
    
    public static LocalDateTime now() {
        return new LocalDateTime(java.timejs.LocalDateTime.now());
    }
    
    public static LocalDateTime now(ZoneId zone) {
        return new LocalDateTime(java.timejs.LocalDateTime.now(zone.v));
    }

    /*
        Methods
    */
    
    public int compareTo(LocalDateTime other) {
        return (int) v.compareTo(other.v);
    }
    
    public boolean equals(Object other) {
        if (other instanceof LocalDateTime) return v.equals(((LocalDateTime) other).v);
        return false;
    }
    
    public int hashCode() {
        return v.hashCode();
    }
    
    public String toJSON() {
        return v.toJSON();
    }
    
    public String toString() {
        return v.toString();
    }
    
    public ZonedDateTime atZone(ZoneId zone) {
        return new ZonedDateTime(v.atZone(zone.v));
    }
    
    public int getDayOfMonth() {
        return (int) v.dayOfMonth();
    }
    
    public int getDayOfYear() {
        return (int) v.dayOfYear();
    }
    
    public int getHour() {
        return (int) v.hour();
    }
    
    public boolean isAfter(LocalDateTime other) {
        return v.isAfter(other.v);
    }
    
    public boolean isBefore(LocalDateTime other) {
        return v.isBefore(other.v);
    }
    
    public LocalDateTime minusDays(long days) {
        return new LocalDateTime(v.minusDays(days));
    }
    
    public LocalDateTime minusHours(long hours) {
        return new LocalDateTime(v.minusHours(hours));
    }
    
    public LocalDateTime minusMinutes(long minutes) {
        return new LocalDateTime(v.minusMinutes(minutes));
    }
    
    public LocalDateTime minusMonths(long months) {
        return new LocalDateTime(v.minusMonths(months));
    }
    
    public LocalDateTime minusNanos(long nanos) {
        return new LocalDateTime(v.minusNanos(nanos));
    }
    
    public LocalDateTime minusSeconds(long seconds) {
        return new LocalDateTime(v.minusSeconds(seconds));
    }
    
    public LocalDateTime minusWeeks(long weeks) {
        return new LocalDateTime(v.minusWeeks(weeks));
    }
    
    public LocalDateTime minusYears(long years) {
        return new LocalDateTime(v.minusYears(years));
    }
    
    public int getMinute() {
        return (int) v.minute();
    }
    
    public int getMonthValue() {
        return (int) v.monthValue();
    }
    
    public int getNano() {
        return (int) v.nano();
    }
    
    public LocalDateTime plusDays(long days) {
        return new LocalDateTime(v.plusDays(days));
    }
    
    public LocalDateTime plusHours(long hours) {
        return new LocalDateTime(v.plusHours(hours));
    }
    
    public LocalDateTime plusMinutes(long minutes) {
        return new LocalDateTime(v.plusMinutes(minutes));
    }
    
    public LocalDateTime plusMonths(long months) {
        return new LocalDateTime(v.plusMonths(months));
    }
    
    public LocalDateTime plusNanos(long nanos) {
        return new LocalDateTime(v.plusNanos(nanos));
    }
    
    public LocalDateTime plusSeconds(long seconds) {
        return new LocalDateTime(v.plusSeconds(seconds));
    }
    
    public LocalDateTime plusWeeks(long weeks) {
        return new LocalDateTime(v.plusWeeks(weeks));
    }
    
    public LocalDateTime plusYears(long years) {
        return new LocalDateTime(v.plusYears(years));
    }
    
    public int getSecond() {
        return (int) v.second();
    }
    
    public LocalDateTime withDayOfMonth(int dayOfMonth) {
        return new LocalDateTime(v.withDayOfMonth(dayOfMonth));
    }
    
    public LocalDateTime withDayOfYear(int dayOfYear) {
        return new LocalDateTime(v.withDayOfYear(dayOfYear));
    }
    
    public LocalDateTime withHour(int hour) {
        return new LocalDateTime(v.withHour(hour));
    }
    
    public LocalDateTime withMinute(int minute) {
        return new LocalDateTime(v.withMinute(minute));
    }
    
    public LocalDateTime withMonth(int month) {
        return new LocalDateTime(v.withMonth(month));
    }
    
    public LocalDateTime withNano(int nanoOfSecond) {
        return new LocalDateTime(v.withNano(nanoOfSecond));
    }
    
    public LocalDateTime withSecond(int second) {
        return new LocalDateTime(v.withSecond(second));
    }
    
    public LocalDateTime withYear(int year) {
        return new LocalDateTime(v.withYear(year));        
    }
    
    public int getYear() {
        return (int) v.year();
    }
    
}
