package com.geo.decconv.event.validation;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.validation.validator.BinaryValidator;
import com.geo.decconv.event.validation.validator.DecimalValidator;
import com.geo.decconv.event.validation.validator.HexValidator;
import com.geo.decconv.event.validation.validator.Validator;
import com.geo.decconv.main.DecimalConverterController;

import java.util.Optional;

/**
 * Created by Tidus on 09/10/2017.
 */
public class ValidationManagerImpl implements ValidationManager {
    private DecimalConverterController decimalConverterController;

    public ValidationManagerImpl(DecimalConverterController controller) {
        decimalConverterController = controller;
    }

    @Override
    public Optional<ValidationResult> runValidation() {
        switch (decimalConverterController.getLastAction()) {
            case BINARY:
                Validator binaryValidator = new BinaryValidator();
                return Optional.of(binaryValidator.validateData(decimalConverterController.getBinEditText().getText()));
            case HEXADECIMAL:
                Validator hexValidator = new HexValidator();
                return Optional.of(hexValidator.validateData(decimalConverterController.getHexEditText().getText()));
            case DECIMAL:
                Validator decimalValidator = new DecimalValidator();
                return Optional.of(decimalValidator.validateData(decimalConverterController.getDecEditText().getText()));
            default:
                return Optional.empty();
        }
    }
}
