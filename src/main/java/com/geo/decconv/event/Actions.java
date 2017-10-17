package com.geo.decconv.event;

/**
 * Created by Tidus on 05/10/2017.
 */
public interface Actions {
    /**
     * All Actions have an Action Type
     * @return ActionType of the action executed
     */
    ActionType getType();

    /**
     * Response for a click event on TextFields and ConvertButton
     * @return True if operation successful else false
     */
    boolean handleClick();

    /**
     * Handle Dragged Mouse into View
     */
    void handleMouseDrag();
}
