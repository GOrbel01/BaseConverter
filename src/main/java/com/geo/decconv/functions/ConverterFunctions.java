package com.geo.decconv.functions;

import com.geo.decconv.values.Value;

/**
 * Created by Tidus on 04/10/2017.
 */
public class ConverterFunctions {
    public static StringBuilder trimLeadingZeros(StringBuilder stringBuilder) {
        boolean foundOne = false;
        while (!foundOne) {
            if (stringBuilder.charAt(0) == '0') {
                stringBuilder.deleteCharAt(0);
            } else {
                foundOne = true;
            }
        }
        return stringBuilder;
    }
}
