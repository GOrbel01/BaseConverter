package com.geo.decconv.main;

import com.geo.decconv.converters.ConversionType;
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
import com.geo.decconv.model.ConvertOperationList;
import com.geo.decconv.ui.BinaryTextField;
import com.geo.decconv.ui.DecimalTextField;
import com.geo.decconv.ui.HexTextField;
import com.sun.javafx.collections.ObservableListWrapper;
import com.sun.org.apache.xpath.internal.operations.String;
import javafx.beans.value.ObservableListValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.List;

public class DecimalConverterController {

    @FXML
    private TableView<ConvertOperation> convHistTable;

    @FXML
    private TableColumn<ConvertOperation, String> histTableCol;

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

    private static final int MAX_STORED = 10;

    public DecimalConverterController() {
        editBinaryActions = new EditBinaryActionsImpl(this);
        editDecimalActions = new EditDecimalActionsImpl(this);
        editHexActions = new EditHexActionsImpl(this);
        buttonActions = new ButtonActionsImpl(this);
        convHistTable = new TableView<>();
        histTableCol = new TableColumn<ConvertOperation,String>();
    }

    //Implemented in this way due to constraints placed by JavaFX. Controller must be in same package as fxml.
    //fxml must have public methods that point to each
    /*
        Binary Actions
    */

    public void handleBinaryMouseClick() {
        editBinaryActions.handleClick();
    }

    public void handleBinaryMouseDrag() {
        editBinaryActions.handleMouseDrag();
    }

    /*
        End Binary Actions
     */


    /*
        Decimal Actions
     */


    public void handleDecimalMouseClick() {
        editDecimalActions.handleClick();
    }

    public void handleDecimalMouseDrag() {
        editDecimalActions.handleMouseDrag();
    }

    /*
        End Decimal Actions
     */

    /*
        Hex Actions
     */

    public void handleHexMouseClick() {
        editHexActions.handleClick();
    }

    public void handleHexMouseDrag() {
        editHexActions.handleMouseDrag();
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

    public void updateList(ConvertOperation operation) {
        convHistTable.getItems().add(0, operation);
        if (convHistTable.getItems().size() > MAX_STORED) {
            convHistTable.getItems().add(0, operation);
            convHistTable.getItems().remove(convHistTable.getItems().size() - 1);
            convHistTable.getItems().remove(convHistTable.getItems().size() - 1);
        }
        convHistTable.getColumns().setAll(histTableCol);
    }

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

    public void setupApp() {
        getMessageText().setText("Base Conversion Application written in Java by FinalSquall.\n" +
                "This application converts seamlessly between Base2, Base10 and Base16.");

        histTableCol.setCellValueFactory(
                new PropertyValueFactory<ConvertOperation, String>("histColumnText"));

        convHistTable.getSelectionModel().selectedItemProperty().addListener((observable, oldVal, newVal) -> {
            if (newVal != null) {
                ConvertOperation convertOperation = convHistTable.getSelectionModel().getSelectedItem();
                binEditText.setText(convertOperation.getBinaryString());
                hexEditText.setText(convertOperation.getHexString());
                decEditText.setText("" + convertOperation.getDecimalValue());
                messageText.setText(convertOperation.getHistColumnText() + " Loaded.");
            }
        });
    }

    public boolean allFieldsEmpty() {
        return decEditText.getText().isEmpty() && binEditText.getText().isEmpty() && hexEditText.getText().isEmpty();
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
