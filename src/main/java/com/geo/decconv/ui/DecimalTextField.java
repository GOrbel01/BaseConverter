package com.geo.decconv.ui;

import com.geo.decconv.converters.ConversionType;
import javafx.scene.control.TextField;

/**
 * Created by Tidus on 07/10/2017.
 */
public class DecimalTextField extends TextField implements BaseConverterTextField  {
    private ConversionType conversionType;

    public DecimalTextField() {
        super();
        conversionType = ConversionType.DECIMAL;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }
}
