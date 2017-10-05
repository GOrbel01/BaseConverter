package com.geo.decconv.converters.binary;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.converters.decimal.DecimalToHexConverter;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class BinaryToHexConverter implements Converter {
    public BinaryToHexConverter() {

    }

    public Value convert(Value otherValue) {
        return binaryToHex(otherValue);
    }

    private Value binaryToHex(Value otherValue) {
        BinaryToDecimalConverter binaryToDecimalConverter = new BinaryToDecimalConverter();
        DecimalToHexConverter decimalToHexConverter = new DecimalToHexConverter();

        return decimalToHexConverter.convert(binaryToDecimalConverter.convert(otherValue));
    }
}
