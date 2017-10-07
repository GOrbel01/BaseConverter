package com.geo.decconv.converters.decimal;

import com.geo.decconv.converters.AbstractConversionManager;
import com.geo.decconv.converters.ConversionManager;
import com.geo.decconv.converters.ConversionType;
import com.geo.decconv.converters.binary.BinaryToDecimalConverter;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 07/10/2017.
 */
public class DecimalConversionManager extends AbstractConversionManager implements ConversionManager {

    public DecimalConversionManager() {
        super(ConversionType.DECIMAL);
    }

    @Override
    public ConvertOperation runConversion(String actionValue) {
        Long decimalLong;
        try {
            decimalLong = Long.parseLong(actionValue);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Action Value for DecimalConversionManager must be a Decimal String.");
        }

        Value decimalValue = new DecimalValue(decimalLong);

        String binString = new DecimalToBinaryConverter().convert(decimalValue).getValue().toString();
        String hexString = new DecimalToHexConverter().convert(decimalValue).getValue().toString();

        return new ConvertOperation(binString, hexString, decimalLong, getConversionType());
    }
}
