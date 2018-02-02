package java.time;

public class ZonedDateTime {
    
    final java.timejs.ZonedDateTime v;
    
    public ZonedDateTime() {
        v = new java.timejs.ZonedDateTime();
    }
    
    public ZonedDateTime(java.timejs.ZonedDateTime value) {
        this.v = value;
    }
    
    public static ZonedDateTime of() {
        return new ZonedDateTime(java.timejs.ZonedDateTime.of());
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.of(localDateTime.v, zone.v));
    }

    public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone.v));
    }
    
    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.ofInstant(instant.v, zoneId.v));
    }
    
    public static ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.ofInstant(localDateTime.v, offset.v, zone.v));
    }

    public static ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zone, ZoneOffset preferredOffset) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.ofLocal(localDateTime.v, zone.v, preferredOffset.v));
    }
    
    public static ZonedDateTime ofStrict(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.ofStrict(localDateTime.v, offset.v, zone.v));
    }

    public static ZonedDateTime now() {
        return new ZonedDateTime(java.timejs.ZonedDateTime.now());
    }
    
    public static ZonedDateTime now(ZoneId zone) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.now(zone.v));
    }

    public static ZonedDateTime parse(String text) {
        return new ZonedDateTime(java.timejs.ZonedDateTime.parse(text));
    }

    /*
        Methods
    */
    
    public int getDayOfMonth() {
        return (int) v.dayOfMonth();
    }
    
    public int getDayOfYear() {
        return (int) v.dayOfYear();
    }
    
    public int hashCode() {
        return v.hashCode();
    }
    
    public int getHour() {
        return (int) v.hour();
    }
    
    public ZonedDateTime minusDays(int days) {
        return new ZonedDateTime(v.minusDays(days));
    }
    
    public ZonedDateTime minusHours(int hours) {
        return new ZonedDateTime(v.minusHours(hours));
    }
    
    public ZonedDateTime minusMinutes(int minutes) {
        return new ZonedDateTime(v.minusMinutes(minutes));
    }
    
    public ZonedDateTime minusMonths(int months) {
        return new ZonedDateTime(v.minusMonths(months));
    }
    
    public ZonedDateTime minusNanos(int nanos) {
        return new ZonedDateTime(v.minusNanos(nanos));
    }
    
    public ZonedDateTime minusSeconds(int seconds) {
        return new ZonedDateTime(v.minusSeconds(seconds));
    }
    
    public ZonedDateTime minusWeeks(int weeks) {
        return new ZonedDateTime(v.minusWeeks(weeks));
    }
    
    public ZonedDateTime minusYears(int years) {
        return new ZonedDateTime(v.minusYears(years));
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
    
    public ZoneOffset getOffset() {
        return new ZoneOffset(v.offset());
    }
    
    public ZonedDateTime plusDays(int days) {
        return new ZonedDateTime(v.plusDays(days));
    }
    
    public ZonedDateTime plusHours(int hours) {
        return new ZonedDateTime(v.plusHours(hours));
    }
    
    public ZonedDateTime plusMinutes(int minutes) {
        return new ZonedDateTime(v.plusMinutes(minutes));
    }
    
    public ZonedDateTime plusMonths(int months) {
        return new ZonedDateTime(v.plusMonths(months));
    }
    
    public ZonedDateTime plusNanos(int nanos) {
        return new ZonedDateTime(v.plusNanos(nanos));
    }
    
    public ZonedDateTime plusSeconds(int seconds) {
        return new ZonedDateTime(v.plusSeconds(seconds));
    }
    
    public ZonedDateTime plusWeeks(int weeks) {
        return new ZonedDateTime(v.plusWeeks(weeks));
    }
    
    public ZonedDateTime plusYears(int years) {
        return new ZonedDateTime(v.plusYears(years));
    }
    
    public int getSecond() {
        return (int) v.second();
    }
    
    public String toJSON() {
        return v.toJSON();
    }
    
    public LocalDateTime toLocalDateTime() {
        return new LocalDateTime(v.toLocalDateTime());
    }
    
    public ZonedDateTime withDayOfMonth(int dayOfMonth) {
        return new ZonedDateTime(v.withDayOfMonth(dayOfMonth));
    }
    
    public ZonedDateTime withDayOfYear(int dayOfYear) {
        return new ZonedDateTime(v.withDayOfYear(dayOfYear));
    }
    
    public ZonedDateTime withFixedOffsetZone() {
        return new ZonedDateTime(v.withFixedOffsetZone());
    }
    
    public ZonedDateTime withHour(int hour) {
        return new ZonedDateTime(v.withHour(hour));
    }
    
    public ZonedDateTime withMinute(int minute) {
        return new ZonedDateTime(v.withMinute(minute));
    }
    
    public ZonedDateTime withMonth(int month) {
        return new ZonedDateTime(v.withMonth(month));
    }
    
    public ZonedDateTime withNano(int nanoOfSecond) {
        return new ZonedDateTime(v.withNano(nanoOfSecond));
    }
    
    public ZonedDateTime withSecond(int second) {
        return new ZonedDateTime(v.withSecond(second));
    }
    
    public ZonedDateTime withYear(int year) {
        return new ZonedDateTime(v.withYear(year));        
    }
    
    public ZonedDateTime withZoneSameInstant(ZoneId zone) {
        return new ZonedDateTime(v.withZoneSameInstant(zone.v));
    }
    
    public ZonedDateTime withZoneSameLocal(ZoneId zone) {
        return new ZonedDateTime(v.withZoneSameLocal(zone.v));
    }
    
    public int getYear() {
        return (int) v.year();
    }
    
    public ZoneId getZone() {
        return new ZoneId(v.zone());
    }
    
    public String toString() {
        return v.toString();
    }
    
    public boolean equals(Object other) {
        if (other instanceof ZonedDateTime) return v.equals(((ZonedDateTime) other).v);
        return false;
    }
}
