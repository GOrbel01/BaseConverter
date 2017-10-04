package com.geo.decconv.converters.hex;

import java.util.HashMap;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexValueHelper {
    private static final HashMap<String, Long> hexValues;

    static {
        hexValues = new HashMap<String, Long>();
        hexValues.put("A", 10L);
        hexValues.put("B", 11L);
        hexValues.put("C", 12L);
        hexValues.put("D", 13L);
        hexValues.put("E", 14L);
        hexValues.put("F", 15L);
    }

    public HexValueHelper() {

    }

    public Long getHexAsDecimal(String hexChar) {
        if (hexChar.length() != 1) {
            throw new IllegalArgumentException("The string for this function must contain 1 character exactly.");
        }

        try {
            Long num = Long.parseLong(hexChar);
            return num;
        } catch (NumberFormatException ex) {
            String hexVal = hexChar.toUpperCase();
            return hexValues.get(hexVal);
        }
    }
}
