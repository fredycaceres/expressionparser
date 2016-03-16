package org.example.expression.model.enums;

/**
 * Created by fREDY on 15/03/2016.
 */
public enum ExpressionToken {
    DayOfWeek("[Day of Week]"), ViewHour("[View Hour]");

    private String token;
    ExpressionToken(final String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return this.getToken();
    }
}
