package com.geo.decconv.event.validation.validator;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.ValidationResult;
import com.geo.decconv.event.validation.validator.Validator;

import java.util.function.Predicate;

/**
 * Created by Tidus on 09/10/2017.
 */
public class BinaryValidator implements Validator {
    @Override
    public ValidationResult validateData(String text) {
        boolean result = true;
        String message = "";
        Predicate<Character> cond = ch -> ch == '0' || ch == '1';
        for (Character ch : text.toCharArray()) {
            if (!cond.test(ch)) {
                result = false;
                message = ErrorMessages.BIN_VAL_MSG;
            }
        }
        return new ValidationResult(result, ActionType.BINARY, message);
    }
}
