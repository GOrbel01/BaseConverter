package com.geo.decconv.converters.decimal;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class DecimalToHexConverter implements Converter {

    public DecimalToHexConverter() {

    }

    public Value convert(Value otherValue) {
        return null;
    }

    //TODO
    private Value decimalToHex(Value otherVal) {
        long decVal = 0L;
        if (otherVal.getValue() instanceof Long) {
            decVal = (Long) otherVal.getValue();
        } else {
            throw new IllegalArgumentException("Decimal Value must be of type Long.");
        }
        return null;
    }
}
