package com.geo.decconv.converters.hex;

import com.geo.decconv.converters.AbstractConversionManager;
import com.geo.decconv.converters.ConversionManager;
import com.geo.decconv.converters.ConversionType;
import com.geo.decconv.converters.binary.BinaryToDecimalConverter;
import com.geo.decconv.converters.binary.BinaryToHexConverter;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;
import com.geo.decconv.values.BinaryValue;
import com.geo.decconv.values.HexValue;
import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 07/10/2017.
 */
public class HexConversionManager extends AbstractConversionManager implements ConversionManager {

    public HexConversionManager() {
        super(ConversionType.HEX);
    }

    @Override
    public ConvertOperation runConversion(String actionValue) {
        Value hexValue = new HexValue(actionValue);

        Long decimalValue = (Long) new HexToDecimalConverter().convert(hexValue).getValue();
        String binaryValue = new HexToBinaryConverter().convert(hexValue).getValue().toString();

        return new ConvertOperation(binaryValue, actionValue, decimalValue, getConversionType());
    }
}
