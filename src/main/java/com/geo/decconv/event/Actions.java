package com.geo.decconv.event;

/**
 * Created by Tidus on 05/10/2017.
 */
public interface Actions {
    /**
     * All Actions have an Action Type
     * @return
     */
    ActionType getType();

    void handleClick();
}
