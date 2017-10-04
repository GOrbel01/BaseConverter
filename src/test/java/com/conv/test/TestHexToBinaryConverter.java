package com.conv.test;

import com.geo.decconv.converters.hex.HexToBinaryConverter;
import com.geo.decconv.values.HexValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 04/10/2017.
 */
public class TestHexToBinaryConverter {
    private HexToBinaryConverter hexToBinaryConverter;

    public TestHexToBinaryConverter() {
        hexToBinaryConverter = new HexToBinaryConverter();
    }

    @Test
    public void testHexToBinary() {
        assertEquals("101000100011", hexToBinaryConverter.convert(new HexValue("A23")).toString());
        assertEquals("0001", hexToBinaryConverter.convert(new HexValue("1")).toString());
    }
}
