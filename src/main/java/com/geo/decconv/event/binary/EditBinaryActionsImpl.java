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
        if (!getController().getBinEditText().getText().equals("")) {
            String text = getController().getBinEditText().getText();
            String lastVal = text.substring(text.length() - 1, text.length());
            if (!lastVal.equals("0") && !lastVal.equals("1") && text.length() != 0) {
                getController().getMessageText().setText("You Can Only Enter 0 or 1 for a Binary Number!");
                if (text.length() > 1) {
                    getController().getBinEditText().setText(text.substring(0, text.length() - 1));
                    getController().getBinEditText().end();
                }
            }
        }
    }

    public ActionType getType() {
        return ActionType.BINARY;
    }
}
