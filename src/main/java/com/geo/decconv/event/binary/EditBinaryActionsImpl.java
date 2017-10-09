package com.geo.decconv.event.binary;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.event.AbstractActions;

/**
 * Created by Tidus on 03/10/2017.
 */
public class EditBinaryActionsImpl extends AbstractActions implements EditBinaryActions {
    public EditBinaryActionsImpl(DecimalConverterController controller) {
        super(controller);
    }

    public void handleUpdateBinaryValue() {
        getController().getMessageText().setText("");
    }

    public ActionType getType() {
        return ActionType.BINARY;
    }

}
