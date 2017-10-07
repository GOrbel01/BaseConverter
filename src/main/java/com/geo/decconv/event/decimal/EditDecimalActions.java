package com.geo.decconv.event.decimal;

import com.geo.decconv.event.Actions;

/**
 * Created by Tidus on 06/10/2017.
 */
public interface EditDecimalActions extends Actions {
    /**
     * Event response for changing value of decimal field
     */
    void handleUpdateDecimalValue();
}
