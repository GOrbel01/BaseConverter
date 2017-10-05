package com.geo.decconv.converters.decimal;

import com.geo.decconv.converters.Converter;
import com.geo.decconv.converters.hex.HexValueHelper;
import com.geo.decconv.values.HexValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class DecimalToHexConverter implements Converter {

    private HexValueHelper hexValueHelper;

    public DecimalToHexConverter() {
        hexValueHelper = new HexValueHelper();
    }

    public Value convert(Value otherValue) {
        return decimalToHex(otherValue);
    }

    private Value decimalToHex(Value otherVal) {
        Long decVal = 0L;
        if (otherVal.getValue() instanceof Long) {
            decVal = (Long) otherVal.getValue();
        } else {
            throw new IllegalArgumentException("Decimal Value must be of type Long.");
        }

        StringBuilder sb = new StringBuilder();
        if (decVal == 0) {
            return new HexValue("0");
        }
        while (decVal >= 1) {
            long rem = decVal % 16;
            sb.append(hexValueHelper.getLongAsHex(rem));
            decVal = decVal / 16;
        }

        sb.reverse();
        return new HexValue(sb.toString());
    }
}
