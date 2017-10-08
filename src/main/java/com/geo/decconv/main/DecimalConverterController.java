package com.geo.decconv.main;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.binary.EditBinaryActions;
import com.geo.decconv.event.binary.EditBinaryActionsImpl;
import com.geo.decconv.event.button.ButtonActions;
import com.geo.decconv.event.button.ButtonActionsImpl;
import com.geo.decconv.event.decimal.EditDecimalActions;
import com.geo.decconv.event.decimal.EditDecimalActionsImpl;
import com.geo.decconv.event.hex.EditHexActions;
import com.geo.decconv.event.hex.EditHexActionsImpl;
import com.geo.decconv.model.ConvertOperation;
import com.geo.decconv.ui.BinaryTextField;
import com.geo.decconv.ui.DecimalTextField;
import com.geo.decconv.ui.HexTextField;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class DecimalConverterController {

    @FXML
    private TableView<ConvertOperation> convHistTable;

    @FXML
    private BinaryTextField binEditText;

    @FXML
    private HexTextField hexEditText;

    @FXML
    private DecimalTextField decEditText;

    @FXML
    private TextArea messageText;

    private ActionType lastAction;

    private EditBinaryActions editBinaryActions;
    private EditDecimalActions editDecimalActions;
    private EditHexActions editHexActions;
    private ButtonActions buttonActions;

    public DecimalConverterController() {
        editBinaryActions = new EditBinaryActionsImpl(this);
        editDecimalActions = new EditDecimalActionsImpl(this);
        editHexActions = new EditHexActionsImpl(this);
        buttonActions = new ButtonActionsImpl(this);

    }

    //Implemented in this way due to constraints placed by JavaFX. Controller must be in same package as fxml.
    //fxml must have public methods that point to each
    /*
        Binary Actions
    */

    public void handleUpdateBinaryValue() {
        editBinaryActions.handleUpdateBinaryValue();
    }

    public void handleBinaryMouseClick() {
        editBinaryActions.handleClick();
    }

    /*
        End Binary Actions
     */


    /*
        Decimal Actions
     */

    public void handleUpdateDecimalValue() {

    }

    public void handleDecimalMouseClick() {
        editDecimalActions.handleClick();
    }

    /*
        End Decimal Actions
     */

    /*
        Hex Actions
     */

    public void handleUpdateHexValue() {

    }

    public void handleHexMouseClick() {
        editHexActions.handleClick();
    }

    /*
        End Hex Actions
     */

    /*
        Button Actions
     */

    public void handleButtonClick() {
        buttonActions.handleClick();
    }

    /*
        End Button Actions
     */


    public void testResponse() {
        System.out.println("RESPONSE!");
    }

    int i = 0;

    public void setupHandlers(Scene scene) {
        binEditText.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.TAB) {
                editBinaryActions.handleClick();
            }
        });

        decEditText.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.TAB) {
                editDecimalActions.handleClick();
            }
        });

        hexEditText.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.TAB) {
                editHexActions.handleClick();
            }
        });
    }

    public TextField getBinEditText() {
        return binEditText;
    }

    public TextField getHexEditText() {
        return hexEditText;
    }

    public TextField getDecEditText() {
        return decEditText;
    }

    public TextArea getMessageText() {
        return messageText;
    }

    public ActionType getLastAction() {
        return lastAction;
    }

    public void setLastAction(ActionType lastAction) {
        this.lastAction = lastAction;
    }
}
