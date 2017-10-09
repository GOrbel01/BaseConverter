package com.geo.decconv.event.validation.validator;

import com.geo.decconv.event.validation.ValidationResult;

/**
 * Created by Tidus on 09/10/2017.
 */
public interface Validator {
    ValidationResult validateData(String text);
}
