package com.geo.decconv.converters.hex;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.converters.decimal.DecimalToBinaryConverter;
import com.geo.decconv.converters.decimal.FourBitDecimalToBinaryConverter;
import com.geo.decconv.values.BinaryValue;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexToBinaryConverter implements Converter {

    private FourBitDecimalToBinaryConverter decimalToBinaryConverter;
    private HexValueHelper hexValueHelper;

    public HexToBinaryConverter() {
        decimalToBinaryConverter = new FourBitDecimalToBinaryConverter();
        hexValueHelper = new HexValueHelper();
    }

    public Value convert(Value otherValue) {
        return hexToBinary(otherValue);
    }

    private Value hexToBinary(Value otherValue) {
        String hexString = otherValue.toString();
        StringBuilder binaryResult = new StringBuilder();
        if (hexString != null && hexString.length() > 0) {
            for (int i = 0; i < hexString.length(); i++) {
                    binaryResult.append(decimalToBinaryConverter.convert(new DecimalValue(hexValueHelper.getHexAsDecimal(hexString.substring(i, i + 1)))));
            }
        }
        return new BinaryValue(binaryResult.toString());
    }
}
