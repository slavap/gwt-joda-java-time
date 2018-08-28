package java.time.format;

import jsinterop.annotations.JsProperty;

public class DateTimeFormatter {
    
    public final java.timejs.DateTimeFormatter v;
    
    public static final DateTimeFormatter ISO_LOCAL_DATE = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_LOCAL_DATE);

    public static final DateTimeFormatter ISO_LOCAL_TIME  = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_LOCAL_TIME);

    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    
    public static final DateTimeFormatter ISO_INSTANT = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_INSTANT);
    
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    
    public static final DateTimeFormatter ISO_ZONED_DATE_TIME = new DateTimeFormatter(java.timejs.DateTimeFormatter.ISO_ZONED_DATE_TIME);
    
    public DateTimeFormatter(java.timejs.DateTimeFormatter value) {
        this.v = value;
    }
    
    public static DateTimeFormatter ofPattern(String pattern) {
        return new DateTimeFormatter(java.timejs.DateTimeFormatter.ofPattern(pattern));
    }
}
