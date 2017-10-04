package com.geo.decconv.converters;

import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 03/10/2017.
 */
public interface Converter {
    Value convert(Value otherValue);
}
