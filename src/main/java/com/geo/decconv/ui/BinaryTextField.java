package com.geo.decconv.ui;

import com.geo.decconv.converters.ConversionType;
import javafx.scene.control.TextField;

/**
 * Created by Tidus on 07/10/2017.
 */
public class BinaryTextField extends TextField implements BaseConverterTextField {
    private ConversionType conversionType;

    public BinaryTextField() {
        super();
        conversionType = ConversionType.BINARY;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }
}
