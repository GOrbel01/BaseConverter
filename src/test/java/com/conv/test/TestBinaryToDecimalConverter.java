package com.conv.test;

import com.geo.decconv.converters.binary.BinaryToDecimalConverter;
import com.geo.decconv.values.BinaryValue;
import com.geo.decconv.values.Value;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 03/10/2017.
 */
public class TestBinaryToDecimalConverter {
    @Test
    public void testBinaryConverter() {
        BinaryToDecimalConverter conv = new BinaryToDecimalConverter();
        Value res = conv.convert(new BinaryValue("11110101001010101011"));

        assertEquals(1004203L, res.getValue());

        res = conv.convert(new BinaryValue("10010001"));

        assertEquals(145L, res.getValue());

        res = conv.convert(new BinaryValue("00111"));

        assertEquals(7L, res.getValue());
    }
}
