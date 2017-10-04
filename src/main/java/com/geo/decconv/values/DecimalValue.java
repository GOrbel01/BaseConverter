package com.geo.decconv.values;

/**
 * Created by Tidus on 03/10/2017.
 */
public class DecimalValue implements Value {
    private Long value;

    public DecimalValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
