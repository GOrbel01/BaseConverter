package com.geo.decconv.event.validation.validator;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.ValidationResult;

/**
 * Created by Tidus on 11/10/2017.
 */
public class HexValidator extends AbstractValidator implements Validator {
    public HexValidator() {
        super(ActionType.HEXADECIMAL);
    }

    @Override
    public ValidationResult validateData(String text) {
        if (text.isEmpty()) {
            return new ValidationResult(false, getActionType(), ErrorMessages.NO_TEXT_MSG);
        }
        for (Character ch : text.toCharArray()) {
            if (!isHexChar(ch) && !Character.isDigit(ch)) {
                return new ValidationResult(false, getActionType(), ErrorMessages.HEX_VAL_MSG);
            }
        }
        return new ValidationResult(true, getActionType());
    }

    private boolean isHexChar(Character ch) {
        Character fixedCase = Character.toUpperCase(ch);
        return fixedCase == 'A' || fixedCase == 'B' || fixedCase == 'C' ||
                fixedCase == 'D' || fixedCase == 'E' || fixedCase == 'F';
    }
}
