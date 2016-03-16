package org.example.expression.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.example.expression.model.enums.DayOfWeek;

import java.util.Arrays;

/**
 * Created by fREDY on 15/03/2016.
 */
public class DayPart {
    private DayOfWeek[] days;


    private Integer[] hours;

    public DayPart() {
    }

    public DayPart(DayOfWeek[] days, Integer[] hours) {
        this.days = days;
        this.hours = hours;
    }

    public Integer[] getHours() {
        return hours;
    }

    public void setHours(Integer[] hours) {
        this.hours = hours;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DayPart dayPart = (DayPart) o;

        return new EqualsBuilder()
                .append(days, dayPart.days)
                .append(hours, dayPart.hours)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(days)
                .append(hours)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "DayPart{" +
                "days=" + Arrays.toString(days) +
                ", hours=" + Arrays.toString(hours) +
                '}';
    }
}
