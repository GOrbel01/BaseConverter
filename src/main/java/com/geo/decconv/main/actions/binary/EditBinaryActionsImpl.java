package com.geo.decconv.main.actions.binary;

import com.geo.decconv.main.DecimalConverterController;
import javafx.scene.control.TextField;

/**
 * Created by Tidus on 03/10/2017.
 */
public class EditBinaryActionsImpl implements EditBinaryActions {
    private DecimalConverterController controller;

    public EditBinaryActionsImpl(DecimalConverterController controller) {
        this.controller = controller;
    }

    public void handleUpdateBinaryValue() {
        controller.getMessageText().setText("");
        if (!controller.getBinEditText().getText().equals("")) {
            String text = controller.getBinEditText().getText();
            String lastVal = text.substring(text.length() - 1, text.length());
            if (!lastVal.equals("0") && !lastVal.equals("1") && text.length() != 0) {
                controller.getMessageText().setText("You Can Only Enter 0 or 1 for a Binary Number!");
                if (text.length() > 1) {
                    controller.getBinEditText().setText(text.substring(0, text.length() - 1));
                    controller.getBinEditText().end();
                }
            }
        }
    }
}
