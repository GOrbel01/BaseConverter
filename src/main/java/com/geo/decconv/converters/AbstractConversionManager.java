package com.geo.decconv.converters;

/**
 * Created by Tidus on 07/10/2017.
 */
public class AbstractConversionManager {
    private ConversionType conversionType;

    public AbstractConversionManager(ConversionType type) {
        this.conversionType = type;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }
}
