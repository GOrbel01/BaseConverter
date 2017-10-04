package com.geo.decconv.values;

/**
 * Created by Tidus on 03/10/2017.
 */
public class HexValue implements Value {
    private String value;

    public HexValue(String value) {
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
