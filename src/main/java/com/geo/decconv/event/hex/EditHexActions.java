package com.geo.decconv.event.hex;

import com.geo.decconv.event.Actions;

/**
 * Created by Tidus on 06/10/2017.
 */
public interface EditHexActions extends Actions {
    /**
     * Event response for changing value of hex field
     */
    void handleUpdateHexValue();
}
