package com.geo.decconv.event.validation;

import com.geo.decconv.main.DecimalConverterController;

/**
 * Created by Tidus on 06/10/2017.
 */
public class ConversionValidatorImpl implements ConversionValidator {
    private DecimalConverterController controller;

    public ConversionValidatorImpl(DecimalConverterController controller) {
        this.controller = controller;
    }

    public boolean isValid() {
        return allEmptyTextArea() && hasTypeSet() && validDataForConversionType();
    }

    public boolean allEmptyTextArea() {
        return !controller.getBinEditText().getText().isEmpty();
    }

    public boolean hasTypeSet() {
        return false;
    }

    public boolean validDataForConversionType() {
        return false;
    }
}
