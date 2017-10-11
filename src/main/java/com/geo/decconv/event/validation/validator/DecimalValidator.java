package com.geo.decconv.event.validation.validator;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.ValidationResult;

/**
 * Created by Tidus on 11/10/2017.
 */
public class DecimalValidator extends AbstractValidator implements Validator {
    public DecimalValidator() {
        super(ActionType.DECIMAL);
    }

    @Override
    public ValidationResult validateData(String text) {
        for (Character ch : text.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return new ValidationResult(false, getActionType(), ErrorMessages.DEC_VAL_MSG);
            }
        }
        return new ValidationResult(true, getActionType());
    }
}
