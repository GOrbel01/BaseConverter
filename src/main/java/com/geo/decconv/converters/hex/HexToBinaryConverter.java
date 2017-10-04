package com.geo.decconv.converters.hex;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.converters.decimal.DecimalToBinaryConverter;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexToBinaryConverter implements Converter {

    private DecimalToBinaryConverter decimalToBinaryConverter;

    public HexToBinaryConverter() {
        decimalToBinaryConverter = new DecimalToBinaryConverter();
    }

    public Value convert(Value otherValue) {
        return hexToBinary(otherValue);
    }

    private Value hexToBinary(Value otherValue) {
        String hexString = otherValue.toString();
        StringBuilder binaryResult = new StringBuilder();
        if (hexString != null && hexString.length() > 0) {
            for (int i = 0; i < hexString.length(); i++) {

            }
        }
        return null;
    }
}
