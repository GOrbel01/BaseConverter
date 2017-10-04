package com.geo.decconv.values;

/**
 * Created by Tidus on 03/10/2017.
 */
public class BinaryValue implements Value {
    private String value;

    public BinaryValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
