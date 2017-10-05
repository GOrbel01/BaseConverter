package com.geo.decconv.converters.hex;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.converters.binary.BinaryToDecimalConverter;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexToDecimalConverter implements Converter {

    public HexToDecimalConverter() {

    }

    public Value convert(Value otherValue) {
        return hexToDecimal(otherValue);
    }

    private Value hexToDecimal(Value otherValue) {
        HexToBinaryConverter hexToBinaryConverter = new HexToBinaryConverter();
        BinaryToDecimalConverter binaryToDecimalConverter = new BinaryToDecimalConverter();
        Value result = binaryToDecimalConverter.convert(hexToBinaryConverter.convert(otherValue));
        return result;
    }
}
