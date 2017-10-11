package com.validation.test;

import com.geo.decconv.event.validation.validator.DecimalValidator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 11/10/2017.
 */
public class TestDecimalStringValidation {
    @Test
    public void testDecimalStringValidation() {
        DecimalValidator decimalValidator = new DecimalValidator();
        String test = "43246453563";

        assertEquals(true, decimalValidator.validateData(test).isValid());

        test = "45234b423";
        assertEquals(false, decimalValidator.validateData(test).isValid());

        test = "43ABAB1231";
        assertEquals(false, decimalValidator.validateData(test).isValid());

        test = "413 42534"; //Whitespace will give an error
        assertEquals(false, decimalValidator.validateData(test).isValid());

        test = "24254-123";
        assertEquals(false, decimalValidator.validateData(test).isValid());
    }
}
