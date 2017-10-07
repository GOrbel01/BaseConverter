package com.geo.decconv.converters;

import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;

/**
 * Created by Tidus on 07/10/2017.
 */
public interface ConversionManager {
    ConvertOperation runConversion(String actionValue);
}
