package org.example.expression.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by fREDY on 15/03/2016.
 */
public class TargetingExpression {
    private DayPart dayPart;

    public TargetingExpression() {
    }

    public TargetingExpression(DayPart dayPart) {
        this.dayPart = dayPart;
    }

    public DayPart getDayPart() {
        return dayPart;
    }

    public void setDayPart(DayPart dayPart) {
        this.dayPart = dayPart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TargetingExpression that = (TargetingExpression) o;

        return new EqualsBuilder()
                .append(dayPart, that.dayPart)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(dayPart)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "TargetingExpression{" +
                "dayPart=" + dayPart +
                '}';
    }
}
