package com.geo.decconv.event.decimal;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.event.AbstractActions;

/**
 * Created by Tidus on 06/10/2017.
 */
public class EditDecimalActionsImpl extends AbstractActions implements EditDecimalActions {
    public EditDecimalActionsImpl(DecimalConverterController decimalConverterController) {
        super(decimalConverterController);
    }

    public ActionType getType() {
        return ActionType.DECIMAL;
    }

}
