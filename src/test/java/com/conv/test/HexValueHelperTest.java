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
    public void testHexValueHelperStringToNumber() {
        long test = hexValueHelper.getHexAsDecimal("4");
        assertEquals(4L, test);

        long test2 = hexValueHelper.getHexAsDecimal("5");
        assertEquals(5L, test2);

        long test3 = hexValueHelper.getHexAsDecimal("B");
        assertEquals(11L, test3);

        long test4 = hexValueHelper.getHexAsDecimal("F");
        assertEquals(15L, test4);

        long test5 = hexValueHelper.getHexAsDecimal("0");
        assertEquals(0L, test5);
    }

    @Test
    public void testIllegalArgumentExceptionStringToNumber() {
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

    @Test
    public void testHexValueHelperNumberToString() {
        String test = hexValueHelper.getLongAsHex(14L);
        assertEquals("E", test);

        String test2 = hexValueHelper.getLongAsHex(5L);
        assertEquals("5", test2);

        String test3 = hexValueHelper.getLongAsHex(0L);
        assertEquals("0", test3);

        String test4 = hexValueHelper.getLongAsHex(15L);
        assertEquals("F", test4);

        String test5 = hexValueHelper.getLongAsHex(10L);
        assertEquals("A", test5);
    }

    @Test
    public void testIllegalArgumentExceptionNumberToString() {
        try {
            hexValueHelper.getLongAsHex(16L);
            fail("Fail: No Exception Thrown.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Pass: Exception was Thrown!");
        }

        try {
            hexValueHelper.getLongAsHex(-1L);
            fail("Fail: No Exception Thrown.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Pass: Exception was Thrown!");
        }

        try {
            hexValueHelper.getLongAsHex(4L);
            System.out.println("Pass: Exception not Thrown.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Fail: Exception was Thrown Incorrectly.");
        }
    }
}
