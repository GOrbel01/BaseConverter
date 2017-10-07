package com.geo.decconv.event.validation;

/**
 * Created by Tidus on 06/10/2017.
 */
public interface ConversionValidator {
    boolean isValid();
    boolean allEmptyTextArea();
    boolean hasTypeSet();
    boolean validDataForConversionType();
}
