package com.conv.test;

import com.geo.decconv.converters.decimal.DecimalToHexConverter;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.Value;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 05/10/2017.
 */
public class TestDecimalToHexConverter {

    @Test
    public void testDecimalToHex() {
        DecimalToHexConverter decimalToHexConverter = new DecimalToHexConverter();

        assertEquals("1D8A", decimalToHexConverter.convert(new DecimalValue(7562L)).getValue());

        assertEquals("0", decimalToHexConverter.convert(new DecimalValue(0L)).getValue());

        assertEquals("1", decimalToHexConverter.convert(new DecimalValue(1L)).getValue());

        assertEquals("50", decimalToHexConverter.convert(new DecimalValue(80L)).getValue());

        assertEquals("8B2F", decimalToHexConverter.convert(new DecimalValue(35631L)).getValue());

        String longHexString = "7fffffffffffffff";
        longHexString = longHexString.toUpperCase();

        assertEquals(longHexString, decimalToHexConverter.convert(new DecimalValue(9223372036854775807L)).getValue());
    }
}
