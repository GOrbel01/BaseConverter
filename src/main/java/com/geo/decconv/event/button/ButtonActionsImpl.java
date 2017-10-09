package com.geo.decconv.event.button;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.event.AbstractActions;
import com.geo.decconv.model.ConvertOperation;

import java.util.Optional;

/**
 * Created by Tidus on 06/10/2017.
 */
public class ButtonActionsImpl extends AbstractActions implements ButtonActions {

    private ConvertEventHandler convertEventHandler;

    public ButtonActionsImpl(DecimalConverterController decimalConverterController) {
        super(decimalConverterController);
        convertEventHandler = new ConvertEventHandlerImpl();
    }

    public ActionType getType() {
        return ActionType.BUTTON;
    }

    @Override
    public void handleClick() {
        Optional<ConvertOperation> result = convertEventHandler.handleConversion(getController());
        if (result.isPresent()) {
            assignResults(result.get());
        } else {
            //TODO Handle Error.
        }
    }

    private void assignResults(ConvertOperation operation) {
        switch (operation.getConversionType()) {
            case BINARY:
                getController().getDecEditText().setText("" + operation.getDecimalValue());
                getController().getHexEditText().setText(operation.getHexString());
                break;
            case DECIMAL:
                getController().getBinEditText().setText(operation.getBinaryString());
                getController().getHexEditText().setText(operation.getHexString());
                break;
            case HEX:
                getController().getBinEditText().setText(operation.getBinaryString());
                getController().getDecEditText().setText(operation.getDecimalValue() + "");
                break;
        }
    }
}
