package com.aris.async;

/**
 * Created by aris on 2019/7/30.
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3);

    private int value;
    EventType(int value) { this.value = value; }
    public int getValue() { return value; }
}
