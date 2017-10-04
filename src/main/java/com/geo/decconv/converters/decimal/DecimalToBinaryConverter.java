package com.geo.decconv.converters.decimal;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.values.BinaryValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class DecimalToBinaryConverter implements Converter {

    public Value convert(Value otherValue) {
        return convertToBinary(otherValue);
    }

    public Value convertToBinary(Value otherValue) {
        Long decVal = 0L;
        StringBuilder sb = new StringBuilder();
        if (otherValue.getValue() instanceof Long) {
            decVal = (Long) otherValue.getValue();
        } else {
            throw new IllegalArgumentException("Decimal Value must be of type Long.");
        }
        while (decVal >= 1) {
            sb.append(decVal % 2);
            decVal = decVal / 2;
        }
        return new BinaryValue(sb.reverse().toString());
    }
}
