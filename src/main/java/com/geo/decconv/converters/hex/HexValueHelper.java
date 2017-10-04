package com.geo.decconv.converters.hex;

import java.util.HashMap;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexValueHelper {
    private static final HashMap<String, Integer> hexValues;

    static {
        hexValues = new HashMap<String, Integer>();
        hexValues.put("A", 10);
        hexValues.put("B", 11);
        hexValues.put("C", 12);
        hexValues.put("D", 13);
        hexValues.put("E", 14);
        hexValues.put("F", 15);
    }

    public HexValueHelper() {

    }

    public Integer getHexAsDecimal(String hexChar) {
        if (hexChar.length() != 1) {
            throw new IllegalArgumentException("The string for this function must contain 1 character exactly.");
        }

        Integer num = 0;

        try {
            num = Integer.parseInt(hexChar);
            return num;
        } catch (NumberFormatException ex) {
            String hexVal = hexChar.toUpperCase();
            return hexValues.get(hexVal);
        }
    }
}
