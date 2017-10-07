package com.geo.decconv.event.button;

import com.geo.decconv.converters.ConversionManager;
import com.geo.decconv.converters.binary.BinaryConversionManager;
import com.geo.decconv.converters.binary.BinaryToDecimalConverter;
import com.geo.decconv.converters.binary.BinaryToHexConverter;
import com.geo.decconv.converters.decimal.DecimalConversionManager;
import com.geo.decconv.converters.hex.HexConversionManager;
import com.geo.decconv.event.ActionType;
import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;
import com.geo.decconv.values.BinaryValue;
import javafx.scene.control.TextField;

import java.util.Optional;

/**
 * Created by Tidus on 07/10/2017.
 */
public class ConvertEventHandlerImpl implements ConvertEventHandler {
    public Optional<ConvertOperation> handleConversion(DecimalConverterController controller) {
        ActionType lastActionType = controller.getLastAction();
        ConversionManager conversionManager;

        Optional<ConvertOperation> result = Optional.empty();

        System.out.println();

        switch(lastActionType) {
            case BINARY:
                conversionManager = new BinaryConversionManager();
                result = Optional.of(conversionManager.runConversion(controller.getBinEditText().getText()));
                break;
            case HEXADECIMAL:
                conversionManager = new HexConversionManager();
                result = Optional.of(conversionManager.runConversion(controller.getHexEditText().getText()));
                break;
            case DECIMAL:
                conversionManager = new DecimalConversionManager();
                result = Optional.of(conversionManager.runConversion(controller.getDecEditText().getText()));
                break;
        }
        return result;
    }
}
