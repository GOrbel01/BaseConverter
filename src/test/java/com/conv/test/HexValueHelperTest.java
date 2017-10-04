package com.conv.test;

import com.geo.decconv.converters.hex.HexValueHelper;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;

import static org.junit.Assert.*;

/**
 * Created by Tidus on 04/10/2017.
 */
public class HexValueHelperTest {
    private HexValueHelper hexValueHelper;

    public HexValueHelperTest() {
         hexValueHelper = new HexValueHelper();
    }

    @Test
    public void testHexValueHelper() {
        long test = hexValueHelper.getHexAsDecimal("4");
        assertEquals(4L, test);

        long test2 = hexValueHelper.getHexAsDecimal("5");
        assertEquals(5L, test2);

        long test3 = hexValueHelper.getHexAsDecimal("B");
        assertEquals(11L, test3);

        long test4 = hexValueHelper.getHexAsDecimal("F");
        assertEquals(15L, test4);
    }

    @Test
    public void testIllegalArgumentException() {
        try {
            hexValueHelper.getHexAsDecimal("AB");
            fail("No Exception Thrown!");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception was Thrown.");
        }

        try {
            hexValueHelper.getHexAsDecimal("12");
            fail("No Exception Thrown!");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception was Thrown.");
        }

        try {
            hexValueHelper.getHexAsDecimal("4");
        } catch (IllegalArgumentException ex) {
            fail("Exception was Thrown!");
        }
    }
}
