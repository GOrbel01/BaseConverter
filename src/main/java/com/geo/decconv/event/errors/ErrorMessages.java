package com.geo.decconv.event.errors;

/**
 * Created by Tidus on 09/10/2017.
 */
public interface ErrorMessages {
    String BIN_VAL_MSG = "Binary String can only contain 0 or 1 values.";
    String DEC_VAL_MSG = "Decimal value can only contain digits from 0-9.";
    String HEX_VAL_MSG = "Hex value can only contain digits 0-9 or A-F characters.";
    String NO_TEXT_MSG = "No text present for the selected conversion field.";
}
