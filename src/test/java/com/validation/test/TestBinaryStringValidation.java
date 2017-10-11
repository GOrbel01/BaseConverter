package com.validation.test;

import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.validator.BinaryValidator;
import com.geo.decconv.event.validation.validator.Validator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 09/10/2017.
 */
public class TestBinaryStringValidation {
    @Test
    public void testBinaryStringValidation() {
        String test = "010011010101";
        Validator binaryValidator = new BinaryValidator();

        assertEquals(true, binaryValidator.validateData(test).isValid());

        test = "010115";
        assertEquals(false, binaryValidator.validateData(test).isValid());
        assertEquals(ErrorMessages.BIN_VAL_MSG, binaryValidator.validateData(test).getMessage());

        test = "-A1-01";
        assertEquals(false, binaryValidator.validateData(test).isValid());

        assertEquals(ErrorMessages.BIN_VAL_MSG, binaryValidator.validateData(test).getMessage());

        test = "10110";
        assertEquals("", binaryValidator.validateData(test).getMessage());
    }
}
