package com.conv.test;

import com.geo.decconv.converters.binary.BinaryToHexConverter;
import com.geo.decconv.values.BinaryValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 05/10/2017.
 */
public class TestBinaryToHexConverter {
    @Test
    public void testBinaryToHex() {
        BinaryToHexConverter binaryToHexConverter = new BinaryToHexConverter();

        assertEquals("0", binaryToHexConverter.convert(new BinaryValue("0")).getValue());

        assertEquals("7FFFFFFFFFFFFFFF", binaryToHexConverter.convert(new BinaryValue("111111111111111111111111111111111111111111111111111111111111111")).getValue());

        assertEquals("11B8", binaryToHexConverter.convert(new BinaryValue("1000110111000")).getValue());

        //Ensure leading zeros are ignored
        assertEquals("4920601", binaryToHexConverter.convert(new BinaryValue("000100100100100000011000000001")).getValue());
    }
}
