package com.func.test;

import com.geo.decconv.functions.ConverterFunctions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 04/10/2017.
 */
public class ConverterFunctionsTest {
    @Test
    public void testConverterFunctions() {
        assertEquals("100", ConverterFunctions.trimLeadingZeros(new StringBuilder("00100")).toString());

        assertEquals("101010", ConverterFunctions.trimLeadingZeros(new StringBuilder("101010")).toString());

        assertEquals("101010111", ConverterFunctions.trimLeadingZeros(new StringBuilder("00101010111")).toString());
    }
}
