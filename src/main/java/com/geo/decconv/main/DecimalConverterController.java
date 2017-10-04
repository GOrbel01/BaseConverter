package com.geo.decconv.main;

import com.geo.decconv.main.actions.binary.EditBinaryActions;
import com.geo.decconv.main.actions.binary.EditBinaryActionsImpl;
import com.geo.decconv.model.ConvertOperation;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DecimalConverterController {

    @FXML
    private TableView<ConvertOperation> convHistTable;

    @FXML
    private TextField binEditText;

    @FXML
    private TextField hexEditText;

    @FXML
    private TextField decEditText;

    @FXML
    private TextArea messageText;

    private EditBinaryActions editBinaryActions;

    private DecimalConverterMain application;

    public DecimalConverterController() {
        editBinaryActions = new EditBinaryActionsImpl(this);
    }

    public void handleUpdateBinaryValue() {
        editBinaryActions.handleUpdateBinaryValue();
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

    public DecimalConverterMain getApplication() {
        return application;
    }

    public TextArea getMessageText() {
        return messageText;
    }

}
