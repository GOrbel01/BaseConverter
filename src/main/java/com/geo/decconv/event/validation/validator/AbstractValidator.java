package com.geo.decconv.event.validation.validator;

import com.geo.decconv.event.ActionType;

/**
 * Created by Tidus on 11/10/2017.
 */
public abstract class AbstractValidator implements Validator {
    private ActionType actionType;

    public AbstractValidator(ActionType actionType) {
        this.actionType = actionType;
    }

    public ActionType getActionType() {
        return actionType;
    }
}
