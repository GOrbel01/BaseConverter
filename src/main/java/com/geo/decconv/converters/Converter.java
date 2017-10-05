package com.geo.decconv.converters;

import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 03/10/2017.
 */
public interface Converter {

    /**
     * Converts a Value from one Value type
     * to another Value type.
     * @param otherValue Value being converted
     * @return Converted Value
     */
    Value convert(Value otherValue);
}
