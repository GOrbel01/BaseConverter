package com.geo.decconv.ui;

import com.geo.decconv.converters.ConversionType;
import javafx.scene.control.TextField;

/**
 * Created by Tidus on 07/10/2017.
 */
public class HexTextField extends TextField implements BaseConverterTextField  {
    private ConversionType conversionType;

    public HexTextField() {
        super();
        conversionType = ConversionType.HEX;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }
}
