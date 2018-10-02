package java.time;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import jsinterop.annotations.JsMethod;

public class LocalDate {
    
    public final java.timejs.LocalDate v;
    
    public LocalDate() {
        v = new java.timejs.LocalDate();
    }
    
    public LocalDate(java.timejs.LocalDate value) {
        this.v = value;
    }
    
    public static final LocalDate MIN = new LocalDate(java.timejs.LocalDate.MIN);  

    public static final LocalDate MAX = new LocalDate(java.timejs.LocalDate.MAX);
    
    /** The date at epoch day 0, that is 1970-01-01 */
    public static final LocalDate EPOCH_0 = new LocalDate(java.timejs.LocalDate.EPOCH_0);

    public static LocalDate of(int year, int month, int dayOfMonth) {
        return new LocalDate(java.timejs.LocalDate.of(year, month, dayOfMonth));
    }
    
    public static LocalDate of(int year, Month month, int dayOfMonth) {
        return new LocalDate(java.timejs.LocalDate.of(year, month.v, dayOfMonth));
    }
    
    public static LocalDate ofEpochDay(long epochDay) {
        return new LocalDate(java.timejs.LocalDate.ofEpochDay(epochDay));
    }
    
    public static LocalDate ofYearDay(int year, int dayOfYear) {
        return new LocalDate(java.timejs.LocalDate.ofYearDay(year, dayOfYear));
    }
    
    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        return new LocalDate(java.timejs.LocalDate.ofInstant(instant.v, zoneId.v));
    }
    
    public static LocalDate ofInstant(Instant instant) {
        return new LocalDate(java.timejs.LocalDate.ofInstant(instant.v));
    }

    public static LocalDate parse(String text) {
        return new LocalDate(java.timejs.LocalDate.parse(text));
    }
    
    public static LocalDate parse(String text, DateTimeFormatter formatter) {
        return new LocalDate(java.timejs.LocalDate.parse(text, formatter.v));
    }
    
    public static LocalDate now() {
        return new LocalDate(java.timejs.LocalDate.now());
    }
    
    public static LocalDate now(ZoneId zone) {
        return new LocalDate(java.timejs.LocalDate.now(zone.v));
    }

    /*
        Methods
    */
    
    public LocalDateTime atStartOfDay() {
        return new LocalDateTime(v.atStartOfDay());
    }
    
    public ZonedDateTime atStartOfDay(ZoneId zone) {
        return new ZonedDateTime(v.atStartOfDayWithZone(zone.v));
    }
    
    public LocalDateTime atTime(int hour, int minute) {
        return new LocalDateTime(v.atTime(hour, minute));
    }
    
    public LocalDateTime atTime(int hour, int minute, int second) {
        return new LocalDateTime(v.atTime(hour, minute, second));
    }
    
    public LocalDateTime atTime(int hour, int minute, int second, int nanoOfSecond) {
        return new LocalDateTime(v.atTime(hour, minute, second, nanoOfSecond));
    }
    
    public int compareTo(LocalDate other) {
        return (int) v.compareTo(other.v);
    }
    
    public boolean equals(Object other) {
        if (other instanceof LocalDate) return v.equals(((LocalDate) other).v);
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
    
    public String format(DateTimeFormatter formatter) {
        return v.format(formatter.v);
    }
    
    public int getDayOfMonth() {
        return (int) v.dayOfMonth();
    }
    
    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of((int) v.dayOfWeek().value()); 
    }
    
    public int getDayOfYear() {
        return (int) v.dayOfYear();
    }
    
    public long getLong(ChronoField field) {
        return (long) v.getLong(field.v);
    }
    
    public Month getMonth() {
        return Month.of(getMonthValue());
    }
    
    public int getMonthValue() {
        return (int) v.monthValue();
    }
    
    public int getYear() {
        return (int) v.year();
    }
    
    public boolean isAfter(LocalDate other) {
        return v.isAfter(other.v);
    }
    
    public boolean isBefore(LocalDate other) {
        return v.isBefore(other.v);
    }
    
    public boolean isEqual(LocalDate other) {
        return v.isEqual(other.v);
    }
    
    public boolean isLeapYear() {
        return v.isLeapYear();
    }
    
    public int lengthOfMonth() {
        return (int) v.lengthOfMonth();
    }
    
    public int lengthOfYear() {
        return (int) v.lengthOfYear();
    }
    
    public LocalDate minusDays(long days) {
        return new LocalDate(v.minusDays(days));
    }
    
    public LocalDate minusMonths(long months) {
        return new LocalDate(v.minusMonths(months));
    }
    
    public LocalDate minusWeeks(long weeks) {
        return new LocalDate(v.minusWeeks(weeks));
    }
    
    public LocalDate minusYears(long years) {
        return new LocalDate(v.minusYears(years));
    }
    
    public LocalDate plusDays(long days) {
        return new LocalDate(v.plusDays(days));
    }
    
    public LocalDate plusMonths(long months) {
        return new LocalDate(v.plusMonths(months));
    }
    
    public LocalDate plusWeeks(long weeks) {
        return new LocalDate(v.plusWeeks(weeks));
    }
    
    public LocalDate plusYears(long years) {
        return new LocalDate(v.plusYears(years));
    }
    
    public LocalDate withDayOfMonth(int dayOfMonth) {
        return new LocalDate(v.withDayOfMonth(dayOfMonth));
    }
    
    public LocalDate withDayOfYear(int dayOfYear) {
        return new LocalDate(v.withDayOfYear(dayOfYear));
    }
    
    public LocalDate withMonth(int month) {
        return new LocalDate(v.withMonth(month));
    }
    
    public LocalDate withYear(int year) {
        return new LocalDate(v.withYear(year));        
    }

    public long toEpochDay() {
        return (long) v.toEpochDay();
    }

}
