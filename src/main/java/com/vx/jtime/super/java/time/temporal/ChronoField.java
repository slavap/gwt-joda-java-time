package java.time.temporal;

import jsinterop.annotations.JsProperty;

public enum ChronoField implements TemporalField {

    NANO_OF_SECOND(java.timejs.ChronoField.NANO_OF_SECOND),
    NANO_OF_DAY(java.timejs.ChronoField.NANO_OF_DAY),
    MICRO_OF_SECOND(java.timejs.ChronoField.MICRO_OF_SECOND),
    MICRO_OF_DAY(java.timejs.ChronoField.MICRO_OF_DAY),
    MILLI_OF_SECOND(java.timejs.ChronoField.MILLI_OF_SECOND),
    MILLI_OF_DAY(java.timejs.ChronoField.MILLI_OF_DAY),
    SECOND_OF_MINUTE(java.timejs.ChronoField.SECOND_OF_MINUTE),
    SECOND_OF_DAY(java.timejs.ChronoField.SECOND_OF_DAY),
    MINUTE_OF_HOUR(java.timejs.ChronoField.MINUTE_OF_HOUR),
    MINUTE_OF_DAY(java.timejs.ChronoField.MINUTE_OF_DAY),
    HOUR_OF_AMPM(java.timejs.ChronoField.HOUR_OF_AMPM),
    CLOCK_HOUR_OF_AMPM(java.timejs.ChronoField.CLOCK_HOUR_OF_AMPM),
    HOUR_OF_DAY(java.timejs.ChronoField.HOUR_OF_DAY),
    CLOCK_HOUR_OF_DAY(java.timejs.ChronoField.CLOCK_HOUR_OF_DAY),
    AMPM_OF_DAY(java.timejs.ChronoField.AMPM_OF_DAY),
    DAY_OF_WEEK(java.timejs.ChronoField.DAY_OF_WEEK),
    ALIGNED_DAY_OF_WEEK_IN_MONTH(java.timejs.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH),
    ALIGNED_DAY_OF_WEEK_IN_YEAR(java.timejs.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR),
    DAY_OF_MONTH(java.timejs.ChronoField.DAY_OF_MONTH),
    DAY_OF_YEAR(java.timejs.ChronoField.DAY_OF_YEAR),
    EPOCH_DAY(java.timejs.ChronoField.EPOCH_DAY),
    ALIGNED_WEEK_OF_MONTH(java.timejs.ChronoField.ALIGNED_WEEK_OF_MONTH),
    ALIGNED_WEEK_OF_YEAR(java.timejs.ChronoField.ALIGNED_WEEK_OF_YEAR),
    MONTH_OF_YEAR(java.timejs.ChronoField.MONTH_OF_YEAR),
    PROLEPTIC_MONTH(java.timejs.ChronoField.PROLEPTIC_MONTH),
    YEAR_OF_ERA(java.timejs.ChronoField.YEAR_OF_ERA),
    YEAR(java.timejs.ChronoField.YEAR),
    ERA(java.timejs.ChronoField.ERA),
    INSTANT_SECONDS(java.timejs.ChronoField.INSTANT_SECONDS),
    OFFSET_SECONDS(java.timejs.ChronoField.OFFSET_SECONDS);

    public final java.timejs.ChronoField v;

    private ChronoField(java.timejs.ChronoField value) {
        this.v = value;
    }
}
