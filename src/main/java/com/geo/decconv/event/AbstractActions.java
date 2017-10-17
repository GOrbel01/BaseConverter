package com.geo.decconv.event;

import com.geo.decconv.main.DecimalConverterController;

/**
 * Created by Tidus on 06/10/2017.
 */
public abstract class AbstractActions implements Actions {
    private DecimalConverterController controller;

    public AbstractActions(DecimalConverterController controller) {
        this.controller = controller;
    }

    protected DecimalConverterController getController() {
        return controller;
    }

    @Override
    public boolean handleClick() {
        getController().setLastAction(getType());
        getController().getMessageText().setText(getController().getLastAction().name());
        return true;
    }

    @Override
    public void handleMouseDrag() {
        handleClick();
    }
}
