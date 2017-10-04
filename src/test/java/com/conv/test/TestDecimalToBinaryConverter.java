package com.conv.test;

import com.geo.decconv.converters.decimal.DecimalToBinaryConverter;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.Value;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tidus on 04/10/2017.
 */
public class TestDecimalToBinaryConverter {
    private DecimalToBinaryConverter converter;

    public TestDecimalToBinaryConverter() {
        converter = new DecimalToBinaryConverter();
    }

    @Test
    public void testDecToBinConverter() {
        Value toConv = new DecimalValue(156L);
        assertEquals("10011100", converter.convert(toConv).getValue());

        toConv = new DecimalValue(256L);
        assertEquals("100000000", converter.convert(toConv).getValue());
    }
}
