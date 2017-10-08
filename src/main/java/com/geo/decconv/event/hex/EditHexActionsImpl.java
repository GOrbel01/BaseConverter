package com.geo.decconv.event.hex;

import com.geo.decconv.event.AbstractActions;
import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.Actions;
import com.geo.decconv.main.DecimalConverterController;

/**
 * Created by Tidus on 06/10/2017.
 */
public class EditHexActionsImpl extends AbstractActions implements EditHexActions {
    public EditHexActionsImpl(DecimalConverterController decimalConverterController) {
        super(decimalConverterController);
    }

    public ActionType getType() {
        return ActionType.HEXADECIMAL;
    }

    @Override
    public void handleUpdateHexValue() {

    }

    @Override
    public void validateData() {

    }
}
