package com.geo.decconv.converters.hex;

import java.util.HashMap;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexValueHelper {
    private static final HashMap<String, Long> hexLongValues;
    private static final HashMap<Long, String> hexStringValues;

    static {
        hexLongValues = new HashMap<String, Long>();
        hexStringValues = new HashMap<Long, String>();
        hexLongValues.put("A", 10L);
        hexLongValues.put("B", 11L);
        hexLongValues.put("C", 12L);
        hexLongValues.put("D", 13L);
        hexLongValues.put("E", 14L);
        hexLongValues.put("F", 15L);

        hexStringValues.put(10L, "A");
        hexStringValues.put(11L, "B");
        hexStringValues.put(12L, "C");
        hexStringValues.put(13L, "D");
        hexStringValues.put(14L, "E");
        hexStringValues.put(15L, "F");
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
            return hexLongValues.get(hexVal);
        }
    }

    public String getLongAsHex(Long value) {
        if (value < 0 || value > 15) {
            throw new IllegalArgumentException("Long value must be between 0 and 15.");
        }

        if (value > 9) {
            return hexStringValues.get(value);
        } else {
            return value.toString();
        }
    }
}
