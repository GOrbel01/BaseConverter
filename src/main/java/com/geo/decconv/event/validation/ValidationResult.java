package com.geo.decconv.event.validation;

import com.geo.decconv.event.ActionType;

/**
 * Created by Tidus on 09/10/2017.
 */
public class ValidationResult {
    private boolean isValid;
    private ActionType typeValidated;
    private String message;

    public ValidationResult(boolean isValid, ActionType typeValidated, String message) {
        this.isValid = isValid;
        this.typeValidated = typeValidated;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public ActionType getTypeValidated() {
        return typeValidated;
    }

    public String getMessage() {
        return message;
    }
}
