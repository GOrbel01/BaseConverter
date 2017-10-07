package com.geo.decconv.converters.binary;

import com.geo.decconv.converters.AbstractConversionManager;
import com.geo.decconv.converters.ConversionManager;
import com.geo.decconv.converters.ConversionType;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;
import com.geo.decconv.values.BinaryValue;
import com.geo.decconv.values.HexValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 07/10/2017.
 */
public class BinaryConversionManager extends AbstractConversionManager implements ConversionManager {

    public BinaryConversionManager() {
        super(ConversionType.BINARY);
    }

    @Override
    public ConvertOperation runConversion(String actionString) {
        Value binaryValue = new BinaryValue(actionString);

        Long decimalValue = (Long) new BinaryToDecimalConverter().convert(binaryValue).getValue();
        String hexString = new BinaryToHexConverter().convert(binaryValue).getValue().toString();

        return new ConvertOperation(actionString, hexString, decimalValue, getConversionType());
    }
}
