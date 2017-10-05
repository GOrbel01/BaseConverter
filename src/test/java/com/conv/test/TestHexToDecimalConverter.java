package com.conv.test;

import com.geo.decconv.converters.hex.HexToDecimalConverter;
import com.geo.decconv.values.DecimalValue;
import com.geo.decconv.values.HexValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 05/10/2017.
 */
public class TestHexToDecimalConverter {

    @Test
    public void testHexToDecimal() {
        HexToDecimalConverter hexToDecimalConverter = new HexToDecimalConverter();

        assertEquals(2595L, hexToDecimalConverter.convert(new HexValue("A23")).getValue());

        assertEquals(7562L, hexToDecimalConverter.convert(new HexValue("1D8A")).getValue());

        assertEquals(0L, hexToDecimalConverter.convert(new HexValue("0")).getValue());

        String longHexString = "7fffffffffffffff";
        longHexString = longHexString.toUpperCase();

        //Max Long Value
        assertEquals(9223372036854775807L, hexToDecimalConverter.convert(new HexValue(longHexString)).getValue());
    }

}
