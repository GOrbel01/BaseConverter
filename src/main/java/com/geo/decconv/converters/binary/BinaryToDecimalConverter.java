package com.geo.decconv.converters.binary;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 03/10/2017.
 */
public class BinaryToDecimalConverter implements Converter {
    public BinaryToDecimalConverter() {

    }

    public Value convert(Value otherValue) {
        return convertToDecimal(otherValue);
    }

    private Value convertToDecimal(Value otherValue) {
        String binaryString = otherValue.toString();
        long counter = 1;
        long result = 0;
        for (int i = binaryString.length()-1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                result += counter;
            }
            counter = counter * 2;
        }
        return new DecimalValue(result);
    }
}
